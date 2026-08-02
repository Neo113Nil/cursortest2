package com.vk.superapp.api.dto.widgets.actions;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: WebActionCall.kt */
/* loaded from: classes6.dex */
public final class WebActionCall extends WebAction {
    public static final a CREATOR = new a();
    public final int c;
    public final WebAction d;
    public final String e;
    public final String f;

    /* compiled from: WebActionCall.kt */
    public static final class a implements Parcelable.Creator<WebActionCall> {
        @Override // android.os.Parcelable.Creator
        public final WebActionCall createFromParcel(Parcel parcel) {
            return new WebActionCall(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WebActionCall[] newArray(int i) {
            return new WebActionCall[i];
        }
    }

    public WebActionCall(int i, WebAction webAction, String str, String str2) {
        this.c = i;
        this.d = webAction;
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebActionCall)) {
            return false;
        }
        WebActionCall webActionCall = (WebActionCall) obj;
        return this.c == webActionCall.c && epx.f(this.d, webActionCall.d) && epx.f(this.e, webActionCall.e) && epx.f(this.f, webActionCall.f);
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
        int hashCode = Integer.hashCode(this.c) * 31;
        WebAction webAction = this.d;
        int hashCode2 = (hashCode + (webAction == null ? 0 : webAction.hashCode())) * 31;
        String str = this.e;
        return this.f.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebActionCall(peerId=");
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
        parcel.writeInt(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }

    public WebActionCall(Parcel parcel) {
        this(parcel.readInt(), (WebAction) parcel.readParcelable(WebAction.class.getClassLoader()), parcel.readString(), parcel.readString());
    }
}
