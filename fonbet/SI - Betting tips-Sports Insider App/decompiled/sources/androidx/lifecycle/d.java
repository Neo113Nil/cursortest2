package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2147a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2148b;

    public d(HashMap hashMap) {
        this.f2148b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            w wVar = (w) entry.getValue();
            List list = (List) this.f2147a.get(wVar);
            if (list == null) {
                list = new ArrayList();
                this.f2147a.put(wVar, list);
            }
            list.add((e) entry.getKey());
        }
    }

    public static void a(List list, e0 e0Var, w wVar, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                e eVar = (e) list.get(size);
                Method method = eVar.f2154b;
                try {
                    int i5 = eVar.f2153a;
                    if (i5 == 0) {
                        method.invoke(obj, null);
                    } else if (i5 == 1) {
                        method.invoke(obj, e0Var);
                    } else if (i5 == 2) {
                        method.invoke(obj, e0Var, wVar);
                    }
                } catch (IllegalAccessException e7) {
                    throw new RuntimeException(e7);
                } catch (InvocationTargetException e9) {
                    throw new RuntimeException("Failed to call observer method", e9.getCause());
                }
            }
        }
    }
}
