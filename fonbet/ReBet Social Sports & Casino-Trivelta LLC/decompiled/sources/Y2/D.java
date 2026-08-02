package Y2;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class D implements Z2.a {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f13904b;

    /* renamed from: c, reason: collision with root package name */
    public Runnable f13905c;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f13903a = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final Object f13906d = new Object();

    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final D f13907a;

        /* renamed from: b, reason: collision with root package name */
        public final Runnable f13908b;

        public a(D d10, Runnable runnable) {
            this.f13907a = d10;
            this.f13908b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f13908b.run();
                synchronized (this.f13907a.f13906d) {
                    this.f13907a.a();
                }
            } catch (Throwable th2) {
                synchronized (this.f13907a.f13906d) {
                    this.f13907a.a();
                    throw th2;
                }
            }
        }
    }

    public D(Executor executor) {
        this.f13904b = executor;
    }

    public void a() {
        Runnable runnable = (Runnable) this.f13903a.poll();
        this.f13905c = runnable;
        if (runnable != null) {
            this.f13904b.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f13906d) {
            try {
                this.f13903a.add(new a(this, runnable));
                if (this.f13905c == null) {
                    a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Z2.a
    public boolean n1() {
        boolean z10;
        synchronized (this.f13906d) {
            z10 = !this.f13903a.isEmpty();
        }
        return z10;
    }
}
