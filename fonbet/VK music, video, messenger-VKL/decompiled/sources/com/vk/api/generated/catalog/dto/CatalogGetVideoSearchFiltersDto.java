package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetVideoSearchFiltersDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetVideoSearchFiltersDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetVideoSearchFiltersDto[] $VALUES;
    public static final Parcelable.Creator<CatalogGetVideoSearchFiltersDto> CREATOR;

    @pmi0("long")
    public static final CatalogGetVideoSearchFiltersDto LONG;

    @pmi0("short")
    public static final CatalogGetVideoSearchFiltersDto SHORT;

    @pmi0("vimeo")
    public static final CatalogGetVideoSearchFiltersDto VIMEO;

    @pmi0("youtube")
    public static final CatalogGetVideoSearchFiltersDto YOUTUBE;
    private final String value;

    /* compiled from: CatalogGetVideoSearchFiltersDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetVideoSearchFiltersDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetVideoSearchFiltersDto createFromParcel(Parcel parcel) {
            return CatalogGetVideoSearchFiltersDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetVideoSearchFiltersDto[] newArray(int i) {
            return new CatalogGetVideoSearchFiltersDto[i];
        }
    }

    static {
        CatalogGetVideoSearchFiltersDto catalogGetVideoSearchFiltersDto = new CatalogGetVideoSearchFiltersDto("YOUTUBE", 0, "youtube");
        YOUTUBE = catalogGetVideoSearchFiltersDto;
        CatalogGetVideoSearchFiltersDto catalogGetVideoSearchFiltersDto2 = new CatalogGetVideoSearchFiltersDto("VIMEO", 1, "vimeo");
        VIMEO = catalogGetVideoSearchFiltersDto2;
        CatalogGetVideoSearchFiltersDto catalogGetVideoSearchFiltersDto3 = new CatalogGetVideoSearchFiltersDto("SHORT", 2, "short");
        SHORT = catalogGetVideoSearchFiltersDto3;
        CatalogGetVideoSearchFiltersDto catalogGetVideoSearchFiltersDto4 = new CatalogGetVideoSearchFiltersDto("LONG", 3, "long");
        LONG = catalogGetVideoSearchFiltersDto4;
        CatalogGetVideoSearchFiltersDto[] catalogGetVideoSearchFiltersDtoArr = {catalogGetVideoSearchFiltersDto, catalogGetVideoSearchFiltersDto2, catalogGetVideoSearchFiltersDto3, catalogGetVideoSearchFiltersDto4};
        $VALUES = catalogGetVideoSearchFiltersDtoArr;
        $ENTRIES = new asp(catalogGetVideoSearchFiltersDtoArr);
        CREATOR = new a();
    }

    private CatalogGetVideoSearchFiltersDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetVideoSearchFiltersDto valueOf(String str) {
        return (CatalogGetVideoSearchFiltersDto) Enum.valueOf(CatalogGetVideoSearchFiltersDto.class, str);
    }

    public static CatalogGetVideoSearchFiltersDto[] values() {
        return (CatalogGetVideoSearchFiltersDto[]) $VALUES.clone();
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
