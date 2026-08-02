package Ph;

import Sh.AbstractC1572j;
import Sh.C1571i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;

/* loaded from: classes5.dex */
public abstract class n1 {
    public static final Object a(Continuation continuation) {
        Object coroutine_suspended;
        CoroutineContext coroutineContext = continuation.get$context();
        F0.m(coroutineContext);
        Continuation intercepted = IntrinsicsKt.intercepted(continuation);
        C1571i c1571i = intercepted instanceof C1571i ? (C1571i) intercepted : null;
        if (c1571i == null) {
            coroutine_suspended = Unit.INSTANCE;
        } else {
            if (AbstractC1572j.d(c1571i.f10789d, coroutineContext)) {
                c1571i.p(coroutineContext, Unit.INSTANCE);
            } else {
                m1 m1Var = new m1();
                CoroutineContext plus = coroutineContext.plus(m1Var);
                Unit unit = Unit.INSTANCE;
                c1571i.p(plus, unit);
                if (m1Var.f9111a) {
                    coroutine_suspended = AbstractC1572j.e(c1571i) ? IntrinsicsKt.getCOROUTINE_SUSPENDED() : unit;
                }
            }
            coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutine_suspended : Unit.INSTANCE;
    }
}
