package com.vk.api.generated.education.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EducationGetSchoolsSortDto.kt */
/* loaded from: classes14.dex */
public final class EducationGetSchoolsSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EducationGetSchoolsSortDto[] $VALUES;
    public static final Parcelable.Creator<EducationGetSchoolsSortDto> CREATOR;

    @pmi0("name_asc")
    public static final EducationGetSchoolsSortDto NAME_ASC;

    @pmi0("name_desc")
    public static final EducationGetSchoolsSortDto NAME_DESC;
    private final String value;

    /* compiled from: EducationGetSchoolsSortDto.kt */
    public static final class a implements Parcelable.Creator<EducationGetSchoolsSortDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationGetSchoolsSortDto createFromParcel(Parcel parcel) {
            return EducationGetSchoolsSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EducationGetSchoolsSortDto[] newArray(int i) {
            return new EducationGetSchoolsSortDto[i];
        }
    }

    static {
        EducationGetSchoolsSortDto educationGetSchoolsSortDto = new EducationGetSchoolsSortDto("NAME_ASC", 0, "name_asc");
        NAME_ASC = educationGetSchoolsSortDto;
        EducationGetSchoolsSortDto educationGetSchoolsSortDto2 = new EducationGetSchoolsSortDto("NAME_DESC", 1, "name_desc");
        NAME_DESC = educationGetSchoolsSortDto2;
        EducationGetSchoolsSortDto[] educationGetSchoolsSortDtoArr = {educationGetSchoolsSortDto, educationGetSchoolsSortDto2};
        $VALUES = educationGetSchoolsSortDtoArr;
        $ENTRIES = new asp(educationGetSchoolsSortDtoArr);
        CREATOR = new a();
    }

    private EducationGetSchoolsSortDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static EducationGetSchoolsSortDto valueOf(String str) {
        return (EducationGetSchoolsSortDto) Enum.valueOf(EducationGetSchoolsSortDto.class, str);
    }

    public static EducationGetSchoolsSortDto[] values() {
        return (EducationGetSchoolsSortDto[]) $VALUES.clone();
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
