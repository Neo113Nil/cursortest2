package com.vk.profile.user.api.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.qoy;
import xsna.zcl;

/* compiled from: UserProfileSkeletonParams.kt */
/* loaded from: classes5.dex */
public final class UserProfileSkeletonParams implements Parcelable {
    public static final Parcelable.Creator<UserProfileSkeletonParams> CREATOR = new a();
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    /* compiled from: UserProfileSkeletonParams.kt */
    public static final class a implements Parcelable.Creator<UserProfileSkeletonParams> {
        @Override // android.os.Parcelable.Creator
        public final UserProfileSkeletonParams createFromParcel(Parcel parcel) {
            return new UserProfileSkeletonParams(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final UserProfileSkeletonParams[] newArray(int i) {
            return new UserProfileSkeletonParams[i];
        }
    }

    public UserProfileSkeletonParams() {
        this(null, null, false, false, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfileSkeletonParams)) {
            return false;
        }
        UserProfileSkeletonParams userProfileSkeletonParams = (UserProfileSkeletonParams) obj;
        return epx.f(this.b, userProfileSkeletonParams.b) && epx.f(this.c, userProfileSkeletonParams.c) && this.d == userProfileSkeletonParams.d && this.e == userProfileSkeletonParams.e;
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        return Boolean.hashCode(this.e) + qoy.b((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserProfileSkeletonParams(fullName=");
        sb.append(this.b);
        sb.append(", avatarUrl=");
        sb.append(this.c);
        sb.append(", isAvatarNft=");
        sb.append(this.d);
        sb.append(", hasUnseenStories=");
        return q0.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
    }

    public UserProfileSkeletonParams(String str, String str2, boolean z, boolean z2) {
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
    }

    public /* synthetic */ UserProfileSkeletonParams(String str, String str2, boolean z, boolean z2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }
}
