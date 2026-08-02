package com.vk.api.generated.education.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EducationGetGradeRequestsRoleDto.kt */
/* loaded from: classes14.dex */
public final class EducationGetGradeRequestsRoleDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EducationGetGradeRequestsRoleDto[] $VALUES;
    public static final Parcelable.Creator<EducationGetGradeRequestsRoleDto> CREATOR;

    @pmi0("1")
    public static final EducationGetGradeRequestsRoleDto STUDENT;

    @pmi0("2")
    public static final EducationGetGradeRequestsRoleDto TEACHER;
    private final int value;

    /* compiled from: EducationGetGradeRequestsRoleDto.kt */
    public static final class a implements Parcelable.Creator<EducationGetGradeRequestsRoleDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationGetGradeRequestsRoleDto createFromParcel(Parcel parcel) {
            return EducationGetGradeRequestsRoleDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EducationGetGradeRequestsRoleDto[] newArray(int i) {
            return new EducationGetGradeRequestsRoleDto[i];
        }
    }

    static {
        EducationGetGradeRequestsRoleDto educationGetGradeRequestsRoleDto = new EducationGetGradeRequestsRoleDto("STUDENT", 0, 1);
        STUDENT = educationGetGradeRequestsRoleDto;
        EducationGetGradeRequestsRoleDto educationGetGradeRequestsRoleDto2 = new EducationGetGradeRequestsRoleDto("TEACHER", 1, 2);
        TEACHER = educationGetGradeRequestsRoleDto2;
        EducationGetGradeRequestsRoleDto[] educationGetGradeRequestsRoleDtoArr = {educationGetGradeRequestsRoleDto, educationGetGradeRequestsRoleDto2};
        $VALUES = educationGetGradeRequestsRoleDtoArr;
        $ENTRIES = new asp(educationGetGradeRequestsRoleDtoArr);
        CREATOR = new a();
    }

    private EducationGetGradeRequestsRoleDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static EducationGetGradeRequestsRoleDto valueOf(String str) {
        return (EducationGetGradeRequestsRoleDto) Enum.valueOf(EducationGetGradeRequestsRoleDto.class, str);
    }

    public static EducationGetGradeRequestsRoleDto[] values() {
        return (EducationGetGradeRequestsRoleDto[]) $VALUES.clone();
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
