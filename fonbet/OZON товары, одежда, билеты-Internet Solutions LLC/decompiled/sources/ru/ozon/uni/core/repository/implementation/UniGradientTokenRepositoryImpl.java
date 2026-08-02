package ru.ozon.uni.core.repository.implementation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.models.UniGradientToken;
import ru.ozon.uni.core.repository.UniGradientTokenRepository;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\bM\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0011\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\fR\u001a\u0010\u0015\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\fR\u001a\u0010\u0017\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u001a\u0010\u0019\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\fR\u001a\u0010\u001b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u001d\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u001f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b \u0010\fR\u001a\u0010!\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\n\u001a\u0004\b\"\u0010\fR\u001a\u0010#\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\n\u001a\u0004\b$\u0010\fR\u001a\u0010%\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\n\u001a\u0004\b&\u0010\fR\u001a\u0010'\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010\n\u001a\u0004\b(\u0010\fR\u001a\u0010)\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010\n\u001a\u0004\b*\u0010\fR\u001a\u0010+\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010\n\u001a\u0004\b,\u0010\fR\u001a\u0010-\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010\n\u001a\u0004\b.\u0010\fR\u001a\u0010/\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010\n\u001a\u0004\b0\u0010\fR\u001a\u00101\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010\n\u001a\u0004\b2\u0010\fR\u001a\u00103\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010\n\u001a\u0004\b4\u0010\fR\u001a\u00105\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010\n\u001a\u0004\b6\u0010\fR\u001a\u00107\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010\n\u001a\u0004\b8\u0010\fR\u001a\u00109\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010\n\u001a\u0004\b:\u0010\fR\u001a\u0010;\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010\n\u001a\u0004\b<\u0010\fR\u001a\u0010=\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010\n\u001a\u0004\b>\u0010\fR\u001a\u0010?\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010\n\u001a\u0004\b@\u0010\fR\u001a\u0010A\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010\n\u001a\u0004\bB\u0010\fR\u001a\u0010C\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010\n\u001a\u0004\bD\u0010\fR\u001a\u0010E\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010\n\u001a\u0004\bF\u0010\fR\u001a\u0010G\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010\n\u001a\u0004\bH\u0010\fR\u001a\u0010I\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010\n\u001a\u0004\bJ\u0010\fR\u001a\u0010K\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010\n\u001a\u0004\bL\u0010\fR\u001a\u0010M\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010\n\u001a\u0004\bN\u0010\fR\u001a\u0010O\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010\n\u001a\u0004\bP\u0010\fR\u001a\u0010Q\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010\n\u001a\u0004\bR\u0010\f¨\u0006S"}, d2 = {"Lru/ozon/uni/core/repository/implementation/UniGradientTokenRepositoryImpl;", "Lru/ozon/uni/core/repository/UniGradientTokenRepository;", "<init>", "()V", "", "tokenId", "Lru/ozon/uni/core/models/UniGradientToken;", "getById", "(Ljava/lang/String;)Lru/ozon/uni/core/models/UniGradientToken;", "grDelivery", "Lru/ozon/uni/core/models/UniGradientToken;", "getGrDelivery", "()Lru/ozon/uni/core/models/UniGradientToken;", "grFadeHorizontalFloor1", "getGrFadeHorizontalFloor1", "grFavouritePromoBanner", "getGrFavouritePromoBanner", "grFavouritePromoFade", "getGrFavouritePromoFade", "grFresh", "getGrFresh", "grFreshSkuScroll", "getGrFreshSkuScroll", "grGift", "getGrGift", "grHighDemandDelivery", "getGrHighDemandDelivery", "grLikezonExpressPrimary", "getGrLikezonExpressPrimary", "grLikezonExpressSecondary", "getGrLikezonExpressSecondary", "grLikezonFreshPrimary", "getGrLikezonFreshPrimary", "grLikezonFreshSecondary", "getGrLikezonFreshSecondary", "grLikezonInCart", "getGrLikezonInCart", "grLikezonOzonPrimary", "getGrLikezonOzonPrimary", "grLikezonOzonSecondary", "getGrLikezonOzonSecondary", "grLowDemandDelivery", "getGrLowDemandDelivery", "grMarketingPrimary", "getGrMarketingPrimary", "grOverlayLive", "getGrOverlayLive", "grOverlayPrimary", "getGrOverlayPrimary", "grOverlayTertiaryReversed", "getGrOverlayTertiaryReversed", "grOzonCard", "getGrOzonCard", "grPremium", "getGrPremium", "grPremiumPlus", "getGrPremiumPlus", "grPremiumPro", "getGrPremiumPro", "grPremiumProTransparent", "getGrPremiumProTransparent", "grSale", "getGrSale", "grSberPay", "getGrSberPay", "grSelectFade", "getGrSelectFade", "grSelectInstallment", "getGrSelectInstallment", "grSocialPrimary", "getGrSocialPrimary", "grSocialSecondary", "getGrSocialSecondary", "grStars", "getGrStars", "grStarsProgram", "getGrStarsProgram", "grTile", "getGrTile", "grTopTravel", "getGrTopTravel", "grTravel", "getGrTravel", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UniGradientTokenRepositoryImpl implements UniGradientTokenRepository {

    @NotNull
    public static final UniGradientTokenRepositoryImpl INSTANCE = new UniGradientTokenRepositoryImpl();

    @NotNull
    private static final UniGradientToken grDelivery = new UniGradientToken("grDelivery");

    @NotNull
    private static final UniGradientToken grFadeHorizontalFloor1 = new UniGradientToken("grFadeHorizontalFloor1");

    @NotNull
    private static final UniGradientToken grFavouritePromoBanner = new UniGradientToken("grFavouritePromoBanner");

    @NotNull
    private static final UniGradientToken grFavouritePromoFade = new UniGradientToken("grFavouritePromoFade");

    @NotNull
    private static final UniGradientToken grFresh = new UniGradientToken("grFresh");

    @NotNull
    private static final UniGradientToken grFreshSkuScroll = new UniGradientToken("grFreshSkuScroll");

    @NotNull
    private static final UniGradientToken grGift = new UniGradientToken("grGift");

    @NotNull
    private static final UniGradientToken grHighDemandDelivery = new UniGradientToken("grHighDemandDelivery");

    @NotNull
    private static final UniGradientToken grLikezonExpressPrimary = new UniGradientToken("grLikezonExpressPrimary");

    @NotNull
    private static final UniGradientToken grLikezonExpressSecondary = new UniGradientToken("grLikezonExpressSecondary");

    @NotNull
    private static final UniGradientToken grLikezonFreshPrimary = new UniGradientToken("grLikezonFreshPrimary");

    @NotNull
    private static final UniGradientToken grLikezonFreshSecondary = new UniGradientToken("grLikezonFreshSecondary");

    @NotNull
    private static final UniGradientToken grLikezonInCart = new UniGradientToken("grLikezonInCart");

    @NotNull
    private static final UniGradientToken grLikezonOzonPrimary = new UniGradientToken("grLikezonOzonPrimary");

    @NotNull
    private static final UniGradientToken grLikezonOzonSecondary = new UniGradientToken("grLikezonOzonSecondary");

    @NotNull
    private static final UniGradientToken grLowDemandDelivery = new UniGradientToken("grLowDemandDelivery");

    @NotNull
    private static final UniGradientToken grMarketingPrimary = new UniGradientToken("grMarketingPrimary");

    @NotNull
    private static final UniGradientToken grOverlayLive = new UniGradientToken("grOverlayLive");

    @NotNull
    private static final UniGradientToken grOverlayPrimary = new UniGradientToken("grOverlayPrimary");

    @NotNull
    private static final UniGradientToken grOverlayTertiaryReversed = new UniGradientToken("grOverlayTertiaryReversed");

    @NotNull
    private static final UniGradientToken grOzonCard = new UniGradientToken("grOzonCard");

    @NotNull
    private static final UniGradientToken grPremium = new UniGradientToken("grPremium");

    @NotNull
    private static final UniGradientToken grPremiumPlus = new UniGradientToken("grPremiumPlus");

    @NotNull
    private static final UniGradientToken grPremiumPro = new UniGradientToken("grPremiumPro");

    @NotNull
    private static final UniGradientToken grPremiumProTransparent = new UniGradientToken("grPremiumProTransparent");

    @NotNull
    private static final UniGradientToken grSale = new UniGradientToken("grSale");

    @NotNull
    private static final UniGradientToken grSberPay = new UniGradientToken("grSberPay");

    @NotNull
    private static final UniGradientToken grSelectFade = new UniGradientToken("grSelectFade");

    @NotNull
    private static final UniGradientToken grSelectInstallment = new UniGradientToken("grSelectInstallment");

    @NotNull
    private static final UniGradientToken grSocialPrimary = new UniGradientToken("grSocialPrimary");

    @NotNull
    private static final UniGradientToken grSocialSecondary = new UniGradientToken("grSocialSecondary");

    @NotNull
    private static final UniGradientToken grStars = new UniGradientToken("grStars");

    @NotNull
    private static final UniGradientToken grStarsProgram = new UniGradientToken("grStarsProgram");

    @NotNull
    private static final UniGradientToken grTile = new UniGradientToken("grTile");

    @NotNull
    private static final UniGradientToken grTopTravel = new UniGradientToken("grTopTravel");

    @NotNull
    private static final UniGradientToken grTravel = new UniGradientToken("grTravel");

    private UniGradientTokenRepositoryImpl() {
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrDelivery() {
        return grDelivery;
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrFadeHorizontalFloor1() {
        return grFadeHorizontalFloor1;
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrFavouritePromoBanner() {
        return grFavouritePromoBanner;
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrFavouritePromoFade() {
        return grFavouritePromoFade;
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrFresh() {
        return grFresh;
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrFreshSkuScroll() {
        return grFreshSkuScroll;
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrGift() {
        return grGift;
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrHighDemandDelivery() {
        return grHighDemandDelivery;
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrLikezonExpressPrimary() {
        return grLikezonExpressPrimary;
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrLikezonExpressSecondary() {
        return grLikezonExpressSecondary;
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrLikezonFreshPrimary() {
        return grLikezonFreshPrimary;
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrLikezonFreshSecondary() {
        return grLikezonFreshSecondary;
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrLikezonInCart() {
        return grLikezonInCart;
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrLikezonOzonPrimary() {
        return grLikezonOzonPrimary;
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrLikezonOzonSecondary() {
        return grLikezonOzonSecondary;
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrLowDemandDelivery() {
        return grLowDemandDelivery;
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrMarketingPrimary() {
        return grMarketingPrimary;
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrOverlayLive() {
        return grOverlayLive;
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrOverlayPrimary() {
        return grOverlayPrimary;
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrOverlayTertiaryReversed() {
        return grOverlayTertiaryReversed;
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrOzonCard() {
        return grOzonCard;
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrPremium() {
        return grPremium;
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrPremiumPlus() {
        return grPremiumPlus;
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrPremiumPro() {
        return grPremiumPro;
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrPremiumProTransparent() {
        return grPremiumProTransparent;
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrSale() {
        return grSale;
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrSberPay() {
        return grSberPay;
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrSelectFade() {
        return grSelectFade;
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrSelectInstallment() {
        return grSelectInstallment;
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrSocialPrimary() {
        return grSocialPrimary;
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrSocialSecondary() {
        return grSocialSecondary;
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrStars() {
        return grStars;
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrStarsProgram() {
        return grStarsProgram;
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrTile() {
        return grTile;
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrTopTravel() {
        return grTopTravel;
    }

    @Override // ru.ozon.uni.core.repository.UniGradientTokenRepository
    @NotNull
    public UniGradientToken getGrTravel() {
        return grTravel;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.ozon.uni.core.repository.UniTokenRepository
    public UniGradientToken getById(@NotNull String tokenId) {
        Map map;
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        map = UniGradientTokenRepositoryImplKt.tokenMap;
        return (UniGradientToken) map.get(tokenId);
    }
}
