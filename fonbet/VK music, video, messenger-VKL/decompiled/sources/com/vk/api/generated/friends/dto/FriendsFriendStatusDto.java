package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: FriendsFriendStatusDto.kt */
/* loaded from: classes14.dex */
public final class FriendsFriendStatusDto implements Parcelable {
    public static final Parcelable.Creator<FriendsFriendStatusDto> CREATOR = new a();

    @pmi0("friend_status")
    private final FriendsFriendStatusStatusDto friendStatus;

    @pmi0("sign")
    private final String sign;

    @pmi0("user_id")
    private final UserId userId;

    /* compiled from: FriendsFriendStatusDto.kt */
    public static final class a implements Parcelable.Creator<FriendsFriendStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsFriendStatusDto createFromParcel(Parcel parcel) {
            return new FriendsFriendStatusDto((FriendsFriendStatusStatusDto) parcel.readParcelable(FriendsFriendStatusDto.class.getClassLoader()), (UserId) parcel.readParcelable(FriendsFriendStatusDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsFriendStatusDto[] newArray(int i) {
            return new FriendsFriendStatusDto[i];
        }
    }

    public FriendsFriendStatusDto(FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, UserId userId, String str) {
        this.friendStatus = friendsFriendStatusStatusDto;
        this.userId = userId;
        this.sign = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsFriendStatusDto)) {
            return false;
        }
        FriendsFriendStatusDto friendsFriendStatusDto = (FriendsFriendStatusDto) obj;
        return this.friendStatus == friendsFriendStatusDto.friendStatus && epx.f(this.userId, friendsFriendStatusDto.userId) && epx.f(this.sign, friendsFriendStatusDto.sign);
    }

    public final int hashCode() {
        int a2 = bh10.a(this.friendStatus.hashCode() * 31, 31, this.userId.b);
        String str = this.sign;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsFriendStatusDto(friendStatus=");
        sb.append(this.friendStatus);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", sign=");
        return ho8.a(sb, this.sign, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.friendStatus, i);
        parcel.writeParcelable(this.userId, i);
        parcel.writeString(this.sign);
    }

    public /* synthetic */ FriendsFriendStatusDto(FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, UserId userId, String str, int i, zcl zclVar) {
        this(friendsFriendStatusStatusDto, userId, (i & 4) != 0 ? null : str);
    }
}
