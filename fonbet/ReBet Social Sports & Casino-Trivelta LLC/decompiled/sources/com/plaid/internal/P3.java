package com.plaid.internal;

import androidx.annotation.NonNull;
import androidx.room.AbstractC2268f;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class P3 implements I3 {

    /* renamed from: a, reason: collision with root package name */
    public final WorkflowDatabase_Impl f39506a;

    /* renamed from: b, reason: collision with root package name */
    public final J3 f39507b;

    /* renamed from: c, reason: collision with root package name */
    public final L3 f39508c;

    public P3(@NonNull WorkflowDatabase_Impl workflowDatabase_Impl) {
        this.f39506a = workflowDatabase_Impl;
        this.f39507b = new J3(workflowDatabase_Impl);
        new K3(workflowDatabase_Impl);
        this.f39508c = new L3(workflowDatabase_Impl);
    }

    @Override // com.plaid.internal.I3
    public final Object a(String str, String str2, String str3, R3 r32) {
        return AbstractC2268f.c(this.f39506a, true, new M3(this, str, str2, str3), r32);
    }

    @Override // com.plaid.internal.I3
    public final Object a(String str, ContinuationImpl continuationImpl) {
        return AbstractC2268f.c(this.f39506a, true, new N3(this, str), continuationImpl);
    }

    @Override // com.plaid.internal.I3
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        androidx.room.A r10 = androidx.room.A.r("SELECT string FROM workflow_local_key_values WHERE pane_id=? AND `key`=?", 2);
        r10.P0(1, str);
        r10.P0(2, str2);
        return AbstractC2268f.b(this.f39506a, false, A2.b.a(), new O3(this, r10), continuationImpl);
    }
}
