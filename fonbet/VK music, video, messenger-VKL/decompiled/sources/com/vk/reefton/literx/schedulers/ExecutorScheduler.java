package com.vk.reefton.literx.schedulers;

import java.lang.Thread;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.b8h0;
import xsna.ign;
import xsna.jfv0;
import xsna.rdi;
import xsna.s3q0;
import xsna.z1v;

/* compiled from: ExecutorScheduler.kt */
/* loaded from: classes5.dex */
public final class ExecutorScheduler extends b8h0 {
    public final Executor a;
    public final AtomicInteger b = new AtomicInteger();
    public final ConcurrentLinkedDeque<Runnable> c = new ConcurrentLinkedDeque<>();
    public final a d = new a();

    /* compiled from: ExecutorScheduler.kt */
    public final class DelayedJob extends Job {
        public DelayedJob(Runnable runnable) {
            super(runnable);
        }

        @Override // com.vk.reefton.literx.schedulers.ExecutorScheduler.Job, java.lang.Runnable
        public final void run() {
            if (get()) {
                return;
            }
            ExecutorScheduler.this.b(d());
        }
    }

    /* compiled from: ExecutorScheduler.kt */
    public class Job extends AtomicBoolean implements Runnable, ign {
        private final Runnable originalRunnable;

        public Job(Runnable runnable) {
            this.originalRunnable = runnable;
        }

        public final Runnable d() {
            return this.originalRunnable;
        }

        @Override // xsna.ign
        public final void dispose() {
            set(true);
        }

        @Override // xsna.ign
        public final boolean h() {
            return get();
        }

        public void run() {
            if (get()) {
                return;
            }
            this.originalRunnable.run();
        }
    }

    /* compiled from: ExecutorScheduler.kt */
    public final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ExecutorScheduler executorScheduler;
            do {
                executorScheduler = ExecutorScheduler.this;
                Runnable poll = executorScheduler.c.poll();
                if (poll == null) {
                    return;
                } else {
                    poll.run();
                }
            } while (executorScheduler.b.decrementAndGet() != 0);
        }
    }

    public ExecutorScheduler(Executor executor) {
        this.a = executor;
    }

    @Override // xsna.b8h0
    public final DelayedJob a(Runnable runnable, long j, TimeUnit timeUnit) {
        DelayedJob delayedJob = new DelayedJob(runnable);
        try {
            Executor executor = this.a;
            if (executor instanceof ScheduledExecutorService) {
                ((ScheduledExecutorService) executor).schedule(delayedJob, j, timeUnit);
                return delayedJob;
            }
            rdi rdiVar = rdi.g;
            if (rdi.h == null) {
                synchronized (rdiVar) {
                    try {
                        if (rdi.h == null) {
                            rdi.h = Executors.newSingleThreadScheduledExecutor();
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } finally {
                    }
                }
            }
            rdi.h.schedule(delayedJob, j, timeUnit);
            return delayedJob;
        } catch (RejectedExecutionException e) {
            jfv0.b bVar = z1v.a;
            if (bVar != null) {
                bVar.invoke(e);
            } else {
                e.printStackTrace();
                Thread currentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(currentThread, e);
                }
            }
            return delayedJob;
        }
    }

    @Override // xsna.b8h0
    public final Job b(Runnable runnable) {
        Job job = new Job(runnable);
        this.c.offer(job);
        if (this.b.getAndIncrement() == 0) {
            try {
                this.a.execute(this.d);
                return job;
            } catch (RejectedExecutionException e) {
                jfv0.b bVar = z1v.a;
                if (bVar != null) {
                    bVar.invoke(e);
                } else {
                    e.printStackTrace();
                    Thread currentThread = Thread.currentThread();
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(currentThread, e);
                    }
                }
            }
        }
        return job;
    }
}
