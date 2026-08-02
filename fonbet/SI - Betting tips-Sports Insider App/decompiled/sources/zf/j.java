package zf;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public class j extends i {
    public static long b(long j, long j6, long j10) {
        if (j6 <= j10) {
            return j < j6 ? j6 : j > j10 ? j10 : j;
        }
        throw new IllegalArgumentException(d9.e.j(k.p(j10, "Cannot coerce value to an empty range: maximum ", " is less than minimum "), j6, '.'));
    }

    public static kotlin.ranges.a c(IntRange intRange, int i5) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        i.a(i5 > 0, Integer.valueOf(i5));
        a aVar = kotlin.ranges.a.f19233d;
        int i10 = intRange.f19234a;
        int i11 = intRange.f19235b;
        if (intRange.f19236c <= 0) {
            i5 = -i5;
        }
        aVar.getClass();
        return new kotlin.ranges.a(i10, i11, i5);
    }

    public static IntRange d(int i5, int i10) {
        if (i10 > Integer.MIN_VALUE) {
            return new IntRange(i5, i10 - 1, 1);
        }
        IntRange.f19231e.getClass();
        return IntRange.f19232f;
    }
}
