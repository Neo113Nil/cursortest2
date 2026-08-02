package kotlin.collections;

import C.C2702w;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class U extends Z {
    @NotNull
    public static Tc.d b(@NotNull Map builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return ((Tc.d) builder).u();
    }

    @NotNull
    public static Map c() {
        L l11 = L.f71698a;
        Intrinsics.g(l11, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return l11;
    }

    public static Object d(@NotNull Map map, Object obj) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map instanceof T) {
            return ((T) map).f();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException(C2702w.c(obj, "Key ", " is missing in the map."));
    }

    public static Object e(@NotNull Map map, Object obj) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return d(map, obj);
    }

    @NotNull
    public static HashMap f(@NotNull Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        HashMap hashMap = new HashMap(h(pairs.length));
        o(hashMap, pairs);
        return hashMap;
    }

    @NotNull
    public static LinkedHashMap g(@NotNull Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        LinkedHashMap destination = new LinkedHashMap(h(pairs.length));
        Intrinsics.checkNotNullParameter(pairs, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        o(destination, pairs);
        return destination;
    }

    public static int h(int i11) {
        if (i11 < 0) {
            return i11;
        }
        if (i11 < 3) {
            return i11 + 1;
        }
        if (i11 < 1073741824) {
            return (int) ((i11 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    @NotNull
    public static Map i(@NotNull Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        Map singletonMap = Collections.singletonMap(pair.e(), pair.f());
        Intrinsics.checkNotNullExpressionValue(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    @NotNull
    public static Map j(@NotNull Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        if (pairs.length <= 0) {
            return c();
        }
        LinkedHashMap destination = new LinkedHashMap(h(pairs.length));
        Intrinsics.checkNotNullParameter(pairs, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        o(destination, pairs);
        return destination;
    }

    @NotNull
    public static Map k(@NotNull Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        LinkedHashMap u11 = u(map);
        u11.remove("skuPromo_usesRefreshUrlFromState");
        Intrinsics.checkNotNullParameter(u11, "<this>");
        int size = u11.size();
        return size != 0 ? size != 1 ? u11 : W.a(u11) : c();
    }

    @NotNull
    public static LinkedHashMap l(@NotNull Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(h(pairs.length));
        o(linkedHashMap, pairs);
        return linkedHashMap;
    }

    @NotNull
    public static LinkedHashMap m(@NotNull Map map, @NotNull Map map2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    @NotNull
    public static Map n(@NotNull Map map, @NotNull Pair pair) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pair, "pair");
        if (map.isEmpty()) {
            return i(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.e(), pair.f());
        return linkedHashMap;
    }

    public static void o(@NotNull AbstractMap abstractMap, @NotNull Pair[] pairs) {
        Intrinsics.checkNotNullParameter(abstractMap, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair pair : pairs) {
            abstractMap.put(pair.a(), pair.b());
        }
    }

    public static void p(@NotNull Map map, @NotNull Iterable pairs) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            map.put(pair.a(), pair.b());
        }
    }

    @NotNull
    public static TreeMap q(@NotNull Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        TreeMap treeMap = new TreeMap();
        o(treeMap, pairs);
        return treeMap;
    }

    @NotNull
    public static List r(@NotNull LinkedHashMap linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (linkedHashMap.size() == 0) {
            return K.f71697a;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (!it.hasNext()) {
            return K.f71697a;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return C7714v.a0(new Pair(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new Pair(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    @NotNull
    public static Map s(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            LinkedHashMap destination = new LinkedHashMap();
            Intrinsics.checkNotNullParameter(iterable, "<this>");
            Intrinsics.checkNotNullParameter(destination, "destination");
            p(destination, iterable);
            Intrinsics.checkNotNullParameter(destination, "<this>");
            int size = destination.size();
            return size != 0 ? size != 1 ? destination : W.a(destination) : c();
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return c();
        }
        if (size2 == 1) {
            return i((Pair) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
        }
        LinkedHashMap destination2 = new LinkedHashMap(h(collection.size()));
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination2, "destination");
        p(destination2, iterable);
        return destination2;
    }

    @NotNull
    public static Map t(@NotNull Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? u(map) : W.a(map) : c();
    }

    @NotNull
    public static LinkedHashMap u(@NotNull Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return new LinkedHashMap(map);
    }
}
