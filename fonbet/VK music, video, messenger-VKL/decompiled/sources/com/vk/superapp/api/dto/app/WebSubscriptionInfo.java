package com.vk.superapp.api.dto.app;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.external.miniapp.net.app.WebPhoto;

/* compiled from: WebSubscriptionInfo.kt */
/* loaded from: classes6.dex */
public final class WebSubscriptionInfo implements Parcelable {
    public static final Parcelable.Creator<WebSubscriptionInfo> CREATOR = new a();
    public final int b;
    public final String c;
    public final Status d;
    public final WebPhoto e;
    public final String f;
    public final int g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final int m;
    public final long n;
    public final String o;

    /* compiled from: WebSubscriptionInfo.kt */
    public static final class a implements Parcelable.Creator<WebSubscriptionInfo> {
        @Override // android.os.Parcelable.Creator
        public final WebSubscriptionInfo createFromParcel(Parcel parcel) {
            return new WebSubscriptionInfo(parcel.readInt(), parcel.readString(), Status.valueOf(parcel.readString()), (WebPhoto) parcel.readParcelable(WebSubscriptionInfo.class.getClassLoader()), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WebSubscriptionInfo[] newArray(int i) {
            return new WebSubscriptionInfo[i];
        }
    }

    public WebSubscriptionInfo(int i, String str, Status status, WebPhoto webPhoto, String str2, int i2, int i3, int i4, boolean z, boolean z2, String str3, int i5, long j, String str4) {
        this.b = i;
        this.c = str;
        this.d = status;
        this.e = webPhoto;
        this.f = str2;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = z;
        this.k = z2;
        this.l = str3;
        this.m = i5;
        this.n = j;
        this.o = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d.name());
        parcel.writeParcelable(this.e, i);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeString(this.l);
        parcel.writeInt(this.m);
        parcel.writeLong(this.n);
        parcel.writeString(this.o);
    }
}
