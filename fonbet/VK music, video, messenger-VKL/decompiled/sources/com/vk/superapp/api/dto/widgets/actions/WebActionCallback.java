package com.vk.superapp.api.dto.widgets.actions;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: WebActionCallback.kt */
/* loaded from: classes6.dex */
public final class WebActionCallback extends WebAction {
    public static final a CREATOR = new a();
    public final String c;
    public final WebAction d;
    public final String e;
    public final String f;

    /* compiled from: WebActionCallback.kt */
    public static final class a implements Parcelable.Creator<WebActionCallback> {
        @Override // android.os.Parcelable.Creator
        public final WebActionCallback createFromParcel(Parcel parcel) {
            return new WebActionCallback(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WebActionCallback[] newArray(int i) {
            return new WebActionCallback[i];
        }
    }

    public WebActionCallback(String str, WebAction webAction, String str2, String str3) {
        this.c = str;
        this.d = webAction;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebActionCallback)) {
            return false;
        }
        WebActionCallback webActionCallback = (WebActionCallback) obj;
        return epx.f(this.c, webActionCallback.c) && epx.f(this.d, webActionCallback.d) && epx.f(this.e, webActionCallback.e) && epx.f(this.f, webActionCallback.f);
    }

    @Override // com.vk.superapp.api.dto.widgets.actions.WebAction
    public final String f() {
        return this.e;
    }

    @Override // com.vk.superapp.api.dto.widgets.actions.WebAction
    public final WebAction g() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        WebAction webAction = this.d;
        int hashCode2 = (hashCode + (webAction == null ? 0 : webAction.hashCode())) * 31;
        String str = this.e;
        return this.f.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebActionCallback(payload=");
        sb.append(this.c);
        sb.append(", fallbackAction=");
        sb.append(this.d);
        sb.append(", accessibilityLabel=");
        sb.append(this.e);
        sb.append(", type=");
        return ho8.a(sb, this.f, ')');
    }

    @Override // com.vk.superapp.api.dto.widgets.actions.WebAction, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }

    public WebActionCallback(Parcel parcel) {
        this(parcel.readString(), (WebAction) parcel.readParcelable(WebAction.class.getClassLoader()), parcel.readString(), parcel.readString());
    }
}
