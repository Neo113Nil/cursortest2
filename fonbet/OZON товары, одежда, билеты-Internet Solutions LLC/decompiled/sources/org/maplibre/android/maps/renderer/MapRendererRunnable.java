package org.maplibre.android.maps.renderer;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes10.dex */
class MapRendererRunnable implements Runnable {
    private final long nativePtr;

    MapRendererRunnable(long j11) {
        this.nativePtr = j11;
    }

    private native void nativeInitialize();

    protected native void finalize() throws Throwable;

    @Override // java.lang.Runnable
    public native void run();
}
