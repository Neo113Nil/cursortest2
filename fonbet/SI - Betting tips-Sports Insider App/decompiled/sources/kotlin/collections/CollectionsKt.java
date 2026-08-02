package kotlin.collections;

import androidx.appcompat.widget.c1;
import com.google.android.material.navigation.NavigationBarView;
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
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"kotlin/collections/t", "kotlin/collections/u", "kotlin/collections/v", "kotlin/collections/w", "kotlin/collections/x", "kotlin/collections/y", "kotlin/collections/z", "kotlin/collections/a0", "kotlin/collections/b0", "kotlin/collections/CollectionsKt___CollectionsKt"}, d2 = {}, k = 4, mv = {2, 2, 0}, xi = NavigationBarView.ITEM_GRAVITY_TOP_CENTER)
/* loaded from: classes.dex */
public final class CollectionsKt extends CollectionsKt___CollectionsKt {
    private CollectionsKt() {
    }

    public static boolean A(Iterable iterable, Object obj) {
        int i5;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i5 = -1;
                    break;
                }
                Object next = it.next();
                if (i10 < 0) {
                    u.j();
                    throw null;
                }
                if (Intrinsics.areEqual(obj, next)) {
                    i5 = i10;
                    break;
                }
                i10++;
            }
        } else {
            i5 = ((List) iterable).indexOf(obj);
        }
        return i5 >= 0;
    }

    public static List B(List list) {
        ArrayList arrayList;
        Object obj;
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (c1.v(list)) {
            int size = list.size() - 1;
            if (size <= 0) {
                return e0.f19204a;
            }
            if (size == 1) {
                Intrinsics.checkNotNullParameter(list, "<this>");
                if (c1.v(list)) {
                    obj = K(list);
                } else {
                    Iterator it = list.iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException("Collection is empty.");
                    }
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = it.next();
                    }
                    obj = next;
                }
                return t.c(obj);
            }
            arrayList = new ArrayList(size);
            if (c1.v(list)) {
                if (list instanceof RandomAccess) {
                    int size2 = list.size();
                    for (int i5 = 1; i5 < size2; i5++) {
                        arrayList.add(list.get(i5));
                    }
                } else {
                    ListIterator listIterator = list.listIterator(1);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i10 = 0;
        for (Object obj2 : list) {
            if (i10 >= 1) {
                arrayList.add(obj2);
            } else {
                i10++;
            }
        }
        return u.h(arrayList);
    }

    public static List C(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return S(size, list);
    }

    public static ArrayList D(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        ArrayList destination = new ArrayList();
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : iterable) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static Object E(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return F((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object F(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object G(int i5, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i5 < 0 || i5 >= list.size()) {
            return null;
        }
        return list.get(i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LinkedHashSet H(List list, Collection elements) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(elements, "other");
        LinkedHashSet Y = Y(list);
        Intrinsics.checkNotNullParameter(Y, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(elements, "<this>");
        if (!c1.v(elements)) {
            elements = W(elements);
        }
        Y.retainAll(elements);
        return Y;
    }

    public static /* synthetic */ void I(Iterable iterable, StringBuilder sb2, String str, a2.j jVar, int i5) {
        if ((i5 & 64) != 0) {
            jVar = null;
        }
        CollectionsKt___CollectionsKt.w(iterable, sb2, str, "", "", jVar);
    }

    public static String J(Iterable iterable, CharSequence charSequence, String str, String str2, Function1 function1, int i5) {
        if ((i5 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence separator = charSequence;
        String prefix = (i5 & 2) != 0 ? "" : str;
        String postfix = (i5 & 4) != 0 ? "" : str2;
        if ((i5 & 32) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb2 = new StringBuilder();
        CollectionsKt___CollectionsKt.w(iterable, sb2, separator, prefix, postfix, function1);
        return sb2.toString();
    }

    public static Object K(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(u.e(list));
    }

    public static Object L(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable M(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Iterator it = arrayList.iterator();
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

    public static ArrayList N(Collection collection, Iterable elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            z.n(elements, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList O(Collection collection, Object obj) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List P(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return W(iterable);
        }
        List y5 = CollectionsKt___CollectionsKt.y(iterable);
        Intrinsics.checkNotNullParameter(y5, "<this>");
        Collections.reverse(y5);
        return y5;
    }

    public static List Q(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List y5 = CollectionsKt___CollectionsKt.y(iterable);
            y.l(y5);
            return y5;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return W(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        Intrinsics.checkNotNullParameter(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return o.c(array);
    }

    public static List R(Iterable iterable, Comparator comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List y5 = CollectionsKt___CollectionsKt.y(iterable);
            y.m(y5, comparator);
            return y5;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return W(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        Intrinsics.checkNotNullParameter(array, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return o.c(array);
    }

    public static List S(int i5, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i5 < 0) {
            throw new IllegalArgumentException(d9.e.f(i5, "Requested element count ", " is less than zero.").toString());
        }
        if (i5 == 0) {
            return e0.f19204a;
        }
        if (c1.v(list)) {
            if (i5 >= list.size()) {
                return W(list);
            }
            if (i5 == 1) {
                return t.c(E(list));
            }
        }
        ArrayList arrayList = new ArrayList(i5);
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i10++;
            if (i10 == i5) {
                break;
            }
        }
        return u.h(arrayList);
    }

    public static boolean[] T(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        boolean[] zArr = new boolean[list.size()];
        Iterator it = list.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            zArr[i5] = ((Boolean) it.next()).booleanValue();
            i5++;
        }
        return zArr;
    }

    public static HashSet U(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        HashSet hashSet = new HashSet(m0.a(v.k(arrayList, 12)));
        CollectionsKt___CollectionsKt.x(arrayList, hashSet);
        return hashSet;
    }

    public static int[] V(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            iArr[i5] = ((Number) it.next()).intValue();
            i5++;
        }
        return iArr;
    }

    public static List W(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return u.h(CollectionsKt___CollectionsKt.y(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return e0.f19204a;
        }
        if (size != 1) {
            return X(collection);
        }
        return t.c(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList X(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new ArrayList(collection);
    }

    public static LinkedHashSet Y(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        CollectionsKt___CollectionsKt.x(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set Z(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            CollectionsKt___CollectionsKt.x(iterable, linkedHashSet);
            Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
            int size = linkedHashSet.size();
            return size != 0 ? size != 1 ? linkedHashSet : u0.b(linkedHashSet.iterator().next()) : g0.f19206a;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return g0.f19206a;
        }
        if (size2 == 1) {
            return u0.b(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(m0.a(collection.size()));
        CollectionsKt___CollectionsKt.x(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    public static bg.k z(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return new bg.k(3, iterable);
    }
}
