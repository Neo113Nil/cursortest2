package V;

import M.d;
import X.l;
import androidx.compose.ui.node.NodeCoordinator;
import e0.j;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final l f12313a;

    public c(l lookaheadDelegate) {
        Intrinsics.checkNotNullParameter(lookaheadDelegate, "lookaheadDelegate");
        this.f12313a = lookaheadDelegate;
    }

    @Override // V.a
    public boolean a() {
        return g().a();
    }

    @Override // V.a
    public long b() {
        l lVar = this.f12313a;
        return j.a(lVar.i(), lVar.g());
    }

    @Override // V.a
    public M.f c(a sourceCoordinates, boolean z10) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        return g().c(sourceCoordinates, z10);
    }

    @Override // V.a
    public long d(long j10) {
        return g().d(M.d.f(j10, h()));
    }

    @Override // V.a
    public long e(a sourceCoordinates, long j10) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        if (!(sourceCoordinates instanceof c)) {
            l a10 = d.a(this.f12313a);
            return M.d.f(e(a10.m(), j10), a10.k().v().e(sourceCoordinates, M.d.f7382a.a()));
        }
        l lVar = ((c) sourceCoordinates).f12313a;
        lVar.k().L();
        l y10 = g().s(lVar.k()).y();
        if (y10 != null) {
            long o10 = lVar.o(y10);
            long a11 = e0.h.a(MathKt.roundToInt(M.d.c(j10)), MathKt.roundToInt(M.d.d(j10)));
            long a12 = e0.h.a(e0.g.c(o10) + e0.g.c(a11), e0.g.d(o10) + e0.g.d(a11));
            long o11 = this.f12313a.o(y10);
            long a13 = e0.h.a(e0.g.c(a12) - e0.g.c(o11), e0.g.d(a12) - e0.g.d(o11));
            return M.e.a(e0.g.c(a13), e0.g.d(a13));
        }
        l a14 = d.a(lVar);
        long o12 = lVar.o(a14);
        long n10 = a14.n();
        long a15 = e0.h.a(e0.g.c(o12) + e0.g.c(n10), e0.g.d(o12) + e0.g.d(n10));
        long a16 = e0.h.a(MathKt.roundToInt(M.d.c(j10)), MathKt.roundToInt(M.d.d(j10)));
        long a17 = e0.h.a(e0.g.c(a15) + e0.g.c(a16), e0.g.d(a15) + e0.g.d(a16));
        l lVar2 = this.f12313a;
        long o13 = lVar2.o(d.a(lVar2));
        long n11 = d.a(lVar2).n();
        long a18 = e0.h.a(e0.g.c(o13) + e0.g.c(n11), e0.g.d(o13) + e0.g.d(n11));
        long a19 = e0.h.a(e0.g.c(a17) - e0.g.c(a18), e0.g.d(a17) - e0.g.d(a18));
        NodeCoordinator D10 = d.a(this.f12313a).k().D();
        Intrinsics.checkNotNull(D10);
        NodeCoordinator D11 = a14.k().D();
        Intrinsics.checkNotNull(D11);
        return D10.e(D11, M.e.a(e0.g.c(a19), e0.g.d(a19)));
    }

    @Override // V.a
    public a f() {
        l y10;
        if (!a()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        NodeCoordinator D10 = g().x().getOuterCoordinator$ui_release().D();
        if (D10 == null || (y10 = D10.y()) == null) {
            return null;
        }
        return y10.j();
    }

    public final NodeCoordinator g() {
        return this.f12313a.k();
    }

    public final long h() {
        l a10 = d.a(this.f12313a);
        a j10 = a10.j();
        d.a aVar = M.d.f7382a;
        return M.d.e(e(j10, aVar.a()), g().e(a10.k(), aVar.a()));
    }
}
