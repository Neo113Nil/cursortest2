package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSearchExtendedSortDto.kt */
/* loaded from: classes15.dex */
public final class MarketSearchExtendedSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSearchExtendedSortDto[] $VALUES;
    public static final Parcelable.Creator<MarketSearchExtendedSortDto> CREATOR;

    @pmi0("1")
    public static final MarketSearchExtendedSortDto DATE;

    @pmi0("0")
    public static final MarketSearchExtendedSortDto DEFAULT;

    @pmi0("2")
    public static final MarketSearchExtendedSortDto PRICE;

    @pmi0("3")
    public static final MarketSearchExtendedSortDto RELEVANCE;
    private final int value;

    /* compiled from: MarketSearchExtendedSortDto.kt */
    public static final class a implements Parcelable.Creator<MarketSearchExtendedSortDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSearchExtendedSortDto createFromParcel(Parcel parcel) {
            return MarketSearchExtendedSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSearchExtendedSortDto[] newArray(int i) {
            return new MarketSearchExtendedSortDto[i];
        }
    }

    static {
        MarketSearchExtendedSortDto marketSearchExtendedSortDto = new MarketSearchExtendedSortDto("DEFAULT", 0, 0);
        DEFAULT = marketSearchExtendedSortDto;
        MarketSearchExtendedSortDto marketSearchExtendedSortDto2 = new MarketSearchExtendedSortDto("DATE", 1, 1);
        DATE = marketSearchExtendedSortDto2;
        MarketSearchExtendedSortDto marketSearchExtendedSortDto3 = new MarketSearchExtendedSortDto("PRICE", 2, 2);
        PRICE = marketSearchExtendedSortDto3;
        MarketSearchExtendedSortDto marketSearchExtendedSortDto4 = new MarketSearchExtendedSortDto("RELEVANCE", 3, 3);
        RELEVANCE = marketSearchExtendedSortDto4;
        MarketSearchExtendedSortDto[] marketSearchExtendedSortDtoArr = {marketSearchExtendedSortDto, marketSearchExtendedSortDto2, marketSearchExtendedSortDto3, marketSearchExtendedSortDto4};
        $VALUES = marketSearchExtendedSortDtoArr;
        $ENTRIES = new asp(marketSearchExtendedSortDtoArr);
        CREATOR = new a();
    }

    private MarketSearchExtendedSortDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketSearchExtendedSortDto valueOf(String str) {
        return (MarketSearchExtendedSortDto) Enum.valueOf(MarketSearchExtendedSortDto.class, str);
    }

    public static MarketSearchExtendedSortDto[] values() {
        return (MarketSearchExtendedSortDto[]) $VALUES.clone();
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
