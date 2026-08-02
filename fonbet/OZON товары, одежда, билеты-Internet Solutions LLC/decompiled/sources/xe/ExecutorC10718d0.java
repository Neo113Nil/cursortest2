package xe;

import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* renamed from: xe.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class ExecutorC10718d0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final I f105446a;

    public ExecutorC10718d0(@NotNull I i11) {
        this.f105446a = i11;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NotNull Runnable runnable) {
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f71771a;
        I i11 = this.f105446a;
        if (i11.t(gVar)) {
            i11.q(gVar, runnable);
        } else {
            runnable.run();
        }
    }

    @NotNull
    public final String toString() {
        return this.f105446a.toString();
    }
}
