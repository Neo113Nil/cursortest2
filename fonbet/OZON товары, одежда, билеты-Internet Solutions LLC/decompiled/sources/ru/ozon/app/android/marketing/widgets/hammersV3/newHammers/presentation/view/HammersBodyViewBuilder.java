package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.view;

import android.content.Context;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.app.android.product.imagesswipeview.AdultImageView;
import ru.ozon.app.android.uikit.view.atoms.flashsale.StockBarView;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000eJ\u0016\u0010\u0012\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000eJ\u0016\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000eJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010$\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010%\u001a\u00020\t2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010&\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010'\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/view/HammersBodyViewBuilder;", "", "<init>", "()V", "dp2", "", "dp4", "dp8", "buildTopText", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "container", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/view/HammersBodyView;", "buildMiddleText", "hasDiscount", "", "buildPrice", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "hasMiddleText", "buildPriceWithDiscount", "hasTopText", "buildLabel", "hasPrice", "placeStockBar", "Lru/ozon/app/android/uikit/view/atoms/flashsale/StockBarView;", "buildMainIv", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView;", "buildOverlayImage", "Landroidx/appcompat/widget/AppCompatImageView;", "buildBadge", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getLpMatchWrap", "Landroid/view/ViewGroup$MarginLayoutParams;", "createStockBar", "context", "Landroid/content/Context;", "createBadgeView", "createPriceAtomView", "createTextAtomV2View", "createAdultImageView", "createAppCompatImageView", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HammersBodyViewBuilder {

    @NotNull
    public static final HammersBodyViewBuilder INSTANCE = new HammersBodyViewBuilder();
    private static final int dp2 = UiExtKt.toPx(2);
    private static final int dp4 = UiExtKt.toPx(4);
    private static final int dp8 = UiExtKt.toPx(8);

    private HammersBodyViewBuilder() {
    }

    private final AdultImageView createAdultImageView(Context context) {
        AdultImageView adultImageView = (AdultImageView) q.f64554a.i(N.b(AdultImageView.class), context);
        return adultImageView == null ? new AdultImageView(context, null, 0, 6, null) : adultImageView;
    }

    private final AppCompatImageView createAppCompatImageView(Context context) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) q.f64554a.i(N.b(AppCompatImageView.class), context);
        return appCompatImageView == null ? new AppCompatImageView(context) : appCompatImageView;
    }

    private final BadgeView createBadgeView(Context context) {
        return (BadgeView) q.f64554a.g(N.b(BadgeView.class), context);
    }

    private final PriceAtomView createPriceAtomView(Context context) {
        PriceAtomView priceAtomView = (PriceAtomView) q.f64554a.i(N.b(PriceAtomView.class), context);
        return priceAtomView == null ? new PriceAtomView(context, null, 0, 6, null) : priceAtomView;
    }

    private final StockBarView createStockBar(Context context) {
        StockBarView stockBarView = (StockBarView) q.f64554a.i(N.b(StockBarView.class), context);
        return stockBarView == null ? new StockBarView(context, null, 0, 6, null) : stockBarView;
    }

    private final TextAtomV2View createTextAtomV2View(Context context) {
        TextAtomV2View textAtomV2View = (TextAtomV2View) q.f64554a.i(N.b(TextAtomV2View.class), context);
        if (textAtomV2View == null) {
            textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        }
        textAtomV2View.setFocusable(false);
        textAtomV2View.setFocusableInTouchMode(false);
        textAtomV2View.setClickable(false);
        textAtomV2View.setMovementMethod(null);
        return textAtomV2View;
    }

    private final ViewGroup.MarginLayoutParams getLpMatchWrap() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @NotNull
    public final BadgeView buildBadge(@NotNull HammersBodyView container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BadgeView createBadgeView = createBadgeView(context);
        createBadgeView.setId(R$id.bottomBadge);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int i11 = dp4;
        marginLayoutParams.leftMargin = i11;
        marginLayoutParams.rightMargin = i11;
        marginLayoutParams.topMargin = i11;
        marginLayoutParams.bottomMargin = i11;
        container.addView(createBadgeView, marginLayoutParams);
        return createBadgeView;
    }

    @NotNull
    public final TextAtomV2View buildLabel(@NotNull HammersBodyView container, boolean hasPrice) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View createTextAtomV2View = createTextAtomV2View(context);
        createTextAtomV2View.setId(R$id.hammerLabel);
        ViewGroup.MarginLayoutParams lpMatchWrap = getLpMatchWrap();
        lpMatchWrap.topMargin = hasPrice ? dp2 : 0;
        int i11 = dp4;
        lpMatchWrap.leftMargin = i11;
        lpMatchWrap.rightMargin = i11;
        container.addView(createTextAtomV2View, lpMatchWrap);
        return createTextAtomV2View;
    }

    @NotNull
    public final AdultImageView buildMainIv(@NotNull HammersBodyView container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AdultImageView createAdultImageView = createAdultImageView(context);
        createAdultImageView.setId(R$id.hammerBodyImageIv);
        ViewGroup.MarginLayoutParams lpMatchWrap = getLpMatchWrap();
        lpMatchWrap.bottomMargin = dp8;
        container.addView(createAdultImageView, lpMatchWrap);
        return createAdultImageView;
    }

    @NotNull
    public final TextAtomV2View buildMiddleText(@NotNull HammersBodyView container, boolean hasDiscount) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View createTextAtomV2View = createTextAtomV2View(context);
        createTextAtomV2View.setId(R$id.hammerTextMiddle);
        ViewGroup.MarginLayoutParams lpMatchWrap = getLpMatchWrap();
        lpMatchWrap.topMargin = hasDiscount ? dp2 : 0;
        int i11 = dp4;
        lpMatchWrap.leftMargin = i11;
        lpMatchWrap.rightMargin = i11;
        container.addView(createTextAtomV2View, lpMatchWrap);
        return createTextAtomV2View;
    }

    @NotNull
    public final AppCompatImageView buildOverlayImage(@NotNull HammersBodyView container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AppCompatImageView createAppCompatImageView = createAppCompatImageView(context);
        createAppCompatImageView.setId(R$id.overlayImage);
        createAppCompatImageView.setVisibility(8);
        container.addView(createAppCompatImageView, new ViewGroup.MarginLayoutParams(-1, -1));
        return createAppCompatImageView;
    }

    @NotNull
    public final PriceAtomView buildPrice(@NotNull HammersBodyView container, boolean hasMiddleText) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        PriceAtomView createPriceAtomView = createPriceAtomView(context);
        createPriceAtomView.setId(R$id.hammerPrice);
        ViewGroup.MarginLayoutParams lpMatchWrap = getLpMatchWrap();
        lpMatchWrap.topMargin = hasMiddleText ? dp2 : 0;
        int i11 = dp4;
        lpMatchWrap.leftMargin = i11;
        lpMatchWrap.rightMargin = i11;
        container.addView(createPriceAtomView, lpMatchWrap);
        return createPriceAtomView;
    }

    @NotNull
    public final PriceAtomView buildPriceWithDiscount(@NotNull HammersBodyView container, boolean hasTopText) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        PriceAtomView createPriceAtomView = createPriceAtomView(context);
        createPriceAtomView.setId(R$id.hammerDiscount);
        ViewGroup.MarginLayoutParams lpMatchWrap = getLpMatchWrap();
        lpMatchWrap.topMargin = hasTopText ? dp2 : 0;
        int i11 = dp4;
        lpMatchWrap.leftMargin = i11;
        lpMatchWrap.rightMargin = i11;
        container.addView(createPriceAtomView, lpMatchWrap);
        return createPriceAtomView;
    }

    @NotNull
    public final TextAtomV2View buildTopText(@NotNull HammersBodyView container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View createTextAtomV2View = createTextAtomV2View(context);
        createTextAtomV2View.setId(R$id.hammerTextTop);
        ViewGroup.MarginLayoutParams lpMatchWrap = getLpMatchWrap();
        int i11 = dp4;
        lpMatchWrap.leftMargin = i11;
        lpMatchWrap.rightMargin = i11;
        container.addView(createTextAtomV2View, lpMatchWrap);
        return createTextAtomV2View;
    }

    @NotNull
    public final StockBarView placeStockBar(@NotNull HammersBodyView container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        StockBarView createStockBar = createStockBar(context);
        createStockBar.setId(R$id.hammerStockBar);
        ViewGroup.MarginLayoutParams lpMatchWrap = getLpMatchWrap();
        lpMatchWrap.topMargin = dp2;
        int i11 = dp4;
        lpMatchWrap.leftMargin = i11;
        lpMatchWrap.rightMargin = i11;
        container.addView(createStockBar, lpMatchWrap);
        return createStockBar;
    }
}
