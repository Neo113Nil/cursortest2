package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketGetCategoriesTypeDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetCategoriesTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketGetCategoriesTypeDto[] $VALUES;
    public static final Parcelable.Creator<MarketGetCategoriesTypeDto> CREATOR;

    @pmi0("force_market_v2")
    public static final MarketGetCategoriesTypeDto FORCE_MARKET_V2;

    @pmi0("group")
    public static final MarketGetCategoriesTypeDto GROUP;

    @pmi0("market")
    public static final MarketGetCategoriesTypeDto MARKET;

    @pmi0("marketplace_filtered")
    public static final MarketGetCategoriesTypeDto MARKETPLACE_FILTERED;

    @pmi0("marketplace_filtered_root")
    public static final MarketGetCategoriesTypeDto MARKETPLACE_FILTERED_ROOT;

    @pmi0("market_filtered")
    public static final MarketGetCategoriesTypeDto MARKET_FILTERED;

    @pmi0("market_filtered_root")
    public static final MarketGetCategoriesTypeDto MARKET_FILTERED_ROOT;

    @pmi0("search_filters")
    public static final MarketGetCategoriesTypeDto SEARCH_FILTERS;

    @pmi0("services")
    public static final MarketGetCategoriesTypeDto SERVICES;
    private final String value;

    /* compiled from: MarketGetCategoriesTypeDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetCategoriesTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetCategoriesTypeDto createFromParcel(Parcel parcel) {
            return MarketGetCategoriesTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetCategoriesTypeDto[] newArray(int i) {
            return new MarketGetCategoriesTypeDto[i];
        }
    }

    static {
        MarketGetCategoriesTypeDto marketGetCategoriesTypeDto = new MarketGetCategoriesTypeDto("FORCE_MARKET_V2", 0, "force_market_v2");
        FORCE_MARKET_V2 = marketGetCategoriesTypeDto;
        MarketGetCategoriesTypeDto marketGetCategoriesTypeDto2 = new MarketGetCategoriesTypeDto("GROUP", 1, "group");
        GROUP = marketGetCategoriesTypeDto2;
        MarketGetCategoriesTypeDto marketGetCategoriesTypeDto3 = new MarketGetCategoriesTypeDto("MARKET", 2, "market");
        MARKET = marketGetCategoriesTypeDto3;
        MarketGetCategoriesTypeDto marketGetCategoriesTypeDto4 = new MarketGetCategoriesTypeDto("MARKET_FILTERED", 3, "market_filtered");
        MARKET_FILTERED = marketGetCategoriesTypeDto4;
        MarketGetCategoriesTypeDto marketGetCategoriesTypeDto5 = new MarketGetCategoriesTypeDto("MARKET_FILTERED_ROOT", 4, "market_filtered_root");
        MARKET_FILTERED_ROOT = marketGetCategoriesTypeDto5;
        MarketGetCategoriesTypeDto marketGetCategoriesTypeDto6 = new MarketGetCategoriesTypeDto("MARKETPLACE_FILTERED", 5, "marketplace_filtered");
        MARKETPLACE_FILTERED = marketGetCategoriesTypeDto6;
        MarketGetCategoriesTypeDto marketGetCategoriesTypeDto7 = new MarketGetCategoriesTypeDto("MARKETPLACE_FILTERED_ROOT", 6, "marketplace_filtered_root");
        MARKETPLACE_FILTERED_ROOT = marketGetCategoriesTypeDto7;
        MarketGetCategoriesTypeDto marketGetCategoriesTypeDto8 = new MarketGetCategoriesTypeDto("SEARCH_FILTERS", 7, "search_filters");
        SEARCH_FILTERS = marketGetCategoriesTypeDto8;
        MarketGetCategoriesTypeDto marketGetCategoriesTypeDto9 = new MarketGetCategoriesTypeDto("SERVICES", 8, "services");
        SERVICES = marketGetCategoriesTypeDto9;
        MarketGetCategoriesTypeDto[] marketGetCategoriesTypeDtoArr = {marketGetCategoriesTypeDto, marketGetCategoriesTypeDto2, marketGetCategoriesTypeDto3, marketGetCategoriesTypeDto4, marketGetCategoriesTypeDto5, marketGetCategoriesTypeDto6, marketGetCategoriesTypeDto7, marketGetCategoriesTypeDto8, marketGetCategoriesTypeDto9};
        $VALUES = marketGetCategoriesTypeDtoArr;
        $ENTRIES = new asp(marketGetCategoriesTypeDtoArr);
        CREATOR = new a();
    }

    private MarketGetCategoriesTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MarketGetCategoriesTypeDto valueOf(String str) {
        return (MarketGetCategoriesTypeDto) Enum.valueOf(MarketGetCategoriesTypeDto.class, str);
    }

    public static MarketGetCategoriesTypeDto[] values() {
        return (MarketGetCategoriesTypeDto[]) $VALUES.clone();
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
