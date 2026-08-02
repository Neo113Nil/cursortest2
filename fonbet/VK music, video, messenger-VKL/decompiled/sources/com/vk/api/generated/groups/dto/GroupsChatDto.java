package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: GroupsChatDto.kt */
/* loaded from: classes14.dex */
public final class GroupsChatDto implements Parcelable {
    public static final Parcelable.Creator<GroupsChatDto> CREATOR = new a();

    @pmi0("activity_count")
    private final Integer activityCount;

    @pmi0("donut_level_id")
    private final Integer donutLevelId;

    @pmi0("id")
    private final int id;

    @pmi0("invite_link")
    private final String inviteLink;

    @pmi0("is_closed")
    private final Boolean isClosed;

    @pmi0("is_donut")
    private final Boolean isDonut;

    @pmi0("join_modal_params")
    private final GroupsModalParamsChatJoinDto joinModalParams;

    @pmi0("last_message_date")
    private final Integer lastMessageDate;

    @pmi0("members_count")
    private final Integer membersCount;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("peer_id")
    private final UserId peerId;

    @pmi0("photo")
    private final String photo;

    @pmi0("title")
    private final String title;

    /* compiled from: GroupsChatDto.kt */
    public static final class a implements Parcelable.Creator<GroupsChatDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsChatDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            int readInt = parcel.readInt();
            UserId userId = (UserId) parcel.readParcelable(GroupsChatDto.class.getClassLoader());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            UserId userId2 = (UserId) parcel.readParcelable(GroupsChatDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GroupsChatDto(readInt, userId, readString, readString2, readString3, valueOf3, valueOf4, valueOf5, valueOf, userId2, valueOf2, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? GroupsModalParamsChatJoinDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsChatDto[] newArray(int i) {
            return new GroupsChatDto[i];
        }
    }

    public GroupsChatDto(int i, UserId userId, String str, String str2, String str3, Integer num, Integer num2, Integer num3, Boolean bool, UserId userId2, Boolean bool2, Integer num4, GroupsModalParamsChatJoinDto groupsModalParamsChatJoinDto) {
        this.id = i;
        this.peerId = userId;
        this.title = str;
        this.photo = str2;
        this.inviteLink = str3;
        this.activityCount = num;
        this.lastMessageDate = num2;
        this.membersCount = num3;
        this.isClosed = bool;
        this.ownerId = userId2;
        this.isDonut = bool2;
        this.donutLevelId = num4;
        this.joinModalParams = groupsModalParamsChatJoinDto;
    }

    public final Integer d() {
        return this.activityCount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.inviteLink;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsChatDto)) {
            return false;
        }
        GroupsChatDto groupsChatDto = (GroupsChatDto) obj;
        return this.id == groupsChatDto.id && epx.f(this.peerId, groupsChatDto.peerId) && epx.f(this.title, groupsChatDto.title) && epx.f(this.photo, groupsChatDto.photo) && epx.f(this.inviteLink, groupsChatDto.inviteLink) && epx.f(this.activityCount, groupsChatDto.activityCount) && epx.f(this.lastMessageDate, groupsChatDto.lastMessageDate) && epx.f(this.membersCount, groupsChatDto.membersCount) && epx.f(this.isClosed, groupsChatDto.isClosed) && epx.f(this.ownerId, groupsChatDto.ownerId) && epx.f(this.isDonut, groupsChatDto.isDonut) && epx.f(this.donutLevelId, groupsChatDto.donutLevelId) && epx.f(this.joinModalParams, groupsChatDto.joinModalParams);
    }

    public final Integer f() {
        return this.lastMessageDate;
    }

    public final Integer g() {
        return this.membersCount;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        UserId userId = this.peerId;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str = this.title;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photo;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.inviteLink;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.activityCount;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.lastMessageDate;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.membersCount;
        int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.isClosed;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        UserId userId2 = this.ownerId;
        int hashCode10 = (hashCode9 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
        Boolean bool2 = this.isDonut;
        int hashCode11 = (hashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num4 = this.donutLevelId;
        int hashCode12 = (hashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        GroupsModalParamsChatJoinDto groupsModalParamsChatJoinDto = this.joinModalParams;
        return hashCode12 + (groupsModalParamsChatJoinDto != null ? groupsModalParamsChatJoinDto.hashCode() : 0);
    }

    public final UserId i() {
        return this.peerId;
    }

    public final String j() {
        return this.photo;
    }

    public final Boolean k() {
        return this.isDonut;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        return "GroupsChatDto(id=" + this.id + ", peerId=" + this.peerId + ", title=" + this.title + ", photo=" + this.photo + ", inviteLink=" + this.inviteLink + ", activityCount=" + this.activityCount + ", lastMessageDate=" + this.lastMessageDate + ", membersCount=" + this.membersCount + ", isClosed=" + this.isClosed + ", ownerId=" + this.ownerId + ", isDonut=" + this.isDonut + ", donutLevelId=" + this.donutLevelId + ", joinModalParams=" + this.joinModalParams + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.peerId, i);
        parcel.writeString(this.title);
        parcel.writeString(this.photo);
        parcel.writeString(this.inviteLink);
        Integer num = this.activityCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.lastMessageDate;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.membersCount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Boolean bool = this.isClosed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeParcelable(this.ownerId, i);
        Boolean bool2 = this.isDonut;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Integer num4 = this.donutLevelId;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        GroupsModalParamsChatJoinDto groupsModalParamsChatJoinDto = this.joinModalParams;
        if (groupsModalParamsChatJoinDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsModalParamsChatJoinDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GroupsChatDto(int i, UserId userId, String str, String str2, String str3, Integer num, Integer num2, Integer num3, Boolean bool, UserId userId2, Boolean bool2, Integer num4, GroupsModalParamsChatJoinDto groupsModalParamsChatJoinDto, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : userId, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? null : num2, (i2 & 128) != 0 ? null : num3, (i2 & 256) != 0 ? null : bool, (i2 & 512) != 0 ? null : userId2, (i2 & 1024) != 0 ? null : bool2, (i2 & 2048) != 0 ? null : num4, (i2 & 4096) != 0 ? null : groupsModalParamsChatJoinDto);
    }
}
