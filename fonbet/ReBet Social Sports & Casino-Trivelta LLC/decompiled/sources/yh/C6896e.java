package yh;

import androidx.lifecycle.AbstractC2177b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: yh.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6896e {

    /* renamed from: e, reason: collision with root package name */
    public static final C6896e f68416e = new C6896e().k();

    /* renamed from: f, reason: collision with root package name */
    public static final C6896e f68417f = new C6896e().b();

    /* renamed from: a, reason: collision with root package name */
    public Boolean f68418a = null;

    /* renamed from: b, reason: collision with root package name */
    public Throwable f68419b = null;

    /* renamed from: c, reason: collision with root package name */
    public final List f68420c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final Object f68421d = new Object();

    public static /* synthetic */ void a(C6896e c6896e, AtomicBoolean atomicBoolean, AtomicReference atomicReference, AtomicInteger atomicInteger, C6896e c6896e2) {
        if (!c6896e.f()) {
            atomicBoolean.set(true);
            Throwable d10 = c6896e.d();
            if (d10 != null) {
                AbstractC2177b.a(atomicReference, null, d10);
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            if (atomicBoolean.get()) {
                c6896e2.c((Throwable) atomicReference.get());
            } else {
                c6896e2.k();
            }
        }
    }

    public static C6896e h(Collection collection) {
        if (collection.isEmpty()) {
            return j();
        }
        final C6896e c6896e = new C6896e();
        final AtomicInteger atomicInteger = new AtomicInteger(collection.size());
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        final AtomicReference atomicReference = new AtomicReference();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            final C6896e c6896e2 = (C6896e) it.next();
            c6896e2.l(new Runnable() { // from class: yh.d
                @Override // java.lang.Runnable
                public final void run() {
                    C6896e.a(C6896e.this, atomicBoolean, atomicReference, atomicInteger, c6896e);
                }
            });
        }
        return c6896e;
    }

    public static C6896e i() {
        return f68417f;
    }

    public static C6896e j() {
        return f68416e;
    }

    public C6896e b() {
        return c(null);
    }

    public final C6896e c(Throwable th2) {
        synchronized (this.f68421d) {
            try {
                if (this.f68418a == null) {
                    this.f68418a = Boolean.FALSE;
                    this.f68419b = th2;
                    Iterator it = this.f68420c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return this;
    }

    public Throwable d() {
        Throwable th2;
        synchronized (this.f68421d) {
            th2 = this.f68419b;
        }
        return th2;
    }

    public boolean e() {
        boolean z10;
        synchronized (this.f68421d) {
            z10 = this.f68418a != null;
        }
        return z10;
    }

    public boolean f() {
        boolean z10;
        synchronized (this.f68421d) {
            try {
                Boolean bool = this.f68418a;
                z10 = bool != null && bool.booleanValue();
            } finally {
            }
        }
        return z10;
    }

    public C6896e g(long j10, TimeUnit timeUnit) {
        if (e()) {
            return this;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        l(new Runnable() { // from class: yh.c
            @Override // java.lang.Runnable
            public final void run() {
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await(j10, timeUnit);
            return this;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return this;
        }
    }

    public C6896e k() {
        synchronized (this.f68421d) {
            try {
                if (this.f68418a == null) {
                    this.f68418a = Boolean.TRUE;
                    Iterator it = this.f68420c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this;
    }

    public C6896e l(Runnable runnable) {
        boolean z10;
        synchronized (this.f68421d) {
            if (this.f68418a != null) {
                z10 = true;
            } else {
                this.f68420c.add(runnable);
                z10 = false;
            }
        }
        if (z10) {
            runnable.run();
        }
        return this;
    }
}
