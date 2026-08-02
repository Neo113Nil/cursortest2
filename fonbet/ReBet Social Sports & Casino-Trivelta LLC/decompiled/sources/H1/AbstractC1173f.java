package H1;

import e1.AbstractC4134a;
import e1.AbstractC4156x;

/* renamed from: H1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1173f {
    public static void a(long j10, e1.J j11, O[] oArr) {
        while (true) {
            if (j11.a() <= 1) {
                return;
            }
            int c10 = c(j11);
            int c11 = c(j11);
            int g10 = j11.g() + c11;
            if (c11 == -1 || c11 > j11.a()) {
                AbstractC4156x.i("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                g10 = j11.j();
            } else if (c10 == 4 && c11 >= 8) {
                int M10 = j11.M();
                int U10 = j11.U();
                int v10 = U10 == 49 ? j11.v() : 0;
                int M11 = j11.M();
                if (U10 == 47) {
                    j11.c0(1);
                }
                boolean z10 = M10 == 181 && (U10 == 49 || U10 == 47) && M11 == 3;
                if (U10 == 49) {
                    z10 &= v10 == 1195456820;
                }
                if (z10) {
                    b(j10, j11, oArr);
                }
            }
            j11.b0(g10);
        }
    }

    public static void b(long j10, e1.J j11, O[] oArr) {
        int M10 = j11.M();
        if ((M10 & 64) != 0) {
            j11.c0(1);
            int i10 = (M10 & 31) * 3;
            int g10 = j11.g();
            for (O o10 : oArr) {
                j11.b0(g10);
                o10.a(j11, i10);
                AbstractC4134a.g(j10 != -9223372036854775807L);
                o10.g(j10, 1, i10, 0, null);
            }
        }
    }

    public static int c(e1.J j10) {
        int i10 = 0;
        while (j10.a() != 0) {
            int M10 = j10.M();
            i10 += M10;
            if (M10 != 255) {
                return i10;
            }
        }
        return -1;
    }
}
