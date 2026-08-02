package com.vk.external.miniapp.net.app;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.urd0;
import xsna.vu5;
import xsna.zcl;

/* compiled from: WebRights.kt */
/* loaded from: classes18.dex */
public final class WebRights implements Parcelable {
    public static final Parcelable.Creator<WebRights> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final int e;

    /* compiled from: WebRights.kt */
    public static final class a implements Parcelable.Creator<WebRights> {
        @Override // android.os.Parcelable.Creator
        public final WebRights createFromParcel(Parcel parcel) {
            return new WebRights(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final WebRights[] newArray(int i) {
            return new WebRights[i];
        }
    }

    public WebRights() {
        this(null, null, null, 0, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebRights)) {
            return false;
        }
        WebRights webRights = (WebRights) obj;
        return epx.f(this.b, webRights.b) && epx.f(this.c, webRights.c) && epx.f(this.d, webRights.d) && this.e == webRights.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebRights(name=");
        sb.append(this.b);
        sb.append(", header=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", mask=");
        return vu5.b(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
    }

    public WebRights(String str, String str2, String str3, int i) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
    }

    public /* synthetic */ WebRights(String str, String str2, String str3, int i, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i);
    }
}
