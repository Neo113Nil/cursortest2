package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketGeoSuggestTypesDto.kt */
/* loaded from: classes15.dex */
public final class MarketGeoSuggestTypesDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketGeoSuggestTypesDto[] $VALUES;

    @pmi0("city")
    public static final MarketGeoSuggestTypesDto CITY;
    public static final Parcelable.Creator<MarketGeoSuggestTypesDto> CREATOR;

    @pmi0("hamlet")
    public static final MarketGeoSuggestTypesDto HAMLET;

    @pmi0("town")
    public static final MarketGeoSuggestTypesDto TOWN;
    private final String value;

    /* compiled from: MarketGeoSuggestTypesDto.kt */
    public static final class a implements Parcelable.Creator<MarketGeoSuggestTypesDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGeoSuggestTypesDto createFromParcel(Parcel parcel) {
            return MarketGeoSuggestTypesDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGeoSuggestTypesDto[] newArray(int i) {
            return new MarketGeoSuggestTypesDto[i];
        }
    }

    static {
        MarketGeoSuggestTypesDto marketGeoSuggestTypesDto = new MarketGeoSuggestTypesDto("CITY", 0, "city");
        CITY = marketGeoSuggestTypesDto;
        MarketGeoSuggestTypesDto marketGeoSuggestTypesDto2 = new MarketGeoSuggestTypesDto("TOWN", 1, "town");
        TOWN = marketGeoSuggestTypesDto2;
        MarketGeoSuggestTypesDto marketGeoSuggestTypesDto3 = new MarketGeoSuggestTypesDto("HAMLET", 2, "hamlet");
        HAMLET = marketGeoSuggestTypesDto3;
        MarketGeoSuggestTypesDto[] marketGeoSuggestTypesDtoArr = {marketGeoSuggestTypesDto, marketGeoSuggestTypesDto2, marketGeoSuggestTypesDto3};
        $VALUES = marketGeoSuggestTypesDtoArr;
        $ENTRIES = new asp(marketGeoSuggestTypesDtoArr);
        CREATOR = new a();
    }

    private MarketGeoSuggestTypesDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MarketGeoSuggestTypesDto valueOf(String str) {
        return (MarketGeoSuggestTypesDto) Enum.valueOf(MarketGeoSuggestTypesDto.class, str);
    }

    public static MarketGeoSuggestTypesDto[] values() {
        return (MarketGeoSuggestTypesDto[]) $VALUES.clone();
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
