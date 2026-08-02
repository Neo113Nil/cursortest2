package lm0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class p {
    @NotNull
    public static final <T> AbstractC7971a<T> a(@NotNull AbstractC7971a<T> abstractC7971a, @NotNull Function1<? super Throwable, ? extends T> mapper) {
        Intrinsics.checkNotNullParameter(abstractC7971a, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return new o(abstractC7971a, mapper);
    }
}
