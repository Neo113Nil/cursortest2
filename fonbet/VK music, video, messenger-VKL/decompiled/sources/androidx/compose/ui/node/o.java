package androidx.compose.ui.node;

import androidx.compose.ui.unit.LayoutDirection;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.a570;
import xsna.ad0;
import xsna.ahn;
import xsna.alk;
import xsna.azl;
import xsna.cdp0;
import xsna.ci50;
import xsna.cmb0;
import xsna.dak0;
import xsna.dp10;
import xsna.e43;
import xsna.eh50;
import xsna.en10;
import xsna.epx;
import xsna.fco0;
import xsna.fh50;
import xsna.gt1;
import xsna.gzs;
import xsna.h9x;
import xsna.itl;
import xsna.izs;
import xsna.jgz;
import xsna.jny;
import xsna.jw5;
import xsna.kgi0;
import xsna.l590;
import xsna.lio;
import xsna.lkp0;
import xsna.lp10;
import xsna.m490;
import xsna.m600;
import xsna.mdu;
import xsna.mi90;
import xsna.n34;
import xsna.n600;
import xsna.oh50;
import xsna.ony;
import xsna.ov70;
import xsna.pli;
import xsna.pm0;
import xsna.pp70;
import xsna.q630;
import xsna.qn10;
import xsna.qxm0;
import xsna.r5j0;
import xsna.s3q0;
import xsna.sfg0;
import xsna.tdu;
import xsna.tny;
import xsna.toy;
import xsna.u470;
import xsna.uzw;
import xsna.voy;
import xsna.w470;
import xsna.wg50;
import xsna.x470;
import xsna.xfi0;
import xsna.y470;
import xsna.y4q0;
import xsna.yq9;
import xsna.ytl;
import xsna.z8v;
import xsna.zhf0;
import xsna.zo10;

/* compiled from: NodeCoordinator.kt */
/* loaded from: classes11.dex */
public abstract class o extends androidx.compose.ui.node.f implements zo10, tny, l590 {
    public static final d R = d.i;
    public static final c S = c.i;
    public static final sfg0 T = new sfg0();
    public static final jny U = new jny();
    public static final float[] V = en10.a();
    public static final a W = new a();
    public static final b X = new b();
    public dp10 B;
    public eh50<gt1> C;
    public float E;
    public oh50 F;
    public jny G;
    public boolean I;
    public boolean J;
    public mdu K;
    public yq9 L;
    public w470 M;
    public boolean O;
    public m490 P;
    public mdu Q;
    public final LayoutNode q;
    public boolean r;
    public boolean s;
    public o t;
    public o u;
    public boolean v;
    public boolean w;
    public izs<? super tdu, s3q0> x;
    public azl y;
    public LayoutDirection z;
    public float A = 0.8f;
    public long D = 0;
    public r5j0 H = androidx.compose.ui.graphics.e.a;
    public final f N = new f();

