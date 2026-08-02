package com.reactnativecommunity.rctaudiotoolkit;

import android.content.ContextWrapper;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.media3.common.MimeTypes;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.ViewProps;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes8.dex */
public class AudioPlayerModule extends ReactContextBaseJavaModule implements MediaPlayer.OnInfoListener, MediaPlayer.OnErrorListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnBufferingUpdateListener, LifecycleEventListener, AudioManager.OnAudioFocusChangeListener {
    private static final String LOG_TAG = "AudioPlayerModule";
    private ReactApplicationContext context;
    private Integer lastPlayerId;
    boolean looping;
    private AudioManager mAudioManager;
    boolean mixWithOthers;
    Map<Integer, Boolean> playerAutoDestroy;
    Map<Integer, Boolean> playerContinueInBackground;
    Map<Integer, MediaPlayer> playerPool;
    Map<Integer, Callback> playerSeekCallback;

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    public AudioPlayerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.playerPool = new HashMap();
        this.playerAutoDestroy = new HashMap();
        this.playerContinueInBackground = new HashMap();
        this.playerSeekCallback = new HashMap();
        this.looping = false;
        this.mixWithOthers = false;
        this.context = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
        this.mAudioManager = (AudioManager) this.context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        MediaPlayer mediaPlayer;
        for (Map.Entry entry : new HashMap(this.playerPool).entrySet()) {
            Integer num = (Integer) entry.getKey();
            if (!this.playerContinueInBackground.get(num).booleanValue() && (mediaPlayer = (MediaPlayer) entry.getValue()) != null) {
                try {
                    mediaPlayer.pause();
                    WritableMap info = getInfo(mediaPlayer);
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putString("message", "Playback paused due to onHostPause");
                    writableNativeMap.putMap("info", info);
                    emitEvent(num, "pause", writableNativeMap);
                } catch (Exception e) {
                    Log.e(LOG_TAG, e.toString());
                }
            }
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RCTAudioPlayer";
    }

