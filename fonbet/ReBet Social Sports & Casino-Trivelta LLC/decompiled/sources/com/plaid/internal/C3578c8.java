package com.plaid.internal;

import androidx.annotation.NonNull;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl;

/* renamed from: com.plaid.internal.c8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3578c8 extends androidx.room.G {
    public C3578c8(WorkflowDatabase_Impl workflowDatabase_Impl) {
        super(workflowDatabase_Impl);
    }

    @Override // androidx.room.G
    @NonNull
    public final String createQuery() {
        return "DELETE FROM workflow_analytics WHERE workflow_id=?";
    }
}
