package ru.ozon.app.android.cart.premiumPointsTrainV2.presentation.common;

import android.content.Context;
import android.view.View;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"setCarriageAppearance", "", "Landroid/view/View;", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CarriageUtilsKt {
    public static final void setCarriageAppearance(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setOutlineProvider(new CarriageOutlineProvider());
        view.setClipToOutline(true);
        view.setElevation(CarriageAppearanceParam.INSTANCE.getCARD_ELEVATION());
        view.setForeground(a.getDrawable(view.getContext(), R$drawable.selector_standard));
        Context context = view.getContext();
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        view.setBackgroundColor(context.getColor(ThemeExtKt.themeColorRes(context2, R$attr.layerFloor2)));
    }
}
