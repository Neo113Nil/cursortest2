package x1;

import Sc.InterfaceC3999a;
import k1.C7459e;
import k1.C7464j;
import org.jetbrains.annotations.NotNull;

/* renamed from: x1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10639n {
    public static final boolean a(@NotNull x xVar) {
        return !xVar.j() && xVar.g();
    }

    public static final boolean b(@NotNull x xVar) {
        return (xVar.n() || !xVar.j() || xVar.g()) ? false : true;
    }

    public static final boolean c(@NotNull x xVar) {
        return xVar.j() && !xVar.g();
    }

    @InterfaceC3999a
    public static final boolean d(@NotNull x xVar, long j11) {
        long f7 = xVar.f();
        float g10 = C7459e.g(f7);
        float h11 = C7459e.h(f7);
        return g10 < 0.0f || g10 > ((float) ((int) (j11 >> 32))) || h11 < 0.0f || h11 > ((float) ((int) (j11 & 4294967295L)));
    }

    public static final boolean e(@NotNull x xVar, long j11, long j12) {
        if (xVar.l() != 1) {
            return d(xVar, j11);
        }
        long f7 = xVar.f();
        float g10 = C7459e.g(f7);
        float h11 = C7459e.h(f7);
        return g10 < (-C7464j.f(j12)) || g10 > C7464j.f(j12) + ((float) ((int) (j11 >> 32))) || h11 < (-C7464j.d(j12)) || h11 > C7464j.d(j12) + ((float) ((int) (j11 & 4294967295L)));
    }

    public static final long f(@NotNull x xVar) {
        return h(xVar, false);
    }

    public static final long g(@NotNull x xVar) {
        return h(xVar, true);
    }

    private static final long h(x xVar, boolean z11) {
        long j11 = C7459e.j(xVar.f(), xVar.i());
        if (z11 || !xVar.n()) {
            return j11;
        }
        return 0L;
    }

    public static final boolean i(@NotNull x xVar) {
        return !C7459e.d(h(xVar, false), 0L);
    }

    public static final boolean j(@NotNull x xVar) {
        return !C7459e.d(h(xVar, true), 0L);
    }
}
