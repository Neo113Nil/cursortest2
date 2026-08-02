package kh;

import kotlin.jvm.internal.Intrinsics;
import lh.C5466a;

/* loaded from: classes3.dex */
public abstract class h {
    public static final C5466a a(C5466a c5466a) {
        Intrinsics.checkNotNullParameter(c5466a, "<this>");
        while (true) {
            C5466a y10 = c5466a.y();
            if (y10 == null) {
                return c5466a;
            }
            c5466a = y10;
        }
    }

    public static final void b(C5466a c5466a, mh.f pool) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        while (c5466a != null) {
            C5466a x10 = c5466a.x();
            c5466a.B(pool);
            c5466a = x10;
        }
    }

    public static final long c(C5466a c5466a) {
        Intrinsics.checkNotNullParameter(c5466a, "<this>");
        return d(c5466a, 0L);
    }

    public static final long d(C5466a c5466a, long j10) {
        do {
            j10 += c5466a.j() - c5466a.h();
            c5466a = c5466a.y();
        } while (c5466a != null);
        return j10;
    }
}
