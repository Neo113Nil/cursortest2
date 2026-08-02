package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zv2 {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public zv2(HashMap hashMap) {
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            d6b d6bVar = (d6b) entry.getValue();
            List list = (List) this.a.get(d6bVar);
            if (list == null) {
                list = new ArrayList();
                this.a.put(d6bVar, list);
            }
            list.add((aw2) entry.getKey());
        }
    }

    public static void a(List list, u6b u6bVar, d6b d6bVar, t6b t6bVar) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                aw2 aw2Var = (aw2) list.get(size);
                Method method = aw2Var.b;
                try {
                    int i = aw2Var.a;
                    if (i == 0) {
                        method.invoke(t6bVar, null);
                    } else if (i == 1) {
                        method.invoke(t6bVar, u6bVar);
                    } else if (i == 2) {
                        method.invoke(t6bVar, u6bVar, d6bVar);
                    }
                } catch (IllegalAccessException e) {
                    is8.h(e);
                    return;
                } catch (InvocationTargetException e2) {
                    vp2.e("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
