package Ph;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public abstract class E {
    public static final Object a(Object obj, Continuation continuation) {
        if (!(obj instanceof C)) {
            return Result.m147constructorimpl(obj);
        }
        Result.Companion companion = Result.INSTANCE;
        return Result.m147constructorimpl(ResultKt.createFailure(((C) obj).f9000a));
    }

    public static final Object b(Object obj) {
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(obj);
        return m150exceptionOrNullimpl == null ? obj : new C(m150exceptionOrNullimpl, false, 2, null);
    }

    public static final Object c(Object obj, InterfaceC1465n interfaceC1465n) {
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(obj);
        return m150exceptionOrNullimpl == null ? obj : new C(m150exceptionOrNullimpl, false, 2, null);
    }
}
