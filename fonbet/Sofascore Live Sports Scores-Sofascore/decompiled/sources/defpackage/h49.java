package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class h49 {
    public static Map a(g49 g49Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator l = g49Var.l();
        while (l.hasNext()) {
            Object a = g49Var.a(l.next());
            Object obj = linkedHashMap.get(a);
            if (obj == null && !linkedHashMap.containsKey(a)) {
                obj = new dsf();
            }
            dsf dsfVar = (dsf) obj;
            dsfVar.a++;
            linkedHashMap.put(a, dsfVar);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            entry.getClass();
            if ((entry instanceof eia) && !(entry instanceof hia)) {
                i5k.h(entry, "kotlin.collections.MutableMap.MutableEntry");
                throw null;
            }
            entry.setValue(Integer.valueOf(((dsf) entry.getValue()).a));
        }
        return i5k.c(linkedHashMap);
    }
}
