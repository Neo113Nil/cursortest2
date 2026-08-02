package ru.ozon.app.android.travel.feature.general.common.widgets.roundedNavBar.utils;

import android.content.Context;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.roundedNavBar.view.RoundedNavBarView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0000¨\u0006\u0002"}, d2 = {"applyLayoutParams", "Lru/ozon/app/android/travel/feature/general/common/widgets/roundedNavBar/view/RoundedNavBarView;", "common_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RoundedNavBarViewUtilKt {
    @NotNull
    public static final RoundedNavBarView applyLayoutParams(@NotNull RoundedNavBarView roundedNavBarView) {
        Intrinsics.checkNotNullParameter(roundedNavBarView, "<this>");
        Context context = roundedNavBarView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = ResourceExtKt.toPx(8, context);
        Context context2 = roundedNavBarView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px2 = ResourceExtKt.toPx(12, context2);
        Context context3 = roundedNavBarView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int px3 = ResourceExtKt.toPx(16, context3);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(px3, px2, px3, px);
        roundedNavBarView.setLayoutParams(layoutParams);
        return roundedNavBarView;
    }
}
