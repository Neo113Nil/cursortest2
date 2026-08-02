package kotlin.collections;

import defpackage.a70;
import defpackage.km5;
import defpackage.lnb;
import defpackage.o93;
import defpackage.qg0;
import defpackage.xml;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class b extends a {
    public static ArrayList e(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new qg0(objArr, true));
    }

    public static int f(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        arrayList.getClass();
        n(arrayList.size(), size);
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int b = o93.b((Comparable) arrayList.get(i3), comparable);
            if (b < 0) {
                i2 = i3 + 1;
            } else {
                if (b <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static km5 g() {
        return km5.a;
    }

    public static IntRange h(Collection collection) {
        collection.getClass();
        return new IntRange(0, collection.size() - 1, 1);
    }

    public static int i(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static List j(Object... objArr) {
        objArr.getClass();
        if (objArr.length <= 0) {
            return km5.a;
        }
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }

    public static List k(Object obj) {
        return obj != null ? a.c(obj) : km5.a;
    }

    public static ArrayList l(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new qg0(objArr, true));
    }

    public static final List m(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : a.c(list.get(0)) : km5.a;
    }

    public static final void n(int i, int i2) {
        if (i2 < 0) {
            a70.p(lnb.k(i2, "fromIndex (0) is greater than toIndex (", ")."));
        } else {
            if (i2 <= i) {
                return;
            }
            zzl.r(lnb.j(i2, i, "toIndex (", ") is greater than size (", ")."));
        }
    }

    public static List o(List list, xml xmlVar) {
        List M = CollectionsKt___CollectionsKt.M(list);
        ArrayList arrayList = (ArrayList) M;
        for (int size = arrayList.size() - 1; size > 0; size--) {
            int e = xmlVar.e(0, size + 1);
            arrayList.set(e, arrayList.set(size, arrayList.get(e)));
        }
        return M;
    }

    public static void p() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void q() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
