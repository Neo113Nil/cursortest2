package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: UsersGetFollowersFieldsResponseDto.kt */
/* loaded from: classes15.dex */
public final class UsersGetFollowersFieldsResponseDto implements Parcelable {
    public static final Parcelable.Creator<UsersGetFollowersFieldsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("friends_count")
    private final Integer friendsCount;

    @pmi0("items")
    private final List<UsersUserFullDto> items;

    /* compiled from: UsersGetFollowersFieldsResponseDto.kt */
    public static final class a implements Parcelable.Creator<UsersGetFollowersFieldsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersGetFollowersFieldsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(UsersGetFollowersFieldsResponseDto.class, parcel, arrayList, i, 1);
            }
            return new UsersGetFollowersFieldsResponseDto(readInt, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final UsersGetFollowersFieldsResponseDto[] newArray(int i) {
            return new UsersGetFollowersFieldsResponseDto[i];
        }
    }

    public UsersGetFollowersFieldsResponseDto(int i, List<UsersUserFullDto> list, Integer num) {
        this.count = i;
        this.items = list;
        this.friendsCount = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersGetFollowersFieldsResponseDto)) {
            return false;
        }
        UsersGetFollowersFieldsResponseDto usersGetFollowersFieldsResponseDto = (UsersGetFollowersFieldsResponseDto) obj;
        return this.count == usersGetFollowersFieldsResponseDto.count && epx.f(this.items, usersGetFollowersFieldsResponseDto.items) && epx.f(this.friendsCount, usersGetFollowersFieldsResponseDto.friendsCount);
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        Integer num = this.friendsCount;
        return a2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsersGetFollowersFieldsResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", friendsCount=");
        return uqi.b(sb, this.friendsCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        Integer num = this.friendsCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ UsersGetFollowersFieldsResponseDto(int i, List list, Integer num, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : num);
    }
}
