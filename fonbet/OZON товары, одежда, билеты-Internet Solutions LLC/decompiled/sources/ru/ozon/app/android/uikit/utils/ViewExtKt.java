package ru.ozon.app.android.uikit.utils;

import android.view.View;
import android.view.ViewGroup;
import jk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroid/view/View;", "Ljk0/q;", "info", "", "expandToNonOverlapArea", "(Landroid/view/View;Ljk0/q;)V", "", "newHeight", "expandHeightToNonOverlapArea", "(Landroid/view/View;I)V", "ui-kit_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ViewExtKt {
    public static final void expandHeightToNonOverlapArea(@NotNull View view, int i11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.getHeight() == i11 || i11 <= 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i11;
        view.setLayoutParams(layoutParams);
    }

    public static final void expandToNonOverlapArea(@NotNull View view, @NotNull q info) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(info, "info");
        expandHeightToNonOverlapArea(view, info.a().e().height());
    }
}
