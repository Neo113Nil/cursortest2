package ru.ozon.uni.core;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\bd\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bh¨\u0006i"}, d2 = {"Lru/ozon/uni/core/UniGradientColors;", "", "token", "", "resId", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "getToken", "()Ljava/lang/String;", "getResId", "()I", "GR_DELIVERY_0", "GR_DELIVERY_1", "GR_DELIVERY_2", "GR_DELIVERY_3", "GR_FADE_HORIZONTAL_FLOOR_1_0", "GR_FADE_HORIZONTAL_FLOOR_1_1", "GR_FAVOURITE_PROMO_BANNER_0", "GR_FAVOURITE_PROMO_BANNER_1", "GR_FAVOURITE_PROMO_FADE_0", "GR_FAVOURITE_PROMO_FADE_1", "GR_FRESH_0", "GR_FRESH_1", "GR_FRESH_SKU_SCROLL_0", "GR_FRESH_SKU_SCROLL_1", "GR_FRESH_SKU_SCROLL_2", "GR_GIFT_0", "GR_GIFT_1", "GR_HIGH_DEMAND_DELIVERY_0", "GR_HIGH_DEMAND_DELIVERY_1", "GR_LIKEZON_EXPRESS_PRIMARY_0", "GR_LIKEZON_EXPRESS_PRIMARY_1", "GR_LIKEZON_EXPRESS_PRIMARY_2", "GR_LIKEZON_EXPRESS_SECONDARY_0", "GR_LIKEZON_EXPRESS_SECONDARY_1", "GR_LIKEZON_EXPRESS_SECONDARY_2", "GR_LIKEZON_FRESH_PRIMARY_0", "GR_LIKEZON_FRESH_PRIMARY_1", "GR_LIKEZON_FRESH_PRIMARY_2", "GR_LIKEZON_FRESH_SECONDARY_0", "GR_LIKEZON_FRESH_SECONDARY_1", "GR_LIKEZON_FRESH_SECONDARY_2", "GR_LIKEZON_IN_CART_0", "GR_LIKEZON_IN_CART_1", "GR_LIKEZON_IN_CART_2", "GR_LIKEZON_OZON_PRIMARY_0", "GR_LIKEZON_OZON_PRIMARY_1", "GR_LIKEZON_OZON_PRIMARY_2", "GR_LIKEZON_OZON_SECONDARY_0", "GR_LIKEZON_OZON_SECONDARY_1", "GR_LIKEZON_OZON_SECONDARY_2", "GR_LOW_DEMAND_DELIVERY_0", "GR_LOW_DEMAND_DELIVERY_1", "GR_MARKETING_PRIMARY_0", "GR_MARKETING_PRIMARY_1", "GR_OVERLAY_LIVE_0", "GR_OVERLAY_LIVE_1", "GR_OVERLAY_PRIMARY_0", "GR_OVERLAY_PRIMARY_1", "GR_OVERLAY_TERTIARY_REVERSED_0", "GR_OVERLAY_TERTIARY_REVERSED_1", "GR_OZON_CARD_0", "GR_OZON_CARD_1", "GR_PREMIUM_0", "GR_PREMIUM_1", "GR_PREMIUM_2", "GR_PREMIUM_PLUS_0", "GR_PREMIUM_PLUS_1", "GR_PREMIUM_PLUS_2", "GR_PREMIUM_PRO_0", "GR_PREMIUM_PRO_1", "GR_PREMIUM_PRO_2", "GR_PREMIUM_PRO_TRANSPARENT_0", "GR_PREMIUM_PRO_TRANSPARENT_1", "GR_PREMIUM_PRO_TRANSPARENT_2", "GR_SALE_0", "GR_SALE_1", "GR_SBER_PAY_0", "GR_SBER_PAY_1", "GR_SBER_PAY_2", "GR_SBER_PAY_3", "GR_SBER_PAY_4", "GR_SELECT_FADE_0", "GR_SELECT_FADE_1", "GR_SELECT_INSTALLMENT_0", "GR_SELECT_INSTALLMENT_1", "GR_SOCIAL_PRIMARY_0", "GR_SOCIAL_PRIMARY_1", "GR_SOCIAL_SECONDARY_0", "GR_SOCIAL_SECONDARY_1", "GR_STARS_0", "GR_STARS_1", "GR_STARS_PROGRAM_0", "GR_STARS_PROGRAM_1", "GR_STARS_PROGRAM_2", "GR_STARS_PROGRAM_3", "GR_TILE_0", "GR_TILE_1", "GR_TILE_2", "GR_TOP_TRAVEL_0", "GR_TOP_TRAVEL_1", "GR_TRAVEL_0", "GR_TRAVEL_1", "GR_TRAVEL_2", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UniGradientColors {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UniGradientColors[] $VALUES;
    public static final UniGradientColors GR_DELIVERY_0 = new UniGradientColors("GR_DELIVERY_0", 0, "grDelivery0", R$color.gr_delivery_0);
    public static final UniGradientColors GR_DELIVERY_1 = new UniGradientColors("GR_DELIVERY_1", 1, "grDelivery1", R$color.gr_delivery_1);
    public static final UniGradientColors GR_DELIVERY_2 = new UniGradientColors("GR_DELIVERY_2", 2, "grDelivery2", R$color.gr_delivery_2);
    public static final UniGradientColors GR_DELIVERY_3 = new UniGradientColors("GR_DELIVERY_3", 3, "grDelivery3", R$color.gr_delivery_3);
    public static final UniGradientColors GR_FADE_HORIZONTAL_FLOOR_1_0 = new UniGradientColors("GR_FADE_HORIZONTAL_FLOOR_1_0", 4, "grFadeHorizontalFloor10", R$color.gr_fade_horizontal_floor_1_0);
    public static final UniGradientColors GR_FADE_HORIZONTAL_FLOOR_1_1 = new UniGradientColors("GR_FADE_HORIZONTAL_FLOOR_1_1", 5, "grFadeHorizontalFloor11", R$color.gr_fade_horizontal_floor_1_1);
    public static final UniGradientColors GR_FAVOURITE_PROMO_BANNER_0 = new UniGradientColors("GR_FAVOURITE_PROMO_BANNER_0", 6, "grFavouritePromoBanner0", R$color.gr_favourite_promo_banner_0);
    public static final UniGradientColors GR_FAVOURITE_PROMO_BANNER_1 = new UniGradientColors("GR_FAVOURITE_PROMO_BANNER_1", 7, "grFavouritePromoBanner1", R$color.gr_favourite_promo_banner_1);
    public static final UniGradientColors GR_FAVOURITE_PROMO_FADE_0 = new UniGradientColors("GR_FAVOURITE_PROMO_FADE_0", 8, "grFavouritePromoFade0", R$color.gr_favourite_promo_fade_0);
    public static final UniGradientColors GR_FAVOURITE_PROMO_FADE_1 = new UniGradientColors("GR_FAVOURITE_PROMO_FADE_1", 9, "grFavouritePromoFade1", R$color.gr_favourite_promo_fade_1);
    public static final UniGradientColors GR_FRESH_0 = new UniGradientColors("GR_FRESH_0", 10, "grFresh0", R$color.gr_fresh_0);
    public static final UniGradientColors GR_FRESH_1 = new UniGradientColors("GR_FRESH_1", 11, "grFresh1", R$color.gr_fresh_1);
    public static final UniGradientColors GR_FRESH_SKU_SCROLL_0 = new UniGradientColors("GR_FRESH_SKU_SCROLL_0", 12, "grFreshSkuScroll0", R$color.gr_fresh_sku_scroll_0);
    public static final UniGradientColors GR_FRESH_SKU_SCROLL_1 = new UniGradientColors("GR_FRESH_SKU_SCROLL_1", 13, "grFreshSkuScroll1", R$color.gr_fresh_sku_scroll_1);
    public static final UniGradientColors GR_FRESH_SKU_SCROLL_2 = new UniGradientColors("GR_FRESH_SKU_SCROLL_2", 14, "grFreshSkuScroll2", R$color.gr_fresh_sku_scroll_2);
    public static final UniGradientColors GR_GIFT_0 = new UniGradientColors("GR_GIFT_0", 15, "grGift0", R$color.gr_gift_0);
    public static final UniGradientColors GR_GIFT_1 = new UniGradientColors("GR_GIFT_1", 16, "grGift1", R$color.gr_gift_1);
    public static final UniGradientColors GR_HIGH_DEMAND_DELIVERY_0 = new UniGradientColors("GR_HIGH_DEMAND_DELIVERY_0", 17, "grHighDemandDelivery0", R$color.gr_high_demand_delivery_0);
    public static final UniGradientColors GR_HIGH_DEMAND_DELIVERY_1 = new UniGradientColors("GR_HIGH_DEMAND_DELIVERY_1", 18, "grHighDemandDelivery1", R$color.gr_high_demand_delivery_1);
    public static final UniGradientColors GR_LIKEZON_EXPRESS_PRIMARY_0 = new UniGradientColors("GR_LIKEZON_EXPRESS_PRIMARY_0", 19, "grLikezonExpressPrimary0", R$color.gr_likezon_express_primary_0);
    public static final UniGradientColors GR_LIKEZON_EXPRESS_PRIMARY_1 = new UniGradientColors("GR_LIKEZON_EXPRESS_PRIMARY_1", 20, "grLikezonExpressPrimary1", R$color.gr_likezon_express_primary_1);
    public static final UniGradientColors GR_LIKEZON_EXPRESS_PRIMARY_2 = new UniGradientColors("GR_LIKEZON_EXPRESS_PRIMARY_2", 21, "grLikezonExpressPrimary2", R$color.gr_likezon_express_primary_2);
    public static final UniGradientColors GR_LIKEZON_EXPRESS_SECONDARY_0 = new UniGradientColors("GR_LIKEZON_EXPRESS_SECONDARY_0", 22, "grLikezonExpressSecondary0", R$color.gr_likezon_express_secondary_0);
    public static final UniGradientColors GR_LIKEZON_EXPRESS_SECONDARY_1 = new UniGradientColors("GR_LIKEZON_EXPRESS_SECONDARY_1", 23, "grLikezonExpressSecondary1", R$color.gr_likezon_express_secondary_1);
    public static final UniGradientColors GR_LIKEZON_EXPRESS_SECONDARY_2 = new UniGradientColors("GR_LIKEZON_EXPRESS_SECONDARY_2", 24, "grLikezonExpressSecondary2", R$color.gr_likezon_express_secondary_2);
    public static final UniGradientColors GR_LIKEZON_FRESH_PRIMARY_0 = new UniGradientColors("GR_LIKEZON_FRESH_PRIMARY_0", 25, "grLikezonFreshPrimary0", R$color.gr_likezon_fresh_primary_0);
    public static final UniGradientColors GR_LIKEZON_FRESH_PRIMARY_1 = new UniGradientColors("GR_LIKEZON_FRESH_PRIMARY_1", 26, "grLikezonFreshPrimary1", R$color.gr_likezon_fresh_primary_1);
    public static final UniGradientColors GR_LIKEZON_FRESH_PRIMARY_2 = new UniGradientColors("GR_LIKEZON_FRESH_PRIMARY_2", 27, "grLikezonFreshPrimary2", R$color.gr_likezon_fresh_primary_2);
    public static final UniGradientColors GR_LIKEZON_FRESH_SECONDARY_0 = new UniGradientColors("GR_LIKEZON_FRESH_SECONDARY_0", 28, "grLikezonFreshSecondary0", R$color.gr_likezon_fresh_secondary_0);
    public static final UniGradientColors GR_LIKEZON_FRESH_SECONDARY_1 = new UniGradientColors("GR_LIKEZON_FRESH_SECONDARY_1", 29, "grLikezonFreshSecondary1", R$color.gr_likezon_fresh_secondary_1);
    public static final UniGradientColors GR_LIKEZON_FRESH_SECONDARY_2 = new UniGradientColors("GR_LIKEZON_FRESH_SECONDARY_2", 30, "grLikezonFreshSecondary2", R$color.gr_likezon_fresh_secondary_2);
    public static final UniGradientColors GR_LIKEZON_IN_CART_0 = new UniGradientColors("GR_LIKEZON_IN_CART_0", 31, "grLikezonInCart0", R$color.gr_likezon_in_cart_0);
    public static final UniGradientColors GR_LIKEZON_IN_CART_1 = new UniGradientColors("GR_LIKEZON_IN_CART_1", 32, "grLikezonInCart1", R$color.gr_likezon_in_cart_1);
    public static final UniGradientColors GR_LIKEZON_IN_CART_2 = new UniGradientColors("GR_LIKEZON_IN_CART_2", 33, "grLikezonInCart2", R$color.gr_likezon_in_cart_2);
    public static final UniGradientColors GR_LIKEZON_OZON_PRIMARY_0 = new UniGradientColors("GR_LIKEZON_OZON_PRIMARY_0", 34, "grLikezonOzonPrimary0", R$color.gr_likezon_ozon_primary_0);
    public static final UniGradientColors GR_LIKEZON_OZON_PRIMARY_1 = new UniGradientColors("GR_LIKEZON_OZON_PRIMARY_1", 35, "grLikezonOzonPrimary1", R$color.gr_likezon_ozon_primary_1);
    public static final UniGradientColors GR_LIKEZON_OZON_PRIMARY_2 = new UniGradientColors("GR_LIKEZON_OZON_PRIMARY_2", 36, "grLikezonOzonPrimary2", R$color.gr_likezon_ozon_primary_2);
    public static final UniGradientColors GR_LIKEZON_OZON_SECONDARY_0 = new UniGradientColors("GR_LIKEZON_OZON_SECONDARY_0", 37, "grLikezonOzonSecondary0", R$color.gr_likezon_ozon_secondary_0);
    public static final UniGradientColors GR_LIKEZON_OZON_SECONDARY_1 = new UniGradientColors("GR_LIKEZON_OZON_SECONDARY_1", 38, "grLikezonOzonSecondary1", R$color.gr_likezon_ozon_secondary_1);
    public static final UniGradientColors GR_LIKEZON_OZON_SECONDARY_2 = new UniGradientColors("GR_LIKEZON_OZON_SECONDARY_2", 39, "grLikezonOzonSecondary2", R$color.gr_likezon_ozon_secondary_2);
    public static final UniGradientColors GR_LOW_DEMAND_DELIVERY_0 = new UniGradientColors("GR_LOW_DEMAND_DELIVERY_0", 40, "grLowDemandDelivery0", R$color.gr_low_demand_delivery_0);
    public static final UniGradientColors GR_LOW_DEMAND_DELIVERY_1 = new UniGradientColors("GR_LOW_DEMAND_DELIVERY_1", 41, "grLowDemandDelivery1", R$color.gr_low_demand_delivery_1);
    public static final UniGradientColors GR_MARKETING_PRIMARY_0 = new UniGradientColors("GR_MARKETING_PRIMARY_0", 42, "grMarketingPrimary0", R$color.gr_marketing_primary_0);
    public static final UniGradientColors GR_MARKETING_PRIMARY_1 = new UniGradientColors("GR_MARKETING_PRIMARY_1", 43, "grMarketingPrimary1", R$color.gr_marketing_primary_1);
    public static final UniGradientColors GR_OVERLAY_LIVE_0 = new UniGradientColors("GR_OVERLAY_LIVE_0", 44, "grOverlayLive0", R$color.gr_overlay_live_0);
    public static final UniGradientColors GR_OVERLAY_LIVE_1 = new UniGradientColors("GR_OVERLAY_LIVE_1", 45, "grOverlayLive1", R$color.gr_overlay_live_1);
    public static final UniGradientColors GR_OVERLAY_PRIMARY_0 = new UniGradientColors("GR_OVERLAY_PRIMARY_0", 46, "grOverlayPrimary0", R$color.gr_overlay_primary_0);
    public static final UniGradientColors GR_OVERLAY_PRIMARY_1 = new UniGradientColors("GR_OVERLAY_PRIMARY_1", 47, "grOverlayPrimary1", R$color.gr_overlay_primary_1);
    public static final UniGradientColors GR_OVERLAY_TERTIARY_REVERSED_0 = new UniGradientColors("GR_OVERLAY_TERTIARY_REVERSED_0", 48, "grOverlayTertiaryReversed0", R$color.gr_overlay_tertiary_reversed_0);
    public static final UniGradientColors GR_OVERLAY_TERTIARY_REVERSED_1 = new UniGradientColors("GR_OVERLAY_TERTIARY_REVERSED_1", 49, "grOverlayTertiaryReversed1", R$color.gr_overlay_tertiary_reversed_1);
    public static final UniGradientColors GR_OZON_CARD_0 = new UniGradientColors("GR_OZON_CARD_0", 50, "grOzonCard0", R$color.gr_ozon_card_0);
    public static final UniGradientColors GR_OZON_CARD_1 = new UniGradientColors("GR_OZON_CARD_1", 51, "grOzonCard1", R$color.gr_ozon_card_1);
    public static final UniGradientColors GR_PREMIUM_0 = new UniGradientColors("GR_PREMIUM_0", 52, "grPremium0", R$color.gr_premium_0);
    public static final UniGradientColors GR_PREMIUM_1 = new UniGradientColors("GR_PREMIUM_1", 53, "grPremium1", R$color.gr_premium_1);
    public static final UniGradientColors GR_PREMIUM_2 = new UniGradientColors("GR_PREMIUM_2", 54, "grPremium2", R$color.gr_premium_2);
    public static final UniGradientColors GR_PREMIUM_PLUS_0 = new UniGradientColors("GR_PREMIUM_PLUS_0", 55, "grPremiumPlus0", R$color.gr_premium_plus_0);
    public static final UniGradientColors GR_PREMIUM_PLUS_1 = new UniGradientColors("GR_PREMIUM_PLUS_1", 56, "grPremiumPlus1", R$color.gr_premium_plus_1);
    public static final UniGradientColors GR_PREMIUM_PLUS_2 = new UniGradientColors("GR_PREMIUM_PLUS_2", 57, "grPremiumPlus2", R$color.gr_premium_plus_2);
    public static final UniGradientColors GR_PREMIUM_PRO_0 = new UniGradientColors("GR_PREMIUM_PRO_0", 58, "grPremiumPro0", R$color.gr_premium_pro_0);
    public static final UniGradientColors GR_PREMIUM_PRO_1 = new UniGradientColors("GR_PREMIUM_PRO_1", 59, "grPremiumPro1", R$color.gr_premium_pro_1);
    public static final UniGradientColors GR_PREMIUM_PRO_2 = new UniGradientColors("GR_PREMIUM_PRO_2", 60, "grPremiumPro2", R$color.gr_premium_pro_2);
    public static final UniGradientColors GR_PREMIUM_PRO_TRANSPARENT_0 = new UniGradientColors("GR_PREMIUM_PRO_TRANSPARENT_0", 61, "grPremiumProTransparent0", R$color.gr_premium_pro_transparent_0);
    public static final UniGradientColors GR_PREMIUM_PRO_TRANSPARENT_1 = new UniGradientColors("GR_PREMIUM_PRO_TRANSPARENT_1", 62, "grPremiumProTransparent1", R$color.gr_premium_pro_transparent_1);
    public static final UniGradientColors GR_PREMIUM_PRO_TRANSPARENT_2 = new UniGradientColors("GR_PREMIUM_PRO_TRANSPARENT_2", 63, "grPremiumProTransparent2", R$color.gr_premium_pro_transparent_2);
    public static final UniGradientColors GR_SALE_0 = new UniGradientColors("GR_SALE_0", 64, "grSale0", R$color.gr_sale_0);
    public static final UniGradientColors GR_SALE_1 = new UniGradientColors("GR_SALE_1", 65, "grSale1", R$color.gr_sale_1);
    public static final UniGradientColors GR_SBER_PAY_0 = new UniGradientColors("GR_SBER_PAY_0", 66, "grSberPay0", R$color.gr_sber_pay_0);
    public static final UniGradientColors GR_SBER_PAY_1 = new UniGradientColors("GR_SBER_PAY_1", 67, "grSberPay1", R$color.gr_sber_pay_1);
    public static final UniGradientColors GR_SBER_PAY_2 = new UniGradientColors("GR_SBER_PAY_2", 68, "grSberPay2", R$color.gr_sber_pay_2);
    public static final UniGradientColors GR_SBER_PAY_3 = new UniGradientColors("GR_SBER_PAY_3", 69, "grSberPay3", R$color.gr_sber_pay_3);
    public static final UniGradientColors GR_SBER_PAY_4 = new UniGradientColors("GR_SBER_PAY_4", 70, "grSberPay4", R$color.gr_sber_pay_4);
    public static final UniGradientColors GR_SELECT_FADE_0 = new UniGradientColors("GR_SELECT_FADE_0", 71, "grSelectFade0", R$color.gr_select_fade_0);
    public static final UniGradientColors GR_SELECT_FADE_1 = new UniGradientColors("GR_SELECT_FADE_1", 72, "grSelectFade1", R$color.gr_select_fade_1);
    public static final UniGradientColors GR_SELECT_INSTALLMENT_0 = new UniGradientColors("GR_SELECT_INSTALLMENT_0", 73, "grSelectInstallment0", R$color.gr_select_installment_0);
    public static final UniGradientColors GR_SELECT_INSTALLMENT_1 = new UniGradientColors("GR_SELECT_INSTALLMENT_1", 74, "grSelectInstallment1", R$color.gr_select_installment_1);
    public static final UniGradientColors GR_SOCIAL_PRIMARY_0 = new UniGradientColors("GR_SOCIAL_PRIMARY_0", 75, "grSocialPrimary0", R$color.gr_social_primary_0);
    public static final UniGradientColors GR_SOCIAL_PRIMARY_1 = new UniGradientColors("GR_SOCIAL_PRIMARY_1", 76, "grSocialPrimary1", R$color.gr_social_primary_1);
    public static final UniGradientColors GR_SOCIAL_SECONDARY_0 = new UniGradientColors("GR_SOCIAL_SECONDARY_0", 77, "grSocialSecondary0", R$color.gr_social_secondary_0);
    public static final UniGradientColors GR_SOCIAL_SECONDARY_1 = new UniGradientColors("GR_SOCIAL_SECONDARY_1", 78, "grSocialSecondary1", R$color.gr_social_secondary_1);
    public static final UniGradientColors GR_STARS_0 = new UniGradientColors("GR_STARS_0", 79, "grStars0", R$color.gr_stars_0);
    public static final UniGradientColors GR_STARS_1 = new UniGradientColors("GR_STARS_1", 80, "grStars1", R$color.gr_stars_1);
    public static final UniGradientColors GR_STARS_PROGRAM_0 = new UniGradientColors("GR_STARS_PROGRAM_0", 81, "grStarsProgram0", R$color.gr_stars_program_0);
    public static final UniGradientColors GR_STARS_PROGRAM_1 = new UniGradientColors("GR_STARS_PROGRAM_1", 82, "grStarsProgram1", R$color.gr_stars_program_1);
    public static final UniGradientColors GR_STARS_PROGRAM_2 = new UniGradientColors("GR_STARS_PROGRAM_2", 83, "grStarsProgram2", R$color.gr_stars_program_2);
    public static final UniGradientColors GR_STARS_PROGRAM_3 = new UniGradientColors("GR_STARS_PROGRAM_3", 84, "grStarsProgram3", R$color.gr_stars_program_3);
    public static final UniGradientColors GR_TILE_0 = new UniGradientColors("GR_TILE_0", 85, "grTile0", R$color.gr_tile_0);
    public static final UniGradientColors GR_TILE_1 = new UniGradientColors("GR_TILE_1", 86, "grTile1", R$color.gr_tile_1);
    public static final UniGradientColors GR_TILE_2 = new UniGradientColors("GR_TILE_2", 87, "grTile2", R$color.gr_tile_2);
    public static final UniGradientColors GR_TOP_TRAVEL_0 = new UniGradientColors("GR_TOP_TRAVEL_0", 88, "grTopTravel0", R$color.gr_top_travel_0);
    public static final UniGradientColors GR_TOP_TRAVEL_1 = new UniGradientColors("GR_TOP_TRAVEL_1", 89, "grTopTravel1", R$color.gr_top_travel_1);
    public static final UniGradientColors GR_TRAVEL_0 = new UniGradientColors("GR_TRAVEL_0", 90, "grTravel0", R$color.gr_travel_0);
    public static final UniGradientColors GR_TRAVEL_1 = new UniGradientColors("GR_TRAVEL_1", 91, "grTravel1", R$color.gr_travel_1);
    public static final UniGradientColors GR_TRAVEL_2 = new UniGradientColors("GR_TRAVEL_2", 92, "grTravel2", R$color.gr_travel_2);
    private final int resId;

    @NotNull
    private final String token;

    private static final /* synthetic */ UniGradientColors[] $values() {
        return new UniGradientColors[]{GR_DELIVERY_0, GR_DELIVERY_1, GR_DELIVERY_2, GR_DELIVERY_3, GR_FADE_HORIZONTAL_FLOOR_1_0, GR_FADE_HORIZONTAL_FLOOR_1_1, GR_FAVOURITE_PROMO_BANNER_0, GR_FAVOURITE_PROMO_BANNER_1, GR_FAVOURITE_PROMO_FADE_0, GR_FAVOURITE_PROMO_FADE_1, GR_FRESH_0, GR_FRESH_1, GR_FRESH_SKU_SCROLL_0, GR_FRESH_SKU_SCROLL_1, GR_FRESH_SKU_SCROLL_2, GR_GIFT_0, GR_GIFT_1, GR_HIGH_DEMAND_DELIVERY_0, GR_HIGH_DEMAND_DELIVERY_1, GR_LIKEZON_EXPRESS_PRIMARY_0, GR_LIKEZON_EXPRESS_PRIMARY_1, GR_LIKEZON_EXPRESS_PRIMARY_2, GR_LIKEZON_EXPRESS_SECONDARY_0, GR_LIKEZON_EXPRESS_SECONDARY_1, GR_LIKEZON_EXPRESS_SECONDARY_2, GR_LIKEZON_FRESH_PRIMARY_0, GR_LIKEZON_FRESH_PRIMARY_1, GR_LIKEZON_FRESH_PRIMARY_2, GR_LIKEZON_FRESH_SECONDARY_0, GR_LIKEZON_FRESH_SECONDARY_1, GR_LIKEZON_FRESH_SECONDARY_2, GR_LIKEZON_IN_CART_0, GR_LIKEZON_IN_CART_1, GR_LIKEZON_IN_CART_2, GR_LIKEZON_OZON_PRIMARY_0, GR_LIKEZON_OZON_PRIMARY_1, GR_LIKEZON_OZON_PRIMARY_2, GR_LIKEZON_OZON_SECONDARY_0, GR_LIKEZON_OZON_SECONDARY_1, GR_LIKEZON_OZON_SECONDARY_2, GR_LOW_DEMAND_DELIVERY_0, GR_LOW_DEMAND_DELIVERY_1, GR_MARKETING_PRIMARY_0, GR_MARKETING_PRIMARY_1, GR_OVERLAY_LIVE_0, GR_OVERLAY_LIVE_1, GR_OVERLAY_PRIMARY_0, GR_OVERLAY_PRIMARY_1, GR_OVERLAY_TERTIARY_REVERSED_0, GR_OVERLAY_TERTIARY_REVERSED_1, GR_OZON_CARD_0, GR_OZON_CARD_1, GR_PREMIUM_0, GR_PREMIUM_1, GR_PREMIUM_2, GR_PREMIUM_PLUS_0, GR_PREMIUM_PLUS_1, GR_PREMIUM_PLUS_2, GR_PREMIUM_PRO_0, GR_PREMIUM_PRO_1, GR_PREMIUM_PRO_2, GR_PREMIUM_PRO_TRANSPARENT_0, GR_PREMIUM_PRO_TRANSPARENT_1, GR_PREMIUM_PRO_TRANSPARENT_2, GR_SALE_0, GR_SALE_1, GR_SBER_PAY_0, GR_SBER_PAY_1, GR_SBER_PAY_2, GR_SBER_PAY_3, GR_SBER_PAY_4, GR_SELECT_FADE_0, GR_SELECT_FADE_1, GR_SELECT_INSTALLMENT_0, GR_SELECT_INSTALLMENT_1, GR_SOCIAL_PRIMARY_0, GR_SOCIAL_PRIMARY_1, GR_SOCIAL_SECONDARY_0, GR_SOCIAL_SECONDARY_1, GR_STARS_0, GR_STARS_1, GR_STARS_PROGRAM_0, GR_STARS_PROGRAM_1, GR_STARS_PROGRAM_2, GR_STARS_PROGRAM_3, GR_TILE_0, GR_TILE_1, GR_TILE_2, GR_TOP_TRAVEL_0, GR_TOP_TRAVEL_1, GR_TRAVEL_0, GR_TRAVEL_1, GR_TRAVEL_2};
    }

    static {
        UniGradientColors[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private UniGradientColors(String str, int i11, String str2, int i12) {
        this.token = str2;
        this.resId = i12;
    }

    @NotNull
    public static a<UniGradientColors> getEntries() {
        return $ENTRIES;
    }

    public static UniGradientColors valueOf(String str) {
        return (UniGradientColors) Enum.valueOf(UniGradientColors.class, str);
    }

    public static UniGradientColors[] values() {
        return (UniGradientColors[]) $VALUES.clone();
    }

    public final int getResId() {
        return this.resId;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }
}
