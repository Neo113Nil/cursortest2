package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class y3a extends vkb {
    @Override // defpackage.g1c
    public final int B(int i) {
        wj9 u = this.o.o.u();
        k1c u2 = u.u();
        wma wmaVar = (wma) u.b;
        return u2.h((wdd) wmaVar.F.e, wmaVar.m(), i);
    }

    @Override // defpackage.g1c
    public final int G(int i) {
        wj9 u = this.o.o.u();
        k1c u2 = u.u();
        wma wmaVar = (wma) u.b;
        return u2.a((wdd) wmaVar.F.e, wmaVar.m(), i);
    }

    @Override // defpackage.g1c
    public final qhe J(long j) {
        m0(j);
        wdd wddVar = this.o;
        i1d z = wddVar.o.z();
        Object[] objArr = z.a;
        int i = z.c;
        for (int i2 = 0; i2 < i; i2++) {
            zkb zkbVar = ((wma) objArr[i2]).G.q;
            zkbVar.getClass();
            zkbVar.j = uma.c;
        }
        wma wmaVar = wddVar.o;
        U0(wmaVar.w.d(this, wmaVar.m(), j));
        return this;
    }

    @Override // defpackage.vkb
    public final void P0() {
        zkb zkbVar = this.o.o.G.q;
        zkbVar.getClass();
        zkbVar.w0();
    }

    @Override // defpackage.g1c
    public final int b(int i) {
        wj9 u = this.o.o.u();
        k1c u2 = u.u();
        wma wmaVar = (wma) u.b;
        return u2.i((wdd) wmaVar.F.e, wmaVar.m(), i);
    }

    @Override // defpackage.tkb
    public final int p0(jo joVar) {
        zkb zkbVar = this.o.o.G.q;
        zkbVar.getClass();
        xma xmaVar = zkbVar.s;
        if (!zkbVar.k) {
            ana anaVar = zkbVar.f;
            if (anaVar.d == sma.b) {
                xmaVar.f = true;
                if (xmaVar.b) {
                    anaVar.f = true;
                    anaVar.g = true;
                }
            } else {
                xmaVar.g = true;
            }
        }
        y3a y3aVar = zkbVar.y().T;
        if (y3aVar != null) {
            y3aVar.k = true;
        }
        zkbVar.k();
        y3a y3aVar2 = zkbVar.y().T;
        if (y3aVar2 != null) {
            y3aVar2.k = false;
        }
        Integer num = (Integer) xmaVar.i.get(joVar);
        int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.t.g(intValue, joVar);
        return intValue;
    }

    @Override // defpackage.g1c
    public final int s(int i) {
        wj9 u = this.o.o.u();
        k1c u2 = u.u();
        wma wmaVar = (wma) u.b;
        return u2.j((wdd) wmaVar.F.e, wmaVar.m(), i);
    }
}
