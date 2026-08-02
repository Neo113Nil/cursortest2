package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.Nullable;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class yo4 extends l26 implements Runnable {

    @Nullable
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final yo4 k;
    public static final long l;

    static {
        Long l2;
        yo4 yo4Var = new yo4();
        k = yo4Var;
        yo4Var.n0(false);
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        l = TimeUnit.MILLISECONDS.toNanos(l2.longValue());
    }

    @Override // defpackage.l26
    public final void B0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.B0(runnable);
    }

    @Override // defpackage.l26
    public final Thread I0() {
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
                thread.setContextClassLoader(k.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // defpackage.l26
    public final void Q0(long j, j26 j26Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void Y0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            Unsafe unsafe = rh0.a;
            unsafe.putObjectVolatile(this, l26.i, (Object) null);
            unsafe.putObjectVolatile(this, l26.g, (Object) null);
            notifyAll();
        }
    }

    @Override // defpackage.iv4
    public final q55 g(long j, Runnable runnable, CoroutineContext coroutineContext) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return ged.a;
        }
        long nanoTime = System.nanoTime();
        i26 i26Var = new i26(j2 + nanoTime, runnable);
        X0(nanoTime, i26Var);
        return i26Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean P0;
        cgj.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (P0) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long r0 = r0();
                    if (r0 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = l + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            Y0();
                            if (P0()) {
                                return;
                            }
                            I0();
                            return;
                        }
                        if (r0 > j2) {
                            r0 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (r0 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            Y0();
                            if (P0()) {
                                return;
                            }
                            I0();
                            return;
                        }
                        LockSupport.parkNanos(this, r0);
                    }
                }
            }
        } finally {
            _thread = null;
            Y0();
            if (!P0()) {
                I0();
            }
        }
    }

    @Override // defpackage.l26, defpackage.g26
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.au3
    public final String toString() {
        return "DefaultExecutor";
    }
}
