package org.spongycastle.math.ec.custom.djb;

import java.math.BigInteger;
import org.spongycastle.math.ec.e;
import pj.g;

/* loaded from: classes5.dex */
public class c extends e {

    /* renamed from: x, reason: collision with root package name */
    protected int[] f62734x;

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f62733g = a.f62730j;
    private static final int[] PRECOMP_POW2 = {1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848};

    public c(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f62733g) >= 0) {
            throw new IllegalArgumentException("x value invalid for Curve25519FieldElement");
        }
        this.f62734x = b.d(bigInteger);
    }

    @Override // org.spongycastle.math.ec.e
    public e a(e eVar) {
        int[] f10 = g.f();
        b.a(this.f62734x, ((c) eVar).f62734x, f10);
        return new c(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public e b() {
        int[] f10 = g.f();
        b.b(this.f62734x, f10);
        return new c(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public e d(e eVar) {
        int[] f10 = g.f();
        pj.b.d(b.f62732P, ((c) eVar).f62734x, f10);
        b.e(f10, this.f62734x, f10);
        return new c(f10);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return g.k(this.f62734x, ((c) obj).f62734x);
        }
        return false;
    }

    @Override // org.spongycastle.math.ec.e
    public int f() {
        return f62733g.bitLength();
    }

    @Override // org.spongycastle.math.ec.e
    public e g() {
        int[] f10 = g.f();
        pj.b.d(b.f62732P, this.f62734x, f10);
        return new c(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean h() {
        return g.r(this.f62734x);
    }

    public int hashCode() {
        return f62733g.hashCode() ^ Aj.a.t(this.f62734x, 0, 8);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean i() {
        return g.t(this.f62734x);
    }

    @Override // org.spongycastle.math.ec.e
    public e j(e eVar) {
        int[] f10 = g.f();
        b.e(this.f62734x, ((c) eVar).f62734x, f10);
        return new c(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public e m() {
        int[] f10 = g.f();
        b.g(this.f62734x, f10);
        return new c(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public e n() {
        int[] iArr = this.f62734x;
        if (g.t(iArr) || g.r(iArr)) {
            return this;
        }
        int[] f10 = g.f();
        b.j(iArr, f10);
        b.e(f10, iArr, f10);
        b.j(f10, f10);
        b.e(f10, iArr, f10);
        int[] f11 = g.f();
        b.j(f10, f11);
        b.e(f11, iArr, f11);
        int[] f12 = g.f();
        b.k(f11, 3, f12);
        b.e(f12, f10, f12);
        b.k(f12, 4, f10);
        b.e(f10, f11, f10);
        b.k(f10, 4, f12);
        b.e(f12, f11, f12);
        b.k(f12, 15, f11);
        b.e(f11, f12, f11);
        b.k(f11, 30, f12);
        b.e(f12, f11, f12);
        b.k(f12, 60, f11);
        b.e(f11, f12, f11);
        b.k(f11, 11, f12);
        b.e(f12, f10, f12);
        b.k(f12, 120, f10);
        b.e(f10, f11, f10);
        b.j(f10, f10);
        b.j(f10, f11);
        if (g.k(iArr, f11)) {
            return new c(f10);
        }
        b.e(f10, PRECOMP_POW2, f10);
        b.j(f10, f11);
        if (g.k(iArr, f11)) {
            return new c(f10);
        }
        return null;
    }

    @Override // org.spongycastle.math.ec.e
    public e o() {
        int[] f10 = g.f();
        b.j(this.f62734x, f10);
        return new c(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public e r(e eVar) {
        int[] f10 = g.f();
        b.n(this.f62734x, ((c) eVar).f62734x, f10);
        return new c(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean s() {
        return g.o(this.f62734x, 0) == 1;
    }

    @Override // org.spongycastle.math.ec.e
    public BigInteger t() {
        return g.H(this.f62734x);
    }

    public c() {
        this.f62734x = g.f();
    }

    public c(int[] iArr) {
        this.f62734x = iArr;
    }
}
