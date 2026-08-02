package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSearchExtendedRevDto.kt */
/* loaded from: classes15.dex */
public final class MarketSearchExtendedRevDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSearchExtendedRevDto[] $VALUES;
    public static final Parcelable.Creator<MarketSearchExtendedRevDto> CREATOR;

    @pmi0("0")
    public static final MarketSearchExtendedRevDto NORMAL;

    @pmi0("1")
    public static final MarketSearchExtendedRevDto REVERSE;
    private final int value;

    /* compiled from: MarketSearchExtendedRevDto.kt */
    public static final class a implements Parcelable.Creator<MarketSearchExtendedRevDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSearchExtendedRevDto createFromParcel(Parcel parcel) {
            return MarketSearchExtendedRevDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSearchExtendedRevDto[] newArray(int i) {
            return new MarketSearchExtendedRevDto[i];
        }
    }

    static {
        MarketSearchExtendedRevDto marketSearchExtendedRevDto = new MarketSearchExtendedRevDto("NORMAL", 0, 0);
        NORMAL = marketSearchExtendedRevDto;
        MarketSearchExtendedRevDto marketSearchExtendedRevDto2 = new MarketSearchExtendedRevDto("REVERSE", 1, 1);
        REVERSE = marketSearchExtendedRevDto2;
        MarketSearchExtendedRevDto[] marketSearchExtendedRevDtoArr = {marketSearchExtendedRevDto, marketSearchExtendedRevDto2};
        $VALUES = marketSearchExtendedRevDtoArr;
        $ENTRIES = new asp(marketSearchExtendedRevDtoArr);
        CREATOR = new a();
    }

    private MarketSearchExtendedRevDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketSearchExtendedRevDto valueOf(String str) {
        return (MarketSearchExtendedRevDto) Enum.valueOf(MarketSearchExtendedRevDto.class, str);
    }

    public static MarketSearchExtendedRevDto[] values() {
        return (MarketSearchExtendedRevDto[]) $VALUES.clone();
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
