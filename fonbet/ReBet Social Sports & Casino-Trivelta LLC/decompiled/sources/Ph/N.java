package Ph;

import Sh.AbstractC1569g;
import kotlin.ExceptionsKt;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public abstract class N {
    public static final void a(CoroutineContext coroutineContext, Throwable th2) {
        if (th2 instanceof C1442b0) {
            th2 = ((C1442b0) th2).getCause();
        }
        try {
            M m10 = (M) coroutineContext.get(M.f9041T2);
            if (m10 != null) {
                m10.handleException(coroutineContext, th2);
            } else {
                AbstractC1569g.a(coroutineContext, th2);
            }
        } catch (Throwable th3) {
            AbstractC1569g.a(coroutineContext, b(th2, th3));
        }
    }

    public static final Throwable b(Throwable th2, Throwable th3) {
        if (th2 == th3) {
            return th2;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
        ExceptionsKt.addSuppressed(runtimeException, th2);
        return runtimeException;
    }
}
