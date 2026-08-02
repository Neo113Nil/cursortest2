package ru.ozon.uni.core.repository;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.models.UniGradientToken;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bJ\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0012\u0010\u0003\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0012\u0010\u0010\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0012\u0010\u0012\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005R\u0012\u0010\u0014\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0005R\u0012\u0010\u0016\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0005R\u0012\u0010\u0018\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0005R\u0012\u0010\u001a\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0005R\u0012\u0010\u001c\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0005R\u0012\u0010\u001e\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0005R\u0012\u0010 \u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0005R\u0012\u0010\"\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0005R\u0012\u0010$\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0005R\u0012\u0010&\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0005R\u0012\u0010(\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0005R\u0012\u0010*\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0005R\u0012\u0010,\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0005R\u0012\u0010.\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0005R\u0012\u00100\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0005R\u0012\u00102\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0005R\u0012\u00104\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0005R\u0012\u00106\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0005R\u0012\u00108\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u0005R\u0012\u0010:\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0005R\u0012\u0010<\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u0005R\u0012\u0010>\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u0005R\u0012\u0010@\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\u0005R\u0012\u0010B\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\u0005R\u0012\u0010D\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\u0005R\u0012\u0010F\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\u0005R\u0012\u0010H\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010\u0005R\u0012\u0010J\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u0005¨\u0006L"}, d2 = {"Lru/ozon/uni/core/repository/UniGradientTokenRepository;", "Lru/ozon/uni/core/repository/UniTokenRepository;", "Lru/ozon/uni/core/models/UniGradientToken;", "grDelivery", "getGrDelivery", "()Lru/ozon/uni/core/models/UniGradientToken;", "grFadeHorizontalFloor1", "getGrFadeHorizontalFloor1", "grFavouritePromoBanner", "getGrFavouritePromoBanner", "grFavouritePromoFade", "getGrFavouritePromoFade", "grFresh", "getGrFresh", "grFreshSkuScroll", "getGrFreshSkuScroll", "grGift", "getGrGift", "grHighDemandDelivery", "getGrHighDemandDelivery", "grLikezonExpressPrimary", "getGrLikezonExpressPrimary", "grLikezonExpressSecondary", "getGrLikezonExpressSecondary", "grLikezonFreshPrimary", "getGrLikezonFreshPrimary", "grLikezonFreshSecondary", "getGrLikezonFreshSecondary", "grLikezonInCart", "getGrLikezonInCart", "grLikezonOzonPrimary", "getGrLikezonOzonPrimary", "grLikezonOzonSecondary", "getGrLikezonOzonSecondary", "grLowDemandDelivery", "getGrLowDemandDelivery", "grMarketingPrimary", "getGrMarketingPrimary", "grOverlayLive", "getGrOverlayLive", "grOverlayPrimary", "getGrOverlayPrimary", "grOverlayTertiaryReversed", "getGrOverlayTertiaryReversed", "grOzonCard", "getGrOzonCard", "grPremium", "getGrPremium", "grPremiumPlus", "getGrPremiumPlus", "grPremiumPro", "getGrPremiumPro", "grPremiumProTransparent", "getGrPremiumProTransparent", "grSale", "getGrSale", "grSberPay", "getGrSberPay", "grSelectFade", "getGrSelectFade", "grSelectInstallment", "getGrSelectInstallment", "grSocialPrimary", "getGrSocialPrimary", "grSocialSecondary", "getGrSocialSecondary", "grStars", "getGrStars", "grStarsProgram", "getGrStarsProgram", "grTile", "getGrTile", "grTopTravel", "getGrTopTravel", "grTravel", "getGrTravel", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface UniGradientTokenRepository extends UniTokenRepository<UniGradientToken> {
    @NotNull
    UniGradientToken getGrDelivery();

    @NotNull
    UniGradientToken getGrFadeHorizontalFloor1();

    @NotNull
    UniGradientToken getGrFavouritePromoBanner();

    @NotNull
    UniGradientToken getGrFavouritePromoFade();

    @NotNull
    UniGradientToken getGrFresh();

    @NotNull
    UniGradientToken getGrFreshSkuScroll();

    @NotNull
    UniGradientToken getGrGift();

    @NotNull
    UniGradientToken getGrHighDemandDelivery();

    @NotNull
    UniGradientToken getGrLikezonExpressPrimary();

    @NotNull
    UniGradientToken getGrLikezonExpressSecondary();

    @NotNull
    UniGradientToken getGrLikezonFreshPrimary();

    @NotNull
    UniGradientToken getGrLikezonFreshSecondary();

    @NotNull
    UniGradientToken getGrLikezonInCart();

    @NotNull
    UniGradientToken getGrLikezonOzonPrimary();

    @NotNull
    UniGradientToken getGrLikezonOzonSecondary();

    @NotNull
    UniGradientToken getGrLowDemandDelivery();

    @NotNull
    UniGradientToken getGrMarketingPrimary();

    @NotNull
    UniGradientToken getGrOverlayLive();

    @NotNull
    UniGradientToken getGrOverlayPrimary();

    @NotNull
    UniGradientToken getGrOverlayTertiaryReversed();

    @NotNull
    UniGradientToken getGrOzonCard();

    @NotNull
    UniGradientToken getGrPremium();

    @NotNull
    UniGradientToken getGrPremiumPlus();

    @NotNull
    UniGradientToken getGrPremiumPro();

    @NotNull
    UniGradientToken getGrPremiumProTransparent();

    @NotNull
    UniGradientToken getGrSale();

    @NotNull
    UniGradientToken getGrSberPay();

    @NotNull
    UniGradientToken getGrSelectFade();

    @NotNull
    UniGradientToken getGrSelectInstallment();

    @NotNull
    UniGradientToken getGrSocialPrimary();

    @NotNull
    UniGradientToken getGrSocialSecondary();

    @NotNull
    UniGradientToken getGrStars();

    @NotNull
    UniGradientToken getGrStarsProgram();

    @NotNull
    UniGradientToken getGrTile();

    @NotNull
    UniGradientToken getGrTopTravel();

    @NotNull
    UniGradientToken getGrTravel();
}
