package io.sentry.android.replay.util;

import io.sentry.util.s;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class j {
    public static final boolean a(@NotNull s sVar, Double d11) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        return d11 != null && d11.doubleValue() >= sVar.d();
    }
}
