package ru.ozon.app.android.utils;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0004"}, d2 = {"enableFocusable", "", "Landroid/view/View;", "disableFocusable", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ViewUtilsKt {
    public static final void disableFocusable(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setFocusable(false);
        view.setFocusableInTouchMode(false);
    }

    public static final void enableFocusable(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
    }
}
