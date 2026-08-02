package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketEditPriceTypeDto.kt */
/* loaded from: classes15.dex */
public final class MarketEditPriceTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketEditPriceTypeDto[] $VALUES;

    @pmi0("3")
    public static final MarketEditPriceTypeDto BY_AGREEMENT;
    public static final Parcelable.Creator<MarketEditPriceTypeDto> CREATOR;

    @pmi0("0")
    public static final MarketEditPriceTypeDto EXACT;

    @pmi0("2")
    public static final MarketEditPriceTypeDto RANGE;
    private final int value;

    /* compiled from: MarketEditPriceTypeDto.kt */
    public static final class a implements Parcelable.Creator<MarketEditPriceTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketEditPriceTypeDto createFromParcel(Parcel parcel) {
            return MarketEditPriceTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketEditPriceTypeDto[] newArray(int i) {
            return new MarketEditPriceTypeDto[i];
        }
    }

    static {
        MarketEditPriceTypeDto marketEditPriceTypeDto = new MarketEditPriceTypeDto("EXACT", 0, 0);
        EXACT = marketEditPriceTypeDto;
        MarketEditPriceTypeDto marketEditPriceTypeDto2 = new MarketEditPriceTypeDto("RANGE", 1, 2);
        RANGE = marketEditPriceTypeDto2;
        MarketEditPriceTypeDto marketEditPriceTypeDto3 = new MarketEditPriceTypeDto("BY_AGREEMENT", 2, 3);
        BY_AGREEMENT = marketEditPriceTypeDto3;
        MarketEditPriceTypeDto[] marketEditPriceTypeDtoArr = {marketEditPriceTypeDto, marketEditPriceTypeDto2, marketEditPriceTypeDto3};
        $VALUES = marketEditPriceTypeDtoArr;
        $ENTRIES = new asp(marketEditPriceTypeDtoArr);
        CREATOR = new a();
    }

    private MarketEditPriceTypeDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketEditPriceTypeDto valueOf(String str) {
        return (MarketEditPriceTypeDto) Enum.valueOf(MarketEditPriceTypeDto.class, str);
    }

    public static MarketEditPriceTypeDto[] values() {
        return (MarketEditPriceTypeDto[]) $VALUES.clone();
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
