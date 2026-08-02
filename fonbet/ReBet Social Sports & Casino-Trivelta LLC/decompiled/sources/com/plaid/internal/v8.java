package com.plaid.internal;

import androidx.lifecycle.U;
import com.plaid.internal.p8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class v8 implements U.c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final p8.a f41153a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final H1 f41154b;

    public v8(@NotNull p8.a createFunction, @NotNull H1 paneHostComponent) {
        Intrinsics.checkNotNullParameter(createFunction, "createFunction");
        Intrinsics.checkNotNullParameter(paneHostComponent, "paneHostComponent");
        this.f41153a = createFunction;
        this.f41154b = paneHostComponent;
    }

    @Override // androidx.lifecycle.U.c
    @NotNull
    public /* bridge */ /* synthetic */ androidx.lifecycle.Q create(@NotNull Class cls, @NotNull X0.a aVar) {
        return super.create(cls, aVar);
    }

    @Override // androidx.lifecycle.U.c
    @NotNull
    public /* bridge */ /* synthetic */ androidx.lifecycle.Q create(@NotNull KClass kClass, @NotNull X0.a aVar) {
        return super.create(kClass, aVar);
    }

    @Override // androidx.lifecycle.U.c
    @NotNull
    public final <T extends androidx.lifecycle.Q> T create(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Object invoke = this.f41153a.invoke(this.f41154b);
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type T of com.plaid.internal.workflow.panes.WorkflowViewModelFactory.create");
        return (T) invoke;
    }
}
