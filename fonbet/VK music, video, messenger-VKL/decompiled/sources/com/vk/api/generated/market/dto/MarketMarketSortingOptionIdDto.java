package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.BuildConfig;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketMarketSortingOptionIdDto.kt */
/* loaded from: classes15.dex */
public final class MarketMarketSortingOptionIdDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketMarketSortingOptionIdDto[] $VALUES;

    @pmi0("classifieds.date.desc")
    public static final MarketMarketSortingOptionIdDto CLASSIFIEDS_DATE_DESC;

    @pmi0("classifieds.default.desc")
    public static final MarketMarketSortingOptionIdDto CLASSIFIEDS_DEFAULT_DESC;

    @pmi0("classifieds.distance.asc")
    public static final MarketMarketSortingOptionIdDto CLASSIFIEDS_DISTANCE_ASC;

    @pmi0("classifieds.price.asc")
    public static final MarketMarketSortingOptionIdDto CLASSIFIEDS_PRICE_ASC;

    @pmi0("classifieds.price.desc")
    public static final MarketMarketSortingOptionIdDto CLASSIFIEDS_PRICE_DESC;
    public static final Parcelable.Creator<MarketMarketSortingOptionIdDto> CREATOR;

    @pmi0(BuildConfig.FLAVOR)
    public static final MarketMarketSortingOptionIdDto DEFAULT;

    @pmi0("market.date.desc")
    public static final MarketMarketSortingOptionIdDto MARKET_DATE_DESC;

    @pmi0("market.price.asc")
    public static final MarketMarketSortingOptionIdDto MARKET_PRICE_ASC;

    @pmi0("market.price.desc")
    public static final MarketMarketSortingOptionIdDto MARKET_PRICE_DESC;

    @pmi0("market.rating.desc")
    public static final MarketMarketSortingOptionIdDto MARKET_RATING_DESC;

    @pmi0("market.relevance.desc")
    public static final MarketMarketSortingOptionIdDto MARKET_RELEVANCE_DESC;
    private final String value;

    /* compiled from: MarketMarketSortingOptionIdDto.kt */
    public static final class a implements Parcelable.Creator<MarketMarketSortingOptionIdDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketMarketSortingOptionIdDto createFromParcel(Parcel parcel) {
            return MarketMarketSortingOptionIdDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketMarketSortingOptionIdDto[] newArray(int i) {
            return new MarketMarketSortingOptionIdDto[i];
        }
    }

    static {
        MarketMarketSortingOptionIdDto marketMarketSortingOptionIdDto = new MarketMarketSortingOptionIdDto("CLASSIFIEDS_DATE_DESC", 0, "classifieds.date.desc");
        CLASSIFIEDS_DATE_DESC = marketMarketSortingOptionIdDto;
        MarketMarketSortingOptionIdDto marketMarketSortingOptionIdDto2 = new MarketMarketSortingOptionIdDto("CLASSIFIEDS_DEFAULT_DESC", 1, "classifieds.default.desc");
        CLASSIFIEDS_DEFAULT_DESC = marketMarketSortingOptionIdDto2;
        MarketMarketSortingOptionIdDto marketMarketSortingOptionIdDto3 = new MarketMarketSortingOptionIdDto("CLASSIFIEDS_DISTANCE_ASC", 2, "classifieds.distance.asc");
        CLASSIFIEDS_DISTANCE_ASC = marketMarketSortingOptionIdDto3;
        MarketMarketSortingOptionIdDto marketMarketSortingOptionIdDto4 = new MarketMarketSortingOptionIdDto("CLASSIFIEDS_PRICE_ASC", 3, "classifieds.price.asc");
        CLASSIFIEDS_PRICE_ASC = marketMarketSortingOptionIdDto4;
        MarketMarketSortingOptionIdDto marketMarketSortingOptionIdDto5 = new MarketMarketSortingOptionIdDto("CLASSIFIEDS_PRICE_DESC", 4, "classifieds.price.desc");
        CLASSIFIEDS_PRICE_DESC = marketMarketSortingOptionIdDto5;
        MarketMarketSortingOptionIdDto marketMarketSortingOptionIdDto6 = new MarketMarketSortingOptionIdDto("DEFAULT", 5, BuildConfig.FLAVOR);
        DEFAULT = marketMarketSortingOptionIdDto6;
        MarketMarketSortingOptionIdDto marketMarketSortingOptionIdDto7 = new MarketMarketSortingOptionIdDto("MARKET_DATE_DESC", 6, "market.date.desc");
        MARKET_DATE_DESC = marketMarketSortingOptionIdDto7;
        MarketMarketSortingOptionIdDto marketMarketSortingOptionIdDto8 = new MarketMarketSortingOptionIdDto("MARKET_PRICE_ASC", 7, "market.price.asc");
        MARKET_PRICE_ASC = marketMarketSortingOptionIdDto8;
        MarketMarketSortingOptionIdDto marketMarketSortingOptionIdDto9 = new MarketMarketSortingOptionIdDto("MARKET_PRICE_DESC", 8, "market.price.desc");
        MARKET_PRICE_DESC = marketMarketSortingOptionIdDto9;
        MarketMarketSortingOptionIdDto marketMarketSortingOptionIdDto10 = new MarketMarketSortingOptionIdDto("MARKET_RATING_DESC", 9, "market.rating.desc");
        MARKET_RATING_DESC = marketMarketSortingOptionIdDto10;
        MarketMarketSortingOptionIdDto marketMarketSortingOptionIdDto11 = new MarketMarketSortingOptionIdDto("MARKET_RELEVANCE_DESC", 10, "market.relevance.desc");
        MARKET_RELEVANCE_DESC = marketMarketSortingOptionIdDto11;
        MarketMarketSortingOptionIdDto[] marketMarketSortingOptionIdDtoArr = {marketMarketSortingOptionIdDto, marketMarketSortingOptionIdDto2, marketMarketSortingOptionIdDto3, marketMarketSortingOptionIdDto4, marketMarketSortingOptionIdDto5, marketMarketSortingOptionIdDto6, marketMarketSortingOptionIdDto7, marketMarketSortingOptionIdDto8, marketMarketSortingOptionIdDto9, marketMarketSortingOptionIdDto10, marketMarketSortingOptionIdDto11};
        $VALUES = marketMarketSortingOptionIdDtoArr;
        $ENTRIES = new asp(marketMarketSortingOptionIdDtoArr);
        CREATOR = new a();
    }

    private MarketMarketSortingOptionIdDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MarketMarketSortingOptionIdDto valueOf(String str) {
        return (MarketMarketSortingOptionIdDto) Enum.valueOf(MarketMarketSortingOptionIdDto.class, str);
    }

    public static MarketMarketSortingOptionIdDto[] values() {
        return (MarketMarketSortingOptionIdDto[]) $VALUES.clone();
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
