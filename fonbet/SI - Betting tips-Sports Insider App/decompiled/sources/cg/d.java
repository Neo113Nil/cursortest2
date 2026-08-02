package cg;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.d0;
import kotlin.text.z;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class d {
    public static final long a(String str) {
        e unit;
        char charAt;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        b.f3911b.getClass();
        char charAt2 = str.charAt(0);
        int i5 = (charAt2 == '+' || charAt2 == '-') ? 1 : 0;
        boolean z5 = i5 > 0 && StringsKt.S(str, '-');
        if (length <= i5) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i5) != 'P') {
            throw new IllegalArgumentException();
        }
        int i10 = i5 + 1;
        if (i10 == length) {
            throw new IllegalArgumentException();
        }
        e eVar = null;
        long j = 0;
        boolean z7 = false;
        while (i10 < length) {
            if (str.charAt(i10) != 'T') {
                int i11 = i10;
                while (i11 < str.length() && (('0' <= (charAt = str.charAt(i11)) && charAt < ':') || StringsKt.B("+-.", charAt))) {
                    i11++;
                }
                Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                String substring = str.substring(i10, i11);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                if (substring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = substring.length() + i10;
                if (length2 < 0 || length2 >= str.length()) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(substring));
                }
                char charAt3 = str.charAt(length2);
                int i12 = length2 + 1;
                if (z7) {
                    if (charAt3 == 'H') {
                        unit = e.f3921g;
                    } else if (charAt3 == 'M') {
                        unit = e.f3920f;
                    } else {
                        if (charAt3 != 'S') {
                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + charAt3);
                        }
                        unit = e.f3919e;
                    }
                } else {
                    if (charAt3 != 'D') {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + charAt3);
                    }
                    unit = e.f3922h;
                }
                if (eVar != null && eVar.compareTo(unit) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int F = StringsKt.F(substring, '.', 0, false, 6);
                if (unit != e.f3919e || F <= 0) {
                    j = b.e(j, g(e(substring), unit));
                } else {
                    Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
                    String substring2 = substring.substring(0, F);
                    Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                    long e7 = b.e(j, g(e(substring2), unit));
                    Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
                    String substring3 = substring.substring(F);
                    Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                    double parseDouble = Double.parseDouble(substring3);
                    Intrinsics.checkNotNullParameter(unit, "unit");
                    double a7 = f.a(parseDouble, unit, e.f3916b);
                    if (Double.isNaN(a7)) {
                        throw new IllegalArgumentException("Duration value cannot be NaN.");
                    }
                    long c2 = wf.b.c(a7);
                    j = b.e(e7, (-4611686018426999999L > c2 || c2 >= 4611686018427000000L) ? c(wf.b.c(f.a(parseDouble, unit, e.f3918d))) : d(c2));
                }
                eVar = unit;
                i10 = i12;
            } else {
                if (z7 || (i10 = i10 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z7 = true;
            }
        }
        return z5 ? b.h(j) : j;
    }

    public static final long b(long j) {
        long j6 = (j << 1) + 1;
        a aVar = b.f3911b;
        int i5 = c.f3915a;
        return j6;
    }

    public static final long c(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? b(zf.j.b(j, -4611686018427387903L, 4611686018427387903L)) : d(j * 1000000);
    }

    public static final long d(long j) {
        long j6 = j << 1;
        a aVar = b.f3911b;
        int i5 = c.f3915a;
        return j6;
    }

    public static final long e(String str) {
        char charAt;
        int length = str.length();
        int i5 = (length <= 0 || !StringsKt.B("+-", str.charAt(0))) ? 0 : 1;
        if (length - i5 > 16) {
            int i10 = i5;
            while (true) {
                if (i5 < length) {
                    char charAt2 = str.charAt(i5);
                    if (charAt2 != '0') {
                        if ('1' > charAt2 || charAt2 >= ':') {
                            break;
                        }
                    } else if (i10 == i5) {
                        i10++;
                    }
                    i5++;
                } else if (length - i10 > 16) {
                    if (str.charAt(0) == '-') {
                        return Long.MIN_VALUE;
                    }
                    return LongCompanionObject.MAX_VALUE;
                }
            }
        }
        return (!z.o(str, "+", false) || length <= 1 || '0' > (charAt = str.charAt(1)) || charAt >= ':') ? Long.parseLong(str) : Long.parseLong(d0.w(1, str));
    }

    public static final long f(int i5, e unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return unit.compareTo(e.f3919e) <= 0 ? d(f.c(i5, unit, e.f3916b)) : g(i5, unit);
    }

    public static final long g(long j, e unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        e eVar = e.f3916b;
        long c2 = f.c(4611686018426999999L, eVar, unit);
        return ((-c2) > j || j > c2) ? b(zf.j.b(f.b(j, unit, e.f3918d), -4611686018427387903L, 4611686018427387903L)) : d(f.c(j, unit, eVar));
    }
}
