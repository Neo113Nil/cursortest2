package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class rub {
    public static Object a(Object obj, Map map) {
        map.getClass();
        if (map instanceof fub) {
            fub fubVar = (fub) map;
            LinkedHashMap linkedHashMap = fubVar.a;
            Object obj2 = linkedHashMap.get(obj);
            return (obj2 != null || linkedHashMap.containsKey(obj)) ? obj2 : fubVar.b.invoke(obj);
        }
        Object obj3 = map.get(obj);
        if (obj3 != null || map.containsKey(obj)) {
            return obj3;
        }
        ogj.m(lnb.m(obj, "Key ", " is missing in the map."));
        return null;
    }

    public static Map b(LinkedHashMap linkedHashMap, Function1 function1) {
        return new fub(linkedHashMap, function1);
    }
}
