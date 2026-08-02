package aa;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f94a;

    /* renamed from: b, reason: collision with root package name */
    public final int f95b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f96c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f97d;

    /* renamed from: e, reason: collision with root package name */
    public final ScheduledExecutorService f98e;

    /* renamed from: f, reason: collision with root package name */
    public ScheduledFuture f99f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f100g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f101h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f102i;

    public g(ScheduledExecutorService scheduledExecutorService, Runnable runnable, Runnable runnable2, int i5, int i10) {
        this.f100g = new Object();
        this.f101h = new Object();
        this.f102i = new AtomicBoolean();
        this.f98e = scheduledExecutorService;
        this.f96c = runnable;
        this.f97d = runnable2;
        this.f94a = i5;
        this.f95b = i10;
    }

    public final void a(int i5) {
        if (this.f102i.get()) {
            synchronized (this.f100g) {
                try {
                    if (this.f99f == null) {
                        this.f99f = this.f98e.schedule(new c(0, this), i5, TimeUnit.MILLISECONDS);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void b() {
        synchronized (this.f101h) {
            synchronized (this.f100g) {
                try {
                    ScheduledFuture scheduledFuture = this.f99f;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f99f = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            a(this.f94a);
        }
    }

    public final void c() {
        if (this.f102i.compareAndSet(false, true)) {
            a(this.f94a);
        }
    }

    public final void d() {
        if (this.f102i.compareAndSet(true, false)) {
            synchronized (this.f100g) {
                try {
                    ScheduledFuture scheduledFuture = this.f99f;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Runnable runnable = this.f97d;
            if (runnable != null) {
                this.f98e.execute(runnable);
            }
            this.f98e.shutdown();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(ScheduledExecutorService scheduledExecutorService, final f fVar, int i5) {
        this(scheduledExecutorService, r2, new Runnable() { // from class: aa.e
            @Override // java.lang.Runnable
            public final void run() {
                switch (r2) {
                    case 0:
                        fVar.c();
                        break;
                    default:
                        fVar.d();
                        break;
                }
            }
        }, i5, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
        final int i10 = 0;
        Runnable runnable = new Runnable() { // from class: aa.e
            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        fVar.c();
                        break;
                    default:
                        fVar.d();
                        break;
                }
            }
        };
        final int i11 = 1;
    }
}
