package com.vk.auth.verification.base.stats;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;

/* compiled from: VerificationStatStartedFromReg.kt */
/* loaded from: classes15.dex */
public final class VerificationStatStartedFromReg implements Parcelable {
    public static final Parcelable.Creator<VerificationStatStartedFromReg> CREATOR = new a();
    public final boolean b;

    /* compiled from: VerificationStatStartedFromReg.kt */
    public static final class a implements Parcelable.Creator<VerificationStatStartedFromReg> {
        @Override // android.os.Parcelable.Creator
        public final VerificationStatStartedFromReg createFromParcel(Parcel parcel) {
            return new VerificationStatStartedFromReg(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final VerificationStatStartedFromReg[] newArray(int i) {
            return new VerificationStatStartedFromReg[i];
        }
    }

    public VerificationStatStartedFromReg(boolean z) {
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VerificationStatStartedFromReg) && this.b == ((VerificationStatStartedFromReg) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return q0.a(new StringBuilder("VerificationStatStartedFromReg(value="), this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
    }
}
