package B6;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f812a = new AtomicInteger(0);

    public void a() {
        if (this.f812a.compareAndSet(0, 2)) {
            d();
        }
    }

    public abstract void b(Object obj);

    public abstract Object c();

    public abstract void d();

    public abstract void e(Exception exc);

    public abstract void f(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f812a.compareAndSet(0, 1)) {
            try {
                Object c10 = c();
                this.f812a.set(3);
                try {
                    f(c10);
                } finally {
                    b(c10);
                }
            } catch (Exception e10) {
                this.f812a.set(4);
                e(e10);
            }
        }
    }
}
