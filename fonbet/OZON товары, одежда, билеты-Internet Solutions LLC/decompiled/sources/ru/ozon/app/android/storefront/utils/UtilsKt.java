package ru.ozon.app.android.storefront.utils;

import a00.C4911f;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\n\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroid/view/View;", "", "horizontalMargin", "", "updateHorizontalMarginIfNeeded", "(Landroid/view/View;I)V", "La00/f;", "container", "getStatusBarHeight", "(La00/f;)I", "STATUS_BAR_DEFAULT_HEIGHT", "I", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UtilsKt {
    private static final int STATUS_BAR_DEFAULT_HEIGHT = ResourceExtKt.toPx(25);

    @SuppressLint({"InternalInsetResource"})
    public static final int getStatusBarHeight(@NotNull C4911f container) {
        Window window;
        View decorView;
        Resources resources;
        Resources resources2;
        Intrinsics.checkNotNullParameter(container, "container");
        Rect rect = new Rect();
        r a11 = container.a();
        if (a11 == null || (window = a11.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return rect.top;
        }
        decorView.getWindowVisibleDisplayFrame(rect);
        int i11 = rect.top;
        if (i11 != 0) {
            return i11;
        }
        ComponentCallbacksC5392m c11 = container.c();
        int i12 = 0;
        int identifier = (c11 == null || (resources2 = c11.getResources()) == null) ? 0 : resources2.getIdentifier("status_bar_height", "dimen", "android");
        ComponentCallbacksC5392m c12 = container.c();
        if (c12 != null && (resources = c12.getResources()) != null) {
            i12 = resources.getDimensionPixelSize(identifier);
        }
        return i12 != 0 ? i12 : STATUS_BAR_DEFAULT_HEIGHT;
    }

    public static final void updateHorizontalMarginIfNeeded(@NotNull View view, int i11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        int i12 = marginLayoutParams.leftMargin;
        int i13 = marginLayoutParams.rightMargin;
        if (i12 == i11 && i13 == i11) {
            return;
        }
        marginLayoutParams.leftMargin = i11;
        marginLayoutParams.rightMargin = i11;
        view.setLayoutParams(marginLayoutParams);
    }
}
