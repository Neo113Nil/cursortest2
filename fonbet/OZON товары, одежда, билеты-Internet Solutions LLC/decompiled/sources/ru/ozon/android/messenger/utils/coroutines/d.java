package ru.ozon.android.messenger.utils.coroutines;

import Ae.x0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class d {
    public static final <T> void a(@NotNull x0<T> x0Var, @NotNull Function1<? super T, ? extends T> block) {
        Intrinsics.checkNotNullParameter(x0Var, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        x0Var.setValue(block.invoke(x0Var.getValue()));
    }
}
