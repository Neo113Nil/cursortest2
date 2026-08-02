package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.g;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import xsna.ci50;
import xsna.epx;
import xsna.gt1;
import xsna.gzs;
import xsna.h9x;
import xsna.izs;
import xsna.jb30;
import xsna.jt1;
import xsna.kt1;
import xsna.mdu;
import xsna.o6j;
import xsna.q9x;
import xsna.s3q0;
import xsna.s6j;
import xsna.sdi;
import xsna.soy;
import xsna.t590;
import xsna.tdu;
import xsna.tra0;
import xsna.u470;
import xsna.uzw;
import xsna.voy;
import xsna.zo10;

/* compiled from: MeasurePassDelegate.kt */
/* loaded from: classes11.dex */
public final class k extends tra0 implements zo10, kt1, jb30 {
    public boolean C;
    public float G;
    public boolean H;
    public izs<? super tdu, s3q0> I;
    public mdu J;
    public float L;
    public boolean N;
    public final androidx.compose.ui.node.e g;
    public boolean h;
    public boolean k;
    public boolean l;
    public boolean n;
    public izs<? super tdu, s3q0> p;
    public mdu q;
    public float r;
    public Object t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int i = Integer.MAX_VALUE;
    public int j = Integer.MAX_VALUE;
    public LayoutNode.UsageByParent m = LayoutNode.UsageByParent.NotUsed;
    public long o = 0;
    public boolean s = true;
    public final soy z = new soy(this);
    public final ci50<k> A = new ci50<>(new k[16]);
    public boolean B = true;
    public long D = s6j.b(0, 0, 0, 0, 15);
    public final c E = new c();
    public final b F = new b();
    public long K = 0;
    public final d M = new d();

