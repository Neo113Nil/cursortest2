package io.sentry.android.replay.util;

import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.InterfaceC4760i0;
import java.util.concurrent.Future;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class e {
    public static final Future b(InterfaceC4760i0 interfaceC4760i0, final F3 options, final String taskName, final Runnable task) {
        Intrinsics.checkNotNullParameter(interfaceC4760i0, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            return interfaceC4760i0.submit(new Runnable() { // from class: io.sentry.android.replay.util.d
                @Override // java.lang.Runnable
                public final void run() {
                    e.c(task, options, taskName);
                }
            });
        } catch (Throwable th2) {
            options.getLogger().b(EnumC4788n3.ERROR, "Failed to submit task " + taskName + " to executor", th2);
            return null;
        }
    }

    public static final void c(Runnable runnable, F3 f32, String str) {
        try {
            runnable.run();
        } catch (Throwable th2) {
            f32.getLogger().b(EnumC4788n3.ERROR, "Failed to execute task " + str, th2);
        }
    }
}
