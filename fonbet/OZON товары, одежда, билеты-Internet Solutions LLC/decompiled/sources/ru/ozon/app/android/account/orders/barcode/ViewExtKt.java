package ru.ozon.app.android.account.orders.barcode;

import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0004"}, d2 = {"getTopLocationInWindow", "", "Landroid/view/View;", "getBottomLocationInWindow", "cs-orders_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ViewExtKt {
    public static final int getBottomLocationInWindow(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getHeight() + getTopLocationInWindow(view);
    }

    public static final int getTopLocationInWindow(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i11 = iArr[1];
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return i11 - ResourceExtKt.getStatusBarHeight(context);
    }
}
