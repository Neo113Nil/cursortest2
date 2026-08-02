package kotlin.collections;

import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.b5h;
import defpackage.flf;
import defpackage.glf;
import defpackage.glh;
import defpackage.im5;
import defpackage.k13;
import defpackage.km5;
import defpackage.lnb;
import defpackage.mh0;
import defpackage.mz1;
import defpackage.n13;
import defpackage.nh0;
import defpackage.o13;
import defpackage.ogj;
import defpackage.oh0;
import defpackage.q13;
import defpackage.rm5;
import defpackage.sub;
import defpackage.w9h;
import defpackage.yhk;
import defpackage.yj1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

@Metadata(d1 = {"kotlin/collections/a", "kotlin/collections/b", "k13", "l13", "m13", "n13", "o13", "p13", "kotlin/collections/c", "kotlin/collections/CollectionsKt___CollectionsKt"}, d2 = {}, k = 4, mv = {2, 4, 0}, xi = 49)
/* loaded from: classes6.dex */
public final class CollectionsKt extends CollectionsKt___CollectionsKt {
    private CollectionsKt() {
    }

    public static Object A0(Collection collection, flf flfVar) {
        collection.getClass();
        flfVar.getClass();
        if (collection.isEmpty()) {
            ogj.m("Collection is empty.");
            return null;
        }
        return U(glf.b.k(collection.size()), collection);
    }

