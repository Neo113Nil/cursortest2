package io.agora.rte;

/* loaded from: classes3.dex */
public class Observer {
    private long mNativeHandle;

    public Observer() {
        this.mNativeHandle = 0L;
        this.mNativeHandle = nativeCreateObserver();
    }

    private void destroy() {
        nativeReleaseObserver(this.mNativeHandle);
        this.mNativeHandle = 0L;
    }

    private native long nativeCreateObserver();

    private native void nativeReleaseObserver(long j10);

    public void finalize() {
        destroy();
    }

    public long getNativeHandle() {
        return this.mNativeHandle;
    }
}
