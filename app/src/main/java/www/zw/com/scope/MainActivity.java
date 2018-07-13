package www.zw.com.scope;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SurfaceView surfaceView;
    Spinner V_div,T_div;
    TextView Vp_Max,Vp_Min,freq,period,trigValue;
    Button runScope,stopScope,trigUp,trigDown,chooseConnectDevice,choosePairDevice;

    //初始化创建页面
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initAllCompent();
    }
    public void initAllCompent(){
        //示波器显示屏
        surfaceView= (SurfaceView) findViewById(R.id.surfaceView);
        //选择纵轴电压和横轴时间每一格代表的值
        V_div= (Spinner) findViewById(R.id.V_div);
        T_div= (Spinner) findViewById(R.id.T_div);
        //显示电压最大值，电压最小值，频率，周期，偏置值
        Vp_Max= (TextView) findViewById(R.id.Vp_Max);
        Vp_Min= (TextView) findViewById(R.id.Vp_Min);
        freq= (TextView) findViewById(R.id.freq);
        period= (TextView) findViewById(R.id.period);
        trigValue=(TextView)findViewById(R.id.trigValue);
        //运行示波器，停止示波器，偏置+，偏置-，选择连接设备，选择配对设备
        // （连接设备是已经配对成功的设备）
        runScope= (Button) findViewById(R.id.runScope);
        stopScope= (Button) findViewById(R.id.stopScope);
        trigUp= (Button) findViewById(R.id.trigUp);
        trigDown= (Button) findViewById(R.id.trigDown);
        chooseConnectDevice= (Button) findViewById(R.id.chooseConnectDevice);
        choosePairDevice= (Button) findViewById(R.id.choosePairDevice);

    }
    @Override
    protected synchronized void onResume(){
        super.onResume();
        //自动切换成横屏状态
        if(getRequestedOrientation()!= ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE){
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }
    }
    //开启
    @Override
    protected void onStart(){
        super.onStart();
    }
    //停止
    @Override
    protected void onStop(){
        super.onStop();
    }
    //暂停
    @Override
    public synchronized void onPause() {
        super.onPause();
    }
    //销毁
    @Override
    protected void onDestroy(){
        super.onDestroy();
    }
    //运行示波器
    public void runScope(View view){

    }
    //停止示波器
    public void stopScope(View view){

    }
}
