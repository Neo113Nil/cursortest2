package com.vk.api.generated.education.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EducationGetSchoolsExtendedSortDto.kt */
/* loaded from: classes14.dex */
public final class EducationGetSchoolsExtendedSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EducationGetSchoolsExtendedSortDto[] $VALUES;
    public static final Parcelable.Creator<EducationGetSchoolsExtendedSortDto> CREATOR;

    @pmi0("name_asc")
    public static final EducationGetSchoolsExtendedSortDto NAME_ASC;

    @pmi0("name_desc")
    public static final EducationGetSchoolsExtendedSortDto NAME_DESC;
    private final String value;

    /* compiled from: EducationGetSchoolsExtendedSortDto.kt */
    public static final class a implements Parcelable.Creator<EducationGetSchoolsExtendedSortDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationGetSchoolsExtendedSortDto createFromParcel(Parcel parcel) {
            return EducationGetSchoolsExtendedSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EducationGetSchoolsExtendedSortDto[] newArray(int i) {
            return new EducationGetSchoolsExtendedSortDto[i];
        }
    }

    static {
        EducationGetSchoolsExtendedSortDto educationGetSchoolsExtendedSortDto = new EducationGetSchoolsExtendedSortDto("NAME_ASC", 0, "name_asc");
        NAME_ASC = educationGetSchoolsExtendedSortDto;
        EducationGetSchoolsExtendedSortDto educationGetSchoolsExtendedSortDto2 = new EducationGetSchoolsExtendedSortDto("NAME_DESC", 1, "name_desc");
        NAME_DESC = educationGetSchoolsExtendedSortDto2;
        EducationGetSchoolsExtendedSortDto[] educationGetSchoolsExtendedSortDtoArr = {educationGetSchoolsExtendedSortDto, educationGetSchoolsExtendedSortDto2};
        $VALUES = educationGetSchoolsExtendedSortDtoArr;
        $ENTRIES = new asp(educationGetSchoolsExtendedSortDtoArr);
        CREATOR = new a();
    }

    private EducationGetSchoolsExtendedSortDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static EducationGetSchoolsExtendedSortDto valueOf(String str) {
        return (EducationGetSchoolsExtendedSortDto) Enum.valueOf(EducationGetSchoolsExtendedSortDto.class, str);
    }

    public static EducationGetSchoolsExtendedSortDto[] values() {
        return (EducationGetSchoolsExtendedSortDto[]) $VALUES.clone();
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
