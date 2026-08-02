package com.facebook.animated.gif;

import D6.d;
import android.graphics.Bitmap;
import v7.InterfaceC6649d;

/* loaded from: classes2.dex */
public class GifFrame implements InterfaceC6649d {

    @d
    private long mNativeContext;

    @d
    public GifFrame(long j10) {
        this.mNativeContext = j10;
    }

    @d
    private native void nativeDispose();

    @d
    private native void nativeFinalize();

    @d
    private native int nativeGetDisposalMode();

    @d
    private native int nativeGetDurationMs();

    @d
    private native int nativeGetHeight();

    @d
    private native int nativeGetTransparentPixelColor();

    @d
    private native int nativeGetWidth();

    @d
    private native int nativeGetXOffset();

    @d
    private native int nativeGetYOffset();

    @d
    private native boolean nativeHasTransparency();

    @d
    private native void nativeRenderFrame(int i10, int i11, Bitmap bitmap);

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

    public int d() {
        return nativeGetDisposalMode();
    }

    @Override // v7.InterfaceC6649d
    public void dispose() {
        nativeDispose();
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
