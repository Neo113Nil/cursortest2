package androidx.work.impl;

import java.util.concurrent.CancellationException;

/* compiled from: WorkerWrapper.kt */
/* loaded from: classes.dex */
public final class WorkerStoppedException extends CancellationException {
    private final int reason;

    public WorkerStoppedException(int i) {
        this.reason = i;
    }

    public final int d() {
        return this.reason;
    }
}
