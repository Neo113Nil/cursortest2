package com.vk.superapp.api.dto.widgets.actions;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: WebActionSendMessage.kt */
/* loaded from: classes6.dex */
public final class WebActionSendMessage extends WebAction {
    public static final a CREATOR = new a();
    public final long c;
    public final WebMessage d;
    public final WebAction e;
    public final String f;
    public final String g;

    /* compiled from: WebActionSendMessage.kt */
    public static final class a implements Parcelable.Creator<WebActionSendMessage> {
        @Override // android.os.Parcelable.Creator
        public final WebActionSendMessage createFromParcel(Parcel parcel) {
            return new WebActionSendMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WebActionSendMessage[] newArray(int i) {
            return new WebActionSendMessage[i];
        }
    }

    public WebActionSendMessage(long j, WebMessage webMessage, WebAction webAction, String str, String str2) {
        this.c = j;
        this.d = webMessage;
        this.e = webAction;
        this.f = str;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebActionSendMessage)) {
            return false;
        }
        WebActionSendMessage webActionSendMessage = (WebActionSendMessage) obj;
        return this.c == webActionSendMessage.c && epx.f(this.d, webActionSendMessage.d) && epx.f(this.e, webActionSendMessage.e) && epx.f(this.f, webActionSendMessage.f) && epx.f(this.g, webActionSendMessage.g);
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
        int hashCode = (this.d.hashCode() + (Long.hashCode(this.c) * 31)) * 31;
        WebAction webAction = this.e;
        int hashCode2 = (hashCode + (webAction == null ? 0 : webAction.hashCode())) * 31;
        String str = this.f;
        return this.g.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebActionSendMessage(peerId=");
        sb.append(this.c);
        sb.append(", message=");
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
        parcel.writeLong(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }

    public WebActionSendMessage(Parcel parcel) {
        this(parcel.readLong(), (WebMessage) parcel.readParcelable(WebMessage.class.getClassLoader()), (WebAction) parcel.readParcelable(WebAction.class.getClassLoader()), parcel.readString(), parcel.readString());
    }
}
