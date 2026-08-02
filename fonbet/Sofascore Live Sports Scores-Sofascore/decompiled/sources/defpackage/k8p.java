package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class k8p extends y7p implements ScheduledFuture {
    public final t6p a;
    public final ScheduledFuture b;

    public k8p(t6p t6pVar, ScheduledFuture scheduledFuture) {
        this.a = t6pVar;
        this.b = scheduledFuture;
    }

    @Override // defpackage.u7p, defpackage.z2p
    public final /* synthetic */ Object b() {
        return this.a;
    }

    @Override // defpackage.y7p, defpackage.u7p
    public final /* synthetic */ Future c() {
        return this.a;
    }

    @Override // defpackage.u7p, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean cancel = this.a.cancel(z);
        if (cancel) {
            this.b.cancel(z);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.b.compareTo(delayed);
    }

    @Override // defpackage.y7p
    public final ddb d() {
        return this.a;
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.b.getDelay(timeUnit);
    }
}
