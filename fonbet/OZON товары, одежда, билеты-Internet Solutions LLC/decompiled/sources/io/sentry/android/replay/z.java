package io.sentry.android.replay;

import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class z {
    public static final Window a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        int i11 = y.f67755c;
        View rootView = view.getRootView();
        Intrinsics.checkNotNullExpressionValue(rootView, "getRootView(...)");
        return y.b(rootView);
    }
}
