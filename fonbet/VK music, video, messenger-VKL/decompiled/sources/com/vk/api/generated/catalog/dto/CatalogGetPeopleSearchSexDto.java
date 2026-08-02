package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetPeopleSearchSexDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetPeopleSearchSexDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetPeopleSearchSexDto[] $VALUES;
    public static final Parcelable.Creator<CatalogGetPeopleSearchSexDto> CREATOR;

    @pmi0(IronSourceConstants.a.c)
    public static final CatalogGetPeopleSearchSexDto FEMALE;

    @pmi0(IronSourceConstants.a.b)
    public static final CatalogGetPeopleSearchSexDto MALE;
    private final String value;

    /* compiled from: CatalogGetPeopleSearchSexDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetPeopleSearchSexDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetPeopleSearchSexDto createFromParcel(Parcel parcel) {
            return CatalogGetPeopleSearchSexDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetPeopleSearchSexDto[] newArray(int i) {
            return new CatalogGetPeopleSearchSexDto[i];
        }
    }

    static {
        CatalogGetPeopleSearchSexDto catalogGetPeopleSearchSexDto = new CatalogGetPeopleSearchSexDto("FEMALE", 0, IronSourceConstants.a.c);
        FEMALE = catalogGetPeopleSearchSexDto;
        CatalogGetPeopleSearchSexDto catalogGetPeopleSearchSexDto2 = new CatalogGetPeopleSearchSexDto("MALE", 1, IronSourceConstants.a.b);
        MALE = catalogGetPeopleSearchSexDto2;
        CatalogGetPeopleSearchSexDto[] catalogGetPeopleSearchSexDtoArr = {catalogGetPeopleSearchSexDto, catalogGetPeopleSearchSexDto2};
        $VALUES = catalogGetPeopleSearchSexDtoArr;
        $ENTRIES = new asp(catalogGetPeopleSearchSexDtoArr);
        CREATOR = new a();
    }

    private CatalogGetPeopleSearchSexDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetPeopleSearchSexDto valueOf(String str) {
        return (CatalogGetPeopleSearchSexDto) Enum.valueOf(CatalogGetPeopleSearchSexDto.class, str);
    }

    public static CatalogGetPeopleSearchSexDto[] values() {
        return (CatalogGetPeopleSearchSexDto[]) $VALUES.clone();
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
