package com.plaid.internal;

import androidx.annotation.NonNull;
import androidx.room.AbstractC2268f;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl;

/* loaded from: classes3.dex */
public final class H4 implements C4 {

    /* renamed from: a, reason: collision with root package name */
    public final WorkflowDatabase_Impl f39270a;

    /* renamed from: b, reason: collision with root package name */
    public final D4 f39271b;

    public H4(@NonNull WorkflowDatabase_Impl workflowDatabase_Impl) {
        this.f39270a = workflowDatabase_Impl;
        this.f39271b = new D4(workflowDatabase_Impl);
        new E4(workflowDatabase_Impl);
    }

    @Override // com.plaid.internal.C4
    public final Object a(String str, String str2, byte[] bArr, S2 s22) {
        return AbstractC2268f.c(this.f39270a, true, new F4(this, str, str2, bArr), s22);
    }

    @Override // com.plaid.internal.C4
    public final Object a(String str, String str2, C3722q0 c3722q0) {
        androidx.room.A r10 = androidx.room.A.r("SELECT * FROM workflow_pane WHERE workflow_id=? AND id=?", 2);
        r10.P0(1, str);
        r10.P0(2, str2);
        return AbstractC2268f.b(this.f39270a, false, A2.b.a(), new G4(this, r10), c3722q0);
    }
}
