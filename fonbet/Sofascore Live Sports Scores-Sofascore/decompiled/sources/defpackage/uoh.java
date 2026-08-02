package defpackage;

import com.sofascore.model.mvvm.model.Event;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class uoh {
    public static final we2 a = new we2();
    public static final List b = b.j("changes.changeTimestamp", "id");

    public static void a(JSONObject jSONObject) {
        jSONObject.getClass();
        b();
        Iterator<String> keys = jSONObject.keys();
        keys.getClass();
        Iterator it = e5h.b(keys).iterator();
        while (it.hasNext()) {
            if (!b.contains((String) it.next())) {
                we2 we2Var = a;
                synchronized (we2Var) {
                    we2Var.put(Long.valueOf(System.currentTimeMillis()), jSONObject);
                    Unit unit = Unit.a;
                }
                return;
            }
        }
    }

    public static void b() {
        we2 we2Var = a;
        synchronized (we2Var) {
            try {
                Iterator it = we2Var.keySet().iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    if (System.currentTimeMillis() - ((Number) next).longValue() > 5000) {
                        it.remove();
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Object c(Event event, kr5 kr5Var) {
        hs4 hs4Var = z45.a;
        Object R = xw3.R(hq4.c, new hje(event, null, 7), kr5Var);
        return R == lu3.a ? R : Unit.a;
    }
}
