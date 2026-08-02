package Ph;

import Sh.C1567e;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public abstract class Q {
    public static final P a(CoroutineContext coroutineContext) {
        A b10;
        if (coroutineContext.get(C0.f9001U2) == null) {
            b10 = G0.b(null, 1, null);
            coroutineContext = coroutineContext.plus(b10);
        }
        return new C1567e(coroutineContext);
    }

    public static final P b() {
        return new C1567e(X0.b(null, 1, null).plus(C1452g0.c()));
    }

    public static final void c(P p10, String str, Throwable th2) {
        d(p10, AbstractC1473r0.a(str, th2));
    }

    public static final void d(P p10, CancellationException cancellationException) {
        C0 c02 = (C0) p10.getCoroutineContext().get(C0.f9001U2);
        if (c02 != null) {
            c02.cancel(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + p10).toString());
    }

    public static /* synthetic */ void e(P p10, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        c(p10, str, th2);
    }

    public static /* synthetic */ void f(P p10, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        d(p10, cancellationException);
    }

    public static final Object g(Function2 function2, Continuation continuation) {
        Sh.C c10 = new Sh.C(continuation.get$context(), continuation);
        Object d10 = Th.b.d(c10, c10, function2);
        if (d10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return d10;
    }

    public static final void h(P p10) {
        F0.m(p10.getCoroutineContext());
    }

    public static final boolean i(P p10) {
        C0 c02 = (C0) p10.getCoroutineContext().get(C0.f9001U2);
        if (c02 != null) {
            return c02.isActive();
        }
        return true;
    }
}
