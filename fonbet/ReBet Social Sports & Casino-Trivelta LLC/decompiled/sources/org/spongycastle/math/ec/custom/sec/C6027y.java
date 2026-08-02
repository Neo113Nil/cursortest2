package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;

/* renamed from: org.spongycastle.math.ec.custom.sec.y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6027y extends org.spongycastle.math.ec.e {

    /* renamed from: x, reason: collision with root package name */
    protected int[] f62819x;

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f62818g = C6024w.f62813j;
    private static final int[] PRECOMP_POW2 = {868209154, -587542221, 579297866, -1014948952, -1470801668, 514782679, -1897982644};

    public C6027y(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f62818g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224K1FieldElement");
        }
        this.f62819x = AbstractC6026x.c(bigInteger);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e a(org.spongycastle.math.ec.e eVar) {
        int[] d10 = pj.f.d();
        AbstractC6026x.a(this.f62819x, ((C6027y) eVar).f62819x, d10);
        return new C6027y(d10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e b() {
        int[] d10 = pj.f.d();
        AbstractC6026x.b(this.f62819x, d10);
        return new C6027y(d10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e d(org.spongycastle.math.ec.e eVar) {
        int[] d10 = pj.f.d();
        pj.b.d(AbstractC6026x.f62816P, ((C6027y) eVar).f62819x, d10);
        AbstractC6026x.d(d10, this.f62819x, d10);
        return new C6027y(d10);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6027y) {
            return pj.f.f(this.f62819x, ((C6027y) obj).f62819x);
        }
        return false;
    }

    @Override // org.spongycastle.math.ec.e
    public int f() {
        return f62818g.bitLength();
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e g() {
        int[] d10 = pj.f.d();
        pj.b.d(AbstractC6026x.f62816P, this.f62819x, d10);
        return new C6027y(d10);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean h() {
        return pj.f.j(this.f62819x);
    }

    public int hashCode() {
        return f62818g.hashCode() ^ Aj.a.t(this.f62819x, 0, 7);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean i() {
        return pj.f.k(this.f62819x);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e j(org.spongycastle.math.ec.e eVar) {
        int[] d10 = pj.f.d();
        AbstractC6026x.d(this.f62819x, ((C6027y) eVar).f62819x, d10);
        return new C6027y(d10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e m() {
        int[] d10 = pj.f.d();
        AbstractC6026x.f(this.f62819x, d10);
        return new C6027y(d10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e n() {
        int[] iArr = this.f62819x;
        if (pj.f.k(iArr) || pj.f.j(iArr)) {
            return this;
        }
        int[] d10 = pj.f.d();
        AbstractC6026x.i(iArr, d10);
        AbstractC6026x.d(d10, iArr, d10);
        AbstractC6026x.i(d10, d10);
        AbstractC6026x.d(d10, iArr, d10);
        int[] d11 = pj.f.d();
        AbstractC6026x.i(d10, d11);
        AbstractC6026x.d(d11, iArr, d11);
        int[] d12 = pj.f.d();
        AbstractC6026x.j(d11, 4, d12);
        AbstractC6026x.d(d12, d11, d12);
        int[] d13 = pj.f.d();
        AbstractC6026x.j(d12, 3, d13);
        AbstractC6026x.d(d13, d10, d13);
        AbstractC6026x.j(d13, 8, d13);
        AbstractC6026x.d(d13, d12, d13);
        AbstractC6026x.j(d13, 4, d12);
        AbstractC6026x.d(d12, d11, d12);
        AbstractC6026x.j(d12, 19, d11);
        AbstractC6026x.d(d11, d13, d11);
        int[] d14 = pj.f.d();
        AbstractC6026x.j(d11, 42, d14);
        AbstractC6026x.d(d14, d11, d14);
        AbstractC6026x.j(d14, 23, d11);
        AbstractC6026x.d(d11, d12, d11);
        AbstractC6026x.j(d11, 84, d12);
        AbstractC6026x.d(d12, d14, d12);
        AbstractC6026x.j(d12, 20, d12);
        AbstractC6026x.d(d12, d13, d12);
        AbstractC6026x.j(d12, 3, d12);
        AbstractC6026x.d(d12, iArr, d12);
        AbstractC6026x.j(d12, 2, d12);
        AbstractC6026x.d(d12, iArr, d12);
        AbstractC6026x.j(d12, 4, d12);
        AbstractC6026x.d(d12, d10, d12);
        AbstractC6026x.i(d12, d12);
        AbstractC6026x.i(d12, d14);
        if (pj.f.f(iArr, d14)) {
            return new C6027y(d12);
        }
        AbstractC6026x.d(d12, PRECOMP_POW2, d12);
        AbstractC6026x.i(d12, d14);
        if (pj.f.f(iArr, d14)) {
            return new C6027y(d12);
        }
        return null;
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e o() {
        int[] d10 = pj.f.d();
        AbstractC6026x.i(this.f62819x, d10);
        return new C6027y(d10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e r(org.spongycastle.math.ec.e eVar) {
        int[] d10 = pj.f.d();
        AbstractC6026x.k(this.f62819x, ((C6027y) eVar).f62819x, d10);
        return new C6027y(d10);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean s() {
        return pj.f.h(this.f62819x, 0) == 1;
    }

    @Override // org.spongycastle.math.ec.e
    public BigInteger t() {
        return pj.f.t(this.f62819x);
    }

    public C6027y(int[] iArr) {
        this.f62819x = iArr;
    }
}
