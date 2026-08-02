package Ph;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: Ph.a0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1440a0 {
    public static final Object a(long j10, Continuation continuation) {
        if (j10 <= 0) {
            return Unit.INSTANCE;
        }
        C1469p c1469p = new C1469p(IntrinsicsKt.intercepted(continuation), 1);
        c1469p.F();
        if (j10 < LongCompanionObject.MAX_VALUE) {
            b(c1469p.get$context()).w0(j10, c1469p);
        }
        Object z10 = c1469p.z();
        if (z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? z10 : Unit.INSTANCE;
    }

    public static final Z b(CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(ContinuationInterceptor.INSTANCE);
        Z z10 = element instanceof Z ? (Z) element : null;
        return z10 == null ? W.a() : z10;
    }
}
