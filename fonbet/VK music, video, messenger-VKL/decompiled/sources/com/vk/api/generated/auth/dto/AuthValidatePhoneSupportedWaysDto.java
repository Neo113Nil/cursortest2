package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthValidatePhoneSupportedWaysDto.kt */
/* loaded from: classes14.dex */
public final class AuthValidatePhoneSupportedWaysDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AuthValidatePhoneSupportedWaysDto[] $VALUES;

    @pmi0("call_in")
    public static final AuthValidatePhoneSupportedWaysDto CALL_IN;
    public static final Parcelable.Creator<AuthValidatePhoneSupportedWaysDto> CREATOR;

    @pmi0("email")
    public static final AuthValidatePhoneSupportedWaysDto EMAIL;

    @pmi0("max_code")
    public static final AuthValidatePhoneSupportedWaysDto MAX_CODE;

    @pmi0("max_messenger")
    public static final AuthValidatePhoneSupportedWaysDto MAX_MESSENGER;

    @pmi0("messenger")
    public static final AuthValidatePhoneSupportedWaysDto MESSENGER;

    @pmi0("passkey")
    public static final AuthValidatePhoneSupportedWaysDto PASSKEY;

    @pmi0("push")
    public static final AuthValidatePhoneSupportedWaysDto PUSH;

    @pmi0("sms_inbox")
    public static final AuthValidatePhoneSupportedWaysDto SMS_INBOX;
    private final String value;

    /* compiled from: AuthValidatePhoneSupportedWaysDto.kt */
    public static final class a implements Parcelable.Creator<AuthValidatePhoneSupportedWaysDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthValidatePhoneSupportedWaysDto createFromParcel(Parcel parcel) {
            return AuthValidatePhoneSupportedWaysDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthValidatePhoneSupportedWaysDto[] newArray(int i) {
            return new AuthValidatePhoneSupportedWaysDto[i];
        }
    }

    static {
        AuthValidatePhoneSupportedWaysDto authValidatePhoneSupportedWaysDto = new AuthValidatePhoneSupportedWaysDto("CALL_IN", 0, "call_in");
        CALL_IN = authValidatePhoneSupportedWaysDto;
        AuthValidatePhoneSupportedWaysDto authValidatePhoneSupportedWaysDto2 = new AuthValidatePhoneSupportedWaysDto(CommonConstant.RETKEY.EMAIL, 1, "email");
        EMAIL = authValidatePhoneSupportedWaysDto2;
        AuthValidatePhoneSupportedWaysDto authValidatePhoneSupportedWaysDto3 = new AuthValidatePhoneSupportedWaysDto("MAX_CODE", 2, "max_code");
        MAX_CODE = authValidatePhoneSupportedWaysDto3;
        AuthValidatePhoneSupportedWaysDto authValidatePhoneSupportedWaysDto4 = new AuthValidatePhoneSupportedWaysDto("MAX_MESSENGER", 3, "max_messenger");
        MAX_MESSENGER = authValidatePhoneSupportedWaysDto4;
        AuthValidatePhoneSupportedWaysDto authValidatePhoneSupportedWaysDto5 = new AuthValidatePhoneSupportedWaysDto("MESSENGER", 4, "messenger");
        MESSENGER = authValidatePhoneSupportedWaysDto5;
        AuthValidatePhoneSupportedWaysDto authValidatePhoneSupportedWaysDto6 = new AuthValidatePhoneSupportedWaysDto("PASSKEY", 5, "passkey");
        PASSKEY = authValidatePhoneSupportedWaysDto6;
        AuthValidatePhoneSupportedWaysDto authValidatePhoneSupportedWaysDto7 = new AuthValidatePhoneSupportedWaysDto("PUSH", 6, "push");
        PUSH = authValidatePhoneSupportedWaysDto7;
        AuthValidatePhoneSupportedWaysDto authValidatePhoneSupportedWaysDto8 = new AuthValidatePhoneSupportedWaysDto("SMS_INBOX", 7, "sms_inbox");
        SMS_INBOX = authValidatePhoneSupportedWaysDto8;
        AuthValidatePhoneSupportedWaysDto[] authValidatePhoneSupportedWaysDtoArr = {authValidatePhoneSupportedWaysDto, authValidatePhoneSupportedWaysDto2, authValidatePhoneSupportedWaysDto3, authValidatePhoneSupportedWaysDto4, authValidatePhoneSupportedWaysDto5, authValidatePhoneSupportedWaysDto6, authValidatePhoneSupportedWaysDto7, authValidatePhoneSupportedWaysDto8};
        $VALUES = authValidatePhoneSupportedWaysDtoArr;
        $ENTRIES = new asp(authValidatePhoneSupportedWaysDtoArr);
        CREATOR = new a();
    }

    private AuthValidatePhoneSupportedWaysDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AuthValidatePhoneSupportedWaysDto valueOf(String str) {
        return (AuthValidatePhoneSupportedWaysDto) Enum.valueOf(AuthValidatePhoneSupportedWaysDto.class, str);
    }

    public static AuthValidatePhoneSupportedWaysDto[] values() {
        return (AuthValidatePhoneSupportedWaysDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
