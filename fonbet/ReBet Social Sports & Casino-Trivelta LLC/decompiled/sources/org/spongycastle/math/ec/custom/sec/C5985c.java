package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;

/* renamed from: org.spongycastle.math.ec.custom.sec.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5985c extends org.spongycastle.math.ec.e {

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f62779g = C5981a.f62776j;

    /* renamed from: x, reason: collision with root package name */
    protected int[] f62780x;

    public C5985c(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f62779g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP128R1FieldElement");
        }
        this.f62780x = AbstractC5983b.d(bigInteger);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e a(org.spongycastle.math.ec.e eVar) {
        int[] c10 = pj.c.c();
        AbstractC5983b.a(this.f62780x, ((C5985c) eVar).f62780x, c10);
        return new C5985c(c10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e b() {
        int[] c10 = pj.c.c();
        AbstractC5983b.b(this.f62780x, c10);
        return new C5985c(c10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e d(org.spongycastle.math.ec.e eVar) {
        int[] c10 = pj.c.c();
        pj.b.d(AbstractC5983b.f62778P, ((C5985c) eVar).f62780x, c10);
        AbstractC5983b.e(c10, this.f62780x, c10);
        return new C5985c(c10);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5985c) {
            return pj.c.g(this.f62780x, ((C5985c) obj).f62780x);
        }
        return false;
    }

    @Override // org.spongycastle.math.ec.e
    public int f() {
        return f62779g.bitLength();
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e g() {
        int[] c10 = pj.c.c();
        pj.b.d(AbstractC5983b.f62778P, this.f62780x, c10);
        return new C5985c(c10);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean h() {
        return pj.c.m(this.f62780x);
    }

    public int hashCode() {
        return f62779g.hashCode() ^ Aj.a.t(this.f62780x, 0, 4);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean i() {
        return pj.c.o(this.f62780x);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e j(org.spongycastle.math.ec.e eVar) {
        int[] c10 = pj.c.c();
        AbstractC5983b.e(this.f62780x, ((C5985c) eVar).f62780x, c10);
        return new C5985c(c10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e m() {
        int[] c10 = pj.c.c();
        AbstractC5983b.g(this.f62780x, c10);
        return new C5985c(c10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e n() {
        int[] iArr = this.f62780x;
        if (pj.c.o(iArr) || pj.c.m(iArr)) {
            return this;
        }
        int[] c10 = pj.c.c();
        AbstractC5983b.j(iArr, c10);
        AbstractC5983b.e(c10, iArr, c10);
        int[] c11 = pj.c.c();
        AbstractC5983b.k(c10, 2, c11);
        AbstractC5983b.e(c11, c10, c11);
        int[] c12 = pj.c.c();
        AbstractC5983b.k(c11, 4, c12);
        AbstractC5983b.e(c12, c11, c12);
        AbstractC5983b.k(c12, 2, c11);
        AbstractC5983b.e(c11, c10, c11);
        AbstractC5983b.k(c11, 10, c10);
        AbstractC5983b.e(c10, c11, c10);
        AbstractC5983b.k(c10, 10, c12);
        AbstractC5983b.e(c12, c11, c12);
        AbstractC5983b.j(c12, c11);
        AbstractC5983b.e(c11, iArr, c11);
        AbstractC5983b.k(c11, 95, c11);
        AbstractC5983b.j(c11, c12);
        if (pj.c.g(iArr, c12)) {
            return new C5985c(c11);
        }
        return null;
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e o() {
        int[] c10 = pj.c.c();
        AbstractC5983b.j(this.f62780x, c10);
        return new C5985c(c10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e r(org.spongycastle.math.ec.e eVar) {
        int[] c10 = pj.c.c();
        AbstractC5983b.m(this.f62780x, ((C5985c) eVar).f62780x, c10);
        return new C5985c(c10);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean s() {
        return pj.c.k(this.f62780x, 0) == 1;
    }

    @Override // org.spongycastle.math.ec.e
    public BigInteger t() {
        return pj.c.v(this.f62780x);
    }

    public C5985c(int[] iArr) {
        this.f62780x = iArr;
    }
}
