package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPagePriceMobile.v1.view;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProviderKt;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.app.android.travel.utils.extensions.ViewExtensionsKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPagePriceMobile/v1/view/HotelsPagePriceMobileLoaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dimensProvider", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "dp16", "", "dp14", "dp4", "radius4", "", "radius16", "titlePlaceholder", "Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "starsPlaceholder", "badgesPlaceholder", "starsDetailsBadgePlaceholder", "placeViews", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsPagePriceMobileLoaderView extends ConstraintLayout {
    public static final int $stable = RoundedShimmerView.$stable | DesignSystemDimensProvider.$stable;

    @NotNull
    private final RoundedShimmerView badgesPlaceholder;

    @NotNull
    private final DesignSystemDimensProvider dimensProvider;
    private final int dp14;
    private final int dp16;
    private final int dp4;
    private final float radius16;
    private final float radius4;

    @NotNull
    private final RoundedShimmerView starsDetailsBadgePlaceholder;

    @NotNull
    private final RoundedShimmerView starsPlaceholder;

    @NotNull
    private final RoundedShimmerView titlePlaceholder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsPagePriceMobileLoaderView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        DesignSystemDimensProvider dimens$default = DesignSystemDimensProviderKt.dimens$default(context, null, 1, null);
        this.dimensProvider = dimens$default;
        int margin16 = dimens$default.getMargin16();
        this.dp16 = margin16;
        int margin14 = dimens$default.getMargin14();
        this.dp14 = margin14;
        this.dp4 = dimens$default.getMargin4();
        float radius4 = dimens$default.getRadius4();
        this.radius4 = radius4;
        float radius16 = dimens$default.getRadius16();
        this.radius16 = radius16;
        RoundedShimmerView roundedShimmerView = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView.setId(View.generateViewId());
        roundedShimmerView.setLayoutParams(new ConstraintLayout.b(UiExtKt.toPx(177), UiExtKt.toPx(20)));
        roundedShimmerView.setCornerRadius(radius4);
        addView(roundedShimmerView);
        this.titlePlaceholder = roundedShimmerView;
        RoundedShimmerView roundedShimmerView2 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView2.setId(View.generateViewId());
        roundedShimmerView2.setLayoutParams(new ConstraintLayout.b(UiExtKt.toPx(116), UiExtKt.toPx(20)));
        roundedShimmerView2.setCornerRadius(radius4);
        addView(roundedShimmerView2);
        this.starsPlaceholder = roundedShimmerView2;
        RoundedShimmerView roundedShimmerView3 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView3.setId(View.generateViewId());
        roundedShimmerView3.setLayoutParams(new ConstraintLayout.b(UiExtKt.toPx(202), UiExtKt.toPx(16)));
        roundedShimmerView3.setCornerRadius(radius4);
        addView(roundedShimmerView3);
        this.badgesPlaceholder = roundedShimmerView3;
        RoundedShimmerView roundedShimmerView4 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView4.setId(View.generateViewId());
        roundedShimmerView4.setLayoutParams(new ConstraintLayout.b(UiExtKt.toPx(78), UiExtKt.toPx(16)));
        roundedShimmerView4.setCornerRadius(radius4);
        addView(roundedShimmerView4);
        this.starsDetailsBadgePlaceholder = roundedShimmerView4;
        setPadding(margin16, margin14, margin16, margin14);
        ViewExtensionsKt.applyRoundedOutline(this, radius16);
        placeViews();
    }

    private final void placeViews() {
        d dVar = new d();
        dVar.p(this);
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.titlePlaceholder);
        ConstraintLayoutExtensionsKt.topToParent(dVar, this.titlePlaceholder);
        ConstraintLayoutExtensionsKt.endToParent(dVar, this.starsPlaceholder);
        ConstraintLayoutExtensionsKt.topToTop(dVar, this.starsPlaceholder, this.titlePlaceholder);
        ConstraintLayoutExtensionsKt.bottomToBottom(dVar, this.starsPlaceholder, this.titlePlaceholder);
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.badgesPlaceholder);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, this.badgesPlaceholder, this.titlePlaceholder, this.dp4);
        ConstraintLayoutExtensionsKt.endToParent(dVar, this.starsDetailsBadgePlaceholder);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, this.starsDetailsBadgePlaceholder, this.starsPlaceholder, this.dp4);
        dVar.f(this);
    }
}
