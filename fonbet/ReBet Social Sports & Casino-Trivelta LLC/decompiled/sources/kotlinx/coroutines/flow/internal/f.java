package kotlinx.coroutines.flow.internal;

import Sh.N;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.flow.InterfaceC5322g;

/* loaded from: classes5.dex */
public abstract class f {
    public static final Object b(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, Continuation continuation) {
        Object i10 = N.i(coroutineContext, obj2);
        try {
            A a10 = new A(continuation, coroutineContext);
            Object wrapWithContinuationImpl = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt.wrapWithContinuationImpl(function2, obj, a10) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(obj, a10);
            N.f(coroutineContext, i10);
            if (wrapWithContinuationImpl == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return wrapWithContinuationImpl;
        } catch (Throwable th2) {
            N.f(coroutineContext, i10);
            throw th2;
        }
    }

    public static /* synthetic */ Object c(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, Continuation continuation, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            obj2 = N.g(coroutineContext);
        }
        return b(coroutineContext, obj, obj2, function2, continuation);
    }

    public static final InterfaceC5322g d(InterfaceC5322g interfaceC5322g, CoroutineContext coroutineContext) {
        return !(interfaceC5322g instanceof z) ? interfaceC5322g instanceof s ? interfaceC5322g : new C(interfaceC5322g, coroutineContext) : interfaceC5322g;
    }
}
