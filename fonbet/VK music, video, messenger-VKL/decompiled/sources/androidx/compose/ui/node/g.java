package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.c;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import xsna.asp;
import xsna.ci50;
import xsna.gt1;
import xsna.gzs;
import xsna.h9x;
import xsna.izs;
import xsna.jb30;
import xsna.jt1;
import xsna.k600;
import xsna.kt1;
import xsna.m600;
import xsna.mdu;
import xsna.o6j;
import xsna.s3q0;
import xsna.s6j;
import xsna.sdi;
import xsna.t590;
import xsna.tdu;
import xsna.tra0;
import xsna.uzw;
import xsna.voy;
import xsna.zo10;
import xsna.zrp;

/* compiled from: LookaheadPassDelegate.kt */
/* loaded from: classes11.dex */
public final class g extends tra0 implements zo10, kt1, jb30 {
    public boolean D;
    public final androidx.compose.ui.node.e g;
    public boolean h;
    public boolean l;
    public boolean m;
    public boolean n;
    public o6j o;
    public izs<? super tdu, s3q0> q;
    public mdu r;
    public boolean w;
    public Object z;
    public int i = Integer.MAX_VALUE;
    public int j = Integer.MAX_VALUE;
    public LayoutNode.UsageByParent k = LayoutNode.UsageByParent.NotUsed;
    public long p = 0;
    public a s = a.IsNotPlaced;
    public final k600 t = new k600(this);
    public final ci50<g> u = new ci50<>(new g[16]);
    public boolean v = true;
    public final c x = new c();
    public boolean y = true;
    public long A = s6j.b(0, 0, 0, 0, 15);
    public final e B = new e();
    public final d C = new d();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LookaheadPassDelegate.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a IsNotPlaced;
        public static final a IsPlacedInApproach;
        public static final a IsPlacedInLookahead;

