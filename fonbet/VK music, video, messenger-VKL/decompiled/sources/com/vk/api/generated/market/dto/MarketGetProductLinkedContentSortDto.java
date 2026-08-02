package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketGetProductLinkedContentSortDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetProductLinkedContentSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketGetProductLinkedContentSortDto[] $VALUES;
    public static final Parcelable.Creator<MarketGetProductLinkedContentSortDto> CREATOR;

    @pmi0("date_asc")
    public static final MarketGetProductLinkedContentSortDto DATE_ASC;

    @pmi0("date_desc")
    public static final MarketGetProductLinkedContentSortDto DATE_DESC;

    @pmi0("random")
    public static final MarketGetProductLinkedContentSortDto RANDOM;
    private final String value;

    /* compiled from: MarketGetProductLinkedContentSortDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetProductLinkedContentSortDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetProductLinkedContentSortDto createFromParcel(Parcel parcel) {
            return MarketGetProductLinkedContentSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetProductLinkedContentSortDto[] newArray(int i) {
            return new MarketGetProductLinkedContentSortDto[i];
        }
    }

    static {
        MarketGetProductLinkedContentSortDto marketGetProductLinkedContentSortDto = new MarketGetProductLinkedContentSortDto("DATE_ASC", 0, "date_asc");
        DATE_ASC = marketGetProductLinkedContentSortDto;
        MarketGetProductLinkedContentSortDto marketGetProductLinkedContentSortDto2 = new MarketGetProductLinkedContentSortDto("DATE_DESC", 1, "date_desc");
        DATE_DESC = marketGetProductLinkedContentSortDto2;
        MarketGetProductLinkedContentSortDto marketGetProductLinkedContentSortDto3 = new MarketGetProductLinkedContentSortDto("RANDOM", 2, "random");
        RANDOM = marketGetProductLinkedContentSortDto3;
        MarketGetProductLinkedContentSortDto[] marketGetProductLinkedContentSortDtoArr = {marketGetProductLinkedContentSortDto, marketGetProductLinkedContentSortDto2, marketGetProductLinkedContentSortDto3};
        $VALUES = marketGetProductLinkedContentSortDtoArr;
        $ENTRIES = new asp(marketGetProductLinkedContentSortDtoArr);
        CREATOR = new a();
    }

    private MarketGetProductLinkedContentSortDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MarketGetProductLinkedContentSortDto valueOf(String str) {
        return (MarketGetProductLinkedContentSortDto) Enum.valueOf(MarketGetProductLinkedContentSortDto.class, str);
    }

    public static MarketGetProductLinkedContentSortDto[] values() {
        return (MarketGetProductLinkedContentSortDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
