package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketDeliveryTypeDto.kt */
/* loaded from: classes15.dex */
public final class MarketDeliveryTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketDeliveryTypeDto[] $VALUES;

    @pmi0("any")
    public static final MarketDeliveryTypeDto ANY;

    @pmi0("courier")
    public static final MarketDeliveryTypeDto COURIER;
    public static final Parcelable.Creator<MarketDeliveryTypeDto> CREATOR;

    @pmi0("pickup")
    public static final MarketDeliveryTypeDto PICKUP;
    private final String value;

    /* compiled from: MarketDeliveryTypeDto.kt */
    public static final class a implements Parcelable.Creator<MarketDeliveryTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketDeliveryTypeDto createFromParcel(Parcel parcel) {
            return MarketDeliveryTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketDeliveryTypeDto[] newArray(int i) {
            return new MarketDeliveryTypeDto[i];
        }
    }

    static {
        MarketDeliveryTypeDto marketDeliveryTypeDto = new MarketDeliveryTypeDto("ANY", 0, "any");
        ANY = marketDeliveryTypeDto;
        MarketDeliveryTypeDto marketDeliveryTypeDto2 = new MarketDeliveryTypeDto("COURIER", 1, "courier");
        COURIER = marketDeliveryTypeDto2;
        MarketDeliveryTypeDto marketDeliveryTypeDto3 = new MarketDeliveryTypeDto("PICKUP", 2, "pickup");
        PICKUP = marketDeliveryTypeDto3;
        MarketDeliveryTypeDto[] marketDeliveryTypeDtoArr = {marketDeliveryTypeDto, marketDeliveryTypeDto2, marketDeliveryTypeDto3};
        $VALUES = marketDeliveryTypeDtoArr;
        $ENTRIES = new asp(marketDeliveryTypeDtoArr);
        CREATOR = new a();
    }

    private MarketDeliveryTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MarketDeliveryTypeDto valueOf(String str) {
        return (MarketDeliveryTypeDto) Enum.valueOf(MarketDeliveryTypeDto.class, str);
    }

    public static MarketDeliveryTypeDto[] values() {
        return (MarketDeliveryTypeDto[]) $VALUES.clone();
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
