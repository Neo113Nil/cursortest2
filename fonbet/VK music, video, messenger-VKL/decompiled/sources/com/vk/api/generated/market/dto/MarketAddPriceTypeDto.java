package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketAddPriceTypeDto.kt */
/* loaded from: classes15.dex */
public final class MarketAddPriceTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketAddPriceTypeDto[] $VALUES;

    @pmi0("3")
    public static final MarketAddPriceTypeDto BY_AGREEMENT;
    public static final Parcelable.Creator<MarketAddPriceTypeDto> CREATOR;

    @pmi0("0")
    public static final MarketAddPriceTypeDto EXACT;

    @pmi0("2")
    public static final MarketAddPriceTypeDto RANGE;
    private final int value;

    /* compiled from: MarketAddPriceTypeDto.kt */
    public static final class a implements Parcelable.Creator<MarketAddPriceTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketAddPriceTypeDto createFromParcel(Parcel parcel) {
            return MarketAddPriceTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketAddPriceTypeDto[] newArray(int i) {
            return new MarketAddPriceTypeDto[i];
        }
    }

    static {
        MarketAddPriceTypeDto marketAddPriceTypeDto = new MarketAddPriceTypeDto("EXACT", 0, 0);
        EXACT = marketAddPriceTypeDto;
        MarketAddPriceTypeDto marketAddPriceTypeDto2 = new MarketAddPriceTypeDto("RANGE", 1, 2);
        RANGE = marketAddPriceTypeDto2;
        MarketAddPriceTypeDto marketAddPriceTypeDto3 = new MarketAddPriceTypeDto("BY_AGREEMENT", 2, 3);
        BY_AGREEMENT = marketAddPriceTypeDto3;
        MarketAddPriceTypeDto[] marketAddPriceTypeDtoArr = {marketAddPriceTypeDto, marketAddPriceTypeDto2, marketAddPriceTypeDto3};
        $VALUES = marketAddPriceTypeDtoArr;
        $ENTRIES = new asp(marketAddPriceTypeDtoArr);
        CREATOR = new a();
    }

    private MarketAddPriceTypeDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketAddPriceTypeDto valueOf(String str) {
        return (MarketAddPriceTypeDto) Enum.valueOf(MarketAddPriceTypeDto.class, str);
    }

    public static MarketAddPriceTypeDto[] values() {
        return (MarketAddPriceTypeDto[]) $VALUES.clone();
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
