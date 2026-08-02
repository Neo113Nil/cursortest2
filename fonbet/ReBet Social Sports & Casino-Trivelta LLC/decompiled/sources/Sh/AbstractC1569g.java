package Sh;

import java.util.Iterator;
import kotlin.ExceptionsKt;
import kotlin.coroutines.CoroutineContext;

/* renamed from: Sh.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1569g {
    public static final void a(CoroutineContext coroutineContext, Throwable th2) {
        Iterator it = AbstractC1568f.a().iterator();
        while (it.hasNext()) {
            try {
                ((Ph.M) it.next()).handleException(coroutineContext, th2);
            } catch (C1573k unused) {
                return;
            } catch (Throwable th3) {
                AbstractC1568f.b(Ph.N.b(th2, th3));
            }
        }
        try {
            ExceptionsKt.addSuppressed(th2, new C1570h(coroutineContext));
        } catch (Throwable unused2) {
        }
        AbstractC1568f.b(th2);
    }
}
