package com.braze.coroutine;

import com.braze.support.BrazeLogger;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes6.dex */
public final class e extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    public e(CoroutineExceptionHandler.Companion companion) {
        super(companion);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f.f492a, BrazeLogger.Priority.E, th, false, (Function0) new d(th), 4, (Object) null);
            com.braze.events.d dVar = f.b;
            if (dVar != null) {
                dVar.b(th, Throwable.class);
            }
        } catch (Exception unused) {
        }
    }
}
