package com.vk.superapp.api.dto.widgets.actions;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;

/* compiled from: WebActionSubscribe.kt */
/* loaded from: classes6.dex */
public final class WebActionSubscribe extends WebAction {
    public static final a CREATOR = new a();
    public final WebSubscribeObjectType c;
    public final long d;
    public final WebSubscribeExtra e;
    public final WebAction f;
    public final String g;
    public final String h;

    /* compiled from: WebActionSubscribe.kt */
    public static final class a implements Parcelable.Creator<WebActionSubscribe> {
        @Override // android.os.Parcelable.Creator
        public final WebActionSubscribe createFromParcel(Parcel parcel) {
            return new WebActionSubscribe(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WebActionSubscribe[] newArray(int i) {
            return new WebActionSubscribe[i];
        }
    }

    public WebActionSubscribe(WebSubscribeObjectType webSubscribeObjectType, long j, WebSubscribeExtra webSubscribeExtra, WebAction webAction, String str, String str2) {
        this.c = webSubscribeObjectType;
        this.d = j;
        this.e = webSubscribeExtra;
        this.f = webAction;
        this.g = str;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebActionSubscribe)) {
            return false;
        }
        WebActionSubscribe webActionSubscribe = (WebActionSubscribe) obj;
        return this.c == webActionSubscribe.c && this.d == webActionSubscribe.d && epx.f(this.e, webActionSubscribe.e) && epx.f(this.f, webActionSubscribe.f) && epx.f(this.g, webActionSubscribe.g) && epx.f(this.h, webActionSubscribe.h);
    }

    @Override // com.vk.superapp.api.dto.widgets.actions.WebAction
    public final String f() {
        return this.g;
    }

    @Override // com.vk.superapp.api.dto.widgets.actions.WebAction
    public final WebAction g() {
        return this.f;
    }

    public final int hashCode() {
        int a2 = bh10.a(this.c.hashCode() * 31, 31, this.d);
        WebSubscribeExtra webSubscribeExtra = this.e;
        int hashCode = (a2 + (webSubscribeExtra == null ? 0 : webSubscribeExtra.hashCode())) * 31;
        WebAction webAction = this.f;
        int hashCode2 = (hashCode + (webAction == null ? 0 : webAction.hashCode())) * 31;
        String str = this.g;
        return this.h.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebActionSubscribe(objectType=");
        sb.append(this.c);
        sb.append(", objectId=");
        sb.append(this.d);
        sb.append(", extra=");
        sb.append(this.e);
        sb.append(", fallbackAction=");
        sb.append(this.f);
        sb.append(", accessibilityLabel=");
        sb.append(this.g);
        sb.append(", type=");
        return ho8.a(sb, this.h, ')');
    }

    @Override // com.vk.superapp.api.dto.widgets.actions.WebAction, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c.name());
        parcel.writeLong(this.d);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WebActionSubscribe(Parcel parcel) {
        this((WebSubscribeObjectType) r1, parcel.readLong(), (WebSubscribeExtra) parcel.readParcelable(WebSubscribeExtra.class.getClassLoader()), (WebAction) parcel.readParcelable(WebAction.class.getClassLoader()), parcel.readString(), parcel.readString());
        Object obj;
        String readString = parcel.readString();
        Object obj2 = WebSubscribeObjectType.GROUP;
        if (readString != null) {
            try {
                obj = Enum.valueOf(WebSubscribeObjectType.class, readString.toUpperCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                obj = null;
            }
            if (obj != null) {
                obj2 = obj;
            }
        }
    }
}
