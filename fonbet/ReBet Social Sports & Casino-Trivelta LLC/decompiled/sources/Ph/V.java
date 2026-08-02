package Ph;

import Ph.AbstractC1466n0;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public final class V extends AbstractC1466n0 implements Runnable {

    @Nullable
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: h, reason: collision with root package name */
    public static final V f9056h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f9057i;

    static {
        Long l10;
        V v10 = new V();
        f9056h = v10;
        AbstractC1464m0.k2(v10, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f9057i = timeUnit.toNanos(l10.longValue());
    }

    @Override // Ph.AbstractC1466n0, Ph.Z
    public InterfaceC1456i0 J(long j10, Runnable runnable, CoroutineContext coroutineContext) {
        return H2(j10, runnable);
    }

    public final synchronized void K2() {
        if (N2()) {
            debugStatus = 3;
            E2();
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final synchronized Thread L2() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(f9056h.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    public final boolean M2() {
        return debugStatus == 4;
    }

    public final boolean N2() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    public final synchronized boolean O2() {
        if (N2()) {
            return false;
        }
        debugStatus = 1;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    public final void P2() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // Ph.AbstractC1468o0
    public Thread q2() {
        Thread thread = _thread;
        return thread == null ? L2() : thread;
    }

    @Override // Ph.AbstractC1468o0
    public void r2(long j10, AbstractC1466n0.c cVar) {
        P2();
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean C22;
        a1.f9061a.d(this);
        AbstractC1443c.a();
        try {
            if (!O2()) {
                if (C22) {
                    return;
                } else {
                    return;
                }
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long n22 = n2();
                if (n22 == LongCompanionObject.MAX_VALUE) {
                    AbstractC1443c.a();
                    long nanoTime = System.nanoTime();
                    if (j10 == LongCompanionObject.MAX_VALUE) {
                        j10 = f9057i + nanoTime;
                    }
                    long j11 = j10 - nanoTime;
                    if (j11 <= 0) {
                        _thread = null;
                        K2();
                        AbstractC1443c.a();
                        if (C2()) {
                            return;
                        }
                        q2();
                        return;
                    }
                    n22 = RangesKt.coerceAtMost(n22, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (n22 > 0) {
                    if (N2()) {
                        _thread = null;
                        K2();
                        AbstractC1443c.a();
                        if (C2()) {
                            return;
                        }
                        q2();
                        return;
                    }
                    AbstractC1443c.a();
                    LockSupport.parkNanos(this, n22);
                }
            }
        } finally {
            _thread = null;
            K2();
            AbstractC1443c.a();
            if (!C2()) {
                q2();
            }
        }
    }

    @Override // Ph.AbstractC1466n0, Ph.AbstractC1464m0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // Ph.L
    public String toString() {
        return "DefaultExecutor";
    }

    @Override // Ph.AbstractC1466n0
    public void w2(Runnable runnable) {
        if (M2()) {
            P2();
        }
        super.w2(runnable);
    }
}
