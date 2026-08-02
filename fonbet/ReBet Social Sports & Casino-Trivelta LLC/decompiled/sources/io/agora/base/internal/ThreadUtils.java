package io.agora.base.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class ThreadUtils {

    /* renamed from: io.agora.base.internal.ThreadUtils$1CaughtException, reason: invalid class name */
    public class C1CaughtException {

        /* renamed from: e, reason: collision with root package name */
        Exception f49156e;
    }

    /* renamed from: io.agora.base.internal.ThreadUtils$1Result, reason: invalid class name */
    public class C1Result {
        public V value;
    }

    public interface BlockingOperation {
        void run();
    }

    public static void awaitUninterruptibly(final CountDownLatch countDownLatch) {
        executeUninterruptibly(new BlockingOperation() { // from class: io.agora.base.internal.ThreadUtils.2
            @Override // io.agora.base.internal.ThreadUtils.BlockingOperation
            public void run() {
                countDownLatch.await();
            }
        });
    }

    public static void checkIsOnMainThread() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new IllegalStateException("Not on main thread!");
        }
    }

    public static StackTraceElement[] concatStackTraces(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[stackTraceElementArr.length + stackTraceElementArr2.length];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr3, 0, stackTraceElementArr.length);
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, stackTraceElementArr.length, stackTraceElementArr2.length);
        return stackTraceElementArr3;
    }

    public static void executeUninterruptibly(BlockingOperation blockingOperation) {
        boolean z10 = false;
        while (true) {
            try {
                blockingOperation.run();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public static <V> V invokeAtFrontUninterruptibly(Handler handler, Callable<V> callable) {
        return (V) invokeAtFrontUninterruptibly(handler, 0L, callable);
    }

    public static boolean joinUninterruptibly(Thread thread, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = false;
        long j11 = j10;
        while (j11 > 0) {
            try {
                thread.join(j11);
                break;
            } catch (InterruptedException unused) {
                j11 = j10 - (SystemClock.elapsedRealtime() - elapsedRealtime);
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return !thread.isAlive();
    }

    public static class ThreadChecker {
        private Thread thread;

        public ThreadChecker() {
            this.thread = Thread.currentThread();
        }

        public void checkIsOnValidThread() {
            if (this.thread == null) {
                this.thread = Thread.currentThread();
            }
            if (Thread.currentThread() != this.thread) {
                throw new IllegalStateException("Wrong thread");
            }
        }

        public void detachThread() {
            this.thread = null;
        }

        public ThreadChecker(Thread thread) {
            Thread.currentThread();
            this.thread = thread;
        }
    }

    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = false;
        long j11 = j10;
        boolean z11 = false;
        while (true) {
            try {
                z10 = countDownLatch.await(j11, TimeUnit.MILLISECONDS);
                break;
            } catch (InterruptedException unused) {
                j11 = j10 - (SystemClock.elapsedRealtime() - elapsedRealtime);
                if (j11 <= 0) {
                    z11 = true;
                    break;
                }
                z11 = true;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        return z10;
    }

    public static <V> V invokeAtFrontUninterruptibly(Handler handler, long j10, final Callable<V> callable) {
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            try {
                return callable.call();
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
        final C1Result c1Result = new C1Result();
        final C1CaughtException c1CaughtException = new C1CaughtException();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        if (!handler.post(new Runnable() { // from class: io.agora.base.internal.ThreadUtils.3
            /* JADX WARN: Type inference failed for: r1v2, types: [V, java.lang.Object] */
            @Override // java.lang.Runnable
            public void run() {
                try {
                    C1Result.this.value = callable.call();
                } catch (Exception e11) {
                    c1CaughtException.f49156e = e11;
                }
                countDownLatch.countDown();
            }
        })) {
            c1CaughtException.f49156e = new Exception("handler post fail at invokeAtFrontUninterruptibly !");
        } else if (j10 <= 0) {
            awaitUninterruptibly(countDownLatch);
        } else {
            awaitUninterruptibly(countDownLatch, j10);
        }
        if (c1CaughtException.f49156e == null) {
            return c1Result.value;
        }
        RuntimeException runtimeException = new RuntimeException(c1CaughtException.f49156e);
        runtimeException.setStackTrace(concatStackTraces(c1CaughtException.f49156e.getStackTrace(), runtimeException.getStackTrace()));
        throw runtimeException;
    }

    public static class ConditionVariable {
        private final Object lock;
        private volatile boolean mCondition;

        public ConditionVariable() {
            this.lock = new Object();
            this.mCondition = false;
        }

        public void block() {
            synchronized (this.lock) {
                while (!this.mCondition) {
                    try {
                        this.lock.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void close() {
            synchronized (this.lock) {
                this.mCondition = false;
            }
        }

        public void open() {
            synchronized (this.lock) {
                try {
                    boolean z10 = this.mCondition;
                    this.mCondition = true;
                    if (!z10) {
                        this.lock.notifyAll();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public boolean opened() {
            return this.mCondition;
        }

        public ConditionVariable(boolean z10) {
            this.lock = new Object();
            this.mCondition = z10;
        }

        public boolean block(long j10) {
            boolean z10;
            if (j10 != 0) {
                synchronized (this.lock) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j11 = j10 + elapsedRealtime;
                    while (!this.mCondition && elapsedRealtime < j11) {
                        try {
                            this.lock.wait(j11 - elapsedRealtime);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                        elapsedRealtime = SystemClock.elapsedRealtime();
                    }
                    z10 = this.mCondition;
                }
                return z10;
            }
            block();
            return true;
        }
    }

    public static void joinUninterruptibly(final Thread thread) {
        executeUninterruptibly(new BlockingOperation() { // from class: io.agora.base.internal.ThreadUtils.1
            @Override // io.agora.base.internal.ThreadUtils.BlockingOperation
            public void run() {
                thread.join();
            }
        });
    }

    public static void invokeAtFrontUninterruptibly(Handler handler, final Runnable runnable) {
        invokeAtFrontUninterruptibly(handler, new Callable<Void>() { // from class: io.agora.base.internal.ThreadUtils.4
            @Override // java.util.concurrent.Callable
            public Void call() {
                runnable.run();
                return null;
            }
        });
    }
}
