package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetSearchMarketScreenRefDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetSearchMarketScreenRefDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetSearchMarketScreenRefDto[] $VALUES;
    public static final Parcelable.Creator<CatalogGetSearchMarketScreenRefDto> CREATOR;

    @pmi0("search_market")
    public static final CatalogGetSearchMarketScreenRefDto SEARCH_MARKET;

    @pmi0("search_market_service")
    public static final CatalogGetSearchMarketScreenRefDto SEARCH_MARKET_SERVICE;
    private final String value;

    /* compiled from: CatalogGetSearchMarketScreenRefDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetSearchMarketScreenRefDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetSearchMarketScreenRefDto createFromParcel(Parcel parcel) {
            return CatalogGetSearchMarketScreenRefDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetSearchMarketScreenRefDto[] newArray(int i) {
            return new CatalogGetSearchMarketScreenRefDto[i];
        }
    }

    static {
        CatalogGetSearchMarketScreenRefDto catalogGetSearchMarketScreenRefDto = new CatalogGetSearchMarketScreenRefDto("SEARCH_MARKET", 0, "search_market");
        SEARCH_MARKET = catalogGetSearchMarketScreenRefDto;
        CatalogGetSearchMarketScreenRefDto catalogGetSearchMarketScreenRefDto2 = new CatalogGetSearchMarketScreenRefDto("SEARCH_MARKET_SERVICE", 1, "search_market_service");
        SEARCH_MARKET_SERVICE = catalogGetSearchMarketScreenRefDto2;
        CatalogGetSearchMarketScreenRefDto[] catalogGetSearchMarketScreenRefDtoArr = {catalogGetSearchMarketScreenRefDto, catalogGetSearchMarketScreenRefDto2};
        $VALUES = catalogGetSearchMarketScreenRefDtoArr;
        $ENTRIES = new asp(catalogGetSearchMarketScreenRefDtoArr);
        CREATOR = new a();
    }

    private CatalogGetSearchMarketScreenRefDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetSearchMarketScreenRefDto valueOf(String str) {
        return (CatalogGetSearchMarketScreenRefDto) Enum.valueOf(CatalogGetSearchMarketScreenRefDto.class, str);
    }

    public static CatalogGetSearchMarketScreenRefDto[] values() {
        return (CatalogGetSearchMarketScreenRefDto[]) $VALUES.clone();
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
