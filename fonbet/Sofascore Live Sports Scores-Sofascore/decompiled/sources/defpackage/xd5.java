package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class xd5 implements Comparable {

    @NotNull
    public static final wd5 b = new wd5(null);
    public static final long c = wkn.u(4611686018427387903L);
    public static final long d = wkn.u(-4611686018427387903L);
    public static final long e = 9223372036854759646L;
    public final long a;

    public static final long a(long j, long j2) {
        long j3 = j2 / 1000000;
        long p = wkn.p(j, j3);
        if (-4611686018426L > p || p >= 4611686018427L) {
            return wkn.u(p);
        }
        return wkn.w((p * 1000000) + (j2 - (j3 * 1000000)));
    }

    public static final void b(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String U = StringsKt.U(i3, String.valueOf(i2));
            int i4 = -1;
            int length = U.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (U.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) U, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) U, 0, i6);
            }
        }
        sb.append(str);
    }

    public static int c(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.e(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return j < 0 ? -i : i;
    }

    public static final boolean d(long j, long j2) {
        return j == j2;
    }

    public static final long e(long j) {
        return ((((int) j) & 1) != 1 || g(j)) ? k(j, be5.MILLISECONDS) : j >> 1;
    }

    public static final int f(long j) {
        if (g(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
    }

    public static final boolean g(long j) {
        return j == c || j == d;
    }

    public static final long h(long j, long j2) {
        return i(j, m(j2));
    }

    public static final long i(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? a(j >> 1, j2 >> 1) : a(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            return (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) ? wkn.u(j3 / 1000000) : wkn.w(j3);
        }
        long p = wkn.p(j >> 1, j2 >> 1);
        if (p != 9223372036854759646L) {
            return (p == 4611686018427387903L || p == -4611686018427387903L) ? wkn.u(p) : wkn.v(p);
        }
        a70.p("Summing infinite durations of different signs yields an undefined result.");
        return 0L;
    }

    public static final double j(long j) {
        be5 be5Var = be5.MILLISECONDS;
        if (j == c) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == d) {
            return Double.NEGATIVE_INFINITY;
        }
        return ce5.a(j >> 1, (((int) j) & 1) == 0 ? be5.NANOSECONDS : be5Var, be5Var);
    }

    public static final long k(long j, be5 be5Var) {
        if (j == c) {
            return Long.MAX_VALUE;
        }
        if (j == d) {
            return Long.MIN_VALUE;
        }
        return be5Var.a.convert(j >> 1, ((((int) j) & 1) == 0 ? be5.NANOSECONDS : be5.MILLISECONDS).a);
    }

    public static String l(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == c) {
            return "Infinity";
        }
        if (j == d) {
            return "-Infinity";
        }
        int i = 0;
        boolean z = j < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (j < 0) {
            j = m(j);
        }
        long k = k(j, be5.DAYS);
        int k2 = g(j) ? 0 : (int) (k(j, be5.HOURS) % 24);
        int k3 = g(j) ? 0 : (int) (k(j, be5.MINUTES) % 60);
        int k4 = g(j) ? 0 : (int) (k(j, be5.SECONDS) % 60);
        int f = f(j);
        boolean z2 = k != 0;
        boolean z3 = k2 != 0;
        boolean z4 = k3 != 0;
        boolean z5 = (k4 == 0 && f == 0) ? false : true;
        if (z2) {
            sb.append(k);
            sb.append('d');
            i = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(k2);
            sb.append('h');
            i = i2;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(k3);
            sb.append('m');
            i = i3;
        }
        if (z5) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (k4 != 0 || z2 || z3 || z4) {
                b(sb, k4, f, 9, "s", false);
            } else if (f >= 1000000) {
                b(sb, f / 1000000, f % 1000000, 6, "ms", false);
            } else if (f >= 1000) {
                b(sb, f / 1000, f % 1000, 3, "us", false);
            } else {
                sb.append(f);
                sb.append("ns");
            }
            i = i4;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long m(long j) {
        long j2 = ((-(j >> 1)) << 1) + (((int) j) & 1);
        b.getClass();
        int i = zd5.a;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.a, ((xd5) obj).a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xd5) {
            return this.a == ((xd5) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return l(this.a);
    }
}
