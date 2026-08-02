package m2;

import f2.C6404d;
import m2.d;

/* loaded from: classes8.dex */
public final class l extends m {
    @Override // m2.e
    public final void f(C6404d c6404d, boolean z11) {
        super.f(c6404d, z11);
        if (this.f74240w0 > 0) {
            e eVar = this.f74239v0[0];
            eVar.j0();
            eVar.f74135h0 = 0.5f;
            eVar.f74133g0 = 0.5f;
            d.a aVar = d.a.LEFT;
            eVar.i(aVar, this, aVar, 0);
            d.a aVar2 = d.a.RIGHT;
            eVar.i(aVar2, this, aVar2, 0);
            d.a aVar3 = d.a.TOP;
            eVar.i(aVar3, this, aVar3, 0);
            d.a aVar4 = d.a.BOTTOM;
            eVar.i(aVar4, this, aVar4, 0);
        }
    }

    @Override // m2.m
    public final void h1(int i11, int i12, int i13, int i14) {
        int e12 = e1() + f1();
        int g12 = g1() + d1();
        if (this.f74240w0 > 0) {
            e12 += this.f74239v0[0].N();
            g12 += this.f74239v0[0].v();
        }
        int max = Math.max(this.f74129e0, e12);
        int max2 = Math.max(this.f74131f0, g12);
        if (i11 != 1073741824) {
            i12 = i11 == Integer.MIN_VALUE ? Math.min(max, i12) : i11 == 0 ? max : 0;
        }
        if (i13 != 1073741824) {
            i14 = i13 == Integer.MIN_VALUE ? Math.min(max2, i14) : i13 == 0 ? max2 : 0;
        }
        l1(i12, i14);
        T0(i12);
        z0(i14);
        k1(this.f74240w0 > 0);
    }
}
