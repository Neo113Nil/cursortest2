package ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.flights.AviaCheckTariffsVO;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/view/AviaCheckTariffsSkeleton;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp2", "", "dp8", "dpf16", "", "dp16", "dp20", "dp24", "dp80", "dp124", "backgroundColor", "bind", "", "state", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$TariffItem$TariffSkeleton;", "getRoundedShimmerView", "Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "width", "margin", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaCheckTariffsSkeleton extends LinearLayout {
    private final int backgroundColor;
    private final int dp124;
    private final int dp16;
    private final int dp2;
    private final int dp20;
    private final int dp24;
    private final int dp8;
    private final int dp80;
    private final float dpf16;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaCheckTariffsSkeleton(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(2, context);
        this.dp2 = px;
        this.dp8 = ResourceExtKt.toPx(8, context);
        float pxF = ResourceExtKt.toPxF(16, context);
        this.dpf16 = pxF;
        int px2 = ResourceExtKt.toPx(16, context);
        this.dp16 = px2;
        int px3 = ResourceExtKt.toPx(20, context);
        this.dp20 = px3;
        this.dp24 = ResourceExtKt.toPx(24, context);
        this.dp80 = ResourceExtKt.toPx(80, context);
        this.dp124 = ResourceExtKt.toPx(124, context);
        int themeColor = ThemeExtKt.themeColor(context, R$attr.layerSurface);
        this.backgroundColor = themeColor;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke(px, themeColor);
        gradientDrawable.setCornerRadius(pxF);
        setBackground(gradientDrawable);
        setOrientation(1);
        setPadding(px2, px2, px2, px3);
    }

    private final RoundedShimmerView getRoundedShimmerView(int width, int margin) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RoundedShimmerView roundedShimmerView = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView.setCornerRadius(this.dpf16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(width, this.dp24);
        layoutParams.topMargin = margin;
        roundedShimmerView.setLayoutParams(layoutParams);
        return roundedShimmerView;
    }

    public final void bind(@NotNull AviaCheckTariffsVO.TariffItem.TariffSkeleton state) {
        Intrinsics.checkNotNullParameter(state, "state");
        removeAllViews();
        int i11 = 0;
        addView(getRoundedShimmerView(this.dp124, 0));
        addView(getRoundedShimmerView(this.dp80, this.dp8));
        int benefitsSize = state.getBenefitsSize();
        while (i11 < benefitsSize) {
            addView(getRoundedShimmerView(-1, i11 == 0 ? this.dp16 : this.dp8));
            i11++;
        }
    }
}
