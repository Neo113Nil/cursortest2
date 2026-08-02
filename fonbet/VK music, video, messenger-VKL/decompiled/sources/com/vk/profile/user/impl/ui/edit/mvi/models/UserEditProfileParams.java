package com.vk.profile.user.impl.ui.edit.mvi.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import defpackage.q0;
import xsna.bh10;
import xsna.epx;
import xsna.qoy;

/* compiled from: UserEditProfileParams.kt */
/* loaded from: classes5.dex */
public final class UserEditProfileParams implements Parcelable {
    public static final a CREATOR = new a();
    public final String b;
    public final UserId c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final SearchStatsLoggingInfo h;
    public final boolean i;

    /* compiled from: UserEditProfileParams.kt */
    public static final class a implements Parcelable.Creator<UserEditProfileParams> {
        @Override // android.os.Parcelable.Creator
        public final UserEditProfileParams createFromParcel(Parcel parcel) {
            return new UserEditProfileParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final UserEditProfileParams[] newArray(int i) {
            return new UserEditProfileParams[i];
        }
    }

    public UserEditProfileParams(String str, UserId userId, String str2, String str3, String str4, boolean z, SearchStatsLoggingInfo searchStatsLoggingInfo, boolean z2) {
        this.b = str;
        this.c = userId;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = z;
        this.h = searchStatsLoggingInfo;
        this.i = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserEditProfileParams)) {
            return false;
        }
        UserEditProfileParams userEditProfileParams = (UserEditProfileParams) obj;
        return epx.f(this.b, userEditProfileParams.b) && epx.f(this.c, userEditProfileParams.c) && epx.f(this.d, userEditProfileParams.d) && epx.f(this.e, userEditProfileParams.e) && epx.f(this.f, userEditProfileParams.f) && this.g == userEditProfileParams.g && epx.f(this.h, userEditProfileParams.h) && this.i == userEditProfileParams.i;
    }

    public final int hashCode() {
        int a2 = bh10.a(this.b.hashCode() * 31, 31, this.c.b);
        String str = this.d;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int b = qoy.b((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.g);
        SearchStatsLoggingInfo searchStatsLoggingInfo = this.h;
        return Boolean.hashCode(this.i) + ((b + (searchStatsLoggingInfo != null ? searchStatsLoggingInfo.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserEditProfileParams(fragmentStrKey=");
        sb.append(this.b);
        sb.append(", userId=");
        sb.append(this.c);
        sb.append(", accessKey=");
        sb.append(this.d);
        sb.append(", parentRef=");
        sb.append(this.e);
        sb.append(", trackCode=");
        sb.append(this.f);
        sb.append(", isTablet=");
        sb.append(this.g);
        sb.append(", searchInfo=");
        sb.append(this.h);
        sb.append(", showChangeAvatar=");
        return q0.a(sb, this.i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.h, i);
        parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UserEditProfileParams(Parcel parcel) {
        this(r1, r2, r3, r4, r5, r6, r7, r8);
        boolean z;
        SearchStatsLoggingInfo searchStatsLoggingInfo;
        boolean z2;
        String readString = parcel.readString();
        UserId userId = (UserId) parcel.readParcelable(UserId.class.getClassLoader());
        UserId userId2 = userId == null ? UserId.d : userId;
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        boolean z3 = false;
        if (parcel.readByte() != 0) {
            z = false;
            z3 = true;
        } else {
            z = false;
        }
        SearchStatsLoggingInfo searchStatsLoggingInfo2 = (SearchStatsLoggingInfo) parcel.readParcelable(SearchStatsLoggingInfo.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z2 = true;
            searchStatsLoggingInfo = searchStatsLoggingInfo2;
        } else {
            searchStatsLoggingInfo = searchStatsLoggingInfo2;
            z2 = z;
        }
    }
}
