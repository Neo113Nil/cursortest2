package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetSearchMarketDeliveryTypeDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetSearchMarketDeliveryTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetSearchMarketDeliveryTypeDto[] $VALUES;

    @pmi0("any")
    public static final CatalogGetSearchMarketDeliveryTypeDto ANY;

    @pmi0("courier")
    public static final CatalogGetSearchMarketDeliveryTypeDto COURIER;
    public static final Parcelable.Creator<CatalogGetSearchMarketDeliveryTypeDto> CREATOR;

    @pmi0("pickup")
    public static final CatalogGetSearchMarketDeliveryTypeDto PICKUP;
    private final String value;

    /* compiled from: CatalogGetSearchMarketDeliveryTypeDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetSearchMarketDeliveryTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetSearchMarketDeliveryTypeDto createFromParcel(Parcel parcel) {
            return CatalogGetSearchMarketDeliveryTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetSearchMarketDeliveryTypeDto[] newArray(int i) {
            return new CatalogGetSearchMarketDeliveryTypeDto[i];
        }
    }

    static {
        CatalogGetSearchMarketDeliveryTypeDto catalogGetSearchMarketDeliveryTypeDto = new CatalogGetSearchMarketDeliveryTypeDto("ANY", 0, "any");
        ANY = catalogGetSearchMarketDeliveryTypeDto;
        CatalogGetSearchMarketDeliveryTypeDto catalogGetSearchMarketDeliveryTypeDto2 = new CatalogGetSearchMarketDeliveryTypeDto("COURIER", 1, "courier");
        COURIER = catalogGetSearchMarketDeliveryTypeDto2;
        CatalogGetSearchMarketDeliveryTypeDto catalogGetSearchMarketDeliveryTypeDto3 = new CatalogGetSearchMarketDeliveryTypeDto("PICKUP", 2, "pickup");
        PICKUP = catalogGetSearchMarketDeliveryTypeDto3;
        CatalogGetSearchMarketDeliveryTypeDto[] catalogGetSearchMarketDeliveryTypeDtoArr = {catalogGetSearchMarketDeliveryTypeDto, catalogGetSearchMarketDeliveryTypeDto2, catalogGetSearchMarketDeliveryTypeDto3};
        $VALUES = catalogGetSearchMarketDeliveryTypeDtoArr;
        $ENTRIES = new asp(catalogGetSearchMarketDeliveryTypeDtoArr);
        CREATOR = new a();
    }

    private CatalogGetSearchMarketDeliveryTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetSearchMarketDeliveryTypeDto valueOf(String str) {
        return (CatalogGetSearchMarketDeliveryTypeDto) Enum.valueOf(CatalogGetSearchMarketDeliveryTypeDto.class, str);
    }

    public static CatalogGetSearchMarketDeliveryTypeDto[] values() {
        return (CatalogGetSearchMarketDeliveryTypeDto[]) $VALUES.clone();
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
