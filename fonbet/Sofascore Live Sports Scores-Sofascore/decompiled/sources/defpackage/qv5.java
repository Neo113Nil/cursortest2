package defpackage;

import java.util.LinkedHashMap;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class qv5 {
    public static final ad2 a;
    public static final LinkedHashMap b;

    static {
        hs4 hs4Var = z45.a;
        a = s9a.c(rob.a.plus(tz9.o()));
        b = new LinkedHashMap();
    }

    public static void a(j52 j52Var) {
        j52Var.getClass();
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(j52Var.getClass());
        LinkedHashMap linkedHashMap = b;
        Object obj = linkedHashMap.get(orCreateKotlinClass);
        rq3 rq3Var = null;
        if (obj == null) {
            obj = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass, obj);
        }
        xw3.L(a, null, null, new ce4((b1d) obj, j52Var, rq3Var, 12), 3);
    }
}
