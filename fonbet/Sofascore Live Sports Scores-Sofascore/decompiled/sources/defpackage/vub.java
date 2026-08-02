package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class vub extends uub {
    public static List r(LinkedHashMap linkedHashMap) {
        if (linkedHashMap.size() == 0) {
            return km5.a;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (!it.hasNext()) {
            return km5.a;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return a.c(new Pair(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new Pair(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