        static {
            a aVar = new a("IsPlacedInLookahead", 0);
            IsPlacedInLookahead = aVar;
            a aVar2 = new a("IsPlacedInApproach", 1);
            IsPlacedInApproach = aVar2;
            a aVar3 = new a("IsNotPlaced", 2);
            IsNotPlaced = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: LookaheadPassDelegate.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
            try {
                iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: LookaheadPassDelegate.kt */
    public static final class c extends Lambda implements gzs<s3q0> {
        public c() {
            super(0);
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            androidx.compose.ui.node.e eVar = g.this.g;
            eVar.h = 0;
            ci50<LayoutNode> L = eVar.a.L();
            LayoutNode[] layoutNodeArr = L.b;
            int i = L.d;
            for (int i2 = 0; i2 < i; i2++) {
                g gVar = layoutNodeArr[i2].H.q;
                gVar.i = gVar.j;
                gVar.j = Integer.MAX_VALUE;
                if (gVar.k == LayoutNode.UsageByParent.InLayoutBlock) {
                    gVar.k = LayoutNode.UsageByParent.NotUsed;
                }
            }
            g.this.H(h.i);
            c.a aVar = g.this.L().Z;
            if (aVar != null) {
                boolean z = aVar.l;
                List<LayoutNode> B = g.this.g.a.B();
                int size = B.size();
                for (int i3 = 0; i3 < size; i3++) {
                    m600 w1 = ((LayoutNode) ((ci50.a) B).get(i3)).G.d.w1();
                    if (w1 != null) {
                        w1.l = z;
                    }
                }
            }
            g.this.L().Z.J0().j();
            if (g.this.L().Z != null) {
                List<LayoutNode> B2 = g.this.g.a.B();
                int size2 = B2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    m600 w12 = ((LayoutNode) ((ci50.a) B2).get(i4)).G.d.w1();
                    if (w12 != null) {
                        w12.l = false;
                    }
                }
            }
            ci50<LayoutNode> L2 = g.this.g.a.L();
            LayoutNode[] layoutNodeArr2 = L2.b;
            int i5 = L2.d;
            for (int i6 = 0; i6 < i5; i6++) {
                g gVar2 = layoutNodeArr2[i6].H.q;
                int i7 = gVar2.i;
                int i8 = gVar2.j;
                if (i7 != i8 && i8 == Integer.MAX_VALUE) {
                    gVar2.y0(true);
                }
            }
            g.this.H(i.i);
            return s3q0.a;
        }
    }

    /* compiled from: LookaheadPassDelegate.kt */
    public static final class d extends Lambda implements gzs<s3q0> {
        public d() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
        @Override // xsna.gzs
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final s3q0 invoke() {
            m600 w1;
            tra0.a aVar = null;
            if (!sdi.k(g.this.g.a)) {
                androidx.compose.ui.node.e eVar = g.this.g;
                if (!eVar.c) {
                    o oVar = eVar.a().u;
                    if (oVar != null && (w1 = oVar.w1()) != null) {
                        aVar = w1.m;
                    }
                    if (aVar == null) {
                        aVar = voy.a(g.this.g.a).getPlacementScope();
                    }
                    g gVar = g.this;
                    tra0.a.w(aVar, gVar.g.a().w1(), gVar.p);
                    return s3q0.a;
                }
            }
            o oVar2 = g.this.g.a().u;
            if (oVar2 != null) {
                aVar = oVar2.m;
            }
            if (aVar == null) {
            }
            g gVar2 = g.this;
            tra0.a.w(aVar, gVar2.g.a().w1(), gVar2.p);
            return s3q0.a;
        }
    }

    /* compiled from: LookaheadPassDelegate.kt */
    public static final class e extends Lambda implements gzs<s3q0> {
        public e() {
            super(0);
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            g.this.g.a().w1().N(g.this.A);
            return s3q0.a;
        }
    }

    /* compiled from: LookaheadPassDelegate.kt */
    public static final class f extends Lambda implements izs<kt1, s3q0> {
        public static final f i = new f(1);

        @Override // xsna.izs
        public final s3q0 invoke(kt1 kt1Var) {
            kt1Var.q().c = false;
            return s3q0.a;
        }
    }

    public g(androidx.compose.ui.node.e eVar) {
        this.g = eVar;
        this.z = eVar.p.t;
    }

    public final void A0() {
        a aVar = this.s;
        androidx.compose.ui.node.e eVar = this.g;
        boolean z = eVar.c;
        LayoutNode layoutNode = eVar.a;
        if (z) {
            this.s = a.IsPlacedInApproach;
        } else {
            this.s = a.IsPlacedInLookahead;
        }
        if (aVar != a.IsPlacedInLookahead && eVar.e) {
            LayoutNode.d0(layoutNode, true, 6);
        }
        ci50<LayoutNode> L = layoutNode.L();
        LayoutNode[] layoutNodeArr = L.b;
        int i = L.d;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = layoutNodeArr[i2];
            g gVar = layoutNode2.H.q;
            if (gVar == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (gVar.j != Integer.MAX_VALUE) {
                gVar.A0();
                LayoutNode.g0(layoutNode2);
            }
        }
    }

    public final void E0() {
        androidx.compose.ui.node.e eVar = this.g;
        if (eVar.o > 0) {
            ci50<LayoutNode> L = eVar.a.L();
            LayoutNode[] layoutNodeArr = L.b;
            int i = L.d;
            for (int i2 = 0; i2 < i; i2++) {
                LayoutNode layoutNode = layoutNodeArr[i2];
                androidx.compose.ui.node.e eVar2 = layoutNode.H;
                if ((eVar2.m || eVar2.n) && !eVar2.f) {
                    layoutNode.c0(false);
                }
                g gVar = eVar2.q;
                if (gVar != null) {
                    gVar.E0();
                }
            }
        }
    }

    public final void F0() {
        androidx.compose.ui.node.e eVar = this.g;
        LayoutNode.d0(eVar.a, false, 7);
        LayoutNode layoutNode = eVar.a;
        LayoutNode I = layoutNode.I();
        if (I == null || layoutNode.D != LayoutNode.UsageByParent.NotUsed) {
            return;
        }
        int i = b.$EnumSwitchMapping$0[I.H.d.ordinal()];
        layoutNode.D = i != 2 ? i != 3 ? I.D : LayoutNode.UsageByParent.InLayoutBlock : LayoutNode.UsageByParent.InMeasureBlock;
    }

    @Override // xsna.kt1
    public final void H(izs<? super kt1, s3q0> izsVar) {
        ci50<LayoutNode> L = this.g.a.L();
        LayoutNode[] layoutNodeArr = L.b;
        int i = L.d;
        for (int i2 = 0; i2 < i; i2++) {
            izsVar.invoke(layoutNodeArr[i2].H.q);
        }
    }

    public final void H0() {
        LayoutNode.LayoutState layoutState;
        this.D = true;
        androidx.compose.ui.node.e eVar = this.g;
        LayoutNode I = eVar.a.I();
        a aVar = this.s;
        if ((aVar != a.IsPlacedInLookahead && !eVar.c) || (aVar != a.IsPlacedInApproach && eVar.c)) {
            A0();
            if (this.h && I != null) {
                I.c0(false);
            }
        }
        if (I != null) {
            androidx.compose.ui.node.e eVar2 = I.H;
            if (!this.h && ((layoutState = eVar2.d) == LayoutNode.LayoutState.LayingOut || layoutState == LayoutNode.LayoutState.LookaheadLayingOut)) {
                if (this.j != Integer.MAX_VALUE) {
                    uzw.b("Place was called on a node which was placed already");
                }
                int i = eVar2.h;
                this.j = i;
                eVar2.h = i + 1;
            }
        } else {
            this.j = 0;
        }
        K();
    }

    public final void J0(long j, izs izsVar, mdu mduVar) {
        androidx.compose.ui.node.e eVar = this.g;
        LayoutNode layoutNode = eVar.a;
        LayoutNode layoutNode2 = eVar.a;
        try {
            LayoutNode I = layoutNode.I();
            LayoutNode.LayoutState layoutState = I != null ? I.H.d : null;
            LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.LookaheadLayingOut;
            if (layoutState == layoutState2) {
                eVar.c = false;
            }
            if (layoutNode2.R) {
                uzw.a("place is called on a deactivated node");
            }
            eVar.d = layoutState2;
            boolean z = true;
            this.m = true;
            this.D = false;
            if (!h9x.b(j, this.p)) {
                if (eVar.n || eVar.m) {
                    eVar.f = true;
                }
                E0();
            }
            p a2 = voy.a(layoutNode2);
            this.p = j;
            if (!eVar.f) {
                if (this.s == a.IsNotPlaced) {
                    z = false;
                }
                if (z) {
                    m600 w1 = eVar.a().w1();
                    w1.h1(h9x.d(j, w1.f));
                    H0();
                    this.q = izsVar;
                    this.r = mduVar;
                    eVar.d = LayoutNode.LayoutState.Idle;
                    s3q0 s3q0Var = s3q0.a;
                }
            }
            eVar.h(false);
            this.t.g = false;
            t590 snapshotObserver = a2.getSnapshotObserver();
            snapshotObserver.a.d(layoutNode2, snapshotObserver.g, this.C);
            this.q = izsVar;
            this.r = mduVar;
            eVar.d = LayoutNode.LayoutState.Idle;
            s3q0 s3q0Var2 = s3q0.a;
        } catch (Throwable th) {
            layoutNode.i0(th);
            throw null;
        }
    }

    @Override // xsna.kt1
    public final void K() {
        this.w = true;
        k600 k600Var = this.t;
        k600Var.i();
        androidx.compose.ui.node.e eVar = this.g;
        boolean z = eVar.f;
        LayoutNode layoutNode = eVar.a;
        if (z) {
            ci50<LayoutNode> L = layoutNode.L();
            LayoutNode[] layoutNodeArr = L.b;
            int i = L.d;
            for (int i2 = 0; i2 < i; i2++) {
                LayoutNode layoutNode2 = layoutNodeArr[i2];
                if (layoutNode2.H.e && layoutNode2.G() == LayoutNode.UsageByParent.InMeasureBlock) {
                    g gVar = layoutNode2.H.q;
                    if (gVar.M0((gVar != null ? gVar.o : null).a)) {
                        LayoutNode.d0(layoutNode, false, 7);
                    }
                }
            }
        }
        c.a aVar = L().Z;
        if (eVar.g || (!this.l && !aVar.l && eVar.f)) {
            eVar.f = false;
            LayoutNode.LayoutState layoutState = eVar.d;
            eVar.d = LayoutNode.LayoutState.LookaheadLayingOut;
            eVar.i(false);
            t590 snapshotObserver = voy.a(layoutNode).getSnapshotObserver();
            snapshotObserver.a.d(layoutNode, snapshotObserver.h, this.x);
            eVar.d = layoutState;
            if (eVar.m && aVar.l) {
                requestLayout();
            }
            eVar.g = false;
        }
        if (k600Var.d) {
            k600Var.e = true;
        }
        if (k600Var.b && k600Var.f()) {
            k600Var.h();
        }
        this.w = false;
    }

    @Override // xsna.kt1
    public final androidx.compose.ui.node.c L() {
        return this.g.a.G.c;
    }

    @Override // xsna.zox
    public final int M(int i) {
        F0();
        return this.g.a().w1().M(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0045, B:26:0x0035, B:27:0x0049, B:29:0x0067, B:30:0x0071, B:34:0x0082, B:35:0x0087, B:37:0x009d, B:42:0x006a), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0045, B:26:0x0035, B:27:0x0049, B:29:0x0067, B:30:0x0071, B:34:0x0082, B:35:0x0087, B:37:0x009d, B:42:0x006a), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0045, B:26:0x0035, B:27:0x0049, B:29:0x0067, B:30:0x0071, B:34:0x0082, B:35:0x0087, B:37:0x009d, B:42:0x006a), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006a A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0045, B:26:0x0035, B:27:0x0049, B:29:0x0067, B:30:0x0071, B:34:0x0082, B:35:0x0087, B:37:0x009d, B:42:0x006a), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean M0(long j) {
        boolean z;
        long j2;
        m600 w1;
        androidx.compose.ui.node.e eVar = this.g;
        LayoutNode layoutNode = eVar.a;
        LayoutNode layoutNode2 = eVar.a;
        try {
            if (layoutNode.R) {
                uzw.a("measure is called on a deactivated node");
            }
            LayoutNode I = layoutNode2.I();
            if (!layoutNode2.F && (I == null || !I.F)) {
                z = false;
                layoutNode2.F = z;
                if (!layoutNode2.H.e) {
                    o6j o6jVar = this.o;
                    if (o6jVar == null ? false : o6j.c(o6jVar.a, j)) {
                        p pVar = layoutNode2.o;
                        if (pVar != null) {
                            pVar.l(layoutNode2, true);
                        }
                        layoutNode2.h0();
                        return false;
                    }
                }
                this.o = new o6j(j);
                v0(j);
                this.t.f = false;
                H(f.i);
                if (this.n) {
                    long j3 = Integer.MIN_VALUE;
                    j2 = (j3 & 4294967295L) | (j3 << 32);
                } else {
                    j2 = this.d;
                }
                this.n = true;
                w1 = eVar.a().w1();
                if (!(w1 == null)) {
                    uzw.b("Lookahead result from lookaheadRemeasure cannot be null");
                }
                eVar.c(j);
                s0((w1.c & 4294967295L) | (w1.b << 32));
                return ((int) (j2 >> 32)) == w1.b || ((int) (j2 & 4294967295L)) != w1.c;
            }
            z = true;
            layoutNode2.F = z;
            if (!layoutNode2.H.e) {
            }
            this.o = new o6j(j);
            v0(j);
            this.t.f = false;
            H(f.i);
            if (this.n) {
            }
            this.n = true;
            w1 = eVar.a().w1();
            if (!(w1 == null)) {
            }
            eVar.c(j);
            s0((w1.c & 4294967295L) | (w1.b << 32));
            if (((int) (j2 >> 32)) == w1.b) {
            }
        } catch (Throwable th) {
            layoutNode.i0(th);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r1 != null ? r1.H.d : null) == androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut) goto L13;
     */
    @Override // xsna.zo10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tra0 N(long j) {
        LayoutNode.UsageByParent usageByParent;
        androidx.compose.ui.node.e eVar = this.g;
        LayoutNode I = eVar.a.I();
        if ((I != null ? I.H.d : null) != LayoutNode.LayoutState.LookaheadMeasuring) {
            LayoutNode I2 = eVar.a.I();
        }
        eVar.b = false;
        LayoutNode layoutNode = eVar.a;
        LayoutNode I3 = layoutNode.I();
        if (I3 != null) {
            androidx.compose.ui.node.e eVar2 = I3.H;
            if (this.k != LayoutNode.UsageByParent.NotUsed && !layoutNode.F) {
                uzw.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i = b.$EnumSwitchMapping$0[eVar2.d.ordinal()];
            if (i == 1 || i == 2) {
                usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
            } else {
                if (i != 3 && i != 4) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + eVar2.d);
                }
                usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
            }
            this.k = usageByParent;
        } else {
            this.k = LayoutNode.UsageByParent.NotUsed;
        }
        LayoutNode layoutNode2 = eVar.a;
        if (layoutNode2.D == LayoutNode.UsageByParent.NotUsed) {
            layoutNode2.t();
        }
        M0(j);
        return this;
    }

    @Override // xsna.kt1
    public final void W() {
        LayoutNode.d0(this.g.a, false, 7);
    }

    @Override // xsna.zox
    public final int Z(int i) {
        F0();
        return this.g.a().w1().Z(i);
    }

    @Override // xsna.jp10, xsna.zox
    public final Object c() {
        return this.z;
    }

    @Override // xsna.kt1
    public final kt1 c0() {
        androidx.compose.ui.node.e eVar;
        LayoutNode I = this.g.a.I();
        if (I == null || (eVar = I.H) == null) {
            return null;
        }
        return eVar.q;
    }

    @Override // xsna.jp10
    public final int g0(gt1 gt1Var) {
        androidx.compose.ui.node.e eVar = this.g;
        LayoutNode I = eVar.a.I();
        LayoutNode.LayoutState layoutState = I != null ? I.H.d : null;
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.LookaheadMeasuring;
        k600 k600Var = this.t;
        if (layoutState == layoutState2) {
            k600Var.c = true;
        } else {
            LayoutNode I2 = eVar.a.I();
            if ((I2 != null ? I2.H.d : null) == LayoutNode.LayoutState.LookaheadLayingOut) {
                k600Var.d = true;
            }
        }
        this.l = true;
        int g0 = eVar.a().w1().g0(gt1Var);
        this.l = false;
        return g0;
    }

    @Override // xsna.zox
    public final int j0(int i) {
        F0();
        return this.g.a().w1().j0(i);
    }

    @Override // xsna.zox
    public final int l0(int i) {
        F0();
        return this.g.a().w1().l0(i);
    }

    @Override // xsna.tra0
    public final int m0() {
        return this.g.a().w1().m0();
    }

    @Override // xsna.tra0
    public final int n0() {
        return this.g.a().w1().n0();
    }

    @Override // xsna.tra0
    public final void p0(long j, float f2, izs<? super tdu, s3q0> izsVar) {
        J0(j, izsVar, null);
    }

    @Override // xsna.kt1
    public final jt1 q() {
        return this.t;
    }

    @Override // xsna.tra0
    public final void q0(long j, float f2, mdu mduVar) {
        J0(j, null, mduVar);
    }

    @Override // xsna.kt1
    public final void requestLayout() {
        LayoutNode layoutNode = this.g.a;
        LayoutNode.c cVar = LayoutNode.S;
        layoutNode.c0(false);
    }

    @Override // xsna.jb30
    public final void v(boolean z) {
        m600 w1;
        androidx.compose.ui.node.e eVar = this.g;
        m600 w12 = eVar.a().w1();
        if (Boolean.valueOf(z).equals(w12 != null ? Boolean.valueOf(w12.j) : null) || (w1 = eVar.a().w1()) == null) {
            return;
        }
        w1.j = z;
    }

    @Override // xsna.kt1
    public final int x() {
        return this.j;
    }

    public final boolean x0() {
        androidx.compose.ui.node.e eVar = this.g;
        return sdi.k(eVar.a) || eVar.c;
    }

    public final void y0(boolean z) {
        if (z && x0()) {
            return;
        }
        if (z || x0()) {
            this.s = a.IsNotPlaced;
            ci50<LayoutNode> L = this.g.a.L();
            LayoutNode[] layoutNodeArr = L.b;
            int i = L.d;
            for (int i2 = 0; i2 < i; i2++) {
                layoutNodeArr[i2].H.q.y0(true);
            }
        }
    }
}
