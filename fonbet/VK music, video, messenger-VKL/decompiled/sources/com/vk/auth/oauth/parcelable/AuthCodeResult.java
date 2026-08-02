package com.vk.auth.oauth.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: AuthCodeResult.kt */
/* loaded from: classes15.dex */
public final class AuthCodeResult implements Parcelable {
    public static final Parcelable.Creator<AuthCodeResult> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    /* compiled from: AuthCodeResult.kt */
    public static final class a implements Parcelable.Creator<AuthCodeResult> {
        @Override // android.os.Parcelable.Creator
        public final AuthCodeResult createFromParcel(Parcel parcel) {
            return new AuthCodeResult(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthCodeResult[] newArray(int i) {
            return new AuthCodeResult[i];
        }
    }

    public AuthCodeResult(String str, String str2, String str3, String str4) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
