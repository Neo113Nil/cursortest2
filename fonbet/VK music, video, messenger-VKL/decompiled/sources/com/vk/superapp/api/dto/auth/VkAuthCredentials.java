package com.vk.superapp.api.dto.auth;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: VkAuthCredentials.kt */
/* loaded from: classes6.dex */
public final class VkAuthCredentials implements Parcelable {
    public static final Parcelable.Creator<VkAuthCredentials> CREATOR = new a();
    public final String b;
    public final String c;

    /* compiled from: VkAuthCredentials.kt */
    public static final class a implements Parcelable.Creator<VkAuthCredentials> {
        @Override // android.os.Parcelable.Creator
        public final VkAuthCredentials createFromParcel(Parcel parcel) {
            return new VkAuthCredentials(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkAuthCredentials[] newArray(int i) {
            return new VkAuthCredentials[i];
        }
    }

    public VkAuthCredentials(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public final String d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkAuthCredentials)) {
            return false;
        }
        VkAuthCredentials vkAuthCredentials = (VkAuthCredentials) obj;
        return epx.f(this.b, vkAuthCredentials.b) && epx.f(this.c, vkAuthCredentials.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkAuthCredentials(username=");
        sb.append(this.b);
        sb.append(", password=");
        return ho8.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
