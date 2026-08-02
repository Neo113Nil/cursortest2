package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;

/* compiled from: VkRunSeasonLevelUsersDto.kt */
/* loaded from: classes15.dex */
public final class VkRunSeasonLevelUsersDto implements Parcelable {
    public static final Parcelable.Creator<VkRunSeasonLevelUsersDto> CREATOR = new a();

    @pmi0("friends")
    private final List<VkRunLeaderboardMemberUserDto> friends;

    @pmi0("friends_total")
    private final int friendsTotal;

    @pmi0("users_total")
    private final int usersTotal;

    /* compiled from: VkRunSeasonLevelUsersDto.kt */
    public static final class a implements Parcelable.Creator<VkRunSeasonLevelUsersDto> {
        @Override // android.os.Parcelable.Creator
        public final VkRunSeasonLevelUsersDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            int i = 0;
            while (i != readInt3) {
                i = bo.b(VkRunSeasonLevelUsersDto.class, parcel, arrayList, i, 1);
            }
            return new VkRunSeasonLevelUsersDto(readInt, readInt2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunSeasonLevelUsersDto[] newArray(int i) {
            return new VkRunSeasonLevelUsersDto[i];
        }
    }

    public VkRunSeasonLevelUsersDto(int i, int i2, List<VkRunLeaderboardMemberUserDto> list) {
        this.friendsTotal = i;
        this.usersTotal = i2;
        this.friends = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkRunSeasonLevelUsersDto)) {
            return false;
        }
        VkRunSeasonLevelUsersDto vkRunSeasonLevelUsersDto = (VkRunSeasonLevelUsersDto) obj;
        return this.friendsTotal == vkRunSeasonLevelUsersDto.friendsTotal && this.usersTotal == vkRunSeasonLevelUsersDto.usersTotal && epx.f(this.friends, vkRunSeasonLevelUsersDto.friends);
    }

    public final int hashCode() {
        return this.friends.hashCode() + shy.a(this.usersTotal, Integer.hashCode(this.friendsTotal) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkRunSeasonLevelUsersDto(friendsTotal=");
        sb.append(this.friendsTotal);
        sb.append(", usersTotal=");
        sb.append(this.usersTotal);
        sb.append(", friends=");
        return ms9.a(')', sb, this.friends);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.friendsTotal);
        parcel.writeInt(this.usersTotal);
        Iterator a2 = ao.a(parcel, this.friends);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
