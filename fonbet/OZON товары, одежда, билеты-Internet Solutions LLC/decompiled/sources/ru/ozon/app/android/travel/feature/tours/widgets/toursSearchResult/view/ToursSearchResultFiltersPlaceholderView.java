package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.view;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
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

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/view/ToursSearchResultFiltersPlaceholderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dsProvider", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "dp8", "", "dp16", "dp32", "dp52", "dp82", "dp128", "dp142", "dp198", "dpf16", "", "bgRadius", "filterShimmer1", "Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "filterShimmer2", "filterShimmer3", "textShimmer1", "textShimmer2", "setupRoot", "", "setupConstraints", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ToursSearchResultFiltersPlaceholderView extends ConstraintLayout {
    public static final int $stable = RoundedShimmerView.$stable | DesignSystemDimensProvider.$stable;
    private final float bgRadius;
    private final int dp128;
    private final int dp142;
    private final int dp16;
    private final int dp198;
    private final int dp32;
    private final int dp52;
    private final int dp8;
    private final int dp82;
    private final float dpf16;

    @NotNull
    private final DesignSystemDimensProvider dsProvider;

    @NotNull
    private final RoundedShimmerView filterShimmer1;

    @NotNull
    private final RoundedShimmerView filterShimmer2;

    @NotNull
    private final RoundedShimmerView filterShimmer3;

    @NotNull
    private final RoundedShimmerView textShimmer1;

    @NotNull
    private final RoundedShimmerView textShimmer2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToursSearchResultFiltersPlaceholderView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        DesignSystemDimensProvider dimens$default = DesignSystemDimensProviderKt.dimens$default(context, null, 1, null);
        this.dsProvider = dimens$default;
        this.dp8 = dimens$default.getMargin8();
        int margin16 = dimens$default.getMargin16();
        this.dp16 = margin16;
        int px = ResourceExtKt.toPx(32, context);
        this.dp32 = px;
        int px2 = ResourceExtKt.toPx(52, context);
        this.dp52 = px2;
        int px3 = ResourceExtKt.toPx(82, context);
        this.dp82 = px3;
        int px4 = ResourceExtKt.toPx(UserVerificationMethods.USER_VERIFY_PATTERN, context);
        this.dp128 = px4;
        int px5 = ResourceExtKt.toPx(142, context);
        this.dp142 = px5;
        int px6 = ResourceExtKt.toPx(198, context);
        this.dp198 = px6;
        float radius16 = dimens$default.getRadius16();
        this.dpf16 = radius16;
        this.bgRadius = dimens$default.getRadius20();
        RoundedShimmerView roundedShimmerView = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView.setId(View.generateViewId());
        roundedShimmerView.setLayoutParams(new ConstraintLayout.b(px6, px));
        roundedShimmerView.setCornerRadius(radius16);
        addView(roundedShimmerView);
        this.filterShimmer1 = roundedShimmerView;
        RoundedShimmerView roundedShimmerView2 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView2.setId(View.generateViewId());
        roundedShimmerView2.setLayoutParams(new ConstraintLayout.b(px5, px));
        roundedShimmerView2.setCornerRadius(radius16);
        addView(roundedShimmerView2);
        this.filterShimmer2 = roundedShimmerView2;
        RoundedShimmerView roundedShimmerView3 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView3.setId(View.generateViewId());
        roundedShimmerView3.setLayoutParams(new ConstraintLayout.b(px4, px));
        roundedShimmerView3.setCornerRadius(radius16);
        addView(roundedShimmerView3);
        this.filterShimmer3 = roundedShimmerView3;
        RoundedShimmerView roundedShimmerView4 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView4.setId(View.generateViewId());
        roundedShimmerView4.setLayoutParams(new ConstraintLayout.b(px3, margin16));
        addView(roundedShimmerView4);
        this.textShimmer1 = roundedShimmerView4;
        RoundedShimmerView roundedShimmerView5 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView5.setId(View.generateViewId());
        roundedShimmerView5.setLayoutParams(new ConstraintLayout.b(px2, margin16));
        addView(roundedShimmerView5);
        this.textShimmer2 = roundedShimmerView5;
        setupRoot();
        setupConstraints();
    }

    private final void setupConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new ToursSearchResultFiltersPlaceholderView$setupConstraints$1(this));
    }

    private final void setupRoot() {
        int i11 = this.dp16;
        setPadding(0, i11, 0, i11);
        RoundedBackgroundProducer roundedBackgroundProducer = new RoundedBackgroundProducer();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int themeColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        float f7 = this.bgRadius;
        setBackground(RoundedBackgroundProducer.produce$default(roundedBackgroundProducer, themeColor, 0.0f, 0.0f, f7, f7, 6, null));
    }
}