    /* compiled from: MeasurePassDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
            try {
                iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: MeasurePassDelegate.kt */
    public static final class b extends Lambda implements gzs<s3q0> {
        public b() {
            super(0);
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            androidx.compose.ui.node.e eVar = k.this.g;
            eVar.i = 0;
            ci50<LayoutNode> L = eVar.a.L();
            LayoutNode[] layoutNodeArr = L.b;
            int i = L.d;
            for (int i2 = 0; i2 < i; i2++) {
                k kVar = layoutNodeArr[i2].H.p;
                kVar.i = kVar.j;
                kVar.j = Integer.MAX_VALUE;
                kVar.v = false;
                if (kVar.m == LayoutNode.UsageByParent.InLayoutBlock) {
                    kVar.m = LayoutNode.UsageByParent.NotUsed;
                }
            }
            k.this.H(l.i);
            if (k.this.L().l) {
                List<LayoutNode> B = k.this.g.a.B();
                int size = B.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((LayoutNode) ((ci50.a) B).get(i3)).G.d.l = true;
                }
            }
            k.this.L().J0().j();
            if (k.this.L().l) {
                List<LayoutNode> B2 = k.this.g.a.B();
                int size2 = B2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((LayoutNode) ((ci50.a) B2).get(i4)).G.d.l = false;
                }
            }
            LayoutNode layoutNode = k.this.g.a;
            ci50<LayoutNode> L2 = layoutNode.L();
            LayoutNode[] layoutNodeArr2 = L2.b;
            int i5 = L2.d;
            for (int i6 = 0; i6 < i5; i6++) {
                LayoutNode layoutNode2 = layoutNodeArr2[i6];
                androidx.compose.ui.node.e eVar2 = layoutNode2.H;
                if (eVar2.p.i != layoutNode2.J()) {
                    layoutNode.Y();
                    layoutNode.O();
                    if (layoutNode2.J() == Integer.MAX_VALUE) {
                        if (eVar2.c || sdi.k(layoutNode2)) {
                            eVar2.q.y0(false);
                        }
                        eVar2.p.A0();
                    }
                }
            }
            k.this.H(m.i);
            return s3q0.a;
        }
    }

    /* compiled from: MeasurePassDelegate.kt */
    public static final class c extends Lambda implements gzs<s3q0> {
        public c() {
            super(0);
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            k.this.g.a().N(k.this.D);
            return s3q0.a;
        }
    }

    /* compiled from: MeasurePassDelegate.kt */
    public static final class d extends Lambda implements gzs<s3q0> {
        public d() {
            super(0);
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            tra0.a placementScope;
            o oVar = k.this.g.a().u;
            if (oVar == null || (placementScope = oVar.m) == null) {
                placementScope = voy.a(k.this.g.a).getPlacementScope();
            }
            k kVar = k.this;
            izs<? super tdu, s3q0> izsVar = kVar.I;
            androidx.compose.ui.node.e eVar = kVar.g;
            mdu mduVar = kVar.J;
            if (mduVar != null) {
                o a = eVar.a();
                long j = kVar.K;
                float f = kVar.L;
                placementScope.getClass();
                tra0.a.c(placementScope, a);
                a.q0(h9x.d(j, a.f), f, mduVar);
            } else if (izsVar == null) {
                o a2 = eVar.a();
                long j2 = kVar.K;
                float f2 = kVar.L;
                placementScope.getClass();
                tra0.a.c(placementScope, a2);
                a2.p0(h9x.d(j2, a2.f), f2, null);
            } else {
                o a3 = eVar.a();
                long j3 = kVar.K;
                float f3 = kVar.L;
                placementScope.getClass();
                tra0.a.c(placementScope, a3);
                a3.p0(h9x.d(j3, a3.f), f3, izsVar);
            }
            return s3q0.a;
        }
    }

    /* compiled from: MeasurePassDelegate.kt */
    public static final class e extends Lambda implements izs<kt1, s3q0> {
        public static final e i = new e(1);

        @Override // xsna.izs
        public final s3q0 invoke(kt1 kt1Var) {
            kt1Var.q().c = false;
            return s3q0.a;
        }
    }

    public k(androidx.compose.ui.node.e eVar) {
        this.g = eVar;
    }

    public final void A0() {
        if (this.u) {
            this.u = false;
            androidx.compose.ui.node.e eVar = this.g;
            LayoutNode layoutNode = eVar.a;
            LayoutNode layoutNode2 = eVar.a;
            voy.a(layoutNode).getRectManager().f(layoutNode2);
            u470 u470Var = layoutNode2.G;
            o oVar = u470Var.c.t;
            for (o oVar2 = u470Var.d; !epx.f(oVar2, oVar) && oVar2 != null; oVar2 = oVar2.t) {
                oVar2.X1();
                oVar2.c2();
            }
            ci50<LayoutNode> L = layoutNode2.L();
            LayoutNode[] layoutNodeArr = L.b;
            int i = L.d;
            for (int i2 = 0; i2 < i; i2++) {
                layoutNodeArr[i2].H.p.A0();
            }
        }
    }

    public final void E0() {
        androidx.compose.ui.node.e eVar = this.g;
        LayoutNode.f0(eVar.a, false, 7);
        LayoutNode layoutNode = eVar.a;
        LayoutNode I = layoutNode.I();
        if (I == null || layoutNode.D != LayoutNode.UsageByParent.NotUsed) {
            return;
        }
        int i = a.$EnumSwitchMapping$0[I.H.d.ordinal()];
        layoutNode.D = i != 1 ? i != 2 ? I.D : LayoutNode.UsageByParent.InLayoutBlock : LayoutNode.UsageByParent.InMeasureBlock;
    }

    public final void F0() {
        this.H = true;
        androidx.compose.ui.node.e eVar = this.g;
        LayoutNode I = eVar.a.I();
        float f = L().E;
        LayoutNode layoutNode = eVar.a;
        u470 u470Var = layoutNode.G;
        o oVar = u470Var.d;
        androidx.compose.ui.node.c cVar = u470Var.c;
        while (oVar != cVar) {
            androidx.compose.ui.node.d dVar = (androidx.compose.ui.node.d) oVar;
            f += dVar.E;
            oVar = dVar.t;
        }
        if (f != this.G) {
            this.G = f;
            if (I != null) {
                I.Y();
            }
            if (I != null) {
                I.O();
            }
        }
        if (!L().l) {
            boolean z = this.u;
            if (!z || this.z.e()) {
                y0();
            }
            if (z) {
                layoutNode.G.c.T1();
            } else {
                if (I != null) {
                    I.O();
                }
                if (this.h && I != null) {
                    I.e0(false);
                }
            }
        }
        if (I != null) {
            androidx.compose.ui.node.e eVar2 = I.H;
            if (!this.h && eVar2.d == LayoutNode.LayoutState.LayingOut) {
                if (this.j != Integer.MAX_VALUE) {
                    uzw.b("Place was called on a node which was placed already");
                }
                int i = eVar2.i;
                this.j = i;
                eVar2.i = i + 1;
            }
        } else {
            this.j = 0;
        }
        K();
    }

    @Override // xsna.kt1
    public final void H(izs<? super kt1, s3q0> izsVar) {
        ci50<LayoutNode> L = this.g.a.L();
        LayoutNode[] layoutNodeArr = L.b;
        int i = L.d;
        for (int i2 = 0; i2 < i; i2++) {
            izsVar.invoke(layoutNodeArr[i2].H.p);
        }
    }

    public final void H0(long j, float f, izs<? super tdu, s3q0> izsVar, mdu mduVar) {
        androidx.compose.ui.node.e eVar = this.g;
        LayoutNode layoutNode = eVar.a;
        LayoutNode layoutNode2 = eVar.a;
        if (layoutNode.R) {
            uzw.a("place is called on a deactivated node");
        }
        eVar.d = LayoutNode.LayoutState.LayingOut;
        this.o = j;
        this.r = f;
        this.p = izsVar;
        this.q = mduVar;
        this.H = false;
        p a2 = voy.a(layoutNode2);
        if (this.x || !this.u) {
            this.z.g = false;
            eVar.f(false);
            this.I = izsVar;
            this.K = j;
            this.L = f;
            this.J = mduVar;
            t590 snapshotObserver = a2.getSnapshotObserver();
            snapshotObserver.a.d(layoutNode2, snapshotObserver.f, this.M);
        } else {
            o a3 = eVar.a();
            a3.a2(h9x.d(j, a3.f), f, izsVar, mduVar);
            F0();
        }
        eVar.d = LayoutNode.LayoutState.Idle;
        if (eVar.a().l && (eVar.k || eVar.j)) {
            requestLayout();
        }
        this.l = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:10:0x002f, B:12:0x0033, B:14:0x003b, B:17:0x0044, B:18:0x0046, B:20:0x004a, B:22:0x0050, B:24:0x0058, B:26:0x0064, B:28:0x006c, B:29:0x0070, B:30:0x005c, B:31:0x0084, B:33:0x0088, B:35:0x008c, B:36:0x0091, B:40:0x001f, B:42:0x0023, B:44:0x0027, B:46:0x002b), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:10:0x002f, B:12:0x0033, B:14:0x003b, B:17:0x0044, B:18:0x0046, B:20:0x004a, B:22:0x0050, B:24:0x0058, B:26:0x0064, B:28:0x006c, B:29:0x0070, B:30:0x005c, B:31:0x0084, B:33:0x0088, B:35:0x008c, B:36:0x0091, B:40:0x001f, B:42:0x0023, B:44:0x0027, B:46:0x002b), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J0(long j, float f, izs<? super tdu, s3q0> izsVar, mdu mduVar) {
        g gVar;
        g gVar2;
        g gVar3;
        o oVar;
        LayoutNode I;
        androidx.compose.ui.node.e eVar = this.g;
        LayoutNode layoutNode = eVar.a;
        LayoutNode layoutNode2 = eVar.a;
        try {
            this.v = true;
            if (h9x.b(j, this.o)) {
                if (izsVar == this.p) {
                    if (this.N) {
                    }
                    gVar = eVar.q;
                    if (gVar != null) {
                        androidx.compose.ui.node.e eVar2 = gVar.g;
                        if (gVar.s == g.a.IsNotPlaced && !sdi.k(eVar2.a)) {
                            eVar2.c = true;
                        }
                    }
                    gVar2 = eVar.q;
                    if (gVar2 != null && gVar2.x0()) {
                        oVar = eVar.a().u;
                        if (oVar != null || (r3 = oVar.m) == null) {
                            tra0.a placementScope = voy.a(layoutNode2).getPlacementScope();
                        }
                        g gVar4 = eVar.q;
                        I = layoutNode2.I();
                        if (I != null) {
                            I.H.h = 0;
                        }
                        gVar4.j = Integer.MAX_VALUE;
                        placementScope.q(gVar4, (int) (j >> 32), (int) (4294967295L & j), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    gVar3 = eVar.q;
                    if (gVar3 != null && !gVar3.m) {
                        uzw.b("Error: Placement happened before lookahead.");
                    }
                    H0(j, f, izsVar, mduVar);
                    s3q0 s3q0Var = s3q0.a;
                }
            }
            if (eVar.k || eVar.j || this.N) {
                this.x = true;
                this.N = false;
            }
            gVar = eVar.q;
            if (gVar != null) {
            }
            gVar2 = eVar.q;
            if (gVar2 != null) {
                oVar = eVar.a().u;
                if (oVar != null) {
                }
                tra0.a placementScope2 = voy.a(layoutNode2).getPlacementScope();
                g gVar42 = eVar.q;
                I = layoutNode2.I();
                if (I != null) {
                }
                gVar42.j = Integer.MAX_VALUE;
                placementScope2.q(gVar42, (int) (j >> 32), (int) (4294967295L & j), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            gVar3 = eVar.q;
            if (gVar3 != null) {
                uzw.b("Error: Placement happened before lookahead.");
            }
            H0(j, f, izsVar, mduVar);
            s3q0 s3q0Var2 = s3q0.a;
        } catch (Throwable th) {
            layoutNode.i0(th);
            throw null;
        }
    }

    @Override // xsna.kt1
    public final void K() {
        boolean z;
        this.C = true;
        soy soyVar = this.z;
        soyVar.i();
        boolean z2 = this.x;
        androidx.compose.ui.node.e eVar = this.g;
        if (z2) {
            ci50<LayoutNode> L = eVar.a.L();
            LayoutNode[] layoutNodeArr = L.b;
            int i = L.d;
            for (int i2 = 0; i2 < i; i2++) {
                LayoutNode layoutNode = layoutNodeArr[i2];
                boolean E = layoutNode.E();
                androidx.compose.ui.node.e eVar2 = layoutNode.H;
                if (E && layoutNode.F() == LayoutNode.UsageByParent.InMeasureBlock) {
                    k kVar = eVar2.p;
                    o6j o6jVar = kVar.k ? new o6j(kVar.e) : null;
                    if (o6jVar != null) {
                        if (layoutNode.D == LayoutNode.UsageByParent.NotUsed) {
                            layoutNode.t();
                        }
                        z = eVar2.p.M0(o6jVar.a);
                    } else {
                        z = false;
                    }
                    if (z) {
                        LayoutNode.f0(eVar.a, false, 7);
                    }
                }
            }
        }
        if (this.y || (!this.n && !L().l && this.x)) {
            this.x = false;
            LayoutNode.LayoutState layoutState = eVar.d;
            eVar.d = LayoutNode.LayoutState.LayingOut;
            eVar.g(false);
            LayoutNode layoutNode2 = eVar.a;
            t590 snapshotObserver = voy.a(layoutNode2).getSnapshotObserver();
            snapshotObserver.a.d(layoutNode2, snapshotObserver.e, this.F);
            eVar.d = layoutState;
            this.y = false;
        }
        if (soyVar.d) {
            soyVar.e = true;
        }
        if (soyVar.b && soyVar.f()) {
            soyVar.h();
        }
        this.C = false;
    }

    @Override // xsna.kt1
    public final androidx.compose.ui.node.c L() {
        return this.g.a.G.c;
    }

    @Override // xsna.zox
    public final int M(int i) {
        androidx.compose.ui.node.e eVar = this.g;
        if (sdi.k(eVar.a)) {
            return eVar.q.M(i);
        }
        E0();
        return eVar.a().M(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0043, B:24:0x0063, B:26:0x0080, B:27:0x0086, B:29:0x0092, B:31:0x009c, B:35:0x00a8, B:37:0x005e), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0043, B:24:0x0063, B:26:0x0080, B:27:0x0086, B:29:0x0092, B:31:0x009c, B:35:0x00a8, B:37:0x005e), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean M0(long j) {
        boolean z;
        long j2;
        LayoutNode.LayoutState layoutState;
        LayoutNode.LayoutState layoutState2;
        LayoutNode.LayoutState layoutState3;
        androidx.compose.ui.node.e eVar = this.g;
        LayoutNode layoutNode = eVar.a;
        LayoutNode layoutNode2 = eVar.a;
        try {
            if (layoutNode.R) {
                uzw.a("measure is called on a deactivated node");
            }
            p a2 = voy.a(layoutNode2);
            LayoutNode I = layoutNode2.I();
            boolean z2 = true;
            if (!layoutNode2.F && (I == null || !I.F)) {
                z = false;
                layoutNode2.F = z;
                if (!layoutNode2.E() && o6j.c(this.e, j)) {
                    a2.l(layoutNode2, false);
                    layoutNode2.h0();
                    return false;
                }
                this.z.f = false;
                H(e.i);
                this.k = true;
                j2 = eVar.a().d;
                v0(j);
                layoutState = eVar.d;
                layoutState2 = LayoutNode.LayoutState.Idle;
                if (layoutState == layoutState2) {
                    uzw.b("layout state is not idle before measure starts");
                }
                this.D = j;
                layoutState3 = LayoutNode.LayoutState.Measuring;
                eVar.d = layoutState3;
                this.w = false;
                t590 snapshotObserver = voy.a(layoutNode2).getSnapshotObserver();
                snapshotObserver.a.d(layoutNode2, snapshotObserver.c, this.E);
                if (eVar.d == layoutState3) {
                    this.x = true;
                    this.y = true;
                    eVar.d = layoutState2;
                }
                if (q9x.b(eVar.a().d, j2) && eVar.a().b == this.b && eVar.a().c == this.c) {
                    z2 = false;
                }
                s0((eVar.a().c & 4294967295L) | (eVar.a().b << 32));
                return z2;
            }
            z = true;
            layoutNode2.F = z;
            if (!layoutNode2.E()) {
                a2.l(layoutNode2, false);
                layoutNode2.h0();
                return false;
            }
            this.z.f = false;
            H(e.i);
            this.k = true;
            j2 = eVar.a().d;
            v0(j);
            layoutState = eVar.d;
            layoutState2 = LayoutNode.LayoutState.Idle;
            if (layoutState == layoutState2) {
            }
            this.D = j;
            layoutState3 = LayoutNode.LayoutState.Measuring;
            eVar.d = layoutState3;
            this.w = false;
            t590 snapshotObserver2 = voy.a(layoutNode2).getSnapshotObserver();
            snapshotObserver2.a.d(layoutNode2, snapshotObserver2.c, this.E);
            if (eVar.d == layoutState3) {
            }
            if (q9x.b(eVar.a().d, j2)) {
                z2 = false;
            }
            s0((eVar.a().c & 4294967295L) | (eVar.a().b << 32));
            return z2;
        } catch (Throwable th) {
            layoutNode.i0(th);
            throw null;
        }
    }

    @Override // xsna.zo10
    public final tra0 N(long j) {
        LayoutNode.UsageByParent usageByParent;
        androidx.compose.ui.node.e eVar = this.g;
        LayoutNode layoutNode = eVar.a;
        LayoutNode.UsageByParent usageByParent2 = layoutNode.D;
        LayoutNode.UsageByParent usageByParent3 = LayoutNode.UsageByParent.NotUsed;
        if (usageByParent2 == usageByParent3) {
            layoutNode.t();
        }
        if (sdi.k(eVar.a)) {
            g gVar = eVar.q;
            gVar.k = usageByParent3;
            gVar.N(j);
        }
        LayoutNode layoutNode2 = eVar.a;
        LayoutNode I = layoutNode2.I();
        if (I != null) {
            androidx.compose.ui.node.e eVar2 = I.H;
            if (this.m != usageByParent3 && !layoutNode2.F) {
                uzw.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i = a.$EnumSwitchMapping$0[eVar2.d.ordinal()];
            if (i == 1) {
                usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + eVar2.d);
                }
                usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
            }
            this.m = usageByParent;
        } else {
            this.m = usageByParent3;
        }
        M0(j);
        return this;
    }

    public final void N0() {
        androidx.compose.ui.node.e eVar = this.g;
        LayoutNode layoutNode = eVar.a;
        LayoutNode layoutNode2 = eVar.a;
        if (!layoutNode.g() || eVar.l <= 0) {
            return;
        }
        androidx.compose.ui.node.e eVar2 = layoutNode2.H;
        if ((eVar2.j || eVar2.k) && !eVar2.p.x) {
            layoutNode2.e0(false);
        }
        ci50<LayoutNode> L = layoutNode2.L();
        LayoutNode[] layoutNodeArr = L.b;
        int i = L.d;
        for (int i2 = 0; i2 < i; i2++) {
            layoutNodeArr[i2].H.p.N0();
        }
    }

    @Override // xsna.kt1
    public final void W() {
        LayoutNode.f0(this.g.a, false, 7);
    }

    @Override // xsna.zox
    public final int Z(int i) {
        androidx.compose.ui.node.e eVar = this.g;
        if (sdi.k(eVar.a)) {
            return eVar.q.Z(i);
        }
        E0();
        return eVar.a().Z(i);
    }

    @Override // xsna.jp10, xsna.zox
    public final Object c() {
        return this.t;
    }

    @Override // xsna.kt1
    public final kt1 c0() {
        androidx.compose.ui.node.e eVar;
        LayoutNode I = this.g.a.I();
        if (I == null || (eVar = I.H) == null) {
            return null;
        }
        return eVar.p;
    }

    @Override // xsna.jp10
    public final int g0(gt1 gt1Var) {
        androidx.compose.ui.node.e eVar = this.g;
        LayoutNode I = eVar.a.I();
        LayoutNode.LayoutState layoutState = I != null ? I.H.d : null;
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.Measuring;
        soy soyVar = this.z;
        if (layoutState == layoutState2) {
            soyVar.c = true;
        } else {
            LayoutNode I2 = eVar.a.I();
            if ((I2 != null ? I2.H.d : null) == LayoutNode.LayoutState.LayingOut) {
                soyVar.d = true;
            }
        }
        this.n = true;
        int g0 = eVar.a().g0(gt1Var);
        this.n = false;
        return g0;
    }

    @Override // xsna.zox
    public final int j0(int i) {
        androidx.compose.ui.node.e eVar = this.g;
        if (sdi.k(eVar.a)) {
            return eVar.q.j0(i);
        }
        E0();
        return eVar.a().j0(i);
    }

    @Override // xsna.zox
    public final int l0(int i) {
        androidx.compose.ui.node.e eVar = this.g;
        if (sdi.k(eVar.a)) {
            return eVar.q.l0(i);
        }
        E0();
        return eVar.a().l0(i);
    }

    @Override // xsna.tra0
    public final int m0() {
        return this.g.a().m0();
    }

    @Override // xsna.tra0
    public final int n0() {
        return this.g.a().n0();
    }

    @Override // xsna.tra0
    public final void p0(long j, float f, izs<? super tdu, s3q0> izsVar) {
        J0(j, f, izsVar, null);
    }

    @Override // xsna.kt1
    public final jt1 q() {
        return this.z;
    }

    @Override // xsna.tra0
    public final void q0(long j, float f, mdu mduVar) {
        J0(j, f, null, mduVar);
    }

    @Override // xsna.kt1
    public final void requestLayout() {
        LayoutNode layoutNode = this.g.a;
        LayoutNode.c cVar = LayoutNode.S;
        layoutNode.e0(false);
    }

    @Override // xsna.jb30
    public final void v(boolean z) {
        androidx.compose.ui.node.e eVar = this.g;
        if (z != eVar.a().j) {
            eVar.a().j = z;
            this.N = true;
        }
    }

    @Override // xsna.kt1
    public final int x() {
        return this.j;
    }

    public final List<k> x0() {
        androidx.compose.ui.node.e eVar = this.g;
        eVar.a.n0();
        boolean z = this.B;
        ci50<k> ci50Var = this.A;
        if (!z) {
            return ci50Var.f();
        }
        LayoutNode layoutNode = eVar.a;
        ci50<LayoutNode> L = layoutNode.L();
        LayoutNode[] layoutNodeArr = L.b;
        int i = L.d;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = layoutNodeArr[i2];
            if (ci50Var.d <= i2) {
                ci50Var.b(layoutNode2.H.p);
            } else {
                k kVar = layoutNode2.H.p;
                k[] kVarArr = ci50Var.b;
                k kVar2 = kVarArr[i2];
                kVarArr[i2] = kVar;
            }
        }
        ci50Var.l(((ci50.a) layoutNode.B()).b.d, ci50Var.d);
        this.B = false;
        return ci50Var.f();
    }

    public final void y0() {
        boolean z = this.u;
        this.u = true;
        androidx.compose.ui.node.e eVar = this.g;
        LayoutNode layoutNode = eVar.a;
        u470 u470Var = layoutNode.G;
        if (!z) {
            u470Var.c.T1();
            voy.a(layoutNode).getRectManager().e(eVar.a);
            if (layoutNode.E()) {
                LayoutNode.f0(layoutNode, true, 6);
            } else if (layoutNode.H.e) {
                LayoutNode.d0(layoutNode, true, 6);
            }
        }
        o oVar = u470Var.c.t;
        for (o oVar2 = u470Var.d; !epx.f(oVar2, oVar) && oVar2 != null; oVar2 = oVar2.t) {
            if (oVar2.O) {
                oVar2.P1();
            }
        }
        ci50<LayoutNode> L = layoutNode.L();
        LayoutNode[] layoutNodeArr = L.b;
        int i = L.d;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = layoutNodeArr[i2];
            if (layoutNode2.J() != Integer.MAX_VALUE) {
                layoutNode2.H.p.y0();
                LayoutNode.g0(layoutNode2);
            }
        }
    }
}
