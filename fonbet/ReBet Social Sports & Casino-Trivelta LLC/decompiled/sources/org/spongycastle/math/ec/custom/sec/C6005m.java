package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;

/* renamed from: org.spongycastle.math.ec.custom.sec.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6005m extends org.spongycastle.math.ec.e {

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f62797g = C6001k.f62793j;

    /* renamed from: x, reason: collision with root package name */
    protected int[] f62798x;

    public C6005m(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f62797g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R2FieldElement");
        }
        this.f62798x = AbstractC6003l.c(bigInteger);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e a(org.spongycastle.math.ec.e eVar) {
        int[] c10 = pj.d.c();
        AbstractC6003l.a(this.f62798x, ((C6005m) eVar).f62798x, c10);
        return new C6005m(c10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e b() {
        int[] c10 = pj.d.c();
        AbstractC6003l.b(this.f62798x, c10);
        return new C6005m(c10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e d(org.spongycastle.math.ec.e eVar) {
        int[] c10 = pj.d.c();
        pj.b.d(AbstractC6003l.f62795P, ((C6005m) eVar).f62798x, c10);
        AbstractC6003l.d(c10, this.f62798x, c10);
        return new C6005m(c10);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6005m) {
            return pj.d.e(this.f62798x, ((C6005m) obj).f62798x);
        }
        return false;
    }

    @Override // org.spongycastle.math.ec.e
    public int f() {
        return f62797g.bitLength();
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e g() {
        int[] c10 = pj.d.c();
        pj.b.d(AbstractC6003l.f62795P, this.f62798x, c10);
        return new C6005m(c10);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean h() {
        return pj.d.i(this.f62798x);
    }

    public int hashCode() {
        return f62797g.hashCode() ^ Aj.a.t(this.f62798x, 0, 5);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean i() {
        return pj.d.j(this.f62798x);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e j(org.spongycastle.math.ec.e eVar) {
        int[] c10 = pj.d.c();
        AbstractC6003l.d(this.f62798x, ((C6005m) eVar).f62798x, c10);
        return new C6005m(c10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e m() {
        int[] c10 = pj.d.c();
        AbstractC6003l.f(this.f62798x, c10);
        return new C6005m(c10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e n() {
        int[] iArr = this.f62798x;
        if (pj.d.j(iArr) || pj.d.i(iArr)) {
            return this;
        }
        int[] c10 = pj.d.c();
        AbstractC6003l.i(iArr, c10);
        AbstractC6003l.d(c10, iArr, c10);
        int[] c11 = pj.d.c();
        AbstractC6003l.i(c10, c11);
        AbstractC6003l.d(c11, iArr, c11);
        int[] c12 = pj.d.c();
        AbstractC6003l.i(c11, c12);
        AbstractC6003l.d(c12, iArr, c12);
        int[] c13 = pj.d.c();
        AbstractC6003l.j(c12, 3, c13);
        AbstractC6003l.d(c13, c11, c13);
        AbstractC6003l.j(c13, 7, c12);
        AbstractC6003l.d(c12, c13, c12);
        AbstractC6003l.j(c12, 3, c13);
        AbstractC6003l.d(c13, c11, c13);
        int[] c14 = pj.d.c();
        AbstractC6003l.j(c13, 14, c14);
        AbstractC6003l.d(c14, c12, c14);
        AbstractC6003l.j(c14, 31, c12);
        AbstractC6003l.d(c12, c14, c12);
        AbstractC6003l.j(c12, 62, c14);
        AbstractC6003l.d(c14, c12, c14);
        AbstractC6003l.j(c14, 3, c12);
        AbstractC6003l.d(c12, c11, c12);
        AbstractC6003l.j(c12, 18, c12);
        AbstractC6003l.d(c12, c13, c12);
        AbstractC6003l.j(c12, 2, c12);
        AbstractC6003l.d(c12, iArr, c12);
        AbstractC6003l.j(c12, 3, c12);
        AbstractC6003l.d(c12, c10, c12);
        AbstractC6003l.j(c12, 6, c12);
        AbstractC6003l.d(c12, c11, c12);
        AbstractC6003l.j(c12, 2, c12);
        AbstractC6003l.d(c12, iArr, c12);
        AbstractC6003l.i(c12, c10);
        if (pj.d.e(iArr, c10)) {
            return new C6005m(c12);
        }
        return null;
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e o() {
        int[] c10 = pj.d.c();
        AbstractC6003l.i(this.f62798x, c10);
        return new C6005m(c10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e r(org.spongycastle.math.ec.e eVar) {
        int[] c10 = pj.d.c();
        AbstractC6003l.k(this.f62798x, ((C6005m) eVar).f62798x, c10);
        return new C6005m(c10);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean s() {
        return pj.d.g(this.f62798x, 0) == 1;
    }

    @Override // org.spongycastle.math.ec.e
    public BigInteger t() {
        return pj.d.t(this.f62798x);
    }

    public C6005m(int[] iArr) {
        this.f62798x = iArr;
    }
}
