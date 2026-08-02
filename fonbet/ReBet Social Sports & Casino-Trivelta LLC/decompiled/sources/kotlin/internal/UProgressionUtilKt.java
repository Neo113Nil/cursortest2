package kotlin.internal;

import com.facebook.react.uimanager.ViewProps;
import com.google.crypto.tink.integration.android.b;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.c;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0006\u001a'\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\t¨\u0006\u0012"}, d2 = {"differenceModulo", "Lkotlin/UInt;", "a", b.f37029b, "c", "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", ViewProps.START, ViewProps.END, "step", "", "getProgressionLastElement-Nkh28Cs", "", "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UProgressionUtilKt {
    /* renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    private static final int m1356differenceModuloWZ9TVnA(int i10, int i11, int i12) {
        int compare;
        int a10 = kotlin.b.a(i10, i12);
        int a11 = kotlin.b.a(i11, i12);
        compare = Integer.compare(a10 ^ Integer.MIN_VALUE, a11 ^ Integer.MIN_VALUE);
        int m242constructorimpl = UInt.m242constructorimpl(a10 - a11);
        return compare >= 0 ? m242constructorimpl : UInt.m242constructorimpl(m242constructorimpl + i12);
    }

    /* renamed from: differenceModulo-sambcqE, reason: not valid java name */
    private static final long m1357differenceModulosambcqE(long j10, long j11, long j12) {
        int compare;
        long a10 = c.a(j10, j12);
        long a11 = c.a(j11, j12);
        compare = Long.compare(a10 ^ Long.MIN_VALUE, a11 ^ Long.MIN_VALUE);
        long m321constructorimpl = ULong.m321constructorimpl(a10 - a11);
        return compare >= 0 ? m321constructorimpl : ULong.m321constructorimpl(m321constructorimpl + j12);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m1358getProgressionLastElement7ftBX0g(long j10, long j11, long j12) {
        int compare;
        int compare2;
        if (j12 > 0) {
            compare2 = Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
            return compare2 >= 0 ? j11 : ULong.m321constructorimpl(j11 - m1357differenceModulosambcqE(j11, j10, ULong.m321constructorimpl(j12)));
        }
        if (j12 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        compare = Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
        return compare <= 0 ? j11 : ULong.m321constructorimpl(j11 + m1357differenceModulosambcqE(j10, j11, ULong.m321constructorimpl(-j12)));
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m1359getProgressionLastElementNkh28Cs(int i10, int i11, int i12) {
        int compare;
        int compare2;
        if (i12 > 0) {
            compare2 = Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE);
            if (compare2 < 0) {
                return UInt.m242constructorimpl(i11 - m1356differenceModuloWZ9TVnA(i11, i10, UInt.m242constructorimpl(i12)));
            }
        } else {
            if (i12 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            compare = Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE);
            if (compare > 0) {
                return UInt.m242constructorimpl(i11 + m1356differenceModuloWZ9TVnA(i10, i11, UInt.m242constructorimpl(-i12)));
            }
        }
        return i11;
    }
}
