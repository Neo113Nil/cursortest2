package com.vk.push.core.auth;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.zcl;

/* compiled from: AuthorizedResult.kt */
/* loaded from: classes5.dex */
public final class AuthorizedResult implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);
    public final boolean b;

    /* compiled from: AuthorizedResult.kt */
    public static final class CREATOR implements Parcelable.Creator<AuthorizedResult> {
        public /* synthetic */ CREATOR(zcl zclVar) {
            this();
        }

        public CREATOR() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AuthorizedResult createFromParcel(Parcel parcel) {
            return new AuthorizedResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AuthorizedResult[] newArray(int i) {
            return new AuthorizedResult[i];
        }
    }

    public AuthorizedResult(boolean z) {
        this.b = z;
    }

    public static /* synthetic */ AuthorizedResult copy$default(AuthorizedResult authorizedResult, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = authorizedResult.b;
        }
        return authorizedResult.copy(z);
    }

    public final boolean component1() {
        return this.b;
    }

    public final AuthorizedResult copy(boolean z) {
        return new AuthorizedResult(z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthorizedResult) && this.b == ((AuthorizedResult) obj).b;
    }

    public int hashCode() {
        boolean z = this.b;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final boolean isAuthorized() {
        return this.b;
    }

    public String toString() {
        return q0.a(new StringBuilder("AuthorizedResult(isAuthorized="), this.b, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
    }

    public AuthorizedResult(Parcel parcel) {
        this(parcel.readByte() != 0);
    }
}
