package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: GroupsIsMemberExtendedDto.kt */
/* loaded from: classes14.dex */
public final class GroupsIsMemberExtendedDto implements Parcelable {
    public static final Parcelable.Creator<GroupsIsMemberExtendedDto> CREATOR = new a();

    @pmi0("admin_level")
    private final GroupsGroupAdminLevelDto adminLevel;

    @pmi0("can_invite")
    private final Boolean canInvite;

    @pmi0("can_recall")
    private final Boolean canRecall;

    @pmi0("invitation")
    private final Boolean invitation;

    @pmi0("is_admin")
    private final Boolean isAdmin;

    @pmi0("member")
    private final boolean member;

    @pmi0("request")
    private final Boolean request;

    /* compiled from: GroupsIsMemberExtendedDto.kt */
    public static final class a implements Parcelable.Creator<GroupsIsMemberExtendedDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsIsMemberExtendedDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            boolean z = parcel.readInt() != 0;
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GroupsIsMemberExtendedDto(z, valueOf, valueOf2, valueOf3, valueOf4, bool, (GroupsGroupAdminLevelDto) parcel.readParcelable(GroupsIsMemberExtendedDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsIsMemberExtendedDto[] newArray(int i) {
            return new GroupsIsMemberExtendedDto[i];
        }
    }

    public GroupsIsMemberExtendedDto(boolean z, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, GroupsGroupAdminLevelDto groupsGroupAdminLevelDto) {
        this.member = z;
        this.invitation = bool;
        this.canInvite = bool2;
        this.canRecall = bool3;
        this.request = bool4;
        this.isAdmin = bool5;
        this.adminLevel = groupsGroupAdminLevelDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsIsMemberExtendedDto)) {
            return false;
        }
        GroupsIsMemberExtendedDto groupsIsMemberExtendedDto = (GroupsIsMemberExtendedDto) obj;
        return this.member == groupsIsMemberExtendedDto.member && epx.f(this.invitation, groupsIsMemberExtendedDto.invitation) && epx.f(this.canInvite, groupsIsMemberExtendedDto.canInvite) && epx.f(this.canRecall, groupsIsMemberExtendedDto.canRecall) && epx.f(this.request, groupsIsMemberExtendedDto.request) && epx.f(this.isAdmin, groupsIsMemberExtendedDto.isAdmin) && this.adminLevel == groupsIsMemberExtendedDto.adminLevel;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.member) * 31;
        Boolean bool = this.invitation;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canInvite;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.canRecall;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.request;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isAdmin;
        int hashCode6 = (hashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        GroupsGroupAdminLevelDto groupsGroupAdminLevelDto = this.adminLevel;
        return hashCode6 + (groupsGroupAdminLevelDto != null ? groupsGroupAdminLevelDto.hashCode() : 0);
    }

    public final String toString() {
        return "GroupsIsMemberExtendedDto(member=" + this.member + ", invitation=" + this.invitation + ", canInvite=" + this.canInvite + ", canRecall=" + this.canRecall + ", request=" + this.request + ", isAdmin=" + this.isAdmin + ", adminLevel=" + this.adminLevel + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.member ? 1 : 0);
        Boolean bool = this.invitation;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.canInvite;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.canRecall;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.request;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.isAdmin;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        parcel.writeParcelable(this.adminLevel, i);
    }

    public /* synthetic */ GroupsIsMemberExtendedDto(boolean z, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, GroupsGroupAdminLevelDto groupsGroupAdminLevelDto, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : bool4, (i & 32) != 0 ? null : bool5, (i & 64) != 0 ? null : groupsGroupAdminLevelDto);
    }
}
