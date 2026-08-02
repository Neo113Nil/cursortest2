package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSearchServicesSortDto.kt */
/* loaded from: classes15.dex */
public final class MarketSearchServicesSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSearchServicesSortDto[] $VALUES;
    public static final Parcelable.Creator<MarketSearchServicesSortDto> CREATOR;

    @pmi0("1")
    public static final MarketSearchServicesSortDto DATE;

    @pmi0("0")
    public static final MarketSearchServicesSortDto DEFAULT;

    @pmi0("2")
    public static final MarketSearchServicesSortDto PRICE;

    @pmi0("3")
    public static final MarketSearchServicesSortDto RELEVANCE;
    private final int value;

    /* compiled from: MarketSearchServicesSortDto.kt */
    public static final class a implements Parcelable.Creator<MarketSearchServicesSortDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSearchServicesSortDto createFromParcel(Parcel parcel) {
            return MarketSearchServicesSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSearchServicesSortDto[] newArray(int i) {
            return new MarketSearchServicesSortDto[i];
        }
    }

    static {
        MarketSearchServicesSortDto marketSearchServicesSortDto = new MarketSearchServicesSortDto("DEFAULT", 0, 0);
        DEFAULT = marketSearchServicesSortDto;
        MarketSearchServicesSortDto marketSearchServicesSortDto2 = new MarketSearchServicesSortDto("DATE", 1, 1);
        DATE = marketSearchServicesSortDto2;
        MarketSearchServicesSortDto marketSearchServicesSortDto3 = new MarketSearchServicesSortDto("PRICE", 2, 2);
        PRICE = marketSearchServicesSortDto3;
        MarketSearchServicesSortDto marketSearchServicesSortDto4 = new MarketSearchServicesSortDto("RELEVANCE", 3, 3);
        RELEVANCE = marketSearchServicesSortDto4;
        MarketSearchServicesSortDto[] marketSearchServicesSortDtoArr = {marketSearchServicesSortDto, marketSearchServicesSortDto2, marketSearchServicesSortDto3, marketSearchServicesSortDto4};
        $VALUES = marketSearchServicesSortDtoArr;
        $ENTRIES = new asp(marketSearchServicesSortDtoArr);
        CREATOR = new a();
    }

    private MarketSearchServicesSortDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketSearchServicesSortDto valueOf(String str) {
        return (MarketSearchServicesSortDto) Enum.valueOf(MarketSearchServicesSortDto.class, str);
    }

    public static MarketSearchServicesSortDto[] values() {
        return (MarketSearchServicesSortDto[]) $VALUES.clone();
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
