package com.vk.superapp.api.dto.auth;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: AuthPayload.kt */
/* loaded from: classes6.dex */
public final class AuthPayload implements Parcelable {
    public static final Parcelable.Creator<AuthPayload> CREATOR = new a();
    public final String b;

    /* compiled from: AuthPayload.kt */
    public static final class a implements Parcelable.Creator<AuthPayload> {
        @Override // android.os.Parcelable.Creator
        public final AuthPayload createFromParcel(Parcel parcel) {
            return new AuthPayload(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthPayload[] newArray(int i) {
            return new AuthPayload[i];
        }
    }

    public AuthPayload(String str) {
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthPayload) && epx.f(this.b, ((AuthPayload) obj).b);
    }

    public final int hashCode() {
        String str = this.b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("AuthPayload(uri="), this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
    }
}
