package jk0;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class o {
    public static final float a(@NotNull View rootView, @NotNull q qVar, boolean z11) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        return c(qVar.a(), rootView, qVar.b(), z11);
    }

    public static final float b(@NotNull l lVar, @NotNull View view, @NotNull Rect viewRect, boolean z11) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewRect, "viewRect");
        viewRect.setEmpty();
        if (view.getGlobalVisibleRect(viewRect)) {
            return c(lVar, view, viewRect, z11);
        }
        return 0.0f;
    }

    private static final float c(l lVar, View view, Rect rect, boolean z11) {
        if (rect.isEmpty() || lVar.e().isEmpty()) {
            return 0.0f;
        }
        int measuredHeight = view.getMeasuredHeight() * view.getMeasuredWidth();
        if (measuredHeight == 0) {
            return 0.0f;
        }
        Rect g10 = lVar.g();
        if (z11 || g10.isEmpty()) {
            g10 = null;
        }
        return (rect.width() * Math.max(Math.min(rect.bottom, lVar.e().bottom) - Math.max(rect.top, g10 != null ? g10.bottom : lVar.e().top), 0)) / measuredHeight;
    }
}
