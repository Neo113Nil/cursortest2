package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetClassifiedsDeliveryTypeDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetClassifiedsDeliveryTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetClassifiedsDeliveryTypeDto[] $VALUES;

    @pmi0("any")
    public static final CatalogGetClassifiedsDeliveryTypeDto ANY;

    @pmi0("courier")
    public static final CatalogGetClassifiedsDeliveryTypeDto COURIER;
    public static final Parcelable.Creator<CatalogGetClassifiedsDeliveryTypeDto> CREATOR;

    @pmi0("pickup")
    public static final CatalogGetClassifiedsDeliveryTypeDto PICKUP;
    private final String value;

    /* compiled from: CatalogGetClassifiedsDeliveryTypeDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetClassifiedsDeliveryTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetClassifiedsDeliveryTypeDto createFromParcel(Parcel parcel) {
            return CatalogGetClassifiedsDeliveryTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetClassifiedsDeliveryTypeDto[] newArray(int i) {
            return new CatalogGetClassifiedsDeliveryTypeDto[i];
        }
    }

    static {
        CatalogGetClassifiedsDeliveryTypeDto catalogGetClassifiedsDeliveryTypeDto = new CatalogGetClassifiedsDeliveryTypeDto("ANY", 0, "any");
        ANY = catalogGetClassifiedsDeliveryTypeDto;
        CatalogGetClassifiedsDeliveryTypeDto catalogGetClassifiedsDeliveryTypeDto2 = new CatalogGetClassifiedsDeliveryTypeDto("COURIER", 1, "courier");
        COURIER = catalogGetClassifiedsDeliveryTypeDto2;
        CatalogGetClassifiedsDeliveryTypeDto catalogGetClassifiedsDeliveryTypeDto3 = new CatalogGetClassifiedsDeliveryTypeDto("PICKUP", 2, "pickup");
        PICKUP = catalogGetClassifiedsDeliveryTypeDto3;
        CatalogGetClassifiedsDeliveryTypeDto[] catalogGetClassifiedsDeliveryTypeDtoArr = {catalogGetClassifiedsDeliveryTypeDto, catalogGetClassifiedsDeliveryTypeDto2, catalogGetClassifiedsDeliveryTypeDto3};
        $VALUES = catalogGetClassifiedsDeliveryTypeDtoArr;
        $ENTRIES = new asp(catalogGetClassifiedsDeliveryTypeDtoArr);
        CREATOR = new a();
    }

    private CatalogGetClassifiedsDeliveryTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetClassifiedsDeliveryTypeDto valueOf(String str) {
        return (CatalogGetClassifiedsDeliveryTypeDto) Enum.valueOf(CatalogGetClassifiedsDeliveryTypeDto.class, str);
    }

    public static CatalogGetClassifiedsDeliveryTypeDto[] values() {
        return (CatalogGetClassifiedsDeliveryTypeDto[]) $VALUES.clone();
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