    /* compiled from: NodeCoordinator.kt */
    public static final class a implements e {
        @Override // androidx.compose.ui.node.o.e
        public final int a() {
            return 16;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1, types: [xsna.q630$c] */
        /* JADX WARN: Type inference failed for: r3v10 */
        /* JADX WARN: Type inference failed for: r3v11 */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5, types: [xsna.q630$c] */
        /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v7 */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r3v9 */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v10 */
        /* JADX WARN: Type inference failed for: r4v11 */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v3, types: [xsna.ci50] */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r4v6, types: [xsna.ci50] */
        /* JADX WARN: Type inference failed for: r4v8 */
        /* JADX WARN: Type inference failed for: r4v9 */
        @Override // androidx.compose.ui.node.o.e
        public final boolean b(z8v z8vVar, LayoutNode layoutNode) {
            o oVar = layoutNode.G.d;
            oVar.getClass();
            q630.c H1 = oVar.H1(a570.g(16));
            if (H1 != null && H1.o) {
                if (!H1.b.o) {
                    uzw.b("visitLocalDescendants called on an unattached node");
                }
                q630.c cVar = H1.b;
                if ((cVar.e & 16) != 0) {
                    while (cVar != null) {
                        if ((cVar.d & 16) != 0) {
                            ytl ytlVar = cVar;
                            ?? r4 = 0;
                            while (ytlVar != 0) {
                                if (ytlVar instanceof cmb0) {
                                    if (((cmb0) ytlVar).R1()) {
                                        z8vVar.d = z8vVar.b.b - 1;
                                        return true;
                                    }
                                } else if ((ytlVar.d & 16) != 0 && (ytlVar instanceof ytl)) {
                                    q630.c cVar2 = ytlVar.q;
                                    int i = 0;
                                    ytlVar = ytlVar;
                                    r4 = r4;
                                    while (cVar2 != null) {
                                        if ((cVar2.d & 16) != 0) {
                                            i++;
                                            r4 = r4;
                                            if (i == 1) {
                                                ytlVar = cVar2;
                                            } else {
                                                if (r4 == 0) {
                                                    r4 = new ci50(new q630.c[16]);
                                                }
                                                if (ytlVar != 0) {
                                                    r4.b(ytlVar);
                                                    ytlVar = 0;
                                                }
                                                r4.b(cVar2);
                                            }
                                        }
                                        cVar2 = cVar2.g;
                                        ytlVar = ytlVar;
                                        r4 = r4;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                ytlVar = itl.b(r4);
                            }
                        }
                        cVar = cVar.g;
                    }
                }
            }
            return false;
        }

        @Override // androidx.compose.ui.node.o.e
        public final void d(LayoutNode layoutNode, long j, z8v z8vVar, int i, boolean z) {
            layoutNode.M(j, z8vVar, i, z);
        }

        @Override // androidx.compose.ui.node.o.e
        public final boolean e(LayoutNode layoutNode) {
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3, types: [xsna.ci50] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v6, types: [xsna.ci50] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r8v0, types: [xsna.q630$c] */
        /* JADX WARN: Type inference failed for: r8v1, types: [xsna.q630$c] */
        /* JADX WARN: Type inference failed for: r8v10 */
        /* JADX WARN: Type inference failed for: r8v11 */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v4, types: [xsna.q630$c] */
        /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v6 */
        /* JADX WARN: Type inference failed for: r8v7 */
        /* JADX WARN: Type inference failed for: r8v8 */
        /* JADX WARN: Type inference failed for: r8v9 */
        @Override // androidx.compose.ui.node.o.e
        public final boolean f(q630.c cVar) {
            ?? r1 = 0;
            while (true) {
                int i = 0;
                if (cVar == 0) {
                    return false;
                }
                if (cVar instanceof cmb0) {
                    ((cmb0) cVar).K();
                } else if ((cVar.d & 16) != 0 && (cVar instanceof ytl)) {
                    q630.c cVar2 = cVar.q;
                    r1 = r1;
                    cVar = cVar;
                    while (cVar2 != null) {
                        if ((cVar2.d & 16) != 0) {
                            i++;
                            r1 = r1;
                            if (i == 1) {
                                cVar = cVar2;
                            } else {
                                if (r1 == 0) {
                                    r1 = new ci50(new q630.c[16]);
                                }
                                if (cVar != 0) {
                                    r1.b(cVar);
                                    cVar = 0;
                                }
                                r1.b(cVar2);
                            }
                        }
                        cVar2 = cVar2.g;
                        r1 = r1;
                        cVar = cVar;
                    }
                    if (i == 1) {
                    }
                }
                cVar = itl.b(r1);
            }
        }
    }

    /* compiled from: NodeCoordinator.kt */
    public static final class b implements e {
        @Override // androidx.compose.ui.node.o.e
        public final int a() {
            return 8;
        }

        @Override // androidx.compose.ui.node.o.e
        public final boolean b(z8v z8vVar, LayoutNode layoutNode) {
            return false;
        }

        @Override // androidx.compose.ui.node.o.e
        public final boolean c(q630.c cVar) {
            return qxm0.p(kgi0.a(itl.f(cVar), false));
        }

        @Override // androidx.compose.ui.node.o.e
        public final void d(LayoutNode layoutNode, long j, z8v z8vVar, int i, boolean z) {
            u470 u470Var = layoutNode.G;
            o oVar = u470Var.d;
            d dVar = o.R;
            u470Var.d.L1(o.X, oVar.v1(j), z8vVar, 1, z);
        }

        @Override // androidx.compose.ui.node.o.e
        public final boolean e(LayoutNode layoutNode) {
            xfi0 d = layoutNode.d();
            boolean z = false;
            if (d != null && d.e) {
                z = true;
            }
            return !z;
        }

        @Override // androidx.compose.ui.node.o.e
        public final boolean f(q630.c cVar) {
            return false;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    public static final class c extends Lambda implements izs<o, s3q0> {
        public static final c i = new c(1);

        @Override // xsna.izs
        public final s3q0 invoke(o oVar) {
            m490 m490Var = oVar.P;
            if (m490Var != null) {
                m490Var.invalidate();
            }
            return s3q0.a;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    public static final class d extends Lambda implements izs<o, s3q0> {
        public static final d i = new d(1);

        @Override // xsna.izs
        public final s3q0 invoke(o oVar) {
            o oVar2 = oVar;
            LayoutNode layoutNode = oVar2.q;
            try {
                if (oVar2.d1()) {
                    oVar2.k2(true);
                }
                return s3q0.a;
            } catch (Throwable th) {
                layoutNode.i0(th);
                throw null;
            }
        }
    }

    /* compiled from: NodeCoordinator.kt */
    public interface e {
        int a();

        boolean b(z8v z8vVar, LayoutNode layoutNode);

        default boolean c(q630.c cVar) {
            return true;
        }

        void d(LayoutNode layoutNode, long j, z8v z8vVar, int i, boolean z);

        boolean e(LayoutNode layoutNode);

        boolean f(q630.c cVar);
    }

    /* compiled from: NodeCoordinator.kt */
    public static final class f extends Lambda implements gzs<s3q0> {
        public f() {
            super(0);
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            o oVar = o.this.u;
            if (oVar != null) {
                oVar.P1();
            }
            return s3q0.a;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    public static final class g extends Lambda implements gzs<s3q0> {
        final /* synthetic */ float $distanceFromEdge;
        final /* synthetic */ z8v $hitTestResult;
        final /* synthetic */ e $hitTestSource;
        final /* synthetic */ boolean $isHitInMinimumTouchTargetBetter;
        final /* synthetic */ boolean $isInLayer;
        final /* synthetic */ long $pointerPosition;
        final /* synthetic */ int $pointerType;
        final /* synthetic */ q630.c $this_outOfBoundsHit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(q630.c cVar, e eVar, long j, z8v z8vVar, int i, boolean z, float f, boolean z2) {
            super(0);
            this.$this_outOfBoundsHit = cVar;
            this.$hitTestSource = eVar;
            this.$pointerPosition = j;
            this.$hitTestResult = z8vVar;
            this.$pointerType = i;
            this.$isInLayer = z;
            this.$distanceFromEdge = f;
            this.$isHitInMinimumTouchTargetBetter = z2;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            o oVar = o.this;
            q630.c a = y470.a(this.$this_outOfBoundsHit, this.$hitTestSource.a());
            e eVar = this.$hitTestSource;
            long j = this.$pointerPosition;
            z8v z8vVar = this.$hitTestResult;
            int i = this.$pointerType;
            boolean z = this.$isInLayer;
            float f = this.$distanceFromEdge;
            boolean z2 = this.$isHitInMinimumTouchTargetBetter;
            d dVar = o.R;
            oVar.Y1(a, eVar, j, z8vVar, i, z, f, z2);
            return s3q0.a;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    public static final class h extends Lambda implements gzs<s3q0> {
        final /* synthetic */ float $distanceFromEdge;
        final /* synthetic */ z8v $hitTestResult;
        final /* synthetic */ e $hitTestSource;
        final /* synthetic */ boolean $isInLayer;
        final /* synthetic */ long $pointerPosition;
        final /* synthetic */ int $pointerType;
        final /* synthetic */ q630.c $this_speculativeHit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(q630.c cVar, e eVar, long j, z8v z8vVar, int i, boolean z, float f) {
            super(0);
            this.$this_speculativeHit = cVar;
            this.$hitTestSource = eVar;
            this.$pointerPosition = j;
            this.$hitTestResult = z8vVar;
            this.$pointerType = i;
            this.$isInLayer = z;
            this.$distanceFromEdge = f;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            o oVar = o.this;
            q630.c a = y470.a(this.$this_speculativeHit, this.$hitTestSource.a());
            e eVar = this.$hitTestSource;
            long j = this.$pointerPosition;
            z8v z8vVar = this.$hitTestResult;
            int i = this.$pointerType;
            boolean z = this.$isInLayer;
            float f = this.$distanceFromEdge;
            d dVar = o.R;
            oVar.Y1(a, eVar, j, z8vVar, i, z, f, false);
            return s3q0.a;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    public static final class i extends Lambda implements gzs<s3q0> {
        final /* synthetic */ izs<tdu, s3q0> $layerBlock;
        final /* synthetic */ o this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(izs<? super tdu, s3q0> izsVar, o oVar) {
            super(0);
            this.$layerBlock = izsVar;
            this.this$0 = oVar;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            izs<tdu, s3q0> izsVar = this.$layerBlock;
            sfg0 sfg0Var = o.T;
            izsVar.invoke(sfg0Var);
            boolean f = epx.f(this.this$0.H, sfg0Var.p);
            o oVar = this.this$0;
            boolean z = oVar.I;
            boolean z2 = sfg0Var.q;
            boolean z3 = z != z2;
            if (!f || z3) {
                oVar.H = sfg0Var.p;
                oVar.I = z2;
                if (oVar.J && (z3 || (z2 && !f))) {
                    oVar.q.R();
                }
            }
            this.this$0.J = true;
            sfg0Var.x = sfg0Var.p.a(sfg0Var.s, sfg0Var.u, sfg0Var.t);
            return s3q0.a;
        }
    }

    public o(LayoutNode layoutNode) {
        this.q = layoutNode;
        this.y = layoutNode.z;
        this.z = layoutNode.A;
    }

    public static o f2(tny tnyVar) {
        o oVar;
        n600 n600Var = tnyVar instanceof n600 ? (n600) tnyVar : null;
        return (n600Var == null || (oVar = n600Var.b.q) == null) ? (o) tnyVar : oVar;
    }

    @Override // xsna.tny
    public final long D(long j) {
        if (!D1().o) {
            uzw.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        R1();
        for (o oVar = this; oVar != null; oVar = oVar.u) {
            LayoutNode layoutNode = oVar.q;
            if (oVar == layoutNode.G.d && !layoutNode.d) {
                long b2 = voy.a(layoutNode).getRectManager().b(layoutNode);
                if (!h9x.b(b2, 9223372034707292159L)) {
                    return n34.v(j, b2);
                }
            }
            m490 m490Var = oVar.P;
            if (m490Var != null) {
                j = m490Var.e(j, false);
            }
            j = n34.v(j, oVar.D);
        }
        return j;
    }

    public abstract q630.c D1();

    public final q630.c E1(int i2) {
        boolean g2 = a570.g(i2);
        q630.c D1 = D1();
        if (!g2 && (D1 = D1.f) == null) {
            return null;
        }
        for (q630.c H1 = H1(g2); H1 != null && (H1.e & i2) != 0; H1 = H1.g) {
            if ((H1.d & i2) != 0) {
                return H1;
            }
            if (H1 == D1) {
                return null;
            }
        }
        return null;
    }

    @Override // xsna.tny
    public final long F(long j) {
        if (!D1().o) {
            uzw.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        tny p = jgz.p(this);
        return S(p, ov70.e(voy.a(this.q).g(j), p.D(0L)));
    }

    @Override // androidx.compose.ui.node.f
    public final androidx.compose.ui.node.f F0() {
        return this.t;
    }

    @Override // androidx.compose.ui.node.f
    public final boolean H0() {
        return this.B != null;
    }

    public final q630.c H1(boolean z) {
        q630.c D1;
        u470 u470Var = this.q.G;
        if (u470Var.d == this) {
            return u470Var.f;
        }
        if (!z) {
            o oVar = this.u;
            if (oVar != null) {
                return oVar.D1();
            }
            return null;
        }
        o oVar2 = this.u;
        if (oVar2 == null || (D1 = oVar2.D1()) == null) {
            return null;
        }
        return D1.g;
    }

    @Override // androidx.compose.ui.node.f
    public final dp10 J0() {
        dp10 dp10Var = this.B;
        if (dp10Var != null) {
            return dp10Var;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    public final void J1(q630.c cVar, e eVar, long j, z8v z8vVar, int i2, boolean z) {
        if (cVar == null) {
            O1(eVar, j, z8vVar, i2, z);
            return;
        }
        if (!eVar.c(cVar)) {
            J1(y470.a(cVar, eVar.a()), eVar, j, z8vVar, i2, z);
            return;
        }
        int i3 = z8vVar.d;
        fh50<Object> fh50Var = z8vVar.b;
        z8vVar.d(i3 + 1, fh50Var.b);
        z8vVar.d++;
        fh50Var.j(cVar);
        z8vVar.c.a(ad0.b(-1.0f, z, false));
        J1(y470.a(cVar, eVar.a()), eVar, j, z8vVar, i2, z);
        z8vVar.d = i3;
    }

    public final void K1(q630.c cVar, e eVar, long j, z8v z8vVar, int i2, boolean z, float f2) {
        if (cVar == null) {
            O1(eVar, j, z8vVar, i2, z);
            return;
        }
        if (!eVar.c(cVar)) {
            K1(y470.a(cVar, eVar.a()), eVar, j, z8vVar, i2, z, f2);
            return;
        }
        int i3 = z8vVar.d;
        fh50<Object> fh50Var = z8vVar.b;
        z8vVar.d(i3 + 1, fh50Var.b);
        z8vVar.d++;
        fh50Var.j(cVar);
        z8vVar.c.a(ad0.b(f2, z, false));
        Y1(y470.a(cVar, eVar.a()), eVar, j, z8vVar, i2, z, f2, true);
        z8vVar.d = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c2, code lost:
    
        if (xsna.ahn.k(r18.c(), xsna.ad0.b(r2, r7, false)) > 0) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L1(e eVar, long j, z8v z8vVar, int i2, boolean z) {
        boolean z2;
        boolean z3;
        q630.c E1 = E1(eVar.a());
        if (!l2(j)) {
            if (i2 == 1) {
                float h1 = h1(j, y1());
                if ((Float.floatToRawIntBits(h1) & Integer.MAX_VALUE) < 2139095040) {
                    if (z8vVar.d != e43.h(z8vVar)) {
                        if (ahn.k(z8vVar.c(), ad0.b(h1, false, false)) <= 0) {
                            return;
                        }
                    }
                    K1(E1, eVar, j, z8vVar, i2, false, h1);
                    return;
                }
                return;
            }
            return;
        }
        if (E1 == null) {
            O1(eVar, j, z8vVar, i2, z);
            return;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (intBitsToFloat >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && intBitsToFloat2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && intBitsToFloat < n0() && intBitsToFloat2 < m0()) {
            J1(E1, eVar, j, z8vVar, i2, z);
            return;
        }
        float h12 = i2 == 1 ? h1(j, y1()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(h12) & Integer.MAX_VALUE) < 2139095040) {
            if (z8vVar.d == e43.h(z8vVar)) {
                z2 = z;
            } else {
                z2 = z;
            }
            z3 = true;
            Y1(E1, eVar, j, z8vVar, i2, z2, h12, z3);
        }
        z2 = z;
        z3 = false;
        Y1(E1, eVar, j, z8vVar, i2, z2, h12, z3);
    }

    @Override // androidx.compose.ui.node.f
    public final androidx.compose.ui.node.f M0() {
        return this.u;
    }

    @Override // androidx.compose.ui.node.f
    public final long N0() {
        return this.D;
    }

    public void O1(e eVar, long j, z8v z8vVar, int i2, boolean z) {
        o oVar = this.t;
        if (oVar != null) {
            oVar.L1(eVar, oVar.v1(j), z8vVar, i2, z);
        }
    }

    public final void P1() {
        m490 m490Var = this.P;
        if (m490Var != null) {
            m490Var.invalidate();
            return;
        }
        o oVar = this.u;
        if (oVar != null) {
            oVar.P1();
        }
    }

    public final boolean Q1() {
        if (this.P != null && this.A <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return true;
        }
        o oVar = this.u;
        if (oVar != null) {
            return oVar.Q1();
        }
        return false;
    }

    public final void R1() {
        this.q.H.b();
    }

    @Override // xsna.tny
    public final long S(tny tnyVar, long j) {
        if (tnyVar instanceof n600) {
            n600 n600Var = (n600) tnyVar;
            n600Var.b.q.R1();
            return n600Var.S(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        o f2 = f2(tnyVar);
        f2.R1();
        o q1 = q1(f2);
        while (f2 != q1) {
            m490 m490Var = f2.P;
            if (m490Var != null) {
                j = m490Var.e(j, false);
            }
            j = n34.v(j, f2.D);
            f2 = f2.u;
        }
        return c1(q1, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r7v7, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void S1() {
        q630.c cVar;
        boolean g2 = a570.g(128);
        q630.c H1 = H1(g2);
        if (H1 == null || (H1.b.e & 128) == 0) {
            return;
        }
        dak0 a2 = dak0.a.a();
        izs<Object, s3q0> e2 = a2 != null ? a2.e() : null;
        dak0 b2 = dak0.a.b(a2);
        try {
            if (g2) {
                cVar = D1();
            } else {
                cVar = D1().f;
                if (cVar == null) {
                    s3q0 s3q0Var = s3q0.a;
                    dak0.a.d(a2, b2, e2);
                }
            }
            for (q630.c H12 = H1(g2); H12 != null && (H12.e & 128) != 0; H12 = H12.g) {
                if ((H12.d & 128) != 0) {
                    ytl ytlVar = H12;
                    ?? r8 = 0;
                    while (ytlVar != 0) {
                        if (ytlVar instanceof lp10) {
                            ((lp10) ytlVar).e(this.d);
                        } else if ((ytlVar.d & 128) != 0 && (ytlVar instanceof ytl)) {
                            q630.c cVar2 = ytlVar.q;
                            int i2 = 0;
                            ytlVar = ytlVar;
                            r8 = r8;
                            while (cVar2 != null) {
                                if ((cVar2.d & 128) != 0) {
                                    i2++;
                                    r8 = r8;
                                    if (i2 == 1) {
                                        ytlVar = cVar2;
                                    } else {
                                        if (r8 == 0) {
                                            r8 = new ci50(new q630.c[16]);
                                        }
                                        if (ytlVar != 0) {
                                            r8.b(ytlVar);
                                            ytlVar = 0;
                                        }
                                        r8.b(cVar2);
                                    }
                                }
                                cVar2 = cVar2.g;
                                ytlVar = ytlVar;
                                r8 = r8;
                            }
                            if (i2 == 1) {
                            }
                        }
                        ytlVar = itl.b(r8);
                    }
                }
                if (H12 == cVar) {
                    break;
                }
            }
            s3q0 s3q0Var2 = s3q0.a;
            dak0.a.d(a2, b2, e2);
        } catch (Throwable th) {
            dak0.a.d(a2, b2, e2);
            throw th;
        }
    }

    @Override // xsna.tny
    public final void T(tny tnyVar, float[] fArr) {
        o f2 = f2(tnyVar);
        f2.R1();
        o q1 = q1(f2);
        en10.e(fArr);
        f2.i2(q1, fArr);
        h2(q1, fArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void T1() {
        boolean g2 = a570.g(4194304);
        q630.c D1 = D1();
        if (!g2 && (D1 = D1.f) == null) {
            return;
        }
        for (q630.c H1 = H1(g2); H1 != null && (H1.e & 4194304) != 0; H1 = H1.g) {
            if ((H1.d & 4194304) != 0) {
                ytl ytlVar = H1;
                ?? r5 = 0;
                while (ytlVar != 0) {
                    if (ytlVar instanceof ony) {
                        ((ony) ytlVar).s0(this);
                    } else if ((ytlVar.d & 4194304) != 0 && (ytlVar instanceof ytl)) {
                        q630.c cVar = ytlVar.q;
                        int i2 = 0;
                        ytlVar = ytlVar;
                        r5 = r5;
                        while (cVar != null) {
                            if ((cVar.d & 4194304) != 0) {
                                i2++;
                                r5 = r5;
                                if (i2 == 1) {
                                    ytlVar = cVar;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new ci50(new q630.c[16]);
                                    }
                                    if (ytlVar != 0) {
                                        r5.b(ytlVar);
                                        ytlVar = 0;
                                    }
                                    r5.b(cVar);
                                }
                            }
                            cVar = cVar.g;
                            ytlVar = ytlVar;
                            r5 = r5;
                        }
                        if (i2 == 1) {
                        }
                    }
                    ytlVar = itl.b(r5);
                }
            }
            if (H1 == D1) {
                return;
            }
        }
    }

    @Override // xsna.tny
    public final long U(long j) {
        return voy.a(this.q).j(D(j));
    }

    @Override // androidx.compose.ui.node.f
    public final void U0() {
        mdu mduVar = this.Q;
        if (mduVar != null) {
            q0(this.D, this.E, mduVar);
        } else {
            p0(this.D, this.E, this.x);
        }
    }

    public final void W0(o oVar, oh50 oh50Var, boolean z) {
        if (oVar == this) {
            return;
        }
        o oVar2 = this.u;
        if (oVar2 != null) {
            oVar2.W0(oVar, oh50Var, z);
        }
        long j = this.D;
        float f2 = (int) (j >> 32);
        oh50Var.a -= f2;
        oh50Var.c -= f2;
        float f3 = (int) (j & 4294967295L);
        oh50Var.b -= f3;
        oh50Var.d -= f3;
        m490 m490Var = this.P;
        if (m490Var != null) {
            m490Var.a(oh50Var, true);
            if (this.w && z) {
                long j2 = this.d;
                oh50Var.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    public final void W1() {
        this.v = true;
        this.N.invoke();
        c2();
        if (h9x.b(this.D, 0L)) {
            return;
        }
        this.q.X(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void X1() {
        boolean g2 = a570.g(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
        q630.c H1 = H1(g2);
        if (H1 == null || (H1.b.e & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 0) {
            return;
        }
        q630.c D1 = D1();
        if (!g2 && (D1 = D1.f) == null) {
            return;
        }
        for (q630.c H12 = H1(g2); H12 != null && (H12.e & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0; H12 = H12.g) {
            if ((H12.d & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
                ytl ytlVar = H12;
                ?? r5 = 0;
                while (ytlVar != 0) {
                    if (ytlVar instanceof y4q0) {
                        ((y4q0) ytlVar).N0();
                    } else if ((ytlVar.d & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 && (ytlVar instanceof ytl)) {
                        q630.c cVar = ytlVar.q;
                        int i2 = 0;
                        ytlVar = ytlVar;
                        r5 = r5;
                        while (cVar != null) {
                            if ((cVar.d & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
                                i2++;
                                r5 = r5;
                                if (i2 == 1) {
                                    ytlVar = cVar;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new ci50(new q630.c[16]);
                                    }
                                    if (ytlVar != 0) {
                                        r5.b(ytlVar);
                                        ytlVar = 0;
                                    }
                                    r5.b(cVar);
                                }
                            }
                            cVar = cVar.g;
                            ytlVar = ytlVar;
                            r5 = r5;
                        }
                        if (i2 == 1) {
                        }
                    }
                    ytlVar = itl.b(r5);
                }
            }
            if (H12 == D1) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2, types: [xsna.q630$c] */
    public final void Y1(q630.c cVar, e eVar, long j, z8v z8vVar, int i2, boolean z, float f2, boolean z2) {
        q630.c b2;
        if (cVar == null) {
            O1(eVar, j, z8vVar, i2, z);
            return;
        }
        if (!eVar.c(cVar)) {
            Y1(y470.a(cVar, eVar.a()), eVar, j, z8vVar, i2, z, f2, z2);
            return;
        }
        int i3 = i2;
        if (i3 == 3 || i3 == 4) {
            ci50 ci50Var = null;
            ytl ytlVar = cVar;
            while (true) {
                if (ytlVar == 0) {
                    break;
                }
                int i4 = 0;
                if (ytlVar instanceof cmb0) {
                    long c1 = ((cmb0) ytlVar).c1();
                    int i5 = (int) (j >> 32);
                    float intBitsToFloat = Float.intBitsToFloat(i5);
                    LayoutNode layoutNode = this.q;
                    LayoutDirection layoutDirection = layoutNode.A;
                    int i6 = cdp0.b;
                    long j2 = Long.MIN_VALUE & c1;
                    if (intBitsToFloat >= (-((j2 == 0 || layoutDirection == LayoutDirection.Ltr) ? cdp0.a.a(0, c1) : cdp0.a.a(2, c1)))) {
                        if (Float.intBitsToFloat(i5) < n0() + ((j2 == 0 || layoutNode.A == LayoutDirection.Ltr) ? cdp0.a.a(2, c1) : cdp0.a.a(0, c1))) {
                            int i7 = (int) (j & 4294967295L);
                            if (Float.intBitsToFloat(i7) >= (-cdp0.a.a(1, c1))) {
                                if (Float.intBitsToFloat(i7) < cdp0.a.a(3, c1) + m0()) {
                                    g gVar = new g(cVar, eVar, j, z8vVar, i3, z, f2, z2);
                                    wg50 wg50Var = z8vVar.c;
                                    fh50<Object> fh50Var = z8vVar.b;
                                    if (z8vVar.d == e43.h(z8vVar)) {
                                        int i8 = z8vVar.d;
                                        z8vVar.d(i8 + 1, fh50Var.b);
                                        z8vVar.d++;
                                        fh50Var.j(cVar);
                                        wg50Var.a(ad0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z, true));
                                        gVar.invoke();
                                        z8vVar.d = i8;
                                        return;
                                    }
                                    long c2 = z8vVar.c();
                                    int i9 = z8vVar.d;
                                    if (!ahn.w(c2)) {
                                        if (ahn.q(c2) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                            int i10 = z8vVar.d;
                                            z8vVar.d(i10 + 1, fh50Var.b);
                                            z8vVar.d++;
                                            fh50Var.j(cVar);
                                            wg50Var.a(ad0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z, true));
                                            gVar.invoke();
                                            z8vVar.d = i10;
                                            return;
                                        }
                                        return;
                                    }
                                    int h2 = e43.h(z8vVar);
                                    z8vVar.d = h2;
                                    z8vVar.d(h2 + 1, fh50Var.b);
                                    z8vVar.d++;
                                    fh50Var.j(cVar);
                                    wg50Var.a(ad0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z, true));
                                    gVar.invoke();
                                    z8vVar.d = h2;
                                    if (ahn.q(z8vVar.c()) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                        z8vVar.d(i9 + 1, z8vVar.d + 1);
                                    }
                                    z8vVar.d = i9;
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    if ((ytlVar.d & 16) != 0 && (ytlVar instanceof ytl)) {
                        q630.c cVar2 = ytlVar.q;
                        b2 = ytlVar;
                        ci50Var = ci50Var;
                        while (cVar2 != null) {
                            if ((cVar2.d & 16) != 0) {
                                i4++;
                                ci50Var = ci50Var;
                                if (i4 == 1) {
                                    b2 = cVar2;
                                } else {
                                    if (ci50Var == null) {
                                        ci50Var = new ci50(new q630.c[16]);
                                    }
                                    if (b2 != null) {
                                        ci50Var.b(b2);
                                        b2 = null;
                                    }
                                    ci50Var.b(cVar2);
                                }
                            }
                            cVar2 = cVar2.g;
                            b2 = b2;
                            ci50Var = ci50Var;
                        }
                        if (i4 == 1) {
                            i3 = i2;
                            ytlVar = b2;
                            ci50Var = ci50Var;
                        }
                    }
                    b2 = itl.b(ci50Var);
                    i3 = i2;
                    ytlVar = b2;
                    ci50Var = ci50Var;
                }
            }
        }
        if (z2) {
            K1(cVar, eVar, j, z8vVar, i2, z, f2);
        } else {
            e2(cVar, eVar, j, z8vVar, i2, z, f2);
        }
    }

    public void Z1(yq9 yq9Var, mdu mduVar) {
        o oVar = this.t;
        if (oVar != null) {
            oVar.i1(yq9Var, mduVar);
        }
    }

    @Override // xsna.tny
    public final long a() {
        return this.d;
    }

    public final void a2(long j, float f2, izs<? super tdu, s3q0> izsVar, mdu mduVar) {
        LayoutNode layoutNode = this.q;
        if (mduVar != null) {
            if (izsVar != null) {
                uzw.a("both ways to create layers shouldn't be used together");
            }
            if (this.Q != mduVar) {
                this.Q = null;
                j2(null, false);
                this.Q = mduVar;
            }
            if (this.P == null) {
                p a2 = voy.a(layoutNode);
                w470 w470Var = this.M;
                if (w470Var == null) {
                    w470 w470Var2 = new w470(this, new x470(this));
                    this.M = w470Var2;
                    w470Var = w470Var2;
                }
                f fVar = this.N;
                m490 D = a2.D(w470Var, fVar, mduVar);
                D.k(this.d);
                D.h(j);
                this.P = D;
                layoutNode.K = true;
                fVar.invoke();
            }
        } else {
            if (this.Q != null) {
                this.Q = null;
                j2(null, false);
            }
            j2(izsVar, false);
        }
        if (!h9x.b(this.D, j)) {
            voy.a(layoutNode).s(-4.0f);
            this.D = j;
            m490 m490Var = this.P;
            if (m490Var != null) {
                m490Var.h(j);
            } else {
                o oVar = this.u;
                if (oVar != null) {
                    oVar.P1();
                }
            }
            layoutNode.X(this);
            androidx.compose.ui.node.f.R0(this);
            p pVar = layoutNode.o;
            if (pVar != null) {
                pVar.z(layoutNode);
            }
        }
        this.E = f2;
        if (this == layoutNode.G.d) {
            voy.a(layoutNode).getRectManager().e(layoutNode);
        }
        if (this.l) {
            return;
        }
        E0(J0());
    }

    @Override // xsna.tny
    public final tny b0() {
        if (!D1().o) {
            uzw.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        R1();
        return this.u;
    }

    public final void b2(oh50 oh50Var, boolean z, boolean z2) {
        long j;
        m490 m490Var = this.P;
        if (m490Var != null) {
            if (this.w) {
                if (z2) {
                    long y1 = y1();
                    float f2 = oh50Var.a;
                    float f3 = oh50Var.b;
                    if (oh50Var.c >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        long j2 = this.d;
                        if (f2 <= ((int) (j2 >> 32)) && oh50Var.d >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f3 <= ((int) (j2 & 4294967295L))) {
                            float intBitsToFloat = Float.intBitsToFloat((int) (y1 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (y1 & 4294967295L));
                            float f4 = (intBitsToFloat - (oh50Var.c - oh50Var.a)) / 2.0f;
                            if (f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                f2 -= f4;
                            } else {
                                float f5 = (-intBitsToFloat) / 2.0f;
                                if (f2 < f5) {
                                    f2 = f5;
                                }
                            }
                            float f6 = (intBitsToFloat2 - (oh50Var.d - oh50Var.b)) / 2.0f;
                            if (f6 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                f3 -= f6;
                            } else {
                                float f7 = (-intBitsToFloat2) / 2.0f;
                                if (f3 < f7) {
                                    f3 = f7;
                                }
                            }
                            j = (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
                            float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
                            float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
                            long j3 = this.d;
                            float f8 = (int) (j3 >> 32);
                            int i2 = (int) (y1 >> 32);
                            float f9 = (int) (j3 & 4294967295L);
                            int i3 = (int) (y1 & 4294967295L);
                            oh50Var.a(intBitsToFloat3, intBitsToFloat4, Math.min(Float.intBitsToFloat(i2) + f8, Math.max(f8, Float.intBitsToFloat(i2) + intBitsToFloat3)), Math.min(Float.intBitsToFloat(i3) + f9, Math.max(f9, Float.intBitsToFloat(i3) + intBitsToFloat4)));
                        }
                    }
                    j = 0;
                    float intBitsToFloat32 = Float.intBitsToFloat((int) (j >> 32));
                    float intBitsToFloat42 = Float.intBitsToFloat((int) (j & 4294967295L));
                    long j32 = this.d;
                    float f82 = (int) (j32 >> 32);
                    int i22 = (int) (y1 >> 32);
                    float f92 = (int) (j32 & 4294967295L);
                    int i32 = (int) (y1 & 4294967295L);
                    oh50Var.a(intBitsToFloat32, intBitsToFloat42, Math.min(Float.intBitsToFloat(i22) + f82, Math.max(f82, Float.intBitsToFloat(i22) + intBitsToFloat32)), Math.min(Float.intBitsToFloat(i32) + f92, Math.max(f92, Float.intBitsToFloat(i32) + intBitsToFloat42)));
                } else if (z) {
                    long j4 = this.d;
                    oh50Var.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (int) (j4 >> 32), (int) (j4 & 4294967295L));
                }
                if (oh50Var.b()) {
                    return;
                }
            }
            m490Var.a(oh50Var, false);
        }
        long j5 = this.D;
        float f10 = (int) (j5 >> 32);
        oh50Var.a += f10;
        oh50Var.c += f10;
        float f11 = (int) (j5 & 4294967295L);
        oh50Var.b += f11;
        oh50Var.d += f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r5v5, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
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
    @Override // xsna.jp10, xsna.zox
    public final Object c() {
        LayoutNode layoutNode = this.q;
        if (!layoutNode.G.d(64)) {
            return null;
        }
        D1();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        for (q630.c cVar = layoutNode.G.e; cVar != null; cVar = cVar.f) {
            if ((cVar.d & 64) != 0) {
                ?? r6 = 0;
                ytl ytlVar = cVar;
                while (ytlVar != 0) {
                    if (ytlVar instanceof mi90) {
                        ref$ObjectRef.element = ((mi90) ytlVar).N(layoutNode.z, ref$ObjectRef.element);
                    } else if ((ytlVar.d & 64) != 0 && (ytlVar instanceof ytl)) {
                        q630.c cVar2 = ytlVar.q;
                        int i2 = 0;
                        ytlVar = ytlVar;
                        r6 = r6;
                        while (cVar2 != null) {
                            if ((cVar2.d & 64) != 0) {
                                i2++;
                                r6 = r6;
                                if (i2 == 1) {
                                    ytlVar = cVar2;
                                } else {
                                    if (r6 == 0) {
                                        r6 = new ci50(new q630.c[16]);
                                    }
                                    if (ytlVar != 0) {
                                        r6.b(ytlVar);
                                        ytlVar = 0;
                                    }
                                    r6.b(cVar2);
                                }
                            }
                            cVar2 = cVar2.g;
                            ytlVar = ytlVar;
                            r6 = r6;
                        }
                        if (i2 == 1) {
                        }
                    }
                    ytlVar = itl.b(r6);
                }
            }
        }
        return ref$ObjectRef.element;
    }

    public final long c1(o oVar, long j) {
        if (oVar == this) {
            return j;
        }
        o oVar2 = this.u;
        return (oVar2 == null || epx.f(oVar, oVar2)) ? v1(j) : v1(oVar2.c1(oVar, j));
    }

    public final void c2() {
        if (this.P != null) {
            if (this.Q != null) {
                this.Q = null;
            }
            j2(null, false);
            this.q.e0(false);
        }
    }

    @Override // xsna.l590
    public final boolean d1() {
        return (this.P == null || this.v || !this.q.e()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [xsna.ci50] */
    public final void d2(dp10 dp10Var) {
        o oVar;
        dp10 dp10Var2 = this.B;
        if (dp10Var != dp10Var2) {
            this.B = dp10Var;
            LayoutNode layoutNode = this.q;
            int i2 = 0;
            if (dp10Var2 == null || dp10Var.getWidth() != dp10Var2.getWidth() || dp10Var.getHeight() != dp10Var2.getHeight()) {
                int width = dp10Var.getWidth();
                int height = dp10Var.getHeight();
                m490 m490Var = this.P;
                if (m490Var != null) {
                    m490Var.k((width << 32) | (height & 4294967295L));
                } else if (layoutNode.g() && (oVar = this.u) != null) {
                    oVar.P1();
                }
                s0((height & 4294967295L) | (width << 32));
                if (this.x != null) {
                    k2(false);
                }
                boolean g2 = a570.g(4);
                q630.c D1 = D1();
                if (g2 || (D1 = D1.f) != null) {
                    for (q630.c H1 = H1(g2); H1 != null && (H1.e & 4) != 0; H1 = H1.g) {
                        if ((H1.d & 4) != 0) {
                            ytl ytlVar = H1;
                            ?? r9 = 0;
                            while (ytlVar != 0) {
                                if (ytlVar instanceof lio) {
                                    ((lio) ytlVar).i1();
                                } else if ((ytlVar.d & 4) != 0 && (ytlVar instanceof ytl)) {
                                    q630.c cVar = ytlVar.q;
                                    int i3 = 0;
                                    ytlVar = ytlVar;
                                    r9 = r9;
                                    while (cVar != null) {
                                        if ((cVar.d & 4) != 0) {
                                            i3++;
                                            r9 = r9;
                                            if (i3 == 1) {
                                                ytlVar = cVar;
                                            } else {
                                                if (r9 == 0) {
                                                    r9 = new ci50(new q630.c[16]);
                                                }
                                                if (ytlVar != 0) {
                                                    r9.b(ytlVar);
                                                    ytlVar = 0;
                                                }
                                                r9.b(cVar);
                                            }
                                        }
                                        cVar = cVar.g;
                                        ytlVar = ytlVar;
                                        r9 = r9;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                ytlVar = itl.b(r9);
                            }
                        }
                        if (H1 == D1) {
                            break;
                        }
                    }
                }
                p pVar = layoutNode.o;
                if (pVar != null) {
                    pVar.z(layoutNode);
                }
                layoutNode.X(this);
            }
            eh50<gt1> eh50Var = this.C;
            if ((eh50Var == null || eh50Var.e == 0) && dp10Var.q().isEmpty()) {
                return;
            }
            eh50<gt1> eh50Var2 = this.C;
            Map<gt1, Integer> q = dp10Var.q();
            if (eh50Var2 != null && eh50Var2.e == q.size()) {
                Object[] objArr = eh50Var2.b;
                int[] iArr = eh50Var2.c;
                long[] jArr = eh50Var2.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i4 = 0;
                loop0: while (true) {
                    long j = jArr[i4];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        for (int i6 = i2; i6 < i5; i6++) {
                            if ((255 & j) < 128) {
                                int i7 = (i4 << 3) + i6;
                                Object obj = objArr[i7];
                                int i8 = iArr[i7];
                                Integer num = q.get((gt1) obj);
                                if (num == null || num.intValue() != i8) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i5 != 8) {
                            return;
                        }
                    }
                    if (i4 == length) {
                        return;
                    }
                    i4++;
                    i2 = 0;
                }
            }
            layoutNode.H.p.z.g();
            eh50<gt1> eh50Var3 = this.C;
            if (eh50Var3 == null) {
                eh50Var3 = pp70.a();
                this.C = eh50Var3;
            }
            eh50Var3.d();
            for (Map.Entry<gt1, Integer> entry : dp10Var.q().entrySet()) {
                eh50Var3.i(entry.getKey(), entry.getValue().intValue());
            }
        }
    }

    @Override // xsna.tny
    public final boolean e() {
        return D1().o;
    }

    public final void e2(q630.c cVar, e eVar, long j, z8v z8vVar, int i2, boolean z, float f2) {
        int i3;
        if (cVar == null) {
            O1(eVar, j, z8vVar, i2, z);
            return;
        }
        if (!eVar.c(cVar)) {
            e2(y470.a(cVar, eVar.a()), eVar, j, z8vVar, i2, z, f2);
            return;
        }
        if (!eVar.f(cVar)) {
            Y1(y470.a(cVar, eVar.a()), eVar, j, z8vVar, i2, z, f2, false);
            return;
        }
        h hVar = new h(cVar, eVar, j, z8vVar, i2, z, f2);
        wg50 wg50Var = z8vVar.c;
        fh50<Object> fh50Var = z8vVar.b;
        if (z8vVar.d != e43.h(z8vVar)) {
            long c2 = z8vVar.c();
            int i4 = z8vVar.d;
            int h2 = e43.h(z8vVar);
            z8vVar.d = h2;
            z8vVar.d(h2 + 1, fh50Var.b);
            z8vVar.d++;
            fh50Var.j(cVar);
            wg50Var.a(ad0.b(f2, z, false));
            hVar.invoke();
            z8vVar.d = h2;
            long c3 = z8vVar.c();
            if (z8vVar.d + 1 >= e43.h(z8vVar) || ahn.k(c2, c3) <= 0) {
                z8vVar.d(z8vVar.d + 1, fh50Var.b);
            } else {
                z8vVar.d(i4 + 1, ahn.w(c3) ? z8vVar.d + 2 : z8vVar.d + 1);
            }
            z8vVar.d = i4;
            return;
        }
        int i5 = z8vVar.d;
        int i6 = i5 + 1;
        z8vVar.d(i6, fh50Var.b);
        z8vVar.d++;
        fh50Var.j(cVar);
        wg50Var.a(ad0.b(f2, z, false));
        hVar.invoke();
        z8vVar.d = i5;
        if (i6 == e43.h(z8vVar) || ahn.w(z8vVar.c())) {
            int i7 = z8vVar.d;
            int i8 = i7 + 1;
            fh50Var.o(i8);
            if (i8 < 0 || i8 >= (i3 = wg50Var.b)) {
                alk.D("Index must be between 0 and size");
                throw null;
            }
            long[] jArr = wg50Var.a;
            long j2 = jArr[i8];
            if (i8 != i3 - 1) {
                jw5.g(jArr, jArr, i8, i7 + 2, i3);
            }
            wg50Var.b--;
        }
    }

    public final long f1(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - n0();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - m0();
        float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat / 2.0f);
        float max2 = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat2 / 2.0f);
        return (Float.floatToRawIntBits(max2) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
    }

    public final zhf0 g2() {
        if (D1().o) {
            tny p = jgz.p(this);
            oh50 oh50Var = this.F;
            if (oh50Var == null) {
                oh50Var = new oh50();
                this.F = oh50Var;
            }
            long f1 = f1(y1());
            int i2 = (int) (f1 >> 32);
            oh50Var.a = -Float.intBitsToFloat(i2);
            int i3 = (int) (f1 & 4294967295L);
            oh50Var.b = -Float.intBitsToFloat(i3);
            oh50Var.c = Float.intBitsToFloat(i2) + n0();
            oh50Var.d = Float.intBitsToFloat(i3) + m0();
            for (o oVar = this; oVar != p; oVar = oVar.u) {
                oVar.b2(oh50Var, false, true);
                if (!oh50Var.b()) {
                }
            }
            return new zhf0(oh50Var.a, oh50Var.b, oh50Var.c, oh50Var.d);
        }
        return zhf0.e;
    }

    @Override // xsna.azl
    public final float getDensity() {
        return this.q.z.getDensity();
    }

    @Override // xsna.azl
    public final float getFontScale() {
        return this.q.z.getFontScale();
    }

    @Override // xsna.apx
    public final LayoutDirection getLayoutDirection() {
        return this.q.A;
    }

    public final float h1(long j, long j2) {
        if (n0() >= Float.intBitsToFloat((int) (j2 >> 32)) && m0() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long f1 = f1(j2);
        float intBitsToFloat = Float.intBitsToFloat((int) (f1 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (f1 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? -intBitsToFloat3 : intBitsToFloat3 - n0());
        long floatToRawIntBits = (Float.floatToRawIntBits(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat((int) (j & 4294967295L)) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? -r9 : r9 - m0())) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
        if (intBitsToFloat > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || intBitsToFloat2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            int i2 = (int) (floatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i2) <= intBitsToFloat) {
                int i3 = (int) (floatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i3) <= intBitsToFloat2) {
                    float intBitsToFloat4 = Float.intBitsToFloat(i2);
                    float intBitsToFloat5 = Float.intBitsToFloat(i3);
                    return (intBitsToFloat5 * intBitsToFloat5) + (intBitsToFloat4 * intBitsToFloat4);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void h2(o oVar, float[] fArr) {
        if (epx.f(oVar, this)) {
            return;
        }
        this.u.h2(oVar, fArr);
        if (!h9x.b(this.D, 0L)) {
            float[] fArr2 = V;
            en10.e(fArr2);
            long j = this.D;
            en10.i(-((int) (j >> 32)), -((int) (j & 4294967295L)), fArr2);
            en10.h(fArr, fArr2);
        }
        m490 m490Var = this.P;
        if (m490Var != null) {
            m490Var.g(fArr);
        }
    }

    public final void i1(yq9 yq9Var, mdu mduVar) {
        m490 m490Var = this.P;
        if (m490Var != null) {
            m490Var.c(yq9Var, mduVar);
            return;
        }
        long j = this.D;
        float f2 = (int) (j >> 32);
        float f3 = (int) (j & 4294967295L);
        yq9Var.p(f2, f3);
        l1(yq9Var, mduVar);
        yq9Var.p(-f2, -f3);
    }

    public final void i2(o oVar, float[] fArr) {
        for (o oVar2 = this; !epx.f(oVar2, oVar); oVar2 = oVar2.u) {
            m490 m490Var = oVar2.P;
            if (m490Var != null) {
                m490Var.d(fArr);
            }
            if (!h9x.b(oVar2.D, 0L)) {
                float[] fArr2 = V;
                en10.e(fArr2);
                en10.i((int) (r1 >> 32), (int) (r1 & 4294967295L), fArr2);
                en10.h(fArr, fArr2);
            }
        }
    }

    public final void j2(izs<? super tdu, s3q0> izsVar, boolean z) {
        p pVar;
        if (izsVar != null && this.Q != null) {
            uzw.a("layerBlock can't be provided when explicitLayer is provided");
        }
        LayoutNode layoutNode = this.q;
        boolean z2 = (!z && this.x == izsVar && epx.f(this.y, layoutNode.z) && this.z == layoutNode.A) ? false : true;
        this.y = layoutNode.z;
        this.z = layoutNode.A;
        boolean e2 = layoutNode.e();
        f fVar = this.N;
        if (!e2 || izsVar == null) {
            this.x = null;
            m490 m490Var = this.P;
            if (m490Var != null) {
                if (!fco0.e(m490Var.mo409getUnderlyingMatrixsQKQjiQ())) {
                    layoutNode.X(this);
                }
                m490Var.destroy();
                this.P = null;
                layoutNode.K = true;
                fVar.invoke();
                if (D1().o && layoutNode.g() && (pVar = layoutNode.o) != null) {
                    pVar.z(layoutNode);
                }
            }
            this.O = false;
            return;
        }
        this.x = izsVar;
        if (this.P != null) {
            if (z2) {
                k2(true);
                return;
            }
            return;
        }
        p a2 = voy.a(layoutNode);
        w470 w470Var = this.M;
        if (w470Var == null) {
            w470 w470Var2 = new w470(this, new x470(this));
            this.M = w470Var2;
            w470Var = w470Var2;
        }
        m490 D = a2.D(w470Var, fVar, null);
        D.k(this.d);
        D.h(this.D);
        this.P = D;
        k2(true);
        layoutNode.K = true;
        fVar.invoke();
    }

    @Override // xsna.tny
    public final long k(long j) {
        if (!D1().o) {
            uzw.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return voy.a(this.q).k(D(j));
    }

    @Override // xsna.tny
    public final void k0(float[] fArr) {
        p a2 = voy.a(this.q);
        o f2 = f2(jgz.p(this));
        i2(f2, fArr);
        if (a2 instanceof qn10) {
            ((qn10) a2).d(fArr);
            return;
        }
        long k = f2.k(0L);
        if ((9223372034707292159L & k) != 9205357640488583168L) {
            en10.i(Float.intBitsToFloat((int) (k >> 32)), Float.intBitsToFloat((int) (k & 4294967295L)), fArr);
        }
    }

    public final void k2(boolean z) {
        p pVar;
        if (this.Q != null) {
            return;
        }
        m490 m490Var = this.P;
        if (m490Var == null) {
            if (this.x == null) {
                return;
            }
            uzw.b("null layer with a non-null layerBlock");
            return;
        }
        izs<? super tdu, s3q0> izsVar = this.x;
        if (izsVar == null) {
            throw pm0.f("updateLayerParameters requires a non-null layerBlock");
        }
        sfg0 sfg0Var = T;
        sfg0Var.c();
        LayoutNode layoutNode = this.q;
        sfg0Var.t = layoutNode.z;
        sfg0Var.u = layoutNode.A;
        sfg0Var.s = pli.w(this.d);
        voy.a(layoutNode).getSnapshotObserver().a.d(this, R, new i(izsVar, this));
        jny jnyVar = this.G;
        if (jnyVar == null) {
            jnyVar = new jny();
            this.G = jnyVar;
        }
        jny jnyVar2 = U;
        jnyVar2.getClass();
        jnyVar2.a = jnyVar.a;
        jnyVar2.b = jnyVar.b;
        jnyVar2.c = jnyVar.c;
        jnyVar2.d = jnyVar.d;
        jnyVar2.e = jnyVar.e;
        jnyVar2.f = jnyVar.f;
        jnyVar2.g = jnyVar.g;
        jnyVar2.h = jnyVar.h;
        jnyVar2.i = jnyVar.i;
        jnyVar.a = sfg0Var.c;
        jnyVar.b = sfg0Var.d;
        jnyVar.c = sfg0Var.f;
        jnyVar.d = sfg0Var.g;
        jnyVar.e = sfg0Var.k;
        jnyVar.f = sfg0Var.l;
        jnyVar.g = sfg0Var.m;
        jnyVar.h = sfg0Var.n;
        jnyVar.i = sfg0Var.o;
        m490Var.j(sfg0Var);
        boolean z2 = this.w;
        this.w = sfg0Var.q;
        this.A = sfg0Var.e;
        boolean z3 = jnyVar2.a == jnyVar.a && jnyVar2.b == jnyVar.b && jnyVar2.c == jnyVar.c && jnyVar2.d == jnyVar.d && jnyVar2.e == jnyVar.e && jnyVar2.f == jnyVar.f && jnyVar2.g == jnyVar.g && jnyVar2.h == jnyVar.h && lkp0.a(jnyVar2.i, jnyVar.i);
        if (z && ((!z3 || z2 != this.w) && (pVar = layoutNode.o) != null)) {
            pVar.z(layoutNode);
        }
        if (z3) {
            return;
        }
        layoutNode.X(this);
        if (layoutNode.Q > 0) {
            voy.a(layoutNode).b(layoutNode);
        }
    }

    public final void l1(yq9 yq9Var, mdu mduVar) {
        yq9 yq9Var2;
        mdu mduVar2;
        q630.c E1 = E1(4);
        if (E1 == null) {
            Z1(yq9Var, mduVar);
            return;
        }
        LayoutNode layoutNode = this.q;
        layoutNode.getClass();
        toy sharedDrawScope = voy.a(layoutNode).getSharedDrawScope();
        long w = pli.w(this.d);
        sharedDrawScope.getClass();
        ci50 ci50Var = null;
        while (E1 != null) {
            if (E1 instanceof lio) {
                yq9Var2 = yq9Var;
                mduVar2 = mduVar;
                sharedDrawScope.c(yq9Var2, w, this, (lio) E1, mduVar2);
            } else {
                yq9Var2 = yq9Var;
                mduVar2 = mduVar;
                if ((E1.d & 4) != 0 && (E1 instanceof ytl)) {
                    int i2 = 0;
                    for (q630.c cVar = ((ytl) E1).q; cVar != null; cVar = cVar.g) {
                        if ((cVar.d & 4) != 0) {
                            i2++;
                            if (i2 == 1) {
                                E1 = cVar;
                            } else {
                                if (ci50Var == null) {
                                    ci50Var = new ci50(new q630.c[16]);
                                }
                                if (E1 != null) {
                                    ci50Var.b(E1);
                                    E1 = null;
                                }
                                ci50Var.b(cVar);
                            }
                        }
                    }
                    if (i2 == 1) {
                        yq9Var = yq9Var2;
                        mduVar = mduVar2;
                    }
                }
            }
            E1 = itl.b(ci50Var);
            yq9Var = yq9Var2;
            mduVar = mduVar2;
        }
    }

    public final boolean l2(long j) {
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        m490 m490Var = this.P;
        return m490Var == null || !this.w || m490Var.f(j);
    }

    public abstract void m1();

    @Override // androidx.compose.ui.node.f, xsna.fp10
    public final LayoutNode o1() {
        return this.q;
    }

    @Override // xsna.tny
    public final long p(long j) {
        if (!D1().o) {
            uzw.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return S(jgz.p(this), voy.a(this.q).p(j));
    }

    @Override // xsna.tra0
    public void p0(long j, float f2, izs<? super tdu, s3q0> izsVar) {
        if (this.r) {
            a2(w1().r, f2, izsVar, null);
        } else {
            a2(j, f2, izsVar, null);
        }
    }

    @Override // xsna.tra0
    public void q0(long j, float f2, mdu mduVar) {
        if (this.r) {
            a2(w1().r, f2, null, mduVar);
        } else {
            a2(j, f2, null, mduVar);
        }
    }

    public final o q1(o oVar) {
        LayoutNode layoutNode = oVar.q;
        LayoutNode layoutNode2 = this.q;
        if (layoutNode == layoutNode2) {
            q630.c D1 = oVar.D1();
            q630.c D12 = D1();
            if (!D12.b.o) {
                uzw.b("visitLocalAncestors called on an unattached node");
            }
            for (q630.c cVar = D12.b.f; cVar != null; cVar = cVar.f) {
                if ((cVar.d & 2) != 0 && cVar == D1) {
                    return oVar;
                }
            }
            return this;
        }
        while (layoutNode.q > layoutNode2.q) {
            layoutNode = layoutNode.I();
        }
        LayoutNode layoutNode3 = layoutNode2;
        while (layoutNode3.q > layoutNode.q) {
            layoutNode3 = layoutNode3.I();
        }
        while (layoutNode != layoutNode3) {
            layoutNode = layoutNode.I();
            layoutNode3 = layoutNode3.I();
            if (layoutNode == null || layoutNode3 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (layoutNode3 != layoutNode2) {
            if (layoutNode != oVar.q) {
                return layoutNode.G.c;
            }
            return oVar;
        }
        return this;
    }

    public final long v1(long j) {
        long j2 = this.D;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        m490 m490Var = this.P;
        return m490Var != null ? m490Var.e(floatToRawIntBits, true) : floatToRawIntBits;
    }

    @Override // xsna.tny
    public final long w(tny tnyVar, long j) {
        return S(tnyVar, j);
    }

    public abstract m600 w1();

    @Override // xsna.tny
    public final tny y() {
        boolean z = D1().o;
        LayoutNode layoutNode = this.q;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (LayoutNode layoutNode2 = layoutNode; layoutNode2 != null; layoutNode2 = layoutNode2.I()) {
                sb.append("\n|");
                sb.append(layoutNode2);
                sb.append(" isAttached=");
                sb.append(layoutNode2.e());
                sb.append(" modifier=");
                sb.append(layoutNode2.L);
                sb.append(" tail=");
                sb.append(D1());
            }
            uzw.b(sb.toString());
        }
        R1();
        return layoutNode.G.d.u;
    }

    public final long y1() {
        return this.y.p1(this.q.B.g());
    }

    @Override // xsna.tny
    public final zhf0 z(tny tnyVar, boolean z) {
        if (!D1().o) {
            uzw.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!tnyVar.e()) {
            uzw.b("LayoutCoordinates " + tnyVar + " is not attached!");
        }
        o f2 = f2(tnyVar);
        f2.R1();
        o q1 = q1(f2);
        oh50 oh50Var = this.F;
        if (oh50Var == null) {
            oh50Var = new oh50();
            this.F = oh50Var;
        }
        oh50Var.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        oh50Var.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        oh50Var.c = (int) (tnyVar.a() >> 32);
        oh50Var.d = (int) (tnyVar.a() & 4294967295L);
        while (f2 != q1) {
            f2.b2(oh50Var, z, false);
            if (oh50Var.b()) {
                return zhf0.e;
            }
            f2 = f2.u;
        }
        W0(q1, oh50Var, z);
        return new zhf0(oh50Var.a, oh50Var.b, oh50Var.c, oh50Var.d);
    }

    @Override // androidx.compose.ui.node.f
    public final tny g1() {
        return this;
    }
}
