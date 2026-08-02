package com.vk.api.generated.education.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsUserXtrRoleDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: EducationGradeRequestItemDto.kt */
/* loaded from: classes14.dex */
public final class EducationGradeRequestItemDto implements Parcelable {
    public static final Parcelable.Creator<EducationGradeRequestItemDto> CREATOR = new a();

    @pmi0("grade")
    private final EducationGradeItemDto grade;

    @pmi0("grades")
    private final List<EducationGradeItemDto> grades;

    @pmi0("role")
    private final EducationGradeRoleDto role;

    @pmi0("school")
    private final EducationSchoolItemDto school;

    @pmi0("user")
    private final GroupsUserXtrRoleDto user;

    @pmi0("user_title")
    private final String userTitle;

    /* compiled from: EducationGradeRequestItemDto.kt */
    public static final class a implements Parcelable.Creator<EducationGradeRequestItemDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationGradeRequestItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            GroupsUserXtrRoleDto groupsUserXtrRoleDto = (GroupsUserXtrRoleDto) parcel.readParcelable(EducationGradeRequestItemDto.class.getClassLoader());
            EducationGradeRoleDto createFromParcel = parcel.readInt() == 0 ? null : EducationGradeRoleDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(EducationGradeItemDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new EducationGradeRequestItemDto(groupsUserXtrRoleDto, createFromParcel, arrayList, parcel.readInt() == 0 ? null : EducationGradeItemDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? EducationSchoolItemDto.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EducationGradeRequestItemDto[] newArray(int i) {
            return new EducationGradeRequestItemDto[i];
        }
    }

    public EducationGradeRequestItemDto(GroupsUserXtrRoleDto groupsUserXtrRoleDto, EducationGradeRoleDto educationGradeRoleDto, List<EducationGradeItemDto> list, EducationGradeItemDto educationGradeItemDto, EducationSchoolItemDto educationSchoolItemDto, String str) {
        this.user = groupsUserXtrRoleDto;
        this.role = educationGradeRoleDto;
        this.grades = list;
        this.grade = educationGradeItemDto;
        this.school = educationSchoolItemDto;
        this.userTitle = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationGradeRequestItemDto)) {
            return false;
        }
        EducationGradeRequestItemDto educationGradeRequestItemDto = (EducationGradeRequestItemDto) obj;
        return epx.f(this.user, educationGradeRequestItemDto.user) && this.role == educationGradeRequestItemDto.role && epx.f(this.grades, educationGradeRequestItemDto.grades) && epx.f(this.grade, educationGradeRequestItemDto.grade) && epx.f(this.school, educationGradeRequestItemDto.school) && epx.f(this.userTitle, educationGradeRequestItemDto.userTitle);
    }

    public final int hashCode() {
        int hashCode = this.user.hashCode() * 31;
        EducationGradeRoleDto educationGradeRoleDto = this.role;
        int hashCode2 = (hashCode + (educationGradeRoleDto == null ? 0 : educationGradeRoleDto.hashCode())) * 31;
        List<EducationGradeItemDto> list = this.grades;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        EducationGradeItemDto educationGradeItemDto = this.grade;
        int hashCode4 = (hashCode3 + (educationGradeItemDto == null ? 0 : educationGradeItemDto.hashCode())) * 31;
        EducationSchoolItemDto educationSchoolItemDto = this.school;
        int hashCode5 = (hashCode4 + (educationSchoolItemDto == null ? 0 : educationSchoolItemDto.hashCode())) * 31;
        String str = this.userTitle;
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EducationGradeRequestItemDto(user=");
        sb.append(this.user);
        sb.append(", role=");
        sb.append(this.role);
        sb.append(", grades=");
        sb.append(this.grades);
        sb.append(", grade=");
        sb.append(this.grade);
        sb.append(", school=");
        sb.append(this.school);
        sb.append(", userTitle=");
        return ho8.a(sb, this.userTitle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.user, i);
        EducationGradeRoleDto educationGradeRoleDto = this.role;
        if (educationGradeRoleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            educationGradeRoleDto.writeToParcel(parcel, i);
        }
        List<EducationGradeItemDto> list = this.grades;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((EducationGradeItemDto) f.next()).writeToParcel(parcel, i);
            }
        }
        EducationGradeItemDto educationGradeItemDto = this.grade;
        if (educationGradeItemDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            educationGradeItemDto.writeToParcel(parcel, i);
        }
        EducationSchoolItemDto educationSchoolItemDto = this.school;
        if (educationSchoolItemDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            educationSchoolItemDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.userTitle);
    }

    public /* synthetic */ EducationGradeRequestItemDto(GroupsUserXtrRoleDto groupsUserXtrRoleDto, EducationGradeRoleDto educationGradeRoleDto, List list, EducationGradeItemDto educationGradeItemDto, EducationSchoolItemDto educationSchoolItemDto, String str, int i, zcl zclVar) {
        this(groupsUserXtrRoleDto, (i & 2) != 0 ? null : educationGradeRoleDto, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : educationGradeItemDto, (i & 16) != 0 ? null : educationSchoolItemDto, (i & 32) != 0 ? null : str);
    }
}
