package com.vk.superapp.qr.web2app.data;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.shy;
import xsna.urd0;

/* compiled from: CheckSignInOpenArguments.kt */
/* loaded from: classes6.dex */
public final class CheckSignInOpenArguments implements Parcelable {
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public static final a g = new a();
    public static final Parcelable.Creator<CheckSignInOpenArguments> CREATOR = new b();
    private static final CheckSignInOpenArguments STUB = new CheckSignInOpenArguments("", 0, 0, "", "");

    /* compiled from: CheckSignInOpenArguments.kt */
    public static final class a {
        public final CheckSignInOpenArguments getSTUB() {
            return CheckSignInOpenArguments.STUB;
        }
    }

    /* compiled from: CheckSignInOpenArguments.kt */
    public static final class b implements Parcelable.Creator<CheckSignInOpenArguments> {
        @Override // android.os.Parcelable.Creator
        public final CheckSignInOpenArguments createFromParcel(Parcel parcel) {
            return new CheckSignInOpenArguments(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CheckSignInOpenArguments[] newArray(int i) {
            return new CheckSignInOpenArguments[i];
        }
    }

    public CheckSignInOpenArguments(String str, int i, int i2, String str2, String str3) {
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = str2;
        this.f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckSignInOpenArguments)) {
            return false;
        }
        CheckSignInOpenArguments checkSignInOpenArguments = (CheckSignInOpenArguments) obj;
        return epx.f(this.b, checkSignInOpenArguments.b) && this.c == checkSignInOpenArguments.c && this.d == checkSignInOpenArguments.d && epx.f(this.e, checkSignInOpenArguments.e) && epx.f(this.f, checkSignInOpenArguments.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + urd0.a(shy.a(this.d, shy.a(this.c, this.b.hashCode() * 31, 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckSignInOpenArguments(authCode=");
        sb.append(this.b);
        sb.append(", pollingDelayInSec=");
        sb.append(this.c);
        sb.append(", expiresTimestampInSec=");
        sb.append(this.d);
        sb.append(", domain=");
        sb.append(this.e);
        sb.append(", faqUrl=");
        return ho8.a(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}
