package com.facebook.animated.gif;

import D6.d;
import D6.k;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import v7.C6647b;
import v7.InterfaceC6648c;
import w7.InterfaceC6718c;
import x8.AbstractC6803a;

@d
/* loaded from: classes2.dex */
public class GifImage implements InterfaceC6648c, InterfaceC6718c {

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f30352b;

    /* renamed from: a, reason: collision with root package name */
    public Bitmap.Config f30353a = null;

    @d
    private long mNativeContext;

    @d
    public GifImage() {
    }

    public static GifImage j(ByteBuffer byteBuffer, B7.d dVar) {
        l();
        byteBuffer.rewind();
        GifImage nativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer, dVar.f820b, dVar.f825g);
        nativeCreateFromDirectByteBuffer.f30353a = dVar.f827i;
        return nativeCreateFromDirectByteBuffer;
    }

    public static GifImage k(long j10, int i10, B7.d dVar) {
        l();
        k.b(Boolean.valueOf(j10 != 0));
        GifImage nativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j10, i10, dVar.f820b, dVar.f825g);
        nativeCreateFromNativeMemory.f30353a = dVar.f827i;
        return nativeCreateFromNativeMemory;
    }

    public static synchronized void l() {
        synchronized (GifImage.class) {
            if (!f30352b) {
                f30352b = true;
                AbstractC6803a.d("gifimage");
            }
        }
    }

    public static C6647b.EnumC0938b m(int i10) {
        return i10 == 0 ? C6647b.EnumC0938b.DISPOSE_DO_NOT : i10 == 1 ? C6647b.EnumC0938b.DISPOSE_DO_NOT : i10 == 2 ? C6647b.EnumC0938b.DISPOSE_TO_BACKGROUND : i10 == 3 ? C6647b.EnumC0938b.DISPOSE_TO_PREVIOUS : C6647b.EnumC0938b.DISPOSE_DO_NOT;
    }

    @d
    private static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer, int i10, boolean z10);

    @d
    private static native GifImage nativeCreateFromFileDescriptor(int i10, int i11, boolean z10);

    @d
    private static native GifImage nativeCreateFromNativeMemory(long j10, int i10, int i11, boolean z10);

    @d
    private native void nativeDispose();

    @d
    private native void nativeFinalize();

    @d
    private native int nativeGetDuration();

    @d
    private native GifFrame nativeGetFrame(int i10);

    @d
    private native int nativeGetFrameCount();

    @d
    private native int[] nativeGetFrameDurations();

    @d
    private native int nativeGetHeight();

    @d
    private native int nativeGetLoopCount();

    @d
    private native int nativeGetSizeInBytes();

    @d
    private native int nativeGetWidth();

    @d
    private native boolean nativeIsAnimated();

    @Override // v7.InterfaceC6648c
    public int a() {
        return nativeGetFrameCount();
    }

    @Override // v7.InterfaceC6648c
    public int b() {
        int nativeGetLoopCount = nativeGetLoopCount();
        if (nativeGetLoopCount == -1) {
            return 1;
        }
        if (nativeGetLoopCount != 0) {
            return nativeGetLoopCount + 1;
        }
        return 0;
    }

    @Override // v7.InterfaceC6648c
    public C6647b c(int i10) {
        GifFrame h10 = h(i10);
        try {
            return new C6647b(i10, h10.b(), h10.c(), h10.getWidth(), h10.getHeight(), C6647b.a.BLEND_WITH_PREVIOUS, m(h10.d()));
        } finally {
            h10.dispose();
        }
    }

    @Override // v7.InterfaceC6648c
    public boolean d() {
        return false;
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
        return this.f30353a;
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
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public GifFrame h(int i10) {
        return nativeGetFrame(i10);
    }

    @Override // v7.InterfaceC6648c
    public int o() {
        return nativeGetSizeInBytes();
    }

    @d
    public GifImage(long j10) {
        this.mNativeContext = j10;
    }
}
