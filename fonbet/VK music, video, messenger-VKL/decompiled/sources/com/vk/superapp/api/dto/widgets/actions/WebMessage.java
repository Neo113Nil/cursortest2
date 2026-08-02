package com.vk.superapp.api.dto.widgets.actions;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;

/* compiled from: WebMessage.kt */
/* loaded from: classes6.dex */
public final class WebMessage implements Parcelable {
    public static final a CREATOR = new a();
    public final String b;
    public final String c;
    public final boolean d;

    /* compiled from: WebMessage.kt */
    public static final class a implements Parcelable.Creator<WebMessage> {
        @Override // android.os.Parcelable.Creator
        public final WebMessage createFromParcel(Parcel parcel) {
            return new WebMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WebMessage[] newArray(int i) {
            return new WebMessage[i];
        }
    }

    public WebMessage(String str, String str2, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebMessage)) {
            return false;
        }
        WebMessage webMessage = (WebMessage) obj;
        return epx.f(this.b, webMessage.b) && epx.f(this.c, webMessage.c) && this.d == webMessage.d;
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        return Boolean.hashCode(this.d) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebMessage(text=");
        sb.append(this.b);
        sb.append(", payload=");
        sb.append(this.c);
        sb.append(", showConfirmation=");
        return q0.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }

    public WebMessage(Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readInt() == 1);
    }
}
