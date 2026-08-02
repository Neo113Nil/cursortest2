package com.vk.api.generated.education.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EducationGradeRoleDto.kt */
/* loaded from: classes14.dex */
public final class EducationGradeRoleDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EducationGradeRoleDto[] $VALUES;

    @pmi0("4")
    public static final EducationGradeRoleDto ADMIN;

    @pmi0("3")
    public static final EducationGradeRoleDto CLASS_TEACHER;
    public static final Parcelable.Creator<EducationGradeRoleDto> CREATOR;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final EducationGradeRoleDto EMPLOYEE;

    @pmi0("1")
    public static final EducationGradeRoleDto STUDENT;

    @pmi0("2")
    public static final EducationGradeRoleDto TEACHER;
    private final int value;

    /* compiled from: EducationGradeRoleDto.kt */
    public static final class a implements Parcelable.Creator<EducationGradeRoleDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationGradeRoleDto createFromParcel(Parcel parcel) {
            return EducationGradeRoleDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EducationGradeRoleDto[] newArray(int i) {
            return new EducationGradeRoleDto[i];
        }
    }

    static {
        EducationGradeRoleDto educationGradeRoleDto = new EducationGradeRoleDto("STUDENT", 0, 1);
        STUDENT = educationGradeRoleDto;
        EducationGradeRoleDto educationGradeRoleDto2 = new EducationGradeRoleDto("TEACHER", 1, 2);
        TEACHER = educationGradeRoleDto2;
        EducationGradeRoleDto educationGradeRoleDto3 = new EducationGradeRoleDto("CLASS_TEACHER", 2, 3);
        CLASS_TEACHER = educationGradeRoleDto3;
        EducationGradeRoleDto educationGradeRoleDto4 = new EducationGradeRoleDto("ADMIN", 3, 4);
        ADMIN = educationGradeRoleDto4;
        EducationGradeRoleDto educationGradeRoleDto5 = new EducationGradeRoleDto("EMPLOYEE", 4, 5);
        EMPLOYEE = educationGradeRoleDto5;
        EducationGradeRoleDto[] educationGradeRoleDtoArr = {educationGradeRoleDto, educationGradeRoleDto2, educationGradeRoleDto3, educationGradeRoleDto4, educationGradeRoleDto5};
        $VALUES = educationGradeRoleDtoArr;
        $ENTRIES = new asp(educationGradeRoleDtoArr);
        CREATOR = new a();
    }

    private EducationGradeRoleDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static EducationGradeRoleDto valueOf(String str) {
        return (EducationGradeRoleDto) Enum.valueOf(EducationGradeRoleDto.class, str);
    }

    public static EducationGradeRoleDto[] values() {
        return (EducationGradeRoleDto[]) $VALUES.clone();
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
