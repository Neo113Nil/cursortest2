package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetVideoSearchSortDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetVideoSearchSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetVideoSearchSortDto[] $VALUES;
    public static final Parcelable.Creator<CatalogGetVideoSearchSortDto> CREATOR;

    @pmi0("0")
    public static final CatalogGetVideoSearchSortDto DATE_ADDED;

    @pmi0("1")
    public static final CatalogGetVideoSearchSortDto DURATION;

    @pmi0("2")
    public static final CatalogGetVideoSearchSortDto RELEVANCE;
    private final int value;

    /* compiled from: CatalogGetVideoSearchSortDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetVideoSearchSortDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetVideoSearchSortDto createFromParcel(Parcel parcel) {
            return CatalogGetVideoSearchSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetVideoSearchSortDto[] newArray(int i) {
            return new CatalogGetVideoSearchSortDto[i];
        }
    }

    static {
        CatalogGetVideoSearchSortDto catalogGetVideoSearchSortDto = new CatalogGetVideoSearchSortDto("DURATION", 0, 1);
        DURATION = catalogGetVideoSearchSortDto;
        CatalogGetVideoSearchSortDto catalogGetVideoSearchSortDto2 = new CatalogGetVideoSearchSortDto("RELEVANCE", 1, 2);
        RELEVANCE = catalogGetVideoSearchSortDto2;
        CatalogGetVideoSearchSortDto catalogGetVideoSearchSortDto3 = new CatalogGetVideoSearchSortDto("DATE_ADDED", 2, 0);
        DATE_ADDED = catalogGetVideoSearchSortDto3;
        CatalogGetVideoSearchSortDto[] catalogGetVideoSearchSortDtoArr = {catalogGetVideoSearchSortDto, catalogGetVideoSearchSortDto2, catalogGetVideoSearchSortDto3};
        $VALUES = catalogGetVideoSearchSortDtoArr;
        $ENTRIES = new asp(catalogGetVideoSearchSortDtoArr);
        CREATOR = new a();
    }

    private CatalogGetVideoSearchSortDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static CatalogGetVideoSearchSortDto valueOf(String str) {
        return (CatalogGetVideoSearchSortDto) Enum.valueOf(CatalogGetVideoSearchSortDto.class, str);
    }

    public static CatalogGetVideoSearchSortDto[] values() {
        return (CatalogGetVideoSearchSortDto[]) $VALUES.clone();
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
