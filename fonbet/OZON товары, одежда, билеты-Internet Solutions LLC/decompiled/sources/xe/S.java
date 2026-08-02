package xe;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import xe.AbstractC10734l0;

/* loaded from: classes.dex */
public final class S extends AbstractC10734l0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    public static final S f105415i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f105416j;

    static {
        Long l11;
        S s11 = new S();
        f105415i = s11;
        s11.E0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l11 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l11 = 1000L;
        }
        f105416j = timeUnit.toNanos(l11.longValue());
    }

    private final synchronized void m1() {
        int i11 = debugStatus;
        if (i11 == 2 || i11 == 3) {
            debugStatus = 3;
            k1();
            notifyAll();
        }
    }

    @Override // xe.AbstractC10736m0
    @NotNull
    protected final Thread T0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(f105415i.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // xe.AbstractC10736m0
    protected final void V0(long j11, @NotNull AbstractC10734l0.c cVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // xe.AbstractC10734l0
    public final void a1(@NotNull Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.a1(runnable);
    }

    @Override // xe.AbstractC10734l0, xe.W
    @NotNull
    public final InterfaceC10724g0 k(long j11, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        long c11 = C10738n0.c(j11);
        if (c11 >= 4611686018427387903L) {
            return O0.f105413a;
        }
        long nanoTime = System.nanoTime();
        AbstractC10734l0.b bVar = new AbstractC10734l0.b(runnable, c11 + nanoTime);
        l1(nanoTime, bVar);
        return bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean j12;
        Z0.d(this);
        try {
            synchronized (this) {
                int i11 = debugStatus;
                if (i11 == 2 || i11 == 3) {
                    if (j12) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j11 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long L02 = L0();
                    if (L02 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j11 == Long.MAX_VALUE) {
                            j11 = f105416j + nanoTime;
                        }
                        long j13 = j11 - nanoTime;
                        if (j13 <= 0) {
                            _thread = null;
                            m1();
                            if (j1()) {
                                return;
                            }
                            T0();
                            return;
                        }
                        if (L02 > j13) {
                            L02 = j13;
                        }
                    } else {
                        j11 = Long.MAX_VALUE;
                    }
                    if (L02 > 0) {
                        int i12 = debugStatus;
                        if (i12 == 2 || i12 == 3) {
                            _thread = null;
                            m1();
                            if (j1()) {
                                return;
                            }
                            T0();
                            return;
                        }
                        LockSupport.parkNanos(this, L02);
                    }
                }
            }
        } finally {
            _thread = null;
            m1();
            if (!j1()) {
                T0();
            }
        }
    }

    @Override // xe.AbstractC10734l0, xe.AbstractC10732k0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // xe.I
    @NotNull
    public final String toString() {
        return "DefaultExecutor";
    }
}
