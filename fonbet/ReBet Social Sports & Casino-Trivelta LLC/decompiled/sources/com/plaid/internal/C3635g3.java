package com.plaid.internal;

import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.g3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3635g3 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<WorkflowDatabase> f40624a;

    public C3635g3(C3608d3 c3608d3, Provider<WorkflowDatabase> provider) {
        this.f40624a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        WorkflowDatabase database = this.f40624a.get();
        Intrinsics.checkNotNullParameter(database, "database");
        return (A3) Gg.d.d(new C3805z3(database));
    }
}
