package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSearchRevDto.kt */
/* loaded from: classes15.dex */
public final class MarketSearchRevDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSearchRevDto[] $VALUES;
    public static final Parcelable.Creator<MarketSearchRevDto> CREATOR;

    @pmi0("0")
    public static final MarketSearchRevDto NORMAL;

    @pmi0("1")
    public static final MarketSearchRevDto REVERSE;
    private final int value;

    /* compiled from: MarketSearchRevDto.kt */
    public static final class a implements Parcelable.Creator<MarketSearchRevDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSearchRevDto createFromParcel(Parcel parcel) {
            return MarketSearchRevDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSearchRevDto[] newArray(int i) {
            return new MarketSearchRevDto[i];
        }
    }

    static {
        MarketSearchRevDto marketSearchRevDto = new MarketSearchRevDto("NORMAL", 0, 0);
        NORMAL = marketSearchRevDto;
        MarketSearchRevDto marketSearchRevDto2 = new MarketSearchRevDto("REVERSE", 1, 1);
        REVERSE = marketSearchRevDto2;
        MarketSearchRevDto[] marketSearchRevDtoArr = {marketSearchRevDto, marketSearchRevDto2};
        $VALUES = marketSearchRevDtoArr;
        $ENTRIES = new asp(marketSearchRevDtoArr);
        CREATOR = new a();
    }

    private MarketSearchRevDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketSearchRevDto valueOf(String str) {
        return (MarketSearchRevDto) Enum.valueOf(MarketSearchRevDto.class, str);
    }

    public static MarketSearchRevDto[] values() {
        return (MarketSearchRevDto[]) $VALUES.clone();
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
