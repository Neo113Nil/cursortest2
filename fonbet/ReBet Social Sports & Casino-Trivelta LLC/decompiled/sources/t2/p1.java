package t2;

import e1.AbstractC4134a;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import t2.p1;

/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f65491a;

    /* renamed from: b, reason: collision with root package name */
    public final a f65492b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f65493c = e1.Z.c1("WatchdogTimer");

    /* renamed from: d, reason: collision with root package name */
    public ScheduledFuture f65494d;

    public interface a {
        void a();
    }

    public p1(long j10, a aVar) {
        this.f65491a = j10;
        this.f65492b = aVar;
    }

    public final void a() {
        ((ScheduledFuture) AbstractC4134a.e(this.f65494d)).cancel(false);
    }

    public void b() {
        a();
        c();
    }

    public final void c() {
        ScheduledExecutorService scheduledExecutorService = this.f65493c;
        final a aVar = this.f65492b;
        Objects.requireNonNull(aVar);
        this.f65494d = scheduledExecutorService.schedule(new Runnable() { // from class: t2.o1
            @Override // java.lang.Runnable
            public final void run() {
                p1.a.this.a();
            }
        }, this.f65491a, TimeUnit.MILLISECONDS);
    }

    public void d() {
        c();
    }

    public void e() {
        a();
        this.f65493c.shutdownNow();
    }
}
