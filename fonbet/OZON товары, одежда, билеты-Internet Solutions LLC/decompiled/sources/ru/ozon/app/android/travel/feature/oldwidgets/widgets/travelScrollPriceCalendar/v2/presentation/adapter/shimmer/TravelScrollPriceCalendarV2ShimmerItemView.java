package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v2.presentation.adapter.shimmer;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/adapter/shimmer/TravelScrollPriceCalendarV2ShimmerItemView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "marginTop", "", "shimmerWidth", "firstShimmerHeight", "secondShimmerHeight", "borderColor", "borderWidth", "borderRadius", "", "getRoundedShimmerView", "Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "width", "height", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelScrollPriceCalendarV2ShimmerItemView extends LinearLayout {
    private final int borderColor;
    private final float borderRadius;
    private final int borderWidth;
    private final int firstShimmerHeight;
    private final int marginTop;
    private final int secondShimmerHeight;
    private final int shimmerWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelScrollPriceCalendarV2ShimmerItemView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(2, context);
        this.marginTop = px;
        int px2 = ResourceExtKt.toPx(78, context);
        this.shimmerWidth = px2;
        int px3 = ResourceExtKt.toPx(20, context);
        this.firstShimmerHeight = px3;
        int px4 = ResourceExtKt.toPx(12, context);
        this.secondShimmerHeight = px4;
        int themeColor = ThemeExtKt.themeColor(context, R$attr.graphicNeutral);
        this.borderColor = themeColor;
        int px5 = ResourceExtKt.toPx(1, context);
        this.borderWidth = px5;
        float pxF = ResourceExtKt.toPxF(12, context);
        this.borderRadius = pxF;
        addView(getRoundedShimmerView$default(this, px2, px3, 0, 4, null));
        addView(getRoundedShimmerView(px2, px4, px));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke(px5, themeColor);
        gradientDrawable.setCornerRadius(pxF);
        setBackground(gradientDrawable);
        setOrientation(1);
    }

    private final RoundedShimmerView getRoundedShimmerView(int width, int height, int marginTop) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RoundedShimmerView roundedShimmerView = new RoundedShimmerView(context, null, 0, 0, 14, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(width, height);
        layoutParams.topMargin = marginTop;
        roundedShimmerView.setLayoutParams(layoutParams);
        return roundedShimmerView;
    }

    static /* synthetic */ RoundedShimmerView getRoundedShimmerView$default(TravelScrollPriceCalendarV2ShimmerItemView travelScrollPriceCalendarV2ShimmerItemView, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i13 = 0;
        }
        return travelScrollPriceCalendarV2ShimmerItemView.getRoundedShimmerView(i11, i12, i13);
    }
}
