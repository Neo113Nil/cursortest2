package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public abstract class o {
    public static final Object a(Function2 function2, Continuation continuation) {
        n nVar = new n(continuation.get$context(), continuation);
        Object d10 = Th.b.d(nVar, nVar, function2);
        if (d10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return d10;
    }
}
