package xe;

import java.util.concurrent.ScheduledFuture;
import org.jetbrains.annotations.NotNull;

/* renamed from: xe.f0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C10722f0 implements InterfaceC10724g0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ScheduledFuture f105455a;

    public C10722f0(@NotNull ScheduledFuture scheduledFuture) {
        this.f105455a = scheduledFuture;
    }

    @Override // xe.InterfaceC10724g0
    public final void dispose() {
        this.f105455a.cancel(false);
    }

    @NotNull
    public final String toString() {
        return "DisposableFutureHandle[" + this.f105455a + ']';
    }
}
