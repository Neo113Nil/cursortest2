package eg;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class n0 implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledFuture f9206a;

    public n0(ScheduledFuture scheduledFuture) {
        this.f9206a = scheduledFuture;
    }

    @Override // eg.o0
    public final void b() {
        this.f9206a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f9206a + ']';
    }
}
