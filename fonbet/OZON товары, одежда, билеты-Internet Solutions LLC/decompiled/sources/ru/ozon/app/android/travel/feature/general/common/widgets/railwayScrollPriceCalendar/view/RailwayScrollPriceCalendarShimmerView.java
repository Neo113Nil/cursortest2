package ru.ozon.app.android.travel.feature.general.common.widgets.railwayScrollPriceCalendar.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/view/RailwayScrollPriceCalendarShimmerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp1", "", "dp12", "dpf12", "", "dp20", "borderColor", "getRoundedShimmerView", "Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "height", "gravity", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RailwayScrollPriceCalendarShimmerView extends FrameLayout {
    private final int borderColor;
    private final int dp1;
    private final int dp12;
    private final int dp20;
    private final float dpf12;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RailwayScrollPriceCalendarShimmerView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(1, context);
        this.dp1 = px;
        int px2 = ResourceExtKt.toPx(12, context);
        this.dp12 = px2;
        float pxF = ResourceExtKt.toPxF(12, context);
        this.dpf12 = pxF;
        int px3 = ResourceExtKt.toPx(20, context);
        this.dp20 = px3;
        int themeColor = ThemeExtKt.themeColor(context, R$attr.graphicNeutral);
        this.borderColor = themeColor;
        addView(getRoundedShimmerView(px3, 48));
        addView(getRoundedShimmerView(px2, 80));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke(px, themeColor);
        gradientDrawable.setCornerRadius(pxF);
        setBackground(gradientDrawable);
    }

    private final RoundedShimmerView getRoundedShimmerView(int height, int gravity) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RoundedShimmerView roundedShimmerView = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView.setLayoutParams(new FrameLayout.LayoutParams(-1, height, gravity));
        return roundedShimmerView;
    }
}
