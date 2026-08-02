package com.vk.api.generated.education.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.api.generated.users.dto.UsersUserDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: EducationInviteLinkResponseDto.kt */
/* loaded from: classes14.dex */
public final class EducationInviteLinkResponseDto implements Parcelable {
    public static final Parcelable.Creator<EducationInviteLinkResponseDto> CREATOR = new a();

    @pmi0("grades")
    private final List<EducationGradeItemDto> grades;

    @pmi0("invite_link")
    private final EducationInviteLinkDto inviteLink;

    @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
    private final UsersUserDto profile;

    @pmi0("school")
    private final EducationSchoolItemDto school;

    /* compiled from: EducationInviteLinkResponseDto.kt */
    public static final class a implements Parcelable.Creator<EducationInviteLinkResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationInviteLinkResponseDto createFromParcel(Parcel parcel) {
            EducationInviteLinkDto createFromParcel = EducationInviteLinkDto.CREATOR.createFromParcel(parcel);
            EducationSchoolItemDto createFromParcel2 = EducationSchoolItemDto.CREATOR.createFromParcel(parcel);
            UsersUserDto usersUserDto = (UsersUserDto) parcel.readParcelable(EducationInviteLinkResponseDto.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(EducationGradeItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new EducationInviteLinkResponseDto(createFromParcel, createFromParcel2, usersUserDto, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final EducationInviteLinkResponseDto[] newArray(int i) {
            return new EducationInviteLinkResponseDto[i];
        }
    }

    public EducationInviteLinkResponseDto(EducationInviteLinkDto educationInviteLinkDto, EducationSchoolItemDto educationSchoolItemDto, UsersUserDto usersUserDto, List<EducationGradeItemDto> list) {
        this.inviteLink = educationInviteLinkDto;
        this.school = educationSchoolItemDto;
        this.profile = usersUserDto;
        this.grades = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationInviteLinkResponseDto)) {
            return false;
        }
        EducationInviteLinkResponseDto educationInviteLinkResponseDto = (EducationInviteLinkResponseDto) obj;
        return epx.f(this.inviteLink, educationInviteLinkResponseDto.inviteLink) && epx.f(this.school, educationInviteLinkResponseDto.school) && epx.f(this.profile, educationInviteLinkResponseDto.profile) && epx.f(this.grades, educationInviteLinkResponseDto.grades);
    }

    public final int hashCode() {
        return this.grades.hashCode() + ((this.profile.hashCode() + ((this.school.hashCode() + (this.inviteLink.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EducationInviteLinkResponseDto(inviteLink=");
        sb.append(this.inviteLink);
        sb.append(", school=");
        sb.append(this.school);
        sb.append(", profile=");
        sb.append(this.profile);
        sb.append(", grades=");
        return ms9.a(')', sb, this.grades);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.inviteLink.writeToParcel(parcel, i);
        this.school.writeToParcel(parcel, i);
        parcel.writeParcelable(this.profile, i);
        Iterator a2 = ao.a(parcel, this.grades);
        while (a2.hasNext()) {
            ((EducationGradeItemDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
