package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.O6;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AuthValidateLoginResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthValidateLoginResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthValidateLoginResponseDto> CREATOR = new a();

    @pmi0("email")
    private final String email;

    @pmi0("email_reg_allowed")
    private final Boolean emailRegAllowed;

    @pmi0("is_email")
    private final Boolean isEmail;

    @pmi0("is_my_com_register")
    private final Boolean isMyComRegister;

    @pmi0("phone")
    private final String phone;

    @pmi0("result")
    private final ResultDto result;

    @pmi0(O6.e1)
    private final String sid;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AuthValidateLoginResponseDto.kt */
    public static final class ResultDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ResultDto[] $VALUES;
        public static final Parcelable.Creator<ResultDto> CREATOR;

        @pmi0("need_email_confirm")
        public static final ResultDto NEED_EMAIL_CONFIRM;

        @pmi0("need_passkey")
        public static final ResultDto NEED_PASSKEY;

        @pmi0("need_passkey_or_password")
        public static final ResultDto NEED_PASSKEY_OR_PASSWORD;

        @pmi0("need_passkey_or_phone_confirm")
        public static final ResultDto NEED_PASSKEY_OR_PHONE_CONFIRM;

        @pmi0("need_passkey_otp")
        public static final ResultDto NEED_PASSKEY_OTP;

        @pmi0("need_password")
        public static final ResultDto NEED_PASSWORD;

        @pmi0("need_phone_confirm")
        public static final ResultDto NEED_PHONE_CONFIRM;
        private final String value;

        /* compiled from: AuthValidateLoginResponseDto.kt */
        public static final class a implements Parcelable.Creator<ResultDto> {
            @Override // android.os.Parcelable.Creator
            public final ResultDto createFromParcel(Parcel parcel) {
                return ResultDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ResultDto[] newArray(int i) {
                return new ResultDto[i];
            }
        }

        static {
            ResultDto resultDto = new ResultDto("NEED_PASSWORD", 0, "need_password");
            NEED_PASSWORD = resultDto;
            ResultDto resultDto2 = new ResultDto("NEED_EMAIL_CONFIRM", 1, "need_email_confirm");
            NEED_EMAIL_CONFIRM = resultDto2;
            ResultDto resultDto3 = new ResultDto("NEED_PHONE_CONFIRM", 2, "need_phone_confirm");
            NEED_PHONE_CONFIRM = resultDto3;
            ResultDto resultDto4 = new ResultDto("NEED_PASSKEY", 3, "need_passkey");
            NEED_PASSKEY = resultDto4;
            ResultDto resultDto5 = new ResultDto("NEED_PASSKEY_OTP", 4, "need_passkey_otp");
            NEED_PASSKEY_OTP = resultDto5;
            ResultDto resultDto6 = new ResultDto("NEED_PASSKEY_OR_PHONE_CONFIRM", 5, "need_passkey_or_phone_confirm");
            NEED_PASSKEY_OR_PHONE_CONFIRM = resultDto6;
            ResultDto resultDto7 = new ResultDto("NEED_PASSKEY_OR_PASSWORD", 6, "need_passkey_or_password");
            NEED_PASSKEY_OR_PASSWORD = resultDto7;
            ResultDto[] resultDtoArr = {resultDto, resultDto2, resultDto3, resultDto4, resultDto5, resultDto6, resultDto7};
            $VALUES = resultDtoArr;
            $ENTRIES = new asp(resultDtoArr);
            CREATOR = new a();
        }

        private ResultDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ResultDto valueOf(String str) {
            return (ResultDto) Enum.valueOf(ResultDto.class, str);
        }

        public static ResultDto[] values() {
            return (ResultDto[]) $VALUES.clone();
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

    /* compiled from: AuthValidateLoginResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthValidateLoginResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthValidateLoginResponseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            ResultDto createFromParcel = ResultDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AuthValidateLoginResponseDto(createFromParcel, readString, readString2, readString3, valueOf, valueOf2, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthValidateLoginResponseDto[] newArray(int i) {
            return new AuthValidateLoginResponseDto[i];
        }
    }

    public AuthValidateLoginResponseDto(ResultDto resultDto, String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3) {
        this.result = resultDto;
        this.sid = str;
        this.email = str2;
        this.phone = str3;
        this.isEmail = bool;
        this.emailRegAllowed = bool2;
        this.isMyComRegister = bool3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthValidateLoginResponseDto)) {
            return false;
        }
        AuthValidateLoginResponseDto authValidateLoginResponseDto = (AuthValidateLoginResponseDto) obj;
        return this.result == authValidateLoginResponseDto.result && epx.f(this.sid, authValidateLoginResponseDto.sid) && epx.f(this.email, authValidateLoginResponseDto.email) && epx.f(this.phone, authValidateLoginResponseDto.phone) && epx.f(this.isEmail, authValidateLoginResponseDto.isEmail) && epx.f(this.emailRegAllowed, authValidateLoginResponseDto.emailRegAllowed) && epx.f(this.isMyComRegister, authValidateLoginResponseDto.isMyComRegister);
    }

    public final int hashCode() {
        int hashCode = this.result.hashCode() * 31;
        String str = this.sid;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.email;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phone;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isEmail;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.emailRegAllowed;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isMyComRegister;
        return hashCode6 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthValidateLoginResponseDto(result=");
        sb.append(this.result);
        sb.append(", sid=");
        sb.append(this.sid);
        sb.append(", email=");
        sb.append(this.email);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", isEmail=");
        sb.append(this.isEmail);
        sb.append(", emailRegAllowed=");
        sb.append(this.emailRegAllowed);
        sb.append(", isMyComRegister=");
        return tn.a(sb, this.isMyComRegister, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.result.writeToParcel(parcel, i);
        parcel.writeString(this.sid);
        parcel.writeString(this.email);
        parcel.writeString(this.phone);
        Boolean bool = this.isEmail;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.emailRegAllowed;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.isMyComRegister;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
    }

    public /* synthetic */ AuthValidateLoginResponseDto(ResultDto resultDto, String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, int i, zcl zclVar) {
        this(resultDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : bool3);
    }
}
