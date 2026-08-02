package com.plaid.internal;

import androidx.annotation.NonNull;
import androidx.room.AbstractC2268f;
import com.plaid.internal.C3778w3;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class g8 implements Y7 {

    /* renamed from: a, reason: collision with root package name */
    public final WorkflowDatabase_Impl f40632a;

    /* renamed from: b, reason: collision with root package name */
    public final C3558a8 f40633b;

    /* renamed from: c, reason: collision with root package name */
    public final C3568b8 f40634c;

    public g8(@NonNull WorkflowDatabase_Impl workflowDatabase_Impl) {
        this.f40632a = workflowDatabase_Impl;
        this.f40633b = new C3558a8(workflowDatabase_Impl);
        this.f40634c = new C3568b8(workflowDatabase_Impl);
        new C3578c8(workflowDatabase_Impl);
        new d8(workflowDatabase_Impl);
    }

    @Override // com.plaid.internal.Y7
    public final Object a(ArrayList arrayList, C3760u3 c3760u3) {
        return AbstractC2268f.c(this.f40632a, true, new e8(this, arrayList), c3760u3);
    }

    @Override // com.plaid.internal.Y7
    public final Object a(String str, String str2, byte[] bArr, C3778w3.a aVar) {
        return AbstractC2268f.c(this.f40632a, true, new f8(this, str, str2, bArr), aVar);
    }

    @Override // com.plaid.internal.Y7
    public final Object a(C3796y3 c3796y3) {
        androidx.room.A r10 = androidx.room.A.r("SELECT * FROM workflow_analytics", 0);
        return AbstractC2268f.b(this.f40632a, false, A2.b.a(), new Z7(this, r10), c3796y3);
    }
}
