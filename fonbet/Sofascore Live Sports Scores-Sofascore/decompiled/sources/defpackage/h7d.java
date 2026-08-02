package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h7d extends t6d {
    public final z8d g;
    public final Object h;
    public final ArrayList i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7d(z8d z8dVar, Object obj, Map map) {
        super(z8dVar.b(haa.o(j7d.class)), null, map);
        z8dVar.getClass();
        obj.getClass();
        map.getClass();
        this.i = new ArrayList();
        this.g = z8dVar;
        this.h = obj;
    }

    public final g7d i() {
        g7d g7dVar = (g7d) super.a();
        gtj gtjVar = g7dVar.g;
        gtjVar.getClass();
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            s6d s6dVar = (s6d) it.next();
            if (s6dVar != null) {
                gtjVar.d(s6dVar);
            }
        }
        Object obj = this.h;
        if (obj == null) {
            if (this.a != null) {
                a70.r("You must set a start destination route");
                return null;
            }
            a70.r("You must set a start destination id");
            return null;
        }
        KSerializer R = sha.R(duf.a.getOrCreateKotlinClass(obj.getClass()));
        int y = waa.y(R);
        s6d h = gtjVar.h(y);
        if (h == null) {
            vp2.b(R.getDescriptor().h(), " from NavGraph. Ensure the starting NavDestination was added with route from KClass.", "Cannot find startDestination ");
            return null;
        }
        Map m = h.m();
        LinkedHashMap linkedHashMap = new LinkedHashMap(sub.c(m.size()));
        for (Map.Entry entry : m.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((a6d) entry.getValue()).a);
        }
        gtjVar.A(waa.z(obj, linkedHashMap));
        gtjVar.b = y;
        return g7dVar;
    }
}
