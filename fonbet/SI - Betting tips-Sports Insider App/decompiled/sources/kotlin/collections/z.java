package kotlin.collections;

import androidx.appcompat.widget.c1;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class z extends y {
    public static void n(Iterable elements, AbstractCollection abstractCollection) {
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

    public static void o(Collection collection, Object[] elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        collection.addAll(o.c(elements));
    }

    public static final boolean p(Iterable iterable, Function1 function1, boolean z5) {
        Iterator it = iterable.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            if (((Boolean) function1.invoke(it.next())).booleanValue() == z5) {
                it.remove();
                z7 = true;
            }
        }
        return z7;
    }

    public static void q(ArrayList arrayList, Function1 predicate) {
        int e7;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (!c1.v(arrayList)) {
            Intrinsics.checkNotNull(arrayList, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            p(TypeIntrinsics.asMutableIterable(arrayList), predicate, true);
            return;
        }
        int e9 = u.e(arrayList);
        int i5 = 0;
        if (e9 >= 0) {
            int i10 = 0;
            while (true) {
                Object obj = arrayList.get(i5);
                if (!((Boolean) predicate.invoke(obj)).booleanValue()) {
                    if (i10 != i5) {
                        arrayList.set(i10, obj);
                    }
                    i10++;
                }
                if (i5 == e9) {
                    break;
                } else {
                    i5++;
                }
            }
            i5 = i10;
        }
        if (i5 >= arrayList.size() || i5 > (e7 = u.e(arrayList))) {
            return;
        }
        while (true) {
            arrayList.remove(e7);
            if (e7 == i5) {
                return;
            } else {
                e7--;
            }
        }
    }

    public static Object r(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return arrayList.remove(0);
    }

    public static Object s(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(u.e(list));
    }
}
