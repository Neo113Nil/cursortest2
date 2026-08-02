package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class n extends Sh.C {
    public n(CoroutineContext coroutineContext, Continuation continuation) {
        super(coroutineContext, continuation);
    }

    @Override // Ph.I0
    public boolean H(Throwable th2) {
        if (th2 instanceof k) {
            return true;
        }
        return C(th2);
    }
}
