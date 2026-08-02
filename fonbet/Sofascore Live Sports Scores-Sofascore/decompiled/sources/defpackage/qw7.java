package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qw7 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(k6c k6cVar) {
        k6cVar.getClass();
        LinkedHashMap linkedHashMap = this.a;
        a38 a38Var = (a38) linkedHashMap.get(k6cVar);
        linkedHashMap.put(k6cVar, new a38(a38Var != null ? a38Var.c : new ArrayList(), 3));
    }

    public final a38 b(k6c k6cVar) {
        k6cVar.getClass();
        LinkedHashMap linkedHashMap = this.a;
        Object obj = linkedHashMap.get(k6cVar);
        if (obj == null) {
            obj = new a38(null, 7);
            linkedHashMap.put(k6cVar, obj);
        }
        return (a38) obj;
    }
}
