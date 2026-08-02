package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetVideoSearchSmartTvSortDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetVideoSearchSmartTvSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetVideoSearchSmartTvSortDto[] $VALUES;
    public static final Parcelable.Creator<CatalogGetVideoSearchSmartTvSortDto> CREATOR;

    @pmi0("0")
    public static final CatalogGetVideoSearchSmartTvSortDto TYPE_0;

    @pmi0("1")
    public static final CatalogGetVideoSearchSmartTvSortDto TYPE_1;

    @pmi0("2")
    public static final CatalogGetVideoSearchSmartTvSortDto TYPE_2;
    private final int value;

    /* compiled from: CatalogGetVideoSearchSmartTvSortDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetVideoSearchSmartTvSortDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetVideoSearchSmartTvSortDto createFromParcel(Parcel parcel) {
            return CatalogGetVideoSearchSmartTvSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetVideoSearchSmartTvSortDto[] newArray(int i) {
            return new CatalogGetVideoSearchSmartTvSortDto[i];
        }
    }

    static {
        CatalogGetVideoSearchSmartTvSortDto catalogGetVideoSearchSmartTvSortDto = new CatalogGetVideoSearchSmartTvSortDto("TYPE_0", 0, 0);
        TYPE_0 = catalogGetVideoSearchSmartTvSortDto;
        CatalogGetVideoSearchSmartTvSortDto catalogGetVideoSearchSmartTvSortDto2 = new CatalogGetVideoSearchSmartTvSortDto("TYPE_1", 1, 1);
        TYPE_1 = catalogGetVideoSearchSmartTvSortDto2;
        CatalogGetVideoSearchSmartTvSortDto catalogGetVideoSearchSmartTvSortDto3 = new CatalogGetVideoSearchSmartTvSortDto("TYPE_2", 2, 2);
        TYPE_2 = catalogGetVideoSearchSmartTvSortDto3;
        CatalogGetVideoSearchSmartTvSortDto[] catalogGetVideoSearchSmartTvSortDtoArr = {catalogGetVideoSearchSmartTvSortDto, catalogGetVideoSearchSmartTvSortDto2, catalogGetVideoSearchSmartTvSortDto3};
        $VALUES = catalogGetVideoSearchSmartTvSortDtoArr;
        $ENTRIES = new asp(catalogGetVideoSearchSmartTvSortDtoArr);
        CREATOR = new a();
    }

    private CatalogGetVideoSearchSmartTvSortDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static CatalogGetVideoSearchSmartTvSortDto valueOf(String str) {
        return (CatalogGetVideoSearchSmartTvSortDto) Enum.valueOf(CatalogGetVideoSearchSmartTvSortDto.class, str);
    }

    public static CatalogGetVideoSearchSmartTvSortDto[] values() {
        return (CatalogGetVideoSearchSmartTvSortDto[]) $VALUES.clone();
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
