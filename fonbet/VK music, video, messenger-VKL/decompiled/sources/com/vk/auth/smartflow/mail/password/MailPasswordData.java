package com.vk.auth.smartflow.mail.password;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.zcl;

/* compiled from: MailPasswordData.kt */
/* loaded from: classes15.dex */
public final class MailPasswordData implements Parcelable {
    public static final Parcelable.Creator<MailPasswordData> CREATOR = new a();
    public final String b;
    public final String c;
    public final boolean d;

    /* compiled from: MailPasswordData.kt */
    public static final class a implements Parcelable.Creator<MailPasswordData> {
        @Override // android.os.Parcelable.Creator
        public final MailPasswordData createFromParcel(Parcel parcel) {
            return new MailPasswordData(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MailPasswordData[] newArray(int i) {
            return new MailPasswordData[i];
        }
    }

    public MailPasswordData(String str, String str2, boolean z) {
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
        if (!(obj instanceof MailPasswordData)) {
            return false;
        }
        MailPasswordData mailPasswordData = (MailPasswordData) obj;
        return epx.f(this.b, mailPasswordData.b) && epx.f(this.c, mailPasswordData.c) && this.d == mailPasswordData.d;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return Boolean.hashCode(this.d) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MailPasswordData(email=");
        sb.append(this.b);
        sb.append(", sid=");
        sb.append(this.c);
        sb.append(", isBindFlow=");
        return q0.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }

    public /* synthetic */ MailPasswordData(String str, String str2, boolean z, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? false : z);
    }
}
