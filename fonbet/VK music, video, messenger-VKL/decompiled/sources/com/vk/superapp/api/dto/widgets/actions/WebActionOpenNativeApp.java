package com.vk.superapp.api.dto.widgets.actions;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: WebActionOpenNativeApp.kt */
/* loaded from: classes6.dex */
public final class WebActionOpenNativeApp extends WebAction {
    public static final a CREATOR = new a();
    public final String c;
    public final String d;
    public final WebAction e;
    public final String f;
    public final String g;

    /* compiled from: WebActionOpenNativeApp.kt */
    public static final class a implements Parcelable.Creator<WebActionOpenNativeApp> {
        @Override // android.os.Parcelable.Creator
        public final WebActionOpenNativeApp createFromParcel(Parcel parcel) {
            return new WebActionOpenNativeApp(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WebActionOpenNativeApp[] newArray(int i) {
            return new WebActionOpenNativeApp[i];
        }
    }

    public WebActionOpenNativeApp(String str, String str2, WebAction webAction, String str3, String str4) {
        this.c = str;
        this.d = str2;
        this.e = webAction;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebActionOpenNativeApp)) {
            return false;
        }
        WebActionOpenNativeApp webActionOpenNativeApp = (WebActionOpenNativeApp) obj;
        return epx.f(this.c, webActionOpenNativeApp.c) && epx.f(this.d, webActionOpenNativeApp.d) && epx.f(this.e, webActionOpenNativeApp.e) && epx.f(this.f, webActionOpenNativeApp.f) && epx.f(this.g, webActionOpenNativeApp.g);
    }

    @Override // com.vk.superapp.api.dto.widgets.actions.WebAction
    public final String f() {
        return this.f;
    }

    @Override // com.vk.superapp.api.dto.widgets.actions.WebAction
    public final WebAction g() {
        return this.e;
    }

    public final int hashCode() {
        String str = this.c;
        int a2 = urd0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.d);
        WebAction webAction = this.e;
        int hashCode = (a2 + (webAction == null ? 0 : webAction.hashCode())) * 31;
        String str2 = this.f;
        return this.g.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebActionOpenNativeApp(deeplink=");
        sb.append(this.c);
        sb.append(", packageName=");
        sb.append(this.d);
        sb.append(", fallbackAction=");
        sb.append(this.e);
        sb.append(", accessibilityLabel=");
        sb.append(this.f);
        sb.append(", type=");
        return ho8.a(sb, this.g, ')');
    }

    @Override // com.vk.superapp.api.dto.widgets.actions.WebAction, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, i);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }

    public WebActionOpenNativeApp(Parcel parcel) {
        this(parcel.readString(), parcel.readString(), (WebAction) parcel.readParcelable(WebAction.class.getClassLoader()), parcel.readString(), parcel.readString());
    }
}
