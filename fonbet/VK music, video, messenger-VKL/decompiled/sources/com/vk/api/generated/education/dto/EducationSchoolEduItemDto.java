package com.vk.api.generated.education.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.groups.dto.GroupsGroupAdminLevelDto;
import com.vk.api.generated.groups.dto.GroupsGroupIsClosedDto;
import com.vk.api.generated.groups.dto.GroupsGroupTypeDto;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: EducationSchoolEduItemDto.kt */
/* loaded from: classes14.dex */
public final class EducationSchoolEduItemDto implements Parcelable {
    public static final Parcelable.Creator<EducationSchoolEduItemDto> CREATOR = new a();

    @pmi0("admin_level")
    private final GroupsGroupAdminLevelDto adminLevel;

    @pmi0("id")
    private final UserId id;

    @pmi0("is_admin")
    private final BaseBoolIntDto isAdmin;

    @pmi0("is_advertiser")
    private final BaseBoolIntDto isAdvertiser;

    @pmi0("is_closed")
    private final GroupsGroupIsClosedDto isClosed;

    @pmi0("is_member")
    private final BaseBoolIntDto isMember;

    @pmi0("name")
    private final String name;

    @pmi0("organization_type")
    private final EducationOrganizationTypeDto organizationType;

    @pmi0("photo_100")
    private final String photo100;

    @pmi0("photo_200")
    private final String photo200;

    @pmi0("photo_50")
    private final String photo50;

    @pmi0("photo_base")
    private final String photoBase;

    @pmi0("screen_name")
    private final String screenName;

    @pmi0("type")
    private final GroupsGroupTypeDto type;

