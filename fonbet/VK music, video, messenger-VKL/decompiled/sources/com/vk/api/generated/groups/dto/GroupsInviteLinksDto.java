package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: GroupsInviteLinksDto.kt */
/* loaded from: classes14.dex */
public final class GroupsInviteLinksDto implements Parcelable {
    public static final Parcelable.Creator<GroupsInviteLinksDto> CREATOR = new a();

    @pmi0("create_time")
    private final Long createTime;

    @pmi0("expire_count")
    private final Integer expireCount;

    @pmi0("expire_time")
    private final Long expireTime;

    @pmi0("group_id")
    private final UserId groupId;

    @pmi0("id")
    private final Integer id;

    @pmi0("invited_count")
    private final Integer invitedCount;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("url")
    private final String url;

    /* compiled from: GroupsInviteLinksDto.kt */
    public static final class a implements Parcelable.Creator<GroupsInviteLinksDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsInviteLinksDto createFromParcel(Parcel parcel) {
            return new GroupsInviteLinksDto((UserId) parcel.readParcelable(GroupsInviteLinksDto.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (UserId) parcel.readParcelable(GroupsInviteLinksDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsInviteLinksDto[] newArray(int i) {
            return new GroupsInviteLinksDto[i];
        }
    }

    public GroupsInviteLinksDto(UserId userId, String str, Integer num, UserId userId2, Long l, Long l2, Integer num2, Integer num3) {
        this.groupId = userId;
        this.url = str;
        this.id = num;
        this.ownerId = userId2;
        this.createTime = l;
        this.expireTime = l2;
        this.expireCount = num2;
        this.invitedCount = num3;
    }

    public final Long d() {
        return this.createTime;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.expireCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsInviteLinksDto)) {
            return false;
        }
        GroupsInviteLinksDto groupsInviteLinksDto = (GroupsInviteLinksDto) obj;
        return epx.f(this.groupId, groupsInviteLinksDto.groupId) && epx.f(this.url, groupsInviteLinksDto.url) && epx.f(this.id, groupsInviteLinksDto.id) && epx.f(this.ownerId, groupsInviteLinksDto.ownerId) && epx.f(this.createTime, groupsInviteLinksDto.createTime) && epx.f(this.expireTime, groupsInviteLinksDto.expireTime) && epx.f(this.expireCount, groupsInviteLinksDto.expireCount) && epx.f(this.invitedCount, groupsInviteLinksDto.invitedCount);
    }

    public final Long f() {
        return this.expireTime;
    }

    public final UserId g() {
        return this.groupId;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int a2 = urd0.a(Long.hashCode(this.groupId.b) * 31, 31, this.url);
        Integer num = this.id;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        UserId userId = this.ownerId;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Long l = this.createTime;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.expireTime;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num2 = this.expireCount;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.invitedCount;
        return hashCode5 + (num3 != null ? num3.hashCode() : 0);
    }

    public final Integer i() {
        return this.id;
    }

    public final Integer j() {
        return this.invitedCount;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsInviteLinksDto(groupId=");
        sb.append(this.groupId);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", createTime=");
        sb.append(this.createTime);
        sb.append(", expireTime=");
        sb.append(this.expireTime);
        sb.append(", expireCount=");
        sb.append(this.expireCount);
        sb.append(", invitedCount=");
        return uqi.b(sb, this.invitedCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.groupId, i);
        parcel.writeString(this.url);
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.ownerId, i);
        Long l = this.createTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        Long l2 = this.expireTime;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l2);
        }
        Integer num2 = this.expireCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.invitedCount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
    }

    public /* synthetic */ GroupsInviteLinksDto(UserId userId, String str, Integer num, UserId userId2, Long l, Long l2, Integer num2, Integer num3, int i, zcl zclVar) {
        this(userId, str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : userId2, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : l2, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : num3);
    }
}
