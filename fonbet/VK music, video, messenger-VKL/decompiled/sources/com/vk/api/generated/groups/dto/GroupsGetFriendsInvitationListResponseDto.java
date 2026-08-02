package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsGetFriendsInvitationListResponseDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGetFriendsInvitationListResponseDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGetFriendsInvitationListResponseDto> CREATOR = new a();

    @pmi0("count")
    private final Integer count;

    @pmi0("invited_count")
    private final Integer invitedCount;

    @pmi0("invites_limit")
    private final Integer invitesLimit;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("users")
    private final List<GroupsFriendInvitationDto> users;

    /* compiled from: GroupsGetFriendsInvitationListResponseDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGetFriendsInvitationListResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGetFriendsInvitationListResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(GroupsFriendInvitationDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new GroupsGetFriendsInvitationListResponseDto(arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGetFriendsInvitationListResponseDto[] newArray(int i) {
            return new GroupsGetFriendsInvitationListResponseDto[i];
        }
    }

    public GroupsGetFriendsInvitationListResponseDto(List<GroupsFriendInvitationDto> list, Integer num, Integer num2, Integer num3, String str) {
        this.users = list;
        this.invitedCount = num;
        this.invitesLimit = num2;
        this.count = num3;
        this.nextFrom = str;
    }

    public final Integer d() {
        return this.count;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.invitedCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetFriendsInvitationListResponseDto)) {
            return false;
        }
        GroupsGetFriendsInvitationListResponseDto groupsGetFriendsInvitationListResponseDto = (GroupsGetFriendsInvitationListResponseDto) obj;
        return epx.f(this.users, groupsGetFriendsInvitationListResponseDto.users) && epx.f(this.invitedCount, groupsGetFriendsInvitationListResponseDto.invitedCount) && epx.f(this.invitesLimit, groupsGetFriendsInvitationListResponseDto.invitesLimit) && epx.f(this.count, groupsGetFriendsInvitationListResponseDto.count) && epx.f(this.nextFrom, groupsGetFriendsInvitationListResponseDto.nextFrom);
    }

    public final Integer f() {
        return this.invitesLimit;
    }

    public final String g() {
        return this.nextFrom;
    }

    public final int hashCode() {
        int hashCode = this.users.hashCode() * 31;
        Integer num = this.invitedCount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.invitesLimit;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.count;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.nextFrom;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final List<GroupsFriendInvitationDto> i() {
        return this.users;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGetFriendsInvitationListResponseDto(users=");
        sb.append(this.users);
        sb.append(", invitedCount=");
        sb.append(this.invitedCount);
        sb.append(", invitesLimit=");
        sb.append(this.invitesLimit);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.nextFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.users);
        while (a2.hasNext()) {
            ((GroupsFriendInvitationDto) a2.next()).writeToParcel(parcel, i);
        }
        Integer num = this.invitedCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.invitesLimit;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.count;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeString(this.nextFrom);
    }

    public /* synthetic */ GroupsGetFriendsInvitationListResponseDto(List list, Integer num, Integer num2, Integer num3, String str, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : str);
    }
}
