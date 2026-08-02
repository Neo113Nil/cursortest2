package com.vk.superapp.core.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: ValidateInfo.kt */
/* loaded from: classes6.dex */
public final class ValidateInfo implements Parcelable {
    public static final Parcelable.Creator<ValidateInfo> CREATOR = new a();
    public final boolean b;
    public final String c;
    public final NextStep d;
    public final String e;

    /* compiled from: ValidateInfo.kt */
    public static final class NextStep implements Parcelable {
        public static final Parcelable.Creator<NextStep> CREATOR = new a();
        public final String b;
        public final boolean c;

        /* compiled from: ValidateInfo.kt */
        public static final class a implements Parcelable.Creator<NextStep> {
            @Override // android.os.Parcelable.Creator
            public final NextStep createFromParcel(Parcel parcel) {
                return new NextStep(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final NextStep[] newArray(int i) {
                return new NextStep[i];
            }
        }

        public NextStep(String str, boolean z) {
            this.b = str;
            this.c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NextStep)) {
                return false;
            }
            NextStep nextStep = (NextStep) obj;
            return epx.f(this.b, nextStep.b) && this.c == nextStep.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NextStep(verificationMethod=");
            sb.append(this.b);
            sb.append(", hasAnotherVerificationMethods=");
            return q0.a(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    /* compiled from: ValidateInfo.kt */
    public static final class a implements Parcelable.Creator<ValidateInfo> {
        @Override // android.os.Parcelable.Creator
        public final ValidateInfo createFromParcel(Parcel parcel) {
            return new ValidateInfo(parcel.readInt() != 0, parcel.readString(), NextStep.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ValidateInfo[] newArray(int i) {
            return new ValidateInfo[i];
        }
    }

    public ValidateInfo(boolean z, String str, NextStep nextStep, String str2) {
        this.b = z;
        this.c = str;
        this.d = nextStep;
        this.e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidateInfo)) {
            return false;
        }
        ValidateInfo validateInfo = (ValidateInfo) obj;
        return this.b == validateInfo.b && epx.f(this.c, validateInfo.c) && epx.f(this.d, validateInfo.d) && epx.f(this.e, validateInfo.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + urd0.a(Boolean.hashCode(this.b) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ValidateInfo(isEmail=");
        sb.append(this.b);
        sb.append(", sid=");
        sb.append(this.c);
        sb.append(", nextStep=");
        sb.append(this.d);
        sb.append(", rememberHash=");
        return ho8.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
        this.d.writeToParcel(parcel, i);
        parcel.writeString(this.e);
    }
}
