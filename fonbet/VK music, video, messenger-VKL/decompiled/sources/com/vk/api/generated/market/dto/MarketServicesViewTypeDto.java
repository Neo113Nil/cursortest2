package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketServicesViewTypeDto.kt */
/* loaded from: classes15.dex */
public final class MarketServicesViewTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketServicesViewTypeDto[] $VALUES;

    @pmi0("1")
    public static final MarketServicesViewTypeDto CARDS;
    public static final Parcelable.Creator<MarketServicesViewTypeDto> CREATOR;

    @pmi0("2")
    public static final MarketServicesViewTypeDto ROWS;
    private final int value;

    /* compiled from: MarketServicesViewTypeDto.kt */
    public static final class a implements Parcelable.Creator<MarketServicesViewTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketServicesViewTypeDto createFromParcel(Parcel parcel) {
            return MarketServicesViewTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketServicesViewTypeDto[] newArray(int i) {
            return new MarketServicesViewTypeDto[i];
        }
    }

    static {
        MarketServicesViewTypeDto marketServicesViewTypeDto = new MarketServicesViewTypeDto("CARDS", 0, 1);
        CARDS = marketServicesViewTypeDto;
        MarketServicesViewTypeDto marketServicesViewTypeDto2 = new MarketServicesViewTypeDto("ROWS", 1, 2);
        ROWS = marketServicesViewTypeDto2;
        MarketServicesViewTypeDto[] marketServicesViewTypeDtoArr = {marketServicesViewTypeDto, marketServicesViewTypeDto2};
        $VALUES = marketServicesViewTypeDtoArr;
        $ENTRIES = new asp(marketServicesViewTypeDtoArr);
        CREATOR = new a();
    }

    private MarketServicesViewTypeDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketServicesViewTypeDto valueOf(String str) {
        return (MarketServicesViewTypeDto) Enum.valueOf(MarketServicesViewTypeDto.class, str);
    }

    public static MarketServicesViewTypeDto[] values() {
        return (MarketServicesViewTypeDto[]) $VALUES.clone();
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
