package org.chromium.base.task;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.base.task.TaskRunnerImpl;

/* loaded from: classes10.dex */
class TaskRunnerImplJni implements TaskRunnerImpl.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    TaskRunnerImplJni() {
    }

    public static TaskRunnerImpl.Natives get() {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && jniTestInstanceHolder.value != null) {
            return (TaskRunnerImpl.Natives) jniTestInstanceHolder.value;
        }
        return new TaskRunnerImplJni();
    }

    public static void setInstanceForTesting(TaskRunnerImpl.Natives impl) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = impl;
    }

    @Override // org.chromium.base.task.TaskRunnerImpl.Natives
    public void destroy(long nativeTaskRunnerAndroid) {
        GEN_JNI.org_chromium_base_task_TaskRunnerImpl_destroy(nativeTaskRunnerAndroid);
    }

    @Override // org.chromium.base.task.TaskRunnerImpl.Natives
    public long init(int taskRunnerType, int taskTraits) {
        return GEN_JNI.org_chromium_base_task_TaskRunnerImpl_init(taskRunnerType, taskTraits);
    }

    @Override // org.chromium.base.task.TaskRunnerImpl.Natives
    public void postDelayedTask(long nativeTaskRunnerAndroid, long delay, int taskIndex) {
        GEN_JNI.org_chromium_base_task_TaskRunnerImpl_postDelayedTask(nativeTaskRunnerAndroid, delay, taskIndex);
    }
}
