package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetSearchMarketCatalogContextDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetSearchMarketCatalogContextDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetSearchMarketCatalogContextDto[] $VALUES;

    @pmi0("classifieds")
    public static final CatalogGetSearchMarketCatalogContextDto CLASSIFIEDS;
    public static final Parcelable.Creator<CatalogGetSearchMarketCatalogContextDto> CREATOR;

    @pmi0("market")
    public static final CatalogGetSearchMarketCatalogContextDto MARKET;
    private final String value;

    /* compiled from: CatalogGetSearchMarketCatalogContextDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetSearchMarketCatalogContextDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetSearchMarketCatalogContextDto createFromParcel(Parcel parcel) {
            return CatalogGetSearchMarketCatalogContextDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetSearchMarketCatalogContextDto[] newArray(int i) {
            return new CatalogGetSearchMarketCatalogContextDto[i];
        }
    }

    static {
        CatalogGetSearchMarketCatalogContextDto catalogGetSearchMarketCatalogContextDto = new CatalogGetSearchMarketCatalogContextDto("CLASSIFIEDS", 0, "classifieds");
        CLASSIFIEDS = catalogGetSearchMarketCatalogContextDto;
        CatalogGetSearchMarketCatalogContextDto catalogGetSearchMarketCatalogContextDto2 = new CatalogGetSearchMarketCatalogContextDto("MARKET", 1, "market");
        MARKET = catalogGetSearchMarketCatalogContextDto2;
        CatalogGetSearchMarketCatalogContextDto[] catalogGetSearchMarketCatalogContextDtoArr = {catalogGetSearchMarketCatalogContextDto, catalogGetSearchMarketCatalogContextDto2};
        $VALUES = catalogGetSearchMarketCatalogContextDtoArr;
        $ENTRIES = new asp(catalogGetSearchMarketCatalogContextDtoArr);
        CREATOR = new a();
    }

    private CatalogGetSearchMarketCatalogContextDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetSearchMarketCatalogContextDto valueOf(String str) {
        return (CatalogGetSearchMarketCatalogContextDto) Enum.valueOf(CatalogGetSearchMarketCatalogContextDto.class, str);
    }

    public static CatalogGetSearchMarketCatalogContextDto[] values() {
        return (CatalogGetSearchMarketCatalogContextDto[]) $VALUES.clone();
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
