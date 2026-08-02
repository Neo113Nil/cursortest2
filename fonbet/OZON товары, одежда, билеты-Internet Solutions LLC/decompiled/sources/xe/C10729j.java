package xe;

import java.util.concurrent.ScheduledFuture;
import org.jetbrains.annotations.NotNull;

/* renamed from: xe.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C10729j implements InterfaceC10731k {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ScheduledFuture f105468a;

    public C10729j(@NotNull ScheduledFuture scheduledFuture) {
        this.f105468a = scheduledFuture;
    }

    @Override // xe.InterfaceC10731k
    public final void b(Throwable th2) {
        this.f105468a.cancel(false);
    }

    @NotNull
    public final String toString() {
        return "CancelFutureOnCancel[" + this.f105468a + ']';
    }
}
