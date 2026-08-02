package androidx.compose.ui.node;

import androidx.compose.ui.node.g;
import androidx.compose.ui.node.k;
import androidx.compose.ui.node.o;
import androidx.compose.ui.node.p;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.a570;
import xsna.agi0;
import xsna.apx;
import xsna.asp;
import xsna.azl;
import xsna.bag;
import xsna.bif0;
import xsna.cgi0;
import xsna.ci50;
import xsna.cmb0;
import xsna.cp10;
import xsna.cri;
import xsna.dp10;
import xsna.dxt0;
import xsna.egi0;
import xsna.ep10;
import xsna.epx;
import xsna.fh50;
import xsna.fif0;
import xsna.foy;
import xsna.fvi;
import xsna.gzs;
import xsna.hvi;
import xsna.itl;
import xsna.k600;
import xsna.l590;
import xsna.lj70;
import xsna.m490;
import xsna.mdu;
import xsna.mnh0;
import xsna.nvi;
import xsna.o6j;
import xsna.ony;
import xsna.op4;
import xsna.pm0;
import xsna.poy;
import xsna.q630;
import xsna.qoy;
import xsna.roy;
import xsna.rut0;
import xsna.s3q0;
import xsna.soy;
import xsna.stf0;
import xsna.svi;
import xsna.t590;
import xsna.u470;
import xsna.uvi;
import xsna.uzw;
import xsna.v470;
import xsna.voy;
import xsna.wh50;
import xsna.woy;
import xsna.xd2;
import xsna.xfi0;
import xsna.ypi;
import xsna.yq9;
import xsna.ytl;
import xsna.z8v;
import xsna.zak0;
import xsna.zo10;
import xsna.zrp;

/* compiled from: LayoutNode.kt */
/* loaded from: classes11.dex */
public final class LayoutNode implements ypi, stf0, l590, foy, agi0, cri, p.a {
    public static final c S = new c("Undefined intrinsics block and it is required");
    public static final a T = a.i;
    public static final b U = new b();
    public static final poy V = new poy();
    public LayoutDirection A;
    public rut0 B;
    public svi C;
    public UsageByParent D;
    public UsageByParent E;
    public boolean F;
    public final u470 G;
    public final androidx.compose.ui.node.e H;
    public woy I;
    public o J;
    public boolean K;
    public q630 L;
    public q630 M;
    public xd2.e N;
    public xd2.f O;
    public boolean P;
    public int Q;
    public boolean R;
    public final boolean b;
    public int c;
    public boolean d;
    public long e;
    public boolean f;
    public boolean g;
    public boolean h;
    public LayoutNode i;
    public int j;
    public final lj70 k;
    public ci50<LayoutNode> l;
    public boolean m;
    public LayoutNode n;
    public p o;
    public dxt0 p;
    public int q;
    public boolean r;
    public boolean s;
    public xfi0 t;
    public boolean u;
    public final ci50<LayoutNode> v;
    public boolean w;
    public cp10 x;
    public op4 y;
    public azl z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LayoutNode.kt */
    public static final class LayoutState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LayoutState[] $VALUES;
        public static final LayoutState Idle;
        public static final LayoutState LayingOut;
        public static final LayoutState LookaheadLayingOut;
        public static final LayoutState LookaheadMeasuring;
        public static final LayoutState Measuring;

        static {
            LayoutState layoutState = new LayoutState("Measuring", 0);
            Measuring = layoutState;
            LayoutState layoutState2 = new LayoutState("LookaheadMeasuring", 1);
            LookaheadMeasuring = layoutState2;
            LayoutState layoutState3 = new LayoutState("LayingOut", 2);
            LayingOut = layoutState3;
            LayoutState layoutState4 = new LayoutState("LookaheadLayingOut", 3);
            LookaheadLayingOut = layoutState4;
            LayoutState layoutState5 = new LayoutState("Idle", 4);
            Idle = layoutState5;
            LayoutState[] layoutStateArr = {layoutState, layoutState2, layoutState3, layoutState4, layoutState5};
            $VALUES = layoutStateArr;
            $ENTRIES = new asp(layoutStateArr);
        }

        public LayoutState() {
            throw null;
        }

        public static LayoutState valueOf(String str) {
            return (LayoutState) Enum.valueOf(LayoutState.class, str);
        }

