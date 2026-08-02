package org.chromium.base.task;

import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final /* synthetic */ class b implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        PostTask.b(runnable, 1);
    }
}
