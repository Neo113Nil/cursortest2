package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: GroupsGroupLikeItemDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupLikeItemDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGroupLikeItemDto> CREATOR = new a();

    @pmi0("friends")
    private final GroupsGroupLikeItemFriendsDto friends;

    @pmi0("is_liked")
    private final boolean isLiked;

    /* compiled from: GroupsGroupLikeItemDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupLikeItemDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupLikeItemDto createFromParcel(Parcel parcel) {
            return new GroupsGroupLikeItemDto(parcel.readInt() != 0, GroupsGroupLikeItemFriendsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupLikeItemDto[] newArray(int i) {
            return new GroupsGroupLikeItemDto[i];
        }
    }

    public GroupsGroupLikeItemDto(boolean z, GroupsGroupLikeItemFriendsDto groupsGroupLikeItemFriendsDto) {
        this.isLiked = z;
        this.friends = groupsGroupLikeItemFriendsDto;
    }

    public final boolean J() {
        return this.isLiked;
    }

    public final GroupsGroupLikeItemFriendsDto d() {
        return this.friends;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupLikeItemDto)) {
            return false;
        }
        GroupsGroupLikeItemDto groupsGroupLikeItemDto = (GroupsGroupLikeItemDto) obj;
        return this.isLiked == groupsGroupLikeItemDto.isLiked && epx.f(this.friends, groupsGroupLikeItemDto.friends);
    }

    public final int hashCode() {
        return this.friends.hashCode() + (Boolean.hashCode(this.isLiked) * 31);
    }

    public final String toString() {
        return "GroupsGroupLikeItemDto(isLiked=" + this.isLiked + ", friends=" + this.friends + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isLiked ? 1 : 0);
        this.friends.writeToParcel(parcel, i);
    }
}
