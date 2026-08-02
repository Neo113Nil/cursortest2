package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetStickersMerchantDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetStickersMerchantDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetStickersMerchantDto[] $VALUES;

    @pmi0("apple")
    public static final CatalogGetStickersMerchantDto APPLE;
    public static final Parcelable.Creator<CatalogGetStickersMerchantDto> CREATOR;

    @pmi0(AndroidStaticDeviceInfoDataSource.STORE_GOOGLE)
    public static final CatalogGetStickersMerchantDto GOOGLE;
    private final String value;

    /* compiled from: CatalogGetStickersMerchantDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetStickersMerchantDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetStickersMerchantDto createFromParcel(Parcel parcel) {
            return CatalogGetStickersMerchantDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetStickersMerchantDto[] newArray(int i) {
            return new CatalogGetStickersMerchantDto[i];
        }
    }

    static {
        CatalogGetStickersMerchantDto catalogGetStickersMerchantDto = new CatalogGetStickersMerchantDto("APPLE", 0, "apple");
        APPLE = catalogGetStickersMerchantDto;
        CatalogGetStickersMerchantDto catalogGetStickersMerchantDto2 = new CatalogGetStickersMerchantDto("GOOGLE", 1, AndroidStaticDeviceInfoDataSource.STORE_GOOGLE);
        GOOGLE = catalogGetStickersMerchantDto2;
        CatalogGetStickersMerchantDto[] catalogGetStickersMerchantDtoArr = {catalogGetStickersMerchantDto, catalogGetStickersMerchantDto2};
        $VALUES = catalogGetStickersMerchantDtoArr;
        $ENTRIES = new asp(catalogGetStickersMerchantDtoArr);
        CREATOR = new a();
    }

    private CatalogGetStickersMerchantDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetStickersMerchantDto valueOf(String str) {
        return (CatalogGetStickersMerchantDto) Enum.valueOf(CatalogGetStickersMerchantDto.class, str);
    }

    public static CatalogGetStickersMerchantDto[] values() {
        return (CatalogGetStickersMerchantDto[]) $VALUES.clone();
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
