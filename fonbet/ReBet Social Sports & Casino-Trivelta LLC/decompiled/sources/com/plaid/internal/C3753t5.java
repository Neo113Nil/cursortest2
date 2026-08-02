package com.plaid.internal;

import android.app.Application;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.t5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3753t5 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.b f41096a;

    public C3753t5(C3727q5 c3727q5, Gg.b bVar) {
        this.f41096a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f41096a.get();
        Intrinsics.checkNotNullParameter(application, "application");
        return (WorkflowDatabase) Gg.d.d((WorkflowDatabase) androidx.room.v.a(application, WorkflowDatabase.class, "plaid_workflow_database").e().d());
    }
}
