package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes.dex */
public class w extends r {
    public static final int b(int i11, @NotNull String string, @NotNull CharSequence charSequence, boolean z11) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return (z11 || !(charSequence instanceof String)) ? c(charSequence, string, i11, charSequence.length(), z11, false) : ((String) charSequence).indexOf(string, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(CharSequence charSequence, CharSequence charSequence2, int i11, int i12, boolean z11, boolean z12) {
        kotlin.ranges.e j11;
        if (z12) {
            int G11 = h.G(charSequence);
            if (i11 > G11) {
                i11 = G11;
            }
            if (i12 < 0) {
                i12 = 0;
            }
            j11 = kotlin.ranges.h.j(i11, i12);
        } else {
            if (i11 < 0) {
                i11 = 0;
            }
            int length = charSequence.length();
            if (i12 > length) {
                i12 = length;
            }
            j11 = new IntRange(i11, i12, 1);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int f71842a = j11.getF71842a();
            int f71843b = j11.getF71843b();
            int f71844c = j11.getF71844c();
            if ((f71844c <= 0 || f71842a > f71843b) && (f71844c >= 0 || f71843b > f71842a)) {
                return -1;
            }
            int i13 = f71842a;
            while (true) {
                boolean z13 = z11;
                if (r.a(0, i13, ((String) charSequence2).length(), (String) charSequence2, (String) charSequence, z13)) {
                    return i13;
                }
                if (i13 == f71843b) {
                    return -1;
                }
                i13 += f71844c;
                z11 = z13;
            }
        } else {
            boolean z14 = z11;
            int f71842a2 = j11.getF71842a();
            int f71843b2 = j11.getF71843b();
            int f71844c2 = j11.getF71844c();
            if ((f71844c2 <= 0 || f71842a2 > f71843b2) && (f71844c2 >= 0 || f71843b2 > f71842a2)) {
                return -1;
            }
            while (true) {
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                boolean z15 = z14;
                z14 = z15;
                if (i(charSequence4, 0, charSequence3, f71842a2, charSequence2.length(), z15)) {
                    return f71842a2;
                }
                if (f71842a2 == f71843b2) {
                    return -1;
                }
                f71842a2 += f71844c2;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    public static final int e(@NotNull CharSequence charSequence, @NotNull char[] chars, int i11, boolean z11) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z11 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(C7705l.X(chars), i11);
        }
        if (i11 < 0) {
            i11 = 0;
        }
        int G11 = h.G(charSequence);
        if (i11 > G11) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i11);
            for (char c11 : chars) {
                if (C7750a.a(c11, charAt, z11)) {
                    return i11;
                }
            }
            if (i11 == G11) {
                return -1;
            }
            i11++;
        }
    }

    public static int f(CharSequence charSequence, String string, int i11, int i12) {
        if ((i12 & 2) != 0) {
            i11 = h.G(charSequence);
        }
        int i13 = i11;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return !(charSequence instanceof String) ? c(charSequence, string, i13, 0, false, true) : ((String) charSequence).lastIndexOf(string, i13);
    }

    @NotNull
    public static final List g(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        return kotlin.sequences.l.C(h.c0(str, new String[]{"\r\n", "\n", "\r"}));
    }

    static Sequence h(CharSequence charSequence, String[] strArr, int i11) {
        j(i11);
        return new C7751b(charSequence, i11, new u(C7705l.e(strArr)));
    }

    public static final boolean i(@NotNull CharSequence charSequence, int i11, @NotNull CharSequence other, int i12, int i13, boolean z11) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i12 < 0 || i11 < 0 || i11 > charSequence.length() - i13 || i12 > other.length() - i13) {
            return false;
        }
        for (int i14 = 0; i14 < i13; i14++) {
            if (!C7750a.a(charSequence.charAt(i11 + i14), other.charAt(i12 + i14), z11)) {
                return false;
            }
        }
        return true;
    }

    public static final void j(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException(Ej.b.a(i11, "Limit must be non-negative, but was ").toString());
        }
    }

    private static final List k(CharSequence charSequence, String str, int i11) {
        j(i11);
        int b11 = b(0, str, charSequence, false);
        if (b11 == -1 || i11 == 1) {
            return C7714v.a0(charSequence.toString());
        }
        boolean z11 = i11 > 0;
        int i12 = 10;
        if (z11 && i11 <= 10) {
            i12 = i11;
        }
        ArrayList arrayList = new ArrayList(i12);
        int i13 = 0;
        do {
            arrayList.add(charSequence.subSequence(i13, b11).toString());
            i13 = str.length() + b11;
            if (z11 && arrayList.size() == i11 - 1) {
                break;
            }
            b11 = b(i13, str, charSequence, false);
        } while (b11 != -1);
        arrayList.add(charSequence.subSequence(i13, charSequence.length()).toString());
        return arrayList;
    }

    public static List l(CharSequence charSequence, char[] delimiters, int i11, int i12) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return k(charSequence, String.valueOf(delimiters[0]), i11);
        }
        j(i11);
        C7751b c7751b = new C7751b(charSequence, i11, new t(delimiters));
        Intrinsics.checkNotNullParameter(c7751b, "<this>");
        kotlin.sequences.x xVar = new kotlin.sequences.x(c7751b);
        ArrayList arrayList = new ArrayList(C7714v.z(xVar, 10));
        Iterator<Object> it = xVar.iterator();
        while (it.hasNext()) {
            arrayList.add(n(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    public static List m(CharSequence charSequence, String[] delimiters, int i11, int i12) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return k(charSequence, str, i11);
            }
        }
        Sequence h11 = h(charSequence, delimiters, i11);
        Intrinsics.checkNotNullParameter(h11, "<this>");
        kotlin.sequences.x xVar = new kotlin.sequences.x(h11);
        ArrayList arrayList = new ArrayList(C7714v.z(xVar, 10));
        Iterator<Object> it = xVar.iterator();
        while (it.hasNext()) {
            arrayList.add(n(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    @NotNull
    public static final String n(@NotNull CharSequence charSequence, @NotNull IntRange range) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return charSequence.subSequence(range.getStart().intValue(), range.getF71843b() + 1).toString();
    }
}
