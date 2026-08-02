package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSearchServicesExtendedRevDto.kt */
/* loaded from: classes15.dex */
public final class MarketSearchServicesExtendedRevDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSearchServicesExtendedRevDto[] $VALUES;
    public static final Parcelable.Creator<MarketSearchServicesExtendedRevDto> CREATOR;

    @pmi0("0")
    public static final MarketSearchServicesExtendedRevDto NORMAL;

    @pmi0("1")
    public static final MarketSearchServicesExtendedRevDto REVERSE;
    private final int value;

    /* compiled from: MarketSearchServicesExtendedRevDto.kt */
    public static final class a implements Parcelable.Creator<MarketSearchServicesExtendedRevDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSearchServicesExtendedRevDto createFromParcel(Parcel parcel) {
            return MarketSearchServicesExtendedRevDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSearchServicesExtendedRevDto[] newArray(int i) {
            return new MarketSearchServicesExtendedRevDto[i];
        }
    }

    static {
        MarketSearchServicesExtendedRevDto marketSearchServicesExtendedRevDto = new MarketSearchServicesExtendedRevDto("NORMAL", 0, 0);
        NORMAL = marketSearchServicesExtendedRevDto;
        MarketSearchServicesExtendedRevDto marketSearchServicesExtendedRevDto2 = new MarketSearchServicesExtendedRevDto("REVERSE", 1, 1);
        REVERSE = marketSearchServicesExtendedRevDto2;
        MarketSearchServicesExtendedRevDto[] marketSearchServicesExtendedRevDtoArr = {marketSearchServicesExtendedRevDto, marketSearchServicesExtendedRevDto2};
        $VALUES = marketSearchServicesExtendedRevDtoArr;
        $ENTRIES = new asp(marketSearchServicesExtendedRevDtoArr);
        CREATOR = new a();
    }

    private MarketSearchServicesExtendedRevDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketSearchServicesExtendedRevDto valueOf(String str) {
        return (MarketSearchServicesExtendedRevDto) Enum.valueOf(MarketSearchServicesExtendedRevDto.class, str);
    }

    public static MarketSearchServicesExtendedRevDto[] values() {
        return (MarketSearchServicesExtendedRevDto[]) $VALUES.clone();
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
