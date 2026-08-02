package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetSearchStatusesSortDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetSearchStatusesSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetSearchStatusesSortDto[] $VALUES;
    public static final Parcelable.Creator<CatalogGetSearchStatusesSortDto> CREATOR;

    @pmi0("0")
    public static final CatalogGetSearchStatusesSortDto TYPE_0;

    @pmi0("2")
    public static final CatalogGetSearchStatusesSortDto TYPE_2;
    private final int value;

    /* compiled from: CatalogGetSearchStatusesSortDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetSearchStatusesSortDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetSearchStatusesSortDto createFromParcel(Parcel parcel) {
            return CatalogGetSearchStatusesSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetSearchStatusesSortDto[] newArray(int i) {
            return new CatalogGetSearchStatusesSortDto[i];
        }
    }

    static {
        CatalogGetSearchStatusesSortDto catalogGetSearchStatusesSortDto = new CatalogGetSearchStatusesSortDto("TYPE_0", 0, 0);
        TYPE_0 = catalogGetSearchStatusesSortDto;
        CatalogGetSearchStatusesSortDto catalogGetSearchStatusesSortDto2 = new CatalogGetSearchStatusesSortDto("TYPE_2", 1, 2);
        TYPE_2 = catalogGetSearchStatusesSortDto2;
        CatalogGetSearchStatusesSortDto[] catalogGetSearchStatusesSortDtoArr = {catalogGetSearchStatusesSortDto, catalogGetSearchStatusesSortDto2};
        $VALUES = catalogGetSearchStatusesSortDtoArr;
        $ENTRIES = new asp(catalogGetSearchStatusesSortDtoArr);
        CREATOR = new a();
    }

    private CatalogGetSearchStatusesSortDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static CatalogGetSearchStatusesSortDto valueOf(String str) {
        return (CatalogGetSearchStatusesSortDto) Enum.valueOf(CatalogGetSearchStatusesSortDto.class, str);
    }

    public static CatalogGetSearchStatusesSortDto[] values() {
        return (CatalogGetSearchStatusesSortDto[]) $VALUES.clone();
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
