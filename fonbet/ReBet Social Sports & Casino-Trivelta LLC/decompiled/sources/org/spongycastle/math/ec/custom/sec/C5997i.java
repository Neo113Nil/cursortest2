package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;

/* renamed from: org.spongycastle.math.ec.custom.sec.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5997i extends org.spongycastle.math.ec.e {

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f62789g = C5993g.f62786j;

    /* renamed from: x, reason: collision with root package name */
    protected int[] f62790x;

    public C5997i(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f62789g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R1FieldElement");
        }
        this.f62790x = AbstractC5995h.c(bigInteger);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e a(org.spongycastle.math.ec.e eVar) {
        int[] c10 = pj.d.c();
        AbstractC5995h.a(this.f62790x, ((C5997i) eVar).f62790x, c10);
        return new C5997i(c10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e b() {
        int[] c10 = pj.d.c();
        AbstractC5995h.b(this.f62790x, c10);
        return new C5997i(c10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e d(org.spongycastle.math.ec.e eVar) {
        int[] c10 = pj.d.c();
        pj.b.d(AbstractC5995h.f62788P, ((C5997i) eVar).f62790x, c10);
        AbstractC5995h.d(c10, this.f62790x, c10);
        return new C5997i(c10);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5997i) {
            return pj.d.e(this.f62790x, ((C5997i) obj).f62790x);
        }
        return false;
    }

    @Override // org.spongycastle.math.ec.e
    public int f() {
        return f62789g.bitLength();
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e g() {
        int[] c10 = pj.d.c();
        pj.b.d(AbstractC5995h.f62788P, this.f62790x, c10);
        return new C5997i(c10);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean h() {
        return pj.d.i(this.f62790x);
    }

    public int hashCode() {
        return f62789g.hashCode() ^ Aj.a.t(this.f62790x, 0, 5);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean i() {
        return pj.d.j(this.f62790x);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e j(org.spongycastle.math.ec.e eVar) {
        int[] c10 = pj.d.c();
        AbstractC5995h.d(this.f62790x, ((C5997i) eVar).f62790x, c10);
        return new C5997i(c10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e m() {
        int[] c10 = pj.d.c();
        AbstractC5995h.f(this.f62790x, c10);
        return new C5997i(c10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e n() {
        int[] iArr = this.f62790x;
        if (pj.d.j(iArr) || pj.d.i(iArr)) {
            return this;
        }
        int[] c10 = pj.d.c();
        AbstractC5995h.i(iArr, c10);
        AbstractC5995h.d(c10, iArr, c10);
        int[] c11 = pj.d.c();
        AbstractC5995h.j(c10, 2, c11);
        AbstractC5995h.d(c11, c10, c11);
        AbstractC5995h.j(c11, 4, c10);
        AbstractC5995h.d(c10, c11, c10);
        AbstractC5995h.j(c10, 8, c11);
        AbstractC5995h.d(c11, c10, c11);
        AbstractC5995h.j(c11, 16, c10);
        AbstractC5995h.d(c10, c11, c10);
        AbstractC5995h.j(c10, 32, c11);
        AbstractC5995h.d(c11, c10, c11);
        AbstractC5995h.j(c11, 64, c10);
        AbstractC5995h.d(c10, c11, c10);
        AbstractC5995h.i(c10, c11);
        AbstractC5995h.d(c11, iArr, c11);
        AbstractC5995h.j(c11, 29, c11);
        AbstractC5995h.i(c11, c10);
        if (pj.d.e(iArr, c10)) {
            return new C5997i(c11);
        }
        return null;
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e o() {
        int[] c10 = pj.d.c();
        AbstractC5995h.i(this.f62790x, c10);
        return new C5997i(c10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e r(org.spongycastle.math.ec.e eVar) {
        int[] c10 = pj.d.c();
        AbstractC5995h.k(this.f62790x, ((C5997i) eVar).f62790x, c10);
        return new C5997i(c10);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean s() {
        return pj.d.g(this.f62790x, 0) == 1;
    }

    @Override // org.spongycastle.math.ec.e
    public BigInteger t() {
        return pj.d.t(this.f62790x);
    }

    public C5997i(int[] iArr) {
        this.f62790x = iArr;
    }
}
