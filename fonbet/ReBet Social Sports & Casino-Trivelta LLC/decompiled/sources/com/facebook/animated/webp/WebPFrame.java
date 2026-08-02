package com.facebook.animated.webp;

import D6.d;
import android.graphics.Bitmap;
import v7.InterfaceC6649d;

/* loaded from: classes2.dex */
public class WebPFrame implements InterfaceC6649d {

    @d
    private long mNativeContext;

    @d
    public WebPFrame(long j10) {
        this.mNativeContext = j10;
    }

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDurationMs();

    private native int nativeGetHeight();

    private native int nativeGetWidth();

    private native int nativeGetXOffset();

    private native int nativeGetYOffset();

    private native boolean nativeIsBlendWithPreviousFrame();

    private native void nativeRenderFrame(int i10, int i11, Bitmap bitmap);

    private native boolean nativeShouldDisposeToBackgroundColor();

    @Override // v7.InterfaceC6649d
    public void a(int i10, int i11, Bitmap bitmap) {
        nativeRenderFrame(i10, i11, bitmap);
    }

    @Override // v7.InterfaceC6649d
    public int b() {
        return nativeGetXOffset();
    }

    @Override // v7.InterfaceC6649d
    public int c() {
        return nativeGetYOffset();
    }

    public boolean d() {
        return nativeIsBlendWithPreviousFrame();
    }

    @Override // v7.InterfaceC6649d
    public void dispose() {
        nativeDispose();
    }

    public boolean e() {
        return nativeShouldDisposeToBackgroundColor();
    }

    public void finalize() {
        nativeFinalize();
    }

    @Override // v7.InterfaceC6649d
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // v7.InterfaceC6649d
    public int getWidth() {
        return nativeGetWidth();
    }
}
