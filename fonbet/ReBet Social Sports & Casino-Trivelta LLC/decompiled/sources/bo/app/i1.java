package bo.app;

import Ph.M;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class i1 extends AbstractCoroutineContextElement implements M {
    public i1(M.a aVar) {
        super(aVar);
    }

    @Override // Ph.M
    public final void handleException(CoroutineContext coroutineContext, Throwable th2) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeCoroutineScope, BrazeLogger.Priority.f29470E, th2, false, (Function0) new g1(th2), 4, (Object) null);
        if (brazeCoroutineScope.getShouldReRaiseExceptions$android_sdk_base_release()) {
            throw th2;
        }
    }
}
