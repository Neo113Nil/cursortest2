package cg;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class g implements Comparable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final io.sentry.hints.j f3925c = new io.sentry.hints.j(7);

    /* renamed from: d, reason: collision with root package name */
    public static final g f3926d = new g(-31557014167219200L, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final g f3927e = new g(31556889864403199L, 999999999);

    /* renamed from: a, reason: collision with root package name */
    public final long f3928a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3929b;

    public g(long j, int i5) {
        this.f3928a = j;
        this.f3929b = i5;
        if (-31557014167219200L > j || j >= 31556889864403200L) {
            throw new IllegalArgumentException("Instant exceeds minimum or maximum instant");
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        int i5 = i.f3930a;
        Intrinsics.checkNotNullParameter(this, "instant");
        m mVar = new m();
        mVar.f3937a = this.f3928a;
        mVar.f3938b = this.f3929b;
        return mVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g other = (g) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        int compare = Intrinsics.compare(this.f3928a, other.f3928a);
        return compare != 0 ? compare : Intrinsics.compare(this.f3929b, other.f3929b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f3928a == gVar.f3928a && this.f3929b == gVar.f3929b;
    }

    public final int hashCode() {
        long j = this.f3928a;
        return (this.f3929b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        long j;
        int[] iArr;
        StringBuilder sb2 = new StringBuilder();
        Intrinsics.checkNotNullParameter(this, "instant");
        long j6 = this.f3928a;
        long j10 = j6 / 86400;
        long j11 = 0;
        if ((j6 ^ 86400) < 0 && j10 * 86400 != j6) {
            j10--;
        }
        long j12 = j6 % 86400;
        int i5 = (int) (j12 + (86400 & (((j12 ^ 86400) & ((-j12) | j12)) >> 63)));
        long j13 = (j10 + 719528) - 60;
        if (j13 < 0) {
            long j14 = 146097;
            long j15 = ((j13 + 1) / j14) - 1;
            j = 0;
            j11 = 400 * j15;
            j13 += (-j15) * j14;
        } else {
            j = 0;
        }
        long j16 = 400;
        long j17 = ((j16 * j13) + 591) / 146097;
        long j18 = 365;
        long j19 = 4;
        long j20 = 100;
        long j21 = j13 - ((j17 / j16) + (((j17 / j19) + (j18 * j17)) - (j17 / j20)));
        if (j21 < j) {
            j17--;
            j21 = j13 - ((j17 / j16) + (((j17 / j19) + (j18 * j17)) - (j17 / j20)));
        }
        int i10 = (int) j21;
        int i11 = ((i10 * 5) + 2) / 153;
        int i12 = ((i11 + 2) % 12) + 1;
        int i13 = (i10 - (((i11 * 306) + 5) / 10)) + 1;
        int i14 = (int) (j17 + j11 + (i11 / 10));
        int i15 = i5 / 3600;
        int i16 = i5 - (i15 * 3600);
        int i17 = i16 / 60;
        int i18 = i16 - (i17 * 60);
        int i19 = 0;
        if (Math.abs(i14) < 1000) {
            StringBuilder sb3 = new StringBuilder();
            if (i14 >= 0) {
                sb3.append(i14 + AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
                Intrinsics.checkNotNullExpressionValue(sb3.deleteCharAt(0), "deleteCharAt(...)");
            } else {
                sb3.append(i14 - AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
                Intrinsics.checkNotNullExpressionValue(sb3.deleteCharAt(1), "deleteCharAt(...)");
            }
            sb2.append((CharSequence) sb3);
        } else {
            if (i14 >= 10000) {
                sb2.append('+');
            }
            sb2.append(i14);
        }
        sb2.append('-');
        j.a(sb2, sb2, i12);
        sb2.append('-');
        j.a(sb2, sb2, i13);
        sb2.append('T');
        j.a(sb2, sb2, i15);
        sb2.append(':');
        j.a(sb2, sb2, i17);
        sb2.append(':');
        j.a(sb2, sb2, i18);
        int i20 = this.f3929b;
        if (i20 != 0) {
            sb2.append('.');
            while (true) {
                int i21 = i19 + 1;
                iArr = j.f3931a;
                if (i20 % iArr[i21] != 0) {
                    break;
                }
                i19 = i21;
            }
            int i22 = i19 - (i19 % 3);
            String valueOf = String.valueOf((i20 / iArr[i22]) + iArr[9 - i22]);
            Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
            String substring = valueOf.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            sb2.append(substring);
        }
        sb2.append('Z');
        return sb2.toString();
    }
}
