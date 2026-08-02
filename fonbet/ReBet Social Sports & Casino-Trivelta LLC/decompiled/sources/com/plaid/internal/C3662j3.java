package com.plaid.internal;

import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.j3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3662j3 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<WorkflowDatabase> f40703a;

    public C3662j3(C3608d3 c3608d3, Provider<WorkflowDatabase> provider) {
        this.f40703a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        WorkflowDatabase database = this.f40703a.get();
        Intrinsics.checkNotNullParameter(database, "database");
        return (L4) Gg.d.d(new C3730r0(database));
    }
}
