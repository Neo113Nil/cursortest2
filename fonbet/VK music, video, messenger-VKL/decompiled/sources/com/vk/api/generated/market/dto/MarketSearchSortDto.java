package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSearchSortDto.kt */
/* loaded from: classes15.dex */
public final class MarketSearchSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSearchSortDto[] $VALUES;
    public static final Parcelable.Creator<MarketSearchSortDto> CREATOR;

    @pmi0("1")
    public static final MarketSearchSortDto DATE;

    @pmi0("0")
    public static final MarketSearchSortDto DEFAULT;

    @pmi0("2")
    public static final MarketSearchSortDto PRICE;

    @pmi0("3")
    public static final MarketSearchSortDto RELEVANCE;
    private final int value;

    /* compiled from: MarketSearchSortDto.kt */
    public static final class a implements Parcelable.Creator<MarketSearchSortDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSearchSortDto createFromParcel(Parcel parcel) {
            return MarketSearchSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSearchSortDto[] newArray(int i) {
            return new MarketSearchSortDto[i];
        }
    }

    static {
        MarketSearchSortDto marketSearchSortDto = new MarketSearchSortDto("DEFAULT", 0, 0);
        DEFAULT = marketSearchSortDto;
        MarketSearchSortDto marketSearchSortDto2 = new MarketSearchSortDto("DATE", 1, 1);
        DATE = marketSearchSortDto2;
        MarketSearchSortDto marketSearchSortDto3 = new MarketSearchSortDto("PRICE", 2, 2);
        PRICE = marketSearchSortDto3;
        MarketSearchSortDto marketSearchSortDto4 = new MarketSearchSortDto("RELEVANCE", 3, 3);
        RELEVANCE = marketSearchSortDto4;
        MarketSearchSortDto[] marketSearchSortDtoArr = {marketSearchSortDto, marketSearchSortDto2, marketSearchSortDto3, marketSearchSortDto4};
        $VALUES = marketSearchSortDtoArr;
        $ENTRIES = new asp(marketSearchSortDtoArr);
        CREATOR = new a();
    }

    private MarketSearchSortDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketSearchSortDto valueOf(String str) {
        return (MarketSearchSortDto) Enum.valueOf(MarketSearchSortDto.class, str);
    }

    public static MarketSearchSortDto[] values() {
        return (MarketSearchSortDto[]) $VALUES.clone();
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
