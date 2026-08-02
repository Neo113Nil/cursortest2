package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetSearchGroupsSortDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetSearchGroupsSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetSearchGroupsSortDto[] $VALUES;
    public static final Parcelable.Creator<CatalogGetSearchGroupsSortDto> CREATOR;

    @pmi0("members")
    public static final CatalogGetSearchGroupsSortDto MEMBERS;

    @pmi0("popularity")
    public static final CatalogGetSearchGroupsSortDto POPULARITY;

    @pmi0("relevant")
    public static final CatalogGetSearchGroupsSortDto RELEVANT;
    private final String value;

    /* compiled from: CatalogGetSearchGroupsSortDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetSearchGroupsSortDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetSearchGroupsSortDto createFromParcel(Parcel parcel) {
            return CatalogGetSearchGroupsSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetSearchGroupsSortDto[] newArray(int i) {
            return new CatalogGetSearchGroupsSortDto[i];
        }
    }

    static {
        CatalogGetSearchGroupsSortDto catalogGetSearchGroupsSortDto = new CatalogGetSearchGroupsSortDto("MEMBERS", 0, "members");
        MEMBERS = catalogGetSearchGroupsSortDto;
        CatalogGetSearchGroupsSortDto catalogGetSearchGroupsSortDto2 = new CatalogGetSearchGroupsSortDto("POPULARITY", 1, "popularity");
        POPULARITY = catalogGetSearchGroupsSortDto2;
        CatalogGetSearchGroupsSortDto catalogGetSearchGroupsSortDto3 = new CatalogGetSearchGroupsSortDto("RELEVANT", 2, "relevant");
        RELEVANT = catalogGetSearchGroupsSortDto3;
        CatalogGetSearchGroupsSortDto[] catalogGetSearchGroupsSortDtoArr = {catalogGetSearchGroupsSortDto, catalogGetSearchGroupsSortDto2, catalogGetSearchGroupsSortDto3};
        $VALUES = catalogGetSearchGroupsSortDtoArr;
        $ENTRIES = new asp(catalogGetSearchGroupsSortDtoArr);
        CREATOR = new a();
    }

    private CatalogGetSearchGroupsSortDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetSearchGroupsSortDto valueOf(String str) {
        return (CatalogGetSearchGroupsSortDto) Enum.valueOf(CatalogGetSearchGroupsSortDto.class, str);
    }

    public static CatalogGetSearchGroupsSortDto[] values() {
        return (CatalogGetSearchGroupsSortDto[]) $VALUES.clone();
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
