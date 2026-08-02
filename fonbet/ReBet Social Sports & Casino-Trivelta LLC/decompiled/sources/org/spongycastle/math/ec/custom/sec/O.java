package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class O extends org.spongycastle.math.ec.e {

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f62760g = M.f62755j;

    /* renamed from: x, reason: collision with root package name */
    protected int[] f62761x;

    public O(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f62760g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP384R1FieldElement");
        }
        this.f62761x = N.e(bigInteger);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e a(org.spongycastle.math.ec.e eVar) {
        int[] i10 = pj.m.i(12);
        N.a(this.f62761x, ((O) eVar).f62761x, i10);
        return new O(i10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e b() {
        int[] i10 = pj.m.i(12);
        N.c(this.f62761x, i10);
        return new O(i10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e d(org.spongycastle.math.ec.e eVar) {
        int[] i10 = pj.m.i(12);
        pj.b.d(N.f62758P, ((O) eVar).f62761x, i10);
        N.f(i10, this.f62761x, i10);
        return new O(i10);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof O) {
            return pj.m.m(12, this.f62761x, ((O) obj).f62761x);
        }
        return false;
    }

    @Override // org.spongycastle.math.ec.e
    public int f() {
        return f62760g.bitLength();
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e g() {
        int[] i10 = pj.m.i(12);
        pj.b.d(N.f62758P, this.f62761x, i10);
        return new O(i10);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean h() {
        return pj.m.u(12, this.f62761x);
    }

    public int hashCode() {
        return f62760g.hashCode() ^ Aj.a.t(this.f62761x, 0, 12);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean i() {
        return pj.m.v(12, this.f62761x);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e j(org.spongycastle.math.ec.e eVar) {
        int[] i10 = pj.m.i(12);
        N.f(this.f62761x, ((O) eVar).f62761x, i10);
        return new O(i10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e m() {
        int[] i10 = pj.m.i(12);
        N.g(this.f62761x, i10);
        return new O(i10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e n() {
        int[] iArr = this.f62761x;
        if (pj.m.v(12, iArr) || pj.m.u(12, iArr)) {
            return this;
        }
        int[] i10 = pj.m.i(12);
        int[] i11 = pj.m.i(12);
        int[] i12 = pj.m.i(12);
        int[] i13 = pj.m.i(12);
        N.j(iArr, i10);
        N.f(i10, iArr, i10);
        N.k(i10, 2, i11);
        N.f(i11, i10, i11);
        N.j(i11, i11);
        N.f(i11, iArr, i11);
        N.k(i11, 5, i12);
        N.f(i12, i11, i12);
        N.k(i12, 5, i13);
        N.f(i13, i11, i13);
        N.k(i13, 15, i11);
        N.f(i11, i13, i11);
        N.k(i11, 2, i12);
        N.f(i10, i12, i10);
        N.k(i12, 28, i12);
        N.f(i11, i12, i11);
        N.k(i11, 60, i12);
        N.f(i12, i11, i12);
        N.k(i12, 120, i11);
        N.f(i11, i12, i11);
        N.k(i11, 15, i11);
        N.f(i11, i13, i11);
        N.k(i11, 33, i11);
        N.f(i11, i10, i11);
        N.k(i11, 64, i11);
        N.f(i11, iArr, i11);
        N.k(i11, 30, i10);
        N.j(i10, i11);
        if (pj.m.m(12, iArr, i11)) {
            return new O(i10);
        }
        return null;
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e o() {
        int[] i10 = pj.m.i(12);
        N.j(this.f62761x, i10);
        return new O(i10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e r(org.spongycastle.math.ec.e eVar) {
        int[] i10 = pj.m.i(12);
        N.m(this.f62761x, ((O) eVar).f62761x, i10);
        return new O(i10);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean s() {
        return pj.m.o(this.f62761x, 0) == 1;
    }

    @Override // org.spongycastle.math.ec.e
    public BigInteger t() {
        return pj.m.O(12, this.f62761x);
    }

    public O(int[] iArr) {
        this.f62761x = iArr;
    }
}
