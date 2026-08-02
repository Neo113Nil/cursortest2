package lm0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.metrics.internal.presentation.SendMetricsEventJobService;

/* loaded from: classes8.dex */
public final class d {
    @NotNull
    public static final AbstractC7971a a(@NotNull AbstractC7971a abstractC7971a, @NotNull SendMetricsEventJobService.c block) {
        Intrinsics.checkNotNullParameter(abstractC7971a, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return new c(abstractC7971a, block);
    }
}
