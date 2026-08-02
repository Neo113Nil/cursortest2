package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.Gc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketItemLabelSubtypeDto.kt */
/* loaded from: classes15.dex */
public final class MarketItemLabelSubtypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketItemLabelSubtypeDto[] $VALUES;

    @pmi0("3")
    public static final MarketItemLabelSubtypeDto CART_PRICE;
    public static final Parcelable.Creator<MarketItemLabelSubtypeDto> CREATOR;

    @pmi0("0")
    public static final MarketItemLabelSubtypeDto DEFAULT;

    @pmi0("1")
    public static final MarketItemLabelSubtypeDto DELIVERY;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final MarketItemLabelSubtypeDto FOMO_BOOKMARKS;

    @pmi0("8")
    public static final MarketItemLabelSubtypeDto FOMO_FRIENDS_PURCHASES;

    @pmi0(Gc.e)
    public static final MarketItemLabelSubtypeDto FOMO_FRIENDS_VIEWS;

    @pmi0("12")
    public static final MarketItemLabelSubtypeDto FOMO_GOOD_SELLER;

    @pmi0("9")
    public static final MarketItemLabelSubtypeDto FOMO_POPULAR;

    @pmi0("11")
    public static final MarketItemLabelSubtypeDto FOMO_POPULAR_SELLER;

    @pmi0("6")
    public static final MarketItemLabelSubtypeDto FOMO_PURCHASES;

    @pmi0("4")
    public static final MarketItemLabelSubtypeDto FOMO_VIEWS;

    @pmi0("13")
    public static final MarketItemLabelSubtypeDto INTEGRATION_ONBOARDING;

    @pmi0("10")
    public static final MarketItemLabelSubtypeDto OZON_ONBOARDING;

    @pmi0("2")
    public static final MarketItemLabelSubtypeDto PAYMENT;
    private final int value;

    /* compiled from: MarketItemLabelSubtypeDto.kt */
    public static final class a implements Parcelable.Creator<MarketItemLabelSubtypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketItemLabelSubtypeDto createFromParcel(Parcel parcel) {
            return MarketItemLabelSubtypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketItemLabelSubtypeDto[] newArray(int i) {
            return new MarketItemLabelSubtypeDto[i];
        }
    }

    static {
        MarketItemLabelSubtypeDto marketItemLabelSubtypeDto = new MarketItemLabelSubtypeDto("DEFAULT", 0, 0);
        DEFAULT = marketItemLabelSubtypeDto;
        MarketItemLabelSubtypeDto marketItemLabelSubtypeDto2 = new MarketItemLabelSubtypeDto("DELIVERY", 1, 1);
        DELIVERY = marketItemLabelSubtypeDto2;
        MarketItemLabelSubtypeDto marketItemLabelSubtypeDto3 = new MarketItemLabelSubtypeDto("PAYMENT", 2, 2);
        PAYMENT = marketItemLabelSubtypeDto3;
        MarketItemLabelSubtypeDto marketItemLabelSubtypeDto4 = new MarketItemLabelSubtypeDto("CART_PRICE", 3, 3);
        CART_PRICE = marketItemLabelSubtypeDto4;
        MarketItemLabelSubtypeDto marketItemLabelSubtypeDto5 = new MarketItemLabelSubtypeDto("FOMO_VIEWS", 4, 4);
        FOMO_VIEWS = marketItemLabelSubtypeDto5;
        MarketItemLabelSubtypeDto marketItemLabelSubtypeDto6 = new MarketItemLabelSubtypeDto("FOMO_BOOKMARKS", 5, 5);
        FOMO_BOOKMARKS = marketItemLabelSubtypeDto6;
        MarketItemLabelSubtypeDto marketItemLabelSubtypeDto7 = new MarketItemLabelSubtypeDto("FOMO_PURCHASES", 6, 6);
        FOMO_PURCHASES = marketItemLabelSubtypeDto7;
        MarketItemLabelSubtypeDto marketItemLabelSubtypeDto8 = new MarketItemLabelSubtypeDto("FOMO_FRIENDS_VIEWS", 7, 7);
        FOMO_FRIENDS_VIEWS = marketItemLabelSubtypeDto8;
        MarketItemLabelSubtypeDto marketItemLabelSubtypeDto9 = new MarketItemLabelSubtypeDto("FOMO_FRIENDS_PURCHASES", 8, 8);
        FOMO_FRIENDS_PURCHASES = marketItemLabelSubtypeDto9;
        MarketItemLabelSubtypeDto marketItemLabelSubtypeDto10 = new MarketItemLabelSubtypeDto("FOMO_POPULAR", 9, 9);
        FOMO_POPULAR = marketItemLabelSubtypeDto10;
        MarketItemLabelSubtypeDto marketItemLabelSubtypeDto11 = new MarketItemLabelSubtypeDto("OZON_ONBOARDING", 10, 10);
        OZON_ONBOARDING = marketItemLabelSubtypeDto11;
        MarketItemLabelSubtypeDto marketItemLabelSubtypeDto12 = new MarketItemLabelSubtypeDto("FOMO_POPULAR_SELLER", 11, 11);
        FOMO_POPULAR_SELLER = marketItemLabelSubtypeDto12;
        MarketItemLabelSubtypeDto marketItemLabelSubtypeDto13 = new MarketItemLabelSubtypeDto("FOMO_GOOD_SELLER", 12, 12);
        FOMO_GOOD_SELLER = marketItemLabelSubtypeDto13;
        MarketItemLabelSubtypeDto marketItemLabelSubtypeDto14 = new MarketItemLabelSubtypeDto("INTEGRATION_ONBOARDING", 13, 13);
        INTEGRATION_ONBOARDING = marketItemLabelSubtypeDto14;
        MarketItemLabelSubtypeDto[] marketItemLabelSubtypeDtoArr = {marketItemLabelSubtypeDto, marketItemLabelSubtypeDto2, marketItemLabelSubtypeDto3, marketItemLabelSubtypeDto4, marketItemLabelSubtypeDto5, marketItemLabelSubtypeDto6, marketItemLabelSubtypeDto7, marketItemLabelSubtypeDto8, marketItemLabelSubtypeDto9, marketItemLabelSubtypeDto10, marketItemLabelSubtypeDto11, marketItemLabelSubtypeDto12, marketItemLabelSubtypeDto13, marketItemLabelSubtypeDto14};
        $VALUES = marketItemLabelSubtypeDtoArr;
        $ENTRIES = new asp(marketItemLabelSubtypeDtoArr);
        CREATOR = new a();
    }

    private MarketItemLabelSubtypeDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketItemLabelSubtypeDto valueOf(String str) {
        return (MarketItemLabelSubtypeDto) Enum.valueOf(MarketItemLabelSubtypeDto.class, str);
    }

    public static MarketItemLabelSubtypeDto[] values() {
        return (MarketItemLabelSubtypeDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
