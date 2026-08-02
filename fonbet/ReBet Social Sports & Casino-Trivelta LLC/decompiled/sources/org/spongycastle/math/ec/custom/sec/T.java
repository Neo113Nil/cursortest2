package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class T extends org.spongycastle.math.ec.e {

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f62767g = Q.f62763j;

    /* renamed from: x, reason: collision with root package name */
    protected int[] f62768x;

    public T(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f62767g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP521R1FieldElement");
        }
        this.f62768x = S.c(bigInteger);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e a(org.spongycastle.math.ec.e eVar) {
        int[] i10 = pj.m.i(17);
        S.a(this.f62768x, ((T) eVar).f62768x, i10);
        return new T(i10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e b() {
        int[] i10 = pj.m.i(17);
        S.b(this.f62768x, i10);
        return new T(i10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e d(org.spongycastle.math.ec.e eVar) {
        int[] i10 = pj.m.i(17);
        pj.b.d(S.f62765P, ((T) eVar).f62768x, i10);
        S.f(i10, this.f62768x, i10);
        return new T(i10);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof T) {
            return pj.m.m(17, this.f62768x, ((T) obj).f62768x);
        }
        return false;
    }

    @Override // org.spongycastle.math.ec.e
    public int f() {
        return f62767g.bitLength();
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e g() {
        int[] i10 = pj.m.i(17);
        pj.b.d(S.f62765P, this.f62768x, i10);
        return new T(i10);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean h() {
        return pj.m.u(17, this.f62768x);
    }

    public int hashCode() {
        return f62767g.hashCode() ^ Aj.a.t(this.f62768x, 0, 17);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean i() {
        return pj.m.v(17, this.f62768x);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e j(org.spongycastle.math.ec.e eVar) {
        int[] i10 = pj.m.i(17);
        S.f(this.f62768x, ((T) eVar).f62768x, i10);
        return new T(i10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e m() {
        int[] i10 = pj.m.i(17);
        S.g(this.f62768x, i10);
        return new T(i10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e n() {
        int[] iArr = this.f62768x;
        if (pj.m.v(17, iArr) || pj.m.u(17, iArr)) {
            return this;
        }
        int[] i10 = pj.m.i(17);
        int[] i11 = pj.m.i(17);
        S.k(iArr, 519, i10);
        S.j(i10, i11);
        if (pj.m.m(17, iArr, i11)) {
            return new T(i10);
        }
        return null;
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e o() {
        int[] i10 = pj.m.i(17);
        S.j(this.f62768x, i10);
        return new T(i10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e r(org.spongycastle.math.ec.e eVar) {
        int[] i10 = pj.m.i(17);
        S.l(this.f62768x, ((T) eVar).f62768x, i10);
        return new T(i10);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean s() {
        return pj.m.o(this.f62768x, 0) == 1;
    }

    @Override // org.spongycastle.math.ec.e
    public BigInteger t() {
        return pj.m.O(17, this.f62768x);
    }

    public T(int[] iArr) {
        this.f62768x = iArr;
    }
}
