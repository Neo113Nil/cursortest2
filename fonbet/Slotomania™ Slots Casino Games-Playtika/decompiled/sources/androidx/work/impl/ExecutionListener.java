package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;

/* loaded from: classes8.dex */
public interface ExecutionListener {
    void onExecuted(WorkGenerationalId id, boolean needsReschedule);
}
