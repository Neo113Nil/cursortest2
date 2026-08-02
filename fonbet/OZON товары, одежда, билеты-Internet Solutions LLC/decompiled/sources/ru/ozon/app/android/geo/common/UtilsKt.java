package ru.ozon.app.android.geo.common;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¨\u0006\u0005"}, d2 = {"getRelativeTopPositionViewInRoot", "", "parent", "Landroid/view/View;", "view", "geo_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UtilsKt {
    public static final int getRelativeTopPositionViewInRoot(@NotNull View parent, @NotNull View view) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(view, "view");
        int top = view.getTop();
        ViewParent parent2 = view.getParent();
        Intrinsics.g(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
        while (true) {
            ViewGroup viewGroup = (ViewGroup) parent2;
            if (viewGroup.equals(parent)) {
                return top;
            }
            top += viewGroup.getTop();
            parent2 = viewGroup.getParent();
            Intrinsics.g(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
        }
    }
}
