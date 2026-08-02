package com.facebook.imagepipeline.producers;

/* loaded from: classes2.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final v0 f30899a = new v0();

    public static final int a(int i10) {
        return (int) (i10 * 1.3333334f);
    }

    public static final boolean b(int i10, int i11, B7.g gVar) {
        return gVar == null ? ((float) a(i10)) >= 2048.0f && a(i11) >= 2048 : a(i10) >= gVar.f849a && a(i11) >= gVar.f850b;
    }

    public static final boolean c(H7.k kVar, B7.g gVar) {
        if (kVar == null) {
            return false;
        }
        int Y02 = kVar.Y0();
        return (Y02 == 90 || Y02 == 270) ? b(kVar.getHeight(), kVar.getWidth(), gVar) : b(kVar.getWidth(), kVar.getHeight(), gVar);
    }
}
