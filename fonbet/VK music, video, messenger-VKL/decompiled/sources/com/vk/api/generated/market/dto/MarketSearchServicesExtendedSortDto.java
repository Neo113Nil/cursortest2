package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSearchServicesExtendedSortDto.kt */
/* loaded from: classes15.dex */
public final class MarketSearchServicesExtendedSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSearchServicesExtendedSortDto[] $VALUES;
    public static final Parcelable.Creator<MarketSearchServicesExtendedSortDto> CREATOR;

    @pmi0("1")
    public static final MarketSearchServicesExtendedSortDto DATE;

    @pmi0("0")
    public static final MarketSearchServicesExtendedSortDto DEFAULT;

    @pmi0("2")
    public static final MarketSearchServicesExtendedSortDto PRICE;

    @pmi0("3")
    public static final MarketSearchServicesExtendedSortDto RELEVANCE;
    private final int value;

    /* compiled from: MarketSearchServicesExtendedSortDto.kt */
    public static final class a implements Parcelable.Creator<MarketSearchServicesExtendedSortDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSearchServicesExtendedSortDto createFromParcel(Parcel parcel) {
            return MarketSearchServicesExtendedSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSearchServicesExtendedSortDto[] newArray(int i) {
            return new MarketSearchServicesExtendedSortDto[i];
        }
    }

    static {
        MarketSearchServicesExtendedSortDto marketSearchServicesExtendedSortDto = new MarketSearchServicesExtendedSortDto("DEFAULT", 0, 0);
        DEFAULT = marketSearchServicesExtendedSortDto;
        MarketSearchServicesExtendedSortDto marketSearchServicesExtendedSortDto2 = new MarketSearchServicesExtendedSortDto("DATE", 1, 1);
        DATE = marketSearchServicesExtendedSortDto2;
        MarketSearchServicesExtendedSortDto marketSearchServicesExtendedSortDto3 = new MarketSearchServicesExtendedSortDto("PRICE", 2, 2);
        PRICE = marketSearchServicesExtendedSortDto3;
        MarketSearchServicesExtendedSortDto marketSearchServicesExtendedSortDto4 = new MarketSearchServicesExtendedSortDto("RELEVANCE", 3, 3);
        RELEVANCE = marketSearchServicesExtendedSortDto4;
        MarketSearchServicesExtendedSortDto[] marketSearchServicesExtendedSortDtoArr = {marketSearchServicesExtendedSortDto, marketSearchServicesExtendedSortDto2, marketSearchServicesExtendedSortDto3, marketSearchServicesExtendedSortDto4};
        $VALUES = marketSearchServicesExtendedSortDtoArr;
        $ENTRIES = new asp(marketSearchServicesExtendedSortDtoArr);
        CREATOR = new a();
    }

    private MarketSearchServicesExtendedSortDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketSearchServicesExtendedSortDto valueOf(String str) {
        return (MarketSearchServicesExtendedSortDto) Enum.valueOf(MarketSearchServicesExtendedSortDto.class, str);
    }

    public static MarketSearchServicesExtendedSortDto[] values() {
        return (MarketSearchServicesExtendedSortDto[]) $VALUES.clone();
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
