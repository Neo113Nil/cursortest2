package com.vk.superapp.verification.account;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;

/* compiled from: VerificationFlow.kt */
/* loaded from: classes6.dex */
public interface VerificationFlow extends Parcelable {

    /* compiled from: VerificationFlow.kt */
    public static final class App2App implements VerificationFlow {
        public static final Parcelable.Creator<App2App> CREATOR = new a();
        public final List<String> b;

        /* compiled from: VerificationFlow.kt */
        public static final class a implements Parcelable.Creator<App2App> {
            @Override // android.os.Parcelable.Creator
            public final App2App createFromParcel(Parcel parcel) {
                return new App2App(parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final App2App[] newArray(int i) {
                return new App2App[i];
            }
        }

        public App2App(List<String> list) {
            this.b = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof App2App) && epx.f(this.b, ((App2App) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("App2App(appLinks="), this.b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeStringList(this.b);
        }
    }

    /* compiled from: VerificationFlow.kt */
    public static final class Web implements VerificationFlow {
        public static final Web b = new Web();
        public static final Parcelable.Creator<Web> CREATOR = new a();

        /* compiled from: VerificationFlow.kt */
        public static final class a implements Parcelable.Creator<Web> {
            @Override // android.os.Parcelable.Creator
            public final Web createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Web.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Web[] newArray(int i) {
                return new Web[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Web);
        }

        public final int hashCode() {
            return -219759129;
        }

        public final String toString() {
            return "Web";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }
}
