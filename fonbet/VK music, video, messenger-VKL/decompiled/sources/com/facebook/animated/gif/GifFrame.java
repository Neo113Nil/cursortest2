package com.facebook.animated.gif;

import android.graphics.Bitmap;
import xsna.vk2;
import xsna.zsn;

/* loaded from: classes12.dex */
public class GifFrame implements vk2 {

    @zsn
    private long mNativeContext;

    @zsn
    public GifFrame(long j) {
        this.mNativeContext = j;
    }

    @zsn
    private native void nativeDispose();

    @zsn
    private native void nativeFinalize();

    @zsn
    private native int nativeGetDisposalMode();

    @zsn
    private native int nativeGetDurationMs();

    @zsn
    private native int nativeGetHeight();

    @zsn
    private native int nativeGetTransparentPixelColor();

    @zsn
    private native int nativeGetWidth();

    @zsn
    private native int nativeGetXOffset();

    @zsn
    private native int nativeGetYOffset();

    @zsn
    private native boolean nativeHasTransparency();

    @zsn
    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    @Override // xsna.vk2
    public final void a(int i, int i2, Bitmap bitmap) {
        nativeRenderFrame(i, i2, bitmap);
    }

    @Override // xsna.vk2
    public final int b() {
        return nativeGetXOffset();
    }

    @Override // xsna.vk2
    public final int c() {
        return nativeGetYOffset();
    }

    public final int d() {
        return nativeGetDisposalMode();
    }

    @Override // xsna.vk2
    public final void dispose() {
        nativeDispose();
    }

    public final void finalize() {
        nativeFinalize();
    }

    @Override // xsna.vk2
    public final int getHeight() {
        return nativeGetHeight();
    }

    @Override // xsna.vk2
    public final int getWidth() {
        return nativeGetWidth();
    }
}
