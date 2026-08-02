package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fqg {
    public final LinkedHashMap a = new LinkedHashMap();
    public final p03 b;

    public fqg() {
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        this.b = new p03(lm5Var);
    }

    public final Object a(String str) {
        Object value;
        p03 p03Var = this.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) p03Var.b;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) p03Var.e;
        try {
            f1d f1dVar = (f1d) linkedHashMap2.get(str);
            if (f1dVar != null && (value = ((fdi) f1dVar).getValue()) != null) {
                return value;
            }
            return linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            ((LinkedHashMap) p03Var.d).remove(str);
            linkedHashMap2.remove(str);
            return null;
        }
    }

    public final void b(Object obj, String str) {
        if (obj != null) {
            List list = hqg.a;
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((Class) it.next()).isInstance(obj)) {
                    }
                }
            }
            pvd.A(obj.getClass(), " into saved state", "Can't put value with type ");
            return;
        }
        List list2 = hqg.a;
        Object obj2 = this.a.get(str);
        yzc yzcVar = obj2 instanceof yzc ? (yzc) obj2 : null;
        if (yzcVar != null) {
            yzcVar.j(obj);
        }
        this.b.y(obj, str);
    }

    public fqg(ltb ltbVar) {
        this.b = new p03(ltbVar);
    }
}
