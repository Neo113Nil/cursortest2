package com.vk.auth.smartflow;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.auth.passkey.PasskeyCheckInfo;
import com.vk.auth.screendata.LibverifyScreenData;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.smartflow.api.data.VerificationMethodState;
import com.vk.auth.smartflow.api.password.FullscreenPasswordData;

/* compiled from: ValidateAccountRoutingData.kt */
/* loaded from: classes.dex */
public interface ValidateAccountRoutingData extends Parcelable {

    /* compiled from: ValidateAccountRoutingData.kt */
    /* loaded from: classes15.dex */
    public static final class Credentials implements Parcelable {
        public static final Parcelable.Creator<Credentials> CREATOR = new a();
        public final String b;

        /* compiled from: ValidateAccountRoutingData.kt */
        public static final class a implements Parcelable.Creator<Credentials> {
            @Override // android.os.Parcelable.Creator
            public final Credentials createFromParcel(Parcel parcel) {
                return new Credentials(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Credentials[] newArray(int i) {
                return new Credentials[i];
            }
        }

        public Credentials(String str) {
            this.b = str;
        }

        public final String d() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
        }
    }

    /* compiled from: ValidateAccountRoutingData.kt */
    /* loaded from: classes15.dex */
    public static final class Libverify implements ValidateAccountRoutingData {
        public static final Parcelable.Creator<Libverify> CREATOR = new a();
        public final LibverifyScreenData.MethodSelectorAuth b;
        public final Credentials c;

        /* compiled from: ValidateAccountRoutingData.kt */
        public static final class a implements Parcelable.Creator<Libverify> {
            @Override // android.os.Parcelable.Creator
            public final Libverify createFromParcel(Parcel parcel) {
                return new Libverify(LibverifyScreenData.MethodSelectorAuth.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Credentials.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Libverify[] newArray(int i) {
                return new Libverify[i];
            }
        }

        public Libverify(LibverifyScreenData.MethodSelectorAuth methodSelectorAuth, Credentials credentials) {
            this.b = methodSelectorAuth;
            this.c = credentials;
        }

        public final Credentials d() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final LibverifyScreenData.MethodSelectorAuth e() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.b.writeToParcel(parcel, i);
            Credentials credentials = this.c;
            if (credentials == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                credentials.writeToParcel(parcel, i);
            }
        }
    }

    /* compiled from: ValidateAccountRoutingData.kt */
    /* loaded from: classes15.dex */
    public static final class NoPasswordFlowPassword implements ValidateAccountRoutingData {
        public static final Parcelable.Creator<NoPasswordFlowPassword> CREATOR = new a();
        public final FullscreenPasswordData b;
        public final Credentials c;

        /* compiled from: ValidateAccountRoutingData.kt */
        public static final class a implements Parcelable.Creator<NoPasswordFlowPassword> {
            @Override // android.os.Parcelable.Creator
            public final NoPasswordFlowPassword createFromParcel(Parcel parcel) {
                return new NoPasswordFlowPassword((FullscreenPasswordData) parcel.readParcelable(NoPasswordFlowPassword.class.getClassLoader()), parcel.readInt() == 0 ? null : Credentials.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final NoPasswordFlowPassword[] newArray(int i) {
                return new NoPasswordFlowPassword[i];
            }
        }

        public NoPasswordFlowPassword(FullscreenPasswordData fullscreenPasswordData, Credentials credentials) {
            this.b = fullscreenPasswordData;
            this.c = credentials;
        }

        public final Credentials d() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final FullscreenPasswordData e() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            Credentials credentials = this.c;
            if (credentials == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                credentials.writeToParcel(parcel, i);
            }
        }
    }

    /* compiled from: ValidateAccountRoutingData.kt */
    /* loaded from: classes15.dex */
    public static final class Otp implements ValidateAccountRoutingData {
        public static final Parcelable.Creator<Otp> CREATOR = new a();
        public final VerificationScreenData b;
        public final VerificationMethodState c;
        public final Credentials d;

        /* compiled from: ValidateAccountRoutingData.kt */
        public static final class a implements Parcelable.Creator<Otp> {
            @Override // android.os.Parcelable.Creator
            public final Otp createFromParcel(Parcel parcel) {
                return new Otp((VerificationScreenData) parcel.readParcelable(Otp.class.getClassLoader()), (VerificationMethodState) parcel.readParcelable(Otp.class.getClassLoader()), parcel.readInt() == 0 ? null : Credentials.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Otp[] newArray(int i) {
                return new Otp[i];
            }
        }

        public Otp(VerificationScreenData verificationScreenData, VerificationMethodState verificationMethodState, Credentials credentials) {
            this.b = verificationScreenData;
            this.c = verificationMethodState;
            this.d = credentials;
        }

        public final Credentials d() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final VerificationMethodState e() {
            return this.c;
        }

        public final VerificationScreenData f() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeParcelable(this.c, i);
            Credentials credentials = this.d;
            if (credentials == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                credentials.writeToParcel(parcel, i);
            }
        }
    }

    /* compiled from: ValidateAccountRoutingData.kt */
    /* loaded from: classes15.dex */
    public static final class Passkey implements ValidateAccountRoutingData {
        public static final Parcelable.Creator<Passkey> CREATOR = new a();
        public final PasskeyCheckInfo b;

        /* compiled from: ValidateAccountRoutingData.kt */
        public static final class a implements Parcelable.Creator<Passkey> {
            @Override // android.os.Parcelable.Creator
            public final Passkey createFromParcel(Parcel parcel) {
                return new Passkey(PasskeyCheckInfo.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Passkey[] newArray(int i) {
                return new Passkey[i];
            }
        }

        public Passkey(PasskeyCheckInfo passkeyCheckInfo) {
            this.b = passkeyCheckInfo;
        }

        public final PasskeyCheckInfo d() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.b.writeToParcel(parcel, i);
        }
    }

    /* compiled from: ValidateAccountRoutingData.kt */
    /* loaded from: classes15.dex */
    public static final class SmartflowPassword implements ValidateAccountRoutingData {
        public static final Parcelable.Creator<SmartflowPassword> CREATOR = new a();
        public final FullscreenPasswordData b;
        public final Credentials c;

        /* compiled from: ValidateAccountRoutingData.kt */
        public static final class a implements Parcelable.Creator<SmartflowPassword> {
            @Override // android.os.Parcelable.Creator
            public final SmartflowPassword createFromParcel(Parcel parcel) {
                return new SmartflowPassword((FullscreenPasswordData) parcel.readParcelable(SmartflowPassword.class.getClassLoader()), parcel.readInt() == 0 ? null : Credentials.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SmartflowPassword[] newArray(int i) {
                return new SmartflowPassword[i];
            }
        }

        public SmartflowPassword(FullscreenPasswordData fullscreenPasswordData, Credentials credentials) {
            this.b = fullscreenPasswordData;
            this.c = credentials;
        }

        public final Credentials d() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final FullscreenPasswordData e() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            Credentials credentials = this.c;
            if (credentials == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                credentials.writeToParcel(parcel, i);
            }
        }
    }
}