    public static List B0(Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return S0(iterable);
        }
        List M = CollectionsKt___CollectionsKt.M(iterable);
        Collections.reverse(M);
        return M;
    }

    public static Object C0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return D0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            ogj.m("Collection is empty.");
            return null;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        a70.p("Collection has more than one element.");
        return null;
    }

    public static Object D0(List list) {
        list.getClass();
        int size = list.size();
        if (size == 0) {
            ogj.m("List is empty.");
            return null;
        }
        if (size == 1) {
            return list.get(0);
        }
        a70.p("List has more than one element.");
        return null;
    }

    public static Object E0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object F0(List list) {
        list.getClass();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List G0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List M = CollectionsKt___CollectionsKt.M(iterable);
            n13.t(M);
            return M;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return S0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return mh0.c(array);
    }

    public static List H0(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        comparator.getClass();
        if (!(iterable instanceof Collection)) {
            List M = CollectionsKt___CollectionsKt.M(iterable);
            n13.u(comparator, M);
            return M;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return S0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List asList = Arrays.asList(array);
        asList.getClass();
        return asList;
    }

    public static LinkedHashSet I0(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Collection x = o13.x(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (!x.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static double J0(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        double d = 0.0d;
        while (it.hasNext()) {
            d += ((Number) it.next()).doubleValue();
        }
        return d;
    }

    public static int K0(List list) {
        list.getClass();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Number) it.next()).intValue();
        }
        return i;
    }

    public static List L0(Iterable iterable, int i) {
        iterable.getClass();
        if (i < 0) {
            ogj.h(lnb.k(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return km5.a;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return S0(iterable);
            }
            if (i == 1) {
                return a.c(X(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return b.m(arrayList);
    }

    public static List M0(int i, List list) {
        list.getClass();
        if (i < 0) {
            ogj.h(lnb.k(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return km5.a;
        }
        int size = list.size();
        if (i >= size) {
            return S0(list);
        }
        if (i == 1) {
            return a.c(h0(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static oh0 N(Iterable iterable) {
        iterable.getClass();
        return new oh0(iterable, 1);
    }

    public static boolean[] N0(List list) {
        boolean[] zArr = new boolean[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = ((Boolean) it.next()).booleanValue();
            i++;
        }
        return zArr;
    }

    public static double O(List list) {
        Iterator it = list.iterator();
        double d = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            d += ((Number) it.next()).doubleValue();
            i++;
            if (i < 0) {
                b.p();
                throw null;
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    public static byte[] O0(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return bArr;
    }

    public static double P(Iterable iterable) {
        Iterator it = iterable.iterator();
        double d = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            d += ((Number) it.next()).intValue();
            i++;
            if (i < 0) {
                b.p();
                throw null;
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    public static float[] P0(Collection collection) {
        collection.getClass();
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    public static ArrayList Q(int i, List list) {
        list.getClass();
        if (i <= 0 || i <= 0) {
            ogj.h(lnb.k(i, "size ", " must be greater than zero."));
            return null;
        }
        if (!(list instanceof RandomAccess)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            it.getClass();
            Iterator a = !it.hasNext() ? im5.a : b5h.a(new glh(i, i, it, null));
            while (a.hasNext()) {
                arrayList.add((List) a.next());
            }
            return arrayList;
        }
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i) + (size % i == 0 ? 0 : 1));
        int i2 = 0;
        while (i2 >= 0 && i2 < size) {
            int i3 = size - i2;
            if (i <= i3) {
                i3 = i;
            }
            ArrayList arrayList3 = new ArrayList(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                arrayList3.add(list.get(i4 + i2));
            }
            arrayList2.add(arrayList3);
            i2 += i;
        }
        return arrayList2;
    }

    public static HashSet Q0(Iterable iterable) {
        iterable.getClass();
        HashSet hashSet = new HashSet(sub.c(k13.r(iterable, 12)));
        CollectionsKt___CollectionsKt.L(iterable, hashSet);
        return hashSet;
    }

    public static boolean R(Iterable iterable, Object obj) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : b0(iterable, obj) >= 0;
    }

    public static int[] R0(List list) {
        list.getClass();
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List S(Iterable iterable, int i) {
        ArrayList arrayList;
        iterable.getClass();
        if (i < 0) {
            ogj.h(lnb.k(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return S0(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i;
            if (size <= 0) {
                return km5.a;
            }
            if (size == 1) {
                return a.c(g0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i < size2) {
                        arrayList.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (Object obj : iterable) {
            if (i2 >= i) {
                arrayList.add(obj);
            } else {
                i2++;
            }
        }
        return b.m(arrayList);
    }

    public static List S0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return b.m(CollectionsKt___CollectionsKt.M(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return km5.a;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return a.c(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static List T(List list) {
        list.getClass();
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return L0(list, size);
    }

    public static long[] T0(List list) {
        long[] jArr = new long[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static Object U(int i, Collection collection) {
        boolean z = collection instanceof List;
        if (z) {
            return ((List) collection).get(i);
        }
        int i2 = 0;
        q13 q13Var = new q13(i, i2);
        if (z) {
            List list = (List) collection;
            if (i >= 0 && i < list.size()) {
                return list.get(i);
            }
            q13Var.invoke(Integer.valueOf(i));
            throw null;
        }
        if (i < 0) {
            q13Var.invoke(Integer.valueOf(i));
            throw null;
        }
        for (Object obj : collection) {
            int i3 = i2 + 1;
            if (i == i2) {
                return obj;
            }
            i2 = i3;
        }
        q13Var.invoke(Integer.valueOf(i));
        throw null;
    }

    public static ArrayList U0(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static ArrayList V(Iterable iterable, Function1 function1) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static LinkedHashSet V0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        CollectionsKt___CollectionsKt.L(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static ArrayList W(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Set W0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            CollectionsKt___CollectionsKt.L(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            return size != 0 ? size != 1 ? linkedHashSet : w9h.b(linkedHashSet.iterator().next()) : rm5.a;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return rm5.a;
        }
        if (size2 == 1) {
            return w9h.b(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(sub.c(collection.size()));
        CollectionsKt___CollectionsKt.L(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    public static Object X(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return Y((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        ogj.m("Collection is empty.");
        return null;
    }

    public static nh0 X0(Iterable iterable) {
        iterable.getClass();
        return new nh0(new yj1(iterable, 27), 2);
    }

    public static Object Y(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        ogj.m("List is empty.");
        return null;
    }

    public static ArrayList Y0(Iterable iterable, Collection collection) {
        iterable.getClass();
        collection.getClass();
        Iterator it = iterable.iterator();
        Iterator it2 = collection.iterator();
        ArrayList arrayList = new ArrayList(Math.min(k13.r(iterable, 10), k13.r(collection, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new Pair(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static Object Z(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object a0(int i, List list) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static int b0(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                b.q();
                throw null;
            }
            if (Intrinsics.c(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int c0(List list, Object obj) {
        list.getClass();
        return list.indexOf(obj);
    }

    public static LinkedHashSet d0(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Collection x = o13.x(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (x.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static /* synthetic */ void e0(Iterable iterable, StringBuilder sb, String str, String str2, String str3, Function1 function1, int i) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        if ((i & 8) != 0) {
            str3 = "";
        }
        if ((i & 64) != 0) {
            function1 = null;
        }
        CollectionsKt___CollectionsKt.K(iterable, sb, str, str2, str3, "...", function1);
    }

    public static String f0(Iterable iterable, CharSequence charSequence, String str, String str2, Function1 function1, int i) {
        if ((i & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence2 = charSequence;
        String str3 = (i & 2) != 0 ? "" : str;
        String str4 = (i & 4) != 0 ? "" : str2;
        if ((i & 32) != 0) {
            function1 = null;
        }
        iterable.getClass();
        charSequence2.getClass();
        str3.getClass();
        StringBuilder sb = new StringBuilder();
        CollectionsKt___CollectionsKt.K(iterable, sb, charSequence2, str3, str4, "...", function1);
        return sb.toString();
    }

    public static Object g0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return h0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            ogj.m("Collection is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object h0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return mz1.g(1, list);
        }
        ogj.m("List is empty.");
        return null;
    }

    public static Object i0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return mz1.g(1, list);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object j0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return mz1.g(1, list);
    }

    public static Comparable k0(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Double l0(List list) {
        list.getClass();
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = ((Number) it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    public static Float m0(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static float n0(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            yhk.d();
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float floatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) it.next()).floatValue());
        }
        return floatValue;
    }

    public static Comparable o0(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            yhk.d();
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Comparable p0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float q0(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static float r0(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            yhk.d();
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float floatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) it.next()).floatValue());
        }
        return floatValue;
    }

    public static ArrayList s0(Iterable iterable, Object obj) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList(k13.r(iterable, 10));
        boolean z = false;
        for (Object obj2 : iterable) {
            boolean z2 = true;
            if (!z && Intrinsics.c(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static List t0(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Collection x = o13.x(iterable2);
        if (x.isEmpty()) {
            return S0(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!x.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList u0(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        if (iterable instanceof Collection) {
            return w0(iterable2, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        o13.v(iterable, arrayList);
        o13.v(iterable2, arrayList);
        return arrayList;
    }

    public static ArrayList v0(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return x0((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        o13.v(iterable, arrayList);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList w0(Iterable iterable, Collection collection) {
        collection.getClass();
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            o13.v(iterable, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList x0(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList y0(List list, Sequence sequence) {
        sequence.getClass();
        ArrayList arrayList = new ArrayList(list.size() + 10);
        arrayList.addAll(list);
        Iterator it = sequence.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static ArrayList z0(List list, Object[] objArr) {
        list.getClass();
        objArr.getClass();
        ArrayList arrayList = new ArrayList(list.size() + objArr.length);
        arrayList.addAll(list);
        o13.w(arrayList, objArr);
        return arrayList;
    }
}
