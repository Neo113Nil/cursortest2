package kotlin.text;

import androidx.appcompat.widget.c1;
import com.google.android.material.navigation.NavigationBarView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = NavigationBarView.ITEM_GRAVITY_TOP_CENTER, xs = "kotlin/text/StringsKt")
@SourceDebugExtension({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1580:1\n78#1,22:1581\n112#1,5:1603\n129#1,5:1608\n78#1,22:1613\n106#1:1635\n78#1,22:1636\n112#1,5:1658\n123#1:1663\n112#1,5:1664\n129#1,5:1669\n140#1:1674\n129#1,5:1675\n78#1,22:1680\n112#1,5:1702\n129#1,5:1707\n1069#2,2:1712\n13050#3,2:1714\n13050#3,2:1716\n295#4,2:1718\n295#4,2:1720\n1563#4:1723\n1634#4,3:1724\n1563#4:1727\n1634#4,3:1728\n1#5:1722\n*S KotlinDebug\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n106#1:1581,22\n123#1:1603,5\n140#1:1608,5\n145#1:1613,22\n150#1:1635\n150#1:1636,22\n155#1:1658,5\n160#1:1663\n160#1:1664,5\n165#1:1669,5\n170#1:1674\n170#1:1675,5\n175#1:1680,22\n186#1:1702,5\n197#1:1707,5\n310#1:1712,2\n967#1:1714,2\n991#1:1716,2\n1030#1:1718,2\n1036#1:1720,2\n1401#1:1723\n1401#1:1724,3\n1427#1:1727\n1427#1:1728,3\n*E\n"})
/* loaded from: classes3.dex */
public class StringsKt__StringsKt extends z {
    public static final Pair p(CharSequence charSequence, Collection collection, int i5, boolean z5) {
        CharSequence charSequence2;
        Object obj;
        boolean z7;
        Object obj2;
        Object obj3;
        if (z5 || collection.size() != 1) {
            if (i5 < 0) {
                i5 = 0;
            }
            IntRange intRange = new IntRange(i5, charSequence.length(), 1);
            boolean z10 = charSequence instanceof String;
            int i10 = intRange.f19236c;
            int i11 = intRange.f19235b;
            if (!z10) {
                boolean z11 = z5;
                if ((i10 > 0 && i5 <= i11) || (i10 < 0 && i11 <= i5)) {
                    while (true) {
                        Iterator it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                charSequence2 = charSequence;
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            String str = (String) obj;
                            charSequence2 = charSequence;
                            boolean z12 = z11;
                            z11 = z12;
                            if (t(str, 0, charSequence2, i5, str.length(), z12)) {
                                break;
                            }
                            charSequence = charSequence2;
                        }
                        String str2 = (String) obj;
                        if (str2 == null) {
                            if (i5 == i11) {
                                break;
                            }
                            i5 += i10;
                            charSequence = charSequence2;
                        } else {
                            return new Pair(Integer.valueOf(i5), str2);
                        }
                    }
                }
            } else if ((i10 > 0 && i5 <= i11) || (i10 < 0 && i11 <= i5)) {
                int i12 = i5;
                while (true) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z7 = z5;
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        String str3 = (String) obj2;
                        z7 = z5;
                        if (z.k(0, i12, str3.length(), str3, (String) charSequence, z7)) {
                            break;
                        }
                        z5 = z7;
                    }
                    String str4 = (String) obj2;
                    if (str4 == null) {
                        if (i12 == i11) {
                            break;
                        }
                        i12 += i10;
                        z5 = z7;
                    } else {
                        return new Pair(Integer.valueOf(i12), str4);
                    }
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(collection, "<this>");
            if (collection instanceof List) {
                List list = (List) collection;
                Intrinsics.checkNotNullParameter(list, "<this>");
                int size = list.size();
                if (size == 0) {
                    throw new NoSuchElementException("List is empty.");
                }
                if (size != 1) {
                    throw new IllegalArgumentException("List has more than one element.");
                }
                obj3 = list.get(0);
            } else {
                Iterator it3 = collection.iterator();
                if (!it3.hasNext()) {
                    throw new NoSuchElementException("Collection is empty.");
                }
                Object next = it3.next();
                if (it3.hasNext()) {
                    throw new IllegalArgumentException("Collection has more than one element.");
                }
                obj3 = next;
            }
            String str5 = (String) obj3;
            int G = StringsKt.G(charSequence, str5, i5, false, 4);
            if (G >= 0) {
                return new Pair(Integer.valueOf(G), str5);
            }
        }
        return null;
    }

    public static final int q(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int r(CharSequence charSequence, CharSequence charSequence2, int i5, int i10, boolean z5, boolean z7) {
        kotlin.ranges.a aVar;
        if (z7) {
            int q = q(charSequence);
            if (i5 > q) {
                i5 = q;
            }
            if (i10 < 0) {
                i10 = 0;
            }
            kotlin.ranges.a.f19233d.getClass();
            aVar = new kotlin.ranges.a(i5, i10, -1);
        } else {
            if (i5 < 0) {
                i5 = 0;
            }
            int length = charSequence.length();
            if (i10 > length) {
                i10 = length;
            }
            aVar = new IntRange(i5, i10, 1);
        }
        boolean z10 = charSequence instanceof String;
        int i11 = aVar.f19236c;
        int i12 = aVar.f19235b;
        int i13 = aVar.f19234a;
        if (!z10 || !(charSequence2 instanceof String)) {
            boolean z11 = z5;
            if ((i11 > 0 && i13 <= i12) || (i11 < 0 && i12 <= i13)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z12 = z11;
                    z11 = z12;
                    if (!t(charSequence4, 0, charSequence3, i13, charSequence2.length(), z12)) {
                        if (i13 == i12) {
                            break;
                        }
                        i13 += i11;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    } else {
                        return i13;
                    }
                }
            }
        } else if ((i11 > 0 && i13 <= i12) || (i11 < 0 && i12 <= i13)) {
            int i14 = i13;
            while (true) {
                String str = (String) charSequence2;
                boolean z13 = z5;
                if (!z.k(0, i14, str.length(), str, (String) charSequence, z13)) {
                    if (i14 == i12) {
                        break;
                    }
                    i14 += i11;
                    z5 = z13;
                } else {
                    return i14;
                }
            }
        }
        return -1;
    }

    public static final int s(CharSequence charSequence, char[] chars, int i5, boolean z5) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z5 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(kotlin.collections.p.w(chars), i5);
        }
        if (i5 < 0) {
            i5 = 0;
        }
        int q = q(charSequence);
        if (i5 > q) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i5);
            for (char c2 : chars) {
                if (a.c(c2, charAt, z5)) {
                    return i5;
                }
            }
            if (i5 == q) {
                return -1;
            }
            i5++;
        }
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, String[] strArr, boolean z5, int i5, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z5 = false;
        }
        if ((i10 & 4) != 0) {
            i5 = 0;
        }
        return StringsKt.P(charSequence, strArr, z5, i5);
    }

    public static final boolean t(CharSequence charSequence, int i5, CharSequence other, int i10, int i11, boolean z5) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i10 < 0 || i5 < 0 || i5 > charSequence.length() - i11 || i10 > other.length() - i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!a.c(charSequence.charAt(i5 + i12), other.charAt(i10 + i12), z5)) {
                return false;
            }
        }
        return true;
    }

    public static final void u(int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException(c1.i(i5, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final List v(int i5, CharSequence charSequence, String str, boolean z5) {
        u(i5);
        int i10 = 0;
        int E = StringsKt.E(0, charSequence, str, z5);
        if (E == -1 || i5 == 1) {
            return kotlin.collections.t.c(charSequence.toString());
        }
        boolean z7 = i5 > 0;
        int i11 = 10;
        if (z7 && i5 <= 10) {
            i11 = i5;
        }
        ArrayList arrayList = new ArrayList(i11);
        do {
            arrayList.add(charSequence.subSequence(i10, E).toString());
            i10 = str.length() + E;
            if (z7 && arrayList.size() == i5 - 1) {
                break;
            }
            E = StringsKt.E(i10, charSequence, str, z5);
        } while (E != -1);
        arrayList.add(charSequence.subSequence(i10, charSequence.length()).toString());
        return arrayList;
    }
}
