package io.agora.rte;

/* loaded from: classes3.dex */
public class PlayerInitialConfig {
    private long mNativeHandle;

    public PlayerInitialConfig() {
        this.mNativeHandle = 0L;
        this.mNativeHandle = nativeCreatePlayerInitialConfig();
    }

    private native long nativeCreatePlayerInitialConfig();

    private native void nativeReleasePlayerInitialConfig(long j10);

    public void finalize() {
        nativeReleasePlayerInitialConfig(this.mNativeHandle);
    }

    public long getNativeHandle() {
        return this.mNativeHandle;
    }
}
