package com.vk.profile.community.details.api.invitelink.data.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.nr;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;

/* compiled from: CommunityInviteLink.kt */
/* loaded from: classes5.dex */
public final class CommunityInviteLink implements Parcelable {
    public static final Parcelable.Creator<CommunityInviteLink> CREATOR = new a();
    public final Integer b;
    public final UserId c;
    public final UserId d;
    public final String e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    /* compiled from: CommunityInviteLink.kt */
    public static final class a implements Parcelable.Creator<CommunityInviteLink> {
        @Override // android.os.Parcelable.Creator
        public final CommunityInviteLink createFromParcel(Parcel parcel) {
            return new CommunityInviteLink(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (UserId) parcel.readParcelable(CommunityInviteLink.class.getClassLoader()), (UserId) parcel.readParcelable(CommunityInviteLink.class.getClassLoader()), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final CommunityInviteLink[] newArray(int i) {
            return new CommunityInviteLink[i];
        }
    }

    public CommunityInviteLink(Integer num, UserId userId, UserId userId2, String str, long j, long j2, int i, int i2) {
        this.b = num;
        this.c = userId;
        this.d = userId2;
        this.e = str;
        this.f = j;
        this.g = j2;
        this.h = i;
        this.i = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommunityInviteLink)) {
            return false;
        }
        CommunityInviteLink communityInviteLink = (CommunityInviteLink) obj;
        return epx.f(this.b, communityInviteLink.b) && epx.f(this.c, communityInviteLink.c) && epx.f(this.d, communityInviteLink.d) && epx.f(this.e, communityInviteLink.e) && this.f == communityInviteLink.f && this.g == communityInviteLink.g && this.h == communityInviteLink.h && this.i == communityInviteLink.i;
    }

    public final int hashCode() {
        Integer num = this.b;
        int a2 = bh10.a((num == null ? 0 : num.hashCode()) * 31, 31, this.c.b);
        UserId userId = this.d;
        return Integer.hashCode(this.i) + shy.a(this.h, bh10.a(bh10.a(urd0.a((a2 + (userId != null ? Long.hashCode(userId.b) : 0)) * 31, 31, this.e), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityInviteLink(id=");
        sb.append(this.b);
        sb.append(", groupId=");
        sb.append(this.c);
        sb.append(", ownerId=");
        sb.append(this.d);
        sb.append(", url=");
        sb.append(this.e);
        sb.append(", createTime=");
        sb.append(this.f);
        sb.append(", expireTime=");
        sb.append(this.g);
        sb.append(", expireCount=");
        sb.append(this.h);
        sb.append(", invitedCount=");
        return vu5.b(sb, this.i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
    }
}
