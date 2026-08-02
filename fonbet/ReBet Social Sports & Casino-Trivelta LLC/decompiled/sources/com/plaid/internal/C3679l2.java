package com.plaid.internal;

import androidx.lifecycle.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.plaid.internal.l2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3679l2 implements U.c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC3553a3 f40754a;

    public C3679l2(@NotNull InterfaceC3553a3 tokenComponent) {
        Intrinsics.checkNotNullParameter(tokenComponent, "tokenComponent");
        this.f40754a = tokenComponent;
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
        return new C3661j2(this.f40754a);
    }
}
