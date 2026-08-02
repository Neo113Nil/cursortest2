package com.plaid.internal;

import androidx.annotation.NonNull;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl;

/* loaded from: classes3.dex */
public final class L3 extends androidx.room.G {
    public L3(WorkflowDatabase_Impl workflowDatabase_Impl) {
        super(workflowDatabase_Impl);
    }

    @Override // androidx.room.G
    @NonNull
    public final String createQuery() {
        return "DELETE FROM workflow_local_key_values WHERE pane_id=?";
    }
}
