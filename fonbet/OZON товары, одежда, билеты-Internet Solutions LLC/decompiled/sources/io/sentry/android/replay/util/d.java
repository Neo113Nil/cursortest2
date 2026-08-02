package io.sentry.android.replay.util;

import E.V;
import io.sentry.I2;
import io.sentry.W2;
import io.sentry.Z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class d {
    public static final void a(@NotNull Z z11, @NotNull W2 options, @NotNull V task) {
        Intrinsics.checkNotNullParameter(z11, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter("ReplayIntegration.finalize_previous_replay", "taskName");
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            z11.submit(new M2.c(4, task, options));
        } catch (Throwable th2) {
            options.getLogger().a(I2.ERROR, "Failed to submit task ReplayIntegration.finalize_previous_replay to executor", th2);
        }
    }
}
