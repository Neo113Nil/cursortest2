package xe;

import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* renamed from: xe.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10747s0 {
    @NotNull
    public static final Executor a(@NotNull I i11) {
        Executor x11;
        AbstractC10744q0 abstractC10744q0 = i11 instanceof AbstractC10744q0 ? (AbstractC10744q0) i11 : null;
        return (abstractC10744q0 == null || (x11 = abstractC10744q0.x()) == null) ? new ExecutorC10718d0(i11) : x11;
    }

    @NotNull
    public static final I b(@NotNull Executor executor) {
        I i11;
        ExecutorC10718d0 executorC10718d0 = executor instanceof ExecutorC10718d0 ? (ExecutorC10718d0) executor : null;
        return (executorC10718d0 == null || (i11 = executorC10718d0.f105446a) == null) ? new C10745r0(executor) : i11;
    }
}
