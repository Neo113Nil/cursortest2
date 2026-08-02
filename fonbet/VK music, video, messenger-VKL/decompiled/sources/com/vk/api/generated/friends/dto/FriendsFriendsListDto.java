package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: FriendsFriendsListDto.kt */
/* loaded from: classes14.dex */
public final class FriendsFriendsListDto implements Parcelable {
    public static final Parcelable.Creator<FriendsFriendsListDto> CREATOR = new a();

    @pmi0("count")
    private final Integer count;

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    /* compiled from: FriendsFriendsListDto.kt */
    public static final class a implements Parcelable.Creator<FriendsFriendsListDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsFriendsListDto createFromParcel(Parcel parcel) {
            return new FriendsFriendsListDto(parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsFriendsListDto[] newArray(int i) {
            return new FriendsFriendsListDto[i];
        }
    }

    public FriendsFriendsListDto(int i, String str, Integer num) {
        this.id = i;
        this.name = str;
        this.count = num;
    }

    public final String d() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsFriendsListDto)) {
            return false;
        }
        FriendsFriendsListDto friendsFriendsListDto = (FriendsFriendsListDto) obj;
        return this.id == friendsFriendsListDto.id && epx.f(this.name, friendsFriendsListDto.name) && epx.f(this.count, friendsFriendsListDto.count);
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.id) * 31, 31, this.name);
        Integer num = this.count;
        return a2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsFriendsListDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", count=");
        return uqi.b(sb, this.count, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ FriendsFriendsListDto(int i, String str, Integer num, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : num);
    }
}