    /* compiled from: EducationSchoolEduItemDto.kt */
    public static final class a implements Parcelable.Creator<EducationSchoolEduItemDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationSchoolEduItemDto createFromParcel(Parcel parcel) {
            return new EducationSchoolEduItemDto((UserId) parcel.readParcelable(EducationSchoolEduItemDto.class.getClassLoader()), parcel.readString(), parcel.readString(), (GroupsGroupIsClosedDto) parcel.readParcelable(EducationSchoolEduItemDto.class.getClassLoader()), (GroupsGroupTypeDto) parcel.readParcelable(EducationSchoolEduItemDto.class.getClassLoader()), (BaseBoolIntDto) parcel.readParcelable(EducationSchoolEduItemDto.class.getClassLoader()), (GroupsGroupAdminLevelDto) parcel.readParcelable(EducationSchoolEduItemDto.class.getClassLoader()), (BaseBoolIntDto) parcel.readParcelable(EducationSchoolEduItemDto.class.getClassLoader()), (BaseBoolIntDto) parcel.readParcelable(EducationSchoolEduItemDto.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : EducationOrganizationTypeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final EducationSchoolEduItemDto[] newArray(int i) {
            return new EducationSchoolEduItemDto[i];
        }
    }

    public EducationSchoolEduItemDto(UserId userId, String str, String str2, GroupsGroupIsClosedDto groupsGroupIsClosedDto, GroupsGroupTypeDto groupsGroupTypeDto, BaseBoolIntDto baseBoolIntDto, GroupsGroupAdminLevelDto groupsGroupAdminLevelDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, String str3, String str4, String str5, String str6, EducationOrganizationTypeDto educationOrganizationTypeDto) {
        this.id = userId;
        this.name = str;
        this.screenName = str2;
        this.isClosed = groupsGroupIsClosedDto;
        this.type = groupsGroupTypeDto;
        this.isAdmin = baseBoolIntDto;
        this.adminLevel = groupsGroupAdminLevelDto;
        this.isMember = baseBoolIntDto2;
        this.isAdvertiser = baseBoolIntDto3;
        this.photo50 = str3;
        this.photo100 = str4;
        this.photo200 = str5;
        this.photoBase = str6;
        this.organizationType = educationOrganizationTypeDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationSchoolEduItemDto)) {
            return false;
        }
        EducationSchoolEduItemDto educationSchoolEduItemDto = (EducationSchoolEduItemDto) obj;
        return epx.f(this.id, educationSchoolEduItemDto.id) && epx.f(this.name, educationSchoolEduItemDto.name) && epx.f(this.screenName, educationSchoolEduItemDto.screenName) && this.isClosed == educationSchoolEduItemDto.isClosed && this.type == educationSchoolEduItemDto.type && this.isAdmin == educationSchoolEduItemDto.isAdmin && this.adminLevel == educationSchoolEduItemDto.adminLevel && this.isMember == educationSchoolEduItemDto.isMember && this.isAdvertiser == educationSchoolEduItemDto.isAdvertiser && epx.f(this.photo50, educationSchoolEduItemDto.photo50) && epx.f(this.photo100, educationSchoolEduItemDto.photo100) && epx.f(this.photo200, educationSchoolEduItemDto.photo200) && epx.f(this.photoBase, educationSchoolEduItemDto.photoBase) && epx.f(this.organizationType, educationSchoolEduItemDto.organizationType);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.id.b) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.screenName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        GroupsGroupIsClosedDto groupsGroupIsClosedDto = this.isClosed;
        int hashCode4 = (hashCode3 + (groupsGroupIsClosedDto == null ? 0 : groupsGroupIsClosedDto.hashCode())) * 31;
        GroupsGroupTypeDto groupsGroupTypeDto = this.type;
        int hashCode5 = (hashCode4 + (groupsGroupTypeDto == null ? 0 : groupsGroupTypeDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.isAdmin;
        int hashCode6 = (hashCode5 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        GroupsGroupAdminLevelDto groupsGroupAdminLevelDto = this.adminLevel;
        int hashCode7 = (hashCode6 + (groupsGroupAdminLevelDto == null ? 0 : groupsGroupAdminLevelDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.isMember;
        int hashCode8 = (hashCode7 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.isAdvertiser;
        int hashCode9 = (hashCode8 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        String str3 = this.photo50;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photo100;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.photo200;
        int hashCode12 = (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.photoBase;
        int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        EducationOrganizationTypeDto educationOrganizationTypeDto = this.organizationType;
        return hashCode13 + (educationOrganizationTypeDto != null ? educationOrganizationTypeDto.hashCode() : 0);
    }

    public final String toString() {
        return "EducationSchoolEduItemDto(id=" + this.id + ", name=" + this.name + ", screenName=" + this.screenName + ", isClosed=" + this.isClosed + ", type=" + this.type + ", isAdmin=" + this.isAdmin + ", adminLevel=" + this.adminLevel + ", isMember=" + this.isMember + ", isAdvertiser=" + this.isAdvertiser + ", photo50=" + this.photo50 + ", photo100=" + this.photo100 + ", photo200=" + this.photo200 + ", photoBase=" + this.photoBase + ", organizationType=" + this.organizationType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.id, i);
        parcel.writeString(this.name);
        parcel.writeString(this.screenName);
        parcel.writeParcelable(this.isClosed, i);
        parcel.writeParcelable(this.type, i);
        parcel.writeParcelable(this.isAdmin, i);
        parcel.writeParcelable(this.adminLevel, i);
        parcel.writeParcelable(this.isMember, i);
        parcel.writeParcelable(this.isAdvertiser, i);
        parcel.writeString(this.photo50);
        parcel.writeString(this.photo100);
        parcel.writeString(this.photo200);
        parcel.writeString(this.photoBase);
        EducationOrganizationTypeDto educationOrganizationTypeDto = this.organizationType;
        if (educationOrganizationTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            educationOrganizationTypeDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ EducationSchoolEduItemDto(UserId userId, String str, String str2, GroupsGroupIsClosedDto groupsGroupIsClosedDto, GroupsGroupTypeDto groupsGroupTypeDto, BaseBoolIntDto baseBoolIntDto, GroupsGroupAdminLevelDto groupsGroupAdminLevelDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, String str3, String str4, String str5, String str6, EducationOrganizationTypeDto educationOrganizationTypeDto, int i, zcl zclVar) {
        this(userId, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : groupsGroupIsClosedDto, (i & 16) != 0 ? null : groupsGroupTypeDto, (i & 32) != 0 ? null : baseBoolIntDto, (i & 64) != 0 ? null : groupsGroupAdminLevelDto, (i & 128) != 0 ? null : baseBoolIntDto2, (i & 256) != 0 ? null : baseBoolIntDto3, (i & 512) != 0 ? null : str3, (i & 1024) != 0 ? null : str4, (i & 2048) != 0 ? null : str5, (i & 4096) != 0 ? null : str6, (i & 8192) != 0 ? null : educationOrganizationTypeDto);
    }
}
