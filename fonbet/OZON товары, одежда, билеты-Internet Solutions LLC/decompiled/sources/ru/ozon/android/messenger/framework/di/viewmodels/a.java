package ru.ozon.android.messenger.framework.di.viewmodels;

import U7.m;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a implements z0.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<Class<? extends w0>, Pc.a<w0>> f88776a;

    public a(@NotNull Map<Class<? extends w0>, Pc.a<w0>> viewModels) {
        Intrinsics.checkNotNullParameter(viewModels, "viewModels");
        this.f88776a = viewModels;
    }

    @Override // androidx.lifecycle.z0.b
    @NotNull
    public final <T extends w0> T create(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Pc.a<w0> aVar = this.f88776a.get(modelClass);
        if (aVar == null) {
            throw new IllegalArgumentException(m.a(modelClass, "Unknown model class "));
        }
        w0 w0Var = aVar.get();
        Intrinsics.g(w0Var, "null cannot be cast to non-null type T of ru.ozon.android.messenger.framework.di.viewmodels.MapViewModelsFactory.create");
        return (T) w0Var;
    }
}
