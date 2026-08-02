package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetVideoSearchDurationDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetVideoSearchDurationDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetVideoSearchDurationDto[] $VALUES;

    @pmi0("any")
    public static final CatalogGetVideoSearchDurationDto ANY;
    public static final Parcelable.Creator<CatalogGetVideoSearchDurationDto> CREATOR;

    @pmi0("long")
    public static final CatalogGetVideoSearchDurationDto LONG;

    @pmi0("short")
    public static final CatalogGetVideoSearchDurationDto SHORT;
    private final String value;

    /* compiled from: CatalogGetVideoSearchDurationDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetVideoSearchDurationDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetVideoSearchDurationDto createFromParcel(Parcel parcel) {
            return CatalogGetVideoSearchDurationDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetVideoSearchDurationDto[] newArray(int i) {
            return new CatalogGetVideoSearchDurationDto[i];
        }
    }

    static {
        CatalogGetVideoSearchDurationDto catalogGetVideoSearchDurationDto = new CatalogGetVideoSearchDurationDto("SHORT", 0, "short");
        SHORT = catalogGetVideoSearchDurationDto;
        CatalogGetVideoSearchDurationDto catalogGetVideoSearchDurationDto2 = new CatalogGetVideoSearchDurationDto("LONG", 1, "long");
        LONG = catalogGetVideoSearchDurationDto2;
        CatalogGetVideoSearchDurationDto catalogGetVideoSearchDurationDto3 = new CatalogGetVideoSearchDurationDto("ANY", 2, "any");
        ANY = catalogGetVideoSearchDurationDto3;
        CatalogGetVideoSearchDurationDto[] catalogGetVideoSearchDurationDtoArr = {catalogGetVideoSearchDurationDto, catalogGetVideoSearchDurationDto2, catalogGetVideoSearchDurationDto3};
        $VALUES = catalogGetVideoSearchDurationDtoArr;
        $ENTRIES = new asp(catalogGetVideoSearchDurationDtoArr);
        CREATOR = new a();
    }

    private CatalogGetVideoSearchDurationDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetVideoSearchDurationDto valueOf(String str) {
        return (CatalogGetVideoSearchDurationDto) Enum.valueOf(CatalogGetVideoSearchDurationDto.class, str);
    }

    public static CatalogGetVideoSearchDurationDto[] values() {
        return (CatalogGetVideoSearchDurationDto[]) $VALUES.clone();
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
