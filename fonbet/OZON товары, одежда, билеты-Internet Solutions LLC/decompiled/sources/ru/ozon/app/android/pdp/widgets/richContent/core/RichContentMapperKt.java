package ru.ozon.app.android.pdp.widgets.richContent.core;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.N;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.U;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"mostFrequent", "", "", "(Ljava/util/List;)Ljava/lang/Integer;", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RichContentMapperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer mostFrequent(List<Integer> list) {
        Object next;
        final List<Integer> list2 = list;
        N<Integer, Integer> n11 = new N<Integer, Integer>() { // from class: ru.ozon.app.android.pdp.widgets.richContent.core.RichContentMapperKt$mostFrequent$$inlined$groupingBy$1
            @Override // kotlin.collections.N
            public Integer keyOf(Integer element) {
                return Integer.valueOf(element.intValue());
            }

            @Override // kotlin.collections.N
            public Iterator<Integer> sourceIterator() {
                return list2.iterator();
            }
        };
        Intrinsics.checkNotNullParameter(n11, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Integer> sourceIterator = n11.sourceIterator();
        while (sourceIterator.hasNext()) {
            Integer keyOf = n11.keyOf(sourceIterator.next());
            Object obj = linkedHashMap.get(keyOf);
            if (obj == null && !linkedHashMap.containsKey(keyOf)) {
                obj = new K();
            }
            K k11 = (K) obj;
            k11.f71785a++;
            linkedHashMap.put(keyOf, k11);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Intrinsics.g(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>");
            U.e(entry);
            entry.setValue(Integer.valueOf(((K) entry.getValue()).f71785a));
        }
        Iterator it = U.d(linkedHashMap).entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int intValue = ((Number) ((Map.Entry) next).getValue()).intValue();
                do {
                    Object next2 = it.next();
                    int intValue2 = ((Number) ((Map.Entry) next2).getValue()).intValue();
                    if (intValue < intValue2) {
                        next = next2;
                        intValue = intValue2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null) {
            return (Integer) entry2.getKey();
        }
        return null;
    }
}
