package com.plaid.internal;

import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.h3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3644h3 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<WorkflowDatabase> f40648a;

    public C3644h3(C3608d3 c3608d3, Provider<WorkflowDatabase> provider) {
        this.f40648a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        WorkflowDatabase database = this.f40648a.get();
        Intrinsics.checkNotNullParameter(database, "database");
        return (T3) Gg.d.d(new S3(database));
    }
}
