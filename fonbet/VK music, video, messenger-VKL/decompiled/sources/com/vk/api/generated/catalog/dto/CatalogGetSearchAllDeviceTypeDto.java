package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetSearchAllDeviceTypeDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetSearchAllDeviceTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetSearchAllDeviceTypeDto[] $VALUES;
    public static final Parcelable.Creator<CatalogGetSearchAllDeviceTypeDto> CREATOR;

    @pmi0("desktop")
    public static final CatalogGetSearchAllDeviceTypeDto DESKTOP;

    @pmi0("mobile")
    public static final CatalogGetSearchAllDeviceTypeDto MOBILE;

    @pmi0("tablet")
    public static final CatalogGetSearchAllDeviceTypeDto TABLET;
    private final String value;

    /* compiled from: CatalogGetSearchAllDeviceTypeDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetSearchAllDeviceTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetSearchAllDeviceTypeDto createFromParcel(Parcel parcel) {
            return CatalogGetSearchAllDeviceTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetSearchAllDeviceTypeDto[] newArray(int i) {
            return new CatalogGetSearchAllDeviceTypeDto[i];
        }
    }

    static {
        CatalogGetSearchAllDeviceTypeDto catalogGetSearchAllDeviceTypeDto = new CatalogGetSearchAllDeviceTypeDto("DESKTOP", 0, "desktop");
        DESKTOP = catalogGetSearchAllDeviceTypeDto;
        CatalogGetSearchAllDeviceTypeDto catalogGetSearchAllDeviceTypeDto2 = new CatalogGetSearchAllDeviceTypeDto("MOBILE", 1, "mobile");
        MOBILE = catalogGetSearchAllDeviceTypeDto2;
        CatalogGetSearchAllDeviceTypeDto catalogGetSearchAllDeviceTypeDto3 = new CatalogGetSearchAllDeviceTypeDto("TABLET", 2, "tablet");
        TABLET = catalogGetSearchAllDeviceTypeDto3;
        CatalogGetSearchAllDeviceTypeDto[] catalogGetSearchAllDeviceTypeDtoArr = {catalogGetSearchAllDeviceTypeDto, catalogGetSearchAllDeviceTypeDto2, catalogGetSearchAllDeviceTypeDto3};
        $VALUES = catalogGetSearchAllDeviceTypeDtoArr;
        $ENTRIES = new asp(catalogGetSearchAllDeviceTypeDtoArr);
        CREATOR = new a();
    }

    private CatalogGetSearchAllDeviceTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetSearchAllDeviceTypeDto valueOf(String str) {
        return (CatalogGetSearchAllDeviceTypeDto) Enum.valueOf(CatalogGetSearchAllDeviceTypeDto.class, str);
    }

    public static CatalogGetSearchAllDeviceTypeDto[] values() {
        return (CatalogGetSearchAllDeviceTypeDto[]) $VALUES.clone();
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
