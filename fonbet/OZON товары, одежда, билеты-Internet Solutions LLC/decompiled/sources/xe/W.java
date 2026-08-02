package xe;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface W {

    /* loaded from: classes10.dex */
    public static final class a {
        @NotNull
        public static InterfaceC10724g0 a(long j11, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
            return T.a().k(j11, runnable, coroutineContext);
        }
    }

    @NotNull
    InterfaceC10724g0 k(long j11, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext);

    void o(long j11, @NotNull C10737n c10737n);
}
