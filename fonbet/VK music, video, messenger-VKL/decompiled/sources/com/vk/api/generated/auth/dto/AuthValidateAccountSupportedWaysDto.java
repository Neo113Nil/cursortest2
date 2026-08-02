package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthValidateAccountSupportedWaysDto.kt */
/* loaded from: classes14.dex */
public final class AuthValidateAccountSupportedWaysDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AuthValidateAccountSupportedWaysDto[] $VALUES;

    @pmi0("callreset")
    public static final AuthValidateAccountSupportedWaysDto CALLRESET;

    @pmi0("call_in")
    public static final AuthValidateAccountSupportedWaysDto CALL_IN;

    @pmi0("codegen")
    public static final AuthValidateAccountSupportedWaysDto CODEGEN;
    public static final Parcelable.Creator<AuthValidateAccountSupportedWaysDto> CREATOR;

    @pmi0("email")
    public static final AuthValidateAccountSupportedWaysDto EMAIL;

    @pmi0("libverify")
    public static final AuthValidateAccountSupportedWaysDto LIBVERIFY;

    @pmi0("max_code")
    public static final AuthValidateAccountSupportedWaysDto MAX_CODE;

    @pmi0("max_messenger")
    public static final AuthValidateAccountSupportedWaysDto MAX_MESSENGER;

    @pmi0("official_messenger")
    public static final AuthValidateAccountSupportedWaysDto OFFICIAL_MESSENGER;

    @pmi0("passkey")
    public static final AuthValidateAccountSupportedWaysDto PASSKEY;

    @pmi0(LoginApiConstants.PARAM_NAME_PASSWORD)
    public static final AuthValidateAccountSupportedWaysDto PASSWORD;

    @pmi0("push")
    public static final AuthValidateAccountSupportedWaysDto PUSH;

    @pmi0("qr_code")
    public static final AuthValidateAccountSupportedWaysDto QR_CODE;

    @pmi0("reserve_code")
    public static final AuthValidateAccountSupportedWaysDto RESERVE_CODE;

    @pmi0("sms")
    public static final AuthValidateAccountSupportedWaysDto SMS;
    private final String value;

    /* compiled from: AuthValidateAccountSupportedWaysDto.kt */
    public static final class a implements Parcelable.Creator<AuthValidateAccountSupportedWaysDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthValidateAccountSupportedWaysDto createFromParcel(Parcel parcel) {
            return AuthValidateAccountSupportedWaysDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthValidateAccountSupportedWaysDto[] newArray(int i) {
            return new AuthValidateAccountSupportedWaysDto[i];
        }
    }

    static {
        AuthValidateAccountSupportedWaysDto authValidateAccountSupportedWaysDto = new AuthValidateAccountSupportedWaysDto("CALL_IN", 0, "call_in");
        CALL_IN = authValidateAccountSupportedWaysDto;
        AuthValidateAccountSupportedWaysDto authValidateAccountSupportedWaysDto2 = new AuthValidateAccountSupportedWaysDto("CALLRESET", 1, "callreset");
        CALLRESET = authValidateAccountSupportedWaysDto2;
        AuthValidateAccountSupportedWaysDto authValidateAccountSupportedWaysDto3 = new AuthValidateAccountSupportedWaysDto("CODEGEN", 2, "codegen");
        CODEGEN = authValidateAccountSupportedWaysDto3;
        AuthValidateAccountSupportedWaysDto authValidateAccountSupportedWaysDto4 = new AuthValidateAccountSupportedWaysDto(CommonConstant.RETKEY.EMAIL, 3, "email");
        EMAIL = authValidateAccountSupportedWaysDto4;
        AuthValidateAccountSupportedWaysDto authValidateAccountSupportedWaysDto5 = new AuthValidateAccountSupportedWaysDto("LIBVERIFY", 4, "libverify");
        LIBVERIFY = authValidateAccountSupportedWaysDto5;
        AuthValidateAccountSupportedWaysDto authValidateAccountSupportedWaysDto6 = new AuthValidateAccountSupportedWaysDto("MAX_CODE", 5, "max_code");
        MAX_CODE = authValidateAccountSupportedWaysDto6;
        AuthValidateAccountSupportedWaysDto authValidateAccountSupportedWaysDto7 = new AuthValidateAccountSupportedWaysDto("MAX_MESSENGER", 6, "max_messenger");
        MAX_MESSENGER = authValidateAccountSupportedWaysDto7;
        AuthValidateAccountSupportedWaysDto authValidateAccountSupportedWaysDto8 = new AuthValidateAccountSupportedWaysDto("OFFICIAL_MESSENGER", 7, "official_messenger");
        OFFICIAL_MESSENGER = authValidateAccountSupportedWaysDto8;
        AuthValidateAccountSupportedWaysDto authValidateAccountSupportedWaysDto9 = new AuthValidateAccountSupportedWaysDto("PASSKEY", 8, "passkey");
        PASSKEY = authValidateAccountSupportedWaysDto9;
        AuthValidateAccountSupportedWaysDto authValidateAccountSupportedWaysDto10 = new AuthValidateAccountSupportedWaysDto("PASSWORD", 9, LoginApiConstants.PARAM_NAME_PASSWORD);
        PASSWORD = authValidateAccountSupportedWaysDto10;
        AuthValidateAccountSupportedWaysDto authValidateAccountSupportedWaysDto11 = new AuthValidateAccountSupportedWaysDto("PUSH", 10, "push");
        PUSH = authValidateAccountSupportedWaysDto11;
        AuthValidateAccountSupportedWaysDto authValidateAccountSupportedWaysDto12 = new AuthValidateAccountSupportedWaysDto(CommonConstant.RETKEY.QR_CODE, 11, "qr_code");
        QR_CODE = authValidateAccountSupportedWaysDto12;
        AuthValidateAccountSupportedWaysDto authValidateAccountSupportedWaysDto13 = new AuthValidateAccountSupportedWaysDto("RESERVE_CODE", 12, "reserve_code");
        RESERVE_CODE = authValidateAccountSupportedWaysDto13;
        AuthValidateAccountSupportedWaysDto authValidateAccountSupportedWaysDto14 = new AuthValidateAccountSupportedWaysDto("SMS", 13, "sms");
        SMS = authValidateAccountSupportedWaysDto14;
        AuthValidateAccountSupportedWaysDto[] authValidateAccountSupportedWaysDtoArr = {authValidateAccountSupportedWaysDto, authValidateAccountSupportedWaysDto2, authValidateAccountSupportedWaysDto3, authValidateAccountSupportedWaysDto4, authValidateAccountSupportedWaysDto5, authValidateAccountSupportedWaysDto6, authValidateAccountSupportedWaysDto7, authValidateAccountSupportedWaysDto8, authValidateAccountSupportedWaysDto9, authValidateAccountSupportedWaysDto10, authValidateAccountSupportedWaysDto11, authValidateAccountSupportedWaysDto12, authValidateAccountSupportedWaysDto13, authValidateAccountSupportedWaysDto14};
        $VALUES = authValidateAccountSupportedWaysDtoArr;
        $ENTRIES = new asp(authValidateAccountSupportedWaysDtoArr);
        CREATOR = new a();
    }

    private AuthValidateAccountSupportedWaysDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AuthValidateAccountSupportedWaysDto valueOf(String str) {
        return (AuthValidateAccountSupportedWaysDto) Enum.valueOf(AuthValidateAccountSupportedWaysDto.class, str);
    }

    public static AuthValidateAccountSupportedWaysDto[] values() {
        return (AuthValidateAccountSupportedWaysDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
