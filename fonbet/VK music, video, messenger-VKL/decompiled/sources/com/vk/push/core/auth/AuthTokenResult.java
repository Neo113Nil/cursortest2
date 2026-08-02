package com.vk.push.core.auth;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: AuthTokenResult.kt */
/* loaded from: classes5.dex */
public final class AuthTokenResult implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);
    public final String b;

    /* compiled from: AuthTokenResult.kt */
    public static final class CREATOR implements Parcelable.Creator<AuthTokenResult> {
        public /* synthetic */ CREATOR(zcl zclVar) {
            this();
        }

        public CREATOR() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AuthTokenResult createFromParcel(Parcel parcel) {
            return new AuthTokenResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AuthTokenResult[] newArray(int i) {
            return new AuthTokenResult[i];
        }
    }

    public AuthTokenResult(String str) {
        this.b = str;
    }

    public static /* synthetic */ AuthTokenResult copy$default(AuthTokenResult authTokenResult, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authTokenResult.b;
        }
        return authTokenResult.copy(str);
    }

    public final String component1() {
        return this.b;
    }

    public final AuthTokenResult copy(String str) {
        return new AuthTokenResult(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthTokenResult) && epx.f(this.b, ((AuthTokenResult) obj).b);
    }

    public final String getToken() {
        return this.b;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return ho8.a(new StringBuilder("AuthTokenResult(token="), this.b, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AuthTokenResult(Parcel parcel) {
        this(r1 == null ? "" : r1);
        String readString = parcel.readString();
    }
}
