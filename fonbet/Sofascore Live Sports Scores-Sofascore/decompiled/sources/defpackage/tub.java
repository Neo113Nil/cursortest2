package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public class tub extends sub {
    public static Object e(Object obj, Map map) {
        map.getClass();
        return rub.a(obj, map);
    }

    public static HashMap f(Pair... pairArr) {
        HashMap hashMap = new HashMap(sub.c(pairArr.length));
        n(hashMap, pairArr);
        return hashMap;
    }

    public static LinkedHashMap g(Pair... pairArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(sub.c(pairArr.length));
        n(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static Map h(Pair... pairArr) {
        if (pairArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(sub.c(pairArr.length));
            n(linkedHashMap, pairArr);
            return linkedHashMap;
        }
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        return lm5Var;
    }

    public static LinkedHashMap i(Pair... pairArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(sub.c(pairArr.length));
        n(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static final Map j(LinkedHashMap linkedHashMap) {
        int size = linkedHashMap.size();
        if (size == 0) {
            lm5 lm5Var = lm5.a;
            lm5Var.getClass();
            return lm5Var;
        }
        if (size != 1) {
            return linkedHashMap;
        }
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        singletonMap.getClass();
        return singletonMap;
    }

    public static LinkedHashMap k(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map l(Map map, Pair pair) {
        map.getClass();
        if (map.isEmpty()) {
            return sub.d(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.a, pair.b);
        return linkedHashMap;
    }

    public static void m(Map map, Iterable iterable) {
        map.getClass();
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            map.put(pair.a, pair.b);
        }
    }

    public static void n(Map map, Pair[] pairArr) {
        map.getClass();
        for (Pair pair : pairArr) {
            map.put(pair.a, pair.b);
        }
    }

    public static Map o(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            m(linkedHashMap, iterable);
            return j(linkedHashMap);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            lm5 lm5Var = lm5.a;
            lm5Var.getClass();
            return lm5Var;
        }
        if (size == 1) {
            return sub.d((Pair) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(sub.c(collection.size()));
        m(linkedHashMap2, iterable);
        return linkedHashMap2;
    }

    public static Map p(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            lm5 lm5Var = lm5.a;
            lm5Var.getClass();
            return lm5Var;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        singletonMap.getClass();
        return singletonMap;
    }

    public static LinkedHashMap q(Map map) {
        map.getClass();
        return new LinkedHashMap(map);
    }
}
