package com.twilio.voice;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Set;
import tvo.webrtc.audio.AudioDeviceModule;
import tvo.webrtc.audio.JavaAudioDeviceModule;

/* loaded from: classes4.dex */
class MediaFactory {
    private static final String RELEASE_MESSAGE_TEMPLATE = "MediaFactory released %s unavailable";
    private static volatile MediaFactory instance;
    private static final Logger logger = Logger.getLogger(MediaFactory.class);
    private static volatile Set<Object> mediaFactoryOwners = new HashSet();
    private AudioDeviceModule audioDeviceModule;
    private AudioDeviceProxy audioDeviceProxy;
    private long nativeMediaFactoryHandle;

    private MediaFactory(Context context) {
        long nativeCreate = nativeCreate(context);
        this.nativeMediaFactoryHandle = nativeCreate;
        if (0 == nativeCreate) {
            logger.e("Failed to instance MediaFactory");
        }
    }

    private long defaultAudioDeviceFactory(Context context) {
        DefaultAudioDevice defaultAudioDevice = (DefaultAudioDevice) Voice.getAudioDevice();
        JavaAudioDeviceModule createAudioDeviceModule = JavaAudioDeviceModule.builder(context).setUseHardwareNoiseSuppressor(defaultAudioDevice.useHardwareNoiseSuppressor()).setUseHardwareAcousticEchoCanceler(defaultAudioDevice.useHardwareAcousticEchoCanceler()).createAudioDeviceModule();
        this.audioDeviceModule = createAudioDeviceModule;
        return createAudioDeviceModule.getNativeAudioDeviceModulePointer();
    }

    public static MediaFactory instance(@NonNull Object obj, @NonNull Context context) {
        Preconditions.checkNotNull(obj, "owner must not be null");
        Preconditions.checkNotNull(context, "context must not be null");
        Preconditions.checkApplicationContext(context);
        synchronized (MediaFactory.class) {
            try {
                if (instance == null) {
                    Voice.loadLibrary(context);
                    AudioDevice audioDevice = Voice.getAudioDevice();
                    if (audioDevice instanceof DefaultAudioDevice) {
                        instance = new MediaFactory(context);
                    } else {
                        instance = new MediaFactory(context, audioDevice);
                    }
                }
                mediaFactoryOwners.add(obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return instance;
    }

    public static boolean isReleased() {
        boolean z10;
        synchronized (MediaFactory.class) {
            z10 = instance == null;
        }
        return z10;
    }

    public static void manualRelease() {
        synchronized (MediaFactory.class) {
            try {
                if (instance != null) {
                    mediaFactoryOwners.clear();
                    instance.release(new Object());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private native long nativeCreate(Context context);

    private native LocalAudioTrack nativeCreateAudioTrack(long j10, Context context, boolean z10, AudioOptions audioOptions, String str);

    private native long nativeCreateWithCustomDevice(Context context, AudioDevice audioDevice, AudioFormat audioFormat, AudioFormat audioFormat2);

    private native void nativeRelease(long j10);

    public synchronized LocalAudioTrack createAudioTrack(Context context, boolean z10, @NonNull AudioOptions audioOptions, String str) {
        try {
            try {
                Preconditions.checkNotNull(context, "context must not be null");
                Preconditions.checkNotNull(audioOptions, "audioOptions must not be null");
                Preconditions.checkApplicationContext(context, "must create local audio track with application context");
                Preconditions.checkState(this.nativeMediaFactoryHandle != 0, RELEASE_MESSAGE_TEMPLATE, "createAudioTrack");
                return nativeCreateAudioTrack(this.nativeMediaFactoryHandle, context, z10, audioOptions, str);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public long getNativeMediaFactoryHandle() {
        return this.nativeMediaFactoryHandle;
    }

    public void release(Object obj) {
        if (instance != null) {
            synchronized (MediaFactory.class) {
                try {
                    mediaFactoryOwners.remove(obj);
                    if (instance != null && mediaFactoryOwners.isEmpty()) {
                        AudioDeviceModule audioDeviceModule = this.audioDeviceModule;
                        if (audioDeviceModule != null) {
                            audioDeviceModule.release();
                        }
                        AudioDeviceProxy audioDeviceProxy = this.audioDeviceProxy;
                        if (audioDeviceProxy != null) {
                            audioDeviceProxy.release();
                        }
                        this.audioDeviceProxy = null;
                        nativeRelease(this.nativeMediaFactoryHandle);
                        this.nativeMediaFactoryHandle = 0L;
                        instance = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void setAudioDeviceProxy(AudioDeviceProxy audioDeviceProxy) {
        this.audioDeviceProxy = audioDeviceProxy;
    }

    private MediaFactory(Context context, AudioDevice audioDevice) {
        long nativeCreateWithCustomDevice = nativeCreateWithCustomDevice(context, audioDevice, audioDevice.getCapturerFormat(), audioDevice.getRendererFormat());
        this.nativeMediaFactoryHandle = nativeCreateWithCustomDevice;
        if (0 == nativeCreateWithCustomDevice) {
            logger.e("Failed to instance MediaFactory");
        }
    }
}
