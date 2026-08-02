package com.vk.superapp.api.dto.widgets.actions;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: WebActionOpenInternalVkUi.kt */
/* loaded from: classes6.dex */
public final class WebActionOpenInternalVkUi extends WebAction {
    public static final a CREATOR = new a();
    public final String c;
    public final WebAction d;
    public final String e;
    public final String f;

    /* compiled from: WebActionOpenInternalVkUi.kt */
    public static final class a implements Parcelable.Creator<WebActionOpenInternalVkUi> {
        @Override // android.os.Parcelable.Creator
        public final WebActionOpenInternalVkUi createFromParcel(Parcel parcel) {
            return new WebActionOpenInternalVkUi(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WebActionOpenInternalVkUi[] newArray(int i) {
            return new WebActionOpenInternalVkUi[i];
        }
    }

    public WebActionOpenInternalVkUi(String str, WebAction webAction, String str2, String str3) {
        this.c = str;
        this.d = webAction;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebActionOpenInternalVkUi)) {
            return false;
        }
        WebActionOpenInternalVkUi webActionOpenInternalVkUi = (WebActionOpenInternalVkUi) obj;
        return epx.f(this.c, webActionOpenInternalVkUi.c) && epx.f(this.d, webActionOpenInternalVkUi.d) && epx.f(this.e, webActionOpenInternalVkUi.e) && epx.f(this.f, webActionOpenInternalVkUi.f);
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
        StringBuilder sb = new StringBuilder("WebActionOpenInternalVkUi(url=");
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

    public WebActionOpenInternalVkUi(Parcel parcel) {
        this(parcel.readString(), (WebAction) parcel.readParcelable(WebAction.class.getClassLoader()), parcel.readString(), parcel.readString());
    }
}
