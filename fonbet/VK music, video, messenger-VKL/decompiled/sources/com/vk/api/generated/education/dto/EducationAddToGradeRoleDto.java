package com.vk.api.generated.education.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EducationAddToGradeRoleDto.kt */
/* loaded from: classes14.dex */
public final class EducationAddToGradeRoleDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EducationAddToGradeRoleDto[] $VALUES;

    @pmi0("3")
    public static final EducationAddToGradeRoleDto CLASS_TEACHER;
    public static final Parcelable.Creator<EducationAddToGradeRoleDto> CREATOR;

    @pmi0("1")
    public static final EducationAddToGradeRoleDto STUDENT;

    @pmi0("2")
    public static final EducationAddToGradeRoleDto TEACHER;
    private final int value;

    /* compiled from: EducationAddToGradeRoleDto.kt */
    public static final class a implements Parcelable.Creator<EducationAddToGradeRoleDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationAddToGradeRoleDto createFromParcel(Parcel parcel) {
            return EducationAddToGradeRoleDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EducationAddToGradeRoleDto[] newArray(int i) {
            return new EducationAddToGradeRoleDto[i];
        }
    }

    static {
        EducationAddToGradeRoleDto educationAddToGradeRoleDto = new EducationAddToGradeRoleDto("STUDENT", 0, 1);
        STUDENT = educationAddToGradeRoleDto;
        EducationAddToGradeRoleDto educationAddToGradeRoleDto2 = new EducationAddToGradeRoleDto("TEACHER", 1, 2);
        TEACHER = educationAddToGradeRoleDto2;
        EducationAddToGradeRoleDto educationAddToGradeRoleDto3 = new EducationAddToGradeRoleDto("CLASS_TEACHER", 2, 3);
        CLASS_TEACHER = educationAddToGradeRoleDto3;
        EducationAddToGradeRoleDto[] educationAddToGradeRoleDtoArr = {educationAddToGradeRoleDto, educationAddToGradeRoleDto2, educationAddToGradeRoleDto3};
        $VALUES = educationAddToGradeRoleDtoArr;
        $ENTRIES = new asp(educationAddToGradeRoleDtoArr);
        CREATOR = new a();
    }

    private EducationAddToGradeRoleDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static EducationAddToGradeRoleDto valueOf(String str) {
        return (EducationAddToGradeRoleDto) Enum.valueOf(EducationAddToGradeRoleDto.class, str);
    }

    public static EducationAddToGradeRoleDto[] values() {
        return (EducationAddToGradeRoleDto[]) $VALUES.clone();
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
