package cg;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.time.TimeMark;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class o implements TimeMark, Comparable {
    public static long a(long j) {
        long j6;
        long j10;
        n.f3939a.getClass();
        long nanoTime = System.nanoTime() - n.f3940b;
        e unit = e.f3916b;
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (((j - 1) | 1) == LongCompanionObject.MAX_VALUE) {
            if (j < 0) {
                b.f3911b.getClass();
                j10 = b.f3913d;
            } else {
                b.f3911b.getClass();
                j10 = b.f3912c;
            }
            return b.h(j10);
        }
        long j11 = nanoTime - j;
        if (((j11 ^ nanoTime) & (~(j11 ^ j))) >= 0) {
            return d.g(j11, unit);
        }
        e eVar = e.f3918d;
        if (unit.compareTo(eVar) < 0) {
            long b10 = f.b(1L, eVar, unit);
            long j12 = (nanoTime / b10) - (j / b10);
            long j13 = (nanoTime % b10) - (j % b10);
            a aVar = b.f3911b;
            return b.e(d.g(j12, eVar), d.g(j13, unit));
        }
        if (j11 < 0) {
            b.f3911b.getClass();
            j6 = b.f3913d;
        } else {
            b.f3911b.getClass();
            j6 = b.f3912c;
        }
        return b.h(j6);
    }
}
