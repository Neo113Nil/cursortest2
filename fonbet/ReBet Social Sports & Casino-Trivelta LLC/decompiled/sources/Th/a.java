package Th;

import Ph.C1442b0;
import Sh.AbstractC1572j;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(Continuation continuation, Throwable th2) {
        if (th2 instanceof C1442b0) {
            th2 = ((C1442b0) th2).getCause();
        }
        Result.Companion companion = Result.INSTANCE;
        continuation.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(th2)));
        throw th2;
    }

    public static final void b(Continuation continuation, Continuation continuation2) {
        try {
            Continuation intercepted = IntrinsicsKt.intercepted(continuation);
            Result.Companion companion = Result.INSTANCE;
            AbstractC1572j.b(intercepted, Result.m147constructorimpl(Unit.INSTANCE));
        } catch (Throwable th2) {
            a(continuation2, th2);
        }
    }

    public static final void c(Function2 function2, Object obj, Continuation continuation) {
        try {
            Continuation intercepted = IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(function2, obj, continuation));
            Result.Companion companion = Result.INSTANCE;
            AbstractC1572j.b(intercepted, Result.m147constructorimpl(Unit.INSTANCE));
        } catch (Throwable th2) {
            a(continuation, th2);
        }
    }
}
