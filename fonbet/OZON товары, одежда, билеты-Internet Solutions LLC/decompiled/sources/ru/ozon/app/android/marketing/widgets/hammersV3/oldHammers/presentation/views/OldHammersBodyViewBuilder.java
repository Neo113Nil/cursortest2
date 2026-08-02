package ru.ozon.app.android.marketing.widgets.hammersV3.oldHammers.presentation.views;

import android.content.Context;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.app.android.product.imagesswipeview.AdultImageView;
import ru.ozon.app.android.uikit.view.atoms.flashsale.StockBarView;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\"\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/presentation/views/OldHammersBodyViewBuilder;", "", "<init>", "()V", "dp2", "", "dp4", "dp5", "dp6", "dp10", "buildText", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "container", "Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/presentation/views/OldHammersBodyView;", "viewId", "viewTopMargin", "buildPrice", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "buildPriceWithDiscount", "buildStockBar", "Lru/ozon/app/android/uikit/view/atoms/flashsale/StockBarView;", "context", "Landroid/content/Context;", "placeStockBar", "buildMainIv", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView;", "buildOverlayImage", "Landroidx/appcompat/widget/AppCompatImageView;", "buildBadge", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getLpMatchWrap", "Landroid/view/ViewGroup$MarginLayoutParams;", "createPriceAtomView", "createAdultImageView", "createAppCompatImageView", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OldHammersBodyViewBuilder {

    @NotNull
    public static final OldHammersBodyViewBuilder INSTANCE = new OldHammersBodyViewBuilder();
    private static final int dp2 = ResourceExtKt.toPx(2);
    private static final int dp4 = ResourceExtKt.toPx(4);
    private static final int dp5 = ResourceExtKt.toPx(5);
    private static final int dp6 = ResourceExtKt.toPx(6);
    private static final int dp10 = ResourceExtKt.toPx(10);

    private OldHammersBodyViewBuilder() {
    }

    public static /* synthetic */ TextAtomView buildText$default(OldHammersBodyViewBuilder oldHammersBodyViewBuilder, OldHammersBodyView oldHammersBodyView, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i12 = 0;
        }
        return oldHammersBodyViewBuilder.buildText(oldHammersBodyView, i11, i12);
    }

    private final AdultImageView createAdultImageView(Context context) {
        AdultImageView adultImageView = (AdultImageView) q.f64554a.i(N.b(AdultImageView.class), context);
        return adultImageView == null ? new AdultImageView(context, null, 0, 6, null) : adultImageView;
    }

    private final AppCompatImageView createAppCompatImageView(Context context) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) q.f64554a.i(N.b(AppCompatImageView.class), context);
        return appCompatImageView == null ? new AppCompatImageView(context) : appCompatImageView;
    }

    private final PriceAtomView createPriceAtomView(Context context) {
        PriceAtomView priceAtomView = (PriceAtomView) q.f64554a.i(N.b(PriceAtomView.class), context);
        return priceAtomView == null ? new PriceAtomView(context, null, 0, 6, null) : priceAtomView;
    }

    private final ViewGroup.MarginLayoutParams getLpMatchWrap() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @NotNull
    public final BadgeView buildBadge(@NotNull OldHammersBodyView container) {
        Intrinsics.checkNotNullParameter(container, "container");
        q qVar = q.f64554a;
        d b11 = N.b(BadgeView.class);
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BadgeView badgeView = (BadgeView) qVar.g(b11, context);
        badgeView.setId(R$id.bottomBadge);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int i11 = dp4;
        marginLayoutParams.leftMargin = i11;
        marginLayoutParams.rightMargin = i11;
        marginLayoutParams.topMargin = i11;
        marginLayoutParams.bottomMargin = i11;
        container.addView(badgeView, marginLayoutParams);
        return badgeView;
    }

    @NotNull
    public final AdultImageView buildMainIv(@NotNull OldHammersBodyView container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AdultImageView createAdultImageView = createAdultImageView(context);
        createAdultImageView.setId(R$id.hammerBodyImageIv);
        ViewGroup.MarginLayoutParams lpMatchWrap = getLpMatchWrap();
        int i11 = dp5;
        lpMatchWrap.leftMargin = i11;
        lpMatchWrap.rightMargin = i11;
        container.addView(createAdultImageView, lpMatchWrap);
        return createAdultImageView;
    }

    @NotNull
    public final AppCompatImageView buildOverlayImage(@NotNull OldHammersBodyView container) {
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
    public final PriceAtomView buildPrice(@NotNull OldHammersBodyView container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        PriceAtomView createPriceAtomView = createPriceAtomView(context);
        createPriceAtomView.setId(R$id.hammerPrice);
        ViewGroup.MarginLayoutParams lpMatchWrap = getLpMatchWrap();
        lpMatchWrap.topMargin = dp2;
        int i11 = dp10;
        lpMatchWrap.leftMargin = i11;
        lpMatchWrap.rightMargin = i11;
        container.addView(createPriceAtomView, lpMatchWrap);
        return createPriceAtomView;
    }

    @NotNull
    public final PriceAtomView buildPriceWithDiscount(@NotNull OldHammersBodyView container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        PriceAtomView createPriceAtomView = createPriceAtomView(context);
        createPriceAtomView.setId(R$id.hammerDiscount);
        ViewGroup.MarginLayoutParams lpMatchWrap = getLpMatchWrap();
        lpMatchWrap.topMargin = dp2;
        int i11 = dp10;
        lpMatchWrap.leftMargin = i11;
        lpMatchWrap.rightMargin = i11;
        container.addView(createPriceAtomView, lpMatchWrap);
        return createPriceAtomView;
    }

    @NotNull
    public final StockBarView buildStockBar(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new StockBarView(context, null, 0, 6, null);
    }

    @NotNull
    public final TextAtomView buildText(@NotNull OldHammersBodyView container, int viewId, int viewTopMargin) {
        Intrinsics.checkNotNullParameter(container, "container");
        q qVar = q.f64554a;
        d b11 = N.b(TextAtomView.class);
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomView textAtomView = (TextAtomView) qVar.g(b11, context);
        textAtomView.setId(viewId);
        ViewGroup.MarginLayoutParams lpMatchWrap = getLpMatchWrap();
        lpMatchWrap.topMargin = viewTopMargin;
        int i11 = dp10;
        lpMatchWrap.leftMargin = i11;
        lpMatchWrap.rightMargin = i11;
        container.addView(textAtomView, lpMatchWrap);
        return textAtomView;
    }

    @NotNull
    public final StockBarView placeStockBar(@NotNull OldHammersBodyView container) {
        Intrinsics.checkNotNullParameter(container, "container");
        StockBarView stockBarView = (StockBarView) q.f64554a.i(N.b(StockBarView.class), container.getContext());
        if (stockBarView == null) {
            Context context = container.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            stockBarView = buildStockBar(context);
            stockBarView.setId(R$id.hammerStockBar);
        }
        ViewGroup.MarginLayoutParams lpMatchWrap = getLpMatchWrap();
        lpMatchWrap.topMargin = dp6;
        int i11 = dp10;
        lpMatchWrap.leftMargin = i11;
        lpMatchWrap.rightMargin = i11;
        container.addView(stockBarView, lpMatchWrap);
        return stockBarView;
    }
}
