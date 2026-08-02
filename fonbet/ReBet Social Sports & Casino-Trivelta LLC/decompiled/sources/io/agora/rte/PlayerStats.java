package io.agora.rte;

import io.agora.base.internal.CalledByNative;

/* loaded from: classes3.dex */
public class PlayerStats {
    private boolean mIsNativeOwner = true;
    private long mNativeHandle;

    public PlayerStats() {
        this.mNativeHandle = 0L;
        this.mNativeHandle = nativeCreatePlayerStats();
    }

    private void destroy() {
        if (this.mIsNativeOwner) {
            nativeReleasePlayerStats(this.mNativeHandle);
        }
        this.mNativeHandle = 0L;
    }

    private native int nativeAudioBitrate(long j10);

    private native long nativeCreatePlayerStats();

    private native void nativeReleasePlayerStats(long j10);

    private native int nativeVideoBitrate(long j10);

    private native int nativeVideoDecodeFrameRate(long j10);

    private native int nativeVideoRenderFrameRate(long j10);

    public int audioBitrate() {
        return nativeAudioBitrate(this.mNativeHandle);
    }

    public void finalize() {
        destroy();
    }

    public long getNativeHandle() {
        return this.mNativeHandle;
    }

    public int videoBitrate() {
        return nativeVideoBitrate(this.mNativeHandle);
    }

    public int videoDecodeFrameRate() {
        return nativeVideoDecodeFrameRate(this.mNativeHandle);
    }

    public int videoRenderFrameRate() {
        return nativeVideoRenderFrameRate(this.mNativeHandle);
    }

    @CalledByNative
    public PlayerStats(long j10) {
        this.mNativeHandle = j10;
    }
}
