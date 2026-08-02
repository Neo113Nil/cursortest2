package ru.ozon.app.android.marketing.widgets.hammersV3.oldHammers.presentation.binders;

import android.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.stock.StockBar;
import ru.ozon.app.android.atoms.v3.flashsale.StockBarHolderKt;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.marketing.widgets.hammersV3.oldHammers.presentation.model.OldHammersV3BodyVO;
import ru.ozon.app.android.marketing.widgets.hammersV3.oldHammers.presentation.model.OldHammersV3ProductInfoVO;
import ru.ozon.app.android.marketing.widgets.hammersV3.oldHammers.presentation.views.OldHammersBodyView;
import ru.ozon.app.android.marketing.widgets.hammersV3.oldHammers.presentation.views.OldHammersBodyViewBuilder;
import ru.ozon.app.android.uikit.view.atoms.flashsale.StockBarView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0002\b\u00030\u0012j\u0006\u0012\u0002\b\u0003`\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0003¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/presentation/binders/OldHammersProductInfoBinder;", "Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/presentation/binders/OldHammerProductPropertyBinder;", "<init>", "()V", "Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/presentation/model/OldHammersV3ProductInfoVO$PlaceholderVO;", HammersV3BodyDTO.PLACEHOLDER, "", "bindPlaceholder", "(Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/presentation/model/OldHammersV3ProductInfoVO$PlaceholderVO;)V", "Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/presentation/model/OldHammersV3ProductInfoVO$HammerPriceVO;", "priceInfo", "bindPriceInfo", "(Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/presentation/model/OldHammersV3ProductInfoVO$HammerPriceVO;)V", "Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/presentation/model/OldHammersV3BodyVO;", "hammerProduct", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holder", "bind", "(Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/presentation/model/OldHammersV3BodyVO;Ll20/d;Lru/ozon/composer/ui/widget/k;)V", "recycle", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OldHammersProductInfoBinder extends OldHammerProductPropertyBinder {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int dp2 = ResourceExtKt.toPx(2);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/presentation/binders/OldHammersProductInfoBinder$Companion;", "", "<init>", "()V", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final void bindPlaceholder(OldHammersV3ProductInfoVO.PlaceholderVO placeholder) {
        OldHammersBodyView oldHammersBodyView;
        OldHammersBodyView oldHammersBodyView2;
        OldHammersBodyView oldHammersBodyView3;
        boolean z11 = (placeholder != null ? placeholder.getDiscountPlaceholder() : null) != null;
        OldHammersBodyView rootView = getRootView();
        TextAtomView discountPlaceholder = rootView != null ? rootView.getDiscountPlaceholder() : null;
        if (z11 && discountPlaceholder == null) {
            oldHammersBodyView3 = ((OldHammerProductPropertyBinder) this).rootView;
            discountPlaceholder = oldHammersBodyView3 != null ? OldHammersBodyViewBuilder.INSTANCE.buildText(oldHammersBodyView3, R$id.discountPlaceholder, dp2) : null;
        }
        OldHammersBodyView rootView2 = getRootView();
        if (rootView2 != null) {
            rootView2.setDiscountPlaceholder(discountPlaceholder);
        }
        if (discountPlaceholder != null) {
            TextAtomHolderKt.bindOrGone$default(discountPlaceholder, placeholder != null ? placeholder.getDiscountPlaceholder() : null, null, 2, null);
        }
        boolean z12 = (placeholder != null ? placeholder.getText() : null) != null;
        OldHammersBodyView rootView3 = getRootView();
        TextAtomView textPlaceholder = rootView3 != null ? rootView3.getTextPlaceholder() : null;
        if (z12 && textPlaceholder == null) {
            oldHammersBodyView2 = ((OldHammerProductPropertyBinder) this).rootView;
            textPlaceholder = oldHammersBodyView2 != null ? OldHammersBodyViewBuilder.INSTANCE.buildText(oldHammersBodyView2, R$id.textPlaceholder, dp2) : null;
        }
        OldHammersBodyView rootView4 = getRootView();
        if (rootView4 != null) {
            rootView4.setTextPlaceholder(textPlaceholder);
        }
        if (textPlaceholder != null) {
            TextAtomHolderKt.bindOrGone$default(textPlaceholder, placeholder != null ? placeholder.getText() : null, null, 2, null);
        }
        boolean z13 = (placeholder != null ? placeholder.getPricePlaceholder() : null) != null;
        OldHammersBodyView rootView5 = getRootView();
        TextAtomView pricePlaceholder = rootView5 != null ? rootView5.getPricePlaceholder() : null;
        if (z13 && pricePlaceholder == null) {
            oldHammersBodyView = ((OldHammerProductPropertyBinder) this).rootView;
            pricePlaceholder = oldHammersBodyView != null ? OldHammersBodyViewBuilder.buildText$default(OldHammersBodyViewBuilder.INSTANCE, oldHammersBodyView, R$id.pricePlaceholder, 0, 4, null) : null;
        }
        OldHammersBodyView rootView6 = getRootView();
        if (rootView6 != null) {
            rootView6.setPricePlaceholder(pricePlaceholder);
        }
        if (pricePlaceholder != null) {
            TextAtomHolderKt.bindOrGone$default(pricePlaceholder, placeholder != null ? placeholder.getPricePlaceholder() : null, null, 2, null);
        }
    }

    private final void bindPriceInfo(OldHammersV3ProductInfoVO.HammerPriceVO priceInfo) {
        StockBar stockBar;
        StockBar stockBar2;
        OldHammersBodyView oldHammersBodyView;
        OldHammersBodyView oldHammersBodyView2;
        OldHammersBodyView oldHammersBodyView3;
        OldHammersBodyView oldHammersBodyView4;
        boolean z11 = (priceInfo != null ? priceInfo.getText() : null) != null;
        OldHammersBodyView rootView = getRootView();
        TextAtomView hammerText = rootView != null ? rootView.getHammerText() : null;
        if (z11 && hammerText == null) {
            oldHammersBodyView4 = ((OldHammerProductPropertyBinder) this).rootView;
            hammerText = oldHammersBodyView4 != null ? OldHammersBodyViewBuilder.INSTANCE.buildText(oldHammersBodyView4, R$id.hammerText, dp2) : null;
        }
        OldHammersBodyView rootView2 = getRootView();
        if (rootView2 != null) {
            rootView2.setHammerText(hammerText);
        }
        if (hammerText != null) {
            TextAtomHolderKt.bindOrGone$default(hammerText, priceInfo != null ? priceInfo.getText() : null, null, 2, null);
        }
        boolean z12 = (priceInfo != null ? priceInfo.getDiscount() : null) != null;
        OldHammersBodyView rootView3 = getRootView();
        PriceAtomView hammerDiscount = rootView3 != null ? rootView3.getHammerDiscount() : null;
        OldHammersBodyViewBuilder oldHammersBodyViewBuilder = OldHammersBodyViewBuilder.INSTANCE;
        if (z12 && hammerDiscount == null) {
            oldHammersBodyView3 = ((OldHammerProductPropertyBinder) this).rootView;
            hammerDiscount = oldHammersBodyView3 != null ? oldHammersBodyViewBuilder.buildPriceWithDiscount(oldHammersBodyView3) : null;
        }
        OldHammersBodyView rootView4 = getRootView();
        if (rootView4 != null) {
            rootView4.setHammerDiscount(hammerDiscount);
        }
        if (hammerDiscount != null) {
            PriceAtomHolderKt.bindOrGone$default(hammerDiscount, priceInfo != null ? priceInfo.getDiscount() : null, null, 2, null);
        }
        boolean z13 = (priceInfo != null ? priceInfo.getPrice() : null) != null;
        OldHammersBodyView rootView5 = getRootView();
        PriceAtomView hammerPrice = rootView5 != null ? rootView5.getHammerPrice() : null;
        if (z13 && hammerPrice == null) {
            oldHammersBodyView2 = ((OldHammerProductPropertyBinder) this).rootView;
            hammerPrice = oldHammersBodyView2 != null ? oldHammersBodyViewBuilder.buildPrice(oldHammersBodyView2) : null;
        }
        OldHammersBodyView rootView6 = getRootView();
        if (rootView6 != null) {
            rootView6.setHammerPrice(hammerPrice);
        }
        if (hammerPrice != null) {
            PriceAtomHolderKt.bindOrGone$default(hammerPrice, priceInfo != null ? priceInfo.getPrice() : null, null, 2, null);
        }
        boolean z14 = (priceInfo != null ? priceInfo.getStockBar() : null) != null;
        OldHammersBodyView rootView7 = getRootView();
        StockBarView hammerStockBar = rootView7 != null ? rootView7.getHammerStockBar() : null;
        if (z14 && hammerStockBar == null) {
            oldHammersBodyView = ((OldHammerProductPropertyBinder) this).rootView;
            hammerStockBar = oldHammersBodyView != null ? oldHammersBodyViewBuilder.placeStockBar(oldHammersBodyView) : null;
        }
        OldHammersBodyView rootView8 = getRootView();
        if (rootView8 != null) {
            rootView8.setHammerStockBar(hammerStockBar);
        }
        if (hammerStockBar != null) {
            if (priceInfo == null || (stockBar2 = priceInfo.getStockBar()) == null) {
                stockBar = null;
            } else {
                StyleParser styleParser = StyleParser.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(hammerStockBar.getContext(), "getContext(...)");
                stockBar = StockBar.copy$default(stockBar2, null, 0, null, null, null, null, Color.alpha(styleParser.parseColor(r5, stockBar2.getStockBarBackgroundColor(), UniColors.BG_ACCENT_PRIMARY.getResId())) / 255.0f, false, null, null, 959, null);
            }
            StockBarHolderKt.bindOrGone$default(hammerStockBar, stockBar, null, 2, null);
        }
    }

    @Override // ru.ozon.app.android.marketing.widgets.hammersV3.oldHammers.presentation.binders.OldHammerProductPropertyBinder
    public void bind(@NotNull OldHammersV3BodyVO hammerProduct, @NotNull d info, @NotNull k<?> holder) {
        Intrinsics.checkNotNullParameter(hammerProduct, "hammerProduct");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.bind(hammerProduct, info, holder);
        OldHammersV3ProductInfoVO productInfo = hammerProduct.getProductInfo();
        if (productInfo instanceof OldHammersV3ProductInfoVO.PlaceholderVO) {
            bindPlaceholder((OldHammersV3ProductInfoVO.PlaceholderVO) productInfo);
        } else if (productInfo instanceof OldHammersV3ProductInfoVO.HammerPriceVO) {
            bindPriceInfo((OldHammersV3ProductInfoVO.HammerPriceVO) productInfo);
        }
    }

    @Override // ru.ozon.app.android.marketing.widgets.hammersV3.oldHammers.presentation.binders.OldHammerProductPropertyBinder
    public void recycle() {
        bindPlaceholder(null);
        bindPriceInfo(null);
    }
}
