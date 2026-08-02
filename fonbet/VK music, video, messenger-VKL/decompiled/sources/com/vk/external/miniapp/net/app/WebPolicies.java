package com.vk.external.miniapp.net.app;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: WebPolicies.kt */
/* loaded from: classes18.dex */
public final class WebPolicies implements Parcelable {
    public static final Parcelable.Creator<WebPolicies> CREATOR = new a();
    public final String b;
    public final String c;

    /* compiled from: WebPolicies.kt */
    public static final class a implements Parcelable.Creator<WebPolicies> {
        @Override // android.os.Parcelable.Creator
        public final WebPolicies createFromParcel(Parcel parcel) {
            return new WebPolicies(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WebPolicies[] newArray(int i) {
            return new WebPolicies[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WebPolicies() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebPolicies)) {
            return false;
        }
        WebPolicies webPolicies = (WebPolicies) obj;
        return epx.f(this.b, webPolicies.b) && epx.f(this.c, webPolicies.c);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebPolicies(privacyPolicy=");
        sb.append(this.b);
        sb.append(", terms=");
        return ho8.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public WebPolicies(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public /* synthetic */ WebPolicies(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
