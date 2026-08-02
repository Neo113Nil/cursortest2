package com.google.zxing.aztec.encoder;

/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: b, reason: collision with root package name */
    public static final g f38378b = new e(null, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final g f38379a;

    public g(g gVar) {
        this.f38379a = gVar;
    }

    public final g a(int i10, int i11) {
        return new e(this, i10, i11);
    }

    public final g b(int i10, int i11) {
        return new b(this, i10, i11);
    }

    public abstract void c(Lb.a aVar, byte[] bArr);

    public final g d() {
        return this.f38379a;
    }
}
