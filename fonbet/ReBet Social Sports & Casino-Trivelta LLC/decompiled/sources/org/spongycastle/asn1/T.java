package org.spongycastle.asn1;

/* loaded from: classes5.dex */
public abstract class T {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC5941t f62242a = new d0();

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC5943v f62243b = new f0();

    public static AbstractC5941t a(C5928f c5928f) {
        return c5928f.c() < 1 ? f62242a : new p0(c5928f);
    }

    public static AbstractC5943v b(C5928f c5928f) {
        return c5928f.c() < 1 ? f62243b : new q0(c5928f);
    }
}
