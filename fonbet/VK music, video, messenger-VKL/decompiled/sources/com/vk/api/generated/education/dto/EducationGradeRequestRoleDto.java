package com.vk.api.generated.education.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EducationGradeRequestRoleDto.kt */
/* loaded from: classes14.dex */
public final class EducationGradeRequestRoleDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EducationGradeRequestRoleDto[] $VALUES;
    public static final Parcelable.Creator<EducationGradeRequestRoleDto> CREATOR;

    @pmi0("1")
    public static final EducationGradeRequestRoleDto STUDENT;

    @pmi0("2")
    public static final EducationGradeRequestRoleDto TEACHER;
    private final int value;

    /* compiled from: EducationGradeRequestRoleDto.kt */
    public static final class a implements Parcelable.Creator<EducationGradeRequestRoleDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationGradeRequestRoleDto createFromParcel(Parcel parcel) {
            return EducationGradeRequestRoleDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EducationGradeRequestRoleDto[] newArray(int i) {
            return new EducationGradeRequestRoleDto[i];
        }
    }

    static {
        EducationGradeRequestRoleDto educationGradeRequestRoleDto = new EducationGradeRequestRoleDto("STUDENT", 0, 1);
        STUDENT = educationGradeRequestRoleDto;
        EducationGradeRequestRoleDto educationGradeRequestRoleDto2 = new EducationGradeRequestRoleDto("TEACHER", 1, 2);
        TEACHER = educationGradeRequestRoleDto2;
        EducationGradeRequestRoleDto[] educationGradeRequestRoleDtoArr = {educationGradeRequestRoleDto, educationGradeRequestRoleDto2};
        $VALUES = educationGradeRequestRoleDtoArr;
        $ENTRIES = new asp(educationGradeRequestRoleDtoArr);
        CREATOR = new a();
    }

    private EducationGradeRequestRoleDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static EducationGradeRequestRoleDto valueOf(String str) {
        return (EducationGradeRequestRoleDto) Enum.valueOf(EducationGradeRequestRoleDto.class, str);
    }

    public static EducationGradeRequestRoleDto[] values() {
        return (EducationGradeRequestRoleDto[]) $VALUES.clone();
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
