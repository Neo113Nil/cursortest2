package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSearchItemsSortByDto.kt */
/* loaded from: classes15.dex */
public final class MarketSearchItemsSortByDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSearchItemsSortByDto[] $VALUES;
    public static final Parcelable.Creator<MarketSearchItemsSortByDto> CREATOR;

    @pmi0("1")
    public static final MarketSearchItemsSortByDto DATE;

    @pmi0("2")
    public static final MarketSearchItemsSortByDto PRICE;

    @pmi0("3")
    public static final MarketSearchItemsSortByDto RELEVANCE;
    private final int value;

    /* compiled from: MarketSearchItemsSortByDto.kt */
    public static final class a implements Parcelable.Creator<MarketSearchItemsSortByDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSearchItemsSortByDto createFromParcel(Parcel parcel) {
            return MarketSearchItemsSortByDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSearchItemsSortByDto[] newArray(int i) {
            return new MarketSearchItemsSortByDto[i];
        }
    }

    static {
        MarketSearchItemsSortByDto marketSearchItemsSortByDto = new MarketSearchItemsSortByDto("DATE", 0, 1);
        DATE = marketSearchItemsSortByDto;
        MarketSearchItemsSortByDto marketSearchItemsSortByDto2 = new MarketSearchItemsSortByDto("PRICE", 1, 2);
        PRICE = marketSearchItemsSortByDto2;
        MarketSearchItemsSortByDto marketSearchItemsSortByDto3 = new MarketSearchItemsSortByDto("RELEVANCE", 2, 3);
        RELEVANCE = marketSearchItemsSortByDto3;
        MarketSearchItemsSortByDto[] marketSearchItemsSortByDtoArr = {marketSearchItemsSortByDto, marketSearchItemsSortByDto2, marketSearchItemsSortByDto3};
        $VALUES = marketSearchItemsSortByDtoArr;
        $ENTRIES = new asp(marketSearchItemsSortByDtoArr);
        CREATOR = new a();
    }

    private MarketSearchItemsSortByDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketSearchItemsSortByDto valueOf(String str) {
        return (MarketSearchItemsSortByDto) Enum.valueOf(MarketSearchItemsSortByDto.class, str);
    }

    public static MarketSearchItemsSortByDto[] values() {
        return (MarketSearchItemsSortByDto[]) $VALUES.clone();
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
