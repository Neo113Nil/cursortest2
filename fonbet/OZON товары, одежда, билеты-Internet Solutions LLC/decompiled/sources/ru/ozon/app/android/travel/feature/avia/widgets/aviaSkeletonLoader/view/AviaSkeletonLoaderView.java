package ru.ozon.app.android.travel.feature.avia.widgets.aviaSkeletonLoader.view;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProviderKt;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u00104\u001a\u00020\u001a2\u0006\u00105\u001a\u00020\t2\u0006\u00106\u001a\u00020\tH\u0002J\b\u00107\u001a\u000208H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/view/AviaSkeletonLoaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dsProvider", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "dp2", "", "dp4", "dp8", "dp10", "dp12", "dp16", "dp20", "dp24", "dp42", "dp46", "dp84", "dp88", "dp114", "dpf6", "", "dpf24", "shimmer1", "Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "shimmer2", "shimmer3", "shimmer4", "shimmer5", "extraShimmer6", "extraShimmer7", "extraShimmer8", "extraShimmer9", "extraShimmer10", "extraShimmer11", "extraShimmer12", "extraShimmer13", "extraShimmer14", "extraShimmer15", "shimmer6", "shimmer7", "shimmer8", "shimmer9", "shimmer10", "shimmer11", "shimmer12", "shimmer13", "shimmer14", "shimmer15", "backgroundColor", "createShimmer", "width", "height", "setupConstraints", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSkeletonLoaderView extends ConstraintLayout {
    public static final int $stable = RoundedShimmerView.$stable | DesignSystemDimensProvider.$stable;
    private final int backgroundColor;
    private final int dp10;
    private final int dp114;
    private final int dp12;
    private final int dp16;
    private final int dp2;
    private final int dp20;
    private final int dp24;
    private final int dp4;
    private final int dp42;
    private final int dp46;
    private final int dp8;
    private final int dp84;
    private final int dp88;
    private final float dpf24;
    private final float dpf6;

    @NotNull
    private final DesignSystemDimensProvider dsProvider;

    @NotNull
    private final RoundedShimmerView extraShimmer10;

    @NotNull
    private final RoundedShimmerView extraShimmer11;

    @NotNull
    private final RoundedShimmerView extraShimmer12;

    @NotNull
    private final RoundedShimmerView extraShimmer13;

    @NotNull
    private final RoundedShimmerView extraShimmer14;

    @NotNull
    private final RoundedShimmerView extraShimmer15;

    @NotNull
    private final RoundedShimmerView extraShimmer6;

    @NotNull
    private final RoundedShimmerView extraShimmer7;

    @NotNull
    private final RoundedShimmerView extraShimmer8;

    @NotNull
    private final RoundedShimmerView extraShimmer9;

    @NotNull
    private final RoundedShimmerView shimmer1;

    @NotNull
    private final RoundedShimmerView shimmer10;

    @NotNull
    private final RoundedShimmerView shimmer11;

    @NotNull
    private final RoundedShimmerView shimmer12;

    @NotNull
    private final RoundedShimmerView shimmer13;

    @NotNull
    private final RoundedShimmerView shimmer14;

    @NotNull
    private final RoundedShimmerView shimmer15;

    @NotNull
    private final RoundedShimmerView shimmer2;

    @NotNull
    private final RoundedShimmerView shimmer3;

    @NotNull
    private final RoundedShimmerView shimmer4;

    @NotNull
    private final RoundedShimmerView shimmer5;

    @NotNull
    private final RoundedShimmerView shimmer6;

    @NotNull
    private final RoundedShimmerView shimmer7;

    @NotNull
    private final RoundedShimmerView shimmer8;

    @NotNull
    private final RoundedShimmerView shimmer9;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaSkeletonLoaderView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        DesignSystemDimensProvider dimens$default = DesignSystemDimensProviderKt.dimens$default(context, null, 1, null);
        this.dsProvider = dimens$default;
        int margin2 = dimens$default.getMargin2();
        this.dp2 = margin2;
        this.dp4 = dimens$default.getMargin4();
        this.dp8 = dimens$default.getMargin8();
        this.dp10 = dimens$default.getMargin10();
        int margin12 = dimens$default.getMargin12();
        this.dp12 = margin12;
        int margin16 = dimens$default.getMargin16();
        this.dp16 = margin16;
        int margin20 = dimens$default.getMargin20();
        this.dp20 = margin20;
        int margin24 = dimens$default.getMargin24();
        this.dp24 = margin24;
        int px = ResourceExtKt.toPx(42, context);
        this.dp42 = px;
        int px2 = ResourceExtKt.toPx(46, context);
        this.dp46 = px2;
        int px3 = ResourceExtKt.toPx(84, context);
        this.dp84 = px3;
        int px4 = ResourceExtKt.toPx(88, context);
        this.dp88 = px4;
        int px5 = ResourceExtKt.toPx(114, context);
        this.dp114 = px5;
        this.dpf6 = ResourceExtKt.toPxF(6, context);
        float pxF = ResourceExtKt.toPxF(24, context);
        this.dpf24 = pxF;
        this.shimmer1 = createShimmer(px5, margin24);
        this.shimmer2 = createShimmer(px2, margin24);
        this.shimmer3 = createShimmer(margin24, margin24);
        this.shimmer4 = createShimmer(px4, margin16);
        this.shimmer5 = createShimmer(px, margin16);
        this.extraShimmer6 = createShimmer(margin20, margin12);
        this.extraShimmer7 = createShimmer(margin20, margin12);
        this.extraShimmer8 = createShimmer(margin12, margin2);
        this.extraShimmer9 = createShimmer(margin20, margin12);
        this.extraShimmer10 = createShimmer(margin20, margin12);
        this.extraShimmer11 = createShimmer(px3, margin12);
        this.extraShimmer12 = createShimmer(margin24, margin12);
        this.extraShimmer13 = createShimmer(margin12, margin2);
        this.extraShimmer14 = createShimmer(margin24, margin12);
        this.extraShimmer15 = createShimmer(margin24, margin12);
        this.shimmer6 = createShimmer(margin20, margin12);
        this.shimmer7 = createShimmer(margin20, margin12);
        this.shimmer8 = createShimmer(margin12, margin2);
        this.shimmer9 = createShimmer(margin20, margin12);
        this.shimmer10 = createShimmer(margin20, margin12);
        this.shimmer11 = createShimmer(px3, margin12);
        this.shimmer12 = createShimmer(margin24, margin12);
        this.shimmer13 = createShimmer(margin12, margin2);
        this.shimmer14 = createShimmer(margin24, margin12);
        this.shimmer15 = createShimmer(margin24, margin12);
        int themeColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        this.backgroundColor = themeColor;
        setPadding(margin16, margin16, margin16, margin16);
        setBackground(new RoundedBackgroundProducer().produce(themeColor, pxF));
        setupConstraints();
    }

    private final RoundedShimmerView createShimmer(int width, int height) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RoundedShimmerView roundedShimmerView = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView.setId(View.generateViewId());
        roundedShimmerView.setLayoutParams(new ConstraintLayout.b(width, height));
        roundedShimmerView.setCornerRadius(this.dpf6);
        addView(roundedShimmerView);
        return roundedShimmerView;
    }

    private final void setupConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new AviaSkeletonLoaderView$setupConstraints$1(this));
    }
}
