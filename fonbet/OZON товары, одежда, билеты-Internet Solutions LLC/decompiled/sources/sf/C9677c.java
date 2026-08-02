package sf;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: sf.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C9677c extends N {

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final ReentrantLock f98696h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static final Condition f98697i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f98698j;

    /* renamed from: k, reason: collision with root package name */
    private static final long f98699k;

    /* renamed from: l, reason: collision with root package name */
    private static C9677c f98700l;

    /* renamed from: e, reason: collision with root package name */
    private boolean f98701e;

    /* renamed from: f, reason: collision with root package name */
    private C9677c f98702f;

    /* renamed from: g, reason: collision with root package name */
    private long f98703g;

    /* renamed from: sf.c$a */
    public static final class a {
        public static C9677c a() throws InterruptedException {
            C9677c c9677c = C9677c.f98700l;
            Intrinsics.f(c9677c);
            C9677c c9677c2 = c9677c.f98702f;
            if (c9677c2 == null) {
                long nanoTime = System.nanoTime();
                C9677c.f98697i.await(C9677c.f98698j, TimeUnit.MILLISECONDS);
                C9677c c9677c3 = C9677c.f98700l;
                Intrinsics.f(c9677c3);
                if (c9677c3.f98702f != null || System.nanoTime() - nanoTime < C9677c.f98699k) {
                    return null;
                }
                return C9677c.f98700l;
            }
            long o11 = C9677c.o(c9677c2, System.nanoTime());
            if (o11 > 0) {
                C9677c.f98697i.await(o11, TimeUnit.NANOSECONDS);
                return null;
            }
            C9677c c9677c4 = C9677c.f98700l;
            Intrinsics.f(c9677c4);
            c9677c4.f98702f = c9677c2.f98702f;
            c9677c2.f98702f = null;
            return c9677c2;
        }
    }

    /* renamed from: sf.c$b */
    private static final class b extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            ReentrantLock reentrantLock;
            C9677c a11;
            while (true) {
                try {
                    reentrantLock = C9677c.f98696h;
                    reentrantLock.lock();
                    try {
                        a11 = a.a();
                    } finally {
                        reentrantLock.unlock();
                    }
                } catch (InterruptedException unused) {
                }
                if (a11 == C9677c.f98700l) {
                    C9677c.f98700l = null;
                    return;
                }
                Unit unit = Unit.f71690a;
                reentrantLock.unlock();
                if (a11 != null) {
                    a11.u();
                }
            }
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f98696h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(newCondition, "lock.newCondition()");
        f98697i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f98698j = millis;
        f98699k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public static final long o(C9677c c9677c, long j11) {
        return c9677c.f98703g - j11;
    }

    public final void r() {
        long h11 = h();
        boolean e11 = e();
        if (h11 != 0 || e11) {
            ReentrantLock reentrantLock = f98696h;
            reentrantLock.lock();
            try {
                if (this.f98701e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f98701e = true;
                if (f98700l == null) {
                    f98700l = new C9677c();
                    b bVar = new b("Okio Watchdog");
                    bVar.setDaemon(true);
                    bVar.start();
                }
                long nanoTime = System.nanoTime();
                if (h11 != 0 && e11) {
                    this.f98703g = Math.min(h11, c() - nanoTime) + nanoTime;
                } else if (h11 != 0) {
                    this.f98703g = h11 + nanoTime;
                } else {
                    if (!e11) {
                        throw new AssertionError();
                    }
                    this.f98703g = c();
                }
                long j11 = this.f98703g - nanoTime;
                C9677c c9677c = f98700l;
                Intrinsics.f(c9677c);
                while (true) {
                    C9677c c9677c2 = c9677c.f98702f;
                    if (c9677c2 == null) {
                        break;
                    }
                    Intrinsics.f(c9677c2);
                    if (j11 < c9677c2.f98703g - nanoTime) {
                        break;
                    }
                    c9677c = c9677c.f98702f;
                    Intrinsics.f(c9677c);
                }
                this.f98702f = c9677c.f98702f;
                c9677c.f98702f = this;
                if (c9677c == f98700l) {
                    f98697i.signal();
                }
                Unit unit = Unit.f71690a;
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    public final boolean s() {
        ReentrantLock reentrantLock = f98696h;
        reentrantLock.lock();
        try {
            if (!this.f98701e) {
                return false;
            }
            this.f98701e = false;
            C9677c c9677c = f98700l;
            while (c9677c != null) {
                C9677c c9677c2 = c9677c.f98702f;
                if (c9677c2 == this) {
                    c9677c.f98702f = this.f98702f;
                    this.f98702f = null;
                    return false;
                }
                c9677c = c9677c2;
            }
            reentrantLock.unlock();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    @NotNull
    protected IOException t(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    protected void u() {
    }
}
