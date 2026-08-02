package com.vk.profile.community.members.impl.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.OnlineInfo;
import xsna.epx;
import xsna.sn;
import xsna.tn;
import xsna.urd0;

/* compiled from: User.kt */
/* loaded from: classes5.dex */
public final class User implements Parcelable {
    public static final Parcelable.Creator<User> CREATOR = new a();
    public final UserId b;
    public final String c;
    public final String d;
    public final String e;
    public final OnlineInfo f;
    public final Boolean g;

    /* compiled from: User.kt */
    public static final class a implements Parcelable.Creator<User> {
        @Override // android.os.Parcelable.Creator
        public final User createFromParcel(Parcel parcel) {
            Boolean valueOf;
            UserId userId = (UserId) parcel.readParcelable(User.class.getClassLoader());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            OnlineInfo onlineInfo = (OnlineInfo) parcel.readParcelable(User.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new User(userId, readString, readString2, readString3, onlineInfo, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final User[] newArray(int i) {
            return new User[i];
        }
    }

    public User(UserId userId, String str, String str2, String str3, OnlineInfo onlineInfo, Boolean bool) {
        this.b = userId;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = onlineInfo;
        this.g = bool;
    }

    public final String d() {
        return this.c + ' ' + this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        return epx.f(this.b, user.b) && epx.f(this.c, user.c) && epx.f(this.d, user.d) && epx.f(this.e, user.e) && epx.f(this.f, user.f) && epx.f(this.g, user.g);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        OnlineInfo onlineInfo = this.f;
        int hashCode2 = (hashCode + (onlineInfo == null ? 0 : onlineInfo.hashCode())) * 31;
        Boolean bool = this.g;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("User(uid=");
        sb.append(this.b);
        sb.append(", firstName=");
        sb.append(this.c);
        sb.append(", lastName=");
        sb.append(this.d);
        sb.append(", photoBase=");
        sb.append(this.e);
        sb.append(", onlineInfo=");
        sb.append(this.f);
        sb.append(", isDon=");
        return tn.a(sb, this.g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeParcelable(this.f, i);
        Boolean bool = this.g;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }
}
