package Sh;

import kotlin.ExceptionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public abstract class z {
    public static final void a(Function1 function1, Object obj, CoroutineContext coroutineContext) {
        V b10 = b(function1, obj, null);
        if (b10 != null) {
            Ph.N.a(coroutineContext, b10);
        }
    }

    public static final V b(Function1 function1, Object obj, V v10) {
        try {
            function1.invoke(obj);
            return v10;
        } catch (Throwable th2) {
            if (v10 != null && v10.getCause() != th2) {
                ExceptionsKt.addSuppressed(v10, th2);
                return v10;
            }
            return new V("Exception in undelivered element handler for " + obj, th2);
        }
    }

    public static /* synthetic */ V c(Function1 function1, Object obj, V v10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            v10 = null;
        }
        return b(function1, obj, v10);
    }
}
