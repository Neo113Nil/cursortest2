package og;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: og.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5891c {
    public static final int a(Iterable iterable, Function1 predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i10 = 0;
        for (Object obj : iterable) {
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final List b(Iterable iterable, Function1 transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return arrayList;
    }

    public static final Object c(Iterable iterable, Function1 predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (Object obj : iterable) {
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                return obj;
            }
        }
        return null;
    }

    public static final boolean d(Collection collection) {
        return !(collection == null || collection.isEmpty());
    }
}
