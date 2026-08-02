package r0;

import fd.InterfaceC6512o;
import java.util.List;
import k1.C7459e;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import x1.C10638m;

/* loaded from: classes8.dex */
public final class Y {
    private static final float a(long j11) {
        if (C7459e.g(j11) == 0.0f && C7459e.h(j11) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(C7459e.g(j11), C7459e.h(j11)))) * 180.0f) / 3.1415927f;
    }

    public static final long b(@NotNull C10638m c10638m, boolean z11) {
        List<x1.x> b11 = c10638m.b();
        int size = b11.size();
        long j11 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            x1.x xVar = b11.get(i12);
            if (xVar.g() && xVar.j()) {
                j11 = C7459e.k(j11, z11 ? xVar.f() : xVar.i());
                i11++;
            }
        }
        if (i11 == 0) {
            return 9205357640488583168L;
        }
        return C7459e.c(i11, j11);
    }

    public static final float c(@NotNull C10638m c10638m, boolean z11) {
        long b11 = b(c10638m, z11);
        float f7 = 0.0f;
        if (C7459e.d(b11, 9205357640488583168L)) {
            return 0.0f;
        }
        List<x1.x> b12 = c10638m.b();
        int size = b12.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            x1.x xVar = b12.get(i12);
            if (xVar.g() && xVar.j()) {
                i11++;
                f7 = C7459e.e(C7459e.j(z11 ? xVar.f() : xVar.i(), b11)) + f7;
            }
        }
        return f7 / i11;
    }

    public static final float d(@NotNull C10638m c10638m) {
        List<x1.x> b11 = c10638m.b();
        int size = b11.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = 1;
            if (i11 >= size) {
                break;
            }
            x1.x xVar = b11.get(i11);
            if (!xVar.j() || !xVar.g()) {
                i13 = 0;
            }
            i12 += i13;
            i11++;
        }
        if (i12 >= 2) {
            long b12 = b(c10638m, true);
            long b13 = b(c10638m, false);
            List<x1.x> b14 = c10638m.b();
            int size2 = b14.size();
            float f7 = 0.0f;
            float f11 = 0.0f;
            for (int i14 = 0; i14 < size2; i14++) {
                x1.x xVar2 = b14.get(i14);
                if (xVar2.g() && xVar2.j()) {
                    long f12 = xVar2.f();
                    long j11 = C7459e.j(xVar2.i(), b13);
                    long j12 = C7459e.j(f12, b12);
                    float a11 = a(j12) - a(j11);
                    float e11 = C7459e.e(C7459e.k(j12, j11)) / 2.0f;
                    if (a11 > 180.0f) {
                        a11 -= 360.0f;
                    } else if (a11 < -180.0f) {
                        a11 += 360.0f;
                    }
                    f11 += a11 * e11;
                    f7 += e11;
                }
            }
            if (f7 != 0.0f) {
                return f11 / f7;
            }
        }
        return 0.0f;
    }

    public static Object e(x1.F f7, InterfaceC6512o interfaceC6512o, kotlin.coroutines.d dVar) {
        Object b11 = C9140t.b(f7, new X(interfaceC6512o, null), dVar);
        return b11 == Wc.a.COROUTINE_SUSPENDED ? b11 : Unit.f71690a;
    }
}
