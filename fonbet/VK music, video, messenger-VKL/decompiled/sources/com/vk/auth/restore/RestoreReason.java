package com.vk.auth.restore;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.O6;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.auth.verification.base.stats.VerificationStatFlow;
import xsna.zcl;

/* compiled from: RestoreReason.kt */
/* loaded from: classes.dex */
public abstract class RestoreReason implements Parcelable {
    public final String b;
    public final String c;
    public final RestoreNavValue d;

    /* compiled from: RestoreReason.kt */
    /* loaded from: classes15.dex */
    public static final class AlreadyUsedPhone extends RestoreReason {
        public static final Parcelable.Creator<AlreadyUsedPhone> CREATOR = new a();
        public final String e;

        /* compiled from: RestoreReason.kt */
        public static final class a implements Parcelable.Creator<AlreadyUsedPhone> {
            @Override // android.os.Parcelable.Creator
            public final AlreadyUsedPhone createFromParcel(Parcel parcel) {
                return new AlreadyUsedPhone(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AlreadyUsedPhone[] newArray(int i) {
                return new AlreadyUsedPhone[i];
            }
        }

        public AlreadyUsedPhone(String str) {
            super(str, null, null, null);
            this.e = str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.e);
        }
    }

    /* compiled from: RestoreReason.kt */
    /* loaded from: classes15.dex */
    public static final class CancelByOwner extends RestoreReason {
        public static final Parcelable.Creator<CancelByOwner> CREATOR = new a();
        public final long e;
        public final String f;

        /* compiled from: RestoreReason.kt */
        public static final class a implements Parcelable.Creator<CancelByOwner> {
            @Override // android.os.Parcelable.Creator
            public final CancelByOwner createFromParcel(Parcel parcel) {
                return new CancelByOwner(parcel.readLong(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CancelByOwner[] newArray(int i) {
                return new CancelByOwner[i];
            }
        }

        public CancelByOwner(long j, String str) {
            super(null, null, null, null);
            this.e = j;
            this.f = str;
        }

        @Override // com.vk.auth.restore.RestoreReason
        public final Uri a(Uri.Builder builder) {
            return builder.appendQueryParameter("act", "cancel_by_owner").appendQueryParameter("id", String.valueOf(this.e)).appendQueryParameter("hash", this.f).build();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.e);
            parcel.writeString(this.f);
        }
    }

    /* compiled from: RestoreReason.kt */
    /* loaded from: classes15.dex */
    public static final class Enter2FACode extends RestoreReason {
        public static final Parcelable.Creator<Enter2FACode> CREATOR = new a();
        public final String e;

        /* compiled from: RestoreReason.kt */
        public static final class a implements Parcelable.Creator<Enter2FACode> {
            @Override // android.os.Parcelable.Creator
            public final Enter2FACode createFromParcel(Parcel parcel) {
                return new Enter2FACode(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Enter2FACode[] newArray(int i) {
                return new Enter2FACode[i];
            }
        }

        public Enter2FACode(String str) {
            super(str, null, null, null);
            this.e = str;
        }

        @Override // com.vk.auth.restore.RestoreReason
        public final String d() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.e);
        }
    }

    /* compiled from: RestoreReason.kt */
    /* loaded from: classes15.dex */
    public static final class ForgetPassword extends RestoreReason {
        public static final Parcelable.Creator<ForgetPassword> CREATOR = new a();
        public final String e;
        public final String f;
        public final RestoreNavValue g;

        /* compiled from: RestoreReason.kt */
        public static final class a implements Parcelable.Creator<ForgetPassword> {
            @Override // android.os.Parcelable.Creator
            public final ForgetPassword createFromParcel(Parcel parcel) {
                return new ForgetPassword(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : RestoreNavValue.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final ForgetPassword[] newArray(int i) {
                return new ForgetPassword[i];
            }
        }

        public ForgetPassword(String str, String str2, RestoreNavValue restoreNavValue) {
            super(str, str2, restoreNavValue, null);
            this.e = str;
            this.f = str2;
            this.g = restoreNavValue;
        }

        @Override // com.vk.auth.restore.RestoreReason
        public final String d() {
            return this.e;
        }

        @Override // com.vk.auth.restore.RestoreReason
        public final RestoreNavValue e() {
            return this.g;
        }

        @Override // com.vk.auth.restore.RestoreReason
        public final String f() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.e);
            parcel.writeString(this.f);
            RestoreNavValue restoreNavValue = this.g;
            if (restoreNavValue == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(restoreNavValue.name());
            }
        }
    }

