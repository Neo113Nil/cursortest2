package io.agora.rte;

import io.agora.rte.callback.AsyncCallback;
import io.agora.rte.exception.RteException;

/* loaded from: classes3.dex */
public class Rte {
    public static final String TAG = "Rte";
    private boolean mGetFromBridge = true;
    private long mNativeHandle;

    private Rte(long j10) {
        this.mNativeHandle = j10;
    }

    public static synchronized Rte getFromBridge() {
        Rte rte;
        synchronized (Rte.class) {
            rte = new Rte(nativeGetFromBridge());
        }
        return rte;
    }

    private native long nativeCreateRte(InitialConfig initialConfig);

    private native void nativeGetConfigs(long j10, long j11);

    private static native long nativeGetFromBridge();

    private native void nativeInitMediaEngine(long j10, AsyncCallback asyncCallback);

    private native void nativeRegisterObserver(long j10, long j11);

    private native void nativeReleaseRte(long j10);

    private native void nativeSetConfigs(long j10, long j11);

    private native void nativeUnregisterObserver(long j10, long j11);

    public synchronized void destroy() {
        long j10 = this.mNativeHandle;
        if (j10 != 0) {
            nativeReleaseRte(j10);
            this.mNativeHandle = 0L;
            if (!this.mGetFromBridge) {
                NativeLibsLoader.deinitializeNativeLibs();
            }
        }
    }

    public void finalize() {
        try {
            destroy();
        } catch (RteException e10) {
            e10.printStackTrace();
        }
    }

    public void getConfigs(Config config) {
        nativeGetConfigs(this.mNativeHandle, config != null ? config.getNativeHandle() : 0L);
    }

    public long getNativeHandle() {
        return this.mNativeHandle;
    }

    public void initMediaEngine(AsyncCallback asyncCallback) {
        nativeInitMediaEngine(this.mNativeHandle, asyncCallback);
    }

    public void registerObserver(Observer observer) {
        nativeRegisterObserver(this.mNativeHandle, observer != null ? observer.getNativeHandle() : 0L);
    }

    public void setConfigs(Config config) {
        nativeSetConfigs(this.mNativeHandle, config != null ? config.getNativeHandle() : 0L);
    }

    public void unregisterObserver(Observer observer) {
        nativeUnregisterObserver(this.mNativeHandle, observer != null ? observer.getNativeHandle() : 0L);
    }

    public Rte(InitialConfig initialConfig) {
        this.mNativeHandle = 0L;
        NativeLibsLoader.initializeNativeLibs();
        this.mNativeHandle = nativeCreateRte(initialConfig);
    }
}
