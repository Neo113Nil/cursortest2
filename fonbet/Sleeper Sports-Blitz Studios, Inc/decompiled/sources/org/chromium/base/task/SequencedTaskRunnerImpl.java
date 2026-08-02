package org.chromium.base.task;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public class SequencedTaskRunnerImpl extends TaskRunnerImpl implements SequencedTaskRunner {
    private final AtomicInteger mPendingTasks;
    private volatile boolean mReadyToCreateNativeTaskRunner;

    SequencedTaskRunnerImpl(int traits) {
        super(traits, "SequencedTaskRunnerImpl", 1);
        this.mPendingTasks = new AtomicInteger();
    }

    @Override // org.chromium.base.task.TaskRunnerImpl
    protected void schedulePreNativeTask() {
        if (this.mPendingTasks.getAndIncrement() == 0) {
            super.schedulePreNativeTask();
        }
    }

    @Override // org.chromium.base.task.TaskRunnerImpl
    protected void runPreNativeTask() {
        super.runPreNativeTask();
        if (this.mPendingTasks.decrementAndGet() > 0) {
            if (!this.mReadyToCreateNativeTaskRunner) {
                super.schedulePreNativeTask();
            } else {
                super.initNativeTaskRunner();
            }
        }
    }

    @Override // org.chromium.base.task.TaskRunnerImpl
    void initNativeTaskRunner() {
        this.mReadyToCreateNativeTaskRunner = true;
        if (this.mPendingTasks.getAndIncrement() == 0) {
            super.initNativeTaskRunner();
        }
    }
}
