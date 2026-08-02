package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketAddPriceUnitDto.kt */
/* loaded from: classes15.dex */
public final class MarketAddPriceUnitDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketAddPriceUnitDto[] $VALUES;
    public static final Parcelable.Creator<MarketAddPriceUnitDto> CREATOR;

    @pmi0("2")
    public static final MarketAddPriceUnitDto HOUR;

    @pmi0("0")
    public static final MarketAddPriceUnitDto ITEM;

    @pmi0("4")
    public static final MarketAddPriceUnitDto M2;

    @pmi0("3")
    public static final MarketAddPriceUnitDto M3;
    private final int value;

    /* compiled from: MarketAddPriceUnitDto.kt */
    public static final class a implements Parcelable.Creator<MarketAddPriceUnitDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketAddPriceUnitDto createFromParcel(Parcel parcel) {
            return MarketAddPriceUnitDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketAddPriceUnitDto[] newArray(int i) {
            return new MarketAddPriceUnitDto[i];
        }
    }

    static {
        MarketAddPriceUnitDto marketAddPriceUnitDto = new MarketAddPriceUnitDto("ITEM", 0, 0);
        ITEM = marketAddPriceUnitDto;
        MarketAddPriceUnitDto marketAddPriceUnitDto2 = new MarketAddPriceUnitDto("HOUR", 1, 2);
        HOUR = marketAddPriceUnitDto2;
        MarketAddPriceUnitDto marketAddPriceUnitDto3 = new MarketAddPriceUnitDto("M3", 2, 3);
        M3 = marketAddPriceUnitDto3;
        MarketAddPriceUnitDto marketAddPriceUnitDto4 = new MarketAddPriceUnitDto("M2", 3, 4);
        M2 = marketAddPriceUnitDto4;
        MarketAddPriceUnitDto[] marketAddPriceUnitDtoArr = {marketAddPriceUnitDto, marketAddPriceUnitDto2, marketAddPriceUnitDto3, marketAddPriceUnitDto4};
        $VALUES = marketAddPriceUnitDtoArr;
        $ENTRIES = new asp(marketAddPriceUnitDtoArr);
        CREATOR = new a();
    }

    private MarketAddPriceUnitDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketAddPriceUnitDto valueOf(String str) {
        return (MarketAddPriceUnitDto) Enum.valueOf(MarketAddPriceUnitDto.class, str);
    }

    public static MarketAddPriceUnitDto[] values() {
        return (MarketAddPriceUnitDto[]) $VALUES.clone();
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
