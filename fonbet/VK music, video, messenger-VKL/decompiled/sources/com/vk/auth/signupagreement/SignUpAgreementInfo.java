package com.vk.auth.signupagreement;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;

/* compiled from: SignUpAgreementInfo.kt */
/* loaded from: classes15.dex */
public final class SignUpAgreementInfo implements Parcelable {
    public static final Parcelable.Creator<SignUpAgreementInfo> CREATOR = new a();
    public final boolean b;
    public final boolean c;

    /* compiled from: SignUpAgreementInfo.kt */
    public static final class a implements Parcelable.Creator<SignUpAgreementInfo> {
        @Override // android.os.Parcelable.Creator
        public final SignUpAgreementInfo createFromParcel(Parcel parcel) {
            return new SignUpAgreementInfo(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SignUpAgreementInfo[] newArray(int i) {
            return new SignUpAgreementInfo[i];
        }
    }

    public SignUpAgreementInfo(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
    }

    public final boolean d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignUpAgreementInfo)) {
            return false;
        }
        SignUpAgreementInfo signUpAgreementInfo = (SignUpAgreementInfo) obj;
        return this.b == signUpAgreementInfo.b && this.c == signUpAgreementInfo.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SignUpAgreementInfo(isRequired=");
        sb.append(this.b);
        sb.append(", isAccountExisting=");
        return q0.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
