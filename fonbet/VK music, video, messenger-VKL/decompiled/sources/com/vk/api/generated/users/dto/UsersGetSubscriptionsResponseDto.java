package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupsArrayDto;
import xsna.epx;
import xsna.pmi0;

/* compiled from: UsersGetSubscriptionsResponseDto.kt */
/* loaded from: classes15.dex */
public final class UsersGetSubscriptionsResponseDto implements Parcelable {
    public static final Parcelable.Creator<UsersGetSubscriptionsResponseDto> CREATOR = new a();

    @pmi0("groups")
    private final GroupsGroupsArrayDto groups;

    @pmi0("users")
    private final UsersUsersArrayDto users;

    /* compiled from: UsersGetSubscriptionsResponseDto.kt */
    public static final class a implements Parcelable.Creator<UsersGetSubscriptionsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersGetSubscriptionsResponseDto createFromParcel(Parcel parcel) {
            return new UsersGetSubscriptionsResponseDto(UsersUsersArrayDto.CREATOR.createFromParcel(parcel), GroupsGroupsArrayDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final UsersGetSubscriptionsResponseDto[] newArray(int i) {
            return new UsersGetSubscriptionsResponseDto[i];
        }
    }

    public UsersGetSubscriptionsResponseDto(UsersUsersArrayDto usersUsersArrayDto, GroupsGroupsArrayDto groupsGroupsArrayDto) {
        this.users = usersUsersArrayDto;
        this.groups = groupsGroupsArrayDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersGetSubscriptionsResponseDto)) {
            return false;
        }
        UsersGetSubscriptionsResponseDto usersGetSubscriptionsResponseDto = (UsersGetSubscriptionsResponseDto) obj;
        return epx.f(this.users, usersGetSubscriptionsResponseDto.users) && epx.f(this.groups, usersGetSubscriptionsResponseDto.groups);
    }

    public final int hashCode() {
        return this.groups.hashCode() + (this.users.hashCode() * 31);
    }

    public final String toString() {
        return "UsersGetSubscriptionsResponseDto(users=" + this.users + ", groups=" + this.groups + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.users.writeToParcel(parcel, i);
        this.groups.writeToParcel(parcel, i);
    }
}
