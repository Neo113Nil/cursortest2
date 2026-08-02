package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public class t extends s {
    public static String b(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("    ", "indent");
        Intrinsics.checkNotNullParameter(str, "<this>");
        return bg.q.e(bg.q.f(new bg.k(4, str), new k2.d0(2)), "\n");
    }

    public static String c(String str) {
        int i5;
        Comparable comparable;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("", "newIndent");
        List K = StringsKt.K(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : K) {
            if (!StringsKt.H((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.v.k(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            i5 = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length = str2.length();
            while (true) {
                if (i5 >= length) {
                    i5 = -1;
                    break;
                }
                if (!CharsKt__CharJVMKt.a(str2.charAt(i5))) {
                    break;
                }
                i5++;
            }
            if (i5 == -1) {
                i5 = str2.length();
            }
            arrayList2.add(Integer.valueOf(i5));
        }
        Intrinsics.checkNotNullParameter(arrayList2, "<this>");
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int intValue = num != null ? num.intValue() : 0;
        int length2 = str.length();
        K.size();
        int e7 = kotlin.collections.u.e(K);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : K) {
            int i10 = i5 + 1;
            if (i5 < 0) {
                kotlin.collections.u.j();
                throw null;
            }
            String str3 = (String) obj2;
            if ((i5 == 0 || i5 == e7) && StringsKt.H(str3)) {
                str3 = null;
            } else {
                String line = d0.w(intValue, str3);
                if (line != null) {
                    Intrinsics.checkNotNullParameter(line, "line");
                    str3 = line;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i5 = i10;
        }
        StringBuilder sb2 = new StringBuilder(length2);
        CollectionsKt.I(arrayList3, sb2, "\n", null, 124);
        return sb2.toString();
    }

    public static String d(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("|", "marginPrefix");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("", "newIndent");
        Intrinsics.checkNotNullParameter("|", "marginPrefix");
        if (StringsKt.H("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List K = StringsKt.K(str);
        int length = str.length();
        K.size();
        int e7 = kotlin.collections.u.e(K);
        ArrayList arrayList = new ArrayList();
        Iterator it = K.iterator();
        int i5 = 0;
        while (true) {
            String line = null;
            if (!it.hasNext()) {
                StringBuilder sb2 = new StringBuilder(length);
                CollectionsKt.I(arrayList, sb2, "\n", null, 124);
                return sb2.toString();
            }
            Object next = it.next();
            int i10 = i5 + 1;
            if (i5 < 0) {
                kotlin.collections.u.j();
                throw null;
            }
            String str2 = (String) next;
            if ((i5 != 0 && i5 != e7) || !StringsKt.H(str2)) {
                int length2 = str2.length();
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        i11 = -1;
                        break;
                    }
                    if (!CharsKt__CharJVMKt.a(str2.charAt(i11))) {
                        break;
                    }
                    i11++;
                }
                if (i11 != -1 && z.n(str2, "|", i11, false)) {
                    int length3 = "|".length() + i11;
                    Intrinsics.checkNotNull(str2, "null cannot be cast to non-null type java.lang.String");
                    line = str2.substring(length3);
                    Intrinsics.checkNotNullExpressionValue(line, "substring(...)");
                }
                if (line != null) {
                    Intrinsics.checkNotNullParameter(line, "line");
                } else {
                    line = str2;
                }
            }
            if (line != null) {
                arrayList.add(line);
            }
            i5 = i10;
        }
    }
}
