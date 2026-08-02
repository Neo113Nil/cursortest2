package xe;

import De.C2864g;
import Sc.C4001c;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import xe.J;

/* loaded from: classes.dex */
public final class K {
    public static final void a(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
        try {
            J.a aVar = J.f105405n0;
            J j11 = (J) coroutineContext.get(J.a.f105406a);
            if (j11 != null) {
                j11.handleException(coroutineContext, th2);
            } else {
                C2864g.a(coroutineContext, th2);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                C4001c.a(runtimeException, th2);
                th2 = runtimeException;
            }
            C2864g.a(coroutineContext, th2);
        }
    }
}
