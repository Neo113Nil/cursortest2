package org.chromium.base.task;

import internal.org.jni_zero.JNINamespace;
import org.chromium.base.ThreadUtils;

@JNINamespace("base")
/* loaded from: classes10.dex */
public class UiThreadTaskRunnerImpl extends TaskRunnerImpl implements SequencedTaskRunner {
    public UiThreadTaskRunnerImpl(int traits) {
        super(traits, "UiThreadTaskRunner", 2);
    }

    @Override // org.chromium.base.task.TaskRunnerImpl
    protected void schedulePreNativeTask() {
        if (PostTask.canRunUiTaskBeforeNativeInit(this.mTaskTraits)) {
            ThreadUtils.getUiThreadHandler().post(this.mRunPreNativeTaskClosure);
        }
    }

    @Override // org.chromium.base.task.TaskRunnerImpl
    protected boolean schedulePreNativeDelayedTask(Runnable task, long delay) {
        if (!PostTask.canRunUiTaskBeforeNativeInit(this.mTaskTraits)) {
            return false;
        }
        ThreadUtils.getUiThreadHandler().postDelayed(task, delay);
        return true;
    }
}
