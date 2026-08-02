package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class v58 {
    public static final v58 a = new v58();
    public static final Map b = Collections.synchronizedMap(new LinkedHashMap());

    public static t58 a(r8h r8hVar) {
        Map map = b;
        map.getClass();
        Object obj = map.get(r8hVar);
        if (obj != null) {
            return (t58) obj;
        }
        ilg.f(r8hVar, ". Dependencies should be added at class load time.", "Cannot get dependency ");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x009b -> B:10:0x009c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(sq3 sq3Var) {
        u58 u58Var;
        int i;
        Iterator it;
        Map map;
        if (sq3Var instanceof u58) {
            u58Var = (u58) sq3Var;
            int i2 = u58Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u58Var.y = i2 - Integer.MIN_VALUE;
                Object obj = u58Var.w;
                lu3 lu3Var = lu3.a;
                i = u58Var.y;
                if (i != 0) {
                    y6a.M(obj);
                    Map map2 = b;
                    map2.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(sub.c(map2.size()));
                    it = map2.entrySet().iterator();
                    map = linkedHashMap;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object key = u58Var.v;
                    map = u58Var.u;
                    r8h r8hVar = u58Var.t;
                    it = u58Var.s;
                    Map map3 = u58Var.r;
                    y6a.M(obj);
                    r8hVar.getClass();
                    ew3 ew3Var = a(r8hVar).b;
                    if (ew3Var == null) {
                        map.put(key, ew3Var);
                        map = map3;
                        if (it.hasNext()) {
                            return map;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        key = entry.getKey();
                        r8hVar = (r8h) entry.getKey();
                        qo6 qo6Var = new qo6((t58) entry.getValue(), 28);
                        Map map4 = map;
                        u58Var.r = map4;
                        u58Var.s = it;
                        u58Var.t = r8hVar;
                        u58Var.u = map4;
                        u58Var.v = key;
                        u58Var.y = 1;
                        if (v8a.F(qo6Var, u58Var) == lu3Var) {
                            return lu3Var;
                        }
                        map3 = map;
                        r8hVar.getClass();
                        ew3 ew3Var2 = a(r8hVar).b;
                        if (ew3Var2 == null) {
                            ilg.f(r8hVar, " has not been registered.", "Subscriber ");
                            return null;
                        }
                    }
                }
            }
        }
        u58Var = new u58(this, sq3Var);
        Object obj2 = u58Var.w;
        lu3 lu3Var2 = lu3.a;
        i = u58Var.y;
        if (i != 0) {
        }
    }
}
