package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketMarketItemTypeDto.kt */
/* loaded from: classes15.dex */
public final class MarketMarketItemTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketMarketItemTypeDto[] $VALUES;

    @pmi0("1")
    public static final MarketMarketItemTypeDto ALIEXPRESS;
    public static final Parcelable.Creator<MarketMarketItemTypeDto> CREATOR;

    @pmi0("4")
    public static final MarketMarketItemTypeDto INTEGRATION;

    @pmi0("3")
    public static final MarketMarketItemTypeDto OZON;

    @pmi0("0")
    public static final MarketMarketItemTypeDto VK;

    @pmi0("2")
    public static final MarketMarketItemTypeDto YOULA;
    private final int value;

    /* compiled from: MarketMarketItemTypeDto.kt */
    public static final class a implements Parcelable.Creator<MarketMarketItemTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketMarketItemTypeDto createFromParcel(Parcel parcel) {
            return MarketMarketItemTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketMarketItemTypeDto[] newArray(int i) {
            return new MarketMarketItemTypeDto[i];
        }
    }

    static {
        MarketMarketItemTypeDto marketMarketItemTypeDto = new MarketMarketItemTypeDto("VK", 0, 0);
        VK = marketMarketItemTypeDto;
        MarketMarketItemTypeDto marketMarketItemTypeDto2 = new MarketMarketItemTypeDto("ALIEXPRESS", 1, 1);
        ALIEXPRESS = marketMarketItemTypeDto2;
        MarketMarketItemTypeDto marketMarketItemTypeDto3 = new MarketMarketItemTypeDto("YOULA", 2, 2);
        YOULA = marketMarketItemTypeDto3;
        MarketMarketItemTypeDto marketMarketItemTypeDto4 = new MarketMarketItemTypeDto("OZON", 3, 3);
        OZON = marketMarketItemTypeDto4;
        MarketMarketItemTypeDto marketMarketItemTypeDto5 = new MarketMarketItemTypeDto("INTEGRATION", 4, 4);
        INTEGRATION = marketMarketItemTypeDto5;
        MarketMarketItemTypeDto[] marketMarketItemTypeDtoArr = {marketMarketItemTypeDto, marketMarketItemTypeDto2, marketMarketItemTypeDto3, marketMarketItemTypeDto4, marketMarketItemTypeDto5};
        $VALUES = marketMarketItemTypeDtoArr;
        $ENTRIES = new asp(marketMarketItemTypeDtoArr);
        CREATOR = new a();
    }

    private MarketMarketItemTypeDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketMarketItemTypeDto valueOf(String str) {
        return (MarketMarketItemTypeDto) Enum.valueOf(MarketMarketItemTypeDto.class, str);
    }

    public static MarketMarketItemTypeDto[] values() {
        return (MarketMarketItemTypeDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
