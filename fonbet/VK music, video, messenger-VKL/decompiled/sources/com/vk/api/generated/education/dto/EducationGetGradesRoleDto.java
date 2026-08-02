package com.vk.api.generated.education.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EducationGetGradesRoleDto.kt */
/* loaded from: classes14.dex */
public final class EducationGetGradesRoleDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EducationGetGradesRoleDto[] $VALUES;
    public static final Parcelable.Creator<EducationGetGradesRoleDto> CREATOR;

    @pmi0("1")
    public static final EducationGetGradesRoleDto STUDENT;

    @pmi0("2")
    public static final EducationGetGradesRoleDto TEACHER;
    private final int value;

    /* compiled from: EducationGetGradesRoleDto.kt */
    public static final class a implements Parcelable.Creator<EducationGetGradesRoleDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationGetGradesRoleDto createFromParcel(Parcel parcel) {
            return EducationGetGradesRoleDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EducationGetGradesRoleDto[] newArray(int i) {
            return new EducationGetGradesRoleDto[i];
        }
    }

    static {
        EducationGetGradesRoleDto educationGetGradesRoleDto = new EducationGetGradesRoleDto("STUDENT", 0, 1);
        STUDENT = educationGetGradesRoleDto;
        EducationGetGradesRoleDto educationGetGradesRoleDto2 = new EducationGetGradesRoleDto("TEACHER", 1, 2);
        TEACHER = educationGetGradesRoleDto2;
        EducationGetGradesRoleDto[] educationGetGradesRoleDtoArr = {educationGetGradesRoleDto, educationGetGradesRoleDto2};
        $VALUES = educationGetGradesRoleDtoArr;
        $ENTRIES = new asp(educationGetGradesRoleDtoArr);
        CREATOR = new a();
    }

    private EducationGetGradesRoleDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static EducationGetGradesRoleDto valueOf(String str) {
        return (EducationGetGradesRoleDto) Enum.valueOf(EducationGetGradesRoleDto.class, str);
    }

    public static EducationGetGradesRoleDto[] values() {
        return (EducationGetGradesRoleDto[]) $VALUES.clone();
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
