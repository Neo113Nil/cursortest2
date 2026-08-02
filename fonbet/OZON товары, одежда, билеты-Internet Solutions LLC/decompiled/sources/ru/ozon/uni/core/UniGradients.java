package ru.ozon.uni.core;

import Xc.a;
import Xc.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.models.GradientDirection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/¨\u00060"}, d2 = {"Lru/ozon/uni/core/UniGradients;", "", "token", "", "gradient", "Lru/ozon/uni/core/UniGradient;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lru/ozon/uni/core/UniGradient;)V", "getToken", "()Ljava/lang/String;", "getGradient", "()Lru/ozon/uni/core/UniGradient;", "GR_PREMIUM", "GR_PREMIUM_PLUS", "GR_PREMIUM_PRO", "GR_PREMIUM_PRO_TRANSPARENT", "GR_FAVOURITE_PROMO_FADE", "GR_FAVOURITE_PROMO_BANNER", "GR_FRESH_SKU_SCROLL", "GR_LOW_DEMAND_DELIVERY", "GR_HIGH_DEMAND_DELIVERY", "GR_SALE", "GR_GIFT", "GR_TRAVEL", "GR_FRESH", "GR_SOCIAL_PRIMARY", "GR_SOCIAL_SECONDARY", "GR_DELIVERY", "GR_TILE", "GR_MARKETING_PRIMARY", "GR_OVERLAY_LIVE", "GR_OVERLAY_PRIMARY", "GR_OVERLAY_TERTIARY_REVERSED", "GR_FADE_HORIZONTAL_FLOOR_1", "GR_SBER_PAY", "GR_OZON_CARD", "GR_TOP_TRAVEL", "GR_STARS", "GR_SELECT_FADE", "GR_SELECT_INSTALLMENT", "GR_STARS_PROGRAM", "GR_LIKEZON_IN_CART", "GR_LIKEZON_OZON_PRIMARY", "GR_LIKEZON_OZON_SECONDARY", "GR_LIKEZON_EXPRESS_PRIMARY", "GR_LIKEZON_EXPRESS_SECONDARY", "GR_LIKEZON_FRESH_PRIMARY", "GR_LIKEZON_FRESH_SECONDARY", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UniGradients {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UniGradients[] $VALUES;
    public static final UniGradients GR_DELIVERY;
    public static final UniGradients GR_FADE_HORIZONTAL_FLOOR_1;
    public static final UniGradients GR_FAVOURITE_PROMO_BANNER;
    public static final UniGradients GR_FAVOURITE_PROMO_FADE;
    public static final UniGradients GR_FRESH;
    public static final UniGradients GR_FRESH_SKU_SCROLL;
    public static final UniGradients GR_GIFT;
    public static final UniGradients GR_HIGH_DEMAND_DELIVERY;
    public static final UniGradients GR_LIKEZON_EXPRESS_PRIMARY;
    public static final UniGradients GR_LIKEZON_EXPRESS_SECONDARY;
    public static final UniGradients GR_LIKEZON_FRESH_PRIMARY;
    public static final UniGradients GR_LIKEZON_FRESH_SECONDARY;
    public static final UniGradients GR_LIKEZON_IN_CART;
    public static final UniGradients GR_LIKEZON_OZON_PRIMARY;
    public static final UniGradients GR_LIKEZON_OZON_SECONDARY;
    public static final UniGradients GR_LOW_DEMAND_DELIVERY;
    public static final UniGradients GR_MARKETING_PRIMARY;
    public static final UniGradients GR_OVERLAY_LIVE;
    public static final UniGradients GR_OVERLAY_PRIMARY;
    public static final UniGradients GR_OVERLAY_TERTIARY_REVERSED;
    public static final UniGradients GR_OZON_CARD;
    public static final UniGradients GR_PREMIUM;
    public static final UniGradients GR_PREMIUM_PLUS;
    public static final UniGradients GR_PREMIUM_PRO;
    public static final UniGradients GR_PREMIUM_PRO_TRANSPARENT;
    public static final UniGradients GR_SALE;
    public static final UniGradients GR_SBER_PAY;
    public static final UniGradients GR_SELECT_FADE;
    public static final UniGradients GR_SELECT_INSTALLMENT;
    public static final UniGradients GR_SOCIAL_PRIMARY;
    public static final UniGradients GR_SOCIAL_SECONDARY;
    public static final UniGradients GR_STARS;
    public static final UniGradients GR_STARS_PROGRAM;
    public static final UniGradients GR_TILE;
    public static final UniGradients GR_TOP_TRAVEL;
    public static final UniGradients GR_TRAVEL;

    @NotNull
    private final UniGradient gradient;

    @NotNull
    private final String token;

    private static final /* synthetic */ UniGradients[] $values() {
        return new UniGradients[]{GR_PREMIUM, GR_PREMIUM_PLUS, GR_PREMIUM_PRO, GR_PREMIUM_PRO_TRANSPARENT, GR_FAVOURITE_PROMO_FADE, GR_FAVOURITE_PROMO_BANNER, GR_FRESH_SKU_SCROLL, GR_LOW_DEMAND_DELIVERY, GR_HIGH_DEMAND_DELIVERY, GR_SALE, GR_GIFT, GR_TRAVEL, GR_FRESH, GR_SOCIAL_PRIMARY, GR_SOCIAL_SECONDARY, GR_DELIVERY, GR_TILE, GR_MARKETING_PRIMARY, GR_OVERLAY_LIVE, GR_OVERLAY_PRIMARY, GR_OVERLAY_TERTIARY_REVERSED, GR_FADE_HORIZONTAL_FLOOR_1, GR_SBER_PAY, GR_OZON_CARD, GR_TOP_TRAVEL, GR_STARS, GR_SELECT_FADE, GR_SELECT_INSTALLMENT, GR_STARS_PROGRAM, GR_LIKEZON_IN_CART, GR_LIKEZON_OZON_PRIMARY, GR_LIKEZON_OZON_SECONDARY, GR_LIKEZON_EXPRESS_PRIMARY, GR_LIKEZON_EXPRESS_SECONDARY, GR_LIKEZON_FRESH_PRIMARY, GR_LIKEZON_FRESH_SECONDARY};
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        GradientDirection gradientDirection = GradientDirection.TL_BR;
        GR_PREMIUM = new UniGradients("GR_PREMIUM", 0, "grPremium", new UniGradient(gradientDirection, C7714v.b0(UniGradientColors.GR_PREMIUM_0.getToken(), UniGradientColors.GR_PREMIUM_1.getToken(), UniGradientColors.GR_PREMIUM_2.getToken()), null, C7714v.b0(Float.valueOf(0.05f), Float.valueOf(0.3f), Float.valueOf(0.85f)), 4, null));
        List b02 = C7714v.b0(UniGradientColors.GR_PREMIUM_PLUS_0.getToken(), UniGradientColors.GR_PREMIUM_PLUS_1.getToken(), UniGradientColors.GR_PREMIUM_PLUS_2.getToken());
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(0.6f);
        Float valueOf3 = Float.valueOf(1.0f);
        DefaultConstructorMarker defaultConstructorMarker = null;
        GR_PREMIUM_PLUS = new UniGradients("GR_PREMIUM_PLUS", 1, "grPremiumPlus", new UniGradient(gradientDirection, b02, null, C7714v.b0(valueOf, valueOf2, valueOf3), 4, defaultConstructorMarker));
        GradientDirection gradientDirection2 = GradientDirection.BL_TR;
        List b03 = C7714v.b0(UniGradientColors.GR_PREMIUM_PRO_0.getToken(), UniGradientColors.GR_PREMIUM_PRO_1.getToken(), UniGradientColors.GR_PREMIUM_PRO_2.getToken());
        Float valueOf4 = Float.valueOf(0.7f);
        GR_PREMIUM_PRO = new UniGradients("GR_PREMIUM_PRO", 2, "grPremiumPro", new UniGradient(gradientDirection2, b03, null, C7714v.b0(valueOf, valueOf4, valueOf3), 4, null));
        GR_PREMIUM_PRO_TRANSPARENT = new UniGradients("GR_PREMIUM_PRO_TRANSPARENT", 3, "grPremiumProTransparent", new UniGradient(gradientDirection2, C7714v.b0(UniGradientColors.GR_PREMIUM_PRO_TRANSPARENT_0.getToken(), UniGradientColors.GR_PREMIUM_PRO_TRANSPARENT_1.getToken(), UniGradientColors.GR_PREMIUM_PRO_TRANSPARENT_2.getToken()), null, C7714v.b0(valueOf, valueOf4, valueOf3), 4, null));
        GradientDirection gradientDirection3 = GradientDirection.LEFT_RIGHT;
        GR_FAVOURITE_PROMO_FADE = new UniGradients("GR_FAVOURITE_PROMO_FADE", 4, "grFavouritePromoFade", new UniGradient(gradientDirection3, C7714v.b0(UniGradientColors.GR_FAVOURITE_PROMO_FADE_0.getToken(), UniGradientColors.GR_FAVOURITE_PROMO_FADE_1.getToken()), null, C7714v.b0(valueOf, valueOf3), 4, null));
        GR_FAVOURITE_PROMO_BANNER = new UniGradients("GR_FAVOURITE_PROMO_BANNER", 5, "grFavouritePromoBanner", new UniGradient(gradientDirection2, C7714v.b0(UniGradientColors.GR_FAVOURITE_PROMO_BANNER_0.getToken(), UniGradientColors.GR_FAVOURITE_PROMO_BANNER_1.getToken()), null, C7714v.b0(Float.valueOf(0.53f), valueOf3), 4, null));
        GradientDirection gradientDirection4 = GradientDirection.TOP_BOTTOM;
        List b04 = C7714v.b0(UniGradientColors.GR_FRESH_SKU_SCROLL_0.getToken(), UniGradientColors.GR_FRESH_SKU_SCROLL_1.getToken(), UniGradientColors.GR_FRESH_SKU_SCROLL_2.getToken());
        Float valueOf5 = Float.valueOf(0.52f);
        GR_FRESH_SKU_SCROLL = new UniGradients("GR_FRESH_SKU_SCROLL", 6, "grFreshSkuScroll", new UniGradient(gradientDirection4, b04, null, C7714v.b0(valueOf, valueOf5, valueOf3), 4, null));
        int i11 = 4;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        GR_LOW_DEMAND_DELIVERY = new UniGradients("GR_LOW_DEMAND_DELIVERY", 7, "grLowDemandDelivery", new UniGradient(gradientDirection3, C7714v.b0(UniGradientColors.GR_LOW_DEMAND_DELIVERY_0.getToken(), UniGradientColors.GR_LOW_DEMAND_DELIVERY_1.getToken()), 0 == true ? 1 : 0, C7714v.b0(valueOf, valueOf3), i11, defaultConstructorMarker2));
        GR_HIGH_DEMAND_DELIVERY = new UniGradients("GR_HIGH_DEMAND_DELIVERY", 8, "grHighDemandDelivery", new UniGradient(gradientDirection3, C7714v.b0(UniGradientColors.GR_HIGH_DEMAND_DELIVERY_0.getToken(), UniGradientColors.GR_HIGH_DEMAND_DELIVERY_1.getToken()), 0 == true ? 1 : 0, C7714v.b0(valueOf, valueOf3), i11, defaultConstructorMarker2));
        int i12 = 4;
        GR_SALE = new UniGradients("GR_SALE", 9, "grSale", new UniGradient(gradientDirection, C7714v.b0(UniGradientColors.GR_SALE_0.getToken(), UniGradientColors.GR_SALE_1.getToken()), null, C7714v.b0(valueOf, valueOf3), i12, defaultConstructorMarker));
        GR_GIFT = new UniGradients("GR_GIFT", 10, "grGift", new UniGradient(gradientDirection, C7714v.b0(UniGradientColors.GR_GIFT_0.getToken(), UniGradientColors.GR_GIFT_1.getToken()), null, C7714v.b0(valueOf, valueOf3), i12, defaultConstructorMarker));
        GR_TRAVEL = new UniGradients("GR_TRAVEL", 11, "grTravel", new UniGradient(gradientDirection, C7714v.b0(UniGradientColors.GR_TRAVEL_0.getToken(), UniGradientColors.GR_TRAVEL_1.getToken(), UniGradientColors.GR_TRAVEL_2.getToken()), null, C7714v.b0(Float.valueOf(0.4f), Float.valueOf(0.8f), valueOf3), i12, defaultConstructorMarker));
        GR_FRESH = new UniGradients("GR_FRESH", 12, "grFresh", new UniGradient(gradientDirection, C7714v.b0(UniGradientColors.GR_FRESH_0.getToken(), UniGradientColors.GR_FRESH_1.getToken()), null, C7714v.b0(valueOf, valueOf3), i12, defaultConstructorMarker));
        GR_SOCIAL_PRIMARY = new UniGradients("GR_SOCIAL_PRIMARY", 13, "grSocialPrimary", new UniGradient(gradientDirection, C7714v.b0(UniGradientColors.GR_SOCIAL_PRIMARY_0.getToken(), UniGradientColors.GR_SOCIAL_PRIMARY_1.getToken()), null, C7714v.b0(valueOf, valueOf3), i12, defaultConstructorMarker));
        GR_SOCIAL_SECONDARY = new UniGradients("GR_SOCIAL_SECONDARY", 14, "grSocialSecondary", new UniGradient(gradientDirection, C7714v.b0(UniGradientColors.GR_SOCIAL_SECONDARY_0.getToken(), UniGradientColors.GR_SOCIAL_SECONDARY_1.getToken()), null, C7714v.b0(valueOf, valueOf3), i12, defaultConstructorMarker));
        List b05 = C7714v.b0(UniGradientColors.GR_DELIVERY_0.getToken(), UniGradientColors.GR_DELIVERY_1.getToken(), UniGradientColors.GR_DELIVERY_2.getToken(), UniGradientColors.GR_DELIVERY_3.getToken());
        Float valueOf6 = Float.valueOf(0.25f);
        int i13 = 4;
        GR_DELIVERY = new UniGradients("GR_DELIVERY", 15, "grDelivery", new UniGradient(gradientDirection, b05, null, C7714v.b0(valueOf, valueOf6, Float.valueOf(0.75f), valueOf3), i13, defaultConstructorMarker));
        GR_TILE = new UniGradients("GR_TILE", 16, "grTile", new UniGradient(gradientDirection, C7714v.b0(UniGradientColors.GR_TILE_0.getToken(), UniGradientColors.GR_TILE_1.getToken(), UniGradientColors.GR_TILE_2.getToken()), null, C7714v.b0(Float.valueOf(0.22f), Float.valueOf(0.64f), valueOf3), i13, defaultConstructorMarker));
        GR_MARKETING_PRIMARY = new UniGradients("GR_MARKETING_PRIMARY", 17, "grMarketingPrimary", new UniGradient(gradientDirection, C7714v.b0(UniGradientColors.GR_MARKETING_PRIMARY_0.getToken(), UniGradientColors.GR_MARKETING_PRIMARY_1.getToken()), null, C7714v.b0(valueOf, valueOf3), i13, defaultConstructorMarker));
        int i14 = 4;
        List list = null;
        GR_OVERLAY_LIVE = new UniGradients("GR_OVERLAY_LIVE", 18, "grOverlayLive", new UniGradient(gradientDirection4, C7714v.b0(UniGradientColors.GR_OVERLAY_LIVE_0.getToken(), UniGradientColors.GR_OVERLAY_LIVE_1.getToken()), list, C7714v.b0(valueOf, valueOf3), i14, 0 == true ? 1 : 0));
        GR_OVERLAY_PRIMARY = new UniGradients("GR_OVERLAY_PRIMARY", 19, "grOverlayPrimary", new UniGradient(gradientDirection4, C7714v.b0(UniGradientColors.GR_OVERLAY_PRIMARY_0.getToken(), UniGradientColors.GR_OVERLAY_PRIMARY_1.getToken()), list, C7714v.b0(valueOf, valueOf3), i14, 0 == true ? 1 : 0));
        GR_OVERLAY_TERTIARY_REVERSED = new UniGradients("GR_OVERLAY_TERTIARY_REVERSED", 20, "grOverlayTertiaryReversed", new UniGradient(gradientDirection4, C7714v.b0(UniGradientColors.GR_OVERLAY_TERTIARY_REVERSED_0.getToken(), UniGradientColors.GR_OVERLAY_TERTIARY_REVERSED_1.getToken()), list, C7714v.b0(valueOf, valueOf3), i14, 0 == true ? 1 : 0));
        GR_FADE_HORIZONTAL_FLOOR_1 = new UniGradients("GR_FADE_HORIZONTAL_FLOOR_1", 21, "grFadeHorizontalFloor1", new UniGradient(gradientDirection3, C7714v.b0(UniGradientColors.GR_FADE_HORIZONTAL_FLOOR_1_0.getToken(), UniGradientColors.GR_FADE_HORIZONTAL_FLOOR_1_1.getToken()), 0 == true ? 1 : 0, C7714v.b0(valueOf, valueOf2), i11, defaultConstructorMarker2));
        GR_SBER_PAY = new UniGradients("GR_SBER_PAY", 22, "grSberPay", new UniGradient(gradientDirection3, C7714v.b0(UniGradientColors.GR_SBER_PAY_0.getToken(), UniGradientColors.GR_SBER_PAY_1.getToken(), UniGradientColors.GR_SBER_PAY_2.getToken(), UniGradientColors.GR_SBER_PAY_3.getToken(), UniGradientColors.GR_SBER_PAY_4.getToken()), 0 == true ? 1 : 0, C7714v.b0(valueOf, Float.valueOf(0.08f), valueOf6, valueOf5, valueOf3), i11, defaultConstructorMarker2));
        GR_OZON_CARD = new UniGradients("GR_OZON_CARD", 23, "grOzonCard", new UniGradient(gradientDirection3, C7714v.b0(UniGradientColors.GR_OZON_CARD_0.getToken(), UniGradientColors.GR_OZON_CARD_1.getToken()), 0 == true ? 1 : 0, C7714v.b0(valueOf, valueOf3), i11, defaultConstructorMarker2));
        int i15 = 4;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        GR_TOP_TRAVEL = new UniGradients("GR_TOP_TRAVEL", 24, "grTopTravel", new UniGradient(gradientDirection, C7714v.b0(UniGradientColors.GR_TOP_TRAVEL_0.getToken(), UniGradientColors.GR_TOP_TRAVEL_1.getToken()), null, C7714v.b0(valueOf, valueOf3), i15, defaultConstructorMarker3));
        GR_STARS = new UniGradients("GR_STARS", 25, "grStars", new UniGradient(gradientDirection, C7714v.b0(UniGradientColors.GR_STARS_0.getToken(), UniGradientColors.GR_STARS_1.getToken()), null, C7714v.b0(valueOf, valueOf3), i15, defaultConstructorMarker3));
        GR_SELECT_FADE = new UniGradients("GR_SELECT_FADE", 26, "grSelectFade", new UniGradient(gradientDirection4, C7714v.b0(UniGradientColors.GR_SELECT_FADE_0.getToken(), UniGradientColors.GR_SELECT_FADE_1.getToken()), null, C7714v.b0(valueOf, Float.valueOf(0.9f)), 4, 0 == true ? 1 : 0));
        GR_SELECT_INSTALLMENT = new UniGradients("GR_SELECT_INSTALLMENT", 27, "grSelectInstallment", new UniGradient(gradientDirection, C7714v.b0(UniGradientColors.GR_SELECT_INSTALLMENT_0.getToken(), UniGradientColors.GR_SELECT_INSTALLMENT_1.getToken()), null, C7714v.b0(valueOf, valueOf3), i15, defaultConstructorMarker3));
        int i16 = 4;
        GR_STARS_PROGRAM = new UniGradients("GR_STARS_PROGRAM", 28, "grStarsProgram", new UniGradient(gradientDirection, C7714v.b0(UniGradientColors.GR_STARS_PROGRAM_0.getToken(), UniGradientColors.GR_STARS_PROGRAM_1.getToken(), UniGradientColors.GR_STARS_PROGRAM_2.getToken(), UniGradientColors.GR_STARS_PROGRAM_3.getToken()), null, C7714v.b0(Float.valueOf(0.23f), Float.valueOf(0.51f), Float.valueOf(0.74f), valueOf3), i16, defaultConstructorMarker3));
        List b06 = C7714v.b0(UniGradientColors.GR_LIKEZON_IN_CART_0.getToken(), UniGradientColors.GR_LIKEZON_IN_CART_1.getToken(), UniGradientColors.GR_LIKEZON_IN_CART_2.getToken());
        Float valueOf7 = Float.valueOf(0.5f);
        GR_LIKEZON_IN_CART = new UniGradients("GR_LIKEZON_IN_CART", 29, "grLikezonInCart", new UniGradient(gradientDirection, b06, null, C7714v.b0(valueOf, valueOf7, valueOf3), i16, defaultConstructorMarker3));
        GR_LIKEZON_OZON_PRIMARY = new UniGradients("GR_LIKEZON_OZON_PRIMARY", 30, "grLikezonOzonPrimary", new UniGradient(gradientDirection, C7714v.b0(UniGradientColors.GR_LIKEZON_OZON_PRIMARY_0.getToken(), UniGradientColors.GR_LIKEZON_OZON_PRIMARY_1.getToken(), UniGradientColors.GR_LIKEZON_OZON_PRIMARY_2.getToken()), null, C7714v.b0(valueOf, valueOf7, valueOf3), i16, defaultConstructorMarker3));
        GR_LIKEZON_OZON_SECONDARY = new UniGradients("GR_LIKEZON_OZON_SECONDARY", 31, "grLikezonOzonSecondary", new UniGradient(gradientDirection, C7714v.b0(UniGradientColors.GR_LIKEZON_OZON_SECONDARY_0.getToken(), UniGradientColors.GR_LIKEZON_OZON_SECONDARY_1.getToken(), UniGradientColors.GR_LIKEZON_OZON_SECONDARY_2.getToken()), null, C7714v.b0(valueOf, valueOf7, valueOf3), i16, defaultConstructorMarker3));
        GR_LIKEZON_EXPRESS_PRIMARY = new UniGradients("GR_LIKEZON_EXPRESS_PRIMARY", 32, "grLikezonExpressPrimary", new UniGradient(gradientDirection, C7714v.b0(UniGradientColors.GR_LIKEZON_EXPRESS_PRIMARY_0.getToken(), UniGradientColors.GR_LIKEZON_EXPRESS_PRIMARY_1.getToken(), UniGradientColors.GR_LIKEZON_EXPRESS_PRIMARY_2.getToken()), null, C7714v.b0(valueOf, valueOf7, valueOf3), i16, defaultConstructorMarker3));
        GR_LIKEZON_EXPRESS_SECONDARY = new UniGradients("GR_LIKEZON_EXPRESS_SECONDARY", 33, "grLikezonExpressSecondary", new UniGradient(gradientDirection, C7714v.b0(UniGradientColors.GR_LIKEZON_EXPRESS_SECONDARY_0.getToken(), UniGradientColors.GR_LIKEZON_EXPRESS_SECONDARY_1.getToken(), UniGradientColors.GR_LIKEZON_EXPRESS_SECONDARY_2.getToken()), null, C7714v.b0(valueOf, valueOf7, valueOf3), i16, defaultConstructorMarker3));
        GR_LIKEZON_FRESH_PRIMARY = new UniGradients("GR_LIKEZON_FRESH_PRIMARY", 34, "grLikezonFreshPrimary", new UniGradient(gradientDirection, C7714v.b0(UniGradientColors.GR_LIKEZON_FRESH_PRIMARY_0.getToken(), UniGradientColors.GR_LIKEZON_FRESH_PRIMARY_1.getToken(), UniGradientColors.GR_LIKEZON_FRESH_PRIMARY_2.getToken()), null, C7714v.b0(valueOf, valueOf7, valueOf3), i16, defaultConstructorMarker3));
        GR_LIKEZON_FRESH_SECONDARY = new UniGradients("GR_LIKEZON_FRESH_SECONDARY", 35, "grLikezonFreshSecondary", new UniGradient(gradientDirection, C7714v.b0(UniGradientColors.GR_LIKEZON_FRESH_SECONDARY_0.getToken(), UniGradientColors.GR_LIKEZON_FRESH_SECONDARY_1.getToken(), UniGradientColors.GR_LIKEZON_FRESH_SECONDARY_2.getToken()), null, C7714v.b0(valueOf, valueOf7, valueOf3), i16, defaultConstructorMarker3));
        UniGradients[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private UniGradients(String str, int i11, String str2, UniGradient uniGradient) {
        this.token = str2;
        this.gradient = uniGradient;
    }

    @NotNull
    public static a<UniGradients> getEntries() {
        return $ENTRIES;
    }

    public static UniGradients valueOf(String str) {
        return (UniGradients) Enum.valueOf(UniGradients.class, str);
    }

    public static UniGradients[] values() {
        return (UniGradients[]) $VALUES.clone();
    }

    @NotNull
    public final UniGradient getGradient() {
        return this.gradient;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }
}
