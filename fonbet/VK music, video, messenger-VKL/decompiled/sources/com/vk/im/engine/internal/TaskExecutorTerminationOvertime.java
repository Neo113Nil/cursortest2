package com.vk.im.engine.internal;

import com.vk.metrics.trackers.CriticalException;

/* compiled from: TaskExecutor.kt */
/* loaded from: classes2.dex */
public final class TaskExecutorTerminationOvertime extends CriticalException {
    public TaskExecutorTerminationOvertime(String str) {
        super(str, null);
    }

    public TaskExecutorTerminationOvertime(String str, IllegalStateException illegalStateException) {
        super(str, illegalStateException);
    }
}
