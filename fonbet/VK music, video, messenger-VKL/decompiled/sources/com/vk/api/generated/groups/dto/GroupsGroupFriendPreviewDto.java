package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: GroupsGroupFriendPreviewDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupFriendPreviewDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGroupFriendPreviewDto> CREATOR = new a();

    @pmi0("friend_id")
    private final UserId friendId;

    @pmi0("is_don")
    private final Boolean isDon;

    /* compiled from: GroupsGroupFriendPreviewDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupFriendPreviewDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupFriendPreviewDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            UserId userId = (UserId) parcel.readParcelable(GroupsGroupFriendPreviewDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GroupsGroupFriendPreviewDto(userId, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupFriendPreviewDto[] newArray(int i) {
            return new GroupsGroupFriendPreviewDto[i];
        }
    }

    public GroupsGroupFriendPreviewDto(UserId userId, Boolean bool) {
        this.friendId = userId;
        this.isDon = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupFriendPreviewDto)) {
            return false;
        }
        GroupsGroupFriendPreviewDto groupsGroupFriendPreviewDto = (GroupsGroupFriendPreviewDto) obj;
        return epx.f(this.friendId, groupsGroupFriendPreviewDto.friendId) && epx.f(this.isDon, groupsGroupFriendPreviewDto.isDon);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.friendId.b) * 31;
        Boolean bool = this.isDon;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGroupFriendPreviewDto(friendId=");
        sb.append(this.friendId);
        sb.append(", isDon=");
        return tn.a(sb, this.isDon, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.friendId, i);
        Boolean bool = this.isDon;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ GroupsGroupFriendPreviewDto(UserId userId, Boolean bool, int i, zcl zclVar) {
        this(userId, (i & 2) != 0 ? null : bool);
    }
}
