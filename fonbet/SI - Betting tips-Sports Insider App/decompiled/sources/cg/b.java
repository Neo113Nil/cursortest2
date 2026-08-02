package cg;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class b implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f3911b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f3912c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f3913d;

    /* renamed from: a, reason: collision with root package name */
    public final long f3914a;

    static {
        int i5 = c.f3915a;
        f3912c = d.b(4611686018427387903L);
        f3913d = d.b(-4611686018427387903L);
    }

    public static final long a(long j, long j6) {
        long j10 = 1000000;
        long j11 = j6 / j10;
        long j12 = j + j11;
        if (-4611686018426L > j12 || j12 >= 4611686018427L) {
            return d.b(zf.j.b(j12, -4611686018427387903L, 4611686018427387903L));
        }
        return d.d((j12 * j10) + (j6 - (j11 * j10)));
    }

    public static final void b(StringBuilder sb2, int i5, int i10, int i11, String str, boolean z5) {
        sb2.append(i5);
        if (i10 != 0) {
            sb2.append('.');
            String L = StringsKt.L(i11, String.valueOf(i10));
            int i12 = -1;
            int length = L.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i13 = length - 1;
                    if (L.charAt(length) != '0') {
                        i12 = length;
                        break;
                    } else if (i13 < 0) {
                        break;
                    } else {
                        length = i13;
                    }
                }
            }
            int i14 = i12 + 1;
            if (z5 || i14 >= 3) {
                sb2.append((CharSequence) L, 0, ((i12 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            } else {
                sb2.append((CharSequence) L, 0, i14);
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            }
        }
        sb2.append(str);
    }

    public static final int c(long j) {
        if (d(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT) * 1000000 : (j >> 1) % 1000000000);
    }

    public static final boolean d(long j) {
        return j == f3912c || j == f3913d;
    }

    public static final long e(long j, long j6) {
        if (d(j)) {
            if (!d(j6) || (j6 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (d(j6)) {
            return j6;
        }
        int i5 = ((int) j) & 1;
        if (i5 != (((int) j6) & 1)) {
            return i5 == 1 ? a(j >> 1, j6 >> 1) : a(j6 >> 1, j >> 1);
        }
        long j10 = (j >> 1) + (j6 >> 1);
        return i5 == 0 ? (-4611686018426999999L > j10 || j10 >= 4611686018427000000L) ? d.b(j10 / 1000000) : d.d(j10) : d.c(j10);
    }

    public static final long f(long j, e unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == f3912c) {
            return LongCompanionObject.MAX_VALUE;
        }
        if (j == f3913d) {
            return Long.MIN_VALUE;
        }
        return f.b(j >> 1, (((int) j) & 1) == 0 ? e.f3916b : e.f3918d, unit);
    }

    public static String g(long j) {
        long j6;
        int f6;
        if (j == 0) {
            return "0s";
        }
        if (j == f3912c) {
            return "Infinity";
        }
        if (j == f3913d) {
            return "-Infinity";
        }
        int i5 = 0;
        boolean z5 = j < 0;
        StringBuilder sb2 = new StringBuilder();
        if (z5) {
            sb2.append('-');
        }
        long h10 = j < 0 ? h(j) : j;
        long f10 = f(h10, e.f3922h);
        int f11 = d(h10) ? 0 : (int) (f(h10, e.f3921g) % 24);
        if (d(h10)) {
            j6 = 0;
            f6 = 0;
        } else {
            j6 = 0;
            f6 = (int) (f(h10, e.f3920f) % 60);
        }
        int f12 = d(h10) ? 0 : (int) (f(h10, e.f3919e) % 60);
        int c2 = c(h10);
        boolean z7 = f10 != j6;
        boolean z10 = f11 != 0;
        boolean z11 = f6 != 0;
        boolean z12 = (f12 == 0 && c2 == 0) ? false : true;
        if (z7) {
            sb2.append(f10);
            sb2.append('d');
            i5 = 1;
        }
        if (z10 || (z7 && (z11 || z12))) {
            int i10 = i5 + 1;
            if (i5 > 0) {
                sb2.append(' ');
            }
            sb2.append(f11);
            sb2.append('h');
            i5 = i10;
        }
        if (z11 || (z12 && (z10 || z7))) {
            int i11 = i5 + 1;
            if (i5 > 0) {
                sb2.append(' ');
            }
            sb2.append(f6);
            sb2.append('m');
            i5 = i11;
        }
        if (z12) {
            int i12 = i5 + 1;
            if (i5 > 0) {
                sb2.append(' ');
            }
            if (f12 != 0 || z7 || z10 || z11) {
                b(sb2, f12, c2, 9, "s", false);
            } else if (c2 >= 1000000) {
                b(sb2, c2 / 1000000, c2 % 1000000, 6, "ms", false);
            } else if (c2 >= 1000) {
                b(sb2, c2 / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, c2 % AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, 3, "us", false);
            } else {
                sb2.append(c2);
                sb2.append("ns");
            }
            i5 = i12;
        }
        if (z5 && i5 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }

    public static final long h(long j) {
        long j6 = ((-(j >> 1)) << 1) + (((int) j) & 1);
        int i5 = c.f3915a;
        return j6;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((b) obj).f3914a;
        long j6 = this.f3914a;
        long j10 = j6 ^ j;
        if (j10 < 0 || (((int) j10) & 1) == 0) {
            return Intrinsics.compare(j6, j);
        }
        int i5 = (((int) j6) & 1) - (((int) j) & 1);
        return j6 < 0 ? -i5 : i5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f3914a == ((b) obj).f3914a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f3914a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return g(this.f3914a);
    }
}
