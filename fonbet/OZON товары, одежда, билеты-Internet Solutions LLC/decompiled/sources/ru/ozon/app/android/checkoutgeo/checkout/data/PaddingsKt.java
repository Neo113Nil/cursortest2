package ru.ozon.app.android.checkoutgeo.checkout.data;

import Z1.h;
import android.view.View;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.CommonCellSettingsKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroid/view/View;", "Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "paddings", "", "updatePadding", "(Landroid/view/View;Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;)V", "Landroidx/compose/ui/e;", "setupPaddings", "(Landroidx/compose/ui/e;Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;)Landroidx/compose/ui/e;", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PaddingsKt {
    @NotNull
    public static final e setupPaddings(@NotNull e eVar, Paddings paddings) {
        CommonCellSettings.LayoutPadding bottomPadding;
        h dp;
        CommonCellSettings.LayoutPadding rightPadding;
        h dp2;
        CommonCellSettings.LayoutPadding topPadding;
        h dp3;
        CommonCellSettings.LayoutPadding leftPadding;
        h dp4;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return T.i(eVar, (paddings == null || (leftPadding = paddings.getLeftPadding()) == null || (dp4 = CommonCellSettingsKt.getDp(leftPadding)) == null) ? 0 : dp4.d(), (paddings == null || (topPadding = paddings.getTopPadding()) == null || (dp3 = CommonCellSettingsKt.getDp(topPadding)) == null) ? 0 : dp3.d(), (paddings == null || (rightPadding = paddings.getRightPadding()) == null || (dp2 = CommonCellSettingsKt.getDp(rightPadding)) == null) ? 0 : dp2.d(), (paddings == null || (bottomPadding = paddings.getBottomPadding()) == null || (dp = CommonCellSettingsKt.getDp(bottomPadding)) == null) ? 0 : dp.d());
    }

    public static final void updatePadding(@NotNull View view, Paddings paddings) {
        CommonCellSettings.LayoutPadding bottomPadding;
        h dp;
        CommonCellSettings.LayoutPadding topPadding;
        h dp2;
        CommonCellSettings.LayoutPadding rightPadding;
        h dp3;
        CommonCellSettings.LayoutPadding leftPadding;
        h dp4;
        Intrinsics.checkNotNullParameter(view, "<this>");
        int i11 = 0;
        int px = (paddings == null || (leftPadding = paddings.getLeftPadding()) == null || (dp4 = CommonCellSettingsKt.getDp(leftPadding)) == null) ? 0 : UiExtKt.toPx(dp4.d());
        int px2 = (paddings == null || (rightPadding = paddings.getRightPadding()) == null || (dp3 = CommonCellSettingsKt.getDp(rightPadding)) == null) ? 0 : UiExtKt.toPx(dp3.d());
        int px3 = (paddings == null || (topPadding = paddings.getTopPadding()) == null || (dp2 = CommonCellSettingsKt.getDp(topPadding)) == null) ? 0 : UiExtKt.toPx(dp2.d());
        if (paddings != null && (bottomPadding = paddings.getBottomPadding()) != null && (dp = CommonCellSettingsKt.getDp(bottomPadding)) != null) {
            i11 = UiExtKt.toPx(dp.d());
        }
        view.setPadding(px, px3, px2, i11);
    }
}
