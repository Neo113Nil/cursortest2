package com.plaid.internal;

import androidx.annotation.NonNull;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl;

/* loaded from: classes3.dex */
public final class E4 extends androidx.room.G {
    public E4(WorkflowDatabase_Impl workflowDatabase_Impl) {
        super(workflowDatabase_Impl);
    }

    @Override // androidx.room.G
    @NonNull
    public final String createQuery() {
        return "DELETE FROM workflow_pane";
    }
}
