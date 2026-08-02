package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetVideoSearchSmartTvDurationDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetVideoSearchSmartTvDurationDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetVideoSearchSmartTvDurationDto[] $VALUES;

    @pmi0("any")
    public static final CatalogGetVideoSearchSmartTvDurationDto ANY;
    public static final Parcelable.Creator<CatalogGetVideoSearchSmartTvDurationDto> CREATOR;

    @pmi0("long")
    public static final CatalogGetVideoSearchSmartTvDurationDto LONG;

    @pmi0("short")
    public static final CatalogGetVideoSearchSmartTvDurationDto SHORT;
    private final String value;

    /* compiled from: CatalogGetVideoSearchSmartTvDurationDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetVideoSearchSmartTvDurationDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetVideoSearchSmartTvDurationDto createFromParcel(Parcel parcel) {
            return CatalogGetVideoSearchSmartTvDurationDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetVideoSearchSmartTvDurationDto[] newArray(int i) {
            return new CatalogGetVideoSearchSmartTvDurationDto[i];
        }
    }

    static {
        CatalogGetVideoSearchSmartTvDurationDto catalogGetVideoSearchSmartTvDurationDto = new CatalogGetVideoSearchSmartTvDurationDto("SHORT", 0, "short");
        SHORT = catalogGetVideoSearchSmartTvDurationDto;
        CatalogGetVideoSearchSmartTvDurationDto catalogGetVideoSearchSmartTvDurationDto2 = new CatalogGetVideoSearchSmartTvDurationDto("LONG", 1, "long");
        LONG = catalogGetVideoSearchSmartTvDurationDto2;
        CatalogGetVideoSearchSmartTvDurationDto catalogGetVideoSearchSmartTvDurationDto3 = new CatalogGetVideoSearchSmartTvDurationDto("ANY", 2, "any");
        ANY = catalogGetVideoSearchSmartTvDurationDto3;
        CatalogGetVideoSearchSmartTvDurationDto[] catalogGetVideoSearchSmartTvDurationDtoArr = {catalogGetVideoSearchSmartTvDurationDto, catalogGetVideoSearchSmartTvDurationDto2, catalogGetVideoSearchSmartTvDurationDto3};
        $VALUES = catalogGetVideoSearchSmartTvDurationDtoArr;
        $ENTRIES = new asp(catalogGetVideoSearchSmartTvDurationDtoArr);
        CREATOR = new a();
    }

    private CatalogGetVideoSearchSmartTvDurationDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetVideoSearchSmartTvDurationDto valueOf(String str) {
        return (CatalogGetVideoSearchSmartTvDurationDto) Enum.valueOf(CatalogGetVideoSearchSmartTvDurationDto.class, str);
    }

    public static CatalogGetVideoSearchSmartTvDurationDto[] values() {
        return (CatalogGetVideoSearchSmartTvDurationDto[]) $VALUES.clone();
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
