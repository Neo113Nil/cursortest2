package ru.ozon.app.android.travel.utils.lifecycle;

import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\n\u001a\u00028\u0001\"\b\b\u0001\u0010\u0002*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/utils/lifecycle/GenericViewModelFactory;", "Landroidx/lifecycle/w0;", "T", "Landroidx/lifecycle/z0$b;", "Lkotlin/Function0;", "createViewModel", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/w0;", "Lkotlin/jvm/functions/Function0;", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GenericViewModelFactory<T extends w0> implements z0.b {

    @NotNull
    private final Function0<T> createViewModel;

    /* JADX WARN: Multi-variable type inference failed */
    public GenericViewModelFactory(@NotNull Function0<? extends T> createViewModel) {
        Intrinsics.checkNotNullParameter(createViewModel, "createViewModel");
        this.createViewModel = createViewModel;
    }

    @Override // androidx.lifecycle.z0.b
    @NotNull
    public <T extends w0> T create(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        T invoke = this.createViewModel.invoke();
        Intrinsics.g(invoke, "null cannot be cast to non-null type T of ru.ozon.app.android.travel.utils.lifecycle.GenericViewModelFactory.create");
        return invoke;
    }
}
