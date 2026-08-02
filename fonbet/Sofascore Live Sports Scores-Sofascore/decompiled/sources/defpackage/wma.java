package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wma implements qe3, syd, if3 {
    public static final u6g R = new u6g("Undefined intrinsics block and it is required", 1);
    public static final rma S = new rma();
    public static final m39 T = new m39(4);
    public hsk A;
    public wg3 B;
    public uma C;
    public uma D;
    public boolean E;
    public final c40 F;
    public final ana G;
    public kna H;
    public wdd I;
    public boolean J;
    public xtc K;
    public xtc L;
    public u40 M;
    public v40 N;
    public boolean O;
    public int P;
    public boolean Q;
    public final boolean a;
    public int b;
    public boolean c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public wma h;
    public int i;
    public final k1d j;
    public i1d k;
    public boolean l;
    public wma m;
    public ryd n;
    public rsk o;
    public int p;
    public boolean q;
    public boolean r;
    public l3h s;
    public boolean t;
    public final i1d u;
    public boolean v;
    public k1c w;
    public wj9 x;
    public kx4 y;
    public ema z;

    public wma(boolean z, int i) {
        this.a = z;
        this.b = i;
        this.d = 9223372034707292159L;
        this.e = true;
        this.f = true;
        this.j = new k1d(0, new i1d(new wma[16], 0), new hv7(this, 11));
        this.u = new i1d(new wma[16], 0);
        this.v = true;
        this.w = R;
        this.y = zma.a;
        this.z = ema.a;
        this.A = S;
        wg3.l7.getClass();
        this.B = vg3.b;
        uma umaVar = uma.c;
        this.C = umaVar;
        this.D = umaVar;
        this.F = new c40(this);
        this.G = new ana(this);
        this.J = true;
        this.K = utc.a;
    }

    public static void T(wma wmaVar, boolean z, int i) {
        wma v;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (wmaVar.h == null) {
            r3a.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        ryd rydVar = wmaVar.n;
        if (rydVar == null || wmaVar.q || wmaVar.a) {
            return;
        }
        ((xy) rydVar).E(wmaVar, true, z, z2);
        if (z3) {
            zkb zkbVar = wmaVar.G.q;
            zkbVar.getClass();
            ana anaVar = zkbVar.f;
            wma v2 = anaVar.a.v();
            uma umaVar = anaVar.a.C;
            if (v2 == null || umaVar == uma.c) {
                return;
            }
            while (v2.C == umaVar && (v = v2.v()) != null) {
                v2 = v;
            }
            int ordinal = umaVar.ordinal();
            if (ordinal == 0) {
                if (v2.h != null) {
                    T(v2, z, 6);
                    return;
                } else {
                    V(v2, z, 6);
                    return;
                }
            }
            if (ordinal != 1) {
                a70.r("Intrinsics isn't used by the parent");
            } else if (v2.h != null) {
                v2.S(z);
            } else {
                v2.U(z);
            }
        }
    }

    public static void V(wma wmaVar, boolean z, int i) {
        ryd rydVar;
        wma v;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (wmaVar.q || wmaVar.a || (rydVar = wmaVar.n) == null) {
            return;
        }
        ((xy) rydVar).E(wmaVar, false, z, z2);
        if (z3) {
            ana anaVar = wmaVar.G.p.f;
            wma v2 = anaVar.a.v();
            uma umaVar = anaVar.a.C;
            if (v2 == null || umaVar == uma.c) {
                return;
            }
            while (v2.C == umaVar && (v = v2.v()) != null) {
                v2 = v;
            }
            int ordinal = umaVar.ordinal();
            if (ordinal == 0) {
                V(v2, z, 6);
            } else if (ordinal == 1) {
                v2.U(z);
            } else {
                a70.r("Intrinsics isn't used by the parent");
            }
        }
    }

    public static void W(wma wmaVar) {
        ana anaVar = wmaVar.G;
        if (vma.a[anaVar.d.ordinal()] != 1) {
            sw9.i(anaVar.d, "Unexpected state ");
            return;
        }
        if (anaVar.e) {
            T(wmaVar, true, 6);
            return;
        }
        if (anaVar.f) {
            wmaVar.S(true);
        }
        if (wmaVar.r()) {
            V(wmaVar, true, 6);
        } else if (wmaVar.q()) {
            wmaVar.U(true);
        }
    }

    private final String k(wma wmaVar) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(wmaVar);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(h(0));
        sb.append(" Other tree: ");
        wma wmaVar2 = wmaVar.m;
        sb.append(wmaVar2 != null ? wmaVar2.h(0) : null);
        return sb.toString();
    }

    public final void A(long j, jc9 jc9Var, int i, boolean z) {
        c40 c40Var = this.F;
        wdd wddVar = (wdd) c40Var.e;
        f4g f4gVar = wdd.N;
        ((wdd) c40Var.e).j1(wdd.Q, wddVar.b1(j), jc9Var, i, z);
    }

    public final void B(int i, wma wmaVar) {
        if (wmaVar.m != null && wmaVar.n != null) {
            r3a.b(k(wmaVar));
        }
        wmaVar.m = this;
        k1d k1dVar = this.j;
        ((i1d) k1dVar.b).a(i, wmaVar);
        ((hv7) k1dVar.c).invoke();
        O();
        if (wmaVar.a) {
            this.i++;
        }
        G();
        ryd rydVar = this.n;
        if (rydVar != null) {
            wmaVar.c(rydVar);
        }
        if (wmaVar.G.l > 0) {
            ana anaVar = this.G;
            anaVar.d(anaVar.l + 1);
        }
        if (wmaVar.P > 0) {
            b0(this.P + 1);
        }
    }

    public final void C() {
        if (this.J) {
            c40 c40Var = this.F;
            wdd wddVar = (z3a) c40Var.d;
            wdd wddVar2 = ((wdd) c40Var.e).q;
            this.I = null;
            while (true) {
                if (Intrinsics.c(wddVar, wddVar2)) {
                    break;
                }
                if ((wddVar != null ? wddVar.L : null) != null) {
                    this.I = wddVar;
                    break;
                }
                wddVar = wddVar != null ? wddVar.q : null;
            }
            this.J = false;
        }
        wdd wddVar3 = this.I;
        if (wddVar3 != null && wddVar3.L == null) {
            throw wt3.j("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
        }
        if (wddVar3 != null) {
            wddVar3.l1();
            return;
        }
        wma v = v();
        if (v != null) {
            v.C();
            return;
        }
        ryd rydVar = this.n;
        if (rydVar != null) {
            ((xy) rydVar).invalidate();
        }
    }

    public final void D() {
        c40 c40Var = this.F;
        wdd wddVar = (wdd) c40Var.e;
        z3a z3aVar = (z3a) c40Var.d;
        while (wddVar != z3aVar) {
            wddVar.getClass();
            qma qmaVar = (qma) wddVar;
            qyd qydVar = qmaVar.L;
            if (qydVar != null) {
                ((q29) qydVar).c();
            }
            wddVar = qmaVar.p;
        }
        qyd qydVar2 = z3aVar.L;
        if (qydVar2 != null) {
            ((q29) qydVar2).c();
        }
    }

    public final void E() {
        if (this.a) {
            wma v = v();
            if (v != null) {
                v.E();
                return;
            }
            return;
        }
        if (this.h != null) {
            T(this, false, 7);
        } else {
            V(this, false, 7);
        }
    }

    public final void F() {
        if (this.t) {
            return;
        }
        if (((qdd) this.F.c).f != null || this.L != null) {
            this.r = true;
            return;
        }
        l3h l3hVar = this.s;
        this.t = true;
        fsf fsfVar = new fsf();
        fsfVar.a = new l3h();
        uyd snapshotObserver = ((xy) zma.a(this)).getSnapshotObserver();
        z07 z07Var = new z07(26, this, fsfVar);
        snapshotObserver.getClass();
        snapshotObserver.a.i(this, tyd.j, z07Var);
        this.t = false;
        this.s = (l3h) fsfVar.a;
        this.r = false;
        xy xyVar = (xy) zma.a(this);
        xyVar.getSemanticsOwner().b(this, l3hVar);
        xyVar.G();
    }

    public final void G() {
        wma wmaVar;
        if (this.i > 0) {
            this.l = true;
        }
        if (!this.a || (wmaVar = this.m) == null) {
            return;
        }
        wmaVar.G();
    }

    public final boolean H() {
        return this.n != null;
    }

    public final boolean I() {
        return this.G.p.t;
    }

    public final Boolean J() {
        zkb zkbVar = this.G.q;
        if (zkbVar != null) {
            return Boolean.valueOf(zkbVar.r != xkb.c);
        }
        return null;
    }

    public final void K() {
        wma v;
        if (this.C == uma.c) {
            g();
        }
        zkb zkbVar = this.G.q;
        zkbVar.getClass();
        boolean z = true;
        try {
            zkbVar.g = true;
            if (!zkbVar.l) {
                r3a.b("replace() called on item that was not placed");
            }
            zkbVar.C = false;
            if (zkbVar.r == xkb.c) {
                z = false;
            }
            zkbVar.x0(zkbVar.o, zkbVar.q, zkbVar.p);
            if (z && !zkbVar.C && (v = zkbVar.f.a.v()) != null) {
                v.S(false);
            }
            zkbVar.g = false;
        } catch (Throwable th) {
            zkbVar.g = false;
            throw th;
        }
    }

    public final void L(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            k1d k1dVar = this.j;
            i1d i1dVar = (i1d) k1dVar.b;
            hv7 hv7Var = (hv7) k1dVar.c;
            Object r = i1dVar.r(i5);
            hv7Var.invoke();
            ((i1d) k1dVar.b).a(i6, (wma) r);
            hv7Var.invoke();
        }
        O();
        G();
        E();
    }

    public final void M(wma wmaVar) {
        if (wmaVar.G.l > 0) {
            this.G.d(r0.l - 1);
        }
        if (this.n != null) {
            wmaVar.i();
        }
        wmaVar.m = null;
        if (wmaVar.P > 0) {
            b0(this.P - 1);
        }
        ((wdd) wmaVar.F.e).q = null;
        if (wmaVar.a) {
            this.i--;
            i1d i1dVar = (i1d) wmaVar.j.b;
            Object[] objArr = i1dVar.a;
            int i = i1dVar.c;
            for (int i2 = 0; i2 < i; i2++) {
                ((wdd) ((wma) objArr[i2]).F.e).q = null;
            }
        }
        G();
        O();
    }

    public final void N(wdd wddVar) {
        ryd rydVar = this.n;
        qqf rectManager = rydVar != null ? ((xy) rydVar).getRectManager() : null;
        ana anaVar = this.G;
        int i = 0;
        boolean z = anaVar.d != sma.e || r() || q();
        if (this.g && rectManager != null) {
            if (wddVar == ((wdd) this.F.e)) {
                this.f = true;
                if (!z) {
                    rectManager.f(this);
                }
            } else {
                this.e = true;
                i1d z2 = z();
                Object[] objArr = z2.a;
                int i2 = z2.c;
                for (int i3 = 0; i3 < i2; i3++) {
                    wma wmaVar = (wma) objArr[i3];
                    wmaVar.f = true;
                    if (!z) {
                        rectManager.f(wmaVar);
                    }
                }
                if (this.g) {
                    rectManager.e = true;
                    b10 b10Var = rectManager.b;
                    int i4 = this.b & 33554431;
                    long[] jArr = (long[]) b10Var.c;
                    int i5 = b10Var.b;
                    while (true) {
                        if (i >= jArr.length - 2 || i >= i5) {
                            break;
                        }
                        int i6 = i + 2;
                        long j = jArr[i6];
                        if ((((int) j) & 33554431) == i4) {
                            jArr[i6] = (((j >> 63) & 1) << 60) | j;
                            break;
                        }
                        i += 3;
                    }
                }
                rectManager.i();
            }
        }
        anaVar.p.z0();
    }

    public final void O() {
        if (!this.a) {
            this.v = true;
            return;
        }
        wma v = v();
        if (v != null) {
            v.O();
        }
    }

    public final void P() {
        k1d k1dVar = this.j;
        int i = ((i1d) k1dVar.b).c;
        while (true) {
            i--;
            i1d i1dVar = (i1d) k1dVar.b;
            if (-1 >= i) {
                i1dVar.n();
                ((hv7) k1dVar.c).invoke();
                return;
            }
            M((wma) i1dVar.a[i]);
        }
    }

    public final void Q(int i, int i2) {
        if (i2 < 0) {
            r3a.a("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            k1d k1dVar = this.j;
            M((wma) ((i1d) k1dVar.b).a[i3]);
            Object r = ((i1d) k1dVar.b).r(i3);
            ((hv7) k1dVar.c).invoke();
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public final void R() {
        wma v;
        if (this.C == uma.c) {
            g();
        }
        j1c j1cVar = this.G.p;
        ana anaVar = j1cVar.f;
        try {
            j1cVar.g = true;
            if (!j1cVar.k) {
                r3a.b("replace called on unplaced item");
            }
            boolean z = j1cVar.t;
            j1cVar.w0(j1cVar.n, j1cVar.q, j1cVar.o, j1cVar.p);
            if (z && !j1cVar.G && (v = anaVar.a.v()) != null) {
                v.U(false);
            }
        } finally {
        }
    }

    public final void S(boolean z) {
        ryd rydVar;
        if (this.a || (rydVar = this.n) == null) {
            return;
        }
        ((xy) rydVar).F(this, true, z);
    }

    public final void U(boolean z) {
        ryd rydVar;
        if (this.a || (rydVar = this.n) == null) {
            return;
        }
        ((xy) rydVar).F(this, false, z);
    }

    public final void X() {
        i1d z = z();
        Object[] objArr = z.a;
        int i = z.c;
        for (int i2 = 0; i2 < i; i2++) {
            wma wmaVar = (wma) objArr[i2];
            uma umaVar = wmaVar.D;
            wmaVar.C = umaVar;
            if (umaVar != uma.c) {
                wmaVar.X();
            }
        }
    }

    public final void Y(Throwable th) {
        wg3 wg3Var = this.B;
        ff5 ff5Var = rg3.a;
        aee aeeVar = (aee) wg3Var;
        aeeVar.getClass();
        pg3 pg3Var = (pg3) ktm.I(aeeVar, ff5Var);
        if (pg3Var == null) {
            throw th;
        }
        u6h.W(th, new ix1(25, (qg3) pg3Var, this));
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [wtc] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [wtc] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [i1d] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [i1d] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final void Z(wg3 wg3Var) {
        this.B = wg3Var;
        ff5 ff5Var = dh3.h;
        aee aeeVar = (aee) wg3Var;
        aeeVar.getClass();
        a0((kx4) ktm.I(aeeVar, ff5Var));
        aee aeeVar2 = (aee) wg3Var;
        ema emaVar = (ema) ktm.I(aeeVar2, dh3.n);
        ema emaVar2 = this.z;
        c40 c40Var = this.F;
        if (emaVar2 != emaVar) {
            this.z = emaVar;
            E();
            wma v = v();
            if (v != null) {
                v.C();
            } else {
                ryd rydVar = this.n;
                if (rydVar != null) {
                    ((xy) rydVar).invalidate();
                }
            }
            D();
            for (wtc wtcVar = (wtc) c40Var.g; wtcVar != null; wtcVar = wtcVar.f) {
                wtcVar.S();
            }
        }
        f0((hsk) ktm.I(aeeVar2, dh3.t));
        wtc wtcVar2 = (wtc) c40Var.g;
        if ((wtcVar2.d & 32768) != 0) {
            while (wtcVar2 != null) {
                if ((wtcVar2.c & 32768) != 0) {
                    bw4 bw4Var = wtcVar2;
                    ?? r2 = 0;
                    while (bw4Var != 0) {
                        if (bw4Var instanceof ug3) {
                            wtc wtcVar3 = ((wtc) ((ug3) bw4Var)).a;
                            if (wtcVar3.n) {
                                xdd.c(wtcVar3);
                            } else {
                                wtcVar3.j = true;
                            }
                        } else if ((bw4Var.c & 32768) != 0 && (bw4Var instanceof bw4)) {
                            wtc wtcVar4 = bw4Var.p;
                            int i = 0;
                            bw4Var = bw4Var;
                            r2 = r2;
                            while (wtcVar4 != null) {
                                if ((wtcVar4.c & 32768) != 0) {
                                    i++;
                                    r2 = r2;
                                    if (i == 1) {
                                        bw4Var = wtcVar4;
                                    } else {
                                        if (r2 == 0) {
                                            r2 = new i1d(new wtc[16], 0);
                                        }
                                        if (bw4Var != 0) {
                                            r2.b(bw4Var);
                                            bw4Var = 0;
                                        }
                                        r2.b(wtcVar4);
                                    }
                                }
                                wtcVar4 = wtcVar4.f;
                                bw4Var = bw4Var;
                                r2 = r2;
                            }
                            if (i == 1) {
                            }
                        }
                        bw4Var = c6o.X(r2);
                    }
                }
                if ((wtcVar2.d & 32768) == 0) {
                    return;
                } else {
                    wtcVar2 = wtcVar2.f;
                }
            }
        }
    }

    @Override // defpackage.qe3
    public final void a() {
        tx txVar;
        rsk rskVar = this.o;
        if (rskVar != null) {
            rskVar.a();
        }
        kna knaVar = this.H;
        if (knaVar != null) {
            knaVar.j(true);
        }
        this.Q = true;
        wtc wtcVar = (hti) this.F.f;
        for (wtc wtcVar2 = wtcVar; wtcVar2 != null; wtcVar2 = wtcVar2.e) {
            if (wtcVar2.n) {
                wtcVar2.f1();
            }
        }
        for (wtc wtcVar3 = wtcVar; wtcVar3 != null; wtcVar3 = wtcVar3.e) {
            if (wtcVar3.n) {
                wtcVar3.h1();
            }
        }
        while (wtcVar != null) {
            if (wtcVar.n) {
                wtcVar.b1();
            }
            wtcVar = wtcVar.e;
        }
        if (H()) {
            this.s = null;
            this.r = false;
        }
        ryd rydVar = this.n;
        if (rydVar == null || (txVar = ((xy) rydVar).N) == null || !txVar.h.f(this.b)) {
            return;
        }
        txVar.a.E(txVar.c, this.b, false);
    }

    public final void a0(kx4 kx4Var) {
        if (Intrinsics.c(this.y, kx4Var)) {
            return;
        }
        this.y = kx4Var;
        E();
        wma v = v();
        if (v != null) {
            v.C();
        } else {
            ryd rydVar = this.n;
            if (rydVar != null) {
                ((xy) rydVar).invalidate();
            }
        }
        D();
        for (wtc wtcVar = (wtc) this.F.g; wtcVar != null; wtcVar = wtcVar.f) {
            wtcVar.l();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [int] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v3, types: [wdd, wtc] */
    public final void b(xtc xtcVar) {
        ?? r7;
        boolean z;
        i1d i1dVar;
        c40 c40Var;
        qdd qddVar;
        i1d i1dVar2;
        boolean z2;
        boolean z3;
        boolean z4;
        c40 c40Var2;
        boolean z5;
        oo ooVar;
        c40 c40Var3 = this.F;
        boolean n = c40Var3.n(16);
        wtc wtcVar = (hti) c40Var3.f;
        boolean n2 = c40Var3.n(1024);
        this.K = xtcVar;
        z3a z3aVar = (z3a) c40Var3.d;
        wma wmaVar = (wma) c40Var3.b;
        wtc wtcVar2 = (wtc) c40Var3.g;
        qdd qddVar2 = (qdd) c40Var3.c;
        if (wtcVar2 == qddVar2) {
            r3a.b("padChain called on already padded chain");
        }
        wtc wtcVar3 = (wtc) c40Var3.g;
        wtcVar3.e = qddVar2;
        qddVar2.f = wtcVar3;
        i1d i1dVar3 = (i1d) c40Var3.h;
        int i = i1dVar3 != null ? i1dVar3.c : 0;
        i1d i1dVar4 = (i1d) c40Var3.i;
        if (i1dVar4 == null) {
            i1dVar4 = new i1d(new vtc[16], 0);
        }
        i1d i1dVar5 = (i1d) c40Var3.j;
        i1dVar5.b(xtcVar);
        oo ooVar2 = null;
        while (true) {
            int i2 = i1dVar5.c;
            if (i2 == 0) {
                break;
            }
            xtc xtcVar2 = (xtc) i1dVar5.r(i2 - 1);
            if (xtcVar2 instanceof q33) {
                q33 q33Var = (q33) xtcVar2;
                i1dVar5.b(q33Var.b);
                i1dVar5.b(q33Var.a);
            } else if (xtcVar2 instanceof vtc) {
                i1dVar4.b(xtcVar2);
            } else {
                if (ooVar2 == null) {
                    ooVar = new oo(i1dVar4, 29);
                    ooVar2 = ooVar;
                } else {
                    ooVar = ooVar2;
                }
                xtcVar2.f(ooVar);
            }
        }
        int i3 = i1dVar4.c;
        if (i3 == i) {
            wtc wtcVar4 = qddVar2.f;
            c40 c40Var4 = c40Var3;
            int i4 = 0;
            while (wtcVar4 != null && i4 < i) {
                if (i1dVar3 == null) {
                    throw wt3.j("expected prior modifier list to be non-empty");
                }
                vtc vtcVar = (vtc) i1dVar3.a[i4];
                vtc vtcVar2 = (vtc) i1dVar4.a[i4];
                if (Intrinsics.c(vtcVar, vtcVar2)) {
                    c40Var2 = c40Var4;
                    z5 = 2;
                } else {
                    c40Var2 = c40Var4;
                    z5 = vtcVar.getClass() == vtcVar2.getClass();
                }
                if (!z5) {
                    wtcVar4 = wtcVar4.e;
                    break;
                }
                if (z5) {
                    c40.s(vtcVar, vtcVar2, wtcVar4);
                }
                wtcVar4 = wtcVar4.f;
                i4++;
                c40Var4 = c40Var2;
            }
            c40Var2 = c40Var4;
            if (i4 >= i) {
                c40Var3 = c40Var2;
                z3 = false;
                c40Var = c40Var3;
                i1dVar = i1dVar3;
                qddVar = qddVar2;
                i1dVar2 = i1dVar4;
                z = false;
                z2 = false;
                r7 = z3;
            } else {
                if (i1dVar3 == null) {
                    throw wt3.j("expected prior modifier list to be non-empty");
                }
                if (wtcVar4 == null) {
                    throw wt3.j("structuralUpdate requires a non-null tail");
                }
                boolean z6 = wmaVar.L != null;
                i1dVar = i1dVar3;
                i1dVar2 = i1dVar4;
                z4 = false;
                wtc wtcVar5 = wtcVar4;
                c40Var = c40Var2;
                c40Var.q(i4, i1dVar, i1dVar2, wtcVar5, !z6);
                qddVar = qddVar2;
                z = false;
                z2 = true;
                r7 = z4;
            }
        } else {
            r7 = 0;
            z4 = false;
            z3 = false;
            xtc xtcVar3 = wmaVar.L;
            if (xtcVar3 != null && i == 0) {
                wtc wtcVar6 = qddVar2;
                for (int i5 = 0; i5 < i1dVar4.c; i5++) {
                    wtcVar6 = c40.j((vtc) i1dVar4.a[i5], wtcVar6);
                }
                int i6 = 0;
                for (wtc wtcVar7 = wtcVar.e; wtcVar7 != null && wtcVar7 != qddVar2; wtcVar7 = wtcVar7.e) {
                    i6 |= wtcVar7.c;
                    wtcVar7.d = i6;
                }
                c40Var = c40Var3;
                i1dVar = i1dVar3;
                qddVar = qddVar2;
                i1dVar2 = i1dVar4;
                z = false;
                z2 = true;
                r7 = z4;
            } else if (i3 != 0) {
                if (i1dVar3 == null) {
                    z = false;
                    i1dVar3 = new i1d(new vtc[16], 0);
                } else {
                    z = false;
                }
                i1dVar = i1dVar3;
                c40Var = c40Var3;
                qddVar = qddVar2;
                i1dVar2 = i1dVar4;
                c40Var.q(0, i1dVar, i1dVar2, qddVar, !(xtcVar3 != null ? true : z));
                z2 = true;
            } else {
                if (i1dVar3 == null) {
                    throw wt3.j("expected prior modifier list to be non-empty");
                }
                wtc wtcVar8 = qddVar2.f;
                for (int i7 = 0; wtcVar8 != null && i7 < i1dVar3.c; i7++) {
                    wtcVar8 = c40.l(wtcVar8).f;
                }
                wma v = wmaVar.v();
                z3aVar.q = v != null ? (z3a) v.F.d : null;
                c40Var3.e = z3aVar;
                c40Var = c40Var3;
                i1dVar = i1dVar3;
                qddVar = qddVar2;
                i1dVar2 = i1dVar4;
                z = false;
                z2 = false;
                r7 = z3;
            }
        }
        c40Var.h = i1dVar2;
        if (i1dVar != null) {
            i1dVar.n();
        } else {
            i1dVar = r7;
        }
        c40Var.i = i1dVar;
        wtc wtcVar9 = qddVar.f;
        if (wtcVar9 != null) {
            wtcVar = wtcVar9;
        }
        wtcVar.e = r7;
        qddVar.f = r7;
        qddVar.d = -1;
        qddVar.h = r7;
        if (wtcVar == qddVar) {
            r3a.b("trimChain did not update the head");
        }
        c40Var.g = wtcVar;
        if (z2) {
            c40Var.r();
        }
        boolean n3 = c40Var.n(16);
        boolean n4 = c40Var.n(1024);
        this.G.j();
        if (this.h == null && c40Var.n(512)) {
            c0(this);
        }
        if (n == n3 && n2 == n4) {
            return;
        }
        qqf rectManager = ((xy) zma.a(this)).getRectManager();
        rectManager.getClass();
        if (H()) {
            b10 b10Var = rectManager.b;
            int i8 = this.b & 33554431;
            long[] jArr = (long[]) b10Var.c;
            int i9 = b10Var.b;
            for (?? r13 = z; r13 < jArr.length - 2 && r13 < i9; r13 += 3) {
                int i10 = r13 + 2;
                long j = jArr[i10];
                if ((((int) j) & 33554431) == i8) {
                    jArr[i10] = ((-6917529027641081857L) & j) | ((n4 ? 1L : 0L) * 2305843009213693952L) | ((n3 ? 1L : 0L) * 4611686018427387904L);
                    return;
                }
            }
        }
    }

    public final void b0(int i) {
        wma v;
        wma v2;
        int i2 = this.P;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (v2 = v()) != null) {
                v2.b0(v2.P + 1);
            }
            if (i == 0 && this.P > 0 && (v = v()) != null) {
                v.b0(v.P - 1);
            }
            this.P = i;
        }
    }

    public final void c(ryd rydVar) {
        wma wmaVar;
        l3h x;
        if (this.n != null) {
            r3a.b("Cannot attach " + this + " as it already is attached.  Tree: " + h(0));
        }
        wma wmaVar2 = this.m;
        if (wmaVar2 != null && !Intrinsics.c(wmaVar2.n, rydVar)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(rydVar);
            sb.append(") than the parent's owner(");
            wma v = v();
            sb.append(v != null ? v.n : null);
            sb.append("). This tree: ");
            sb.append(h(0));
            sb.append(" Parent tree: ");
            wma wmaVar3 = this.m;
            sb.append(wmaVar3 != null ? wmaVar3.h(0) : null);
            r3a.b(sb.toString());
        }
        wma v2 = v();
        ana anaVar = this.G;
        if (v2 == null) {
            anaVar.p.t = true;
            ((xy) rydVar).getRectManager().f(this);
            zkb zkbVar = anaVar.q;
            if (zkbVar != null) {
                zkbVar.r = xkb.a;
            }
        }
        c40 c40Var = this.F;
        ((wdd) c40Var.e).q = v2 != null ? (z3a) v2.F.d : null;
        this.n = rydVar;
        this.p = (v2 != null ? v2.p : -1) + 1;
        xtc xtcVar = this.L;
        if (xtcVar != null) {
            b(xtcVar);
        }
        this.L = null;
        ((xy) rydVar).getLayoutNodes().i(this.b, this);
        wma wmaVar4 = this.m;
        if (wmaVar4 == null || (wmaVar = wmaVar4.h) == null) {
            wmaVar = this.h;
        }
        c0(wmaVar);
        if (this.h == null && c40Var.n(512)) {
            c0(this);
        }
        if (!this.Q) {
            for (wtc wtcVar = (wtc) c40Var.g; wtcVar != null; wtcVar = wtcVar.f) {
                wtcVar.a1();
            }
        }
        i1d i1dVar = (i1d) this.j.b;
        Object[] objArr = i1dVar.a;
        int i = i1dVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((wma) objArr[i2]).c(rydVar);
        }
        if (!this.Q) {
            c40Var.p();
        }
        E();
        if (v2 != null) {
            v2.E();
        }
        u40 u40Var = this.M;
        if (u40Var != null) {
            u40Var.invoke(rydVar);
        }
        anaVar.j();
        if (!this.Q && c40Var.n(8)) {
            F();
        }
        tx txVar = ((xy) rydVar).N;
        if (txVar == null || (x = x()) == null || !x.a.b(w3h.r)) {
            return;
        }
        txVar.h.a(this.b);
        txVar.a.E(txVar.c, this.b, true);
    }

    public final void c0(wma wmaVar) {
        if (Intrinsics.c(wmaVar, this.h)) {
            return;
        }
        this.h = wmaVar;
        ana anaVar = this.G;
        if (wmaVar != null) {
            if (anaVar.q == null) {
                anaVar.q = new zkb(anaVar);
            }
            c40 c40Var = this.F;
            wdd wddVar = ((z3a) c40Var.d).p;
            for (wdd wddVar2 = (wdd) c40Var.e; !Intrinsics.c(wddVar2, wddVar) && wddVar2 != null; wddVar2 = wddVar2.p) {
                wddVar2.Z0();
            }
        } else {
            anaVar.q = null;
            anaVar.f = false;
            anaVar.e = false;
        }
        E();
    }

    public final void d() {
        this.D = this.C;
        this.C = uma.c;
        i1d z = z();
        Object[] objArr = z.a;
        int i = z.c;
        for (int i2 = 0; i2 < i; i2++) {
            wma wmaVar = (wma) objArr[i2];
            if (wmaVar.C != uma.c) {
                wmaVar.d();
            }
        }
    }

    public final void d0(k1c k1cVar) {
        if (Intrinsics.c(this.w, k1cVar)) {
            return;
        }
        this.w = k1cVar;
        wj9 wj9Var = this.x;
        if (wj9Var != null) {
            ((eoh) ((e1d) wj9Var.c)).setValue(k1cVar);
        }
        E();
    }

    @Override // defpackage.qe3
    public final void e() {
        qqf rectManager;
        tx txVar;
        qqf rectManager2;
        if (!H()) {
            r3a.a("onReuse is only expected on attached node");
        }
        rsk rskVar = this.o;
        if (rskVar != null) {
            rskVar.e();
        }
        kna knaVar = this.H;
        if (knaVar != null) {
            knaVar.j(false);
        }
        this.t = false;
        boolean z = this.Q;
        c40 c40Var = this.F;
        if (z) {
            this.Q = false;
        } else {
            wtc wtcVar = (hti) c40Var.f;
            for (wtc wtcVar2 = wtcVar; wtcVar2 != null; wtcVar2 = wtcVar2.e) {
                if (wtcVar2.n) {
                    wtcVar2.f1();
                }
            }
            for (wtc wtcVar3 = wtcVar; wtcVar3 != null; wtcVar3 = wtcVar3.e) {
                if (wtcVar3.n) {
                    wtcVar3.h1();
                }
            }
            while (wtcVar != null) {
                if (wtcVar.n) {
                    wtcVar.b1();
                }
                wtcVar = wtcVar.e;
            }
        }
        int i = this.b;
        ryd rydVar = this.n;
        if (rydVar != null && (rectManager2 = ((xy) rydVar).getRectManager()) != null) {
            rectManager2.g(this);
        }
        this.b = o3h.a.addAndGet(1);
        ryd rydVar2 = this.n;
        if (rydVar2 != null) {
            xy xyVar = (xy) rydVar2;
            xyVar.getLayoutNodes().g(i);
            xyVar.getLayoutNodes().i(this.b, this);
        }
        for (wtc wtcVar4 = (wtc) c40Var.g; wtcVar4 != null; wtcVar4 = wtcVar4.f) {
            wtcVar4.a1();
        }
        c40Var.p();
        if (c40Var.n(8)) {
            F();
        }
        W(this);
        ryd rydVar3 = this.n;
        if (rydVar3 != null && (txVar = ((xy) rydVar3).N) != null) {
            xy xyVar2 = txVar.c;
            cqa cqaVar = txVar.a;
            vzc vzcVar = txVar.h;
            if (vzcVar.f(i)) {
                cqaVar.E(xyVar2, i, false);
            }
            l3h x = x();
            if (x != null && x.a.b(w3h.r)) {
                vzcVar.a(this.b);
                cqaVar.E(xyVar2, this.b, true);
            }
        }
        ryd rydVar4 = this.n;
        if (rydVar4 == null || (rectManager = ((xy) rydVar4).getRectManager()) == null) {
            return;
        }
        rectManager.f(this);
    }

    public final void e0(xtc xtcVar) {
        if (this.a && this.K != utc.a) {
            r3a.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.Q) {
            r3a.a("modifier is updated when deactivated");
        }
        if (!H()) {
            this.L = xtcVar;
            return;
        }
        b(xtcVar);
        if (this.r) {
            F();
        }
    }

    @Override // defpackage.qe3
    public final void f() {
        rsk rskVar = this.o;
        if (rskVar != null) {
            rskVar.f();
        }
        kna knaVar = this.H;
        if (knaVar != null) {
            knaVar.f();
        }
        c40 c40Var = this.F;
        wdd wddVar = ((z3a) c40Var.d).p;
        for (wdd wddVar2 = (wdd) c40Var.e; !Intrinsics.c(wddVar2, wddVar) && wddVar2 != null; wddVar2 = wddVar2.p) {
            wddVar2.q1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [wtc] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [wtc] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [i1d] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [i1d] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final void f0(hsk hskVar) {
        if (Intrinsics.c(this.A, hskVar)) {
            return;
        }
        this.A = hskVar;
        wtc wtcVar = (wtc) this.F.g;
        if ((wtcVar.d & 16) != 0) {
            while (wtcVar != null) {
                if ((wtcVar.c & 16) != 0) {
                    bw4 bw4Var = wtcVar;
                    ?? r2 = 0;
                    while (bw4Var != 0) {
                        if (bw4Var instanceof pze) {
                            ((pze) bw4Var).S0();
                        } else if ((bw4Var.c & 16) != 0 && (bw4Var instanceof bw4)) {
                            wtc wtcVar2 = bw4Var.p;
                            int i = 0;
                            bw4Var = bw4Var;
                            r2 = r2;
                            while (wtcVar2 != null) {
                                if ((wtcVar2.c & 16) != 0) {
                                    i++;
                                    r2 = r2;
                                    if (i == 1) {
                                        bw4Var = wtcVar2;
                                    } else {
                                        if (r2 == 0) {
                                            r2 = new i1d(new wtc[16], 0);
                                        }
                                        if (bw4Var != 0) {
                                            r2.b(bw4Var);
                                            bw4Var = 0;
                                        }
                                        r2.b(wtcVar2);
                                    }
                                }
                                wtcVar2 = wtcVar2.f;
                                bw4Var = bw4Var;
                                r2 = r2;
                            }
                            if (i == 1) {
                            }
                        }
                        bw4Var = c6o.X(r2);
                    }
                }
                if ((wtcVar.d & 16) == 0) {
                    return;
                } else {
                    wtcVar = wtcVar.f;
                }
            }
        }
    }

    public final void g() {
        this.D = this.C;
        this.C = uma.c;
        i1d z = z();
        Object[] objArr = z.a;
        int i = z.c;
        for (int i2 = 0; i2 < i; i2++) {
            wma wmaVar = (wma) objArr[i2];
            if (wmaVar.C == uma.b) {
                wmaVar.g();
            }
        }
    }

    public final void g0() {
        if (this.i <= 0 || !this.l) {
            return;
        }
        this.l = false;
        i1d i1dVar = this.k;
        if (i1dVar == null) {
            i1dVar = new i1d(new wma[16], 0);
            this.k = i1dVar;
        }
        i1dVar.n();
        i1d i1dVar2 = (i1d) this.j.b;
        Object[] objArr = i1dVar2.a;
        int i = i1dVar2.c;
        for (int i2 = 0; i2 < i; i2++) {
            wma wmaVar = (wma) objArr[i2];
            if (wmaVar.a) {
                i1dVar.c(i1dVar.c, wmaVar.z());
            } else {
                i1dVar.b(wmaVar);
            }
        }
        ana anaVar = this.G;
        anaVar.p.A = true;
        zkb zkbVar = anaVar.q;
        if (zkbVar != null) {
            zkbVar.u = true;
        }
    }

    public final String h(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        i1d z = z();
        Object[] objArr = z.a;
        int i3 = z.c;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((wma) objArr[i4]).h(i + 1));
        }
        String sb2 = sb.toString();
        return i == 0 ? wv8.h(1, 0, sb2) : sb2;
    }

    public final void i() {
        xma xmaVar;
        ryd rydVar = this.n;
        if (rydVar == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            wma v = v();
            sb.append(v != null ? v.h(0) : null);
            r3a.c(sb.toString());
            pvd.x();
            return;
        }
        wma v2 = v();
        ana anaVar = this.G;
        if (v2 != null) {
            v2.C();
            v2.E();
            j1c j1cVar = anaVar.p;
            uma umaVar = uma.c;
            j1cVar.l = umaVar;
            zkb zkbVar = anaVar.q;
            if (zkbVar != null) {
                zkbVar.j = umaVar;
            }
        }
        xma xmaVar2 = anaVar.p.y;
        xmaVar2.b = true;
        xmaVar2.c = false;
        xmaVar2.e = false;
        xmaVar2.d = false;
        xmaVar2.f = false;
        xmaVar2.g = false;
        xmaVar2.h = null;
        zkb zkbVar2 = anaVar.q;
        if (zkbVar2 != null && (xmaVar = zkbVar2.s) != null) {
            xmaVar.b = true;
            xmaVar.c = false;
            xmaVar.e = false;
            xmaVar.d = false;
            xmaVar.f = false;
            xmaVar.g = false;
            xmaVar.h = null;
        }
        c40 c40Var = this.F;
        wtc wtcVar = (hti) c40Var.f;
        wdd wddVar = ((z3a) c40Var.d).p;
        for (wdd wddVar2 = (wdd) c40Var.e; !Intrinsics.c(wddVar2, wddVar) && wddVar2 != null; wddVar2 = wddVar2.p) {
            wddVar2.w1();
            if (wddVar2.o.I()) {
                wddVar2.r1();
            }
        }
        v40 v40Var = this.N;
        if (v40Var != null) {
            v40Var.invoke(rydVar);
        }
        for (wtc wtcVar2 = wtcVar; wtcVar2 != null; wtcVar2 = wtcVar2.e) {
            if (wtcVar2.n) {
                wtcVar2.h1();
            }
        }
        this.q = true;
        i1d i1dVar = (i1d) this.j.b;
        Object[] objArr = i1dVar.a;
        int i = i1dVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((wma) objArr[i2]).i();
        }
        Unit unit = Unit.a;
        this.q = false;
        while (wtcVar != null) {
            if (wtcVar.n) {
                wtcVar.b1();
            }
            wtcVar = wtcVar.e;
        }
        xy xyVar = (xy) rydVar;
        xyVar.getLayoutNodes().g(this.b);
        ux4 ux4Var = xyVar.W;
        hcc hccVar = (hcc) ux4Var.e;
        ((dad) hccVar.b).z(this);
        ((dad) hccVar.c).z(this);
        ((dad) hccVar.d).z(this);
        ((i1d) ((k1d) ux4Var.f).b).q(this);
        xyVar.O = true;
        tx txVar = xyVar.N;
        if (txVar != null && txVar.h.f(this.b)) {
            txVar.a.E(txVar.c, this.b, false);
        }
        xyVar.getRectManager().g(this);
        this.n = null;
        c0(null);
        this.p = 0;
        j1c j1cVar2 = anaVar.p;
        j1cVar2.i = Integer.MAX_VALUE;
        j1cVar2.h = Integer.MAX_VALUE;
        j1cVar2.t = false;
        zkb zkbVar3 = anaVar.q;
        if (zkbVar3 != null) {
            zkbVar3.i = Integer.MAX_VALUE;
            zkbVar3.h = Integer.MAX_VALUE;
            zkbVar3.r = xkb.c;
        }
        if (c40Var.n(8)) {
            l3h l3hVar = this.s;
            this.s = null;
            this.r = false;
            xyVar.getSemanticsOwner().b(this, l3hVar);
            xyVar.G();
        }
    }

    public final void j(uj2 uj2Var, n29 n29Var) {
        try {
            ((wdd) this.F.e).V0(uj2Var, n29Var);
            Unit unit = Unit.a;
        } catch (Throwable th) {
            this.Y(th);
            throw null;
        }
    }

    public final void l() {
        if (this.h != null) {
            T(this, false, 5);
        } else {
            V(this, false, 5);
        }
        j1c j1cVar = this.G.p;
        an3 an3Var = j1cVar.j ? new an3(j1cVar.d) : null;
        ryd rydVar = this.n;
        if (an3Var != null) {
            if (rydVar != null) {
                ((xy) rydVar).A(this, an3Var.a);
            }
        } else if (rydVar != null) {
            ((xy) rydVar).z(true);
        }
    }

    public final List m() {
        zkb zkbVar = this.G.q;
        zkbVar.getClass();
        i1d i1dVar = zkbVar.t;
        ana anaVar = zkbVar.f;
        anaVar.a.o();
        if (!zkbVar.u) {
            return i1dVar.m();
        }
        wma wmaVar = anaVar.a;
        i1d z = wmaVar.z();
        Object[] objArr = z.a;
        int i = z.c;
        for (int i2 = 0; i2 < i; i2++) {
            wma wmaVar2 = (wma) objArr[i2];
            if (i1dVar.c <= i2) {
                zkb zkbVar2 = wmaVar2.G.q;
                zkbVar2.getClass();
                i1dVar.b(zkbVar2);
            } else {
                zkb zkbVar3 = wmaVar2.G.q;
                zkbVar3.getClass();
                Object[] objArr2 = i1dVar.a;
                Object obj = objArr2[i2];
                objArr2[i2] = zkbVar3;
            }
        }
        i1dVar.s(((i1d) ((j0d) wmaVar.o()).b).c, i1dVar.c);
        zkbVar.u = false;
        return i1dVar.m();
    }

    public final List n() {
        return this.G.p.n0();
    }

    public final List o() {
        return z().m();
    }

    public final List p() {
        return ((i1d) this.j.b).m();
    }

    public final boolean q() {
        return this.G.p.w;
    }

    public final boolean r() {
        return this.G.p.v;
    }

    public final uma s() {
        return this.G.p.l;
    }

    public final uma t() {
        uma umaVar;
        zkb zkbVar = this.G.q;
        return (zkbVar == null || (umaVar = zkbVar.j) == null) ? uma.c : umaVar;
    }

    public final String toString() {
        return rha.C(this) + " children: " + ((i1d) ((j0d) o()).b).c + " measurePolicy: " + this.w + " deactivated: " + this.Q;
    }

    public final wj9 u() {
        wj9 wj9Var = this.x;
        if (wj9Var != null) {
            return wj9Var;
        }
        wj9 wj9Var2 = new wj9(this, this.w);
        this.x = wj9Var2;
        return wj9Var2;
    }

    @Override // defpackage.syd
    public final boolean u0() {
        return H();
    }

    public final wma v() {
        wma wmaVar = this.m;
        while (wmaVar != null && wmaVar.a) {
            wmaVar = wmaVar.m;
        }
        return wmaVar;
    }

    public final int w() {
        return this.G.p.i;
    }

    public final l3h x() {
        if (H() && !this.Q && this.F.n(8)) {
            return this.s;
        }
        return null;
    }

    public final i1d y() {
        boolean z = this.v;
        i1d i1dVar = this.u;
        if (z) {
            i1dVar.n();
            i1dVar.c(i1dVar.c, z());
            Arrays.sort(i1dVar.a, 0, i1dVar.c, T);
            this.v = false;
        }
        return i1dVar;
    }

    public final i1d z() {
        g0();
        if (this.i == 0) {
            return (i1d) this.j.b;
        }
        i1d i1dVar = this.k;
        i1dVar.getClass();
        return i1dVar;
    }

    public wma(int i) {
        this((i & 1) == 0, o3h.a.addAndGet(1));
    }
}
