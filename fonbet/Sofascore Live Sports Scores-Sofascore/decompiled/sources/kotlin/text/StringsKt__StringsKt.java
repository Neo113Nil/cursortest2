package kotlin.text;

import defpackage.fx4;
import defpackage.k13;
import defpackage.ljg;
import defpackage.llf;
import defpackage.nh0;
import defpackage.ogj;
import defpackage.ph0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 4, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes7.dex */
public class StringsKt__StringsKt extends c {
    public static final void A(int i) {
        if (i >= 0) {
            return;
        }
        ogj.h(ljg.j(i, "Limit must be non-negative, but was "));
    }

    public static final List B(int i, CharSequence charSequence, String str, boolean z) {
        A(i);
        int i2 = 0;
        int w = w(0, charSequence, str, z);
        if (w == -1 || i == 1) {
            return kotlin.collections.a.c(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i3 = 10;
        if (z2 && i <= 10) {
            i3 = i;
        }
        ArrayList arrayList = new ArrayList(i3);
        do {
            arrayList.add(charSequence.subSequence(i2, w).toString());
            i2 = str.length() + w;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            w = w(i2, charSequence, str, z);
        } while (w != -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    public static List split$default(CharSequence charSequence, String[] strArr, final boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        charSequence.getClass();
        strArr.getClass();
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() > 0) {
                return B(i, charSequence, str, z);
            }
        }
        A(i);
        final List asList = Arrays.asList(strArr);
        asList.getClass();
        fx4<IntRange> fx4Var = new fx4(charSequence, i, new Function2() { // from class: kotlin.text.e
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object obj4;
                Pair pair;
                Pair pair2;
                boolean z2;
                Object obj5;
                CharSequence charSequence2 = (CharSequence) obj2;
                int intValue = ((Integer) obj3).intValue();
                charSequence2.getClass();
                List list = asList;
                boolean z3 = z;
                if (z3 || list.size() != 1) {
                    if (intValue < 0) {
                        intValue = 0;
                    }
                    IntRange intRange = new IntRange(intValue, charSequence2.length(), 1);
                    boolean z4 = charSequence2 instanceof String;
                    int i3 = intRange.c;
                    int i4 = intRange.b;
                    if (z4) {
                        if ((i3 > 0 && intValue <= i4) || (i3 < 0 && i4 <= intValue)) {
                            int i5 = intValue;
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z2 = z3;
                                        obj5 = null;
                                        break;
                                    }
                                    obj5 = it.next();
                                    String str2 = (String) obj5;
                                    z2 = z3;
                                    if (c.p(str2, 0, (String) charSequence2, i5, str2.length(), z2)) {
                                        break;
                                    }
                                    z3 = z2;
                                }
                                String str3 = (String) obj5;
                                if (str3 == null) {
                                    if (i5 == i4) {
                                        break;
                                    }
                                    i5 += i3;
                                    z3 = z2;
                                } else {
                                    pair = new Pair(Integer.valueOf(i5), str3);
                                    break;
                                }
                            }
                            pair2 = pair;
                        }
                        pair2 = null;
                    } else {
                        if ((i3 > 0 && intValue <= i4) || (i3 < 0 && i4 <= intValue)) {
                            int i6 = intValue;
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        obj4 = null;
                                        break;
                                    }
                                    obj4 = it2.next();
                                    String str4 = (String) obj4;
                                    if (StringsKt__StringsKt.z(str4, 0, charSequence2, i6, str4.length(), z3)) {
                                        break;
                                    }
                                }
                                String str5 = (String) obj4;
                                if (str5 == null) {
                                    if (i6 == i4) {
                                        break;
                                    }
                                    i6 += i3;
                                } else {
                                    pair = new Pair(Integer.valueOf(i6), str5);
                                    break;
                                }
                            }
                            pair2 = pair;
                        }
                        pair2 = null;
                    }
                } else {
                    String str6 = (String) CollectionsKt.C0(list);
                    int P = StringsKt.P(charSequence2, str6, intValue, false, 4);
                    if (P >= 0) {
                        pair2 = new Pair(Integer.valueOf(P), str6);
                    }
                    pair2 = null;
                }
                if (pair2 != null) {
                    return new Pair(pair2.a, Integer.valueOf(((String) pair2.b).length()));
                }
                return null;
            }
        });
        ArrayList arrayList = new ArrayList(k13.r(new nh0(fx4Var, 3), 10));
        for (IntRange intRange : fx4Var) {
            intRange.getClass();
            arrayList.add(charSequence.subSequence(intRange.a, intRange.b + 1).toString());
        }
        return arrayList;
    }

    public static final int w(int i, CharSequence charSequence, String str, boolean z) {
        charSequence.getClass();
        str.getClass();
        return (z || !(charSequence instanceof String)) ? x(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int x(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        kotlin.ranges.a h;
        int i3 = i;
        int i4 = i2;
        if (z2) {
            int N = StringsKt.N(charSequence);
            if (i3 > N) {
                i3 = N;
            }
            if (i4 < 0) {
                i4 = 0;
            }
            h = llf.h(i3, i4);
        } else {
            if (i3 < 0) {
                i3 = 0;
            }
            int length = charSequence.length();
            if (i4 > length) {
                i4 = length;
            }
            h = new IntRange(i3, i4, 1);
        }
        int i5 = h.c;
        int i6 = h.b;
        int i7 = h.a;
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            if ((i5 <= 0 || i7 > i6) && (i5 >= 0 || i6 > i7)) {
                return -1;
            }
            int i8 = i7;
            while (!z(charSequence2, 0, charSequence, i8, charSequence2.length(), z)) {
                if (i8 == i6) {
                    return -1;
                }
                i8 += i5;
            }
            return i8;
        }
        if ((i5 <= 0 || i7 > i6) && (i5 >= 0 || i6 > i7)) {
            return -1;
        }
        int i9 = i7;
        while (true) {
            String str = (String) charSequence2;
            if (c.p(str, 0, (String) charSequence, i9, str.length(), z)) {
                return i9;
            }
            if (i9 == i6) {
                return -1;
            }
            i9 += i5;
        }
    }

    public static final int y(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(ph0.P(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (a.a(c, charAt, z)) {
                    return i;
                }
            }
            if (i == length) {
                return -1;
            }
            i++;
        }
    }

    public static final boolean z(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!a.a(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }
}