    /* compiled from: RestoreReason.kt */
    /* loaded from: classes15.dex */
    public static final class NoAvailableVerificationMethodsError extends RestoreReason {
        public static final Parcelable.Creator<NoAvailableVerificationMethodsError> CREATOR = new a();
        public final String e;

        /* compiled from: RestoreReason.kt */
        public static final class a implements Parcelable.Creator<NoAvailableVerificationMethodsError> {
            @Override // android.os.Parcelable.Creator
            public final NoAvailableVerificationMethodsError createFromParcel(Parcel parcel) {
                return new NoAvailableVerificationMethodsError(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NoAvailableVerificationMethodsError[] newArray(int i) {
                return new NoAvailableVerificationMethodsError[i];
            }
        }

        public NoAvailableVerificationMethodsError(String str) {
            super(str, null, RestoreNavValue.AUTH_ALERT_NO_AVAILABLE_FACTORS, null);
            this.e = str;
        }

        @Override // com.vk.auth.restore.RestoreReason
        public final String d() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.e);
        }
    }

    /* compiled from: RestoreReason.kt */
    /* loaded from: classes15.dex */
    public static final class PasskeyIsUnavailable extends RestoreReason {
        public static final Parcelable.Creator<PasskeyIsUnavailable> CREATOR = new a();
        public final String e;

        /* compiled from: RestoreReason.kt */
        public static final class a implements Parcelable.Creator<PasskeyIsUnavailable> {
            @Override // android.os.Parcelable.Creator
            public final PasskeyIsUnavailable createFromParcel(Parcel parcel) {
                return new PasskeyIsUnavailable(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PasskeyIsUnavailable[] newArray(int i) {
                return new PasskeyIsUnavailable[i];
            }
        }

        public PasskeyIsUnavailable(String str) {
            super(str, null, null, null);
            this.e = str;
        }

        @Override // com.vk.auth.restore.RestoreReason
        public final String d() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.e);
        }
    }

    /* compiled from: RestoreReason.kt */
    /* loaded from: classes15.dex */
    public static final class PrimaryFactorChoice extends RestoreReason {
        public static final Parcelable.Creator<PrimaryFactorChoice> CREATOR = new a();
        public final String e;
        public final VerificationStatFlow f;

        /* compiled from: RestoreReason.kt */
        public static final class a implements Parcelable.Creator<PrimaryFactorChoice> {
            @Override // android.os.Parcelable.Creator
            public final PrimaryFactorChoice createFromParcel(Parcel parcel) {
                return new PrimaryFactorChoice(parcel.readString(), VerificationStatFlow.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final PrimaryFactorChoice[] newArray(int i) {
                return new PrimaryFactorChoice[i];
            }
        }

        public PrimaryFactorChoice(String str, VerificationStatFlow verificationStatFlow) {
            super(str, null, RestoreNavValue.AUTH_PRIMARY_FACTOR_CHOICE, null);
            this.e = str;
            this.f = verificationStatFlow;
        }

        @Override // com.vk.auth.restore.RestoreReason
        public final String d() {
            return this.e;
        }

        public final VerificationStatFlow i() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.e);
            parcel.writeString(this.f.name());
        }
    }

    /* compiled from: RestoreReason.kt */
    /* loaded from: classes15.dex */
    public static final class VkidMailRestore extends RestoreReason {
        public static final Parcelable.Creator<VkidMailRestore> CREATOR = new a();
        public final String e;

        /* compiled from: RestoreReason.kt */
        public static final class a implements Parcelable.Creator<VkidMailRestore> {
            @Override // android.os.Parcelable.Creator
            public final VkidMailRestore createFromParcel(Parcel parcel) {
                return new VkidMailRestore(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final VkidMailRestore[] newArray(int i) {
                return new VkidMailRestore[i];
            }
        }

        public VkidMailRestore(String str) {
            super(null, null, RestoreNavValue.AUTH_MAIL_RU, null);
            this.e = str;
        }

        public final String i() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.e);
        }
    }

    public RestoreReason(String str, String str2, RestoreNavValue restoreNavValue, zcl zclVar) {
        this.b = str;
        this.c = str2;
        this.d = restoreNavValue;
    }

    public Uri a(Uri.Builder builder) {
        return builder.build();
    }

    public String d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public RestoreNavValue e() {
        return this.d;
    }

    public String f() {
        return this.c;
    }

    public final Uri g(String str) {
        Uri.Builder appendEncodedPath = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority(str).appendEncodedPath("restore/");
        if (f() != null) {
            appendEncodedPath.appendQueryParameter(O6.e1, f());
        }
        return a(appendEncodedPath);
    }
}
