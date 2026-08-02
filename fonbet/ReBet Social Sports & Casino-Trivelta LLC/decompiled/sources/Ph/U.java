package Ph;

import Sh.C1571i;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public abstract class U {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(Continuation continuation) {
        Object m147constructorimpl;
        if (continuation instanceof C1571i) {
            return ((C1571i) continuation).toString();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(continuation + '@' + b(continuation));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m150exceptionOrNullimpl(m147constructorimpl) != null) {
            m147constructorimpl = continuation.getClass().getName() + '@' + b(continuation);
        }
        return (String) m147constructorimpl;
    }
}
