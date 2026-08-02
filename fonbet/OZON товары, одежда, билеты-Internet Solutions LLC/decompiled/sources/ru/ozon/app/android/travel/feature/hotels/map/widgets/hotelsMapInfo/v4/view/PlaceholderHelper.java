package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view;

import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.R$id;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder.ConstraintLayoutWithBorder;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020#2\u0006\u0010$\u001a\u00020%R\u0018\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/PlaceholderHelper;", "", "parent", "Lru/ozon/app/android/travel/utils/view/constraintLayoutWithBorder/ConstraintLayoutWithBorder;", "<init>", "(Lru/ozon/app/android/travel/utils/view/constraintLayoutWithBorder/ConstraintLayoutWithBorder;)V", "context", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "dp180", "", "dp152", "dp140", "dp130", "dp128", "dp114", "dp56", "dp24", "dp18", "dp20", "dp16", "dp8", "dp2", "dpf14", "", "dpf4", "hotelsMapInfoV4CardImageRsv", "Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "hotelsMapInfoV4CardFavoriteRsv", "hotelsMapInfoV4CardTitleRsv", "hotelsMapInfoV4CardRatingRsv", "hotelsMapInfoV4CardPriceRsv", "hotelsMapInfoV4CardMilesRsv", "toggleContentPlaceholder", "", "isVisible", "", "togglePricePlaceholder", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PlaceholderHelper {
    private final Context context;
    private final int dp114;
    private final int dp128;
    private final int dp130;
    private final int dp140;
    private final int dp152;
    private final int dp16;
    private final int dp18;
    private final int dp180;
    private final int dp2;
    private final int dp20;
    private final int dp24;
    private final int dp56;
    private final int dp8;
    private final float dpf14;
    private final float dpf4;

    @NotNull
    private final RoundedShimmerView hotelsMapInfoV4CardFavoriteRsv;

    @NotNull
    private final RoundedShimmerView hotelsMapInfoV4CardImageRsv;

    @NotNull
    private final RoundedShimmerView hotelsMapInfoV4CardMilesRsv;

    @NotNull
    private final RoundedShimmerView hotelsMapInfoV4CardPriceRsv;

    @NotNull
    private final RoundedShimmerView hotelsMapInfoV4CardRatingRsv;

    @NotNull
    private final RoundedShimmerView hotelsMapInfoV4CardTitleRsv;

    public PlaceholderHelper(@NotNull ConstraintLayoutWithBorder parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        this.context = context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int px = UiExtKt.toPx(180, context);
        this.dp180 = px;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int px2 = UiExtKt.toPx(152, context);
        this.dp152 = px2;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int px3 = UiExtKt.toPx(140, context);
        this.dp140 = px3;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int px4 = UiExtKt.toPx(130, context);
        this.dp130 = px4;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int px5 = UiExtKt.toPx(UserVerificationMethods.USER_VERIFY_PATTERN, context);
        this.dp128 = px5;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int px6 = UiExtKt.toPx(114, context);
        this.dp114 = px6;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int px7 = UiExtKt.toPx(56, context);
        this.dp56 = px7;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int px8 = UiExtKt.toPx(24, context);
        this.dp24 = px8;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int px9 = UiExtKt.toPx(18, context);
        this.dp18 = px9;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int px10 = UiExtKt.toPx(20, context);
        this.dp20 = px10;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int px11 = UiExtKt.toPx(16, context);
        this.dp16 = px11;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int px12 = UiExtKt.toPx(8, context);
        this.dp8 = px12;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int px13 = UiExtKt.toPx(2, context);
        this.dp2 = px13;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        float pxF = ResourceExtKt.toPxF(14, context);
        this.dpf14 = pxF;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        float pxF2 = ResourceExtKt.toPxF(4, context);
        this.dpf4 = pxF2;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        RoundedShimmerView roundedShimmerView = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView.setId(R$id.hotelsMapInfoV4CardImagesRsv);
        ConstraintLayout.b bVar = new ConstraintLayout.b(px4, px5);
        bVar.f41656t = 0;
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        bVar.setMarginStart(px13);
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = px13;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = px13;
        roundedShimmerView.setLayoutParams(bVar);
        roundedShimmerView.setVisibility(8);
        roundedShimmerView.setCornerRadius(pxF);
        parent.addView(roundedShimmerView);
        this.hotelsMapInfoV4CardImageRsv = roundedShimmerView;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        RoundedShimmerView roundedShimmerView2 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView2.setId(R$id.hotelsMapInfoV4CardFavoriteRsv);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(px8, px8);
        bVar2.f41658v = 0;
        bVar2.f41636i = 0;
        bVar2.setMarginEnd(px12);
        ((ViewGroup.MarginLayoutParams) bVar2).topMargin = px12;
        roundedShimmerView2.setLayoutParams(bVar2);
        roundedShimmerView2.setVisibility(8);
        roundedShimmerView2.setCornerRadius(pxF2);
        parent.addView(roundedShimmerView2);
        this.hotelsMapInfoV4CardFavoriteRsv = roundedShimmerView2;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        RoundedShimmerView roundedShimmerView3 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView3.setId(R$id.hotelsMapInfoV4CardTitleRsv);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(px, px10);
        bVar3.f41655s = R$id.hotelsMapInfoV4CardImagesRsv;
        bVar3.f41636i = 0;
        ((ViewGroup.MarginLayoutParams) bVar3).topMargin = px12;
        bVar3.setMarginStart(px12);
        roundedShimmerView3.setLayoutParams(bVar3);
        roundedShimmerView3.setVisibility(8);
        roundedShimmerView3.setCornerRadius(pxF2);
        parent.addView(roundedShimmerView3);
        this.hotelsMapInfoV4CardTitleRsv = roundedShimmerView3;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        RoundedShimmerView roundedShimmerView4 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView4.setId(R$id.hotelsMapInfoV4CardRatingRsv);
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(px6, px11);
        bVar4.f41655s = R$id.hotelsMapInfoV4CardImagesRsv;
        bVar4.f41638j = R$id.hotelsMapInfoV4CardTitleRsv;
        bVar4.setMarginStart(px12);
        ((ViewGroup.MarginLayoutParams) bVar4).topMargin = px13;
        roundedShimmerView4.setLayoutParams(bVar4);
        roundedShimmerView4.setVisibility(8);
        roundedShimmerView4.setCornerRadius(pxF2);
        parent.addView(roundedShimmerView4);
        this.hotelsMapInfoV4CardRatingRsv = roundedShimmerView4;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        RoundedShimmerView roundedShimmerView5 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView5.setId(R$id.hotelsMapInfoV4CardPriceRsv);
        ConstraintLayout.b bVar5 = new ConstraintLayout.b(px2, px9);
        int i11 = R$id.hotelsMapInfoV4CardMilesRsv;
        bVar5.f41640k = i11;
        bVar5.f41656t = i11;
        ((ViewGroup.MarginLayoutParams) bVar5).bottomMargin = px13;
        roundedShimmerView5.setLayoutParams(bVar5);
        roundedShimmerView5.setVisibility(8);
        roundedShimmerView5.setCornerRadius(pxF2);
        parent.addView(roundedShimmerView5);
        this.hotelsMapInfoV4CardPriceRsv = roundedShimmerView5;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        RoundedShimmerView roundedShimmerView6 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView6.setId(R$id.hotelsMapInfoV4CardMilesRsv);
        ConstraintLayout.b bVar6 = new ConstraintLayout.b(px7, px11);
        bVar6.f41642l = 0;
        bVar6.f41656t = 0;
        ((ViewGroup.MarginLayoutParams) bVar6).bottomMargin = px12;
        bVar6.setMarginStart(px3);
        roundedShimmerView6.setLayoutParams(bVar6);
        roundedShimmerView6.setVisibility(8);
        roundedShimmerView6.setCornerRadius(pxF2);
        parent.addView(roundedShimmerView6);
        this.hotelsMapInfoV4CardMilesRsv = roundedShimmerView6;
    }

    public final void toggleContentPlaceholder(boolean isVisible) {
        this.hotelsMapInfoV4CardImageRsv.setVisibility(isVisible ? 0 : 8);
        this.hotelsMapInfoV4CardFavoriteRsv.setVisibility(isVisible ? 0 : 8);
        this.hotelsMapInfoV4CardTitleRsv.setVisibility(isVisible ? 0 : 8);
        this.hotelsMapInfoV4CardRatingRsv.setVisibility(isVisible ? 0 : 8);
    }

    public final void togglePricePlaceholder(boolean isVisible) {
        this.hotelsMapInfoV4CardPriceRsv.setVisibility(isVisible ? 0 : 8);
        this.hotelsMapInfoV4CardMilesRsv.setVisibility(isVisible ? 0 : 8);
    }
}
