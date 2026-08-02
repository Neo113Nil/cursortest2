package org.chromium.base.task;

import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public interface TaskRunner extends Executor {
    void postDelayedTask(Runnable task, long delay);
}
