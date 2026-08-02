package com.vk.external.miniapp.net.app;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: WebLegalInfo.kt */
/* loaded from: classes18.dex */
public final class WebLegalInfo implements Parcelable {
    public static final Parcelable.Creator<WebLegalInfo> CREATOR = new a();
    public final String b;
    public final String c;
    public final WebPolicies d;
    public final String e;
    public final String f;

    /* compiled from: WebLegalInfo.kt */
    public static final class a implements Parcelable.Creator<WebLegalInfo> {
        @Override // android.os.Parcelable.Creator
        public final WebLegalInfo createFromParcel(Parcel parcel) {
            return new WebLegalInfo(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : WebPolicies.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WebLegalInfo[] newArray(int i) {
            return new WebLegalInfo[i];
        }
    }

    public WebLegalInfo() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebLegalInfo)) {
            return false;
        }
        WebLegalInfo webLegalInfo = (WebLegalInfo) obj;
        return epx.f(this.b, webLegalInfo.b) && epx.f(this.c, webLegalInfo.c) && epx.f(this.d, webLegalInfo.d) && epx.f(this.e, webLegalInfo.e) && epx.f(this.f, webLegalInfo.f);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        WebPolicies webPolicies = this.d;
        int hashCode3 = (hashCode2 + (webPolicies == null ? 0 : webPolicies.hashCode())) * 31;
        String str3 = this.e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebLegalInfo(companyName=");
        sb.append(this.b);
        sb.append(", legalAddress=");
        sb.append(this.c);
        sb.append(", policies=");
        sb.append(this.d);
        sb.append(", inn=");
        sb.append(this.e);
        sb.append(", supportText=");
        return ho8.a(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        WebPolicies webPolicies = this.d;
        if (webPolicies == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            webPolicies.writeToParcel(parcel, i);
        }
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }

    public WebLegalInfo(String str, String str2, WebPolicies webPolicies, String str3, String str4) {
        this.b = str;
        this.c = str2;
        this.d = webPolicies;
        this.e = str3;
        this.f = str4;
    }

    public /* synthetic */ WebLegalInfo(String str, String str2, WebPolicies webPolicies, String str3, String str4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? new WebPolicies(null, null) : webPolicies, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }
}
