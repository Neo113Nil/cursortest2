package io.sentry.util;

import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class f {
    @NotNull
    public static Throwable a(@NotNull Throwable th2) {
        p.b(th2, "throwable cannot be null");
        while (th2.getCause() != null && th2.getCause() != th2) {
            th2 = th2.getCause();
        }
        return th2;
    }

    public static boolean b(@NotNull Set<Class<? extends Throwable>> set, @NotNull Throwable th2) {
        return set.contains(th2.getClass());
    }
}
