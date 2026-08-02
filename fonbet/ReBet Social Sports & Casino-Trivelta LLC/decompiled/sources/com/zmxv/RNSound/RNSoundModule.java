package com.zmxv.RNSound;

import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.twilio.voice.EventKeys;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public class RNSoundModule extends ReactContextBaseJavaModule implements AudioManager.OnAudioFocusChangeListener {
    static final Object NULL = null;
    String category;
    ReactApplicationContext context;
    Double focusedPlayerKey;
    Boolean mixWithOthers;
    Map<Double, MediaPlayer> playerPool;
    Boolean wasPlayingBeforeFocusChange;

    public class a implements MediaPlayer.OnPreparedListener {

        /* renamed from: a, reason: collision with root package name */
        public boolean f42389a = false;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Callback f42390b;

        public a(Callback callback) {
            this.f42390b = callback;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public synchronized void onPrepared(MediaPlayer mediaPlayer) {
            if (this.f42389a) {
                return;
            }
            this.f42389a = true;
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("duration", mediaPlayer.getDuration() * 0.001d);
            try {
                this.f42390b.invoke(RNSoundModule.NULL, createMap);
            } catch (RuntimeException e10) {
                Log.e("RNSoundModule", "Exception", e10);
            }
        }
    }

    public class b implements MediaPlayer.OnErrorListener {

        /* renamed from: a, reason: collision with root package name */
        public boolean f42392a = false;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Callback f42393b;

        public b(Callback callback) {
            this.f42393b = callback;
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public synchronized boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            if (this.f42392a) {
                return true;
            }
            this.f42392a = true;
            try {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("what", i10);
                createMap.putInt("extra", i11);
                this.f42393b.invoke(createMap, RNSoundModule.NULL);
            } catch (RuntimeException e10) {
                Log.e("RNSoundModule", "Exception", e10);
            }
            return true;
        }
    }

    public class c implements MediaPlayer.OnCompletionListener {

        /* renamed from: a, reason: collision with root package name */
        public boolean f42395a = false;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Double f42396b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Callback f42397c;

        public c(Double d10, Callback callback) {
            this.f42396b = d10;
            this.f42397c = callback;
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public synchronized void onCompletion(MediaPlayer mediaPlayer) {
            if (!mediaPlayer.isLooping()) {
                RNSoundModule.this.setOnPlay(false, this.f42396b);
                if (this.f42395a) {
                    return;
                }
                this.f42395a = true;
                try {
                    this.f42397c.invoke(Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    public class d implements MediaPlayer.OnErrorListener {

        /* renamed from: a, reason: collision with root package name */
        public boolean f42399a = false;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Double f42400b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Callback f42401c;

        public d(Double d10, Callback callback) {
            this.f42400b = d10;
            this.f42401c = callback;
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public synchronized boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            RNSoundModule.this.setOnPlay(false, this.f42400b);
            if (this.f42399a) {
                return true;
            }
            this.f42399a = true;
            try {
                this.f42401c.invoke(Boolean.TRUE);
            } catch (Exception unused) {
            }
            return true;
        }
    }

    public RNSoundModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.playerPool = new HashMap();
        this.mixWithOthers = Boolean.TRUE;
        this.wasPlayingBeforeFocusChange = Boolean.FALSE;
        this.context = reactApplicationContext;
        this.category = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnPlay(boolean z10, Double d10) {
        ReactApplicationContext reactApplicationContext = this.context;
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("isPlaying", z10);
        createMap.putDouble("playerKey", d10.doubleValue());
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onPlayChange", createMap);
    }

    @ReactMethod
    public void addListener(String str) {
    }

    public MediaPlayer createMediaPlayer(String str) {
        int identifier = this.context.getResources().getIdentifier(str, "raw", this.context.getPackageName());
        MediaPlayer mediaPlayer = new MediaPlayer();
        if (identifier != 0) {
            try {
                AssetFileDescriptor openRawResourceFd = this.context.getResources().openRawResourceFd(identifier);
                mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
                openRawResourceFd.close();
                return mediaPlayer;
            } catch (IOException e10) {
                Log.e("RNSoundModule", "Exception", e10);
                return null;
            }
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            mediaPlayer.setAudioStreamType(3);
            Log.i("RNSoundModule", str);
            try {
                mediaPlayer.setDataSource(str);
                return mediaPlayer;
            } catch (IOException e11) {
                Log.e("RNSoundModule", "Exception", e11);
                return null;
            }
        }
        if (str.startsWith("asset:/")) {
            try {
                AssetFileDescriptor openFd = this.context.getAssets().openFd(str.replace("asset:/", ""));
                mediaPlayer.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
                openFd.close();
                return mediaPlayer;
            } catch (IOException e12) {
                Log.e("RNSoundModule", "Exception", e12);
                return null;
            }
        }
        if (str.startsWith("file:/")) {
            try {
                mediaPlayer.setDataSource(str);
                return mediaPlayer;
            } catch (IOException e13) {
                Log.e("RNSoundModule", "Exception", e13);
                return null;
            }
        }
        if (new File(str).exists()) {
            mediaPlayer.setAudioStreamType(3);
            Log.i("RNSoundModule", str);
            try {
                mediaPlayer.setDataSource(str);
                return mediaPlayer;
            } catch (IOException e14) {
                Log.e("RNSoundModule", "Exception", e14);
            }
        }
        return null;
    }

    @ReactMethod
    public void enable(Boolean bool) {
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("IsAndroid", Boolean.TRUE);
        return hashMap;
    }

    @ReactMethod
    public void getCurrentTime(Double d10, Callback callback) {
        MediaPlayer mediaPlayer = this.playerPool.get(d10);
        if (mediaPlayer == null) {
            callback.invoke(-1, Boolean.FALSE);
        } else {
            callback.invoke(Double.valueOf(mediaPlayer.getCurrentPosition() * 0.001d), Boolean.valueOf(mediaPlayer.isPlaying()));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSound";
    }

    @ReactMethod
    public void getSystemVolume(Callback callback) {
        try {
            AudioManager audioManager = (AudioManager) this.context.getSystemService("audio");
            callback.invoke(Float.valueOf(audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3)));
        } catch (Exception e10) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt(EventKeys.ERROR_CODE, -1);
            createMap.putString("message", e10.getMessage());
            callback.invoke(createMap);
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i10) {
        MediaPlayer mediaPlayer;
        if (this.mixWithOthers.booleanValue() || (mediaPlayer = this.playerPool.get(this.focusedPlayerKey)) == null) {
            return;
        }
        if (i10 > 0) {
            if (this.wasPlayingBeforeFocusChange.booleanValue()) {
                play(this.focusedPlayerKey, null);
                this.wasPlayingBeforeFocusChange = Boolean.FALSE;
                return;
            }
            return;
        }
        Boolean valueOf = Boolean.valueOf(mediaPlayer.isPlaying());
        this.wasPlayingBeforeFocusChange = valueOf;
        if (valueOf.booleanValue()) {
            pause(this.focusedPlayerKey, null);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        Iterator<Map.Entry<Double, MediaPlayer>> it = this.playerPool.entrySet().iterator();
        while (it.hasNext()) {
            MediaPlayer value = it.next().getValue();
            if (value != null) {
                value.reset();
                value.release();
            }
            it.remove();
        }
    }

    @ReactMethod
    public void pause(Double d10, Callback callback) {
        MediaPlayer mediaPlayer = this.playerPool.get(d10);
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
        }
        if (callback != null) {
            callback.invoke(new Object[0]);
        }
    }

    @ReactMethod
    public void play(Double d10, Callback callback) {
        MediaPlayer mediaPlayer = this.playerPool.get(d10);
        if (mediaPlayer == null) {
            setOnPlay(false, d10);
            if (callback != null) {
                callback.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        if (mediaPlayer.isPlaying()) {
            return;
        }
        if (!this.mixWithOthers.booleanValue()) {
            ((AudioManager) this.context.getSystemService("audio")).requestAudioFocus(this, 3, 1);
            this.focusedPlayerKey = d10;
        }
        mediaPlayer.setOnCompletionListener(new c(d10, callback));
        mediaPlayer.setOnErrorListener(new d(d10, callback));
        mediaPlayer.start();
        setOnPlay(true, d10);
    }

    @ReactMethod
    public void prepare(String str, Double d10, ReadableMap readableMap, Callback callback) {
        Integer num;
        MediaPlayer createMediaPlayer = createMediaPlayer(str);
        if (readableMap.hasKey("speed")) {
            createMediaPlayer.setPlaybackParams(createMediaPlayer.getPlaybackParams().setSpeed((float) readableMap.getDouble("speed")));
        }
        if (createMediaPlayer == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt(EventKeys.ERROR_CODE, -1);
            createMap.putString("message", "resource not found");
            callback.invoke(createMap, NULL);
            return;
        }
        this.playerPool.put(d10, createMediaPlayer);
        String str2 = this.category;
        if (str2 != null) {
            str2.getClass();
            switch (str2) {
                case "System":
                    num = 1;
                    break;
                case "Ring":
                    num = 2;
                    break;
                case "Alarm":
                    num = 4;
                    break;
                case "Voice":
                    num = 0;
                    break;
                case "Ambient":
                    num = 5;
                    break;
                case "Playback":
                    num = 3;
                    break;
                default:
                    Log.e("RNSoundModule", String.format("Unrecognised category %s", this.category));
                    num = null;
                    break;
            }
            if (num != null) {
                createMediaPlayer.setAudioStreamType(num.intValue());
            }
        }
        createMediaPlayer.setOnPreparedListener(new a(callback));
        createMediaPlayer.setOnErrorListener(new b(callback));
        try {
            if (readableMap.hasKey("loadSync") && readableMap.getBoolean("loadSync")) {
                createMediaPlayer.prepare();
            } else {
                createMediaPlayer.prepareAsync();
            }
        } catch (Exception e10) {
            Log.e("RNSoundModule", "Exception", e10);
        }
    }

    @ReactMethod
    public void release(Double d10) {
        MediaPlayer mediaPlayer = this.playerPool.get(d10);
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            mediaPlayer.release();
            this.playerPool.remove(d10);
            if (this.mixWithOthers.booleanValue() || d10 != this.focusedPlayerKey) {
                return;
            }
            ((AudioManager) this.context.getSystemService("audio")).abandonAudioFocus(this);
        }
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @ReactMethod
    public void reset(Double d10) {
        MediaPlayer mediaPlayer = this.playerPool.get(d10);
        if (mediaPlayer != null) {
            mediaPlayer.reset();
        }
    }

    @ReactMethod
    public void setCategory(String str, Boolean bool) {
        this.category = str;
        this.mixWithOthers = bool;
    }

    @ReactMethod
    public void setCurrentTime(Double d10, Float f10) {
        MediaPlayer mediaPlayer = this.playerPool.get(d10);
        if (mediaPlayer != null) {
            mediaPlayer.seekTo(Math.round(f10.floatValue() * 1000.0f));
        }
    }

    @ReactMethod
    public void setLooping(Double d10, Boolean bool) {
        MediaPlayer mediaPlayer = this.playerPool.get(d10);
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(bool.booleanValue());
        }
    }

    @ReactMethod
    public void setPitch(Double d10, Float f10) {
        MediaPlayer mediaPlayer = this.playerPool.get(d10);
        if (mediaPlayer != null) {
            mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setPitch(f10.floatValue()));
        }
    }

    @ReactMethod
    public void setSpeakerphoneOn(Double d10, Boolean bool) {
        if (this.playerPool.get(d10) != null) {
            AudioManager audioManager = (AudioManager) this.context.getSystemService("audio");
            if (bool.booleanValue()) {
                audioManager.setMode(3);
            } else {
                audioManager.setMode(0);
            }
            audioManager.setSpeakerphoneOn(bool.booleanValue());
        }
    }

    @ReactMethod
    public void setSpeed(Double d10, Float f10) {
        MediaPlayer mediaPlayer = this.playerPool.get(d10);
        if (mediaPlayer != null) {
            mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(f10.floatValue()));
        }
    }

    @ReactMethod
    public void setSystemVolume(Float f10) {
        ((AudioManager) this.context.getSystemService("audio")).setStreamVolume(3, Math.round(r0.getStreamMaxVolume(3) * f10.floatValue()), 0);
    }

    @ReactMethod
    public void setVolume(Double d10, Float f10, Float f11) {
        MediaPlayer mediaPlayer = this.playerPool.get(d10);
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(f10.floatValue(), f11.floatValue());
        }
    }

    @ReactMethod
    public void stop(Double d10, Callback callback) {
        MediaPlayer mediaPlayer = this.playerPool.get(d10);
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
            mediaPlayer.seekTo(0);
        }
        if (!this.mixWithOthers.booleanValue() && d10 == this.focusedPlayerKey) {
            ((AudioManager) this.context.getSystemService("audio")).abandonAudioFocus(this);
        }
        callback.invoke(new Object[0]);
    }
}
