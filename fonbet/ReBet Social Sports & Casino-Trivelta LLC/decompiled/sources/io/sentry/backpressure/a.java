package io.sentry.backpressure;

import io.agora.rtc2.video.FaceShapeAreaOptions;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.InterfaceC4740e0;
import io.sentry.InterfaceC4760i0;
import io.sentry.InterfaceC4765j0;
import io.sentry.util.C4843a;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes3.dex */
public final class a implements b, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final F3 f51900a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4740e0 f51901b;

    /* renamed from: c, reason: collision with root package name */
    public int f51902c = 0;

    /* renamed from: d, reason: collision with root package name */
    public volatile Future f51903d = null;

    /* renamed from: e, reason: collision with root package name */
    public final C4843a f51904e = new C4843a();

    public a(F3 f32, InterfaceC4740e0 interfaceC4740e0) {
        this.f51900a = f32;
        this.f51901b = interfaceC4740e0;
    }

    @Override // io.sentry.backpressure.b
    public int a() {
        return this.f51902c;
    }

    public void b() {
        if (c()) {
            if (this.f51902c > 0) {
                this.f51900a.getLogger().c(EnumC4788n3.DEBUG, "Health check positive, reverting to normal sampling.", new Object[0]);
            }
            this.f51902c = 0;
        } else {
            int i10 = this.f51902c;
            if (i10 < 10) {
                this.f51902c = i10 + 1;
                this.f51900a.getLogger().c(EnumC4788n3.DEBUG, "Health check negative, downsampling with a factor of %d", Integer.valueOf(this.f51902c));
            }
        }
    }

    public final boolean c() {
        return this.f51901b.c();
    }

    @Override // io.sentry.backpressure.b
    public void close() {
        Future future = this.f51903d;
        if (future != null) {
            InterfaceC4765j0 d10 = this.f51904e.d();
            try {
                future.cancel(true);
                if (d10 != null) {
                    d10.close();
                }
            } catch (Throwable th2) {
                if (d10 != null) {
                    try {
                        d10.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public final void d(int i10) {
        InterfaceC4760i0 executorService = this.f51900a.getExecutorService();
        if (executorService.isClosed()) {
            return;
        }
        InterfaceC4765j0 d10 = this.f51904e.d();
        try {
            try {
                this.f51903d = executorService.b(this, i10);
            } catch (RejectedExecutionException e10) {
                this.f51900a.getLogger().b(EnumC4788n3.WARNING, "Backpressure monitor reschedule task rejected", e10);
            }
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        b();
        d(10000);
    }

    @Override // io.sentry.backpressure.b
    public void start() {
        d(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION);
    }
}
