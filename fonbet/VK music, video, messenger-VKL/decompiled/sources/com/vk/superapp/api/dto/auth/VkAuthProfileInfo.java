package com.vk.superapp.api.dto.auth;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.qoy;
import xsna.urd0;
import xsna.v1v;

/* compiled from: VkAuthProfileInfo.kt */
/* loaded from: classes6.dex */
public final class VkAuthProfileInfo implements Parcelable {
    public static final Parcelable.Creator<VkAuthProfileInfo> CREATOR = new a();
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final String i;

    /* compiled from: VkAuthProfileInfo.kt */
    public static final class a implements Parcelable.Creator<VkAuthProfileInfo> {
        @Override // android.os.Parcelable.Creator
        public final VkAuthProfileInfo createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = false;
                z = true;
            } else {
                z = false;
                z2 = false;
            }
            String readString3 = parcel.readString();
            boolean z4 = true;
            String readString4 = parcel.readString();
            if (parcel.readInt() != 0) {
                z3 = z2;
                z2 = true;
            } else {
                z3 = z2;
            }
            if (parcel.readInt() == 0) {
                z4 = z3;
            }
            return new VkAuthProfileInfo(readString, readString2, z, readString3, readString4, z2, z4);
        }

        @Override // android.os.Parcelable.Creator
        public final VkAuthProfileInfo[] newArray(int i) {
            return new VkAuthProfileInfo[i];
        }
    }

    public VkAuthProfileInfo(String str, String str2, boolean z, String str3, String str4, boolean z2, boolean z3) {
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
        this.f = str4;
        this.g = z2;
        this.h = z3;
        this.i = v1v.a(' ', str, str2);
    }

    public final boolean d() {
        return this.g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkAuthProfileInfo)) {
            return false;
        }
        VkAuthProfileInfo vkAuthProfileInfo = (VkAuthProfileInfo) obj;
        return epx.f(this.b, vkAuthProfileInfo.b) && epx.f(this.c, vkAuthProfileInfo.c) && this.d == vkAuthProfileInfo.d && epx.f(this.e, vkAuthProfileInfo.e) && epx.f(this.f, vkAuthProfileInfo.f) && this.g == vkAuthProfileInfo.g && this.h == vkAuthProfileInfo.h;
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        String str = this.e;
        return Boolean.hashCode(this.h) + qoy.b(urd0.a((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkAuthProfileInfo(firstName=");
        sb.append(this.b);
        sb.append(", lastName=");
        sb.append(this.c);
        sb.append(", has2FA=");
        sb.append(this.d);
        sb.append(", avatar=");
        sb.append(this.e);
        sb.append(", phone=");
        sb.append(this.f);
        sb.append(", canUnbindPhone=");
        sb.append(this.g);
        sb.append(", hasPassword=");
        return q0.a(sb, this.h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
    }
}
