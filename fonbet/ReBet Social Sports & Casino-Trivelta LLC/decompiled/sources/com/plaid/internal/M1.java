package com.plaid.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class M1 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final C3733r3 f39369a;

    public M1(I1 i12, C3733r3 c3733r3) {
        this.f39369a = c3733r3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i8 workflowApi = (i8) this.f39369a.get();
        Intrinsics.checkNotNullParameter(workflowApi, "workflowApi");
        return (F) Gg.d.d(new F(workflowApi));
    }
}
