package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: FriendsFriendExtendedStatusDto.kt */
/* loaded from: classes14.dex */
public final class FriendsFriendExtendedStatusDto implements Parcelable {
    public static final Parcelable.Creator<FriendsFriendExtendedStatusDto> CREATOR = new a();

    @pmi0("friend_status")
    private final FriendsFriendStatusStatusDto friendStatus;

    @pmi0("is_request_unread")
    private final Boolean isRequestUnread;

    @pmi0("sign")
    private final String sign;

    @pmi0("user_id")
    private final UserId userId;

    /* compiled from: FriendsFriendExtendedStatusDto.kt */
    public static final class a implements Parcelable.Creator<FriendsFriendExtendedStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsFriendExtendedStatusDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            FriendsFriendStatusStatusDto friendsFriendStatusStatusDto = (FriendsFriendStatusStatusDto) parcel.readParcelable(FriendsFriendExtendedStatusDto.class.getClassLoader());
            UserId userId = (UserId) parcel.readParcelable(FriendsFriendExtendedStatusDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FriendsFriendExtendedStatusDto(friendsFriendStatusStatusDto, userId, valueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsFriendExtendedStatusDto[] newArray(int i) {
            return new FriendsFriendExtendedStatusDto[i];
        }
    }

    public FriendsFriendExtendedStatusDto(FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, UserId userId, Boolean bool, String str) {
        this.friendStatus = friendsFriendStatusStatusDto;
        this.userId = userId;
        this.isRequestUnread = bool;
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
        if (!(obj instanceof FriendsFriendExtendedStatusDto)) {
            return false;
        }
        FriendsFriendExtendedStatusDto friendsFriendExtendedStatusDto = (FriendsFriendExtendedStatusDto) obj;
        return this.friendStatus == friendsFriendExtendedStatusDto.friendStatus && epx.f(this.userId, friendsFriendExtendedStatusDto.userId) && epx.f(this.isRequestUnread, friendsFriendExtendedStatusDto.isRequestUnread) && epx.f(this.sign, friendsFriendExtendedStatusDto.sign);
    }

    public final int hashCode() {
        int a2 = bh10.a(this.friendStatus.hashCode() * 31, 31, this.userId.b);
        Boolean bool = this.isRequestUnread;
        int hashCode = (a2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.sign;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsFriendExtendedStatusDto(friendStatus=");
        sb.append(this.friendStatus);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", isRequestUnread=");
        sb.append(this.isRequestUnread);
        sb.append(", sign=");
        return ho8.a(sb, this.sign, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.friendStatus, i);
        parcel.writeParcelable(this.userId, i);
        Boolean bool = this.isRequestUnread;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.sign);
    }

    public /* synthetic */ FriendsFriendExtendedStatusDto(FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, UserId userId, Boolean bool, String str, int i, zcl zclVar) {
        this(friendsFriendStatusStatusDto, userId, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str);
    }
}
