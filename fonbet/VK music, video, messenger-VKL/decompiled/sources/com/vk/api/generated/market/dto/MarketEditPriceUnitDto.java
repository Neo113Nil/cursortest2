package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketEditPriceUnitDto.kt */
/* loaded from: classes15.dex */
public final class MarketEditPriceUnitDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketEditPriceUnitDto[] $VALUES;
    public static final Parcelable.Creator<MarketEditPriceUnitDto> CREATOR;

    @pmi0("2")
    public static final MarketEditPriceUnitDto HOUR;

    @pmi0("0")
    public static final MarketEditPriceUnitDto ITEM;

    @pmi0("4")
    public static final MarketEditPriceUnitDto M2;

    @pmi0("3")
    public static final MarketEditPriceUnitDto M3;
    private final int value;

    /* compiled from: MarketEditPriceUnitDto.kt */
    public static final class a implements Parcelable.Creator<MarketEditPriceUnitDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketEditPriceUnitDto createFromParcel(Parcel parcel) {
            return MarketEditPriceUnitDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketEditPriceUnitDto[] newArray(int i) {
            return new MarketEditPriceUnitDto[i];
        }
    }

    static {
        MarketEditPriceUnitDto marketEditPriceUnitDto = new MarketEditPriceUnitDto("ITEM", 0, 0);
        ITEM = marketEditPriceUnitDto;
        MarketEditPriceUnitDto marketEditPriceUnitDto2 = new MarketEditPriceUnitDto("HOUR", 1, 2);
        HOUR = marketEditPriceUnitDto2;
        MarketEditPriceUnitDto marketEditPriceUnitDto3 = new MarketEditPriceUnitDto("M3", 2, 3);
        M3 = marketEditPriceUnitDto3;
        MarketEditPriceUnitDto marketEditPriceUnitDto4 = new MarketEditPriceUnitDto("M2", 3, 4);
        M2 = marketEditPriceUnitDto4;
        MarketEditPriceUnitDto[] marketEditPriceUnitDtoArr = {marketEditPriceUnitDto, marketEditPriceUnitDto2, marketEditPriceUnitDto3, marketEditPriceUnitDto4};
        $VALUES = marketEditPriceUnitDtoArr;
        $ENTRIES = new asp(marketEditPriceUnitDtoArr);
        CREATOR = new a();
    }

    private MarketEditPriceUnitDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketEditPriceUnitDto valueOf(String str) {
        return (MarketEditPriceUnitDto) Enum.valueOf(MarketEditPriceUnitDto.class, str);
    }

    public static MarketEditPriceUnitDto[] values() {
        return (MarketEditPriceUnitDto[]) $VALUES.clone();
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
