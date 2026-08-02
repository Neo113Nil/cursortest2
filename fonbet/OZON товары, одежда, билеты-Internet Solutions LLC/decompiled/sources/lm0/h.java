package lm0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class h {
    @NotNull
    public static final <T, R> AbstractC7971a<R> a(@NotNull AbstractC7971a<T> abstractC7971a, @NotNull Function1<? super T, ? extends AbstractC7971a<R>> mapper) {
        Intrinsics.checkNotNullParameter(abstractC7971a, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return new g(abstractC7971a, mapper);
    }
}
