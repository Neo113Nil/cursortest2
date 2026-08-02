package com.vk.superapp.core.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.shy;

/* compiled from: ValidateInfo.kt */
/* loaded from: classes6.dex */
public final class SendOtpInfo implements Parcelable {
    public static final Parcelable.Creator<SendOtpInfo> CREATOR = new a();
    public final int b;
    public final int c;
    public final String d;

    /* compiled from: ValidateInfo.kt */
    public static final class a implements Parcelable.Creator<SendOtpInfo> {
        @Override // android.os.Parcelable.Creator
        public final SendOtpInfo createFromParcel(Parcel parcel) {
            return new SendOtpInfo(parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SendOtpInfo[] newArray(int i) {
            return new SendOtpInfo[i];
        }
    }

    public SendOtpInfo(int i, int i2, String str) {
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendOtpInfo)) {
            return false;
        }
        SendOtpInfo sendOtpInfo = (SendOtpInfo) obj;
        return this.b == sendOtpInfo.b && this.c == sendOtpInfo.c && epx.f(this.d, sendOtpInfo.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendOtpInfo(status=");
        sb.append(this.b);
        sb.append(", codeLength=");
        sb.append(this.c);
        sb.append(", info=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
    }
}
