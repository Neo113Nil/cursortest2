package ru.ozon.uni.core.repository.implementation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.models.UniGradientToken;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0004"}, d2 = {"tokenMap", "", "", "Lru/ozon/uni/core/models/UniGradientToken;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UniGradientTokenRepositoryImplKt {

    @NotNull
    private static final Map<String, UniGradientToken> tokenMap;

    static {
        UniGradientTokenRepositoryImpl uniGradientTokenRepositoryImpl = UniGradientTokenRepositoryImpl.INSTANCE;
        tokenMap = U.j(new Pair("grDelivery", uniGradientTokenRepositoryImpl.getGrDelivery()), new Pair("grFadeHorizontalFloor1", uniGradientTokenRepositoryImpl.getGrFadeHorizontalFloor1()), new Pair("grFavouritePromoBanner", uniGradientTokenRepositoryImpl.getGrFavouritePromoBanner()), new Pair("grFavouritePromoFade", uniGradientTokenRepositoryImpl.getGrFavouritePromoFade()), new Pair("grFresh", uniGradientTokenRepositoryImpl.getGrFresh()), new Pair("grFreshSkuScroll", uniGradientTokenRepositoryImpl.getGrFreshSkuScroll()), new Pair("grGift", uniGradientTokenRepositoryImpl.getGrGift()), new Pair("grHighDemandDelivery", uniGradientTokenRepositoryImpl.getGrHighDemandDelivery()), new Pair("grLikezonExpressPrimary", uniGradientTokenRepositoryImpl.getGrLikezonExpressPrimary()), new Pair("grLikezonExpressSecondary", uniGradientTokenRepositoryImpl.getGrLikezonExpressSecondary()), new Pair("grLikezonFreshPrimary", uniGradientTokenRepositoryImpl.getGrLikezonFreshPrimary()), new Pair("grLikezonFreshSecondary", uniGradientTokenRepositoryImpl.getGrLikezonFreshSecondary()), new Pair("grLikezonInCart", uniGradientTokenRepositoryImpl.getGrLikezonInCart()), new Pair("grLikezonOzonPrimary", uniGradientTokenRepositoryImpl.getGrLikezonOzonPrimary()), new Pair("grLikezonOzonSecondary", uniGradientTokenRepositoryImpl.getGrLikezonOzonSecondary()), new Pair("grLowDemandDelivery", uniGradientTokenRepositoryImpl.getGrLowDemandDelivery()), new Pair("grMarketingPrimary", uniGradientTokenRepositoryImpl.getGrMarketingPrimary()), new Pair("grOverlayLive", uniGradientTokenRepositoryImpl.getGrOverlayLive()), new Pair("grOverlayPrimary", uniGradientTokenRepositoryImpl.getGrOverlayPrimary()), new Pair("grOverlayTertiaryReversed", uniGradientTokenRepositoryImpl.getGrOverlayTertiaryReversed()), new Pair("grOzonCard", uniGradientTokenRepositoryImpl.getGrOzonCard()), new Pair("grPremium", uniGradientTokenRepositoryImpl.getGrPremium()), new Pair("grPremiumPlus", uniGradientTokenRepositoryImpl.getGrPremiumPlus()), new Pair("grPremiumPro", uniGradientTokenRepositoryImpl.getGrPremiumPro()), new Pair("grPremiumProTransparent", uniGradientTokenRepositoryImpl.getGrPremiumProTransparent()), new Pair("grSale", uniGradientTokenRepositoryImpl.getGrSale()), new Pair("grSberPay", uniGradientTokenRepositoryImpl.getGrSberPay()), new Pair("grSelectFade", uniGradientTokenRepositoryImpl.getGrSelectFade()), new Pair("grSelectInstallment", uniGradientTokenRepositoryImpl.getGrSelectInstallment()), new Pair("grSocialPrimary", uniGradientTokenRepositoryImpl.getGrSocialPrimary()), new Pair("grSocialSecondary", uniGradientTokenRepositoryImpl.getGrSocialSecondary()), new Pair("grStars", uniGradientTokenRepositoryImpl.getGrStars()), new Pair("grStarsProgram", uniGradientTokenRepositoryImpl.getGrStarsProgram()), new Pair("grTile", uniGradientTokenRepositoryImpl.getGrTile()), new Pair("grTopTravel", uniGradientTokenRepositoryImpl.getGrTopTravel()), new Pair("grTravel", uniGradientTokenRepositoryImpl.getGrTravel()));
    }
}
