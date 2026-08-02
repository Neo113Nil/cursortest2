package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zkb extends qhe implements g1c, po, zvc {
    public boolean C;
    public final ana f;
    public boolean g;
    public boolean k;
    public boolean l;
    public boolean m;
    public an3 n;
    public Function1 p;
    public n29 q;
    public boolean v;
    public Object y;
    public int h = Integer.MAX_VALUE;
    public int i = Integer.MAX_VALUE;
    public uma j = uma.c;
    public long o = 0;
    public xkb r = xkb.c;
    public final xma s = new xma(this, 1);
    public final i1d t = new i1d(new zkb[16], 0);
    public boolean u = true;
    public final ykb w = new ykb(this, 0);
    public boolean x = true;
    public long z = cn3.b(0, 0, 0, 0, 15);
    public final ykb A = new ykb(this, 2);
    public final ykb B = new ykb(this, 1);

    public zkb(ana anaVar) {
        this.f = anaVar;
        this.y = anaVar.p.s;
    }

    @Override // defpackage.g1c
    public final int B(int i) {
        t0();
        vkb c1 = this.f.a().c1();
        c1.getClass();
        return c1.B(i);
    }

    @Override // defpackage.po
    public final int F() {
        return this.i;
    }

    @Override // defpackage.g1c
    public final int G(int i) {
        t0();
        vkb c1 = this.f.a().c1();
        c1.getClass();
        return c1.G(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if ((r2 != null ? r2.G.d : null) == defpackage.sma.d) goto L14;
     */
    @Override // defpackage.g1c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qhe J(long j) {
        uma umaVar;
        uma umaVar2 = uma.c;
        ana anaVar = this.f;
        wma wmaVar = anaVar.a;
        wma wmaVar2 = anaVar.a;
        wma v = wmaVar.v();
        if ((v != null ? v.G.d : null) != sma.b) {
            wma v2 = wmaVar2.v();
        }
        anaVar.b = false;
        wma v3 = wmaVar2.v();
        if (v3 != null) {
            ana anaVar2 = v3.G;
            if (this.j != umaVar2 && !wmaVar2.E) {
                r3a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int ordinal = anaVar2.d.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                umaVar = uma.a;
            } else {
                if (ordinal != 2 && ordinal != 3) {
                    sw9.i(anaVar2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                umaVar = uma.b;
            }
            this.j = umaVar;
        } else {
            this.j = umaVar2;
        }
        if (wmaVar2.C == umaVar2) {
            wmaVar2.d();
        }
        y0(j);
        return this;
    }

    @Override // defpackage.po
    public final void M(oo ooVar) {
        i1d z = this.f.a.z();
        Object[] objArr = z.a;
        int i = z.c;
        for (int i2 = 0; i2 < i; i2++) {
            zkb zkbVar = ((wma) objArr[i2]).G.q;
            zkbVar.getClass();
            ooVar.invoke(zkbVar);
        }
    }

    @Override // defpackage.po
    public final void Q() {
        wma.T(this.f.a, false, 7);
    }

    @Override // defpackage.qhe
    public final int R(jo joVar) {
        ana anaVar = this.f;
        wma v = anaVar.a.v();
        sma smaVar = v != null ? v.G.d : null;
        sma smaVar2 = sma.b;
        xma xmaVar = this.s;
        if (smaVar == smaVar2) {
            xmaVar.c = true;
        } else {
            wma v2 = anaVar.a.v();
            if ((v2 != null ? v2.G.d : null) == sma.d) {
                xmaVar.d = true;
            }
        }
        this.k = true;
        vkb c1 = anaVar.a().c1();
        c1.getClass();
        int R = c1.R(joVar);
        this.k = false;
        return R;
    }

    @Override // defpackage.qhe
    public final int S() {
        vkb c1 = this.f.a().c1();
        c1.getClass();
        return c1.S();
    }

    @Override // defpackage.qhe
    public final int V() {
        vkb c1 = this.f.a().c1();
        c1.getClass();
        return c1.V();
    }

    @Override // defpackage.po
    public final xma a() {
        return this.s;
    }

    @Override // defpackage.qhe
    public final void a0(float f, long j, n29 n29Var) {
        x0(j, n29Var, null);
    }

    @Override // defpackage.g1c
    public final int b(int i) {
        t0();
        vkb c1 = this.f.a().c1();
        c1.getClass();
        return c1.b(i);
    }

    @Override // defpackage.qhe
    public final void b0(long j, float f, Function1 function1) {
        x0(j, null, function1);
    }

    @Override // defpackage.po
    public final po c() {
        ana anaVar;
        wma v = this.f.a.v();
        if (v == null || (anaVar = v.G) == null) {
            return null;
        }
        return anaVar.q;
    }

    @Override // defpackage.qhe, defpackage.g1c
    public final Object h() {
        return this.y;
    }

    @Override // defpackage.zvc
    public final void i(boolean z) {
        vkb c1;
        ana anaVar = this.f;
        vkb c12 = anaVar.a().c1();
        if (Boolean.valueOf(z).equals(c12 != null ? Boolean.valueOf(c12.i) : null) || (c1 = anaVar.a().c1()) == null) {
            return;
        }
        c1.i = z;
    }

    @Override // defpackage.po
    public final void k() {
        this.v = true;
        xma xmaVar = this.s;
        xmaVar.h();
        ana anaVar = this.f;
        boolean z = anaVar.f;
        wma wmaVar = anaVar.a;
        if (z) {
            i1d z2 = wmaVar.z();
            Object[] objArr = z2.a;
            int i = z2.c;
            for (int i2 = 0; i2 < i; i2++) {
                wma wmaVar2 = (wma) objArr[i2];
                ana anaVar2 = wmaVar2.G;
                if (anaVar2.e && wmaVar2.t() == uma.a) {
                    zkb zkbVar = anaVar2.q;
                    zkbVar.getClass();
                    zkb zkbVar2 = anaVar2.q;
                    an3 an3Var = zkbVar2 != null ? zkbVar2.n : null;
                    an3Var.getClass();
                    if (zkbVar.y0(an3Var.a)) {
                        wma.T(wmaVar, false, 7);
                    }
                }
            }
        }
        y3a y3aVar = y().T;
        y3aVar.getClass();
        if (anaVar.g || (!this.k && !y3aVar.k && anaVar.f)) {
            anaVar.f = false;
            sma smaVar = anaVar.d;
            anaVar.d = sma.d;
            anaVar.i(false);
            uyd snapshotObserver = ((xy) zma.a(wmaVar)).getSnapshotObserver();
            snapshotObserver.getClass();
            snapshotObserver.a.i(wmaVar, s84.K, this.w);
            anaVar.d = smaVar;
            if (anaVar.m && y3aVar.k) {
                requestLayout();
            }
            anaVar.g = false;
        }
        if (xmaVar.d) {
            xmaVar.e = true;
        }
        if (xmaVar.b && xmaVar.e()) {
            xmaVar.g();
        }
        this.v = false;
    }

    public final boolean n0() {
        ana anaVar = this.f;
        return d7a.C(anaVar.a) || anaVar.c;
    }

    public final void p0(boolean z) {
        if (z && n0()) {
            return;
        }
        if (z || n0()) {
            this.r = xkb.c;
            i1d z2 = this.f.a.z();
            Object[] objArr = z2.a;
            int i = z2.c;
            for (int i2 = 0; i2 < i; i2++) {
                zkb zkbVar = ((wma) objArr[i2]).G.q;
                zkbVar.getClass();
                zkbVar.p0(true);
            }
        }
    }

    public final void q0() {
        xkb xkbVar = this.r;
        ana anaVar = this.f;
        boolean z = anaVar.c;
        wma wmaVar = anaVar.a;
        if (z) {
            this.r = xkb.b;
        } else {
            this.r = xkb.a;
        }
        if (xkbVar != xkb.a && anaVar.e) {
            wma.T(wmaVar, true, 6);
        }
        i1d z2 = wmaVar.z();
        Object[] objArr = z2.a;
        int i = z2.c;
        for (int i2 = 0; i2 < i; i2++) {
            wma wmaVar2 = (wma) objArr[i2];
            zkb zkbVar = wmaVar2.G.q;
            if (zkbVar == null) {
                a70.p("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (zkbVar.i != Integer.MAX_VALUE) {
                zkbVar.q0();
                wma.W(wmaVar2);
            }
        }
    }

    public final void r0() {
        ana anaVar = this.f;
        if (anaVar.o > 0) {
            i1d z = anaVar.a.z();
            Object[] objArr = z.a;
            int i = z.c;
            for (int i2 = 0; i2 < i; i2++) {
                wma wmaVar = (wma) objArr[i2];
                ana anaVar2 = wmaVar.G;
                if ((anaVar2.m || anaVar2.n) && !anaVar2.f) {
                    wmaVar.S(false);
                }
                zkb zkbVar = anaVar2.q;
                if (zkbVar != null) {
                    zkbVar.r0();
                }
            }
        }
    }

    @Override // defpackage.po
    public final void requestLayout() {
        this.f.a.S(false);
    }

    @Override // defpackage.g1c
    public final int s(int i) {
        t0();
        vkb c1 = this.f.a().c1();
        c1.getClass();
        return c1.s(i);
    }

    public final void t0() {
        ana anaVar = this.f;
        wma.T(anaVar.a, false, 7);
        wma wmaVar = anaVar.a;
        wma v = wmaVar.v();
        if (v == null || wmaVar.C != uma.c) {
            return;
        }
        int ordinal = v.G.d.ordinal();
        wmaVar.C = ordinal != 0 ? ordinal != 2 ? v.C : uma.b : uma.a;
    }

    public final void w0() {
        sma smaVar;
        this.C = true;
        ana anaVar = this.f;
        wma v = anaVar.a.v();
        xkb xkbVar = this.r;
        if ((xkbVar != xkb.a && !anaVar.c) || (xkbVar != xkb.b && anaVar.c)) {
            q0();
            if (this.g && v != null) {
                v.S(false);
            }
        }
        if (v != null) {
            ana anaVar2 = v.G;
            if (!this.g && ((smaVar = anaVar2.d) == sma.c || smaVar == sma.d)) {
                if (this.i != Integer.MAX_VALUE) {
                    r3a.b("Place was called on a node which was placed already");
                }
                int i = anaVar2.h;
                this.i = i;
                anaVar2.h = i + 1;
            }
        } else {
            this.i = 0;
        }
        k();
    }

    public final void x0(long j, n29 n29Var, Function1 function1) {
        ana anaVar = this.f;
        wma wmaVar = anaVar.a;
        wma wmaVar2 = anaVar.a;
        try {
            wma v = wmaVar.v();
            sma smaVar = v != null ? v.G.d : null;
            sma smaVar2 = sma.d;
            if (smaVar == smaVar2) {
                anaVar.c = false;
            }
            if (wmaVar2.Q) {
                r3a.a("place is called on a deactivated node");
            }
            anaVar.d = smaVar2;
            boolean z = true;
            this.l = true;
            this.C = false;
            if (!r6a.b(j, this.o)) {
                if (anaVar.n || anaVar.m) {
                    anaVar.f = true;
                }
                r0();
            }
            ryd a = zma.a(wmaVar2);
            this.o = j;
            if (!anaVar.f) {
                if (this.r == xkb.c) {
                    z = false;
                }
                if (z) {
                    vkb c1 = anaVar.a().c1();
                    c1.getClass();
                    c1.S0(r6a.d(j, c1.e));
                    w0();
                    this.p = function1;
                    this.q = n29Var;
                    anaVar.d = sma.e;
                    Unit unit = Unit.a;
                }
            }
            anaVar.h(false);
            this.s.g = false;
            uyd snapshotObserver = ((xy) a).getSnapshotObserver();
            ykb ykbVar = this.B;
            snapshotObserver.getClass();
            snapshotObserver.a.i(wmaVar2, s84.J, ykbVar);
            this.p = function1;
            this.q = n29Var;
            anaVar.d = sma.e;
            Unit unit2 = Unit.a;
        } catch (Throwable th) {
            wmaVar.Y(th);
            throw null;
        }
    }

    @Override // defpackage.po
    public final z3a y() {
        return (z3a) this.f.a.F.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0078, B:33:0x007c, B:34:0x0084, B:37:0x0096, B:39:0x00b3, B:43:0x0091), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064 A[Catch: all -> 0x0010, LOOP:0: B:28:0x0062->B:29:0x0064, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0078, B:33:0x007c, B:34:0x0084, B:37:0x0096, B:39:0x00b3, B:43:0x0091), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0078, B:33:0x007c, B:34:0x0084, B:37:0x0096, B:39:0x00b3, B:43:0x0091), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0091 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0078, B:33:0x007c, B:34:0x0084, B:37:0x0096, B:39:0x00b3, B:43:0x0091), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean y0(long j) {
        boolean z;
        int i;
        int i2;
        vkb c1;
        ana anaVar = this.f;
        wma wmaVar = anaVar.a;
        wma wmaVar2 = anaVar.a;
        try {
            if (wmaVar.Q) {
                r3a.a("measure is called on a deactivated node");
            }
            wma v = wmaVar2.v();
            if (!wmaVar2.E && (v == null || !v.E)) {
                z = false;
                wmaVar2.E = z;
                if (!wmaVar2.G.e) {
                    an3 an3Var = this.n;
                    if (an3Var == null ? false : an3.b(an3Var.a, j)) {
                        ryd rydVar = wmaVar2.n;
                        if (rydVar != null) {
                            ((xy) rydVar).p(wmaVar2, true);
                        }
                        wmaVar2.X();
                        return false;
                    }
                }
                this.n = new an3(j);
                m0(j);
                this.s.f = false;
                i1d z2 = wmaVar2.z();
                Object[] objArr = z2.a;
                i = z2.c;
                for (i2 = 0; i2 < i; i2++) {
                    zkb zkbVar = ((wma) objArr[i2]).G.q;
                    zkbVar.getClass();
                    zkbVar.s.c = false;
                    Unit unit = Unit.a;
                }
                long j2 = !this.m ? this.c : -9223372034707292160L;
                this.m = true;
                c1 = anaVar.a().c1();
                if (c1 != null) {
                    r3a.b("Lookahead result from lookaheadRemeasure cannot be null");
                }
                anaVar.c(j);
                i0((c1.a << 32) | (c1.b & 4294967295L));
                return ((int) (j2 >> 32)) == c1.a || ((int) (j2 & 4294967295L)) != c1.b;
            }
            z = true;
            wmaVar2.E = z;
            if (!wmaVar2.G.e) {
            }
            this.n = new an3(j);
            m0(j);
            this.s.f = false;
            i1d z22 = wmaVar2.z();
            Object[] objArr2 = z22.a;
            i = z22.c;
            while (i2 < i) {
            }
            if (!this.m) {
            }
            this.m = true;
            c1 = anaVar.a().c1();
            if (c1 != null) {
            }
            anaVar.c(j);
            i0((c1.a << 32) | (c1.b & 4294967295L));
            if (((int) (j2 >> 32)) == c1.a) {
            }
        } catch (Throwable th) {
            wmaVar.Y(th);
            throw null;
        }
    }
}
