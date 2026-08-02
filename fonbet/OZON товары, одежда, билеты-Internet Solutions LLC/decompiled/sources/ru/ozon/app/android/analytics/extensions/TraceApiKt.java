package ru.ozon.app.android.analytics.extensions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"beginDebugTrace", "", "methodName", "", "cookie", "", "endDebugTrace", "analytics_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TraceApiKt {
    public static final void beginDebugTrace(@NotNull String methodName, int i11) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
    }

    public static final void endDebugTrace(@NotNull String methodName, int i11) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
    }
}
