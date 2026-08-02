package com.plaid.internal;

import androidx.annotation.NonNull;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl;

/* renamed from: com.plaid.internal.b8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3568b8 extends androidx.room.G {
    public C3568b8(WorkflowDatabase_Impl workflowDatabase_Impl) {
        super(workflowDatabase_Impl);
    }

    @Override // androidx.room.G
    @NonNull
    public final String createQuery() {
        return "REPLACE INTO workflow_analytics (workflow_id, id, analytics_model) VALUES (?, ?, ?)";
    }
}
