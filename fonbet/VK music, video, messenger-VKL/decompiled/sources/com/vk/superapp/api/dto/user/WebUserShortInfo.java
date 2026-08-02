package com.vk.superapp.api.dto.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.external.miniapp.net.app.WebImage;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.qoy;
import xsna.urd0;

/* compiled from: WebUserShortInfo.kt */
/* loaded from: classes6.dex */
public final class WebUserShortInfo implements Parcelable {
    public static final a CREATOR = new a();
    public final UserId b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final WebImage h;
    public final String i;

    /* compiled from: WebUserShortInfo.kt */
    public static final class a implements Parcelable.Creator<WebUserShortInfo> {
        @Override // android.os.Parcelable.Creator
        public final WebUserShortInfo createFromParcel(Parcel parcel) {
            return new WebUserShortInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WebUserShortInfo[] newArray(int i) {
            return new WebUserShortInfo[i];
        }
    }

    public WebUserShortInfo(UserId userId, String str, String str2, boolean z, boolean z2, boolean z3, WebImage webImage, String str3) {
        this.b = userId;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = webImage;
        this.i = str3;
    }

    public final String d() {
        String str = this.d;
        int length = str.length();
        String str2 = this.c;
        if (length == 0) {
            return str2;
        }
        return str2 + ' ' + str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebUserShortInfo)) {
            return false;
        }
        WebUserShortInfo webUserShortInfo = (WebUserShortInfo) obj;
        return epx.f(this.b, webUserShortInfo.b) && epx.f(this.c, webUserShortInfo.c) && epx.f(this.d, webUserShortInfo.d) && this.e == webUserShortInfo.e && this.f == webUserShortInfo.f && this.g == webUserShortInfo.g && epx.f(this.h, webUserShortInfo.h) && epx.f(this.i, webUserShortInfo.i);
    }

    public final int hashCode() {
        int a2 = fw3.a(qoy.b(qoy.b(qoy.b(urd0.a(urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h.b);
        String str = this.i;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebUserShortInfo(id=");
        sb.append(this.b);
        sb.append(", firstName=");
        sb.append(this.c);
        sb.append(", lastName=");
        sb.append(this.d);
        sb.append(", isFemale=");
        sb.append(this.e);
        sb.append(", isClosed=");
        sb.append(this.f);
        sb.append(", canAccessClosed=");
        sb.append(this.g);
        sb.append(", photo=");
        sb.append(this.h);
        sb.append(", city=");
        return ho8.a(sb, this.i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, 0);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.h, i);
        parcel.writeString(this.i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WebUserShortInfo(Parcel parcel) {
        this(r2, r3, r4, r5, parcel.readByte() != 0 ? r0 : false, parcel.readByte() != 0 ? r0 : false, (WebImage) parcel.readParcelable(WebImage.class.getClassLoader()), parcel.readString());
        boolean z;
        UserId userId = (UserId) parcel.readParcelable(UserId.class.getClassLoader());
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        boolean z2 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = true;
            z2 = false;
        }
    }
}
