package com.facebook.animated.webp;

import android.graphics.Bitmap;
import xsna.vk2;
import xsna.zsn;

/* loaded from: classes12.dex */
public class WebPFrame implements vk2 {

    @zsn
    private long mNativeContext;

    @zsn
    public WebPFrame(long j) {
        this.mNativeContext = j;
    }

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDurationMs();

    private native int nativeGetHeight();

    private native int nativeGetWidth();

    private native int nativeGetXOffset();

    private native int nativeGetYOffset();

    private native boolean nativeIsBlendWithPreviousFrame();

    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    private native boolean nativeShouldDisposeToBackgroundColor();

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

    public final boolean d() {
        return nativeIsBlendWithPreviousFrame();
    }

    @Override // xsna.vk2
    public final void dispose() {
        nativeDispose();
    }

    public final boolean e() {
        return nativeShouldDisposeToBackgroundColor();
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
