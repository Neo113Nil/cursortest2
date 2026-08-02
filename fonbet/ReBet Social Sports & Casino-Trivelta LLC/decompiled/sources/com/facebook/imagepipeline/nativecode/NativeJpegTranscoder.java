package com.facebook.imagepipeline.nativecode;

import B7.g;
import B7.h;
import D6.k;
import android.graphics.ColorSpace;
import java.io.InputStream;
import java.io.OutputStream;
import u7.C6528b;

@D6.d
/* loaded from: classes2.dex */
public class NativeJpegTranscoder implements O7.c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f30586a;

    /* renamed from: b, reason: collision with root package name */
    public int f30587b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30588c;

    public NativeJpegTranscoder(boolean z10, int i10, boolean z11, boolean z12) {
        this.f30586a = z10;
        this.f30587b = i10;
        this.f30588c = z11;
        if (z12) {
            d.a();
        }
    }

    public static void e(InputStream inputStream, OutputStream outputStream, int i10, int i11, int i12) {
        d.a();
        k.b(Boolean.valueOf(i11 >= 1));
        k.b(Boolean.valueOf(i11 <= 16));
        k.b(Boolean.valueOf(i12 >= 0));
        k.b(Boolean.valueOf(i12 <= 100));
        k.b(Boolean.valueOf(O7.e.j(i10)));
        k.c((i11 == 8 && i10 == 0) ? false : true, "no transformation requested");
        nativeTranscodeJpeg((InputStream) k.g(inputStream), (OutputStream) k.g(outputStream), i10, i11, i12);
    }

    public static void f(InputStream inputStream, OutputStream outputStream, int i10, int i11, int i12) {
        d.a();
        k.b(Boolean.valueOf(i11 >= 1));
        k.b(Boolean.valueOf(i11 <= 16));
        k.b(Boolean.valueOf(i12 >= 0));
        k.b(Boolean.valueOf(i12 <= 100));
        k.b(Boolean.valueOf(O7.e.i(i10)));
        k.c((i11 == 8 && i10 == 1) ? false : true, "no transformation requested");
        nativeTranscodeJpegWithExifOrientation((InputStream) k.g(inputStream), (OutputStream) k.g(outputStream), i10, i11, i12);
    }

    @D6.d
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i10, int i11, int i12);

    @D6.d
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i10, int i11, int i12);

    @Override // O7.c
    public String a() {
        return "NativeJpegTranscoder";
    }

    @Override // O7.c
    public O7.b b(H7.k kVar, OutputStream outputStream, h hVar, g gVar, u7.c cVar, Integer num, ColorSpace colorSpace) {
        if (num == null) {
            num = 85;
        }
        if (hVar == null) {
            hVar = h.d();
        }
        int b10 = O7.a.b(hVar, gVar, kVar, this.f30587b);
        try {
            int f10 = O7.e.f(hVar, gVar, kVar, this.f30586a);
            int a10 = O7.e.a(b10);
            if (this.f30588c) {
                f10 = a10;
            }
            InputStream D02 = kVar.D0();
            if (O7.e.f8347b.contains(Integer.valueOf(kVar.K0()))) {
                f((InputStream) k.h(D02, "Cannot transcode from null input stream!"), outputStream, O7.e.d(hVar, kVar), f10, num.intValue());
            } else {
                e((InputStream) k.h(D02, "Cannot transcode from null input stream!"), outputStream, O7.e.e(hVar, kVar), f10, num.intValue());
            }
            D6.b.b(D02);
            return new O7.b(b10 != 1 ? 0 : 1);
        } catch (Throwable th2) {
            D6.b.b(null);
            throw th2;
        }
    }

    @Override // O7.c
    public boolean c(u7.c cVar) {
        return cVar == C6528b.f66196b;
    }

    @Override // O7.c
    public boolean d(H7.k kVar, h hVar, g gVar) {
        if (hVar == null) {
            hVar = h.d();
        }
        return O7.e.f(hVar, gVar, kVar, this.f30586a) < 8;
    }
}
