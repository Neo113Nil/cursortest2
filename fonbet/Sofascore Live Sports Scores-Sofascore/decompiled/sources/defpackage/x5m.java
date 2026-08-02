package defpackage;

import com.blaze.blazesdk.shared.BlazeSDK;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class x5m extends ltk {
    public final a b = new a(bu3.a);

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a extends kotlin.coroutines.a implements cu3 {
        public a(bu3 bu3Var) {
            super(bu3Var);
        }

        @Override // defpackage.cu3
        public final void handleException(CoroutineContext coroutineContext, Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public static boolean f() {
        uul uulVar;
        tul tulVar = jdm.d;
        if (tulVar == null || (uulVar = tulVar.a) == null) {
            return false;
        }
        return uulVar.i;
    }

    public static yda safeViewModelScopeIO$default(x5m x5mVar, CoroutineContext coroutineContext, Function1 function1, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: safeViewModelScopeIO");
            return null;
        }
        if ((i & 1) != 0) {
            hs4 hs4Var = z45.a;
            coroutineContext = hq4.c.plus(x5mVar.b).plus(new gu3(x5mVar.getClass().getSimpleName()));
        }
        x5mVar.getClass();
        coroutineContext.getClass();
        function1.getClass();
        return xw3.L(un0.z(x5mVar), coroutineContext, null, new xul(function1, null), 2);
    }

    public static yda safeViewModelScopeMain$default(x5m x5mVar, CoroutineContext coroutineContext, Function1 function1, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: safeViewModelScopeMain");
            return null;
        }
        if ((i & 1) != 0) {
            hs4 hs4Var = z45.a;
            coroutineContext = rob.a.plus(x5mVar.b).plus(new gu3(x5mVar.getClass().getSimpleName()));
        }
        x5mVar.getClass();
        coroutineContext.getClass();
        function1.getClass();
        return xw3.L(un0.z(x5mVar), coroutineContext, null, new vyl(function1, null), 2);
    }

    public static yda safeViewModelScopeMainImmediate$default(x5m x5mVar, CoroutineContext coroutineContext, Function1 function1, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: safeViewModelScopeMainImmediate");
            return null;
        }
        if ((i & 1) != 0) {
            hs4 hs4Var = z45.a;
            coroutineContext = rob.a.f.plus(x5mVar.b).plus(new gu3(x5mVar.getClass().getSimpleName()));
        }
        x5mVar.getClass();
        coroutineContext.getClass();
        function1.getClass();
        return xw3.L(un0.z(x5mVar), coroutineContext, null, new r5m(function1, null), 2);
    }
}
