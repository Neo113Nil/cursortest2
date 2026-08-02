package io.sentry.cache;

import io.sentry.E;
import io.sentry.V1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface g extends Iterable<V1> {
    @Deprecated
    void E1(@NotNull V1 v12, @NotNull E e11);

    default boolean L1(@NotNull V1 v12, @NotNull E e11) {
        E1(v12, e11);
        return true;
    }

    void M0(@NotNull V1 v12);
}
