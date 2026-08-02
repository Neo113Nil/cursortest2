package p8;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends u.g implements ScheduledFuture {

    /* renamed from: h, reason: collision with root package name */
    public final ScheduledFuture f21551h;

    public g(f fVar) {
        this.f21551h = fVar.a(new i2.d(25, this));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f21551h.compareTo(delayed);
    }

    @Override // u.g
    public final void d() {
        ScheduledFuture scheduledFuture = this.f21551h;
        Object obj = this.f23995a;
        scheduledFuture.cancel((obj instanceof u.a) && ((u.a) obj).f23976a);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f21551h.getDelay(timeUnit);
    }
}
