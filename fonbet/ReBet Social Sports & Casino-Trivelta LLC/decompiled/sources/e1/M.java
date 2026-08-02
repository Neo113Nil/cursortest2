package e1;

import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes.dex */
public abstract class M {
    public static long a(c1.x xVar, long j10) {
        long j11 = 0;
        double d10 = 0.0d;
        while (j11 < j10) {
            long b10 = xVar.b(j11);
            if (b10 == -9223372036854775807L) {
                b10 = LongCompanionObject.MAX_VALUE;
            }
            d10 += (Math.min(b10, j10) - j11) / xVar.a(j11);
            j11 = b10;
        }
        return (long) Math.floor(d10);
    }

    public static long b(c1.x xVar, long j10, int i10) {
        AbstractC4134a.a(j10 >= 0);
        AbstractC4134a.a(i10 > 0);
        long b10 = xVar.b(Z.o1(j10, i10));
        if (b10 == -9223372036854775807L) {
            return -1L;
        }
        return Z.E(b10, i10);
    }

    public static float c(c1.x xVar, long j10, int i10) {
        AbstractC4134a.a(j10 >= 0);
        AbstractC4134a.a(i10 > 0);
        return xVar.a(Z.o1(j10, i10));
    }
}
