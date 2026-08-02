package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class j1c extends qhe implements g1c, po, zvc {
    public boolean B;
    public float F;
    public boolean G;
    public Function1 H;
    public n29 I;
    public float K;
    public boolean M;
    public final ana f;
    public boolean g;
    public boolean j;
    public boolean k;
    public boolean m;
    public Function1 o;
    public n29 p;
    public float q;
    public Object s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int h = Integer.MAX_VALUE;
    public int i = Integer.MAX_VALUE;
    public uma l = uma.c;
    public long n = 0;
    public boolean r = true;
    public final xma y = new xma(this, 0);
    public final i1d z = new i1d(new j1c[16], 0);
    public boolean A = true;
    public long C = cn3.b(0, 0, 0, 0, 15);
    public final i1c D = new i1c(this, 1);
    public final i1c E = new i1c(this, 0);
    public long J = 0;
    public final i1c L = new i1c(this, 2);

    public j1c(ana anaVar) {
        this.f = anaVar;
    }

    @Override // defpackage.g1c
    public final int B(int i) {
        ana anaVar = this.f;
        if (!d7a.C(anaVar.a)) {
            r0();
            return anaVar.a().B(i);
        }
        zkb zkbVar = anaVar.q;
        zkbVar.getClass();
        return zkbVar.B(i);
    }

    @Override // defpackage.po
    public final int F() {
        return this.i;
    }

    @Override // defpackage.g1c
    public final int G(int i) {
        ana anaVar = this.f;
        if (!d7a.C(anaVar.a)) {
            r0();
            return anaVar.a().G(i);
        }
        zkb zkbVar = anaVar.q;
        zkbVar.getClass();
        return zkbVar.G(i);
    }

    @Override // defpackage.g1c
    public final qhe J(long j) {
        uma umaVar;
        ana anaVar = this.f;
        wma wmaVar = anaVar.a;
        wma wmaVar2 = anaVar.a;
        uma umaVar2 = wmaVar.C;
        uma umaVar3 = uma.c;
        if (umaVar2 == umaVar3) {
            wmaVar.d();
        }
        if (d7a.C(wmaVar2)) {
            zkb zkbVar = anaVar.q;
            zkbVar.getClass();
            zkbVar.j = umaVar3;
            zkbVar.J(j);
        }
        wma v = wmaVar2.v();
        if (v != null) {
            ana anaVar2 = v.G;
            if (this.l != umaVar3 && !wmaVar2.E) {
                r3a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int ordinal = anaVar2.d.ordinal();
            if (ordinal == 0) {
                umaVar = uma.a;
            } else {
                if (ordinal != 2) {
                    sw9.i(anaVar2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                umaVar = uma.b;
            }
            this.l = umaVar;
        } else {
            this.l = umaVar3;
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
            ooVar.invoke(((wma) objArr[i2]).G.p);
        }
    }

    @Override // defpackage.po
    public final void Q() {
        wma.V(this.f.a, false, 7);
    }

    @Override // defpackage.qhe
    public final int R(jo joVar) {
        ana anaVar = this.f;
        wma v = anaVar.a.v();
        sma smaVar = v != null ? v.G.d : null;
        sma smaVar2 = sma.a;
        xma xmaVar = this.y;
        if (smaVar == smaVar2) {
            xmaVar.c = true;
        } else {
            wma v2 = anaVar.a.v();
            if ((v2 != null ? v2.G.d : null) == sma.c) {
                xmaVar.d = true;
            }
        }
        this.m = true;
        int R = anaVar.a().R(joVar);
        this.m = false;
        return R;
    }

    @Override // defpackage.qhe
    public final int S() {
        return this.f.a().S();
    }

    @Override // defpackage.qhe
    public final int V() {
        return this.f.a().V();
    }

    @Override // defpackage.po
    public final xma a() {
        return this.y;
    }

    @Override // defpackage.qhe
    public final void a0(float f, long j, n29 n29Var) {
        x0(j, f, null, n29Var);
    }

    @Override // defpackage.g1c
    public final int b(int i) {
        ana anaVar = this.f;
        if (!d7a.C(anaVar.a)) {
            r0();
            return anaVar.a().b(i);
        }
        zkb zkbVar = anaVar.q;
        zkbVar.getClass();
        return zkbVar.b(i);
    }

    @Override // defpackage.qhe
    public final void b0(long j, float f, Function1 function1) {
        x0(j, f, function1, null);
    }

    @Override // defpackage.po
    public final po c() {
        ana anaVar;
        wma v = this.f.a.v();
        if (v == null || (anaVar = v.G) == null) {
            return null;
        }
        return anaVar.p;
    }

    @Override // defpackage.qhe, defpackage.g1c
    public final Object h() {
        return this.s;
    }

    @Override // defpackage.zvc
    public final void i(boolean z) {
        ana anaVar = this.f;
        if (z != anaVar.a().i) {
            anaVar.a().i = z;
            this.M = true;
        }
    }

    @Override // defpackage.po
    public final void k() {
        boolean z;
        this.B = true;
        xma xmaVar = this.y;
        xmaVar.h();
        boolean z2 = this.w;
        ana anaVar = this.f;
        if (z2) {
            i1d z3 = anaVar.a.z();
            Object[] objArr = z3.a;
            int i = z3.c;
            for (int i2 = 0; i2 < i; i2++) {
                wma wmaVar = (wma) objArr[i2];
                boolean r = wmaVar.r();
                ana anaVar2 = wmaVar.G;
                if (r && wmaVar.s() == uma.a) {
                    j1c j1cVar = anaVar2.p;
                    an3 an3Var = j1cVar.j ? new an3(j1cVar.d) : null;
                    if (an3Var != null) {
                        if (wmaVar.C == uma.c) {
                            wmaVar.d();
                        }
                        z = anaVar2.p.y0(an3Var.a);
                    } else {
                        z = false;
                    }
                    if (z) {
                        wma.V(anaVar.a, false, 7);
                    }
                }
            }
        }
        if (this.x || (!this.m && !y().k && this.w)) {
            this.w = false;
            sma smaVar = anaVar.d;
            anaVar.d = sma.c;
            anaVar.g(false);
            wma wmaVar2 = anaVar.a;
            uyd snapshotObserver = ((xy) zma.a(wmaVar2)).getSnapshotObserver();
            snapshotObserver.getClass();
            snapshotObserver.a.i(wmaVar2, s84.H, this.E);
            anaVar.d = smaVar;
            this.x = false;
        }
        if (xmaVar.d) {
            xmaVar.e = true;
        }
        if (xmaVar.b && xmaVar.e()) {
            xmaVar.g();
        }
        this.B = false;
    }

    public final List n0() {
        ana anaVar = this.f;
        anaVar.a.g0();
        boolean z = this.A;
        i1d i1dVar = this.z;
        if (!z) {
            return i1dVar.m();
        }
        wma wmaVar = anaVar.a;
        i1d z2 = wmaVar.z();
        Object[] objArr = z2.a;
        int i = z2.c;
        for (int i2 = 0; i2 < i; i2++) {
            wma wmaVar2 = (wma) objArr[i2];
            if (i1dVar.c <= i2) {
                i1dVar.b(wmaVar2.G.p);
            } else {
                j1c j1cVar = wmaVar2.G.p;
                Object[] objArr2 = i1dVar.a;
                Object obj = objArr2[i2];
                objArr2[i2] = j1cVar;
            }
        }
        i1dVar.s(((i1d) ((j0d) wmaVar.o()).b).c, i1dVar.c);
        this.A = false;
        return i1dVar.m();
    }

    public final void p0() {
        boolean z = this.t;
        this.t = true;
        ana anaVar = this.f;
        wma wmaVar = anaVar.a;
        c40 c40Var = wmaVar.F;
        if (!z) {
            ((z3a) c40Var.d).p1();
            ((xy) zma.a(wmaVar)).getRectManager().f(anaVar.a);
            if (wmaVar.r()) {
                wma.V(wmaVar, true, 6);
            } else if (wmaVar.G.e) {
                wma.T(wmaVar, true, 6);
            }
        }
        wdd wddVar = ((z3a) c40Var.d).p;
        for (wdd wddVar2 = (wdd) c40Var.e; !Intrinsics.c(wddVar2, wddVar) && wddVar2 != null; wddVar2 = wddVar2.p) {
            if (wddVar2.K) {
                wddVar2.l1();
            }
        }
        i1d z2 = wmaVar.z();
        Object[] objArr = z2.a;
        int i = z2.c;
        for (int i2 = 0; i2 < i; i2++) {
            wma wmaVar2 = (wma) objArr[i2];
            if (wmaVar2.w() != Integer.MAX_VALUE) {
                wmaVar2.G.p.p0();
                wma.W(wmaVar2);
            }
        }
    }

    public final void q0() {
        if (this.t) {
            this.t = false;
            ana anaVar = this.f;
            wma wmaVar = anaVar.a;
            wma wmaVar2 = anaVar.a;
            ((xy) zma.a(wmaVar)).getRectManager().g(wmaVar2);
            c40 c40Var = wmaVar2.F;
            wdd wddVar = ((z3a) c40Var.d).p;
            for (wdd wddVar2 = (wdd) c40Var.e; !Intrinsics.c(wddVar2, wddVar) && wddVar2 != null; wddVar2 = wddVar2.p) {
                wddVar2.r1();
                wddVar2.w1();
            }
            i1d z = wmaVar2.z();
            Object[] objArr = z.a;
            int i = z.c;
            for (int i2 = 0; i2 < i; i2++) {
                ((wma) objArr[i2]).G.p.q0();
            }
        }
    }

    public final void r0() {
        ana anaVar = this.f;
        wma.V(anaVar.a, false, 7);
        wma wmaVar = anaVar.a;
        wma v = wmaVar.v();
        if (v == null || wmaVar.C != uma.c) {
            return;
        }
        int ordinal = v.G.d.ordinal();
        wmaVar.C = ordinal != 0 ? ordinal != 2 ? v.C : uma.b : uma.a;
    }

    @Override // defpackage.po
    public final void requestLayout() {
        this.f.a.U(false);
    }

    @Override // defpackage.g1c
    public final int s(int i) {
        ana anaVar = this.f;
        if (!d7a.C(anaVar.a)) {
            r0();
            return anaVar.a().s(i);
        }
        zkb zkbVar = anaVar.q;
        zkbVar.getClass();
        return zkbVar.s(i);
    }

    public final void t0() {
        this.G = true;
        ana anaVar = this.f;
        wma v = anaVar.a.v();
        float f = y().A;
        wma wmaVar = anaVar.a;
        c40 c40Var = wmaVar.F;
        wdd wddVar = (wdd) c40Var.e;
        z3a z3aVar = (z3a) c40Var.d;
        while (wddVar != z3aVar) {
            wddVar.getClass();
            qma qmaVar = (qma) wddVar;
            f += qmaVar.A;
            wddVar = qmaVar.p;
        }
        if (f != this.F) {
            this.F = f;
            if (v != null) {
                v.O();
            }
            if (v != null) {
                v.C();
            }
        }
        if (!y().k) {
            boolean z = this.t;
            if (!z || this.y.d()) {
                p0();
            }
            if (z) {
                ((z3a) wmaVar.F.d).p1();
            } else {
                if (v != null) {
                    v.C();
                }
                if (this.g && v != null) {
                    v.U(false);
                }
            }
        }
        if (v != null) {
            ana anaVar2 = v.G;
            if (!this.g && anaVar2.d == sma.c) {
                if (this.i != Integer.MAX_VALUE) {
                    r3a.b("Place was called on a node which was placed already");
                }
                int i = anaVar2.i;
                this.i = i;
                anaVar2.i = i + 1;
            }
        } else {
            this.i = 0;
        }
        k();
    }

    public final void w0(long j, float f, Function1 function1, n29 n29Var) {
        ana anaVar = this.f;
        wma wmaVar = anaVar.a;
        wma wmaVar2 = anaVar.a;
        if (wmaVar.Q) {
            r3a.a("place is called on a deactivated node");
        }
        anaVar.d = sma.c;
        this.n = j;
        this.q = f;
        this.o = function1;
        this.p = n29Var;
        this.G = false;
        ryd a = zma.a(wmaVar2);
        if (this.w || !this.t) {
            this.y.g = false;
            anaVar.f(false);
            this.H = function1;
            this.J = j;
            this.K = f;
            this.I = n29Var;
            uyd snapshotObserver = ((xy) a).getSnapshotObserver();
            snapshotObserver.getClass();
            snapshotObserver.a.i(wmaVar2, s84.I, this.L);
        } else {
            wdd a2 = anaVar.a();
            a2.u1(r6a.d(j, a2.e), f, function1, n29Var);
            t0();
        }
        anaVar.d = sma.e;
        if (anaVar.a().k && (anaVar.k || anaVar.j)) {
            requestLayout();
        }
        this.k = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:10:0x002f, B:12:0x0033, B:14:0x003b, B:17:0x0044, B:18:0x0046, B:20:0x004a, B:22:0x0050, B:24:0x0058, B:25:0x0065, B:27:0x0070, B:28:0x0074, B:29:0x005b, B:30:0x0088, B:32:0x008c, B:34:0x0090, B:35:0x0095, B:39:0x001f, B:41:0x0023, B:43:0x0027, B:45:0x002b), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:10:0x002f, B:12:0x0033, B:14:0x003b, B:17:0x0044, B:18:0x0046, B:20:0x004a, B:22:0x0050, B:24:0x0058, B:25:0x0065, B:27:0x0070, B:28:0x0074, B:29:0x005b, B:30:0x0088, B:32:0x008c, B:34:0x0090, B:35:0x0095, B:39:0x001f, B:41:0x0023, B:43:0x0027, B:45:0x002b), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:10:0x002f, B:12:0x0033, B:14:0x003b, B:17:0x0044, B:18:0x0046, B:20:0x004a, B:22:0x0050, B:24:0x0058, B:25:0x0065, B:27:0x0070, B:28:0x0074, B:29:0x005b, B:30:0x0088, B:32:0x008c, B:34:0x0090, B:35:0x0095, B:39:0x001f, B:41:0x0023, B:43:0x0027, B:45:0x002b), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:10:0x002f, B:12:0x0033, B:14:0x003b, B:17:0x0044, B:18:0x0046, B:20:0x004a, B:22:0x0050, B:24:0x0058, B:25:0x0065, B:27:0x0070, B:28:0x0074, B:29:0x005b, B:30:0x0088, B:32:0x008c, B:34:0x0090, B:35:0x0095, B:39:0x001f, B:41:0x0023, B:43:0x0027, B:45:0x002b), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x0(long j, float f, Function1 function1, n29 n29Var) {
        zkb zkbVar;
        zkb zkbVar2;
        zkb zkbVar3;
        wma v;
        ana anaVar = this.f;
        wma wmaVar = anaVar.a;
        wma wmaVar2 = anaVar.a;
        try {
            this.u = true;
            if (r6a.b(j, this.n)) {
                if (function1 == this.o) {
                    if (this.M) {
                    }
                    zkbVar = anaVar.q;
                    if (zkbVar != null) {
                        ana anaVar2 = zkbVar.f;
                        if (zkbVar.r == xkb.c && !d7a.C(anaVar2.a)) {
                            anaVar2.c = true;
                        }
                    }
                    zkbVar2 = anaVar.q;
                    if (zkbVar2 != null && zkbVar2.n0()) {
                        wdd wddVar = anaVar.a().q;
                        phe placementScope = wddVar == null ? wddVar.l : ((xy) zma.a(wmaVar2)).getPlacementScope();
                        zkb zkbVar4 = anaVar.q;
                        zkbVar4.getClass();
                        v = wmaVar2.v();
                        if (v != null) {
                            v.G.h = 0;
                        }
                        zkbVar4.i = Integer.MAX_VALUE;
                        placementScope.e(zkbVar4, (int) (j >> 32), (int) (4294967295L & j), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    zkbVar3 = anaVar.q;
                    if (zkbVar3 != null && !zkbVar3.l) {
                        r3a.b("Error: Placement happened before lookahead.");
                    }
                    w0(j, f, function1, n29Var);
                    Unit unit = Unit.a;
                }
            }
            if (anaVar.k || anaVar.j || this.M) {
                this.w = true;
                this.M = false;
            }
            zkbVar = anaVar.q;
            if (zkbVar != null) {
            }
            zkbVar2 = anaVar.q;
            if (zkbVar2 != null) {
                wdd wddVar2 = anaVar.a().q;
                if (wddVar2 == null) {
                }
                zkb zkbVar42 = anaVar.q;
                zkbVar42.getClass();
                v = wmaVar2.v();
                if (v != null) {
                }
                zkbVar42.i = Integer.MAX_VALUE;
                placementScope.e(zkbVar42, (int) (j >> 32), (int) (4294967295L & j), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            zkbVar3 = anaVar.q;
            if (zkbVar3 != null) {
                r3a.b("Error: Placement happened before lookahead.");
            }
            w0(j, f, function1, n29Var);
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

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[Catch: all -> 0x0010, LOOP:0: B:22:0x0052->B:23:0x0054, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0045, B:23:0x0054, B:25:0x0065, B:28:0x007c, B:30:0x009e, B:31:0x00a4, B:33:0x00b0, B:35:0x00ba, B:39:0x00c6, B:41:0x0077), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0045, B:23:0x0054, B:25:0x0065, B:28:0x007c, B:30:0x009e, B:31:0x00a4, B:33:0x00b0, B:35:0x00ba, B:39:0x00c6, B:41:0x0077), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0045, B:23:0x0054, B:25:0x0065, B:28:0x007c, B:30:0x009e, B:31:0x00a4, B:33:0x00b0, B:35:0x00ba, B:39:0x00c6, B:41:0x0077), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean y0(long j) {
        boolean z;
        int i;
        int i2;
        long j2;
        sma smaVar;
        sma smaVar2;
        sma smaVar3;
        ana anaVar = this.f;
        wma wmaVar = anaVar.a;
        wma wmaVar2 = anaVar.a;
        try {
            if (wmaVar.Q) {
                r3a.a("measure is called on a deactivated node");
            }
            ryd a = zma.a(wmaVar2);
            wma v = wmaVar2.v();
            boolean z2 = true;
            if (!wmaVar2.E && (v == null || !v.E)) {
                z = false;
                wmaVar2.E = z;
                if (!wmaVar2.r() && an3.b(this.d, j)) {
                    ((xy) a).p(wmaVar2, false);
                    wmaVar2.X();
                    return false;
                }
                this.y.f = false;
                i1d z3 = wmaVar2.z();
                Object[] objArr = z3.a;
                i = z3.c;
                for (i2 = 0; i2 < i; i2++) {
                    ((wma) objArr[i2]).G.p.y.c = false;
                    Unit unit = Unit.a;
                }
                this.j = true;
                j2 = anaVar.a().c;
                m0(j);
                smaVar = anaVar.d;
                smaVar2 = sma.e;
                if (smaVar == smaVar2) {
                    r3a.b("layout state is not idle before measure starts");
                }
                this.C = j;
                smaVar3 = sma.a;
                anaVar.d = smaVar3;
                this.v = false;
                uyd snapshotObserver = ((xy) zma.a(wmaVar2)).getSnapshotObserver();
                i1c i1cVar = this.D;
                snapshotObserver.getClass();
                snapshotObserver.a.i(wmaVar2, s84.M, i1cVar);
                if (anaVar.d == smaVar3) {
                    this.w = true;
                    this.x = true;
                    anaVar.d = smaVar2;
                }
                if (c7a.a(anaVar.a().c, j2) && anaVar.a().a == this.a && anaVar.a().b == this.b) {
                    z2 = false;
                }
                i0((anaVar.a().b & 4294967295L) | (anaVar.a().a << 32));
                return z2;
            }
            z = true;
            wmaVar2.E = z;
            if (!wmaVar2.r()) {
                ((xy) a).p(wmaVar2, false);
                wmaVar2.X();
                return false;
            }
            this.y.f = false;
            i1d z32 = wmaVar2.z();
            Object[] objArr2 = z32.a;
            i = z32.c;
            while (i2 < i) {
            }
            this.j = true;
            j2 = anaVar.a().c;
            m0(j);
            smaVar = anaVar.d;
            smaVar2 = sma.e;
            if (smaVar == smaVar2) {
            }
            this.C = j;
            smaVar3 = sma.a;
            anaVar.d = smaVar3;
            this.v = false;
            uyd snapshotObserver2 = ((xy) zma.a(wmaVar2)).getSnapshotObserver();
            i1c i1cVar2 = this.D;
            snapshotObserver2.getClass();
            snapshotObserver2.a.i(wmaVar2, s84.M, i1cVar2);
            if (anaVar.d == smaVar3) {
            }
            if (c7a.a(anaVar.a().c, j2)) {
                z2 = false;
            }
            i0((anaVar.a().b & 4294967295L) | (anaVar.a().a << 32));
            return z2;
        } catch (Throwable th) {
            wmaVar.Y(th);
            throw null;
        }
    }

    public final void z0() {
        ana anaVar = this.f;
        wma wmaVar = anaVar.a;
        wma wmaVar2 = anaVar.a;
        if (!wmaVar.I() || anaVar.l <= 0) {
            return;
        }
        ana anaVar2 = wmaVar2.G;
        if ((anaVar2.j || anaVar2.k) && !anaVar2.p.w) {
            wmaVar2.U(false);
        }
        i1d z = wmaVar2.z();
        Object[] objArr = z.a;
        int i = z.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((wma) objArr[i2]).G.p.z0();
        }
    }
}
