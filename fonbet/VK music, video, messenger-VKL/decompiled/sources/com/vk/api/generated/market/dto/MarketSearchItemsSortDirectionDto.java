package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSearchItemsSortDirectionDto.kt */
/* loaded from: classes15.dex */
public final class MarketSearchItemsSortDirectionDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSearchItemsSortDirectionDto[] $VALUES;
    public static final Parcelable.Creator<MarketSearchItemsSortDirectionDto> CREATOR;

    @pmi0("0")
    public static final MarketSearchItemsSortDirectionDto TYPE_0;

    @pmi0("1")
    public static final MarketSearchItemsSortDirectionDto TYPE_1;
    private final int value;

    /* compiled from: MarketSearchItemsSortDirectionDto.kt */
    public static final class a implements Parcelable.Creator<MarketSearchItemsSortDirectionDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSearchItemsSortDirectionDto createFromParcel(Parcel parcel) {
            return MarketSearchItemsSortDirectionDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSearchItemsSortDirectionDto[] newArray(int i) {
            return new MarketSearchItemsSortDirectionDto[i];
        }
    }

    static {
        MarketSearchItemsSortDirectionDto marketSearchItemsSortDirectionDto = new MarketSearchItemsSortDirectionDto("TYPE_0", 0, 0);
        TYPE_0 = marketSearchItemsSortDirectionDto;
        MarketSearchItemsSortDirectionDto marketSearchItemsSortDirectionDto2 = new MarketSearchItemsSortDirectionDto("TYPE_1", 1, 1);
        TYPE_1 = marketSearchItemsSortDirectionDto2;
        MarketSearchItemsSortDirectionDto[] marketSearchItemsSortDirectionDtoArr = {marketSearchItemsSortDirectionDto, marketSearchItemsSortDirectionDto2};
        $VALUES = marketSearchItemsSortDirectionDtoArr;
        $ENTRIES = new asp(marketSearchItemsSortDirectionDtoArr);
        CREATOR = new a();
    }

    private MarketSearchItemsSortDirectionDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketSearchItemsSortDirectionDto valueOf(String str) {
        return (MarketSearchItemsSortDirectionDto) Enum.valueOf(MarketSearchItemsSortDirectionDto.class, str);
    }

    public static MarketSearchItemsSortDirectionDto[] values() {
        return (MarketSearchItemsSortDirectionDto[]) $VALUES.clone();
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
