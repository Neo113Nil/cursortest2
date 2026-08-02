package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupAdminLevelDto;
import com.vk.api.generated.groups.dto.GroupsGroupIsClosedDto;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: WallPostingSettingsWallGroupDto.kt */
/* loaded from: classes15.dex */
public final class WallPostingSettingsWallGroupDto implements Parcelable {
    public static final Parcelable.Creator<WallPostingSettingsWallGroupDto> CREATOR = new a();

    @pmi0("admin_level")
    private final GroupsGroupAdminLevelDto adminLevel;

    @pmi0("comments_are_closed")
    private final boolean commentsAreClosed;

    @pmi0("has_podcasts")
    private final boolean hasPodcasts;

    @pmi0("is_admin")
    private final boolean isAdmin;

    @pmi0("privacy_type")
    private final GroupsGroupIsClosedDto privacyType;

    @pmi0("wall")
    private final WallGroupWallStatusDto wall;

    /* compiled from: WallPostingSettingsWallGroupDto.kt */
    public static final class a implements Parcelable.Creator<WallPostingSettingsWallGroupDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPostingSettingsWallGroupDto createFromParcel(Parcel parcel) {
            Class cls;
            GroupsGroupIsClosedDto groupsGroupIsClosedDto;
            boolean z;
            boolean z2;
            GroupsGroupIsClosedDto groupsGroupIsClosedDto2 = (GroupsGroupIsClosedDto) parcel.readParcelable(WallPostingSettingsWallGroupDto.class.getClassLoader());
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                cls = WallPostingSettingsWallGroupDto.class;
                groupsGroupIsClosedDto = groupsGroupIsClosedDto2;
                z = true;
            } else {
                cls = WallPostingSettingsWallGroupDto.class;
                groupsGroupIsClosedDto = groupsGroupIsClosedDto2;
                z = false;
            }
            WallGroupWallStatusDto createFromParcel = WallGroupWallStatusDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z2 = false;
                z3 = true;
            } else {
                z2 = false;
            }
            return new WallPostingSettingsWallGroupDto(groupsGroupIsClosedDto, z, createFromParcel, z3, parcel.readInt() == 0 ? z2 : true, (GroupsGroupAdminLevelDto) parcel.readParcelable(cls.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final WallPostingSettingsWallGroupDto[] newArray(int i) {
            return new WallPostingSettingsWallGroupDto[i];
        }
    }

    public WallPostingSettingsWallGroupDto(GroupsGroupIsClosedDto groupsGroupIsClosedDto, boolean z, WallGroupWallStatusDto wallGroupWallStatusDto, boolean z2, boolean z3, GroupsGroupAdminLevelDto groupsGroupAdminLevelDto) {
        this.privacyType = groupsGroupIsClosedDto;
        this.isAdmin = z;
        this.wall = wallGroupWallStatusDto;
        this.commentsAreClosed = z2;
        this.hasPodcasts = z3;
        this.adminLevel = groupsGroupAdminLevelDto;
    }

    public final GroupsGroupAdminLevelDto d() {
        return this.adminLevel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.commentsAreClosed;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallPostingSettingsWallGroupDto)) {
            return false;
        }
        WallPostingSettingsWallGroupDto wallPostingSettingsWallGroupDto = (WallPostingSettingsWallGroupDto) obj;
        return this.privacyType == wallPostingSettingsWallGroupDto.privacyType && this.isAdmin == wallPostingSettingsWallGroupDto.isAdmin && this.wall == wallPostingSettingsWallGroupDto.wall && this.commentsAreClosed == wallPostingSettingsWallGroupDto.commentsAreClosed && this.hasPodcasts == wallPostingSettingsWallGroupDto.hasPodcasts && this.adminLevel == wallPostingSettingsWallGroupDto.adminLevel;
    }

    public final GroupsGroupIsClosedDto f() {
        return this.privacyType;
    }

    public final WallGroupWallStatusDto g() {
        return this.wall;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b((this.wall.hashCode() + qoy.b(this.privacyType.hashCode() * 31, 31, this.isAdmin)) * 31, 31, this.commentsAreClosed), 31, this.hasPodcasts);
        GroupsGroupAdminLevelDto groupsGroupAdminLevelDto = this.adminLevel;
        return b + (groupsGroupAdminLevelDto == null ? 0 : groupsGroupAdminLevelDto.hashCode());
    }

    public final boolean i() {
        return this.isAdmin;
    }

    public final String toString() {
        return "WallPostingSettingsWallGroupDto(privacyType=" + this.privacyType + ", isAdmin=" + this.isAdmin + ", wall=" + this.wall + ", commentsAreClosed=" + this.commentsAreClosed + ", hasPodcasts=" + this.hasPodcasts + ", adminLevel=" + this.adminLevel + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.privacyType, i);
        parcel.writeInt(this.isAdmin ? 1 : 0);
        this.wall.writeToParcel(parcel, i);
        parcel.writeInt(this.commentsAreClosed ? 1 : 0);
        parcel.writeInt(this.hasPodcasts ? 1 : 0);
        parcel.writeParcelable(this.adminLevel, i);
    }

    public /* synthetic */ WallPostingSettingsWallGroupDto(GroupsGroupIsClosedDto groupsGroupIsClosedDto, boolean z, WallGroupWallStatusDto wallGroupWallStatusDto, boolean z2, boolean z3, GroupsGroupAdminLevelDto groupsGroupAdminLevelDto, int i, zcl zclVar) {
        this(groupsGroupIsClosedDto, z, wallGroupWallStatusDto, z2, z3, (i & 32) != 0 ? null : groupsGroupAdminLevelDto);
    }
}