        public static LayoutState[] values() {
            return (LayoutState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LayoutNode.kt */
    public static final class UsageByParent {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ UsageByParent[] $VALUES;
        public static final UsageByParent InLayoutBlock;
        public static final UsageByParent InMeasureBlock;
        public static final UsageByParent NotUsed;

        static {
            UsageByParent usageByParent = new UsageByParent("InMeasureBlock", 0);
            InMeasureBlock = usageByParent;
            UsageByParent usageByParent2 = new UsageByParent("InLayoutBlock", 1);
            InLayoutBlock = usageByParent2;
            UsageByParent usageByParent3 = new UsageByParent("NotUsed", 2);
            NotUsed = usageByParent3;
            UsageByParent[] usageByParentArr = {usageByParent, usageByParent2, usageByParent3};
            $VALUES = usageByParentArr;
            $ENTRIES = new asp(usageByParentArr);
        }

        public UsageByParent() {
            throw null;
        }

        public static UsageByParent valueOf(String str) {
            return (UsageByParent) Enum.valueOf(UsageByParent.class, str);
        }

        public static UsageByParent[] values() {
            return (UsageByParent[]) $VALUES.clone();
        }
    }

    /* compiled from: LayoutNode.kt */
    public static final class a extends Lambda implements gzs<LayoutNode> {
        public static final a i = new a(0);

        @Override // xsna.gzs
        public final LayoutNode invoke() {
            return new LayoutNode(3);
        }
    }

    /* compiled from: LayoutNode.kt */
    public static final class b implements rut0 {
        @Override // xsna.rut0
        public final long b() {
            return 300L;
        }

        @Override // xsna.rut0
        public final long c() {
            return 400L;
        }

        @Override // xsna.rut0
        public final float e() {
            return 16.0f;
        }

        @Override // xsna.rut0
        public final long g() {
            return 0L;
        }
    }

    /* compiled from: LayoutNode.kt */
    public static final class c extends d {
        @Override // xsna.cp10
        public final dp10 b(ep10 ep10Var, List list, long j) {
            throw new IllegalStateException("Undefined measure and it is required");
        }
    }

    /* compiled from: LayoutNode.kt */
    public static abstract class d implements cp10 {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        @Override // xsna.cp10
        public final int c(apx apxVar, List list, int i) {
            throw new IllegalStateException(this.a.toString());
        }

        @Override // xsna.cp10
        public final int e(apx apxVar, List list, int i) {
            throw new IllegalStateException(this.a.toString());
        }

        @Override // xsna.cp10
        public final int f(apx apxVar, List list, int i) {
            throw new IllegalStateException(this.a.toString());
        }

        @Override // xsna.cp10
        public final int g(apx apxVar, List list, int i) {
            throw new IllegalStateException(this.a.toString());
        }
    }

    /* compiled from: LayoutNode.kt */
    public static final /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutState.values().length];
            try {
                iArr[LayoutState.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: LayoutNode.kt */
    public static final class f extends Lambda implements gzs<s3q0> {
        public f() {
            super(0);
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            androidx.compose.ui.node.e eVar = LayoutNode.this.H;
            eVar.p.B = true;
            g gVar = eVar.q;
            if (gVar != null) {
                gVar.v = true;
            }
            return s3q0.a;
        }
    }

    public LayoutNode() {
        this(3);
    }

    public static void d0(LayoutNode layoutNode, boolean z, int i) {
        LayoutNode I;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (layoutNode.i == null) {
            uzw.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        p pVar = layoutNode.o;
        if (pVar == null || layoutNode.r || layoutNode.b) {
            return;
        }
        pVar.x(layoutNode, true, z, z2);
        if (z3) {
            androidx.compose.ui.node.e eVar = layoutNode.H.q.g;
            LayoutNode I2 = eVar.a.I();
            UsageByParent usageByParent = eVar.a.D;
            if (I2 == null || usageByParent == UsageByParent.NotUsed) {
                return;
            }
            while (I2.D == usageByParent && (I = I2.I()) != null) {
                I2 = I;
            }
            int i2 = g.b.$EnumSwitchMapping$1[usageByParent.ordinal()];
            if (i2 == 1) {
                if (I2.i != null) {
                    d0(I2, z, 6);
                    return;
                } else {
                    f0(I2, z, 6);
                    return;
                }
            }
            if (i2 != 2) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (I2.i != null) {
                I2.c0(z);
            } else {
                I2.e0(z);
            }
        }
    }

    public static void f0(LayoutNode layoutNode, boolean z, int i) {
        p pVar;
        LayoutNode I;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (layoutNode.r || layoutNode.b || (pVar = layoutNode.o) == null) {
            return;
        }
        pVar.x(layoutNode, false, z, z2);
        if (z3) {
            androidx.compose.ui.node.e eVar = layoutNode.H.p.g;
            LayoutNode I2 = eVar.a.I();
            UsageByParent usageByParent = eVar.a.D;
            if (I2 == null || usageByParent == UsageByParent.NotUsed) {
                return;
            }
            while (I2.D == usageByParent && (I = I2.I()) != null) {
                I2 = I;
            }
            int i2 = k.a.$EnumSwitchMapping$1[usageByParent.ordinal()];
            if (i2 == 1) {
                f0(I2, z, 6);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                I2.e0(z);
            }
        }
    }

    public static void g0(LayoutNode layoutNode) {
        androidx.compose.ui.node.e eVar = layoutNode.H;
        if (e.$EnumSwitchMapping$0[eVar.d.ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + eVar.d);
        }
        if (eVar.e) {
            d0(layoutNode, true, 6);
            return;
        }
        if (eVar.f) {
            layoutNode.c0(true);
        }
        if (layoutNode.E()) {
            f0(layoutNode, true, 6);
        } else if (layoutNode.D()) {
            layoutNode.e0(true);
        }
    }

    private final String y(LayoutNode layoutNode) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(layoutNode);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(v(0));
        sb.append(" Other tree: ");
        LayoutNode layoutNode2 = layoutNode.n;
        sb.append(layoutNode2 != null ? layoutNode2.v(0) : null);
        return sb.toString();
    }

    public final List<zo10> A() {
        return this.H.p.x0();
    }

    public final List<LayoutNode> B() {
        return L().f();
    }

    public final List<LayoutNode> C() {
        return ((ci50) this.k.a).f();
    }

    public final boolean D() {
        return this.H.p.x;
    }

    public final boolean E() {
        return this.H.p.w;
    }

    public final UsageByParent F() {
        return this.H.p.m;
    }

    public final UsageByParent G() {
        UsageByParent usageByParent;
        g gVar = this.H.q;
        return (gVar == null || (usageByParent = gVar.k) == null) ? UsageByParent.NotUsed : usageByParent;
    }

    public final op4 H() {
        op4 op4Var = this.y;
        if (op4Var != null) {
            return op4Var;
        }
        op4 op4Var2 = new op4(this, this.x);
        this.y = op4Var2;
        return op4Var2;
    }

    public final LayoutNode I() {
        LayoutNode layoutNode = this.n;
        while (layoutNode != null && layoutNode.b) {
            layoutNode = layoutNode.n;
        }
        return layoutNode;
    }

    public final int J() {
        return this.H.p.j;
    }

    public final ci50<LayoutNode> K() {
        boolean z = this.w;
        ci50<LayoutNode> ci50Var = this.v;
        if (z) {
            ci50Var.g();
            ci50Var.d(ci50Var.d, L());
            Arrays.sort(ci50Var.b, 0, ci50Var.d, V);
            this.w = false;
        }
        return ci50Var;
    }

    public final ci50<LayoutNode> L() {
        n0();
        return this.j == 0 ? (ci50) this.k.a : this.l;
    }

    public final void M(long j, z8v z8vVar, int i, boolean z) {
        u470 u470Var = this.G;
        o oVar = u470Var.d;
        o.d dVar = o.R;
        u470Var.d.L1(o.W, oVar.v1(j), z8vVar, i, z);
    }

    public final void N(int i, LayoutNode layoutNode) {
        if (layoutNode.n != null && layoutNode.o != null) {
            uzw.b(y(layoutNode));
        }
        layoutNode.n = this;
        lj70 lj70Var = this.k;
        ((ci50) lj70Var.a).a(i, layoutNode);
        ((f) lj70Var.b).invoke();
        Y();
        if (layoutNode.b) {
            this.j++;
        }
        S();
        p pVar = this.o;
        if (pVar != null) {
            layoutNode.s(pVar);
        }
        if (layoutNode.H.l > 0) {
            androidx.compose.ui.node.e eVar = this.H;
            eVar.d(eVar.l + 1);
        }
        if (layoutNode.Q > 0) {
            k0(this.Q + 1);
        }
    }

    public final void O() {
        if (this.K) {
            u470 u470Var = this.G;
            o oVar = u470Var.c;
            o oVar2 = u470Var.d.u;
            this.J = null;
            while (true) {
                if (epx.f(oVar, oVar2)) {
                    break;
                }
                if ((oVar != null ? oVar.P : null) != null) {
                    this.J = oVar;
                    break;
                }
                oVar = oVar != null ? oVar.u : null;
            }
            this.K = false;
        }
        o oVar3 = this.J;
        if (oVar3 != null && oVar3.P == null) {
            throw pm0.f("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
        }
        if (oVar3 != null) {
            oVar3.P1();
            return;
        }
        LayoutNode I = I();
        if (I != null) {
            I.O();
            return;
        }
        p pVar = this.o;
        if (pVar != null) {
            pVar.c();
        }
    }

    public final void P() {
        u470 u470Var = this.G;
        o oVar = u470Var.d;
        androidx.compose.ui.node.c cVar = u470Var.c;
        while (oVar != cVar) {
            androidx.compose.ui.node.d dVar = (androidx.compose.ui.node.d) oVar;
            m490 m490Var = dVar.P;
            if (m490Var != null) {
                m490Var.invalidate();
            }
            oVar = dVar.t;
        }
        m490 m490Var2 = u470Var.c.P;
        if (m490Var2 != null) {
            m490Var2.invalidate();
        }
    }

    public final void Q() {
        if (this.b) {
            LayoutNode I = I();
            if (I != null) {
                I.Q();
                return;
            }
            return;
        }
        if (this.i != null) {
            d0(this, false, 7);
        } else {
            f0(this, false, 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, xsna.xfi0] */
    public final void R() {
        if (this.u) {
            return;
        }
        if (this.G.b.g != null || this.M != null) {
            this.s = true;
            return;
        }
        xfi0 xfi0Var = this.t;
        this.u = true;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = new xfi0();
        t590 snapshotObserver = voy.a(this).getSnapshotObserver();
        roy royVar = new roy(this, ref$ObjectRef);
        snapshotObserver.a.d(this, snapshotObserver.d, royVar);
        this.u = false;
        this.t = (xfi0) ref$ObjectRef.element;
        this.s = false;
        p a2 = voy.a(this);
        fh50<cgi0> fh50Var = a2.getSemanticsOwner().d;
        Object[] objArr = fh50Var.a;
        int i = fh50Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((cgi0) objArr[i2]).a(this, xfi0Var);
        }
        a2.v();
    }

    public final void S() {
        LayoutNode layoutNode;
        if (this.j > 0) {
            this.m = true;
        }
        if (!this.b || (layoutNode = this.n) == null) {
            return;
        }
        layoutNode.S();
    }

    public final Boolean T() {
        g gVar = this.H.q;
        if (gVar != null) {
            return Boolean.valueOf(gVar.s != g.a.IsNotPlaced);
        }
        return null;
    }

    public final void U() {
        LayoutNode I;
        if (this.D == UsageByParent.NotUsed) {
            u();
        }
        g gVar = this.H.q;
        gVar.getClass();
        boolean z = true;
        try {
            gVar.h = true;
            if (!gVar.m) {
                uzw.b("replace() called on item that was not placed");
            }
            gVar.D = false;
            if (gVar.s == g.a.IsNotPlaced) {
                z = false;
            }
            gVar.J0(gVar.p, gVar.q, gVar.r);
            if (z && !gVar.D && (I = gVar.g.a.I()) != null) {
                I.c0(false);
            }
            gVar.h = false;
        } catch (Throwable th) {
            gVar.h = false;
            throw th;
        }
    }

    public final void V(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            lj70 lj70Var = this.k;
            ci50 ci50Var = (ci50) lj70Var.a;
            f fVar = (f) lj70Var.b;
            Object k = ci50Var.k(i5);
            fVar.invoke();
            ((ci50) lj70Var.a).a(i6, (LayoutNode) k);
            fVar.invoke();
        }
        Y();
        S();
        Q();
    }

    public final void W(LayoutNode layoutNode) {
        if (layoutNode.H.l > 0) {
            this.H.d(r0.l - 1);
        }
        if (this.o != null) {
            layoutNode.w();
        }
        layoutNode.n = null;
        if (layoutNode.Q > 0) {
            k0(this.Q - 1);
        }
        layoutNode.G.d.u = null;
        if (layoutNode.b) {
            this.j--;
            ci50 ci50Var = (ci50) layoutNode.k.a;
            Object[] objArr = ci50Var.b;
            int i = ci50Var.d;
            for (int i2 = 0; i2 < i; i2++) {
                ((LayoutNode) objArr[i2]).G.d.u = null;
            }
        }
        S();
        Y();
    }

    public final void X(o oVar) {
        p pVar = this.o;
        fif0 rectManager = pVar != null ? pVar.getRectManager() : null;
        androidx.compose.ui.node.e eVar = this.H;
        int i = 0;
        boolean z = eVar.d != LayoutState.Idle || E() || D();
        if (this.h && rectManager != null) {
            if (oVar == this.G.d) {
                this.g = true;
                if (!z) {
                    rectManager.e(this);
                }
            } else {
                this.f = true;
                ci50<LayoutNode> L = L();
                LayoutNode[] layoutNodeArr = L.b;
                int i2 = L.d;
                for (int i3 = 0; i3 < i2; i3++) {
                    LayoutNode layoutNode = layoutNodeArr[i3];
                    layoutNode.g = true;
                    if (!z) {
                        rectManager.e(layoutNode);
                    }
                }
                if (this.h) {
                    rectManager.e = true;
                    bif0 bif0Var = rectManager.b;
                    int i4 = this.c & 33554431;
                    long[] jArr = (long[]) bif0Var.b;
                    int i5 = bif0Var.a;
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
                rectManager.h();
            }
        }
        eVar.p.N0();
    }

    public final void Y() {
        if (!this.b) {
            this.w = true;
            return;
        }
        LayoutNode I = I();
        if (I != null) {
            I.Y();
        }
    }

    public final void Z() {
        lj70 lj70Var = this.k;
        ci50 ci50Var = (ci50) lj70Var.a;
        ci50 ci50Var2 = (ci50) lj70Var.a;
        int i = ci50Var.d;
        while (true) {
            i--;
            if (-1 >= i) {
                ci50Var2.g();
                ((f) lj70Var.b).invoke();
                return;
            }
            W((LayoutNode) ci50Var2.b[i]);
        }
    }

    @Override // xsna.ypi
    public final void a() {
        dxt0 dxt0Var = this.p;
        if (dxt0Var != null) {
            dxt0Var.a();
        }
        woy woyVar = this.I;
        if (woyVar != null) {
            woyVar.a();
        }
        u470 u470Var = this.G;
        o oVar = u470Var.c.t;
        for (o oVar2 = u470Var.d; !epx.f(oVar2, oVar) && oVar2 != null; oVar2 = oVar2.t) {
            oVar2.W1();
        }
    }

    public final void a0(int i, int i2) {
        if (i2 < 0) {
            uzw.a("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            lj70 lj70Var = this.k;
            W((LayoutNode) ((ci50) lj70Var.a).b[i3]);
            Object k = ((ci50) lj70Var.a).k(i3);
            ((f) lj70Var.b).invoke();
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // xsna.cri
    public final void b(svi sviVar) {
        this.C = sviVar;
        j0((azl) sviVar.a(uvi.h));
        LayoutDirection layoutDirection = (LayoutDirection) sviVar.a(uvi.n);
        if (this.A != layoutDirection) {
            this.A = layoutDirection;
            Q();
            LayoutNode I = I();
            if (I != null) {
                I.O();
            } else {
                p pVar = this.o;
                if (pVar != null) {
                    pVar.c();
                }
            }
            P();
            for (q630.c cVar = this.G.f; cVar != null; cVar = cVar.g) {
                cVar.y1();
            }
        }
        m0((rut0) sviVar.a(uvi.t));
        q630.c cVar2 = this.G.f;
        if ((cVar2.e & 32768) != 0) {
            while (cVar2 != null) {
                if ((cVar2.d & 32768) != 0) {
                    ytl ytlVar = cVar2;
                    ?? r3 = 0;
                    while (ytlVar != 0) {
                        if (ytlVar instanceof nvi) {
                            q630.c z = ((nvi) ytlVar).z();
                            if (z.o) {
                                a570.c(z);
                            } else {
                                z.k = true;
                            }
                        } else if ((ytlVar.d & 32768) != 0 && (ytlVar instanceof ytl)) {
                            q630.c cVar3 = ytlVar.q;
                            int i = 0;
                            ytlVar = ytlVar;
                            r3 = r3;
                            while (cVar3 != null) {
                                if ((cVar3.d & 32768) != 0) {
                                    i++;
                                    r3 = r3;
                                    if (i == 1) {
                                        ytlVar = cVar3;
                                    } else {
                                        if (r3 == 0) {
                                            r3 = new ci50(new q630.c[16]);
                                        }
                                        if (ytlVar != 0) {
                                            r3.b(ytlVar);
                                            ytlVar = 0;
                                        }
                                        r3.b(cVar3);
                                    }
                                }
                                cVar3 = cVar3.g;
                                ytlVar = ytlVar;
                                r3 = r3;
                            }
                            if (i == 1) {
                            }
                        }
                        ytlVar = itl.b(r3);
                    }
                }
                if ((cVar2.e & 32768) == 0) {
                    return;
                } else {
                    cVar2 = cVar2.g;
                }
            }
        }
    }

    public final void b0() {
        LayoutNode I;
        if (this.D == UsageByParent.NotUsed) {
            u();
        }
        k kVar = this.H.p;
        androidx.compose.ui.node.e eVar = kVar.g;
        try {
            kVar.h = true;
            if (!kVar.l) {
                uzw.b("replace called on unplaced item");
            }
            boolean z = kVar.u;
            kVar.H0(kVar.o, kVar.r, kVar.p, kVar.q);
            if (z && !kVar.H && (I = eVar.a.I()) != null) {
                I.e0(false);
            }
        } finally {
        }
    }

    @Override // xsna.foy
    public final int c() {
        return this.c;
    }

    public final void c0(boolean z) {
        p pVar;
        if (this.b || (pVar = this.o) == null) {
            return;
        }
        pVar.y(this, true, z);
    }

    @Override // xsna.agi0
    public final xfi0 d() {
        if (e() && !this.R && this.G.d(8)) {
            return this.t;
        }
        return null;
    }

    @Override // xsna.l590
    public final boolean d1() {
        return e();
    }

    @Override // xsna.foy
    public final boolean e() {
        return this.o != null;
    }

    public final void e0(boolean z) {
        p pVar;
        if (this.b || (pVar = this.o) == null) {
            return;
        }
        pVar.y(this, false, z);
    }

    @Override // xsna.ypi
    public final void f() {
        fif0 rectManager;
        fif0 rectManager2;
        if (!e()) {
            uzw.a("onReuse is only expected on attached node");
        }
        dxt0 dxt0Var = this.p;
        if (dxt0Var != null) {
            dxt0Var.f();
        }
        woy woyVar = this.I;
        if (woyVar != null) {
            woyVar.i(false);
        }
        this.u = false;
        boolean z = this.R;
        u470 u470Var = this.G;
        if (z) {
            this.R = false;
        } else {
            q630.c cVar = u470Var.e;
            for (q630.c cVar2 = cVar; cVar2 != null; cVar2 = cVar2.f) {
                if (cVar2.o) {
                    cVar2.d2();
                }
            }
            for (q630.c cVar3 = cVar; cVar3 != null; cVar3 = cVar3.f) {
                if (cVar3.o) {
                    cVar3.f2();
                }
            }
            while (cVar != null) {
                if (cVar.o) {
                    cVar.Z1();
                }
                cVar = cVar.f;
            }
        }
        int i = this.c;
        p pVar = this.o;
        if (pVar != null && (rectManager2 = pVar.getRectManager()) != null) {
            rectManager2.f(this);
        }
        this.c = egi0.a.addAndGet(1);
        p pVar2 = this.o;
        if (pVar2 != null) {
            pVar2.n(i, this);
        }
        for (q630.c cVar4 = u470Var.f; cVar4 != null; cVar4 = cVar4.g) {
            cVar4.Y1();
        }
        u470Var.e();
        if (u470Var.d(8)) {
            R();
        }
        g0(this);
        p pVar3 = this.o;
        if (pVar3 != null) {
            pVar3.B(i, this);
        }
        p pVar4 = this.o;
        if (pVar4 == null || (rectManager = pVar4.getRectManager()) == null) {
            return;
        }
        rectManager.e(this);
    }

    @Override // xsna.foy
    public final boolean g() {
        return this.H.p.u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // androidx.compose.ui.node.p.a
    public final void h() {
        q630.c cVar;
        u470 u470Var = this.G;
        androidx.compose.ui.node.c cVar2 = u470Var.c;
        boolean g = a570.g(4194304);
        if (g) {
            cVar = cVar2.Y;
        } else {
            cVar = cVar2.Y.f;
            if (cVar == null) {
                return;
            }
        }
        o.d dVar = o.R;
        for (q630.c H1 = cVar2.H1(g); H1 != null && (H1.e & 4194304) != 0; H1 = H1.g) {
            if ((H1.d & 4194304) != 0) {
                ytl ytlVar = H1;
                ?? r6 = 0;
                while (ytlVar != 0) {
                    if (ytlVar instanceof ony) {
                        ((ony) ytlVar).s0(u470Var.c);
                    } else if ((ytlVar.d & 4194304) != 0 && (ytlVar instanceof ytl)) {
                        q630.c cVar3 = ytlVar.q;
                        int i = 0;
                        ytlVar = ytlVar;
                        r6 = r6;
                        while (cVar3 != null) {
                            if ((cVar3.d & 4194304) != 0) {
                                i++;
                                r6 = r6;
                                if (i == 1) {
                                    ytlVar = cVar3;
                                } else {
                                    if (r6 == 0) {
                                        r6 = new ci50(new q630.c[16]);
                                    }
                                    if (ytlVar != 0) {
                                        r6.b(ytlVar);
                                        ytlVar = 0;
                                    }
                                    r6.b(cVar3);
                                }
                            }
                            cVar3 = cVar3.g;
                            ytlVar = ytlVar;
                            r6 = r6;
                        }
                        if (i == 1) {
                        }
                    }
                    ytlVar = itl.b(r6);
                }
            }
            if (H1 == cVar) {
                return;
            }
        }
    }

    public final void h0() {
        ci50<LayoutNode> L = L();
        LayoutNode[] layoutNodeArr = L.b;
        int i = L.d;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = layoutNodeArr[i2];
            UsageByParent usageByParent = layoutNode.E;
            layoutNode.D = usageByParent;
            if (usageByParent != UsageByParent.NotUsed) {
                layoutNode.h0();
            }
        }
    }

    public final void i0(Throwable th) {
        fvi fviVar = (fvi) this.C.a(hvi.a);
        if (fviVar == null) {
            throw th;
        }
        fviVar.e(this, th);
        throw th;
    }

    @Override // xsna.ypi
    public final void j() {
        dxt0 dxt0Var = this.p;
        if (dxt0Var != null) {
            dxt0Var.j();
        }
        woy woyVar = this.I;
        if (woyVar != null) {
            woyVar.i(true);
        }
        this.R = true;
        q630.c cVar = this.G.e;
        for (q630.c cVar2 = cVar; cVar2 != null; cVar2 = cVar2.f) {
            if (cVar2.o) {
                cVar2.d2();
            }
        }
        for (q630.c cVar3 = cVar; cVar3 != null; cVar3 = cVar3.f) {
            if (cVar3.o) {
                cVar3.f2();
            }
        }
        while (cVar != null) {
            if (cVar.o) {
                cVar.Z1();
            }
            cVar = cVar.f;
        }
        if (e()) {
            this.t = null;
            this.s = false;
        }
        p pVar = this.o;
        if (pVar != null) {
            pVar.E(this);
        }
    }

    public final void j0(azl azlVar) {
        if (epx.f(this.z, azlVar)) {
            return;
        }
        this.z = azlVar;
        Q();
        LayoutNode I = I();
        if (I != null) {
            I.O();
        } else {
            p pVar = this.o;
            if (pVar != null) {
                pVar.c();
            }
        }
        P();
        for (q630.c cVar = this.G.f; cVar != null; cVar = cVar.g) {
            cVar.q();
        }
    }

    @Override // xsna.stf0
    public final void k() {
        if (this.i != null) {
            d0(this, false, 5);
        } else {
            f0(this, false, 5);
        }
        k kVar = this.H.p;
        o6j o6jVar = kVar.k ? new o6j(kVar.e) : null;
        if (o6jVar != null) {
            p pVar = this.o;
            if (pVar != null) {
                pVar.w(this, o6jVar.a);
                return;
            }
            return;
        }
        p pVar2 = this.o;
        if (pVar2 != null) {
            pVar2.a(true);
        }
    }

    public final void k0(int i) {
        LayoutNode I;
        LayoutNode I2;
        int i2 = this.Q;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (I2 = I()) != null) {
                I2.k0(I2.Q + 1);
            }
            if (i == 0 && this.Q > 0 && (I = I()) != null) {
                I.k0(I.Q - 1);
            }
            this.Q = i;
        }
    }

    @Override // xsna.agi0
    public final List<agi0> l() {
        return B();
    }

    public final void l0(LayoutNode layoutNode) {
        if (epx.f(layoutNode, this.i)) {
            return;
        }
        this.i = layoutNode;
        androidx.compose.ui.node.e eVar = this.H;
        if (layoutNode != null) {
            if (eVar.q == null) {
                eVar.q = new g(eVar);
            }
            u470 u470Var = this.G;
            o oVar = u470Var.c.t;
            for (o oVar2 = u470Var.d; !epx.f(oVar2, oVar) && oVar2 != null; oVar2 = oVar2.t) {
                oVar2.m1();
            }
        } else {
            eVar.q = null;
            eVar.f = false;
            eVar.e = false;
        }
        Q();
    }

    @Override // xsna.agi0
    public final boolean m() {
        return this.G.d.Q1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void m0(rut0 rut0Var) {
        if (epx.f(this.B, rut0Var)) {
            return;
        }
        this.B = rut0Var;
        q630.c cVar = this.G.f;
        if ((cVar.e & 16) != 0) {
            while (cVar != null) {
                if ((cVar.d & 16) != 0) {
                    ytl ytlVar = cVar;
                    ?? r3 = 0;
                    while (ytlVar != 0) {
                        if (ytlVar instanceof cmb0) {
                            ((cmb0) ytlVar).M0();
                        } else if ((ytlVar.d & 16) != 0 && (ytlVar instanceof ytl)) {
                            q630.c cVar2 = ytlVar.q;
                            int i = 0;
                            ytlVar = ytlVar;
                            r3 = r3;
                            while (cVar2 != null) {
                                if ((cVar2.d & 16) != 0) {
                                    i++;
                                    r3 = r3;
                                    if (i == 1) {
                                        ytlVar = cVar2;
                                    } else {
                                        if (r3 == 0) {
                                            r3 = new ci50(new q630.c[16]);
                                        }
                                        if (ytlVar != 0) {
                                            r3.b(ytlVar);
                                            ytlVar = 0;
                                        }
                                        r3.b(cVar2);
                                    }
                                }
                                cVar2 = cVar2.g;
                                ytlVar = ytlVar;
                                r3 = r3;
                            }
                            if (i == 1) {
                            }
                        }
                        ytlVar = itl.b(r3);
                    }
                }
                if ((cVar.e & 16) == 0) {
                    return;
                } else {
                    cVar = cVar.g;
                }
            }
        }
    }

    @Override // xsna.cri
    public final void n(cp10 cp10Var) {
        if (epx.f(this.x, cp10Var)) {
            return;
        }
        this.x = cp10Var;
        op4 op4Var = this.y;
        if (op4Var != null) {
            ((zak0) ((wh50) op4Var.b)).setValue(cp10Var);
        }
        Q();
    }

    public final void n0() {
        if (this.j <= 0 || !this.m) {
            return;
        }
        this.m = false;
        ci50<LayoutNode> ci50Var = this.l;
        if (ci50Var == null) {
            ci50Var = new ci50<>(new LayoutNode[16]);
            this.l = ci50Var;
        }
        ci50Var.g();
        ci50 ci50Var2 = (ci50) this.k.a;
        Object[] objArr = ci50Var2.b;
        int i = ci50Var2.d;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.b) {
                ci50Var.d(ci50Var.d, layoutNode.L());
            } else {
                ci50Var.b(layoutNode);
            }
        }
        androidx.compose.ui.node.e eVar = this.H;
        eVar.p.B = true;
        g gVar = eVar.q;
        if (gVar != null) {
            gVar.v = true;
        }
    }

    @Override // xsna.agi0
    public final LayoutNode o() {
        return I();
    }

    @Override // xsna.cri
    public final void p(q630 q630Var) {
        if (this.b && this.L != q630.a.a) {
            uzw.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.R) {
            uzw.a("modifier is updated when deactivated");
        }
        if (!e()) {
            this.M = q630Var;
            return;
        }
        r(q630Var);
        if (this.s) {
            R();
        }
    }

    @Override // xsna.foy
    public final boolean q() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v3, types: [androidx.compose.ui.node.o, xsna.q630$c] */
    public final void r(q630 q630Var) {
        ?? r7;
        u470 u470Var;
        u470.b bVar;
        ci50<q630.b> ci50Var;
        boolean z;
        boolean z2;
        boolean z3;
        ci50<q630.b> ci50Var2;
        boolean z4;
        v470 v470Var;
        u470 u470Var2 = this.G;
        boolean d2 = u470Var2.d(16);
        q630.c cVar = u470Var2.e;
        boolean d3 = u470Var2.d(1024);
        this.L = q630Var;
        androidx.compose.ui.node.c cVar2 = u470Var2.c;
        LayoutNode layoutNode = u470Var2.a;
        q630.c cVar3 = u470Var2.f;
        u470.b bVar2 = u470Var2.b;
        if (cVar3 == bVar2) {
            uzw.b("padChain called on already padded chain");
        }
        q630.c cVar4 = u470Var2.f;
        cVar4.f = bVar2;
        bVar2.g = cVar4;
        ci50<q630.b> ci50Var3 = u470Var2.g;
        int i = ci50Var3 != null ? ci50Var3.d : 0;
        ci50<q630.b> ci50Var4 = u470Var2.h;
        if (ci50Var4 == null) {
            ci50Var4 = new ci50<>(new q630.b[16]);
        }
        ci50<q630> ci50Var5 = u470Var2.i;
        ci50Var5.b(q630Var);
        v470 v470Var2 = null;
        while (true) {
            int i2 = ci50Var5.d;
            if (i2 == 0) {
                break;
            }
            q630 k = ci50Var5.k(i2 - 1);
            if (k instanceof bag) {
                bag bagVar = (bag) k;
                ci50Var5.b(bagVar.b);
                ci50Var5.b(bagVar.a);
            } else if (k instanceof q630.b) {
                ci50Var4.b(k);
            } else {
                if (v470Var2 == null) {
                    v470Var = new v470(ci50Var4);
                    v470Var2 = v470Var;
                } else {
                    v470Var = v470Var2;
                }
                k.b(v470Var);
            }
        }
        int i3 = ci50Var4.d;
        if (i3 == i) {
            q630.c cVar5 = bVar2.g;
            int i4 = 0;
            while (cVar5 != null && i4 < i) {
                if (ci50Var3 == null) {
                    throw pm0.f("expected prior modifier list to be non-empty");
                }
                q630.b bVar3 = ci50Var3.b[i4];
                q630.b bVar4 = ci50Var4.b[i4];
                if (epx.f(bVar3, bVar4)) {
                    ci50Var2 = ci50Var3;
                    z4 = 2;
                } else {
                    ci50Var2 = ci50Var3;
                    z4 = bVar3.getClass() == bVar4.getClass();
                }
                if (!z4) {
                    cVar5 = cVar5.f;
                    break;
                }
                if (z4) {
                    u470.h(bVar3, bVar4, cVar5);
                }
                cVar5 = cVar5.g;
                i4++;
                ci50Var3 = ci50Var2;
            }
            ci50Var2 = ci50Var3;
            if (i4 >= i) {
                u470Var2 = u470Var2;
                ci50Var3 = ci50Var2;
                z2 = false;
                u470Var = u470Var2;
                bVar = bVar2;
                ci50Var = ci50Var4;
                z = false;
                r7 = z2;
            } else {
                if (ci50Var2 == null) {
                    throw pm0.f("expected prior modifier list to be non-empty");
                }
                if (cVar5 == null) {
                    throw pm0.f("structuralUpdate requires a non-null tail");
                }
                boolean z5 = layoutNode.M != null;
                q630.c cVar6 = cVar5;
                u470Var = u470Var2;
                ci50Var = ci50Var4;
                ci50Var3 = ci50Var2;
                z3 = false;
                u470Var.f(i4, ci50Var3, ci50Var, cVar6, !z5);
                bVar = bVar2;
                z = true;
                r7 = z3;
            }
        } else {
            r7 = 0;
            z3 = false;
            z2 = false;
            q630 q630Var2 = layoutNode.M;
            if (q630Var2 != null && i == 0) {
                q630.c cVar7 = bVar2;
                for (int i5 = 0; i5 < ci50Var4.d; i5++) {
                    cVar7 = u470.b(ci50Var4.b[i5], cVar7);
                }
                int i6 = 0;
                for (q630.c cVar8 = cVar.f; cVar8 != null && cVar8 != bVar2; cVar8 = cVar8.f) {
                    i6 |= cVar8.d;
                    cVar8.e = i6;
                }
                u470Var = u470Var2;
                bVar = bVar2;
                ci50Var = ci50Var4;
                z = true;
                r7 = z3;
            } else if (i3 != 0) {
                if (ci50Var3 == null) {
                    ci50Var3 = new ci50<>(new q630.b[16]);
                }
                u470Var = u470Var2;
                bVar = bVar2;
                ci50Var = ci50Var4;
                u470Var.f(0, ci50Var3, ci50Var, bVar, !(q630Var2 != null));
                z = true;
            } else {
                if (ci50Var3 == null) {
                    throw pm0.f("expected prior modifier list to be non-empty");
                }
                q630.c cVar9 = bVar2.g;
                for (int i7 = 0; cVar9 != null && i7 < ci50Var3.d; i7++) {
                    cVar9 = u470.c(cVar9).g;
                }
                LayoutNode I = layoutNode.I();
                cVar2.u = I != null ? I.G.c : null;
                u470Var2.d = cVar2;
                u470Var = u470Var2;
                bVar = bVar2;
                ci50Var = ci50Var4;
                z = false;
                r7 = z2;
            }
        }
        u470Var.g = ci50Var;
        if (ci50Var3 != null) {
            ci50Var3.g();
        } else {
            ci50Var3 = r7;
        }
        u470Var.h = ci50Var3;
        q630.c cVar10 = bVar.g;
        if (cVar10 != null) {
            cVar = cVar10;
        }
        cVar.f = r7;
        bVar.g = r7;
        bVar.e = -1;
        bVar.i = r7;
        if (cVar == bVar) {
            uzw.b("trimChain did not update the head");
        }
        u470Var.f = cVar;
        if (z) {
            u470Var.g();
        }
        boolean d4 = u470Var.d(16);
        boolean d5 = u470Var.d(1024);
        this.H.j();
        if (this.i == null && u470Var.d(512)) {
            l0(this);
        }
        if (d2 == d4 && d3 == d5) {
            return;
        }
        fif0 rectManager = voy.a(this).getRectManager();
        rectManager.getClass();
        if (e()) {
            bif0 bif0Var = rectManager.b;
            int i8 = this.c & 33554431;
            long[] jArr = (long[]) bif0Var.b;
            int i9 = bif0Var.a;
            for (int i10 = 0; i10 < jArr.length - 2 && i10 < i9; i10 += 3) {
                int i11 = i10 + 2;
                long j = jArr[i11];
                if ((((int) j) & 33554431) == i8) {
                    jArr[i11] = ((d4 ? 1L : 0L) * 4611686018427387904L) | ((-6917529027641081857L) & j) | ((d5 ? 1L : 0L) * 2305843009213693952L);
                    return;
                }
            }
        }
    }

    public final void s(p pVar) {
        LayoutNode layoutNode;
        if (this.o != null) {
            uzw.b("Cannot attach " + this + " as it already is attached.  Tree: " + v(0));
        }
        LayoutNode layoutNode2 = this.n;
        if (layoutNode2 != null && !epx.f(layoutNode2.o, pVar)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(pVar);
            sb.append(") than the parent's owner(");
            LayoutNode I = I();
            sb.append(I != null ? I.o : null);
            sb.append("). This tree: ");
            sb.append(v(0));
            sb.append(" Parent tree: ");
            LayoutNode layoutNode3 = this.n;
            sb.append(layoutNode3 != null ? layoutNode3.v(0) : null);
            uzw.b(sb.toString());
        }
        LayoutNode I2 = I();
        androidx.compose.ui.node.e eVar = this.H;
        if (I2 == null) {
            eVar.p.u = true;
            pVar.getRectManager().e(this);
            g gVar = eVar.q;
            if (gVar != null) {
                gVar.s = g.a.IsPlacedInLookahead;
            }
        }
        u470 u470Var = this.G;
        u470Var.d.u = I2 != null ? I2.G.c : null;
        this.o = pVar;
        this.q = (I2 != null ? I2.q : -1) + 1;
        q630 q630Var = this.M;
        if (q630Var != null) {
            r(q630Var);
        }
        this.M = null;
        pVar.m(this);
        LayoutNode layoutNode4 = this.n;
        if (layoutNode4 == null || (layoutNode = layoutNode4.i) == null) {
            layoutNode = this.i;
        }
        l0(layoutNode);
        if (this.i == null && u470Var.d(512)) {
            l0(this);
        }
        if (!this.R) {
            for (q630.c cVar = u470Var.f; cVar != null; cVar = cVar.g) {
                cVar.Y1();
            }
        }
        ci50 ci50Var = (ci50) this.k.a;
        Object[] objArr = ci50Var.b;
        int i = ci50Var.d;
        for (int i2 = 0; i2 < i; i2++) {
            ((LayoutNode) objArr[i2]).s(pVar);
        }
        if (!this.R) {
            u470Var.e();
        }
        Q();
        if (I2 != null) {
            I2.Q();
        }
        xd2.e eVar2 = this.N;
        if (eVar2 != null) {
            eVar2.invoke(pVar);
        }
        eVar.j();
        if (!this.R && u470Var.d(8)) {
            R();
        }
        pVar.A(this);
    }

    public final void t() {
        this.E = this.D;
        this.D = UsageByParent.NotUsed;
        ci50<LayoutNode> L = L();
        LayoutNode[] layoutNodeArr = L.b;
        int i = L.d;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = layoutNodeArr[i2];
            if (layoutNode.D != UsageByParent.NotUsed) {
                layoutNode.t();
            }
        }
    }

    public final String toString() {
        return mnh0.z(this) + " children: " + ((ci50.a) B()).b.d + " measurePolicy: " + this.x + " deactivated: " + this.R;
    }

    public final void u() {
        this.E = this.D;
        this.D = UsageByParent.NotUsed;
        ci50<LayoutNode> L = L();
        LayoutNode[] layoutNodeArr = L.b;
        int i = L.d;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = layoutNodeArr[i2];
            if (layoutNode.D == UsageByParent.InLayoutBlock) {
                layoutNode.u();
            }
        }
    }

    public final String v(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        ci50<LayoutNode> L = L();
        LayoutNode[] layoutNodeArr = L.b;
        int i3 = L.d;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(layoutNodeArr[i4].v(i + 1));
        }
        String sb2 = sb.toString();
        return i == 0 ? qoy.c(1, 0, sb2) : sb2;
    }

    public final void w() {
        k600 k600Var;
        p pVar = this.o;
        if (pVar == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            LayoutNode I = I();
            sb.append(I != null ? I.v(0) : null);
            uzw.c(sb.toString());
            throw new KotlinNothingValueException();
        }
        LayoutNode I2 = I();
        androidx.compose.ui.node.e eVar = this.H;
        if (I2 != null) {
            I2.O();
            I2.Q();
            k kVar = eVar.p;
            UsageByParent usageByParent = UsageByParent.NotUsed;
            kVar.m = usageByParent;
            g gVar = eVar.q;
            if (gVar != null) {
                gVar.k = usageByParent;
            }
        }
        soy soyVar = eVar.p.z;
        soyVar.b = true;
        soyVar.c = false;
        soyVar.e = false;
        soyVar.d = false;
        soyVar.f = false;
        soyVar.g = false;
        soyVar.h = null;
        g gVar2 = eVar.q;
        if (gVar2 != null && (k600Var = gVar2.t) != null) {
            k600Var.b = true;
            k600Var.c = false;
            k600Var.e = false;
            k600Var.d = false;
            k600Var.f = false;
            k600Var.g = false;
            k600Var.h = null;
        }
        u470 u470Var = this.G;
        q630.c cVar = u470Var.e;
        o oVar = u470Var.c.t;
        for (o oVar2 = u470Var.d; !epx.f(oVar2, oVar) && oVar2 != null; oVar2 = oVar2.t) {
            oVar2.c2();
            if (oVar2.q.g()) {
                oVar2.X1();
            }
        }
        xd2.f fVar = this.O;
        if (fVar != null) {
            fVar.invoke(pVar);
        }
        for (q630.c cVar2 = cVar; cVar2 != null; cVar2 = cVar2.f) {
            if (cVar2.o) {
                cVar2.f2();
            }
        }
        this.r = true;
        ci50 ci50Var = (ci50) this.k.a;
        Object[] objArr = ci50Var.b;
        int i = ci50Var.d;
        for (int i2 = 0; i2 < i; i2++) {
            ((LayoutNode) objArr[i2]).w();
        }
        s3q0 s3q0Var = s3q0.a;
        this.r = false;
        while (cVar != null) {
            if (cVar.o) {
                cVar.Z1();
            }
            cVar = cVar.f;
        }
        pVar.C(this);
        pVar.getRectManager().f(this);
        this.o = null;
        l0(null);
        this.q = 0;
        k kVar2 = eVar.p;
        kVar2.j = Integer.MAX_VALUE;
        kVar2.i = Integer.MAX_VALUE;
        kVar2.u = false;
        g gVar3 = eVar.q;
        if (gVar3 != null) {
            gVar3.j = Integer.MAX_VALUE;
            gVar3.i = Integer.MAX_VALUE;
            gVar3.s = g.a.IsNotPlaced;
        }
        if (u470Var.d(8)) {
            xfi0 xfi0Var = this.t;
            this.t = null;
            this.s = false;
            fh50<cgi0> fh50Var = pVar.getSemanticsOwner().d;
            Object[] objArr2 = fh50Var.a;
            int i3 = fh50Var.b;
            for (int i4 = 0; i4 < i3; i4++) {
                ((cgi0) objArr2[i4]).a(this, xfi0Var);
            }
            pVar.v();
        }
    }

    public final void x(yq9 yq9Var, mdu mduVar) {
        try {
            this.G.d.i1(yq9Var, mduVar);
            s3q0 s3q0Var = s3q0.a;
        } catch (Throwable th) {
            i0(th);
            throw null;
        }
    }

    public final List<zo10> z() {
        g gVar = this.H.q;
        ci50<g> ci50Var = gVar.u;
        androidx.compose.ui.node.e eVar = gVar.g;
        eVar.a.B();
        if (!gVar.v) {
            return ci50Var.f();
        }
        LayoutNode layoutNode = eVar.a;
        ci50<LayoutNode> L = layoutNode.L();
        LayoutNode[] layoutNodeArr = L.b;
        int i = L.d;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = layoutNodeArr[i2];
            if (ci50Var.d <= i2) {
                ci50Var.b(layoutNode2.H.q);
            } else {
                g gVar2 = layoutNode2.H.q;
                g[] gVarArr = ci50Var.b;
                g gVar3 = gVarArr[i2];
                gVarArr[i2] = gVar2;
            }
        }
        ci50Var.l(((ci50.a) layoutNode.B()).b.d, ci50Var.d);
        gVar.v = false;
        return ci50Var.f();
    }

    public LayoutNode(int i) {
        this((i & 1) == 0, egi0.a.addAndGet(1));
    }

    public LayoutNode(boolean z, int i) {
        this.b = z;
        this.c = i;
        this.e = 9223372034707292159L;
        this.f = true;
        this.g = true;
        this.k = new lj70(new ci50(new LayoutNode[16]), new f());
        this.v = new ci50<>(new LayoutNode[16]);
        this.w = true;
        this.x = S;
        this.z = voy.a;
        this.A = LayoutDirection.Ltr;
        this.B = U;
        svi.i7.getClass();
        this.C = svi.a.b;
        UsageByParent usageByParent = UsageByParent.NotUsed;
        this.D = usageByParent;
        this.E = usageByParent;
        this.G = new u470(this);
        this.H = new androidx.compose.ui.node.e(this);
        this.K = true;
        this.L = q630.a.a;
    }

    @Override // xsna.cri
    public final void i(int i) {
    }
}
