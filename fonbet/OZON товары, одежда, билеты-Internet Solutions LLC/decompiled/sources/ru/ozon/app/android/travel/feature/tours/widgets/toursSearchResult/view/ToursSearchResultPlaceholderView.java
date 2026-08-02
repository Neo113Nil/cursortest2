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

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020&H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/view/ToursSearchResultPlaceholderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dsProvider", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "dp8", "", "dp16", "dp20", "dp24", "dp26", "dp40", "dp78", "dp96", "dp128", "dp164", "dp168", "dp194", "dp240", "dpf4", "", "dpf12", "dpf20", "galleryShimmer", "Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "titleShimmer1", "titleShimmer2", "descriptionShimmer", "badgeShimmer1", "badgeShimmer2", "badgeShimmer3", "optionShimmer1", "optionShimmer2", "priceShimmer", "setupRoot", "", "setupConstraints", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ToursSearchResultPlaceholderView extends ConstraintLayout {
    public static final int $stable = RoundedShimmerView.$stable | DesignSystemDimensProvider.$stable;

    @NotNull
    private final RoundedShimmerView badgeShimmer1;

    @NotNull
    private final RoundedShimmerView badgeShimmer2;

    @NotNull
    private final RoundedShimmerView badgeShimmer3;

    @NotNull
    private final RoundedShimmerView descriptionShimmer;
    private final int dp128;
    private final int dp16;
    private final int dp164;
    private final int dp168;
    private final int dp194;
    private final int dp20;
    private final int dp24;
    private final int dp240;
    private final int dp26;
    private final int dp40;
    private final int dp78;
    private final int dp8;
    private final int dp96;
    private final float dpf12;
    private final float dpf20;
    private final float dpf4;

    @NotNull
    private final DesignSystemDimensProvider dsProvider;

    @NotNull
    private final RoundedShimmerView galleryShimmer;

    @NotNull
    private final RoundedShimmerView optionShimmer1;

    @NotNull
    private final RoundedShimmerView optionShimmer2;

    @NotNull
    private final RoundedShimmerView priceShimmer;

    @NotNull
    private final RoundedShimmerView titleShimmer1;

    @NotNull
    private final RoundedShimmerView titleShimmer2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToursSearchResultPlaceholderView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        DesignSystemDimensProvider dimens$default = DesignSystemDimensProviderKt.dimens$default(context, null, 1, null);
        this.dsProvider = dimens$default;
        this.dp8 = dimens$default.getMargin8();
        this.dp16 = dimens$default.getMargin16();
        int margin20 = dimens$default.getMargin20();
        this.dp20 = margin20;
        int margin24 = dimens$default.getMargin24();
        this.dp24 = margin24;
        int px = ResourceExtKt.toPx(26, context);
        this.dp26 = px;
        int px2 = ResourceExtKt.toPx(40, context);
        this.dp40 = px2;
        int px3 = ResourceExtKt.toPx(78, context);
        this.dp78 = px3;
        int px4 = ResourceExtKt.toPx(96, context);
        this.dp96 = px4;
        int px5 = ResourceExtKt.toPx(UserVerificationMethods.USER_VERIFY_PATTERN, context);
        this.dp128 = px5;
        int px6 = ResourceExtKt.toPx(164, context);
        this.dp164 = px6;
        int px7 = ResourceExtKt.toPx(168, context);
        this.dp168 = px7;
        int px8 = ResourceExtKt.toPx(194, context);
        this.dp194 = px8;
        int px9 = ResourceExtKt.toPx(240, context);
        this.dp240 = px9;
        float radius4 = dimens$default.getRadius4();
        this.dpf4 = radius4;
        float radius12 = dimens$default.getRadius12();
        this.dpf12 = radius12;
        this.dpf20 = dimens$default.getRadius20();
        RoundedShimmerView roundedShimmerView = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView.setId(View.generateViewId());
        roundedShimmerView.setLayoutParams(new ConstraintLayout.b(0, px6));
        roundedShimmerView.setCornerRadius(radius12);
        addView(roundedShimmerView);
        this.galleryShimmer = roundedShimmerView;
        RoundedShimmerView roundedShimmerView2 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView2.setId(View.generateViewId());
        roundedShimmerView2.setLayoutParams(new ConstraintLayout.b(px7, margin24));
        addView(roundedShimmerView2);
        this.titleShimmer1 = roundedShimmerView2;
        RoundedShimmerView roundedShimmerView3 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView3.setId(View.generateViewId());
        roundedShimmerView3.setLayoutParams(new ConstraintLayout.b(px9, margin24));
        addView(roundedShimmerView3);
        this.titleShimmer2 = roundedShimmerView3;
        RoundedShimmerView roundedShimmerView4 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView4.setId(View.generateViewId());
        roundedShimmerView4.setLayoutParams(new ConstraintLayout.b(0, px2));
        addView(roundedShimmerView4);
        this.descriptionShimmer = roundedShimmerView4;
        RoundedShimmerView roundedShimmerView5 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView5.setId(View.generateViewId());
        roundedShimmerView5.setLayoutParams(new ConstraintLayout.b(px4, margin20));
        addView(roundedShimmerView5);
        this.badgeShimmer1 = roundedShimmerView5;
        RoundedShimmerView roundedShimmerView6 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView6.setId(View.generateViewId());
        roundedShimmerView6.setLayoutParams(new ConstraintLayout.b(px4, margin20));
        addView(roundedShimmerView6);
        this.badgeShimmer2 = roundedShimmerView6;
        RoundedShimmerView roundedShimmerView7 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView7.setId(View.generateViewId());
        roundedShimmerView7.setLayoutParams(new ConstraintLayout.b(px3, margin20));
        addView(roundedShimmerView7);
        this.badgeShimmer3 = roundedShimmerView7;
        RoundedShimmerView roundedShimmerView8 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView8.setId(View.generateViewId());
        roundedShimmerView8.setLayoutParams(new ConstraintLayout.b(px5, margin20));
        addView(roundedShimmerView8);
        this.optionShimmer1 = roundedShimmerView8;
        RoundedShimmerView roundedShimmerView9 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView9.setId(View.generateViewId());
        roundedShimmerView9.setLayoutParams(new ConstraintLayout.b(px3, margin20));
        addView(roundedShimmerView9);
        this.optionShimmer2 = roundedShimmerView9;
        RoundedShimmerView roundedShimmerView10 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView10.setId(View.generateViewId());
        roundedShimmerView10.setLayoutParams(new ConstraintLayout.b(px8, px));
        roundedShimmerView10.setCornerRadius(radius4);
        addView(roundedShimmerView10);
        this.priceShimmer = roundedShimmerView10;
        setupRoot();
        setupConstraints();
    }

    private final void setupConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new ToursSearchResultPlaceholderView$setupConstraints$1(this));
    }

    private final void setupRoot() {
        int i11 = this.dp16;
        setPadding(i11, i11, i11, i11);
        RoundedBackgroundProducer roundedBackgroundProducer = new RoundedBackgroundProducer();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackground(roundedBackgroundProducer.produce(ThemeExtKt.themeColor(context, R$attr.layerFloor1), this.dpf20));
    }
}
