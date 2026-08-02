package io.agora.rte;

import io.agora.base.internal.CalledByNative;

/* loaded from: classes3.dex */
public class PlayerObserver {
    private long mNativeHandle;

    public PlayerObserver() {
        this.mNativeHandle = 0L;
        this.mNativeHandle = nativeCreatePlayerObserver();
    }

    private void destroy() {
        nativeReleasePlayerObserver(this.mNativeHandle);
        this.mNativeHandle = 0L;
    }

    private native long nativeCreatePlayerObserver();

    private native void nativeReleasePlayerObserver(long j10);

    public void finalize() {
        destroy();
    }

    public long getNativeHandle() {
        return this.mNativeHandle;
    }

    @CalledByNative
    public void onAudioVolumeIndication(int i10) {
    }

    @CalledByNative
    public void onEvent(int i10) {
    }

    @CalledByNative
    public void onMetadata(int i10, byte[] bArr) {
    }

    @CalledByNative
    public void onPlayerInfoUpdated(PlayerInfo playerInfo) {
    }

    @CalledByNative
    public void onPositionChanged(long j10, long j11) {
    }

    @CalledByNative
    public void onResolutionChanged(int i10, int i11) {
    }

    @CalledByNative
    public void onStateChanged(int i10, int i11, Error error) {
    }
}
