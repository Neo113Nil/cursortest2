package ch;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ch.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2922B {
    public static final y c(y yVar, y builder) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        for (Map.Entry entry : builder.a()) {
            yVar.e((String) entry.getKey(), (List) entry.getValue());
        }
        return yVar;
    }

    public static final boolean d(Set set, Set set2) {
        return Intrinsics.areEqual(set, set2);
    }

    public static final int e(Set set, int i10) {
        return (i10 * 31) + set.hashCode();
    }

    public static final List f(x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Set<Map.Entry> a10 = xVar.a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : a10) {
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(TuplesKt.to(entry.getKey(), (String) it.next()));
            }
            CollectionsKt.addAll(arrayList, arrayList2);
        }
        return arrayList;
    }
}
