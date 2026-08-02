package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: FriendsGetFollowersResponseDto.kt */
/* loaded from: classes14.dex */
public final class FriendsGetFollowersResponseDto implements Parcelable {
    public static final Parcelable.Creator<FriendsGetFollowersResponseDto> CREATOR = new a();

    @pmi0("followers")
    private final List<UserId> followers;

    @pmi0("followers_count")
    private final Integer followersCount;

    @pmi0("new_followers")
    private final List<UserId> newFollowers;

    @pmi0("new_followers_count")
    private final Integer newFollowersCount;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: FriendsGetFollowersResponseDto.kt */
    public static final class a implements Parcelable.Creator<FriendsGetFollowersResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsGetFollowersResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(FriendsGetFollowersResponseDto.class, parcel, arrayList, i2, 1);
                }
            }
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(FriendsGetFollowersResponseDto.class, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = bo.b(FriendsGetFollowersResponseDto.class, parcel, arrayList3, i, 1);
                }
            }
            return new FriendsGetFollowersResponseDto(valueOf, arrayList, valueOf2, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsGetFollowersResponseDto[] newArray(int i) {
            return new FriendsGetFollowersResponseDto[i];
        }
    }

    public FriendsGetFollowersResponseDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final Integer d() {
        return this.followersCount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<UsersUserFullDto> e() {
        return this.profiles;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsGetFollowersResponseDto)) {
            return false;
        }
        FriendsGetFollowersResponseDto friendsGetFollowersResponseDto = (FriendsGetFollowersResponseDto) obj;
        return epx.f(this.newFollowersCount, friendsGetFollowersResponseDto.newFollowersCount) && epx.f(this.newFollowers, friendsGetFollowersResponseDto.newFollowers) && epx.f(this.followersCount, friendsGetFollowersResponseDto.followersCount) && epx.f(this.followers, friendsGetFollowersResponseDto.followers) && epx.f(this.profiles, friendsGetFollowersResponseDto.profiles);
    }

    public final int hashCode() {
        Integer num = this.newFollowersCount;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<UserId> list = this.newFollowers;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.followersCount;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<UserId> list2 = this.followers;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<UsersUserFullDto> list3 = this.profiles;
        return hashCode4 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsGetFollowersResponseDto(newFollowersCount=");
        sb.append(this.newFollowersCount);
        sb.append(", newFollowers=");
        sb.append(this.newFollowers);
        sb.append(", followersCount=");
        sb.append(this.followersCount);
        sb.append(", followers=");
        sb.append(this.followers);
        sb.append(", profiles=");
        return ms9.a(')', sb, this.profiles);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.newFollowersCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<UserId> list = this.newFollowers;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        Integer num2 = this.followersCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        List<UserId> list2 = this.followers;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        List<UsersUserFullDto> list3 = this.profiles;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f3 = dn.f(parcel, list3, 1);
        while (f3.hasNext()) {
            parcel.writeParcelable((Parcelable) f3.next(), i);
        }
    }

    public FriendsGetFollowersResponseDto(Integer num, List<UserId> list, Integer num2, List<UserId> list2, List<UsersUserFullDto> list3) {
        this.newFollowersCount = num;
        this.newFollowers = list;
        this.followersCount = num2;
        this.followers = list2;
        this.profiles = list3;
    }

    public /* synthetic */ FriendsGetFollowersResponseDto(Integer num, List list, Integer num2, List list2, List list3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : list3);
    }
}
