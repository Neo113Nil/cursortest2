package androidx.compose.ui.node;

import J.a;
import N.l;
import N.o;
import X.j;
import X.k;
import X.p;
import X.q;
import X.r;
import e0.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class NodeCoordinator extends k implements V.a, Function1 {

    /* renamed from: f, reason: collision with root package name */
    public final LayoutNode f17596f;

    /* renamed from: g, reason: collision with root package name */
    public NodeCoordinator f17597g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17598h;

    /* renamed from: i, reason: collision with root package name */
    public Function1 f17599i;

    /* renamed from: j, reason: collision with root package name */
    public e0.d f17600j;

    /* renamed from: k, reason: collision with root package name */
    public e0.k f17601k;

    /* renamed from: l, reason: collision with root package name */
    public float f17602l;

    /* renamed from: m, reason: collision with root package name */
    public long f17603m;

    /* renamed from: n, reason: collision with root package name */
    public M.b f17604n;

    /* renamed from: o, reason: collision with root package name */
    public X.f f17605o;

    /* renamed from: p, reason: collision with root package name */
    public final Function0 f17606p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f17607q;

    /* renamed from: r, reason: collision with root package name */
    public static final e f17589r = new e(null);

    /* renamed from: s, reason: collision with root package name */
    public static final Function1 f17590s = d.f17609d;

    /* renamed from: t, reason: collision with root package name */
    public static final Function1 f17591t = c.f17608d;

    /* renamed from: u, reason: collision with root package name */
    public static final o f17592u = new o();

    /* renamed from: v, reason: collision with root package name */
    public static final X.f f17593v = new X.f();

    @NotNull
    private static final float[] tmpMatrix = N.k.b(null, 1, null);

    /* renamed from: w, reason: collision with root package name */
    public static final f f17594w = new a();

    /* renamed from: x, reason: collision with root package name */
    public static final f f17595x = new b();

    public static final class a implements f {
    }

    public static final class b implements f {
    }

    public static final class c extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final c f17608d = new c();

        public c() {
            super(1);
        }

        public final void a(NodeCoordinator coordinator) {
            Intrinsics.checkNotNullParameter(coordinator, "coordinator");
            coordinator.w();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((NodeCoordinator) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final d f17609d = new d();

        public d() {
            super(1);
        }

        public final void a(NodeCoordinator coordinator) {
            Intrinsics.checkNotNullParameter(coordinator, "coordinator");
            if (coordinator.J()) {
                X.f fVar = coordinator.f17605o;
                if (fVar == null) {
                    NodeCoordinator.S(coordinator, false, 1, null);
                    return;
                }
                NodeCoordinator.f17593v.a(fVar);
                NodeCoordinator.S(coordinator, false, 1, null);
                if (NodeCoordinator.f17593v.b(fVar)) {
                    return;
                }
                LayoutNode x10 = coordinator.x();
                androidx.compose.ui.node.b layoutDelegate = x10.getLayoutDelegate();
                if (layoutDelegate.b() > 0) {
                    if (layoutDelegate.c() || layoutDelegate.d()) {
                        LayoutNode.F(x10, false, 1, null);
                    }
                    layoutDelegate.h().o();
                }
                androidx.compose.ui.node.d owner = x10.getOwner();
                if (owner != null) {
                    owner.f(x10);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((NodeCoordinator) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class e {
        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public e() {
        }
    }

    public interface f {
    }

    public static final class g extends Lambda implements Function0 {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m44invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m44invoke() {
            NodeCoordinator D10 = NodeCoordinator.this.D();
            if (D10 != null) {
                D10.G();
            }
        }
    }

    public static final class h extends Lambda implements Function0 {
        public h(N.d dVar) {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m45invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m45invoke() {
            NodeCoordinator.this.r(null);
        }
    }

    public NodeCoordinator(LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f17596f = layoutNode;
        this.f17600j = x().getDensity();
        this.f17601k = x().getCom.facebook.react.uimanager.ViewProps.LAYOUT_DIRECTION java.lang.String();
        this.f17602l = 0.8f;
        this.f17603m = e0.g.f45452a.a();
        this.f17606p = new g();
    }

    private final r B() {
        j.b(x()).getSnapshotObserver();
        return null;
    }

    public static /* synthetic */ void O(NodeCoordinator nodeCoordinator, M.b bVar, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        nodeCoordinator.N(bVar, z10, z11);
    }

    public static /* synthetic */ void S(NodeCoordinator nodeCoordinator, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        nodeCoordinator.R(z10);
    }

    public final M.b A() {
        M.b bVar = this.f17604n;
        if (bVar != null) {
            return bVar;
        }
        M.b bVar2 = new M.b(0.0f, 0.0f, 0.0f, 0.0f);
        this.f17604n = bVar2;
        return bVar2;
    }

    public abstract a.b C();

    public final NodeCoordinator D() {
        return this.f17597g;
    }

    public final a.b E(int i10) {
        boolean a10 = p.a(i10);
        a.b C10 = C();
        if (!a10 && (C10 = C10.f()) == null) {
            return null;
        }
        for (a.b F10 = F(a10); F10 != null && (F10.b() & i10) != 0; F10 = F10.c()) {
            if ((F10.e() & i10) != 0) {
                return F10;
            }
            if (F10 == C10) {
                return null;
            }
        }
        return null;
    }

    public final a.b F(boolean z10) {
        a.b C10;
        if (x().getOuterCoordinator$ui_release() == this) {
            return x().getNodes().c();
        }
        if (!z10) {
            NodeCoordinator nodeCoordinator = this.f17597g;
            if (nodeCoordinator != null) {
                return nodeCoordinator.C();
            }
            return null;
        }
        NodeCoordinator nodeCoordinator2 = this.f17597g;
        if (nodeCoordinator2 == null || (C10 = nodeCoordinator2.C()) == null) {
            return null;
        }
        return C10.c();
    }

    public void G() {
        NodeCoordinator nodeCoordinator = this.f17597g;
        if (nodeCoordinator != null) {
            nodeCoordinator.G();
        }
    }

    public void H(N.d canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!x().B()) {
            this.f17607q = true;
        } else {
            B();
            new h(canvas);
            throw null;
        }
    }

    public final boolean I() {
        NodeCoordinator nodeCoordinator = this.f17597g;
        if (nodeCoordinator != null) {
            return nodeCoordinator.I();
        }
        return false;
    }

    public boolean J() {
        return false;
    }

    public long K(long j10) {
        if (!a()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        L();
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.f17597g) {
            j10 = nodeCoordinator.Q(j10);
        }
        return j10;
    }

    public final void L() {
        x().getLayoutDelegate().k();
    }

    public abstract void M(N.d dVar);

    public final void N(M.b bounds, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        float c10 = e0.g.c(z());
        bounds.g(bounds.b() + c10);
        bounds.h(bounds.c() + c10);
        float d10 = e0.g.d(z());
        bounds.i(bounds.d() + d10);
        bounds.f(bounds.a() + d10);
    }

    public final NodeCoordinator P(V.a aVar) {
        NodeCoordinator g10;
        V.c cVar = aVar instanceof V.c ? (V.c) aVar : null;
        if (cVar != null && (g10 = cVar.g()) != null) {
            return g10;
        }
        Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (NodeCoordinator) aVar;
    }

    public long Q(long j10) {
        return e0.h.c(j10, z());
    }

    public final void R(boolean z10) {
        if (this.f17599i != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Override // V.a
    public boolean a() {
        return !this.f17598h && x().A();
    }

    @Override // V.a
    public final long b() {
        return h();
    }

    @Override // V.a
    public M.f c(V.a sourceCoordinates, boolean z10) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        if (!a()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!sourceCoordinates.a()) {
            throw new IllegalStateException(("LayoutCoordinates " + sourceCoordinates + " is not attached!").toString());
        }
        NodeCoordinator P10 = P(sourceCoordinates);
        P10.L();
        NodeCoordinator s10 = s(P10);
        M.b A10 = A();
        A10.g(0.0f);
        A10.i(0.0f);
        A10.h(i.c(sourceCoordinates.b()));
        A10.f(i.b(sourceCoordinates.b()));
        NodeCoordinator nodeCoordinator = P10;
        while (nodeCoordinator != s10) {
            boolean z11 = z10;
            O(nodeCoordinator, A10, z11, false, 4, null);
            if (A10.e()) {
                return M.f.f7386e.a();
            }
            nodeCoordinator = nodeCoordinator.f17597g;
            Intrinsics.checkNotNull(nodeCoordinator);
            z10 = z11;
        }
        n(s10, A10, z10);
        return M.c.a(A10);
    }

    @Override // V.a
    public long d(long j10) {
        return j.b(x()).e(K(j10));
    }

    @Override // V.a
    public long e(V.a sourceCoordinates, long j10) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        if (sourceCoordinates instanceof V.c) {
            return M.d.g(sourceCoordinates.e(this, M.d.g(j10)));
        }
        NodeCoordinator P10 = P(sourceCoordinates);
        P10.L();
        NodeCoordinator s10 = s(P10);
        while (P10 != s10) {
            j10 = P10.Q(j10);
            P10 = P10.f17597g;
            Intrinsics.checkNotNull(P10);
        }
        return o(s10, j10);
    }

    @Override // V.a
    public final V.a f() {
        if (!a()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        L();
        return x().getOuterCoordinator$ui_release().f17597g;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        android.support.v4.media.session.b.a(obj);
        H(null);
        return Unit.INSTANCE;
    }

    public final void n(NodeCoordinator nodeCoordinator, M.b bVar, boolean z10) {
        if (nodeCoordinator == this) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.f17597g;
        if (nodeCoordinator2 != null) {
            nodeCoordinator2.n(nodeCoordinator, bVar, z10);
        }
        u(bVar, z10);
    }

    public final long o(NodeCoordinator nodeCoordinator, long j10) {
        if (nodeCoordinator == this) {
            return j10;
        }
        NodeCoordinator nodeCoordinator2 = this.f17597g;
        return (nodeCoordinator2 == null || Intrinsics.areEqual(nodeCoordinator, nodeCoordinator2)) ? t(j10) : t(nodeCoordinator2.o(nodeCoordinator, j10));
    }

    public final void p(N.d canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float c10 = e0.g.c(z());
        float d10 = e0.g.d(z());
        canvas.a(c10, d10);
        r(canvas);
        canvas.a(-c10, -d10);
    }

    public final void q(N.d canvas, l paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        canvas.b(new M.f(0.5f, 0.5f, i.c(h()) - 0.5f, i.b(h()) - 0.5f), paint);
    }

    public final void r(N.d dVar) {
        if (E(X.o.a(4)) == null) {
            M(dVar);
        } else {
            x().n();
            e0.j.b(b());
            throw null;
        }
    }

    public final NodeCoordinator s(NodeCoordinator other) {
        Intrinsics.checkNotNullParameter(other, "other");
        LayoutNode x10 = other.x();
        LayoutNode x11 = x();
        if (x10 == x11) {
            a.b C10 = other.C();
            a.b C11 = C();
            int a10 = X.o.a(2);
            if (!C11.a().g()) {
                throw new IllegalStateException("visitLocalAncestors called on an unattached node");
            }
            for (a.b f10 = C11.a().f(); f10 != null; f10 = f10.f()) {
                if ((f10.e() & a10) != 0 && f10 == C10) {
                    return other;
                }
            }
            return this;
        }
        while (x10.getDepth() > x11.getDepth()) {
            x10 = x10.t();
            Intrinsics.checkNotNull(x10);
        }
        while (x11.getDepth() > x10.getDepth()) {
            x11 = x11.t();
            Intrinsics.checkNotNull(x11);
        }
        while (x10 != x11) {
            x10 = x10.t();
            x11 = x11.t();
            if (x10 == null || x11 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (x11 != x()) {
            if (x10 != other.x()) {
                return x10.h();
            }
            return other;
        }
        return this;
    }

    public long t(long j10) {
        return e0.h.b(j10, z());
    }

    public final void u(M.b bVar, boolean z10) {
        float c10 = e0.g.c(z());
        bVar.g(bVar.b() - c10);
        bVar.h(bVar.c() - c10);
        float d10 = e0.g.d(z());
        bVar.i(bVar.d() - d10);
        bVar.f(bVar.a() - d10);
    }

    public final q w() {
        return null;
    }

    public LayoutNode x() {
        return this.f17596f;
    }

    public abstract X.l y();

    public long z() {
        return this.f17603m;
    }

    public V.a v() {
        return this;
    }
}
