package io.agora.rte;

import io.agora.base.internal.CalledByNative;
import io.agora.rte.Constants;

/* loaded from: classes3.dex */
public class PlayerInfo {
    private long mNativeHandle;

    @CalledByNative
    public PlayerInfo() {
        this.mNativeHandle = 0L;
        this.mNativeHandle = nativeCreatePlayerInfo();
    }

    private void destroy() {
        nativeReleasePlayerInfo(this.mNativeHandle);
        this.mNativeHandle = 0L;
    }

    private native int nativeAbrSubscriptionLayer(long j10);

    private native int nativeAudioBitsPerSample(long j10);

    private native int nativeAudioChannels(long j10);

    private native int nativeAudioSampleRate(long j10);

    private native long nativeCreatePlayerInfo();

    private native String nativeCurrentUrl(long j10);

    private native long nativeDuration(long j10);

    private native boolean nativeHasAudio(long j10);

    private native boolean nativeHasVideo(long j10);

    private native boolean nativeIsAudioMuted(long j10);

    private native boolean nativeIsVideoMuted(long j10);

    private native void nativeReleasePlayerInfo(long j10);

    private native int nativeState(long j10);

    private native int nativeStreamCount(long j10);

    private native int nativeVideoHeight(long j10);

    private native int nativeVideoWidth(long j10);

    public Constants.AbrSubscriptionLayer abrSubscriptionLayer() {
        return Constants.AbrSubscriptionLayer.fromInt(nativeAbrSubscriptionLayer(this.mNativeHandle));
    }

    public int audioBitsPerSample() {
        return nativeAudioBitsPerSample(this.mNativeHandle);
    }

    public int audioChannels() {
        return nativeAudioChannels(this.mNativeHandle);
    }

    public int audioSampleRate() {
        return nativeAudioSampleRate(this.mNativeHandle);
    }

    public String currentUrl() {
        return nativeCurrentUrl(this.mNativeHandle);
    }

    public long duration() {
        return nativeDuration(this.mNativeHandle);
    }

    public void finalize() {
        destroy();
    }

    @CalledByNative
    public long getNativeHandle() {
        return this.mNativeHandle;
    }

    public boolean hasAudio() {
        return nativeHasAudio(this.mNativeHandle);
    }

    public boolean hasVideo() {
        return nativeHasVideo(this.mNativeHandle);
    }

    public boolean isAudioMuted() {
        return nativeIsAudioMuted(this.mNativeHandle);
    }

    public boolean isVideoMuted() {
        return nativeIsVideoMuted(this.mNativeHandle);
    }

    public int state() {
        return nativeState(this.mNativeHandle);
    }

    public int streamCount() {
        return nativeStreamCount(this.mNativeHandle);
    }

    public int videoHeight() {
        return nativeVideoHeight(this.mNativeHandle);
    }

    public int videoWidth() {
        return nativeVideoWidth(this.mNativeHandle);
    }
}
