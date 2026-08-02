package com.vk.superapp.api.dto.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;
import xsna.zcl;

/* compiled from: UserItem.kt */
/* loaded from: classes6.dex */
public final class UserItem implements Parcelable {
    public static final Parcelable.Creator<UserItem> CREATOR = new a();
    public final UserId b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;
    public final AccountProfileType j;
    public final long k;

    /* compiled from: UserItem.kt */
    public static final class a implements Parcelable.Creator<UserItem> {
        @Override // android.os.Parcelable.Creator
        public final UserItem createFromParcel(Parcel parcel) {
            UserId userId = (UserId) parcel.readParcelable(UserId.class.getClassLoader());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            int readInt = parcel.readInt();
            AccountProfileType.a aVar = AccountProfileType.Companion;
            Integer valueOf = Integer.valueOf(parcel.readInt());
            aVar.getClass();
            return new UserItem(userId, readString, readString2, readString3, readString4, readString5, readString6, readInt, AccountProfileType.a.a(valueOf), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final UserItem[] newArray(int i) {
            return new UserItem[i];
        }
    }

    public UserItem(UserId userId, String str, String str2, String str3, String str4, String str5, String str6, int i, AccountProfileType accountProfileType, long j) {
        this.b = userId;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = i;
        this.j = accountProfileType;
        this.k = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserItem)) {
            return false;
        }
        UserItem userItem = (UserItem) obj;
        return epx.f(this.b, userItem.b) && epx.f(this.c, userItem.c) && epx.f(this.d, userItem.d) && epx.f(this.e, userItem.e) && epx.f(this.f, userItem.f) && epx.f(this.g, userItem.g) && epx.f(this.h, userItem.h) && this.i == userItem.i && this.j == userItem.j && this.k == userItem.k;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        return Long.hashCode(this.k) + ((this.j.hashCode() + shy.a(this.i, (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserItem(userId=");
        sb.append(this.b);
        sb.append(", exchangeToken=");
        sb.append(this.c);
        sb.append(", firstName=");
        sb.append(this.d);
        sb.append(", lastName=");
        sb.append(this.e);
        sb.append(", phone=");
        sb.append(this.f);
        sb.append(", email=");
        sb.append(this.g);
        sb.append(", avatar=");
        sb.append(this.h);
        sb.append(", notificationsCount=");
        sb.append(this.i);
        sb.append(", profileType=");
        sb.append(this.j);
        sb.append(", lastLogInTimeStamp=");
        return vu5.a(')', this.k, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, 0);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j.h());
        parcel.writeLong(this.k);
    }

    public /* synthetic */ UserItem(UserId userId, String str, String str2, String str3, String str4, String str5, String str6, int i, AccountProfileType accountProfileType, long j, int i2, zcl zclVar) {
        this(userId, str, str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, str6, i, accountProfileType, (i2 & 512) != 0 ? 0L : j);
    }
}
