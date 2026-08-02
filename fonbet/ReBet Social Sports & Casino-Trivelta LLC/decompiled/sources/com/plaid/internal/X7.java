package com.plaid.internal;

import androidx.lifecycle.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class X7 implements U.c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final H1 f39778a;

    public X7(@NotNull H1 webviewComponent) {
        Intrinsics.checkNotNullParameter(webviewComponent, "webviewComponent");
        this.f39778a = webviewComponent;
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
        if (modelClass.isAssignableFrom(U7.class)) {
            return new U7(this.f39778a);
        }
        throw new B2("Unsupported ViewModel");
    }
}
