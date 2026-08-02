package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetSectionMerchantDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetSectionMerchantDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetSectionMerchantDto[] $VALUES;

    @pmi0("apple")
    public static final CatalogGetSectionMerchantDto APPLE;
    public static final Parcelable.Creator<CatalogGetSectionMerchantDto> CREATOR;

    @pmi0(AndroidStaticDeviceInfoDataSource.STORE_GOOGLE)
    public static final CatalogGetSectionMerchantDto GOOGLE;
    private final String value;

    /* compiled from: CatalogGetSectionMerchantDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetSectionMerchantDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetSectionMerchantDto createFromParcel(Parcel parcel) {
            return CatalogGetSectionMerchantDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetSectionMerchantDto[] newArray(int i) {
            return new CatalogGetSectionMerchantDto[i];
        }
    }

    static {
        CatalogGetSectionMerchantDto catalogGetSectionMerchantDto = new CatalogGetSectionMerchantDto("APPLE", 0, "apple");
        APPLE = catalogGetSectionMerchantDto;
        CatalogGetSectionMerchantDto catalogGetSectionMerchantDto2 = new CatalogGetSectionMerchantDto("GOOGLE", 1, AndroidStaticDeviceInfoDataSource.STORE_GOOGLE);
        GOOGLE = catalogGetSectionMerchantDto2;
        CatalogGetSectionMerchantDto[] catalogGetSectionMerchantDtoArr = {catalogGetSectionMerchantDto, catalogGetSectionMerchantDto2};
        $VALUES = catalogGetSectionMerchantDtoArr;
        $ENTRIES = new asp(catalogGetSectionMerchantDtoArr);
        CREATOR = new a();
    }

    private CatalogGetSectionMerchantDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetSectionMerchantDto valueOf(String str) {
        return (CatalogGetSectionMerchantDto) Enum.valueOf(CatalogGetSectionMerchantDto.class, str);
    }

    public static CatalogGetSectionMerchantDto[] values() {
        return (CatalogGetSectionMerchantDto[]) $VALUES.clone();
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
