package com.reactnativecommunity.rctaudiotoolkit;

import android.content.ContextWrapper;
import android.media.MediaRecorder;
import android.net.Uri;
import android.util.Log;
import android.webkit.URLUtil;
import androidx.core.app.NotificationCompat;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.chromium.net.NetError;

/* loaded from: classes8.dex */
public class AudioRecorderModule extends ReactContextBaseJavaModule implements MediaRecorder.OnInfoListener, MediaRecorder.OnErrorListener {
    private static final String LOG_TAG = "AudioRecorderModule";
    private ReactApplicationContext context;
    Map<Integer, Boolean> recorderAutoDestroy;
    Map<Integer, MediaRecorder> recorderPool;
    Map<Integer, Timer> timerPool;

    public AudioRecorderModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.recorderPool = new HashMap();
        this.recorderAutoDestroy = new HashMap();
        this.timerPool = new HashMap();
        this.context = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RCTAudioRecorder";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emitEvent(Integer num, String str, WritableMap writableMap) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("event", str);
        writableNativeMap.putMap("data", writableMap);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.context.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("RCTAudioRecorderEvent:" + num, writableNativeMap);
    }

    private WritableMap errObj(String str, String str2) {
        String str3;
        WritableMap createMap = Arguments.createMap();
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            int length = stackTrace.length;
            str3 = "";
            for (int i = 0; i < length; i++) {
                StackTraceElement stackTraceElement = stackTrace[i];
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(stackTraceElement != null ? stackTraceElement.toString() : AbstractJsonLexerKt.NULL);
                sb.append("\n");
                str3 = sb.toString();
            }
        } catch (Exception unused) {
            str3 = "Exception occurred while parsing stack trace";
        }
        createMap.putString(NotificationCompat.CATEGORY_ERROR, str);
        createMap.putString("message", str2);
        createMap.putString("stackTrace", str3);
        Log.e(LOG_TAG, str2);
        Log.d(LOG_TAG, str3);
        return createMap;
    }

    private int formatFromName(String str) {
        str.hashCode();
        switch (str) {
            case "aac":
                return 6;
            case "amr":
                return 4;
            case "mp4":
                return 2;
            case "ogg":
            case "webm":
                return 9;
            default:
                Log.e(LOG_TAG, "Format with name " + str + " not found.");
                return 0;
        }
    }

    private int formatFromPath(String str) {
        return formatFromName(str.substring(str.lastIndexOf(46) + 1));
    }

    private int encoderFromName(String str) {
        str.hashCode();
        switch (str) {
            case "aac":
                return 3;
            case "amr":
                return 2;
            case "mp4":
                return 4;
            case "ogg":
            case "webm":
                return 6;
            default:
                Log.e(LOG_TAG, "Encoder with name " + str + " not found.");
                return 0;
        }
    }

    private int encoderFromPath(String str) {
        return encoderFromName(str.substring(str.lastIndexOf(46) + 1));
    }

    private Uri uriFromPath(String str) {
        if (URLUtil.isValidUrl(str)) {
            return Uri.parse(str);
        }
        return Uri.fromFile(new File(new ContextWrapper(this.context).getFilesDir() + "/" + str));
    }

    @ReactMethod
    public void destroy(Integer num, Callback callback) {
        MediaRecorder mediaRecorder = this.recorderPool.get(num);
        if (mediaRecorder != null) {
            mediaRecorder.release();
            this.recorderPool.remove(num);
            this.recorderAutoDestroy.remove(num);
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("message", "Destroyed recorder");
            emitEvent(num, "info", writableNativeMap);
        }
        if (callback != null) {
            callback.invoke(new Object[0]);
        }
        stopTimer(num);
    }

    private void destroy(Integer num) {
        destroy(num, null);
    }

    @ReactMethod
    public void prepare(Integer num, String str, ReadableMap readableMap, Callback callback) {
        if (str == null || str.isEmpty()) {
            callback.invoke(errObj("invalidpath", "Provided path was empty"));
            return;
        }
        Log.d(LOG_TAG, "Releasing old recorder...");
        destroy(num);
        Uri uriFromPath = uriFromPath(str);
        Log.d(LOG_TAG, uriFromPath.getPath());
        MediaRecorder mediaRecorder = new MediaRecorder();
        mediaRecorder.setAudioSource(1);
        int formatFromPath = formatFromPath(str);
        int encoderFromPath = encoderFromPath(str);
        if (readableMap.hasKey("format")) {
            formatFromPath = formatFromName(readableMap.getString("format"));
        }
        if (readableMap.hasKey("encoder")) {
            encoderFromPath = encoderFromName(readableMap.getString("encoder"));
        }
        int i = readableMap.hasKey("bitrate") ? readableMap.getInt("bitrate") : AudioConstants.AUDIO_BIT_RATE;
        int i2 = readableMap.hasKey("channels") ? readableMap.getInt("channels") : 2;
        int i3 = readableMap.hasKey("sampleRate") ? readableMap.getInt("sampleRate") : AudioConstants.AUDIO_SAMPLE_RATE;
        mediaRecorder.setOutputFormat(formatFromPath);
        mediaRecorder.setAudioEncoder(encoderFromPath);
        mediaRecorder.setAudioEncodingBitRate(i);
        mediaRecorder.setAudioChannels(i2);
        mediaRecorder.setAudioSamplingRate(i3);
        Log.d(LOG_TAG, "Recorder using options: (format: " + formatFromPath + ") (encoder: " + encoderFromPath + ") (bitrate: " + i + ") (channels: " + i2 + ") (sampleRate: " + i3 + ")");
        mediaRecorder.setOutputFile(uriFromPath.getPath());
        mediaRecorder.setOnErrorListener(this);
        mediaRecorder.setOnInfoListener(this);
        this.recorderPool.put(num, mediaRecorder);
        this.recorderAutoDestroy.put(num, Boolean.valueOf(readableMap.hasKey("autoDestroy") ? readableMap.getBoolean("autoDestroy") : true));
        try {
            mediaRecorder.prepare();
            callback.invoke(null, uriFromPath.getPath());
        } catch (IOException e) {
            callback.invoke(errObj("preparefail", e.toString()));
        }
    }

    @ReactMethod
    public void record(Integer num, Callback callback) {
        MediaRecorder mediaRecorder = this.recorderPool.get(num);
        if (mediaRecorder == null) {
            callback.invoke(errObj("notfound", "recorderId " + num + "not found."));
            return;
        }
        try {
            mediaRecorder.start();
            startTimer(num);
            callback.invoke(new Object[0]);
        } catch (Exception e) {
            callback.invoke(errObj("startfail", e.toString()));
        }
    }

    @ReactMethod
    public void stop(Integer num, Callback callback) {
        MediaRecorder mediaRecorder = this.recorderPool.get(num);
        if (mediaRecorder == null) {
            callback.invoke(errObj("notfound", "recorderId " + num + "not found."));
            return;
        }
        try {
            mediaRecorder.stop();
            stopTimer(num);
            if (this.recorderAutoDestroy.get(num).booleanValue()) {
                Log.d(LOG_TAG, "Autodestroying recorder...");
                destroy(num);
            }
            callback.invoke(new Object[0]);
        } catch (Exception e) {
            callback.invoke(errObj("stopfail", e.toString()));
        }
    }

    @ReactMethod
    public void pause(Integer num, Callback callback) {
        pause24(num, callback);
    }

    private void pause24(Integer num, Callback callback) {
        MediaRecorder mediaRecorder = this.recorderPool.get(num);
        if (mediaRecorder == null) {
            callback.invoke(errObj("notfound", "recorderId " + num + "not found."));
            return;
        }
        try {
            mediaRecorder.pause();
            if (this.recorderAutoDestroy.get(num).booleanValue()) {
                Log.d(LOG_TAG, "Autodestroying recorder...");
                destroy(num);
            }
            callback.invoke(new Object[0]);
            stopTimer(num);
        } catch (Exception e) {
            callback.invoke(errObj("stopfail", e.toString()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Integer getRecorderId(MediaRecorder mediaRecorder) {
        for (Map.Entry<Integer, MediaRecorder> entry : this.recorderPool.entrySet()) {
            if (Objects.equals(mediaRecorder, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    @Override // android.media.MediaRecorder.OnErrorListener
    public void onError(MediaRecorder mediaRecorder, int i, int i2) {
        Integer recorderId = getRecorderId(mediaRecorder);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("what", i);
        writableNativeMap.putInt("extra", i2);
        WritableMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putMap(NotificationCompat.CATEGORY_ERROR, writableNativeMap);
        writableNativeMap2.putString("message", "Android MediaRecorder error");
        emitEvent(recorderId, "error", writableNativeMap2);
        destroy(recorderId);
        stopTimer(recorderId);
    }

    @Override // android.media.MediaRecorder.OnInfoListener
    public void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        Integer recorderId = getRecorderId(mediaRecorder);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("what", i);
        writableNativeMap.putInt("extra", i2);
        WritableMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putMap("info", writableNativeMap);
        writableNativeMap2.putString("message", "Android MediaRecorder info");
        emitEvent(recorderId, "info", writableNativeMap2);
    }

    private void startTimer(Integer num) {
        Timer timer = this.timerPool.get(num);
        if (timer == null) {
            timer = new Timer();
            this.timerPool.put(num, timer);
        }
        final MediaRecorder mediaRecorder = this.recorderPool.get(num);
        timer.scheduleAtFixedRate(new TimerTask() { // from class: com.reactnativecommunity.rctaudiotoolkit.AudioRecorderModule.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                try {
                    WritableMap createMap = Arguments.createMap();
                    int maxAmplitude = mediaRecorder.getMaxAmplitude();
                    if (maxAmplitude == 0) {
                        createMap.putInt("value", NetError.ERR_SOCKET_SET_RECEIVE_BUFFER_SIZE_ERROR);
                        createMap.putInt("rawValue", 0);
                    } else {
                        createMap.putInt("rawValue", maxAmplitude);
                        createMap.putInt("value", (int) (Math.log(maxAmplitude / 32767.0d) * 20.0d));
                    }
                    AudioRecorderModule.this.emitEvent(AudioRecorderModule.this.getRecorderId(mediaRecorder), "amplitude", createMap);
                } catch (Exception e) {
                    Log.e(AudioRecorderModule.LOG_TAG, e.toString());
                }
            }
        }, 0L, 250L);
    }

    private void stopTimer(Integer num) {
        Timer timer = this.timerPool.get(num);
        if (timer != null) {
            timer.cancel();
            timer.purge();
        }
    }
}
