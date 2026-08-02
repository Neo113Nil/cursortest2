package eg;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class d0 extends v0 implements Runnable {

    @Nullable
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final d0 j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f9162k;

    static {
        Long l6;
        d0 d0Var = new d0();
        j = d0Var;
        d0Var.l0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l6 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l6 = 1000L;
        }
        f9162k = timeUnit.toNanos(l6.longValue());
    }

    @Override // eg.v0, eg.h0
    public final o0 C(long j6, Runnable runnable, CoroutineContext coroutineContext) {
        long j10 = j6 > 0 ? j6 >= 9223372036854L ? LongCompanionObject.MAX_VALUE : 1000000 * j6 : 0L;
        if (j10 >= 4611686018427387903L) {
            return q1.f9213a;
        }
        long nanoTime = System.nanoTime();
        s0 s0Var = new s0(runnable, j10 + nanoTime);
        x0(nanoTime, s0Var);
        return s0Var;
    }

    @Override // eg.w0
    public final Thread k0() {
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
                thread.setContextClassLoader(j.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean w02;
        w1.f9235a.set(this);
        try {
            synchronized (this) {
                int i5 = debugStatus;
                if (i5 == 2 || i5 == 3) {
                    if (w02) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                long j6 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long o02 = o0();
                    if (o02 == LongCompanionObject.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j6 == LongCompanionObject.MAX_VALUE) {
                            j6 = f9162k + nanoTime;
                        }
                        long j10 = j6 - nanoTime;
                        if (j10 <= 0) {
                            _thread = null;
                            y0();
                            if (w0()) {
                                return;
                            }
                            k0();
                            return;
                        }
                        if (o02 > j10) {
                            o02 = j10;
                        }
                    } else {
                        j6 = Long.MAX_VALUE;
                    }
                    if (o02 > 0) {
                        int i10 = debugStatus;
                        if (i10 == 2 || i10 == 3) {
                            _thread = null;
                            y0();
                            if (w0()) {
                                return;
                            }
                            k0();
                            return;
                        }
                        LockSupport.parkNanos(this, o02);
                    }
                }
            }
        } finally {
            _thread = null;
            y0();
            if (!w0()) {
                k0();
            }
        }
    }

    @Override // eg.w0
    public final void s0(long j6, t0 t0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // eg.v0, eg.w0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // eg.v0
    public final void t0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.t0(runnable);
    }

    @Override // eg.w
    public final String toString() {
        return "DefaultExecutor";
    }

    public final synchronized void y0() {
        int i5 = debugStatus;
        if (i5 == 2 || i5 == 3) {
            debugStatus = 3;
            v0.f9227g.set(this, null);
            v0.f9228h.set(this, null);
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }
}
