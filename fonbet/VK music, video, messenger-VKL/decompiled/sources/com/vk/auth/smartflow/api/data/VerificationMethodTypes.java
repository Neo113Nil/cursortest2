package com.vk.auth.smartflow.api.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VerificationMethodTypes.kt */
/* loaded from: classes15.dex */
public final class VerificationMethodTypes implements VerificationMethodState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VerificationMethodTypes[] $VALUES;
    public static final VerificationMethodTypes CALLRESET;
    public static final VerificationMethodTypes CODEGEN;
    public static final Parcelable.Creator<VerificationMethodTypes> CREATOR;
    public static final a Companion;
    public static final VerificationMethodTypes EMAIL;
    public static final VerificationMethodTypes MAX_MESSENGER;
    public static final VerificationMethodTypes MAX_OTP_CODE;
    public static final VerificationMethodTypes OFFICIAL_MESSENGER;
    public static final VerificationMethodTypes PASSKEY;
    public static final VerificationMethodTypes PASSWORD;
    public static final VerificationMethodTypes PUSH;
    public static final VerificationMethodTypes RESERVE_CODE;
    public static final VerificationMethodTypes SMS;
    private final String methodName;

    /* compiled from: VerificationMethodTypes.kt */
    public static final class a {
    }

    /* compiled from: VerificationMethodTypes.kt */
    public static final class b implements Parcelable.Creator<VerificationMethodTypes> {
        @Override // android.os.Parcelable.Creator
        public final VerificationMethodTypes createFromParcel(Parcel parcel) {
            return VerificationMethodTypes.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VerificationMethodTypes[] newArray(int i) {
            return new VerificationMethodTypes[i];
        }
    }

    static {
        VerificationMethodTypes verificationMethodTypes = new VerificationMethodTypes("CALLRESET", 0, "callreset");
        CALLRESET = verificationMethodTypes;
        VerificationMethodTypes verificationMethodTypes2 = new VerificationMethodTypes("CODEGEN", 1, "codegen");
        CODEGEN = verificationMethodTypes2;
        VerificationMethodTypes verificationMethodTypes3 = new VerificationMethodTypes(CommonConstant.RETKEY.EMAIL, 2, "email");
        EMAIL = verificationMethodTypes3;
        VerificationMethodTypes verificationMethodTypes4 = new VerificationMethodTypes("PASSKEY", 3, "passkey");
        PASSKEY = verificationMethodTypes4;
        VerificationMethodTypes verificationMethodTypes5 = new VerificationMethodTypes("PASSWORD", 4, LoginApiConstants.PARAM_NAME_PASSWORD);
        PASSWORD = verificationMethodTypes5;
        VerificationMethodTypes verificationMethodTypes6 = new VerificationMethodTypes("PUSH", 5, "push");
        PUSH = verificationMethodTypes6;
        VerificationMethodTypes verificationMethodTypes7 = new VerificationMethodTypes("RESERVE_CODE", 6, "reserve_code");
        RESERVE_CODE = verificationMethodTypes7;
        VerificationMethodTypes verificationMethodTypes8 = new VerificationMethodTypes("SMS", 7, "sms");
        SMS = verificationMethodTypes8;
        VerificationMethodTypes verificationMethodTypes9 = new VerificationMethodTypes("MAX_MESSENGER", 8, "max_messenger");
        MAX_MESSENGER = verificationMethodTypes9;
        VerificationMethodTypes verificationMethodTypes10 = new VerificationMethodTypes("OFFICIAL_MESSENGER", 9, "official_messenger");
        OFFICIAL_MESSENGER = verificationMethodTypes10;
        VerificationMethodTypes verificationMethodTypes11 = new VerificationMethodTypes("MAX_OTP_CODE", 10, "max_code");
        MAX_OTP_CODE = verificationMethodTypes11;
        VerificationMethodTypes[] verificationMethodTypesArr = {verificationMethodTypes, verificationMethodTypes2, verificationMethodTypes3, verificationMethodTypes4, verificationMethodTypes5, verificationMethodTypes6, verificationMethodTypes7, verificationMethodTypes8, verificationMethodTypes9, verificationMethodTypes10, verificationMethodTypes11};
        $VALUES = verificationMethodTypesArr;
        $ENTRIES = new asp(verificationMethodTypesArr);
        Companion = new a();
        CREATOR = new b();
    }

    public VerificationMethodTypes(String str, int i, String str2) {
        this.methodName = str2;
    }

    public static VerificationMethodTypes valueOf(String str) {
        return (VerificationMethodTypes) Enum.valueOf(VerificationMethodTypes.class, str);
    }

    public static VerificationMethodTypes[] values() {
        return (VerificationMethodTypes[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.methodName;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
