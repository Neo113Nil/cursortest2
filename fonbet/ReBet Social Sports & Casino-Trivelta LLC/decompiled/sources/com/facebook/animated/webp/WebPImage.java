package com.facebook.animated.webp;

import D6.d;
import D6.k;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.e;
import java.nio.ByteBuffer;
import v7.C6647b;
import v7.InterfaceC6648c;
import w7.InterfaceC6718c;

@d
/* loaded from: classes2.dex */
public class WebPImage implements InterfaceC6648c, InterfaceC6718c {

    /* renamed from: a, reason: collision with root package name */
    public Bitmap.Config f30354a = null;

    @d
    private long mNativeContext;

    @d
    public WebPImage() {
    }

    public static WebPImage j(ByteBuffer byteBuffer, B7.d dVar) {
        e.a();
        byteBuffer.rewind();
        WebPImage nativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer);
        if (dVar != null) {
            nativeCreateFromDirectByteBuffer.f30354a = dVar.f827i;
        }
        return nativeCreateFromDirectByteBuffer;
    }

    public static WebPImage k(long j10, int i10, B7.d dVar) {
        e.a();
        k.b(Boolean.valueOf(j10 != 0));
        WebPImage nativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j10, i10);
        if (dVar != null) {
            nativeCreateFromNativeMemory.f30354a = dVar.f827i;
        }
        return nativeCreateFromNativeMemory;
    }

    private static native WebPImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    private static native WebPImage nativeCreateFromNativeMemory(long j10, int i10);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native WebPFrame nativeGetFrame(int i10);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    @Override // v7.InterfaceC6648c
    public int a() {
        return nativeGetFrameCount();
    }

    @Override // v7.InterfaceC6648c
    public int b() {
        return nativeGetLoopCount();
    }

    @Override // v7.InterfaceC6648c
    public C6647b c(int i10) {
        WebPFrame h10 = h(i10);
        try {
            C6647b c6647b = new C6647b(i10, h10.b(), h10.c(), h10.getWidth(), h10.getHeight(), h10.d() ? C6647b.a.BLEND_WITH_PREVIOUS : C6647b.a.NO_BLEND, h10.e() ? C6647b.EnumC0938b.DISPOSE_TO_BACKGROUND : C6647b.EnumC0938b.DISPOSE_DO_NOT);
            h10.dispose();
            return c6647b;
        } catch (Throwable th2) {
            h10.dispose();
            throw th2;
        }
    }

    @Override // v7.InterfaceC6648c
    public boolean d() {
        return true;
    }

    @Override // w7.InterfaceC6718c
    public InterfaceC6648c e(ByteBuffer byteBuffer, B7.d dVar) {
        return j(byteBuffer, dVar);
    }

    @Override // w7.InterfaceC6718c
    public InterfaceC6648c f(long j10, int i10, B7.d dVar) {
        return k(j10, i10, dVar);
    }

    public void finalize() {
        nativeFinalize();
    }

    @Override // v7.InterfaceC6648c
    public Bitmap.Config g() {
        return this.f30354a;
    }

    @Override // v7.InterfaceC6648c
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // v7.InterfaceC6648c
    public int getWidth() {
        return nativeGetWidth();
    }

    @Override // v7.InterfaceC6648c
    public int[] i() {
        return nativeGetFrameDurations();
    }

    @Override // v7.InterfaceC6648c
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public WebPFrame h(int i10) {
        return nativeGetFrame(i10);
    }

    @Override // v7.InterfaceC6648c
    public int o() {
        return nativeGetSizeInBytes();
    }

    @d
    public WebPImage(long j10) {
        this.mNativeContext = j10;
    }
}
