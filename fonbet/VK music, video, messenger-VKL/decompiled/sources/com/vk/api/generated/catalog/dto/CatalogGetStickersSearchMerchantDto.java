package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetStickersSearchMerchantDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetStickersSearchMerchantDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetStickersSearchMerchantDto[] $VALUES;

    @pmi0("apple")
    public static final CatalogGetStickersSearchMerchantDto APPLE;
    public static final Parcelable.Creator<CatalogGetStickersSearchMerchantDto> CREATOR;

    @pmi0(AndroidStaticDeviceInfoDataSource.STORE_GOOGLE)
    public static final CatalogGetStickersSearchMerchantDto GOOGLE;
    private final String value;

    /* compiled from: CatalogGetStickersSearchMerchantDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetStickersSearchMerchantDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetStickersSearchMerchantDto createFromParcel(Parcel parcel) {
            return CatalogGetStickersSearchMerchantDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetStickersSearchMerchantDto[] newArray(int i) {
            return new CatalogGetStickersSearchMerchantDto[i];
        }
    }

    static {
        CatalogGetStickersSearchMerchantDto catalogGetStickersSearchMerchantDto = new CatalogGetStickersSearchMerchantDto("APPLE", 0, "apple");
        APPLE = catalogGetStickersSearchMerchantDto;
        CatalogGetStickersSearchMerchantDto catalogGetStickersSearchMerchantDto2 = new CatalogGetStickersSearchMerchantDto("GOOGLE", 1, AndroidStaticDeviceInfoDataSource.STORE_GOOGLE);
        GOOGLE = catalogGetStickersSearchMerchantDto2;
        CatalogGetStickersSearchMerchantDto[] catalogGetStickersSearchMerchantDtoArr = {catalogGetStickersSearchMerchantDto, catalogGetStickersSearchMerchantDto2};
        $VALUES = catalogGetStickersSearchMerchantDtoArr;
        $ENTRIES = new asp(catalogGetStickersSearchMerchantDtoArr);
        CREATOR = new a();
    }

    private CatalogGetStickersSearchMerchantDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetStickersSearchMerchantDto valueOf(String str) {
        return (CatalogGetStickersSearchMerchantDto) Enum.valueOf(CatalogGetStickersSearchMerchantDto.class, str);
    }

    public static CatalogGetStickersSearchMerchantDto[] values() {
        return (CatalogGetStickersSearchMerchantDto[]) $VALUES.clone();
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
