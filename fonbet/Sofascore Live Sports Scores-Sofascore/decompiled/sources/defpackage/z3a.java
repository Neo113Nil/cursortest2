package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class z3a extends wdd {
    public static final gtj U;
    public final hti S;
    public y3a T;

    static {
        gtj n = yqo.n();
        int i = r13.j;
        n.v(r13.e);
        n.D(1.0f);
        n.E(1);
        U = n;
    }

    public z3a(wma wmaVar) {
        super(wmaVar);
        hti htiVar = new hti();
        htiVar.d = 0;
        this.S = htiVar;
        htiVar.h = this;
        this.T = wmaVar.h != null ? new y3a(this) : null;
    }

    @Override // defpackage.g1c
    public final int B(int i) {
        wj9 u = this.o.u();
        k1c u2 = u.u();
        wma wmaVar = (wma) u.b;
        return u2.h((wdd) wmaVar.F.e, wmaVar.n(), i);
    }

    @Override // defpackage.g1c
    public final int G(int i) {
        wj9 u = this.o.u();
        k1c u2 = u.u();
        wma wmaVar = (wma) u.b;
        return u2.a((wdd) wmaVar.F.e, wmaVar.n(), i);
    }

    @Override // defpackage.g1c
    public final qhe J(long j) {
        m0(j);
        wma wmaVar = this.o;
        i1d z = wmaVar.z();
        Object[] objArr = z.a;
        int i = z.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((wma) objArr[i2]).G.p.l = uma.c;
        }
        x1(wmaVar.w.d(this, wmaVar.n(), j));
        o1();
        return this;
    }

    @Override // defpackage.wdd
    public final void Z0() {
        if (this.T == null) {
            this.T = new y3a(this);
        }
    }

    @Override // defpackage.wdd, defpackage.qhe
    public final void a0(float f, long j, n29 n29Var) {
        u1(j, f, null, n29Var);
        if (this.j) {
            return;
        }
        this.o.G.p.t0();
    }

    @Override // defpackage.g1c
    public final int b(int i) {
        wj9 u = this.o.u();
        k1c u2 = u.u();
        wma wmaVar = (wma) u.b;
        return u2.i((wdd) wmaVar.F.e, wmaVar.n(), i);
    }

    @Override // defpackage.qhe
    public final void b0(long j, float f, Function1 function1) {
        u1(j, f, function1, null);
        if (this.j) {
            return;
        }
        this.o.G.p.t0();
    }

    @Override // defpackage.wdd
    public final vkb c1() {
        return this.T;
    }

    @Override // defpackage.wdd
    public final wtc e1() {
        return this.S;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    @Override // defpackage.wdd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k1(sdd sddVar, long j, jc9 jc9Var, int i, boolean z) {
        int i2;
        boolean z2;
        wma wmaVar = this.o;
        boolean z3 = false;
        if (sddVar.h(wmaVar)) {
            if (F1(j)) {
                i2 = i;
                z2 = z;
            } else {
                i2 = i;
                if (i2 == 1 && (Float.floatToRawIntBits(U0(j, d1())) & Integer.MAX_VALUE) < 2139095040) {
                    z2 = false;
                }
            }
            z3 = true;
            if (z3) {
                return;
            }
            int i3 = jc9Var.c;
            i1d y = wmaVar.y();
            Object[] objArr = y.a;
            int i4 = y.c - 1;
            while (i4 >= 0) {
                wma wmaVar2 = (wma) objArr[i4];
                if (wmaVar2.I()) {
                    sddVar.e(wmaVar2, j, jc9Var, i2, z2);
                    long c = jc9Var.c();
                    if (xw3.G(c) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && xw3.J(c) && !xw3.I(c) && !sddVar.f(jc9Var, wmaVar2)) {
                        break;
                    }
                }
                i4--;
                i2 = i;
            }
            jc9Var.c = i3;
            return;
        }
        i2 = i;
        z2 = z;
        if (z3) {
        }
    }

    @Override // defpackage.tkb
    public final int p0(jo joVar) {
        y3a y3aVar = this.T;
        if (y3aVar != null) {
            return y3aVar.p0(joVar);
        }
        j1c j1cVar = this.o.G.p;
        xma xmaVar = j1cVar.y;
        if (!j1cVar.m) {
            if (j1cVar.f.d == sma.a) {
                xmaVar.f = true;
                if (xmaVar.b) {
                    j1cVar.w = true;
                    j1cVar.x = true;
                }
            } else {
                xmaVar.g = true;
            }
        }
        z3a y = j1cVar.y();
        boolean z = y.k;
        y.k = true;
        j1cVar.k();
        y.k = z;
        Integer num = (Integer) xmaVar.i.get(joVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.g1c
    public final int s(int i) {
        wj9 u = this.o.u();
        k1c u2 = u.u();
        wma wmaVar = (wma) u.b;
        return u2.j((wdd) wmaVar.F.e, wmaVar.n(), i);
    }

    @Override // defpackage.wdd
    public final void t1(uj2 uj2Var, n29 n29Var) {
        wma wmaVar = this.o;
        ryd a = zma.a(wmaVar);
        i1d y = wmaVar.y();
        Object[] objArr = y.a;
        int i = y.c;
        for (int i2 = 0; i2 < i; i2++) {
            wma wmaVar2 = (wma) objArr[i2];
            if (wmaVar2.I()) {
                wmaVar2.j(uj2Var, n29Var);
            }
        }
        if (((xy) a).getShowLayoutBounds()) {
            long j = this.c;
            uj2Var.d(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, U);
        }
    }
}
