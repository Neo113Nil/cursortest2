package com.vk.superapp.api.dto.group;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.external.miniapp.net.app.WebImage;
import xsna.epx;
import xsna.shy;
import xsna.urd0;

/* compiled from: WebGroupShortInfo.kt */
/* loaded from: classes6.dex */
public final class WebGroupShortInfo implements Parcelable {
    public static final a CREATOR = new a();
    public final WebGroup b;
    public final String c;
    public final int d;
    public final String e;
    public final int f;
    public final String g;
    public final int h;
    public final WebImage i;

    /* compiled from: WebGroupShortInfo.kt */
    public static final class a implements Parcelable.Creator<WebGroupShortInfo> {
        @Override // android.os.Parcelable.Creator
        public final WebGroupShortInfo createFromParcel(Parcel parcel) {
            return new WebGroupShortInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WebGroupShortInfo[] newArray(int i) {
            return new WebGroupShortInfo[i];
        }
    }

    public WebGroupShortInfo(WebGroup webGroup, String str, int i, String str2, int i2, String str3, int i3, WebImage webImage) {
        this.b = webGroup;
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = i2;
        this.g = str3;
        this.h = i3;
        this.i = webImage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebGroupShortInfo)) {
            return false;
        }
        WebGroupShortInfo webGroupShortInfo = (WebGroupShortInfo) obj;
        return epx.f(this.b, webGroupShortInfo.b) && epx.f(this.c, webGroupShortInfo.c) && this.d == webGroupShortInfo.d && epx.f(this.e, webGroupShortInfo.e) && this.f == webGroupShortInfo.f && epx.f(this.g, webGroupShortInfo.g) && this.h == webGroupShortInfo.h && epx.f(this.i, webGroupShortInfo.i);
    }

    public final int hashCode() {
        return this.i.b.hashCode() + shy.a(this.h, urd0.a(shy.a(this.f, urd0.a(shy.a(this.d, urd0.a(this.b.hashCode() * 31, 31, this.c), 31), 31, this.e), 31), 31, this.g), 31);
    }

    public final String toString() {
        return "WebGroupShortInfo(info=" + this.b + ", screenName=" + this.c + ", isClosed=" + this.d + ", type=" + this.e + ", isMember=" + this.f + ", description=" + this.g + ", membersCount=" + this.h + ", photo=" + this.i + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeParcelable(this.i, i);
    }

    public WebGroupShortInfo(Parcel parcel) {
        this((WebGroup) parcel.readParcelable(WebGroup.class.getClassLoader()), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), (WebImage) parcel.readParcelable(WebImage.class.getClassLoader()));
    }
}
