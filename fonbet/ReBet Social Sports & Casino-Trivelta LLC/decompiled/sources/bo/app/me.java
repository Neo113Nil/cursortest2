package bo.app;

import Ph.M;
import com.braze.support.BrazeLogger;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class me extends AbstractCoroutineContextElement implements M {
    public me(M.a aVar) {
        super(aVar);
    }

    @Override // Ph.M
    public final void handleException(CoroutineContext coroutineContext, Throwable th2) {
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) ne.f25833a, BrazeLogger.Priority.f29470E, th2, false, (Function0) new le(th2), 4, (Object) null);
            r7 r7Var = ne.f25834b;
            if (r7Var != null) {
                r7Var.b(th2, Throwable.class);
            }
        } catch (Exception unused) {
        }
    }
}
