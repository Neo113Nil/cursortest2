package com.vk.clips.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.qoy;

/* compiled from: SdkVerifyInfo.kt */
/* loaded from: classes17.dex */
public final class SdkVerifyInfo implements Parcelable {
    public static final Parcelable.Creator<SdkVerifyInfo> CREATOR = new a();
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    /* compiled from: SdkVerifyInfo.kt */
    public static final class a implements Parcelable.Creator<SdkVerifyInfo> {
        @Override // android.os.Parcelable.Creator
        public final SdkVerifyInfo createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5 = false;
            boolean z6 = true;
            boolean z7 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z5 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z6 = z;
            }
            if (parcel.readInt() != 0) {
                z3 = z;
                z = z2;
            } else {
                z3 = z;
            }
            if (parcel.readInt() != 0) {
                z4 = z2;
            } else {
                z4 = z2;
                z2 = z3;
            }
            if (parcel.readInt() != 0) {
                z3 = z4;
            }
            return new SdkVerifyInfo(z7, z5, z6, z, z2, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final SdkVerifyInfo[] newArray(int i) {
            return new SdkVerifyInfo[i];
        }
    }

    public SdkVerifyInfo(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkVerifyInfo)) {
            return false;
        }
        SdkVerifyInfo sdkVerifyInfo = (SdkVerifyInfo) obj;
        return this.b == sdkVerifyInfo.b && this.c == sdkVerifyInfo.c && this.d == sdkVerifyInfo.d && this.e == sdkVerifyInfo.e && this.f == sdkVerifyInfo.f && this.g == sdkVerifyInfo.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkVerifyInfo(verified=");
        sb.append(this.b);
        sb.append(", trending=");
        sb.append(this.c);
        sb.append(", isOauthVerified=");
        sb.append(this.d);
        sb.append(", isPremiumBusiness=");
        sb.append(this.e);
        sb.append(", isConfirmedBusiness=");
        sb.append(this.f);
        sb.append(", isNonProfitOrganization=");
        return q0.a(sb, this.g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
    }
}
