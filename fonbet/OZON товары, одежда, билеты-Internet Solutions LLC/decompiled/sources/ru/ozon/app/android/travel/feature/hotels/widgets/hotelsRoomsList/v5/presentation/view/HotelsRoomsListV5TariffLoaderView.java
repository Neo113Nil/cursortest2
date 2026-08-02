package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.view;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder.ConstraintLayoutWithBorder;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\"H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/view/HotelsRoomsListV5TariffLoaderView;", "Lru/ozon/app/android/travel/utils/view/constraintLayoutWithBorder/ConstraintLayoutWithBorder;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dpf1", "", "dp6", "", "dp8", "dp10", "dp16", "dp20", "dp24", "dp32", "dp56", "dp162", "dp186", "dpf6", "dpf16", "icon1", "Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "icon2", "icon3", "icon4", "service1", "service2", "service3", "service4", "price", "miles", "button", "setupStyle", "", "setupConstraints", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsRoomsListV5TariffLoaderView extends ConstraintLayoutWithBorder {
    public static final int $stable = RoundedShimmerView.$stable;

    @NotNull
    private final RoundedShimmerView button;
    private final int dp10;
    private final int dp16;
    private final int dp162;
    private final int dp186;
    private final int dp20;
    private final int dp24;
    private final int dp32;
    private final int dp56;
    private final int dp6;
    private final int dp8;
    private final float dpf1;
    private final float dpf16;
    private final float dpf6;

    @NotNull
    private final RoundedShimmerView icon1;

    @NotNull
    private final RoundedShimmerView icon2;

    @NotNull
    private final RoundedShimmerView icon3;

    @NotNull
    private final RoundedShimmerView icon4;

    @NotNull
    private final RoundedShimmerView miles;

    @NotNull
    private final RoundedShimmerView price;

    @NotNull
    private final RoundedShimmerView service1;

    @NotNull
    private final RoundedShimmerView service2;

    @NotNull
    private final RoundedShimmerView service3;

    @NotNull
    private final RoundedShimmerView service4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsRoomsListV5TariffLoaderView(@NotNull Context context) {
        super(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
        int i11 = 14;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i12 = 0;
        this.dpf1 = ResourceExtKt.toPxF(1, context);
        this.dp6 = ResourceExtKt.toPx(6, context);
        this.dp8 = ResourceExtKt.toPx(8, context);
        this.dp10 = ResourceExtKt.toPx(10, context);
        int px = ResourceExtKt.toPx(16, context);
        this.dp16 = px;
        int px2 = ResourceExtKt.toPx(20, context);
        this.dp20 = px2;
        int px3 = ResourceExtKt.toPx(24, context);
        this.dp24 = px3;
        int px4 = ResourceExtKt.toPx(32, context);
        this.dp32 = px4;
        int px5 = ResourceExtKt.toPx(56, context);
        this.dp56 = px5;
        int px6 = ResourceExtKt.toPx(162, context);
        this.dp162 = px6;
        int px7 = ResourceExtKt.toPx(186, context);
        this.dp186 = px7;
        float pxF = ResourceExtKt.toPxF(6, context);
        this.dpf6 = pxF;
        this.dpf16 = ResourceExtKt.toPxF(16, context);
        AttributeSet attributeSet = null;
        int i13 = 0;
        RoundedShimmerView roundedShimmerView = new RoundedShimmerView(context, attributeSet, i13, i12, i11, defaultConstructorMarker);
        roundedShimmerView.setId(View.generateViewId());
        roundedShimmerView.setLayoutParams(new ConstraintLayout.b(px, px));
        roundedShimmerView.setCornerRadius(pxF);
        addView(roundedShimmerView);
        this.icon1 = roundedShimmerView;
        RoundedShimmerView roundedShimmerView2 = new RoundedShimmerView(context, attributeSet, i13, i12, i11, defaultConstructorMarker);
        roundedShimmerView2.setId(View.generateViewId());
        roundedShimmerView2.setLayoutParams(new ConstraintLayout.b(px, px));
        roundedShimmerView2.setCornerRadius(pxF);
        addView(roundedShimmerView2);
        this.icon2 = roundedShimmerView2;
        RoundedShimmerView roundedShimmerView3 = new RoundedShimmerView(context, attributeSet, i13, i12, i11, defaultConstructorMarker);
        roundedShimmerView3.setId(View.generateViewId());
        roundedShimmerView3.setLayoutParams(new ConstraintLayout.b(px, px));
        roundedShimmerView3.setCornerRadius(pxF);
        addView(roundedShimmerView3);
        this.icon3 = roundedShimmerView3;
        RoundedShimmerView roundedShimmerView4 = new RoundedShimmerView(context, attributeSet, i13, i12, i11, defaultConstructorMarker);
        roundedShimmerView4.setId(View.generateViewId());
        roundedShimmerView4.setLayoutParams(new ConstraintLayout.b(px, px));
        roundedShimmerView4.setCornerRadius(pxF);
        addView(roundedShimmerView4);
        this.icon4 = roundedShimmerView4;
        RoundedShimmerView roundedShimmerView5 = new RoundedShimmerView(context, attributeSet, i13, i12, i11, defaultConstructorMarker);
        roundedShimmerView5.setId(View.generateViewId());
        roundedShimmerView5.setLayoutParams(new ConstraintLayout.b(px6, px2));
        addView(roundedShimmerView5);
        this.service1 = roundedShimmerView5;
        RoundedShimmerView roundedShimmerView6 = new RoundedShimmerView(context, attributeSet, i13, i12, i11, defaultConstructorMarker);
        roundedShimmerView6.setId(View.generateViewId());
        roundedShimmerView6.setLayoutParams(new ConstraintLayout.b(px6, px2));
        addView(roundedShimmerView6);
        this.service2 = roundedShimmerView6;
        RoundedShimmerView roundedShimmerView7 = new RoundedShimmerView(context, attributeSet, i13, i12, i11, defaultConstructorMarker);
        roundedShimmerView7.setId(View.generateViewId());
        roundedShimmerView7.setLayoutParams(new ConstraintLayout.b(px6, px2));
        addView(roundedShimmerView7);
        this.service3 = roundedShimmerView7;
        RoundedShimmerView roundedShimmerView8 = new RoundedShimmerView(context, attributeSet, i13, i12, i11, defaultConstructorMarker);
        roundedShimmerView8.setId(View.generateViewId());
        roundedShimmerView8.setLayoutParams(new ConstraintLayout.b(px6, px2));
        addView(roundedShimmerView8);
        this.service4 = roundedShimmerView8;
        RoundedShimmerView roundedShimmerView9 = new RoundedShimmerView(context, attributeSet, i13, i12, i11, defaultConstructorMarker);
        roundedShimmerView9.setId(View.generateViewId());
        roundedShimmerView9.setLayoutParams(new ConstraintLayout.b(px7, px3));
        addView(roundedShimmerView9);
        this.price = roundedShimmerView9;
        RoundedShimmerView roundedShimmerView10 = new RoundedShimmerView(context, attributeSet, i13, i12, i11, defaultConstructorMarker);
        roundedShimmerView10.setId(View.generateViewId());
        roundedShimmerView10.setLayoutParams(new ConstraintLayout.b(px5, px2));
        roundedShimmerView10.setCornerRadius(pxF);
        addView(roundedShimmerView10);
        this.miles = roundedShimmerView10;
        RoundedShimmerView roundedShimmerView11 = new RoundedShimmerView(context, attributeSet, i13, i12, i11, defaultConstructorMarker);
        roundedShimmerView11.setId(View.generateViewId());
        roundedShimmerView11.setLayoutParams(new ConstraintLayout.b(0, px4));
        addView(roundedShimmerView11);
        this.button = roundedShimmerView11;
        setPadding(px, px, px, px);
        setupStyle();
        setupConstraints();
    }

    private final void setupConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new HotelsRoomsListV5TariffLoaderView$setupConstraints$1(this));
    }

    private final void setupStyle() {
        setRadius(this.dpf16);
        getBorderPaint().setStrokeWidth(this.dpf1);
        Paint borderPaint = getBorderPaint();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        borderPaint.setColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        setBackgroundColor(ThemeExtKt.themeColor(context2, R$attr.layerFloor1));
    }
}
