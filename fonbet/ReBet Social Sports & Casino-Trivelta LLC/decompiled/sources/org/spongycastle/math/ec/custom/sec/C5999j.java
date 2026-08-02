package org.spongycastle.math.ec.custom.sec;

import org.spongycastle.math.ec.g;

/* renamed from: org.spongycastle.math.ec.custom.sec.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5999j extends g.b {
    public C5999j(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2) {
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
        C5997i c5997i = (C5997i) this.f62850c;
        if (c5997i.i()) {
            return h10.u();
        }
        C5997i c5997i2 = (C5997i) this.f62849b;
        C5997i c5997i3 = (C5997i) this.zs[0];
        int[] c10 = pj.d.c();
        int[] c11 = pj.d.c();
        int[] c12 = pj.d.c();
        AbstractC5995h.i(c5997i.f62790x, c12);
        int[] c13 = pj.d.c();
        AbstractC5995h.i(c12, c13);
        boolean h11 = c5997i3.h();
        int[] iArr = c5997i3.f62790x;
        if (!h11) {
            AbstractC5995h.i(iArr, c11);
            iArr = c11;
        }
        AbstractC5995h.k(c5997i2.f62790x, iArr, c10);
        AbstractC5995h.a(c5997i2.f62790x, iArr, c11);
        AbstractC5995h.d(c11, c10, c11);
        AbstractC5995h.h(pj.d.b(c11, c11, c11), c11);
        AbstractC5995h.d(c12, c5997i2.f62790x, c12);
        AbstractC5995h.h(pj.m.F(5, c12, 2, 0), c12);
        AbstractC5995h.h(pj.m.G(5, c13, 3, 0, c10), c10);
        C5997i c5997i4 = new C5997i(c13);
        AbstractC5995h.i(c11, c5997i4.f62790x);
        int[] iArr2 = c5997i4.f62790x;
        AbstractC5995h.k(iArr2, c12, iArr2);
        int[] iArr3 = c5997i4.f62790x;
        AbstractC5995h.k(iArr3, c12, iArr3);
        C5997i c5997i5 = new C5997i(c12);
        AbstractC5995h.k(c12, c5997i4.f62790x, c5997i5.f62790x);
        int[] iArr4 = c5997i5.f62790x;
        AbstractC5995h.d(iArr4, c11, iArr4);
        int[] iArr5 = c5997i5.f62790x;
        AbstractC5995h.k(iArr5, c10, iArr5);
        C5997i c5997i6 = new C5997i(c11);
        AbstractC5995h.l(c5997i.f62790x, c5997i6.f62790x);
        if (!h11) {
            int[] iArr6 = c5997i6.f62790x;
            AbstractC5995h.d(iArr6, c5997i3.f62790x, iArr6);
        }
        return new C5999j(h10, c5997i4, c5997i5, new org.spongycastle.math.ec.e[]{c5997i6}, this.f62851d);
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
        C5997i c5997i = (C5997i) this.f62849b;
        C5997i c5997i2 = (C5997i) this.f62850c;
        C5997i c5997i3 = (C5997i) gVar.o();
        C5997i c5997i4 = (C5997i) gVar.p();
        C5997i c5997i5 = (C5997i) this.zs[0];
        C5997i c5997i6 = (C5997i) gVar.q(0);
        int[] d10 = pj.d.d();
        int[] c10 = pj.d.c();
        int[] c11 = pj.d.c();
        int[] c12 = pj.d.c();
        boolean h11 = c5997i5.h();
        if (h11) {
            iArr = c5997i3.f62790x;
            iArr2 = c5997i4.f62790x;
        } else {
            AbstractC5995h.i(c5997i5.f62790x, c11);
            AbstractC5995h.d(c11, c5997i3.f62790x, c10);
            AbstractC5995h.d(c11, c5997i5.f62790x, c11);
            AbstractC5995h.d(c11, c5997i4.f62790x, c11);
            iArr = c10;
            iArr2 = c11;
        }
        boolean h12 = c5997i6.h();
        if (h12) {
            iArr3 = c5997i.f62790x;
            iArr4 = c5997i2.f62790x;
        } else {
            AbstractC5995h.i(c5997i6.f62790x, c12);
            AbstractC5995h.d(c12, c5997i.f62790x, d10);
            AbstractC5995h.d(c12, c5997i6.f62790x, c12);
            AbstractC5995h.d(c12, c5997i2.f62790x, c12);
            iArr3 = d10;
            iArr4 = c12;
        }
        int[] c13 = pj.d.c();
        AbstractC5995h.k(iArr3, iArr, c13);
        AbstractC5995h.k(iArr4, iArr2, c10);
        if (pj.d.j(c13)) {
            return pj.d.j(c10) ? D() : h10.u();
        }
        AbstractC5995h.i(c13, c11);
        int[] c14 = pj.d.c();
        AbstractC5995h.d(c11, c13, c14);
        AbstractC5995h.d(c11, iArr3, c11);
        AbstractC5995h.f(c14, c14);
        pj.d.k(iArr4, c14, d10);
        AbstractC5995h.h(pj.d.b(c11, c11, c14), c14);
        C5997i c5997i7 = new C5997i(c12);
        AbstractC5995h.i(c10, c5997i7.f62790x);
        int[] iArr5 = c5997i7.f62790x;
        AbstractC5995h.k(iArr5, c14, iArr5);
        C5997i c5997i8 = new C5997i(c14);
        AbstractC5995h.k(c11, c5997i7.f62790x, c5997i8.f62790x);
        AbstractC5995h.e(c5997i8.f62790x, c10, d10);
        AbstractC5995h.g(d10, c5997i8.f62790x);
        C5997i c5997i9 = new C5997i(c13);
        if (!h11) {
            int[] iArr6 = c5997i9.f62790x;
            AbstractC5995h.d(iArr6, c5997i5.f62790x, iArr6);
        }
        if (!h12) {
            int[] iArr7 = c5997i9.f62790x;
            AbstractC5995h.d(iArr7, c5997i6.f62790x, iArr7);
        }
        return new C5999j(h10, c5997i7, c5997i8, new org.spongycastle.math.ec.e[]{c5997i9}, this.f62851d);
    }

    @Override // org.spongycastle.math.ec.g
    public org.spongycastle.math.ec.g u() {
        return r() ? this : new C5999j(this.f62848a, this.f62849b, this.f62850c.m(), this.zs, this.f62851d);
    }

    public C5999j(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, boolean z10) {
        super(dVar, eVar, eVar2);
        if ((eVar == null) != (eVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f62851d = z10;
    }

    public C5999j(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e[] eVarArr, boolean z10) {
        super(dVar, eVar, eVar2, eVarArr);
        this.f62851d = z10;
    }
}
