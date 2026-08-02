package kotlin.time;

import ed.InterfaceC6346b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import ve.C10310a;
import ve.EnumC10311b;

@InterfaceC6346b
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003\u0088\u0001\u0004\u0092\u0001\u00020\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/time/b;", "", "b", "a", "rawValue", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b implements Comparable<b> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final long f71983c;

    /* renamed from: d, reason: collision with root package name */
    private static final long f71984d;

    /* renamed from: a, reason: collision with root package name */
    private final long f71985a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/time/b$a;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.time.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        int i11 = C10310a.f102867a;
        f71983c = c.a(4611686018427387903L);
        f71984d = c.a(-4611686018427387903L);
    }

    private /* synthetic */ b(long j11) {
        this.f71985a = j11;
    }

    private static final long c(long j11, long j12) {
        long f7;
        long j13 = 1000000;
        long j14 = j12 / j13;
        long j15 = j11 + j14;
        if (-4611686018426L > j15 || j15 >= 4611686018427L) {
            return c.a(h.g(j15, -4611686018427387903L, 4611686018427387903L));
        }
        f7 = c.f((j15 * j13) + (j12 - (j14 * j13)));
        return f7;
    }

    private static final void d(StringBuilder sb2, int i11, int i12, int i13, String str, boolean z11) {
        sb2.append(i11);
        if (i12 != 0) {
            sb2.append('.');
            String P11 = kotlin.text.h.P(String.valueOf(i12), i13, '0');
            int i14 = -1;
            int length = P11.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i15 = length - 1;
                    if (P11.charAt(length) != '0') {
                        i14 = length;
                        break;
                    } else if (i15 < 0) {
                        break;
                    } else {
                        length = i15;
                    }
                }
            }
            int i16 = i14 + 1;
            if (z11 || i16 >= 3) {
                sb2.append((CharSequence) P11, 0, ((i14 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            } else {
                sb2.append((CharSequence) P11, 0, i16);
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            }
        }
        sb2.append(str);
    }

    public static final /* synthetic */ b e(long j11) {
        return new b(j11);
    }

    public static int f(long j11, long j12) {
        long j13 = j11 ^ j12;
        if (j13 >= 0 && (((int) j13) & 1) != 0) {
            int i11 = (((int) j11) & 1) - (((int) j12) & 1);
            return j11 < 0 ? -i11 : i11;
        }
        if (j11 < j12) {
            return -1;
        }
        return j11 == j12 ? 0 : 1;
    }

    public static final boolean g(long j11, long j12) {
        return j11 == j12;
    }

    public static final long h(long j11) {
        return ((((int) j11) & 1) != 1 || k(j11)) ? o(j11, EnumC10311b.MILLISECONDS) : j11 >> 1;
    }

    public static final long i(long j11) {
        long j12 = j11 >> 1;
        if ((((int) j11) & 1) == 0) {
            return j12;
        }
        if (j12 > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (j12 < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return j12 * 1000000;
    }

    public static final int j(long j11) {
        if (k(j11)) {
            return 0;
        }
        return (((int) j11) & 1) == 1 ? (int) (((j11 >> 1) % 1000) * 1000000) : (int) ((j11 >> 1) % 1000000000);
    }

    public static final boolean k(long j11) {
        return j11 == f71983c || j11 == f71984d;
    }

    public static final long l(long j11, long j12) {
        long e11;
        if (k(j11)) {
            if (!k(j12) || (j12 ^ j11) >= 0) {
                return j11;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (k(j12)) {
            return j12;
        }
        int i11 = ((int) j11) & 1;
        if (i11 != (((int) j12) & 1)) {
            return i11 == 1 ? c(j11 >> 1, j12 >> 1) : c(j12 >> 1, j11 >> 1);
        }
        long j13 = (j11 >> 1) + (j12 >> 1);
        if (i11 == 0) {
            return c.d(j13);
        }
        e11 = c.e(j13);
        return e11;
    }

    public static final double m(long j11, @NotNull EnumC10311b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j11 == f71983c) {
            return Double.POSITIVE_INFINITY;
        }
        if (j11 == f71984d) {
            return Double.NEGATIVE_INFINITY;
        }
        return d.a(j11 >> 1, (((int) j11) & 1) == 0 ? EnumC10311b.NANOSECONDS : EnumC10311b.MILLISECONDS, unit);
    }

    @NotNull
    public static final String n(long j11) {
        StringBuilder sb2 = new StringBuilder();
        if (j11 < 0) {
            sb2.append('-');
        }
        sb2.append("PT");
        long q11 = j11 < 0 ? q(j11) : j11;
        long o11 = o(q11, EnumC10311b.HOURS);
        boolean z11 = false;
        int o12 = k(q11) ? 0 : (int) (o(q11, EnumC10311b.MINUTES) % 60);
        int o13 = k(q11) ? 0 : (int) (o(q11, EnumC10311b.SECONDS) % 60);
        int j12 = j(q11);
        if (k(j11)) {
            o11 = 9999999999999L;
        }
        boolean z12 = o11 != 0;
        boolean z13 = (o13 == 0 && j12 == 0) ? false : true;
        if (o12 != 0 || (z13 && z12)) {
            z11 = true;
        }
        if (z12) {
            sb2.append(o11);
            sb2.append('H');
        }
        if (z11) {
            sb2.append(o12);
            sb2.append('M');
        }
        if (z13 || (!z12 && !z11)) {
            d(sb2, o13, j12, 9, "S", true);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public static final long o(long j11, @NotNull EnumC10311b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j11 == f71983c) {
            return Long.MAX_VALUE;
        }
        if (j11 == f71984d) {
            return Long.MIN_VALUE;
        }
        return d.b(j11 >> 1, (((int) j11) & 1) == 0 ? EnumC10311b.NANOSECONDS : EnumC10311b.MILLISECONDS, unit);
    }

    @NotNull
    public static String p(long j11) {
        long j12;
        int o11;
        if (j11 == 0) {
            return "0s";
        }
        if (j11 == f71983c) {
            return "Infinity";
        }
        if (j11 == f71984d) {
            return "-Infinity";
        }
        int i11 = 0;
        boolean z11 = j11 < 0;
        StringBuilder sb2 = new StringBuilder();
        if (z11) {
            sb2.append('-');
        }
        long q11 = j11 < 0 ? q(j11) : j11;
        long o12 = o(q11, EnumC10311b.DAYS);
        int o13 = k(q11) ? 0 : (int) (o(q11, EnumC10311b.HOURS) % 24);
        if (k(q11)) {
            j12 = 0;
            o11 = 0;
        } else {
            j12 = 0;
            o11 = (int) (o(q11, EnumC10311b.MINUTES) % 60);
        }
        int o14 = k(q11) ? 0 : (int) (o(q11, EnumC10311b.SECONDS) % 60);
        int j13 = j(q11);
        boolean z12 = o12 != j12;
        boolean z13 = o13 != 0;
        boolean z14 = o11 != 0;
        boolean z15 = (o14 == 0 && j13 == 0) ? false : true;
        if (z12) {
            sb2.append(o12);
            sb2.append('d');
            i11 = 1;
        }
        if (z13 || (z12 && (z14 || z15))) {
            int i12 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            sb2.append(o13);
            sb2.append('h');
            i11 = i12;
        }
        if (z14 || (z15 && (z13 || z12))) {
            int i13 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            sb2.append(o11);
            sb2.append('m');
            i11 = i13;
        }
        if (z15) {
            int i14 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            if (o14 != 0 || z12 || z13 || z14) {
                d(sb2, o14, j13, 9, "s", false);
            } else if (j13 >= 1000000) {
                d(sb2, j13 / 1000000, j13 % 1000000, 6, "ms", false);
            } else if (j13 >= 1000) {
                d(sb2, j13 / 1000, j13 % 1000, 3, "us", false);
            } else {
                sb2.append(j13);
                sb2.append("ns");
            }
            i11 = i14;
        }
        if (z11 && i11 > 1) {
            sb2.insert(1, '(').append(')');
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public static final long q(long j11) {
        long j12 = ((-(j11 >> 1)) << 1) + (((int) j11) & 1);
        int i11 = C10310a.f102867a;
        return j12;
    }

    @Override // java.lang.Comparable
    public final int compareTo(b bVar) {
        return f(this.f71985a, bVar.f71985a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f71985a == ((b) obj).f71985a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f71985a);
    }

    /* renamed from: r, reason: from getter */
    public final /* synthetic */ long getF71985a() {
        return this.f71985a;
    }

    @NotNull
    public final String toString() {
        return p(this.f71985a);
    }
}
