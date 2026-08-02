package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.progress.view;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProviderKt;
import ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder.ConstraintLayoutWithBorder;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u00101\u001a\u000202H\u0002J&\u00103\u001a\u00020\u00162\b\b\u0002\u00104\u001a\u00020\t2\b\b\u0002\u00105\u001a\u00020\t2\b\b\u0002\u00106\u001a\u00020\u0014H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/progress/view/TravelRailwaySearchResultsV3SkeletonProView;", "Lru/ozon/app/android/travel/utils/view/constraintLayoutWithBorder/ConstraintLayoutWithBorder;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dsDimensProvider", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "dp22", "", "dp36", "dp46", "dp57", "dp58", "dp60", "dp80", "dp144", "dp228", "dp250", "radius1", "", "skeletonPlaceholderView", "Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "skeletonPlaceholderView2", "skeletonPlaceholderView4", "skeletonPlaceholderView3", "skeletonPlaceholderView3a", "skeletonPlaceholderView5", "skeletonPlaceholderView6", "skeletonPlaceholderView7", "skeletonPlaceholderView8", "skeletonPlaceholderView9", "skeletonPlaceholderView10", "skeletonPlaceholderView11", "skeletonPlaceholderView12", "skeletonPlaceholderView13", "skeletonPlaceholderView14", "skeletonPlaceholderView15", "skeletonPlaceholderView16", "skeletonPlaceholderView17", "skeletonPlaceholderView18", "skeletonPlaceholderView19", "skeletonPlaceholderView20", "skeletonPlaceholderView21", "skeletonPlaceholderView22", "skeletonPlaceholderView23", "skeletonPlaceholderView24", "skeletonPlaceholderView25", "skeletonPlaceholderView26", "setConstrains", "", "createAndAddRoundedShimmerView", "width", "height", "cornersRadius", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySearchResultsV3SkeletonProView extends ConstraintLayoutWithBorder {
    public static final int $stable = RoundedShimmerView.$stable | DesignSystemDimensProvider.$stable;
    private final int dp144;
    private final int dp22;
    private final int dp228;
    private final int dp250;
    private final int dp36;
    private final int dp46;
    private final int dp57;
    private final int dp58;
    private final int dp60;
    private final int dp80;

    @NotNull
    private final DesignSystemDimensProvider dsDimensProvider;
    private final float radius1;

    @NotNull
    private final RoundedShimmerView skeletonPlaceholderView;

    @NotNull
    private final RoundedShimmerView skeletonPlaceholderView10;

    @NotNull
    private final RoundedShimmerView skeletonPlaceholderView11;

    @NotNull
    private final RoundedShimmerView skeletonPlaceholderView12;

    @NotNull
    private final RoundedShimmerView skeletonPlaceholderView13;

    @NotNull
    private final RoundedShimmerView skeletonPlaceholderView14;

    @NotNull
    private final RoundedShimmerView skeletonPlaceholderView15;

    @NotNull
    private final RoundedShimmerView skeletonPlaceholderView16;

    @NotNull
    private final RoundedShimmerView skeletonPlaceholderView17;

    @NotNull
    private final RoundedShimmerView skeletonPlaceholderView18;

    @NotNull
    private final RoundedShimmerView skeletonPlaceholderView19;

    @NotNull
    private final RoundedShimmerView skeletonPlaceholderView2;

    @NotNull
    private final RoundedShimmerView skeletonPlaceholderView20;

    @NotNull
    private final RoundedShimmerView skeletonPlaceholderView21;

    @NotNull
    private final RoundedShimmerView skeletonPlaceholderView22;

    @NotNull
    private final RoundedShimmerView skeletonPlaceholderView23;

    @NotNull
    private final RoundedShimmerView skeletonPlaceholderView24;

    @NotNull
    private final RoundedShimmerView skeletonPlaceholderView25;

    @NotNull
    private final RoundedShimmerView skeletonPlaceholderView26;

    @NotNull
    private final RoundedShimmerView skeletonPlaceholderView3;

    @NotNull
    private final RoundedShimmerView skeletonPlaceholderView3a;

    @NotNull
    private final RoundedShimmerView skeletonPlaceholderView4;

    @NotNull
    private final RoundedShimmerView skeletonPlaceholderView5;

    @NotNull
    private final RoundedShimmerView skeletonPlaceholderView6;

    @NotNull
    private final RoundedShimmerView skeletonPlaceholderView7;

    @NotNull
    private final RoundedShimmerView skeletonPlaceholderView8;

    @NotNull
    private final RoundedShimmerView skeletonPlaceholderView9;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelRailwaySearchResultsV3SkeletonProView(@NotNull Context context) {
        super(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
        DesignSystemDimensProvider dimens$default = DesignSystemDimensProviderKt.dimens$default(context, null, 1, null);
        this.dsDimensProvider = dimens$default;
        int px = ResourceExtKt.toPx(22, context);
        this.dp22 = px;
        int px2 = ResourceExtKt.toPx(36, context);
        this.dp36 = px2;
        int px3 = ResourceExtKt.toPx(46, context);
        this.dp46 = px3;
        int px4 = ResourceExtKt.toPx(57, context);
        this.dp57 = px4;
        int px5 = ResourceExtKt.toPx(58, context);
        this.dp58 = px5;
        int px6 = ResourceExtKt.toPx(60, context);
        this.dp60 = px6;
        int px7 = ResourceExtKt.toPx(80, context);
        this.dp80 = px7;
        int px8 = ResourceExtKt.toPx(144, context);
        this.dp144 = px8;
        int px9 = ResourceExtKt.toPx(228, context);
        this.dp228 = px9;
        int px10 = ResourceExtKt.toPx(m.e.DEFAULT_SWIPE_ANIMATION_DURATION, context);
        this.dp250 = px10;
        float pxF = ResourceExtKt.toPxF(1);
        this.radius1 = pxF;
        this.skeletonPlaceholderView = createAndAddRoundedShimmerView(dimens$default.getMargin32(), dimens$default.getMargin32(), dimens$default.getRadius12());
        this.skeletonPlaceholderView2 = createAndAddRoundedShimmerView$default(this, px8, dimens$default.getMargin12(), 0.0f, 4, null);
        this.skeletonPlaceholderView4 = createAndAddRoundedShimmerView$default(this, px5, dimens$default.getMargin12(), 0.0f, 4, null);
        this.skeletonPlaceholderView3 = createAndAddRoundedShimmerView$default(this, px5, dimens$default.getMargin12(), 0.0f, 4, null);
        this.skeletonPlaceholderView3a = createAndAddRoundedShimmerView$default(this, dimens$default.getMargin48(), dimens$default.getMargin12(), 0.0f, 4, null);
        this.skeletonPlaceholderView5 = createAndAddRoundedShimmerView$default(this, dimens$default.getMargin40(), dimens$default.getMargin20(), 0.0f, 4, null);
        this.skeletonPlaceholderView6 = createAndAddRoundedShimmerView$default(this, dimens$default.getMargin40(), dimens$default.getMargin20(), 0.0f, 4, null);
        this.skeletonPlaceholderView7 = createAndAddRoundedShimmerView(dimens$default.getMargin4(), dimens$default.getMargin4(), pxF);
        this.skeletonPlaceholderView8 = createAndAddRoundedShimmerView(dimens$default.getMargin4(), dimens$default.getMargin4(), pxF);
        this.skeletonPlaceholderView9 = createAndAddRoundedShimmerView$default(this, px9, dimens$default.getMargin12(), 0.0f, 4, null);
        this.skeletonPlaceholderView10 = createAndAddRoundedShimmerView$default(this, px10, dimens$default.getMargin12(), 0.0f, 4, null);
        this.skeletonPlaceholderView11 = createAndAddRoundedShimmerView$default(this, dimens$default.getMargin24(), dimens$default.getMargin24(), 0.0f, 4, null);
        this.skeletonPlaceholderView12 = createAndAddRoundedShimmerView$default(this, dimens$default.getMargin24(), dimens$default.getMargin24(), 0.0f, 4, null);
        this.skeletonPlaceholderView13 = createAndAddRoundedShimmerView$default(this, dimens$default.getMargin24(), dimens$default.getMargin24(), 0.0f, 4, null);
        this.skeletonPlaceholderView14 = createAndAddRoundedShimmerView$default(this, dimens$default.getMargin24(), dimens$default.getMargin24(), 0.0f, 4, null);
        this.skeletonPlaceholderView15 = createAndAddRoundedShimmerView$default(this, dimens$default.getMargin24(), dimens$default.getMargin24(), 0.0f, 4, null);
        this.skeletonPlaceholderView16 = createAndAddRoundedShimmerView$default(this, px4, dimens$default.getMargin12(), 0.0f, 4, null);
        this.skeletonPlaceholderView17 = createAndAddRoundedShimmerView$default(this, px3, dimens$default.getMargin12(), 0.0f, 4, null);
        this.skeletonPlaceholderView18 = createAndAddRoundedShimmerView$default(this, px2, dimens$default.getMargin12(), 0.0f, 4, null);
        this.skeletonPlaceholderView19 = createAndAddRoundedShimmerView$default(this, px2, dimens$default.getMargin12(), 0.0f, 4, null);
        this.skeletonPlaceholderView20 = createAndAddRoundedShimmerView$default(this, px3, dimens$default.getMargin12(), 0.0f, 4, null);
        this.skeletonPlaceholderView21 = createAndAddRoundedShimmerView$default(this, dimens$default.getMargin56(), dimens$default.getMargin12(), 0.0f, 4, null);
        this.skeletonPlaceholderView22 = createAndAddRoundedShimmerView$default(this, px, dimens$default.getMargin12(), 0.0f, 4, null);
        this.skeletonPlaceholderView23 = createAndAddRoundedShimmerView$default(this, px3, dimens$default.getMargin12(), 0.0f, 4, null);
        this.skeletonPlaceholderView24 = createAndAddRoundedShimmerView$default(this, dimens$default.getMargin52(), dimens$default.getMargin12(), 0.0f, 4, null);
        this.skeletonPlaceholderView25 = createAndAddRoundedShimmerView(px6, dimens$default.getMargin20(), dimens$default.getRadius6());
        this.skeletonPlaceholderView26 = createAndAddRoundedShimmerView(px7, dimens$default.getMargin24(), dimens$default.getRadius6());
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        setRadius(dimens$default.getRadius24());
        int margin16 = dimens$default.getMargin16();
        setPadding(margin16, margin16, margin16, margin16);
        setConstrains();
    }

    private final RoundedShimmerView createAndAddRoundedShimmerView(int width, int height, float cornersRadius) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RoundedShimmerView roundedShimmerView = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView.setId(View.generateViewId());
        roundedShimmerView.setLayoutParams(new ConstraintLayout.b(width, height));
        roundedShimmerView.setCornerRadius(cornersRadius);
        addView(roundedShimmerView);
        return roundedShimmerView;
    }

    static /* synthetic */ RoundedShimmerView createAndAddRoundedShimmerView$default(TravelRailwaySearchResultsV3SkeletonProView travelRailwaySearchResultsV3SkeletonProView, int i11, int i12, float f7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        if ((i13 & 4) != 0) {
            f7 = travelRailwaySearchResultsV3SkeletonProView.dsDimensProvider.getRadius4();
        }
        return travelRailwaySearchResultsV3SkeletonProView.createAndAddRoundedShimmerView(i11, i12, f7);
    }

    private final void setConstrains() {
        ConstraintLayoutExtKt.updateConstraints(this, new TravelRailwaySearchResultsV3SkeletonProView$setConstrains$1(this));
    }
}
