package com.plaid.internal;

import androidx.annotation.NonNull;
import androidx.room.AbstractC2272j;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl;

/* renamed from: com.plaid.internal.a8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3558a8 extends AbstractC2272j {
    public C3558a8(WorkflowDatabase_Impl workflowDatabase_Impl) {
        super(workflowDatabase_Impl);
    }

    @Override // androidx.room.AbstractC2272j
    public final void bind(@NonNull E2.k kVar, @NonNull Object obj) {
        h8 h8Var = (h8) obj;
        kVar.P0(1, h8Var.f40662a);
        kVar.P0(2, h8Var.f40663b);
    }

    @Override // androidx.room.G
    @NonNull
    public final String createQuery() {
        return "DELETE FROM `workflow_analytics` WHERE `workflow_id` = ? AND `id` = ?";
    }
}
