package ru.ozon.app.android.cart.totalV3.presentation;

import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.totalV3.presentation.TotalVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000¨\u0006\u0005"}, d2 = {"setupMargins", "", "Landroid/view/View;", "margins", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$HorizontalMarginsVO;", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ViewExtKt {
    public static final void setupMargins(@NotNull View view, TotalVO.HorizontalMarginsVO horizontalMarginsVO) {
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (horizontalMarginsVO != null) {
            int marginLeft = horizontalMarginsVO.getMarginLeft();
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            i11 = ResourceExtKt.toPx(marginLeft, context);
        } else {
            i11 = 0;
        }
        if (horizontalMarginsVO != null) {
            int marginRight = horizontalMarginsVO.getMarginRight();
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            i12 = ResourceExtKt.toPx(marginRight, context2);
        } else {
            i12 = 0;
        }
        view.setPadding(i11, 0, i12, 0);
    }
}
