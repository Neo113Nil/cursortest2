package org.chromium.base.task;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
class SerialExecutor implements Executor {
    Runnable mActive;
    final ArrayDeque<Runnable> mTasks = new ArrayDeque<>();

    SerialExecutor() {
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(final Runnable r) {
        this.mTasks.offer(new Runnable() { // from class: org.chromium.base.task.SerialExecutor$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                SerialExecutor.this.lambda$execute$0(r);
            }
        });
        if (this.mActive == null) {
            scheduleNext();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$0(Runnable runnable) {
        try {
            runnable.run();
        } finally {
            scheduleNext();
        }
    }

    protected synchronized void scheduleNext() {
        Runnable poll = this.mTasks.poll();
        this.mActive = poll;
        if (poll != null) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(this.mActive);
        }
    }
}
