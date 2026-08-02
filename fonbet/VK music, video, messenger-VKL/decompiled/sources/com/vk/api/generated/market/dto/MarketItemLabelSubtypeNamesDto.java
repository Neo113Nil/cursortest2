package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4572u;
import com.unity3d.ads.BuildConfig;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketItemLabelSubtypeNamesDto.kt */
/* loaded from: classes15.dex */
public final class MarketItemLabelSubtypeNamesDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketItemLabelSubtypeNamesDto[] $VALUES;

    @pmi0("cart_price")
    public static final MarketItemLabelSubtypeNamesDto CART_PRICE;
    public static final Parcelable.Creator<MarketItemLabelSubtypeNamesDto> CREATOR;

    @pmi0(BuildConfig.FLAVOR)
    public static final MarketItemLabelSubtypeNamesDto DEFAULT;

    @pmi0(C4572u.g)
    public static final MarketItemLabelSubtypeNamesDto DELIVERY;

    @pmi0("fomo_bookmarks")
    public static final MarketItemLabelSubtypeNamesDto FOMO_BOOKMARKS;

    @pmi0("fomo_friends_purchases")
    public static final MarketItemLabelSubtypeNamesDto FOMO_FRIENDS_PURCHASES;

    @pmi0("fomo_friends_views")
    public static final MarketItemLabelSubtypeNamesDto FOMO_FRIENDS_VIEWS;

    @pmi0("fomo_good_seller")
    public static final MarketItemLabelSubtypeNamesDto FOMO_GOOD_SELLER;

    @pmi0("fomo_popular")
    public static final MarketItemLabelSubtypeNamesDto FOMO_POPULAR;

    @pmi0("fomo_popular_seller")
    public static final MarketItemLabelSubtypeNamesDto FOMO_POPULAR_SELLER;

    @pmi0("fomo_purchases")
    public static final MarketItemLabelSubtypeNamesDto FOMO_PURCHASES;

    @pmi0("fomo_views")
    public static final MarketItemLabelSubtypeNamesDto FOMO_VIEWS;

    @pmi0("integration_onboarding")
    public static final MarketItemLabelSubtypeNamesDto INTEGRATION_ONBOARDING;

    @pmi0("ozon_onboarding")
    public static final MarketItemLabelSubtypeNamesDto OZON_ONBOARDING;

    @pmi0("payment")
    public static final MarketItemLabelSubtypeNamesDto PAYMENT;
    private final String value;

    /* compiled from: MarketItemLabelSubtypeNamesDto.kt */
    public static final class a implements Parcelable.Creator<MarketItemLabelSubtypeNamesDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketItemLabelSubtypeNamesDto createFromParcel(Parcel parcel) {
            return MarketItemLabelSubtypeNamesDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketItemLabelSubtypeNamesDto[] newArray(int i) {
            return new MarketItemLabelSubtypeNamesDto[i];
        }
    }

    static {
        MarketItemLabelSubtypeNamesDto marketItemLabelSubtypeNamesDto = new MarketItemLabelSubtypeNamesDto("DEFAULT", 0, BuildConfig.FLAVOR);
        DEFAULT = marketItemLabelSubtypeNamesDto;
        MarketItemLabelSubtypeNamesDto marketItemLabelSubtypeNamesDto2 = new MarketItemLabelSubtypeNamesDto("DELIVERY", 1, C4572u.g);
        DELIVERY = marketItemLabelSubtypeNamesDto2;
        MarketItemLabelSubtypeNamesDto marketItemLabelSubtypeNamesDto3 = new MarketItemLabelSubtypeNamesDto("PAYMENT", 2, "payment");
        PAYMENT = marketItemLabelSubtypeNamesDto3;
        MarketItemLabelSubtypeNamesDto marketItemLabelSubtypeNamesDto4 = new MarketItemLabelSubtypeNamesDto("CART_PRICE", 3, "cart_price");
        CART_PRICE = marketItemLabelSubtypeNamesDto4;
        MarketItemLabelSubtypeNamesDto marketItemLabelSubtypeNamesDto5 = new MarketItemLabelSubtypeNamesDto("FOMO_VIEWS", 4, "fomo_views");
        FOMO_VIEWS = marketItemLabelSubtypeNamesDto5;
        MarketItemLabelSubtypeNamesDto marketItemLabelSubtypeNamesDto6 = new MarketItemLabelSubtypeNamesDto("FOMO_BOOKMARKS", 5, "fomo_bookmarks");
        FOMO_BOOKMARKS = marketItemLabelSubtypeNamesDto6;
        MarketItemLabelSubtypeNamesDto marketItemLabelSubtypeNamesDto7 = new MarketItemLabelSubtypeNamesDto("FOMO_PURCHASES", 6, "fomo_purchases");
        FOMO_PURCHASES = marketItemLabelSubtypeNamesDto7;
        MarketItemLabelSubtypeNamesDto marketItemLabelSubtypeNamesDto8 = new MarketItemLabelSubtypeNamesDto("FOMO_FRIENDS_VIEWS", 7, "fomo_friends_views");
        FOMO_FRIENDS_VIEWS = marketItemLabelSubtypeNamesDto8;
        MarketItemLabelSubtypeNamesDto marketItemLabelSubtypeNamesDto9 = new MarketItemLabelSubtypeNamesDto("FOMO_FRIENDS_PURCHASES", 8, "fomo_friends_purchases");
        FOMO_FRIENDS_PURCHASES = marketItemLabelSubtypeNamesDto9;
        MarketItemLabelSubtypeNamesDto marketItemLabelSubtypeNamesDto10 = new MarketItemLabelSubtypeNamesDto("FOMO_POPULAR", 9, "fomo_popular");
        FOMO_POPULAR = marketItemLabelSubtypeNamesDto10;
        MarketItemLabelSubtypeNamesDto marketItemLabelSubtypeNamesDto11 = new MarketItemLabelSubtypeNamesDto("OZON_ONBOARDING", 10, "ozon_onboarding");
        OZON_ONBOARDING = marketItemLabelSubtypeNamesDto11;
        MarketItemLabelSubtypeNamesDto marketItemLabelSubtypeNamesDto12 = new MarketItemLabelSubtypeNamesDto("FOMO_POPULAR_SELLER", 11, "fomo_popular_seller");
        FOMO_POPULAR_SELLER = marketItemLabelSubtypeNamesDto12;
        MarketItemLabelSubtypeNamesDto marketItemLabelSubtypeNamesDto13 = new MarketItemLabelSubtypeNamesDto("FOMO_GOOD_SELLER", 12, "fomo_good_seller");
        FOMO_GOOD_SELLER = marketItemLabelSubtypeNamesDto13;
        MarketItemLabelSubtypeNamesDto marketItemLabelSubtypeNamesDto14 = new MarketItemLabelSubtypeNamesDto("INTEGRATION_ONBOARDING", 13, "integration_onboarding");
        INTEGRATION_ONBOARDING = marketItemLabelSubtypeNamesDto14;
        MarketItemLabelSubtypeNamesDto[] marketItemLabelSubtypeNamesDtoArr = {marketItemLabelSubtypeNamesDto, marketItemLabelSubtypeNamesDto2, marketItemLabelSubtypeNamesDto3, marketItemLabelSubtypeNamesDto4, marketItemLabelSubtypeNamesDto5, marketItemLabelSubtypeNamesDto6, marketItemLabelSubtypeNamesDto7, marketItemLabelSubtypeNamesDto8, marketItemLabelSubtypeNamesDto9, marketItemLabelSubtypeNamesDto10, marketItemLabelSubtypeNamesDto11, marketItemLabelSubtypeNamesDto12, marketItemLabelSubtypeNamesDto13, marketItemLabelSubtypeNamesDto14};
        $VALUES = marketItemLabelSubtypeNamesDtoArr;
        $ENTRIES = new asp(marketItemLabelSubtypeNamesDtoArr);
        CREATOR = new a();
    }

    private MarketItemLabelSubtypeNamesDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MarketItemLabelSubtypeNamesDto valueOf(String str) {
        return (MarketItemLabelSubtypeNamesDto) Enum.valueOf(MarketItemLabelSubtypeNamesDto.class, str);
    }

    public static MarketItemLabelSubtypeNamesDto[] values() {
        return (MarketItemLabelSubtypeNamesDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
