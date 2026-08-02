package ru.ozon.app.android.fresh.checkout.ui.molecules.checkoutCellList.utils;

import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.checkout.ui.molecules.checkoutCellList.data.FreshCellListDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u001a\u001f\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"setupPaddings", "", "Landroid/view/View;", "paddings", "Lru/ozon/app/android/fresh/checkout/ui/molecules/checkoutCellList/data/FreshCellListDTO$Paddings;", "defaultHorizontalPadding", "", "defaultVerticalPadding", "getLayoutPaddingIntValue", "context", "Landroid/content/Context;", "padding", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "(Landroid/content/Context;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)Ljava/lang/Integer;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ViewExtKt {
    public static final Integer getLayoutPaddingIntValue(@NotNull Context context, CommonCellSettings.LayoutPadding layoutPadding) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (layoutPadding == null) {
            return null;
        }
        return Integer.valueOf((int) context.getResources().getDimension(layoutPadding.getCellLayoutPadding()));
    }

    public static final void setupPaddings(@NotNull View view, FreshCellListDTO.Paddings paddings, int i11, int i12) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer layoutPaddingIntValue = getLayoutPaddingIntValue(context, paddings != null ? paddings.getLeftPadding() : null);
        int intValue = layoutPaddingIntValue != null ? layoutPaddingIntValue.intValue() : i11;
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer layoutPaddingIntValue2 = getLayoutPaddingIntValue(context2, paddings != null ? paddings.getTopPadding() : null);
        int intValue2 = layoutPaddingIntValue2 != null ? layoutPaddingIntValue2.intValue() : i12;
        Context context3 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        Integer layoutPaddingIntValue3 = getLayoutPaddingIntValue(context3, paddings != null ? paddings.getRightPadding() : null);
        if (layoutPaddingIntValue3 != null) {
            i11 = layoutPaddingIntValue3.intValue();
        }
        Context context4 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        Integer layoutPaddingIntValue4 = getLayoutPaddingIntValue(context4, paddings != null ? paddings.getBottomPadding() : null);
        if (layoutPaddingIntValue4 != null) {
            i12 = layoutPaddingIntValue4.intValue();
        }
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.updatePadding(view, intValue, intValue2, i11, i12);
    }
}
