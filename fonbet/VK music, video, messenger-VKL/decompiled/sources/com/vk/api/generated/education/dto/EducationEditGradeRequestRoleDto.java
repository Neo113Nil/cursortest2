package com.vk.api.generated.education.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EducationEditGradeRequestRoleDto.kt */
/* loaded from: classes14.dex */
public final class EducationEditGradeRequestRoleDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EducationEditGradeRequestRoleDto[] $VALUES;
    public static final Parcelable.Creator<EducationEditGradeRequestRoleDto> CREATOR;

    @pmi0("1")
    public static final EducationEditGradeRequestRoleDto STUDENT;

    @pmi0("2")
    public static final EducationEditGradeRequestRoleDto TEACHER;
    private final int value;

    /* compiled from: EducationEditGradeRequestRoleDto.kt */
    public static final class a implements Parcelable.Creator<EducationEditGradeRequestRoleDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationEditGradeRequestRoleDto createFromParcel(Parcel parcel) {
            return EducationEditGradeRequestRoleDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EducationEditGradeRequestRoleDto[] newArray(int i) {
            return new EducationEditGradeRequestRoleDto[i];
        }
    }

    static {
        EducationEditGradeRequestRoleDto educationEditGradeRequestRoleDto = new EducationEditGradeRequestRoleDto("STUDENT", 0, 1);
        STUDENT = educationEditGradeRequestRoleDto;
        EducationEditGradeRequestRoleDto educationEditGradeRequestRoleDto2 = new EducationEditGradeRequestRoleDto("TEACHER", 1, 2);
        TEACHER = educationEditGradeRequestRoleDto2;
        EducationEditGradeRequestRoleDto[] educationEditGradeRequestRoleDtoArr = {educationEditGradeRequestRoleDto, educationEditGradeRequestRoleDto2};
        $VALUES = educationEditGradeRequestRoleDtoArr;
        $ENTRIES = new asp(educationEditGradeRequestRoleDtoArr);
        CREATOR = new a();
    }

    private EducationEditGradeRequestRoleDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static EducationEditGradeRequestRoleDto valueOf(String str) {
        return (EducationEditGradeRequestRoleDto) Enum.valueOf(EducationEditGradeRequestRoleDto.class, str);
    }

    public static EducationEditGradeRequestRoleDto[] values() {
        return (EducationEditGradeRequestRoleDto[]) $VALUES.clone();
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
