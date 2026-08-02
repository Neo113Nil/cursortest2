package kotlin.collections;

import android.view.View;
import androidx.core.view.C5310c0;
import androidx.core.view.C5314e0;
import java.util.AbstractCollection;
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
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.c;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.collections.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7714v extends I {
    public static boolean A(@NotNull Iterable iterable, Object obj) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : R(iterable, obj) >= 0;
    }

    public static Object A0(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return B0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    @NotNull
    public static Tc.b B() {
        return new Tc.b((Object) null);
    }

    public static Object B0(@NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    @NotNull
    public static List C(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return U0(X0(iterable));
    }

    public static Object C0(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
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

    @NotNull
    public static List D(@NotNull Iterable iterable, int i11) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(T7.E.a(i11, "Requested element count ", " is less than zero.").toString());
        }
        if (i11 == 0) {
            return U0(iterable);
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size() - i11;
            if (size <= 0) {
                return K.f71697a;
            }
            if (size == 1) {
                return a0(W(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    int size2 = collection.size();
                    while (i11 < size2) {
                        arrayList.add(((List) iterable).get(i11));
                        i11++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i11);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i12 = 0;
        for (Object obj : iterable) {
            if (i12 >= i11) {
                arrayList.add(obj);
            } else {
                i12++;
            }
        }
        return C7716x.c(arrayList);
    }

    public static Object D0(@NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    @NotNull
    public static List E(@NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return K0(list2, size);
    }

    @NotNull
    public static List E0(@NotNull List list, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? K.f71697a : U0(list.subList(indices.getStart().intValue(), indices.getF71843b() + 1));
    }

    public static Object F(@NotNull Iterable iterable, int i11) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        boolean z11 = iterable instanceof List;
        if (z11) {
            return ((List) iterable).get(i11);
        }
        G defaultValue = new G(i11);
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (z11) {
            List list = (List) iterable;
            return (i11 < 0 || i11 >= list.size()) ? defaultValue.invoke(Integer.valueOf(i11)) : list.get(i11);
        }
        if (i11 < 0) {
            return defaultValue.invoke(Integer.valueOf(i11));
        }
        int i12 = 0;
        for (Object obj : iterable) {
            int i13 = i12 + 1;
            if (i11 == i12) {
                return obj;
            }
            i12 = i13;
        }
        return defaultValue.invoke(Integer.valueOf(i11));
    }

    public static void F0(@NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    @NotNull
    public static ArrayList G(@NotNull Collection collection, @NotNull Function1 predicate) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static void G0(@NotNull Comparator comparator, @NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    @NotNull
    public static ArrayList H(@NotNull Iterable iterable, @NotNull Class klass) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(klass, "klass");
        ArrayList destination = new ArrayList();
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(klass, "klass");
        for (Object obj : iterable) {
            if (klass.isInstance(obj)) {
                destination.add(obj);
            }
        }
        return destination;
    }

    @NotNull
    public static List H0(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List n11 = I.n(iterable);
            F0(n11);
            return n11;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return U0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        Intrinsics.checkNotNullParameter(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return C7705l.e(array);
    }

    @NotNull
    public static ArrayList I(@NotNull Iterable iterable) {
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

    @NotNull
    public static List I0(@NotNull Comparator comparator, @NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List n11 = I.n(iterable);
            G0(comparator, n11);
            return n11;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return U0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        C7705l.a0(array, comparator);
        return C7705l.e(array);
    }

    public static Object J(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return K((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static int J0(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += ((Number) it.next()).intValue();
        }
        return i11;
    }

    public static Object K(@NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    @NotNull
    public static List K0(@NotNull Iterable iterable, int i11) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(T7.E.a(i11, "Requested element count ", " is less than zero.").toString());
        }
        if (i11 == 0) {
            return K.f71697a;
        }
        if (iterable instanceof Collection) {
            if (i11 >= ((Collection) iterable).size()) {
                return U0(iterable);
            }
            if (i11 == 1) {
                return a0(J(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i11);
        Iterator it = iterable.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i12++;
            if (i12 == i11) {
                break;
            }
        }
        return C7716x.c(arrayList);
    }

    public static Object L(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
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

    @NotNull
    public static List L0(int i11, @NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(T7.E.a(i11, "Requested element count ", " is less than zero.").toString());
        }
        if (i11 == 0) {
            return K.f71697a;
        }
        int size = list.size();
        if (i11 >= size) {
            return U0(list);
        }
        if (i11 == 1) {
            return a0(X(list));
        }
        ArrayList arrayList = new ArrayList(i11);
        if (list instanceof RandomAccess) {
            for (int i12 = size - i11; i12 < size; i12++) {
                arrayList.add(list.get(i12));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i11);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static Object M(@NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @NotNull
    public static void M0(int i11, @NotNull Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (i11 < array.length) {
            array[i11] = null;
        }
    }

    @NotNull
    public static ArrayList N(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            p((Iterable) it.next(), arrayList);
        }
        return arrayList;
    }

    public static void N0() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    @NotNull
    public static IntRange O(@NotNull Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new IntRange(0, collection.size() - 1, 1);
    }

    public static void O0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static int P(@NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.size() - 1;
    }

    @NotNull
    public static boolean[] P0(@NotNull Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            zArr[i11] = ((Boolean) it.next()).booleanValue();
            i11++;
        }
        return zArr;
    }

    public static Object Q(int i11, @NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i11 < 0 || i11 >= list.size()) {
            return null;
        }
        return list.get(i11);
    }

    @NotNull
    public static byte[] Q0(@NotNull ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            bArr[i11] = ((Number) it.next()).byteValue();
            i11++;
        }
        return bArr;
    }

    public static int R(@NotNull Iterable iterable, Object obj) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i11 = 0;
        for (Object obj2 : iterable) {
            if (i11 < 0) {
                O0();
                throw null;
            }
            if (Intrinsics.d(obj, obj2)) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    @NotNull
    public static float[] R0(@NotNull Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            fArr[i11] = ((Number) it.next()).floatValue();
            i11++;
        }
        return fArr;
    }

    public static int S(Object obj, @NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.indexOf(obj);
    }

    @NotNull
    public static HashSet S0(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        HashSet hashSet = new HashSet(U.h(z(iterable, 12)));
        I.m(iterable, hashSet);
        return hashSet;
    }

    @NotNull
    public static LinkedHashSet T(@NotNull Iterable iterable, @NotNull Iterable elements) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(elements, "other");
        LinkedHashSet X02 = X0(iterable);
        Intrinsics.checkNotNullParameter(X02, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        X02.retainAll(C.e(elements));
        return X02;
    }

    @NotNull
    public static int[] T0(@NotNull Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = ((Number) it.next()).intValue();
            i11++;
        }
        return iArr;
    }

    public static /* synthetic */ void U(Iterable iterable, Appendable appendable, String str, String str2, String str3, Function1 function1, int i11) {
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        if ((i11 & 8) != 0) {
            str3 = "";
        }
        if ((i11 & 64) != 0) {
            function1 = null;
        }
        I.l(iterable, appendable, str, str2, str3, function1);
    }

    @NotNull
    public static List U0(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C7716x.c(I.n(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return K.f71697a;
        }
        if (size != 1) {
            return W0(collection);
        }
        return a0(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static String V(Iterable iterable, String str, String str2, String str3, Function1 function1, int i11) {
        if ((i11 & 1) != 0) {
            str = ", ";
        }
        String separator = str;
        String prefix = (i11 & 2) != 0 ? "" : str2;
        String postfix = (i11 & 4) != 0 ? "" : str3;
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb2 = new StringBuilder();
        I.l(iterable, sb2, separator, prefix, postfix, function1);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    @NotNull
    public static long[] V0(@NotNull Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            jArr[i11] = ((Number) it.next()).longValue();
            i11++;
        }
        return jArr;
    }

    public static Object W(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return X((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    @NotNull
    public static ArrayList W0(@NotNull Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Object X(@NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(P(list));
    }

    @NotNull
    public static LinkedHashSet X0(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        I.m(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Object Y(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(list.size() - 1);
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

    @NotNull
    public static Set Y0(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            I.m(iterable, linkedHashSet);
            Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
            int size = linkedHashSet.size();
            return size != 0 ? size != 1 ? linkedHashSet : e0.h(linkedHashSet.iterator().next()) : M.f71699a;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return M.f71699a;
        }
        if (size2 == 1) {
            return e0.h(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(U.h(collection.size()));
        I.m(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    public static Object Z(@NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    @NotNull
    public static List a0(Object obj) {
        List singletonList = Collections.singletonList(obj);
        Intrinsics.checkNotNullExpressionValue(singletonList, "singletonList(...)");
        return singletonList;
    }

    @NotNull
    public static O a1(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return new O(new H(iterable));
    }

    @NotNull
    public static List b0(@NotNull Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length > 0 ? C7705l.e(elements) : K.f71697a;
    }

    @NotNull
    public static ArrayList b1(@NotNull Iterable iterable, @NotNull Iterable other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(z(iterable, 10), z(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new Pair(it.next(), it2.next()));
        }
        return arrayList;
    }

    @NotNull
    public static List c0(Object obj) {
        return obj != null ? a0(obj) : K.f71697a;
    }

    public static Comparable d0(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
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

    public static Float e0(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
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

    public static double f0(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double doubleValue = ((Number) it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) it.next()).doubleValue());
        }
        return doubleValue;
    }

    @NotNull
    public static Comparable g0(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
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

    public static Comparable h0(@NotNull ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
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

    public static Float i0(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
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

    public static double j0(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double doubleValue = ((Number) it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ((Number) it.next()).doubleValue());
        }
        return doubleValue;
    }

    @NotNull
    public static ArrayList k0(@NotNull Iterable iterable, Object obj) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        ArrayList arrayList = new ArrayList(z(iterable, 10));
        boolean z11 = false;
        for (Object obj2 : iterable) {
            boolean z12 = true;
            if (!z11 && Intrinsics.d(obj2, obj)) {
                z11 = true;
                z12 = false;
            }
            if (z12) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    @NotNull
    public static List l0(@NotNull Iterable iterable, @NotNull Iterable elements) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection e11 = C.e(elements);
        if (e11.isEmpty()) {
            return U0(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!e11.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public static ArrayList m0(@NotNull Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new C7703j(elements, true));
    }

    @NotNull
    public static ArrayList n0(@NotNull Iterable iterable, @NotNull Iterable elements) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (iterable instanceof Collection) {
            return p0(elements, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        p(iterable, arrayList);
        p(elements, arrayList);
        return arrayList;
    }

    @NotNull
    public static ArrayList o0(@NotNull Iterable iterable, Object obj) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return q0(obj, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        p(iterable, arrayList);
        arrayList.add(obj);
        return arrayList;
    }

    public static void p(@NotNull Iterable elements, @NotNull AbstractCollection abstractCollection) {
        Intrinsics.checkNotNullParameter(abstractCollection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements instanceof Collection) {
            abstractCollection.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    @NotNull
    public static ArrayList p0(@NotNull Iterable elements, @NotNull Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            p(elements, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static void q(@NotNull Collection collection, @NotNull C5310c0 elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<View> it = elements.iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                return;
            } else {
                collection.add(c5314e0.next());
            }
        }
    }

    @NotNull
    public static ArrayList q0(Object obj, @NotNull Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static void r(@NotNull Collection collection, @NotNull Object[] elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        collection.addAll(C7705l.e(elements));
    }

    public static Object r0(@NotNull List list, @NotNull c.Companion random) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (list.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return F(list, random.e(list.size()));
    }

    public static boolean s(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? !((Collection) iterable).isEmpty() : iterable.iterator().hasNext();
    }

    @NotNull
    public static ArrayList t(@NotNull Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new C7703j(elements, true));
    }

    @NotNull
    public static List u(@NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new c0(list);
    }

    public static Object u0(@NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    @NotNull
    public static List v(@NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new b0(list);
    }

    public static Object v0(@NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    @NotNull
    public static F w(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return new F(iterable);
    }

    public static Object w0(@NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(P(list));
    }

    @NotNull
    public static Tc.b x(@NotNull List builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return ((Tc.b) builder).B();
    }

    public static Object x0(@NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(P(list));
    }

    @NotNull
    public static ArrayList y(@NotNull Iterable iterable, int i11) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return I.o(iterable, i11, i11, true);
    }

    public static int z(@NotNull Iterable iterable, int i11) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i11;
    }

    @NotNull
    public static List z0(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return U0(iterable);
        }
        List n11 = I.n(iterable);
        Intrinsics.checkNotNullParameter(n11, "<this>");
        Collections.reverse(n11);
        return n11;
    }
}
