package com.vk.api.generated.education.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: EducationGradeRoleItemDto.kt */
/* loaded from: classes14.dex */
public final class EducationGradeRoleItemDto implements Parcelable {
    public static final Parcelable.Creator<EducationGradeRoleItemDto> CREATOR = new a();

    @pmi0("role")
    private final EducationGradeRoleDto role;

    @pmi0("role_description")
    private final String roleDescription;

    /* compiled from: EducationGradeRoleItemDto.kt */
    public static final class a implements Parcelable.Creator<EducationGradeRoleItemDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationGradeRoleItemDto createFromParcel(Parcel parcel) {
            return new EducationGradeRoleItemDto(EducationGradeRoleDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EducationGradeRoleItemDto[] newArray(int i) {
            return new EducationGradeRoleItemDto[i];
        }
    }

    public EducationGradeRoleItemDto(EducationGradeRoleDto educationGradeRoleDto, String str) {
        this.role = educationGradeRoleDto;
        this.roleDescription = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationGradeRoleItemDto)) {
            return false;
        }
        EducationGradeRoleItemDto educationGradeRoleItemDto = (EducationGradeRoleItemDto) obj;
        return this.role == educationGradeRoleItemDto.role && epx.f(this.roleDescription, educationGradeRoleItemDto.roleDescription);
    }

    public final int hashCode() {
        int hashCode = this.role.hashCode() * 31;
        String str = this.roleDescription;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EducationGradeRoleItemDto(role=");
        sb.append(this.role);
        sb.append(", roleDescription=");
        return ho8.a(sb, this.roleDescription, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.role.writeToParcel(parcel, i);
        parcel.writeString(this.roleDescription);
    }

    public /* synthetic */ EducationGradeRoleItemDto(EducationGradeRoleDto educationGradeRoleDto, String str, int i, zcl zclVar) {
        this(educationGradeRoleDto, (i & 2) != 0 ? null : str);
    }
}
