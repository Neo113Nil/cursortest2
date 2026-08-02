package com.vk.superapp.bridges.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.urd0;
import xsna.vu5;

/* compiled from: WebTarget.kt */
/* loaded from: classes6.dex */
public final class WebTarget implements Parcelable {
    public static final a CREATOR = new a();
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;

    /* compiled from: WebTarget.kt */
    public static final class a implements Parcelable.Creator<WebTarget> {
        @Override // android.os.Parcelable.Creator
        public final WebTarget createFromParcel(Parcel parcel) {
            return new WebTarget(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WebTarget[] newArray(int i) {
            return new WebTarget[i];
        }
    }

    public WebTarget(long j, String str, String str2, String str3, int i) {
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebTarget)) {
            return false;
        }
        WebTarget webTarget = (WebTarget) obj;
        return this.b == webTarget.b && epx.f(this.c, webTarget.c) && epx.f(this.d, webTarget.d) && epx.f(this.e, webTarget.e) && this.f == webTarget.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + urd0.a(urd0.a(urd0.a(Long.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebTarget(id=");
        sb.append(this.b);
        sb.append(", firstName=");
        sb.append(this.c);
        sb.append(", lastName=");
        sb.append(this.d);
        sb.append(", photoUrl=");
        sb.append(this.e);
        sb.append(", sex=");
        return vu5.b(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WebTarget(Parcel parcel) {
        this(r1, r0, r4, r5 == null ? "" : r5, parcel.readInt());
        long readLong = parcel.readLong();
        String readString = parcel.readString();
        readString = readString == null ? "" : readString;
        String readString2 = parcel.readString();
        readString2 = readString2 == null ? "" : readString2;
        String readString3 = parcel.readString();
    }
}
