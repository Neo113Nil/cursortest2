package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xh3 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public final Object a(pm0 pm0Var, Function0 function0) {
        pm0Var.getClass();
        ConcurrentHashMap concurrentHashMap = this.a;
        Object obj = concurrentHashMap.get(pm0Var);
        if (obj != null) {
            return obj;
        }
        Object invoke = function0.invoke();
        Object putIfAbsent = concurrentHashMap.putIfAbsent(pm0Var, invoke);
        if (putIfAbsent != null) {
            invoke = putIfAbsent;
        }
        invoke.getClass();
        return invoke;
    }

    public final Object b(pm0 pm0Var) {
        pm0Var.getClass();
        Object d = d(pm0Var);
        if (d != null) {
            return d;
        }
        yhk.r(pm0Var, "No instance for key ");
        return null;
    }

    public final Map c() {
        return this.a;
    }

    public final Object d(pm0 pm0Var) {
        pm0Var.getClass();
        return c().get(pm0Var);
    }

    public final void e(pm0 pm0Var, Object obj) {
        pm0Var.getClass();
        obj.getClass();
        c().put(pm0Var, obj);
    }
}
