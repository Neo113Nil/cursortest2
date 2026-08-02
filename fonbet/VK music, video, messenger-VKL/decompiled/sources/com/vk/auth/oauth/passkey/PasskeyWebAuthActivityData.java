package com.vk.auth.oauth.passkey;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: PasskeyWebAuthActivityData.kt */
/* loaded from: classes15.dex */
public final class PasskeyWebAuthActivityData implements Parcelable {
    public static final Parcelable.Creator<PasskeyWebAuthActivityData> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;

    /* compiled from: PasskeyWebAuthActivityData.kt */
    public static final class a implements Parcelable.Creator<PasskeyWebAuthActivityData> {
        @Override // android.os.Parcelable.Creator
        public final PasskeyWebAuthActivityData createFromParcel(Parcel parcel) {
            return new PasskeyWebAuthActivityData(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PasskeyWebAuthActivityData[] newArray(int i) {
            return new PasskeyWebAuthActivityData[i];
        }
    }

    public PasskeyWebAuthActivityData(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasskeyWebAuthActivityData)) {
            return false;
        }
        PasskeyWebAuthActivityData passkeyWebAuthActivityData = (PasskeyWebAuthActivityData) obj;
        return epx.f(this.b, passkeyWebAuthActivityData.b) && epx.f(this.c, passkeyWebAuthActivityData.c) && epx.f(this.d, passkeyWebAuthActivityData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PasskeyWebAuthActivityData(login=");
        sb.append(this.b);
        sb.append(", sid=");
        sb.append(this.c);
        sb.append(", uuid=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
