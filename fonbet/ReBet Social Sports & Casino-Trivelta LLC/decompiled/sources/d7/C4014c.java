package d7;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: d7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4014c extends AbstractC4013b {

    /* renamed from: e, reason: collision with root package name */
    public final K6.b f45012e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f45013f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f45014g;

    /* renamed from: h, reason: collision with root package name */
    public long f45015h;

    /* renamed from: i, reason: collision with root package name */
    public long f45016i;

    /* renamed from: j, reason: collision with root package name */
    public long f45017j;

    /* renamed from: k, reason: collision with root package name */
    public b f45018k;

    /* renamed from: l, reason: collision with root package name */
    public final Runnable f45019l;

    /* renamed from: d7.c$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C4014c.this) {
                try {
                    C4014c.this.f45014g = false;
                    if (!C4014c.this.t()) {
                        C4014c.this.u();
                    } else if (C4014c.this.f45018k != null) {
                        C4014c.this.f45018k.k();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: d7.c$b */
    public interface b {
        void k();
    }

    public C4014c(InterfaceC4012a interfaceC4012a, b bVar, K6.b bVar2, ScheduledExecutorService scheduledExecutorService) {
        super(interfaceC4012a);
        this.f45014g = false;
        this.f45016i = 2000L;
        this.f45017j = 1000L;
        this.f45019l = new a();
        this.f45018k = bVar;
        this.f45012e = bVar2;
        this.f45013f = scheduledExecutorService;
    }

    public static AbstractC4013b r(InterfaceC4012a interfaceC4012a, K6.b bVar, ScheduledExecutorService scheduledExecutorService) {
        return s(interfaceC4012a, (b) interfaceC4012a, bVar, scheduledExecutorService);
    }

    public static AbstractC4013b s(InterfaceC4012a interfaceC4012a, b bVar, K6.b bVar2, ScheduledExecutorService scheduledExecutorService) {
        return new C4014c(interfaceC4012a, bVar, bVar2, scheduledExecutorService);
    }

    @Override // d7.AbstractC4013b, d7.InterfaceC4012a
    public boolean j(Drawable drawable, Canvas canvas, int i10) {
        this.f45015h = this.f45012e.now();
        boolean j10 = super.j(drawable, canvas, i10);
        u();
        return j10;
    }

    public final boolean t() {
        return this.f45012e.now() - this.f45015h > this.f45016i;
    }

    public final synchronized void u() {
        if (!this.f45014g) {
            this.f45014g = true;
            this.f45013f.schedule(this.f45019l, this.f45017j, TimeUnit.MILLISECONDS);
        }
    }
}
