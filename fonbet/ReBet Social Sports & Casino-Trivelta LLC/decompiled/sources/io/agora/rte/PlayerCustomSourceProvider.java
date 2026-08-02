package io.agora.rte;

/* loaded from: classes3.dex */
public class PlayerCustomSourceProvider {
    private long mNativeHandle;

    public PlayerCustomSourceProvider() {
        this.mNativeHandle = 0L;
        this.mNativeHandle = nativeCreatePlayerCustomSourceProvider();
    }

    private void destroy() {
        nativeReleasePlayerCustomSourceProvider(this.mNativeHandle);
        this.mNativeHandle = 0L;
    }

    private native long nativeCreatePlayerCustomSourceProvider();

    private native void nativeReleasePlayerCustomSourceProvider(long j10);

    public void finalize() {
        destroy();
    }

    public long getNativeHandle() {
        return this.mNativeHandle;
    }
}
