package com.vk.im.engine.internal;

import com.vk.metrics.trackers.CriticalException;

/* compiled from: TaskExecutor.kt */
/* loaded from: classes2.dex */
public final class TaskExecutorTerminationInterrupted extends CriticalException {
    public TaskExecutorTerminationInterrupted(String str) {
        super(str, null);
    }

    public TaskExecutorTerminationInterrupted(String str, Throwable th) {
        super(str, th);
    }
}
