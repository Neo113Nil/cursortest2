package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.view.shimmer;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0002J2\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeLegendShimmerViewV2;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp8", "", "dp12", "dp16", "dp28", "dp156", "dp176", "dpF8", "", "dpF20", "backgroundColor", "backgroundDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "addChildren", "", "createShimmerView", "Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "width", "height", "radius", "startMargin", "gravity", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSchemeLegendShimmerViewV2 extends FrameLayout {
    private final int backgroundColor;

    @NotNull
    private final ShapeDrawable backgroundDrawable;
    private final int dp12;
    private final int dp156;
    private final int dp16;
    private final int dp176;
    private final int dp28;
    private final int dp8;
    private final float dpF20;
    private final float dpF8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSchemeLegendShimmerViewV2(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp8 = UiExtKt.toPx(8, context);
        int px = UiExtKt.toPx(12, context);
        this.dp12 = px;
        int px2 = UiExtKt.toPx(16, context);
        this.dp16 = px2;
        this.dp28 = UiExtKt.toPx(28, context);
        this.dp156 = UiExtKt.toPx(156, context);
        this.dp176 = UiExtKt.toPx(176, context);
        this.dpF8 = ResourceExtKt.toPxF(8, context);
        float pxF = ResourceExtKt.toPxF(20, context);
        this.dpF20 = pxF;
        int themeColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        this.backgroundColor = themeColor;
        ShapeDrawable produce$default = RoundedBackgroundProducer.produce$default(new RoundedBackgroundProducer(), themeColor, 0.0f, 0.0f, pxF, pxF, 6, null);
        this.backgroundDrawable = produce$default;
        setBackground(produce$default);
        setPadding(px2, px, px2, px);
        addChildren();
    }

    private final void addChildren() {
        addView(createShimmerView$default(this, this.dp176, this.dp28, this.dpF8, 0, 3, 8, null));
        addView(createShimmerView(this.dp156, this.dp28, this.dpF8, this.dp176 + this.dp8, 5));
    }

    private final RoundedShimmerView createShimmerView(int width, int height, float radius, int startMargin, int gravity) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RoundedShimmerView roundedShimmerView = new RoundedShimmerView(context, null, 0, 0, 14, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(width, height);
        layoutParams.setMarginStart(startMargin);
        layoutParams.topMargin = layoutParams.topMargin;
        layoutParams.gravity = gravity;
        roundedShimmerView.setLayoutParams(layoutParams);
        roundedShimmerView.setCornerRadius(radius);
        return roundedShimmerView;
    }

    static /* synthetic */ RoundedShimmerView createShimmerView$default(FlightSchemeLegendShimmerViewV2 flightSchemeLegendShimmerViewV2, int i11, int i12, float f7, int i13, int i14, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            i13 = 0;
        }
        return flightSchemeLegendShimmerViewV2.createShimmerView(i11, i12, f7, i13, i14);
    }
}
