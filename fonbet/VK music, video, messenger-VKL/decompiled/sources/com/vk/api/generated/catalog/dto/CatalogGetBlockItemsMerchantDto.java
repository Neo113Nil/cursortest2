package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetBlockItemsMerchantDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetBlockItemsMerchantDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetBlockItemsMerchantDto[] $VALUES;

    @pmi0("apple")
    public static final CatalogGetBlockItemsMerchantDto APPLE;
    public static final Parcelable.Creator<CatalogGetBlockItemsMerchantDto> CREATOR;

    @pmi0(AndroidStaticDeviceInfoDataSource.STORE_GOOGLE)
    public static final CatalogGetBlockItemsMerchantDto GOOGLE;
    private final String value;

    /* compiled from: CatalogGetBlockItemsMerchantDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetBlockItemsMerchantDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetBlockItemsMerchantDto createFromParcel(Parcel parcel) {
            return CatalogGetBlockItemsMerchantDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetBlockItemsMerchantDto[] newArray(int i) {
            return new CatalogGetBlockItemsMerchantDto[i];
        }
    }

    static {
        CatalogGetBlockItemsMerchantDto catalogGetBlockItemsMerchantDto = new CatalogGetBlockItemsMerchantDto("APPLE", 0, "apple");
        APPLE = catalogGetBlockItemsMerchantDto;
        CatalogGetBlockItemsMerchantDto catalogGetBlockItemsMerchantDto2 = new CatalogGetBlockItemsMerchantDto("GOOGLE", 1, AndroidStaticDeviceInfoDataSource.STORE_GOOGLE);
        GOOGLE = catalogGetBlockItemsMerchantDto2;
        CatalogGetBlockItemsMerchantDto[] catalogGetBlockItemsMerchantDtoArr = {catalogGetBlockItemsMerchantDto, catalogGetBlockItemsMerchantDto2};
        $VALUES = catalogGetBlockItemsMerchantDtoArr;
        $ENTRIES = new asp(catalogGetBlockItemsMerchantDtoArr);
        CREATOR = new a();
    }

    private CatalogGetBlockItemsMerchantDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetBlockItemsMerchantDto valueOf(String str) {
        return (CatalogGetBlockItemsMerchantDto) Enum.valueOf(CatalogGetBlockItemsMerchantDto.class, str);
    }

    public static CatalogGetBlockItemsMerchantDto[] values() {
        return (CatalogGetBlockItemsMerchantDto[]) $VALUES.clone();
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
