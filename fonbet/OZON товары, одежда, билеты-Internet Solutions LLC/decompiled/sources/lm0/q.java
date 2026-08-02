package lm0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class q {
    @NotNull
    public static final <T> jm0.i a(@NotNull AbstractC7971a<T> abstractC7971a, @NotNull Function1<? super Throwable, Unit> onError, @NotNull Function1<? super T, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(abstractC7971a, "<this>");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        r rVar = new r(onError, onSuccess);
        abstractC7971a.a(rVar);
        return rVar;
    }
}
