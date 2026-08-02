package org.maplibre.android.net;

import androidx.annotation.Keep;

/* loaded from: classes10.dex */
class NativeConnectivityListener implements a {

    @Keep
    private boolean invalidated;

    @Keep
    private long nativePtr;

    static {
        org.maplibre.android.a.a();
    }

    @Keep
    NativeConnectivityListener(long j11) {
        this.nativePtr = j11;
    }

    @Override // org.maplibre.android.net.a
    public final void a(boolean z11) {
        nativeOnConnectivityStateChanged(z11);
    }

    @Keep
    protected native void finalize() throws Throwable;

    @Keep
    protected native void initialize();

    @Keep
    protected native void nativeOnConnectivityStateChanged(boolean z11);

    NativeConnectivityListener() {
        initialize();
    }
}
