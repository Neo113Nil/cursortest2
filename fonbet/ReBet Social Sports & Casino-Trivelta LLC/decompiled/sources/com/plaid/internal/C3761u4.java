package com.plaid.internal;

import androidx.lifecycle.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.plaid.internal.u4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3761u4 implements U.c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final H1 f41118a;

    public C3761u4(@NotNull H1 outOfProcessComponent) {
        Intrinsics.checkNotNullParameter(outOfProcessComponent, "outOfProcessComponent");
        this.f41118a = outOfProcessComponent;
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
        if (modelClass.isAssignableFrom(C3806z4.class)) {
            return new C3806z4(this.f41118a);
        }
        throw new B2("Unsupported ViewModel");
    }
}
