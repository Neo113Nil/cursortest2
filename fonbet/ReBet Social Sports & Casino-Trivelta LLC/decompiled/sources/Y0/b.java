package Y0;

import Ph.C1452g0;
import Ph.X0;
import kotlin.NotImplementedError;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes.dex */
public abstract class b {
    public static final a a() {
        CoroutineContext coroutineContext;
        try {
            coroutineContext = C1452g0.c().e2();
        } catch (IllegalStateException unused) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        } catch (NotImplementedError unused2) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return new a(coroutineContext.plus(X0.b(null, 1, null)));
    }
}
