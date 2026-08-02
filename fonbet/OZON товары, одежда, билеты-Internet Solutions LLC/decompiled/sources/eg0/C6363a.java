package eg0;

import Ja.i;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: eg0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6363a implements Ma.c {
    private static long a(long j11) {
        return System.nanoTime() - ((System.currentTimeMillis() - j11) * 1000000);
    }

    @Override // Ma.c
    public final void onMetricsCollected(@NotNull Ma.b metrics, @NotNull i request, Ma.d dVar) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(request, "request");
        if (dVar == null) {
            return;
        }
        Map<Ja.e, Object> i11 = request.i();
        Object obj = i11 != null ? i11.get(e.f62328a) : null;
        C6364b c6364b = obj instanceof C6364b ? (C6364b) obj : null;
        if (c6364b != null) {
            c6364b.K(dVar.f());
            Long a11 = dVar.a();
            long longValue = a11 != null ? a11.longValue() : 0L;
            if (longValue > 0) {
                c6364b.P(dVar.e());
                c6364b.C(longValue);
            }
            Ma.a a12 = metrics.a();
            if (!a12.h()) {
                c6364b.B(a(a12.d()));
                c6364b.A(a(a12.c()));
                c6364b.O(a(a12.j()));
                c6364b.N(a(a12.i()));
                c6364b.M(a(a12.b()));
                c6364b.L(a(a12.a()));
            }
            c6364b.H(a(a12.g()));
            c6364b.G(a(a12.f()));
            c6364b.R(a(a12.l()));
            c6364b.Q(a(a12.k()));
            c6364b.T(a(a12.n()));
            c6364b.S(a(a12.m()));
            c6364b.J(a(a12.e()));
            c6364b.I(a(a12.g()));
        }
    }
}
