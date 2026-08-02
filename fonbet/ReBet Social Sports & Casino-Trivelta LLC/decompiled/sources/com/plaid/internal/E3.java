package com.plaid.internal;

import androidx.lifecycle.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class E3 implements U.c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final H1 f39228a;

    public E3(@NotNull H1 loadingComponent) {
        Intrinsics.checkNotNullParameter(loadingComponent, "loadingComponent");
        this.f39228a = loadingComponent;
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
        if (modelClass.isAssignableFrom(D3.class)) {
            return new D3(this.f39228a);
        }
        throw new B2("Unsupported ViewModel");
    }
}
