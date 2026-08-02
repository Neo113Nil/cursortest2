package io.agora.rte;

/* loaded from: classes3.dex */
public class CanvasInitialConfig {
    private long mNativeHandle;

    public CanvasInitialConfig() {
        this.mNativeHandle = 0L;
        this.mNativeHandle = nativeCreateCanvasInitialConfig();
    }

    private void destroy() {
        nativeReleaseCanvasInitialConfig(this.mNativeHandle);
        this.mNativeHandle = 0L;
    }

    private native long nativeCreateCanvasInitialConfig();

    private native void nativeReleaseCanvasInitialConfig(long j10);

    public void finalize() {
        destroy();
    }

    public long getNativeHandle() {
        return this.mNativeHandle;
    }
}
