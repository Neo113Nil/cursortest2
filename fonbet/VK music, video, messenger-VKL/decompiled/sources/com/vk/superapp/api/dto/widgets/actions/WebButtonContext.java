package com.vk.superapp.api.dto.widgets.actions;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: WebButtonContext.kt */
/* loaded from: classes6.dex */
public final class WebButtonContext implements Parcelable {
    public static final a CREATOR = new a();
    public final long b;
    public final String c;
    public final String d;

    /* compiled from: WebButtonContext.kt */
    public static final class a implements Parcelable.Creator<WebButtonContext> {
        @Override // android.os.Parcelable.Creator
        public final WebButtonContext createFromParcel(Parcel parcel) {
            return new WebButtonContext(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WebButtonContext[] newArray(int i) {
            return new WebButtonContext[i];
        }
    }

    public WebButtonContext(long j, String str, String str2) {
        this.b = j;
        this.c = str;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebButtonContext)) {
            return false;
        }
        WebButtonContext webButtonContext = (WebButtonContext) obj;
        return this.b == webButtonContext.b && epx.f(this.c, webButtonContext.c) && epx.f(this.d, webButtonContext.d);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.b) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebButtonContext(objectId=");
        sb.append(this.b);
        sb.append(", originalUrl=");
        sb.append(this.c);
        sb.append(", viewUrl=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    public WebButtonContext(Parcel parcel) {
        this(parcel.readLong(), parcel.readString(), parcel.readString());
    }
}
