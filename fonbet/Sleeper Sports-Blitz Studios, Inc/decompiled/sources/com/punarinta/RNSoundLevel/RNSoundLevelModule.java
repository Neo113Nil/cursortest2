package com.punarinta.RNSoundLevel;

import android.content.Context;
import android.media.MediaRecorder;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.Timer;
import java.util.TimerTask;
import org.chromium.net.NetError;

/* loaded from: classes8.dex */
class RNSoundLevelModule extends ReactContextBaseJavaModule {
    private static final String TAG = "RNSoundLevel";
    private Context context;
    private int frameId;
    private boolean isRecording;
    private MediaRecorder recorder;
    private Timer timer;

    public RNSoundLevelModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.isRecording = false;
        this.frameId = 0;
        this.context = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSoundLevelModule";
    }

    @ReactMethod
    public void start(Promise promise) {
        if (this.isRecording) {
            logAndRejectPromise(promise, "INVALID_STATE", "Please call stop before starting");
            return;
        }
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.recorder = mediaRecorder;
        try {
            mediaRecorder.setAudioSource(1);
            this.recorder.setOutputFormat(2);
            this.recorder.setAudioEncoder(3);
            this.recorder.setAudioSamplingRate(22050);
            this.recorder.setAudioChannels(1);
            this.recorder.setAudioEncodingBitRate(32000);
            this.recorder.setOutputFile(getReactApplicationContext().getCacheDir().getAbsolutePath() + "/soundlevel");
            try {
                this.recorder.prepare();
            } catch (Exception e) {
                logAndRejectPromise(promise, "COULDNT_PREPARE_RECORDING", e.getMessage());
            }
            this.recorder.start();
            this.frameId = 0;
            this.isRecording = true;
            startTimer();
            promise.resolve(true);
        } catch (Exception e2) {
            logAndRejectPromise(promise, "COULDNT_CONFIGURE_MEDIA_RECORDER", "Make sure you've added RECORD_AUDIO permission to your AndroidManifest.xml file " + e2.getMessage());
        }
    }

    @ReactMethod
    public void stop(Promise promise) {
        if (!this.isRecording) {
            logAndRejectPromise(promise, "INVALID_STATE", "Please call start before stopping recording");
            return;
        }
        stopTimer();
        this.isRecording = false;
        try {
            try {
                this.recorder.stop();
                this.recorder.release();
                this.recorder = null;
                promise.resolve(true);
            } catch (RuntimeException unused) {
                logAndRejectPromise(promise, "RUNTIME_EXCEPTION", "No valid audio data received. You may be using a device that can't record audio.");
                this.recorder = null;
            }
        } catch (Throwable th) {
            this.recorder = null;
            throw th;
        }
    }

    private void startTimer() {
        Timer timer = new Timer();
        this.timer = timer;
        timer.scheduleAtFixedRate(new TimerTask() { // from class: com.punarinta.RNSoundLevel.RNSoundLevelModule.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                try {
                    WritableMap createMap = Arguments.createMap();
                    RNSoundLevelModule rNSoundLevelModule = RNSoundLevelModule.this;
                    int i = rNSoundLevelModule.frameId;
                    rNSoundLevelModule.frameId = i + 1;
                    createMap.putDouble("id", i);
                    int maxAmplitude = RNSoundLevelModule.this.recorder.getMaxAmplitude();
                    if (maxAmplitude == 0) {
                        createMap.putInt("value", NetError.ERR_SOCKET_SET_RECEIVE_BUFFER_SIZE_ERROR);
                        createMap.putInt("rawValue", 0);
                    } else {
                        createMap.putInt("rawValue", maxAmplitude);
                        createMap.putInt("value", (int) (Math.log(maxAmplitude / 32767.0d) * 20.0d));
                    }
                    RNSoundLevelModule.this.sendEvent(TypedValues.AttributesType.S_FRAME, createMap);
                } catch (Exception e) {
                    Log.e(RNSoundLevelModule.TAG, e.toString());
                }
            }
        }, 0L, 250L);
    }

    private void stopTimer() {
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
            this.timer.purge();
            this.timer = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(String str, Object obj) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, obj);
    }

    private void logAndRejectPromise(Promise promise, String str, String str2) {
        Log.e(TAG, str2);
        promise.reject(str, str2);
    }
}