    private void emitEvent(Integer num, String str, WritableMap writableMap) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("event", str);
        writableNativeMap.putMap("data", writableMap);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.context.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("RCTAudioPlayerEvent:" + num, writableNativeMap);
    }

    private WritableMap errObj(String str, String str2, boolean z) {
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
        if (z) {
            createMap.putString("stackTrace", str3);
            Log.e(LOG_TAG, str2);
            Log.d(LOG_TAG, str3);
        }
        return createMap;
    }

    private WritableMap errObj(String str, String str2) {
        return errObj(str, str2, true);
    }

    private Uri uriFromPath(String str) {
        File file = new File(new ContextWrapper(this.context).getFilesDir() + "/" + str);
        if (file.exists()) {
            return Uri.fromFile(file);
        }
        File file2 = new File(Environment.getExternalStorageDirectory() + "/" + str);
        if (file2.exists()) {
            return Uri.fromFile(file2);
        }
        File file3 = new File(str);
        if (file3.exists()) {
            return Uri.fromFile(file3);
        }
        int identifier = this.context.getResources().getIdentifier(str.lastIndexOf(46) != -1 ? str.substring(0, str.lastIndexOf(46)) : str, "raw", this.context.getPackageName());
        if (identifier != 0) {
            return Uri.parse("android.resource://" + this.context.getPackageName() + "/" + identifier);
        }
        return Uri.parse(str);
    }

    @ReactMethod
    public void destroy(Integer num, Callback callback) {
        MediaPlayer mediaPlayer = this.playerPool.get(num);
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.playerPool.remove(num);
            this.playerAutoDestroy.remove(num);
            this.playerContinueInBackground.remove(num);
            this.playerSeekCallback.remove(num);
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("message", "Destroyed player");
            emitEvent(num, "info", writableNativeMap);
        }
        if (callback != null) {
            callback.invoke(new Object[0]);
        }
    }

    private void destroy(Integer num) {
        destroy(num, null);
    }

    @ReactMethod
    public void seek(Integer num, Integer num2, Callback callback) {
        MediaPlayer mediaPlayer = this.playerPool.get(num);
        if (mediaPlayer == null) {
            callback.invoke(errObj("notfound", "playerId " + num + " not found."));
            return;
        }
        if (num2.intValue() >= 0) {
            Callback callback2 = this.playerSeekCallback.get(num);
            if (callback2 != null) {
                callback2.invoke(errObj("seekfail", "new seek operation before old one completed", false));
                this.playerSeekCallback.remove(num);
            }
            this.playerSeekCallback.put(num, callback);
            mediaPlayer.seekTo(num2.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WritableMap getInfo(MediaPlayer mediaPlayer) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("duration", mediaPlayer.getDuration());
        createMap.putDouble(ViewProps.POSITION, mediaPlayer.getCurrentPosition());
        createMap.putDouble("audioSessionId", mediaPlayer.getAudioSessionId());
        return createMap;
    }

    @ReactMethod
    public void prepare(Integer num, String str, ReadableMap readableMap, final Callback callback) {
        if (str == null || str.isEmpty()) {
            callback.invoke(errObj("nopath", "Provided path was empty"));
            return;
        }
        destroy(num);
        this.lastPlayerId = num;
        Uri uriFromPath = uriFromPath(str);
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            Log.d(LOG_TAG, uriFromPath.getPath());
            mediaPlayer.setDataSource(this.context, uriFromPath);
            mediaPlayer.setOnErrorListener(this);
            mediaPlayer.setOnInfoListener(this);
            mediaPlayer.setOnCompletionListener(this);
            mediaPlayer.setOnSeekCompleteListener(this);
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.reactnativecommunity.rctaudiotoolkit.AudioPlayerModule.1
                @Override // android.media.MediaPlayer.OnPreparedListener
                public void onPrepared(MediaPlayer mediaPlayer2) {
                    callback.invoke(null, AudioPlayerModule.this.getInfo(mediaPlayer2));
                }
            });
            this.playerPool.put(num, mediaPlayer);
            boolean z = readableMap.hasKey("autoDestroy") ? readableMap.getBoolean("autoDestroy") : true;
            boolean z2 = readableMap.hasKey("continuesToPlayInBackground") ? readableMap.getBoolean("continuesToPlayInBackground") : false;
            this.mixWithOthers = false;
            if (readableMap.hasKey("mixWithOthers")) {
                this.mixWithOthers = readableMap.getBoolean("mixWithOthers");
            }
            this.playerAutoDestroy.put(num, Boolean.valueOf(z));
            this.playerContinueInBackground.put(num, Boolean.valueOf(z2));
            try {
                mediaPlayer.prepareAsync();
            } catch (Exception e) {
                callback.invoke(errObj("prepare", e.toString()));
            }
        } catch (IOException e2) {
            callback.invoke(errObj("invalidpath", e2.toString()));
        }
    }

    @ReactMethod
    public void set(Integer num, ReadableMap readableMap, Callback callback) {
        boolean z;
        MediaPlayer mediaPlayer = this.playerPool.get(num);
        if (mediaPlayer == null) {
            callback.invoke(errObj("notfound", "playerId " + num + " not found."));
            return;
        }
        if (readableMap.hasKey("wakeLock") && readableMap.getBoolean("wakeLock")) {
            mediaPlayer.setWakeMode(this.context, 1);
        }
        if (readableMap.hasKey("autoDestroy")) {
            this.playerAutoDestroy.put(num, Boolean.valueOf(readableMap.getBoolean("autoDestroy")));
        }
        if (readableMap.hasKey("continuesToPlayInBackground")) {
            this.playerContinueInBackground.put(num, Boolean.valueOf(readableMap.getBoolean("continuesToPlayInBackground")));
        }
        if (readableMap.hasKey("volume") && !readableMap.isNull("volume")) {
            float f = (float) readableMap.getDouble("volume");
            mediaPlayer.setVolume(f, f);
        }
        if (readableMap.hasKey("looping") && !readableMap.isNull("looping")) {
            this.looping = readableMap.getBoolean("looping");
        }
        if (readableMap.hasKey("speed") || readableMap.hasKey(AnalyticsConstantsKt.KEY_PITCH)) {
            PlaybackParams playbackParams = new PlaybackParams();
            if (!readableMap.hasKey("speed") || readableMap.isNull("speed")) {
                z = false;
            } else {
                boolean isPlaying = mediaPlayer.isPlaying();
                float f2 = (float) readableMap.getDouble("speed");
                z = (isPlaying || f2 == 0.0f) ? false : true;
                playbackParams.setSpeed(f2);
            }
            if (readableMap.hasKey(AnalyticsConstantsKt.KEY_PITCH) && !readableMap.isNull(AnalyticsConstantsKt.KEY_PITCH)) {
                playbackParams.setPitch((float) readableMap.getDouble(AnalyticsConstantsKt.KEY_PITCH));
            }
            mediaPlayer.setPlaybackParams(playbackParams);
            if (z) {
                mediaPlayer.pause();
            }
        }
        callback.invoke(new Object[0]);
    }

    @ReactMethod
    public void play(Integer num, Callback callback) {
        MediaPlayer mediaPlayer = this.playerPool.get(num);
        if (mediaPlayer == null) {
            callback.invoke(errObj("notfound", "playerId " + num + " not found."));
            return;
        }
        try {
            if (!this.mixWithOthers) {
                this.mAudioManager.requestAudioFocus(this, 3, 1);
            }
            mediaPlayer.start();
            callback.invoke(null, getInfo(mediaPlayer));
        } catch (Exception e) {
            callback.invoke(errObj("playback", e.toString()));
        }
    }

    @ReactMethod
    public void pause(Integer num, Callback callback) {
        MediaPlayer mediaPlayer = this.playerPool.get(num);
        if (mediaPlayer == null) {
            callback.invoke(errObj("notfound", "playerId " + num + " not found."));
            return;
        }
        try {
            mediaPlayer.pause();
            WritableMap info = getInfo(mediaPlayer);
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("message", "Playback paused");
            writableNativeMap.putMap("info", info);
            emitEvent(num, "pause", writableNativeMap);
            callback.invoke(null, getInfo(mediaPlayer));
        } catch (Exception e) {
            callback.invoke(errObj("pause", e.toString()));
        }
    }

    @ReactMethod
    public void stop(Integer num, Callback callback) {
        MediaPlayer mediaPlayer = this.playerPool.get(num);
        if (mediaPlayer == null) {
            callback.invoke(errObj("notfound", "playerId " + num + " not found."));
            return;
        }
        try {
            if (this.playerAutoDestroy.get(num).booleanValue()) {
                mediaPlayer.pause();
                Log.d(LOG_TAG, "stop(): Autodestroying player...");
                destroy(num);
                callback.invoke(new Object[0]);
                return;
            }
            Callback callback2 = this.playerSeekCallback.get(num);
            if (callback2 != null) {
                callback2.invoke(errObj("seekfail", "Playback stopped before seek operation could finish"));
                this.playerSeekCallback.remove(num);
            }
            this.playerSeekCallback.put(num, callback);
            mediaPlayer.seekTo(0);
            mediaPlayer.pause();
        } catch (Exception e) {
            callback.invoke(errObj("stop", e.toString()));
        }
    }

    @ReactMethod
    public void getCurrentTime(Integer num, Callback callback) {
        MediaPlayer mediaPlayer = this.playerPool.get(num);
        if (mediaPlayer == null) {
            callback.invoke(errObj("notfound", "playerId " + num + " not found."));
            return;
        }
        try {
            callback.invoke(null, getInfo(mediaPlayer));
        } catch (Exception e) {
            callback.invoke(errObj("getCurrentTime", e.toString()));
        }
    }

    private Integer getPlayerId(MediaPlayer mediaPlayer) {
        for (Map.Entry<Integer, MediaPlayer> entry : this.playerPool.entrySet()) {
            if (equals(mediaPlayer, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        Integer playerId = getPlayerId(mediaPlayer);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("message", "Status update for media stream buffering");
        writableNativeMap.putInt("percent", i);
        emitEvent(playerId, "progress", writableNativeMap);
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(MediaPlayer mediaPlayer) {
        Integer playerId = getPlayerId(mediaPlayer);
        Callback callback = this.playerSeekCallback.get(playerId);
        if (callback != null) {
            callback.invoke(null, getInfo(mediaPlayer));
            this.playerSeekCallback.remove(playerId);
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("message", "Seek operation completed");
        emitEvent(playerId, "seeked", writableNativeMap);
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        Integer playerId = getPlayerId(mediaPlayer);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        mediaPlayer.seekTo(0);
        if (this.looping) {
            mediaPlayer.start();
            writableNativeMap.putString("message", "Media playback looped");
            emitEvent(playerId, "looped", writableNativeMap);
        } else {
            writableNativeMap.putString("message", "Playback completed");
            emitEvent(playerId, "ended", writableNativeMap);
        }
        if (this.looping || !this.playerAutoDestroy.get(playerId).booleanValue()) {
            return;
        }
        Log.d(LOG_TAG, "onCompletion(): Autodestroying player...");
        destroy(playerId);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Integer playerId = getPlayerId(mediaPlayer);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("what", i);
        writableNativeMap.putInt("extra", i2);
        WritableMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putMap(NotificationCompat.CATEGORY_ERROR, writableNativeMap);
        writableNativeMap2.putString("message", "Android MediaPlayer error");
        emitEvent(playerId, "error", writableNativeMap2);
        destroy(playerId);
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        Integer playerId = getPlayerId(mediaPlayer);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("what", i);
        writableNativeMap.putInt("extra", i2);
        WritableMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putMap("info", writableNativeMap);
        writableNativeMap2.putString("message", "Android MediaPlayer info");
        emitEvent(playerId, "info", writableNativeMap2);
        return false;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
        if (i == -2 || i == -1) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("message", "Lost audio focus, playback paused");
            emitEvent(this.lastPlayerId, "forcePause", writableNativeMap);
        }
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
