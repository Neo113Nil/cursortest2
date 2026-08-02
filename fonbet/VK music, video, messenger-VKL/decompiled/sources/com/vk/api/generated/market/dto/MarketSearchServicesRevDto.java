package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSearchServicesRevDto.kt */
/* loaded from: classes15.dex */
public final class MarketSearchServicesRevDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSearchServicesRevDto[] $VALUES;
    public static final Parcelable.Creator<MarketSearchServicesRevDto> CREATOR;

    @pmi0("0")
    public static final MarketSearchServicesRevDto NORMAL;

    @pmi0("1")
    public static final MarketSearchServicesRevDto REVERSE;
    private final int value;

    /* compiled from: MarketSearchServicesRevDto.kt */
    public static final class a implements Parcelable.Creator<MarketSearchServicesRevDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSearchServicesRevDto createFromParcel(Parcel parcel) {
            return MarketSearchServicesRevDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSearchServicesRevDto[] newArray(int i) {
            return new MarketSearchServicesRevDto[i];
        }
    }

    static {
        MarketSearchServicesRevDto marketSearchServicesRevDto = new MarketSearchServicesRevDto("NORMAL", 0, 0);
        NORMAL = marketSearchServicesRevDto;
        MarketSearchServicesRevDto marketSearchServicesRevDto2 = new MarketSearchServicesRevDto("REVERSE", 1, 1);
        REVERSE = marketSearchServicesRevDto2;
        MarketSearchServicesRevDto[] marketSearchServicesRevDtoArr = {marketSearchServicesRevDto, marketSearchServicesRevDto2};
        $VALUES = marketSearchServicesRevDtoArr;
        $ENTRIES = new asp(marketSearchServicesRevDtoArr);
        CREATOR = new a();
    }

    private MarketSearchServicesRevDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketSearchServicesRevDto valueOf(String str) {
        return (MarketSearchServicesRevDto) Enum.valueOf(MarketSearchServicesRevDto.class, str);
    }

    public static MarketSearchServicesRevDto[] values() {
        return (MarketSearchServicesRevDto[]) $VALUES.clone();
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
