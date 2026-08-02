package defpackage;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import defpackage.ljg;
import defpackage.xx3;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class xx3 implements Executor {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public Object d;

    public xx3() {
        this.a = 2;
        this.b = new AtomicInteger(1);
        this.d = new WeakReference(null);
        ThreadFactory threadFactory = new ThreadFactory() { // from class: com.google.android.gms.internal.consent_sdk.zzcx
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                xx3 xx3Var = xx3.this;
                Thread thread = new Thread(runnable, ljg.j(((AtomicInteger) xx3Var.b).getAndIncrement(), "Google consent worker #"));
                xx3Var.d = new WeakReference(thread);
                return thread;
            }
        };
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        this.c = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public void a() {
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) this.c;
        AtomicReference atomicReference = (AtomicReference) this.d;
        do {
            Thread currentThread = Thread.currentThread();
            while (!atomicReference.compareAndSet(null, currentThread)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            while (true) {
                try {
                    Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                    if (runnable == null) {
                        break;
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        ((Thread.UncaughtExceptionHandler) this.b).uncaughtException(Thread.currentThread(), th);
                    }
                } catch (Throwable th2) {
                    atomicReference.set(null);
                    throw th2;
                }
            }
            atomicReference.set(null);
        } while (!concurrentLinkedQueue.isEmpty());
    }

    public void e(Runnable runnable) {
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) this.c;
        z1a.y(runnable, "runnable is null");
        concurrentLinkedQueue.add(runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ((ExecutorService) this.b).execute(runnable);
                break;
            case 1:
                e(runnable);
                a();
                break;
            default:
                if (Thread.currentThread() != ((WeakReference) this.d).get()) {
                    ((ThreadPoolExecutor) this.c).execute(runnable);
                    break;
                } else {
                    runnable.run();
                    break;
                }
        }
    }

    public y3g f(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j, TimeUnit timeUnit) {
        jqi jqiVar = new jqi(runnable);
        return new y3g(jqiVar, scheduledExecutorService.schedule(new lv4(11, this, jqiVar, runnable), j, timeUnit));
    }

    public Task g(Runnable runnable) {
        Task continueWithTask;
        synchronized (this.c) {
            continueWithTask = ((Task) this.d).continueWithTask((ExecutorService) this.b, new l1(runnable, 18));
            this.d = continueWithTask;
        }
        return continueWithTask;
    }

    public Task h(Callable callable) {
        Task continueWithTask;
        synchronized (this.c) {
            continueWithTask = ((Task) this.d).continueWithTask((ExecutorService) this.b, new l1(callable, 17));
            this.d = continueWithTask;
        }
        return continueWithTask;
    }

    public void i() {
        z1a.D("Not called from the SynchronizationContext", Thread.currentThread() == ((AtomicReference) this.d).get());
    }

    public xx3(ExecutorService executorService) {
        this.a = 0;
        this.c = new Object();
        this.d = Tasks.forResult(null);
        this.b = executorService;
    }

    public xx3(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = 1;
        this.c = new ConcurrentLinkedQueue();
        this.d = new AtomicReference();
        this.b = uncaughtExceptionHandler;
    }
}
