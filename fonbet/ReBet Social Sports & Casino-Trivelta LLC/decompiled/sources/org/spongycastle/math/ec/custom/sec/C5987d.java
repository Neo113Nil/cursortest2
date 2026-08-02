package org.spongycastle.math.ec.custom.sec;

import org.spongycastle.math.ec.g;

/* renamed from: org.spongycastle.math.ec.custom.sec.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5987d extends g.b {
    public C5987d(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2) {
        this(dVar, eVar, eVar2, false);
    }

    @Override // org.spongycastle.math.ec.g
    public org.spongycastle.math.ec.g B() {
        return (r() || this.f62850c.i()) ? this : D().a(this);
    }

    @Override // org.spongycastle.math.ec.g
    public org.spongycastle.math.ec.g D() {
        if (r()) {
            return this;
        }
        org.spongycastle.math.ec.d h10 = h();
        C5985c c5985c = (C5985c) this.f62850c;
        if (c5985c.i()) {
            return h10.u();
        }
        C5985c c5985c2 = (C5985c) this.f62849b;
        C5985c c5985c3 = (C5985c) this.zs[0];
        int[] c10 = pj.c.c();
        int[] c11 = pj.c.c();
        int[] c12 = pj.c.c();
        AbstractC5983b.j(c5985c.f62780x, c12);
        int[] c13 = pj.c.c();
        AbstractC5983b.j(c12, c13);
        boolean h11 = c5985c3.h();
        int[] iArr = c5985c3.f62780x;
        if (!h11) {
            AbstractC5983b.j(iArr, c11);
            iArr = c11;
        }
        AbstractC5983b.m(c5985c2.f62780x, iArr, c10);
        AbstractC5983b.a(c5985c2.f62780x, iArr, c11);
        AbstractC5983b.e(c11, c10, c11);
        AbstractC5983b.i(pj.c.b(c11, c11, c11), c11);
        AbstractC5983b.e(c12, c5985c2.f62780x, c12);
        AbstractC5983b.i(pj.m.F(4, c12, 2, 0), c12);
        AbstractC5983b.i(pj.m.G(4, c13, 3, 0, c10), c10);
        C5985c c5985c4 = new C5985c(c13);
        AbstractC5983b.j(c11, c5985c4.f62780x);
        int[] iArr2 = c5985c4.f62780x;
        AbstractC5983b.m(iArr2, c12, iArr2);
        int[] iArr3 = c5985c4.f62780x;
        AbstractC5983b.m(iArr3, c12, iArr3);
        C5985c c5985c5 = new C5985c(c12);
        AbstractC5983b.m(c12, c5985c4.f62780x, c5985c5.f62780x);
        int[] iArr4 = c5985c5.f62780x;
        AbstractC5983b.e(iArr4, c11, iArr4);
        int[] iArr5 = c5985c5.f62780x;
        AbstractC5983b.m(iArr5, c10, iArr5);
        C5985c c5985c6 = new C5985c(c11);
        AbstractC5983b.n(c5985c.f62780x, c5985c6.f62780x);
        if (!h11) {
            int[] iArr6 = c5985c6.f62780x;
            AbstractC5983b.e(iArr6, c5985c3.f62780x, iArr6);
        }
        return new C5987d(h10, c5985c4, c5985c5, new org.spongycastle.math.ec.e[]{c5985c6}, this.f62851d);
    }

    @Override // org.spongycastle.math.ec.g
    public org.spongycastle.math.ec.g E(org.spongycastle.math.ec.g gVar) {
        return this == gVar ? B() : r() ? gVar : gVar.r() ? D() : this.f62850c.i() ? gVar : D().a(gVar);
    }

    @Override // org.spongycastle.math.ec.g
    public org.spongycastle.math.ec.g a(org.spongycastle.math.ec.g gVar) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (r()) {
            return gVar;
        }
        if (gVar.r()) {
            return this;
        }
        if (this == gVar) {
            return D();
        }
        org.spongycastle.math.ec.d h10 = h();
        C5985c c5985c = (C5985c) this.f62849b;
        C5985c c5985c2 = (C5985c) this.f62850c;
        C5985c c5985c3 = (C5985c) gVar.o();
        C5985c c5985c4 = (C5985c) gVar.p();
        C5985c c5985c5 = (C5985c) this.zs[0];
        C5985c c5985c6 = (C5985c) gVar.q(0);
        int[] e10 = pj.c.e();
        int[] c10 = pj.c.c();
        int[] c11 = pj.c.c();
        int[] c12 = pj.c.c();
        boolean h11 = c5985c5.h();
        if (h11) {
            iArr = c5985c3.f62780x;
            iArr2 = c5985c4.f62780x;
        } else {
            AbstractC5983b.j(c5985c5.f62780x, c11);
            AbstractC5983b.e(c11, c5985c3.f62780x, c10);
            AbstractC5983b.e(c11, c5985c5.f62780x, c11);
            AbstractC5983b.e(c11, c5985c4.f62780x, c11);
            iArr = c10;
            iArr2 = c11;
        }
        boolean h12 = c5985c6.h();
        if (h12) {
            iArr3 = c5985c.f62780x;
            iArr4 = c5985c2.f62780x;
        } else {
            AbstractC5983b.j(c5985c6.f62780x, c12);
            AbstractC5983b.e(c12, c5985c.f62780x, e10);
            AbstractC5983b.e(c12, c5985c6.f62780x, c12);
            AbstractC5983b.e(c12, c5985c2.f62780x, c12);
            iArr3 = e10;
            iArr4 = c12;
        }
        int[] c13 = pj.c.c();
        AbstractC5983b.m(iArr3, iArr, c13);
        AbstractC5983b.m(iArr4, iArr2, c10);
        if (pj.c.o(c13)) {
            return pj.c.o(c10) ? D() : h10.u();
        }
        AbstractC5983b.j(c13, c11);
        int[] c14 = pj.c.c();
        AbstractC5983b.e(c11, c13, c14);
        AbstractC5983b.e(c11, iArr3, c11);
        AbstractC5983b.g(c14, c14);
        pj.c.q(iArr4, c14, e10);
        AbstractC5983b.i(pj.c.b(c11, c11, c14), c14);
        C5985c c5985c7 = new C5985c(c12);
        AbstractC5983b.j(c10, c5985c7.f62780x);
        int[] iArr5 = c5985c7.f62780x;
        AbstractC5983b.m(iArr5, c14, iArr5);
        C5985c c5985c8 = new C5985c(c14);
        AbstractC5983b.m(c11, c5985c7.f62780x, c5985c8.f62780x);
        AbstractC5983b.f(c5985c8.f62780x, c10, e10);
        AbstractC5983b.h(e10, c5985c8.f62780x);
        C5985c c5985c9 = new C5985c(c13);
        if (!h11) {
            int[] iArr6 = c5985c9.f62780x;
            AbstractC5983b.e(iArr6, c5985c5.f62780x, iArr6);
        }
        if (!h12) {
            int[] iArr7 = c5985c9.f62780x;
            AbstractC5983b.e(iArr7, c5985c6.f62780x, iArr7);
        }
        return new C5987d(h10, c5985c7, c5985c8, new org.spongycastle.math.ec.e[]{c5985c9}, this.f62851d);
    }

    @Override // org.spongycastle.math.ec.g
    public org.spongycastle.math.ec.g u() {
        return r() ? this : new C5987d(this.f62848a, this.f62849b, this.f62850c.m(), this.zs, this.f62851d);
    }

    public C5987d(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, boolean z10) {
        super(dVar, eVar, eVar2);
        if ((eVar == null) != (eVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f62851d = z10;
    }

    public C5987d(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e[] eVarArr, boolean z10) {
        super(dVar, eVar, eVar2, eVarArr);
        this.f62851d = z10;
    }
}
