package ru.ozon.app.android.travel.utils.lifecycle;

import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/w0;", "T", "Lkotlin/Function0;", "create", "Landroidx/lifecycle/z0$b;", "genericViewModelFactory", "(Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/z0$b;", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LifecycleUtilsKt {
    @NotNull
    public static final <T extends w0> z0.b genericViewModelFactory(@NotNull Function0<? extends T> create) {
        Intrinsics.checkNotNullParameter(create, "create");
        return new GenericViewModelFactory(create);
    }
}
