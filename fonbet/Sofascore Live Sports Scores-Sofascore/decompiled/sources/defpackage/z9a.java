package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class z9a {
    /* JADX WARN: Multi-variable type inference failed */
    public static rq3 a(rq3 rq3Var, rq3 rq3Var2, Function2 function2) {
        function2.getClass();
        if (function2 instanceof h21) {
            return ((h21) function2).create(rq3Var, rq3Var2);
        }
        CoroutineContext context = rq3Var2.getContext();
        return context == g.a ? new v9a(rq3Var2, rq3Var, function2) : new w9a(rq3Var2, context, function2, rq3Var);
    }

    public static rq3 b(rq3 rq3Var) {
        rq3<Object> intercepted;
        rq3Var.getClass();
        sq3 sq3Var = rq3Var instanceof sq3 ? (sq3) rq3Var : null;
        return (sq3Var == null || (intercepted = sq3Var.intercepted()) == null) ? rq3Var : intercepted;
    }

    public static Object c(Function2 function2, Object obj, rq3 rq3Var) {
        function2.getClass();
        CoroutineContext context = rq3Var.getContext();
        Object x9aVar = context == g.a ? new x9a(rq3Var) : new y9a(rq3Var, context);
        i5k.e(2, function2);
        return function2.invoke(obj, x9aVar);
    }
}
