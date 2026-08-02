package com.vk.silentauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.shy;
import xsna.urd0;

/* compiled from: SilentTokenProviderInfo.kt */
/* loaded from: classes5.dex */
public final class SilentTokenProviderInfo implements Parcelable {
    public static final Parcelable.Creator<SilentTokenProviderInfo> CREATOR = new a();
    public final UserId b;
    public final String c;
    public final String d;
    public final long e;
    public final int f;
    public final String g;

    /* compiled from: SilentTokenProviderInfo.kt */
    public static final class a implements Parcelable.Creator<SilentTokenProviderInfo> {
        @Override // android.os.Parcelable.Creator
        public final SilentTokenProviderInfo createFromParcel(Parcel parcel) {
            return new SilentTokenProviderInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SilentTokenProviderInfo[] newArray(int i) {
            return new SilentTokenProviderInfo[i];
        }
    }

    public SilentTokenProviderInfo(UserId userId, String str, String str2, long j, int i, String str3) {
        this.b = userId;
        this.c = str;
        this.d = str2;
        this.e = j;
        this.f = i;
        this.g = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SilentTokenProviderInfo)) {
            return false;
        }
        SilentTokenProviderInfo silentTokenProviderInfo = (SilentTokenProviderInfo) obj;
        return epx.f(this.b, silentTokenProviderInfo.b) && epx.f(this.c, silentTokenProviderInfo.c) && epx.f(this.d, silentTokenProviderInfo.d) && this.e == silentTokenProviderInfo.e && this.f == silentTokenProviderInfo.f && epx.f(this.g, silentTokenProviderInfo.g);
    }

    public final int hashCode() {
        int a2 = shy.a(this.f, bh10.a(urd0.a(urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31);
        String str = this.g;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SilentTokenProviderInfo(userId=");
        sb.append(this.b);
        sb.append(", uuid=");
        sb.append(this.c);
        sb.append(", token=");
        sb.append(this.d);
        sb.append(", expireTime=");
        sb.append(this.e);
        sb.append(", weight=");
        sb.append(this.f);
        sb.append(", applicationProviderPackage=");
        return ho8.a(sb, this.g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, 0);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeLong(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
    }

    public SilentTokenProviderInfo(Parcel parcel) {
        this((UserId) parcel.readParcelable(UserId.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readString());
    }
}
