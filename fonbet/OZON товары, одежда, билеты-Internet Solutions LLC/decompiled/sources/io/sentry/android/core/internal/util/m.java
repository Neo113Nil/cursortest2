package io.sentry.android.core.internal.util;

import android.content.Context;
import android.os.Process;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class m {
    public static boolean a(@NotNull Context context) {
        io.sentry.util.p.b(context, "The application context is required.");
        return context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0;
    }
}
