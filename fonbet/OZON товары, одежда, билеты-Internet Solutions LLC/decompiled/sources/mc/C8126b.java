package mc;

import Kc.C3493a;
import android.os.Handler;
import android.os.Message;
import io.reactivex.x;
import java.util.concurrent.TimeUnit;
import nc.InterfaceC8487b;
import rc.e;

/* renamed from: mc.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8126b extends x {

    /* renamed from: b, reason: collision with root package name */
    private final Handler f74713b;

    /* renamed from: mc.b$a */
    private static final class a extends x.c {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f74714a;

        /* renamed from: b, reason: collision with root package name */
        private volatile boolean f74715b;

        a(Handler handler) {
            this.f74714a = handler;
        }

        @Override // io.reactivex.x.c
        public final InterfaceC8487b b(Runnable runnable, long j11, TimeUnit timeUnit) {
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            if (this.f74715b) {
                return e.INSTANCE;
            }
            Handler handler = this.f74714a;
            RunnableC1267b runnableC1267b = new RunnableC1267b(handler, runnable);
            Message obtain = Message.obtain(handler, runnableC1267b);
            obtain.obj = this;
            this.f74714a.sendMessageDelayed(obtain, timeUnit.toMillis(j11));
            if (!this.f74715b) {
                return runnableC1267b;
            }
            this.f74714a.removeCallbacks(runnableC1267b);
            return e.INSTANCE;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f74715b = true;
            this.f74714a.removeCallbacksAndMessages(this);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f74715b;
        }
    }

    /* renamed from: mc.b$b, reason: collision with other inner class name */
    private static final class RunnableC1267b implements Runnable, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f74716a;

        /* renamed from: b, reason: collision with root package name */
        private final Runnable f74717b;

        /* renamed from: c, reason: collision with root package name */
        private volatile boolean f74718c;

        RunnableC1267b(Handler handler, Runnable runnable) {
            this.f74716a = handler;
            this.f74717b = runnable;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f74718c = true;
            this.f74716a.removeCallbacks(this);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f74718c;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f74717b.run();
            } catch (Throwable th2) {
                C3493a.f(th2);
            }
        }
    }

    C8126b(Handler handler) {
        this.f74713b = handler;
    }

    @Override // io.reactivex.x
    public final x.c b() {
        return new a(this.f74713b);
    }

    @Override // io.reactivex.x
    public final InterfaceC8487b e(Runnable runnable, long j11, TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        Handler handler = this.f74713b;
        RunnableC1267b runnableC1267b = new RunnableC1267b(handler, runnable);
        handler.postDelayed(runnableC1267b, timeUnit.toMillis(j11));
        return runnableC1267b;
    }
}
