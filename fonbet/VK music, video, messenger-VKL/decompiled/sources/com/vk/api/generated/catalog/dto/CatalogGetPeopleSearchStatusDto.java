package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetPeopleSearchStatusDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetPeopleSearchStatusDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetPeopleSearchStatusDto[] $VALUES;

    @pmi0("actively_looking")
    public static final CatalogGetPeopleSearchStatusDto ACTIVELY_LOOKING;

    @pmi0("civil_marriage")
    public static final CatalogGetPeopleSearchStatusDto CIVIL_MARRIAGE;

    @pmi0("complicated")
    public static final CatalogGetPeopleSearchStatusDto COMPLICATED;
    public static final Parcelable.Creator<CatalogGetPeopleSearchStatusDto> CREATOR;

    @pmi0("engaged")
    public static final CatalogGetPeopleSearchStatusDto ENGAGED;

    @pmi0("in_love")
    public static final CatalogGetPeopleSearchStatusDto IN_LOVE;

    @pmi0("married")
    public static final CatalogGetPeopleSearchStatusDto MARRIED;

    @pmi0("meets")
    public static final CatalogGetPeopleSearchStatusDto MEETS;

    @pmi0("not_married")
    public static final CatalogGetPeopleSearchStatusDto NOT_MARRIED;
    private final String value;

    /* compiled from: CatalogGetPeopleSearchStatusDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetPeopleSearchStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetPeopleSearchStatusDto createFromParcel(Parcel parcel) {
            return CatalogGetPeopleSearchStatusDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetPeopleSearchStatusDto[] newArray(int i) {
            return new CatalogGetPeopleSearchStatusDto[i];
        }
    }

    static {
        CatalogGetPeopleSearchStatusDto catalogGetPeopleSearchStatusDto = new CatalogGetPeopleSearchStatusDto("ACTIVELY_LOOKING", 0, "actively_looking");
        ACTIVELY_LOOKING = catalogGetPeopleSearchStatusDto;
        CatalogGetPeopleSearchStatusDto catalogGetPeopleSearchStatusDto2 = new CatalogGetPeopleSearchStatusDto("CIVIL_MARRIAGE", 1, "civil_marriage");
        CIVIL_MARRIAGE = catalogGetPeopleSearchStatusDto2;
        CatalogGetPeopleSearchStatusDto catalogGetPeopleSearchStatusDto3 = new CatalogGetPeopleSearchStatusDto("COMPLICATED", 2, "complicated");
        COMPLICATED = catalogGetPeopleSearchStatusDto3;
        CatalogGetPeopleSearchStatusDto catalogGetPeopleSearchStatusDto4 = new CatalogGetPeopleSearchStatusDto("ENGAGED", 3, "engaged");
        ENGAGED = catalogGetPeopleSearchStatusDto4;
        CatalogGetPeopleSearchStatusDto catalogGetPeopleSearchStatusDto5 = new CatalogGetPeopleSearchStatusDto("IN_LOVE", 4, "in_love");
        IN_LOVE = catalogGetPeopleSearchStatusDto5;
        CatalogGetPeopleSearchStatusDto catalogGetPeopleSearchStatusDto6 = new CatalogGetPeopleSearchStatusDto("MARRIED", 5, "married");
        MARRIED = catalogGetPeopleSearchStatusDto6;
        CatalogGetPeopleSearchStatusDto catalogGetPeopleSearchStatusDto7 = new CatalogGetPeopleSearchStatusDto("MEETS", 6, "meets");
        MEETS = catalogGetPeopleSearchStatusDto7;
        CatalogGetPeopleSearchStatusDto catalogGetPeopleSearchStatusDto8 = new CatalogGetPeopleSearchStatusDto("NOT_MARRIED", 7, "not_married");
        NOT_MARRIED = catalogGetPeopleSearchStatusDto8;
        CatalogGetPeopleSearchStatusDto[] catalogGetPeopleSearchStatusDtoArr = {catalogGetPeopleSearchStatusDto, catalogGetPeopleSearchStatusDto2, catalogGetPeopleSearchStatusDto3, catalogGetPeopleSearchStatusDto4, catalogGetPeopleSearchStatusDto5, catalogGetPeopleSearchStatusDto6, catalogGetPeopleSearchStatusDto7, catalogGetPeopleSearchStatusDto8};
        $VALUES = catalogGetPeopleSearchStatusDtoArr;
        $ENTRIES = new asp(catalogGetPeopleSearchStatusDtoArr);
        CREATOR = new a();
    }

    private CatalogGetPeopleSearchStatusDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetPeopleSearchStatusDto valueOf(String str) {
        return (CatalogGetPeopleSearchStatusDto) Enum.valueOf(CatalogGetPeopleSearchStatusDto.class, str);
    }

    public static CatalogGetPeopleSearchStatusDto[] values() {
        return (CatalogGetPeopleSearchStatusDto[]) $VALUES.clone();
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
