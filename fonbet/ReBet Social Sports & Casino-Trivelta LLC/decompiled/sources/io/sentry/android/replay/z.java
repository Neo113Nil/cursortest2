package io.sentry.android.replay;

import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class z {
    public static final Window a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        y yVar = y.f51876a;
        View rootView = view.getRootView();
        Intrinsics.checkNotNullExpressionValue(rootView, "getRootView(...)");
        return yVar.d(rootView);
    }
}
