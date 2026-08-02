package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketBadgeSubtypeDto.kt */
/* loaded from: classes15.dex */
public final class MarketBadgeSubtypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketBadgeSubtypeDto[] $VALUES;
    public static final Parcelable.Creator<MarketBadgeSubtypeDto> CREATOR;

    @pmi0("0")
    public static final MarketBadgeSubtypeDto DEFAULT;

    @pmi0("1")
    public static final MarketBadgeSubtypeDto FORTUNES_WHEEL;
    private final int value;

    /* compiled from: MarketBadgeSubtypeDto.kt */
    public static final class a implements Parcelable.Creator<MarketBadgeSubtypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketBadgeSubtypeDto createFromParcel(Parcel parcel) {
            return MarketBadgeSubtypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketBadgeSubtypeDto[] newArray(int i) {
            return new MarketBadgeSubtypeDto[i];
        }
    }

    static {
        MarketBadgeSubtypeDto marketBadgeSubtypeDto = new MarketBadgeSubtypeDto("DEFAULT", 0, 0);
        DEFAULT = marketBadgeSubtypeDto;
        MarketBadgeSubtypeDto marketBadgeSubtypeDto2 = new MarketBadgeSubtypeDto("FORTUNES_WHEEL", 1, 1);
        FORTUNES_WHEEL = marketBadgeSubtypeDto2;
        MarketBadgeSubtypeDto[] marketBadgeSubtypeDtoArr = {marketBadgeSubtypeDto, marketBadgeSubtypeDto2};
        $VALUES = marketBadgeSubtypeDtoArr;
        $ENTRIES = new asp(marketBadgeSubtypeDtoArr);
        CREATOR = new a();
    }

    private MarketBadgeSubtypeDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketBadgeSubtypeDto valueOf(String str) {
        return (MarketBadgeSubtypeDto) Enum.valueOf(MarketBadgeSubtypeDto.class, str);
    }

    public static MarketBadgeSubtypeDto[] values() {
        return (MarketBadgeSubtypeDto[]) $VALUES.clone();
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
