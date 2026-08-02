package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.O6;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AuthValidateAccountResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthValidateAccountResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthValidateAccountResponseDto> CREATOR = new a();

    @pmi0(b.JSON_KEY_ADS)
    private final Boolean ads;

    @pmi0("authorized_user_id")
    private final Integer authorizedUserId;

    @pmi0("exchange_token_index")
    private final Integer exchangeTokenIndex;

    @pmi0("flow_name")
    private final FlowNameDto flowName;

    @pmi0("flow_names")
    private final List<String> flowNames;

    @pmi0("is_email")
    private final Boolean isEmail;

    @pmi0("is_external")
    private final Boolean isExternal;

    @pmi0("is_force_auth")
    private final Boolean isForceAuth;

    @pmi0("is_phone")
    private final Boolean isPhone;

    @pmi0("login")
    private final String login;

    @pmi0("next_step")
    private final AuthValidateAccountNextStepDto nextStep;

    @pmi0("pass_sid")
    private final Boolean passSid;

    @pmi0("redirect_type")
    private final String redirectType;

    @pmi0("redirect_url")
    private final String redirectUrl;

    @pmi0("remember_hash")
    private final String rememberHash;

    @pmi0("show_bind_offer")
    private final Boolean showBindOffer;

    @pmi0(O6.e1)
    private final String sid;

    @pmi0("soft_vkid")
    private final Boolean softVkid;

    @pmi0(X3.f.e)
    private final String strategy;

    @pmi0("trusted_hash")
    private final String trustedHash;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AuthValidateAccountResponseDto.kt */
    public static final class FlowNameDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FlowNameDto[] $VALUES;
        public static final Parcelable.Creator<FlowNameDto> CREATOR;

        @pmi0("need_auth")
        public static final FlowNameDto NEED_AUTH;

        @pmi0("need_exchange_token")
        public static final FlowNameDto NEED_EXCHANGE_TOKEN;

        @pmi0("need_login_validation")
        public static final FlowNameDto NEED_LOGIN_VALIDATION;

        @pmi0("need_passkey")
        public static final FlowNameDto NEED_PASSKEY;

        @pmi0("need_passkey_otp")
        public static final FlowNameDto NEED_PASSKEY_OTP;

        @pmi0("need_password")
        public static final FlowNameDto NEED_PASSWORD;

        @pmi0("need_password_and_validation")
        public static final FlowNameDto NEED_PASSWORD_AND_VALIDATION;

        @pmi0("need_registration")
        public static final FlowNameDto NEED_REGISTRATION;

        @pmi0("need_restore")
        public static final FlowNameDto NEED_RESTORE;

        @pmi0("need_validation")
        public static final FlowNameDto NEED_VALIDATION;

        @pmi0("need_webauthn")
        public static final FlowNameDto NEED_WEBAUTHN;
        private final String value;

        /* compiled from: AuthValidateAccountResponseDto.kt */
        public static final class a implements Parcelable.Creator<FlowNameDto> {
            @Override // android.os.Parcelable.Creator
            public final FlowNameDto createFromParcel(Parcel parcel) {
                return FlowNameDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final FlowNameDto[] newArray(int i) {
                return new FlowNameDto[i];
            }
        }

        static {
            FlowNameDto flowNameDto = new FlowNameDto("NEED_PASSWORD_AND_VALIDATION", 0, "need_password_and_validation");
            NEED_PASSWORD_AND_VALIDATION = flowNameDto;
            FlowNameDto flowNameDto2 = new FlowNameDto("NEED_VALIDATION", 1, "need_validation");
            NEED_VALIDATION = flowNameDto2;
            FlowNameDto flowNameDto3 = new FlowNameDto("NEED_PASSWORD", 2, "need_password");
            NEED_PASSWORD = flowNameDto3;
            FlowNameDto flowNameDto4 = new FlowNameDto("NEED_REGISTRATION", 3, "need_registration");
            NEED_REGISTRATION = flowNameDto4;
            FlowNameDto flowNameDto5 = new FlowNameDto("NEED_LOGIN_VALIDATION", 4, "need_login_validation");
            NEED_LOGIN_VALIDATION = flowNameDto5;
            FlowNameDto flowNameDto6 = new FlowNameDto("NEED_PASSKEY", 5, "need_passkey");
            NEED_PASSKEY = flowNameDto6;
            FlowNameDto flowNameDto7 = new FlowNameDto("NEED_PASSKEY_OTP", 6, "need_passkey_otp");
            NEED_PASSKEY_OTP = flowNameDto7;
            FlowNameDto flowNameDto8 = new FlowNameDto("NEED_WEBAUTHN", 7, "need_webauthn");
            NEED_WEBAUTHN = flowNameDto8;
            FlowNameDto flowNameDto9 = new FlowNameDto("NEED_AUTH", 8, "need_auth");
            NEED_AUTH = flowNameDto9;
            FlowNameDto flowNameDto10 = new FlowNameDto("NEED_EXCHANGE_TOKEN", 9, "need_exchange_token");
            NEED_EXCHANGE_TOKEN = flowNameDto10;
            FlowNameDto flowNameDto11 = new FlowNameDto("NEED_RESTORE", 10, "need_restore");
            NEED_RESTORE = flowNameDto11;
            FlowNameDto[] flowNameDtoArr = {flowNameDto, flowNameDto2, flowNameDto3, flowNameDto4, flowNameDto5, flowNameDto6, flowNameDto7, flowNameDto8, flowNameDto9, flowNameDto10, flowNameDto11};
            $VALUES = flowNameDtoArr;
            $ENTRIES = new asp(flowNameDtoArr);
            CREATOR = new a();
        }

        private FlowNameDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static FlowNameDto valueOf(String str) {
            return (FlowNameDto) Enum.valueOf(FlowNameDto.class, str);
        }

        public static FlowNameDto[] values() {
            return (FlowNameDto[]) $VALUES.clone();
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

    /* compiled from: AuthValidateAccountResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthValidateAccountResponseDto> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final AuthValidateAccountResponseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Integer valueOf5;
            Boolean bool;
            Boolean valueOf6;
            Boolean valueOf7;
            Boolean valueOf8;
            Boolean valueOf9;
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
            FlowNameDto createFromParcel = parcel.readInt() == 0 ? null : FlowNameDto.CREATOR.createFromParcel(parcel);
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Boolean bool2 = valueOf;
            Boolean bool3 = valueOf2;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString2 = parcel.readString();
            AuthValidateAccountNextStepDto createFromParcel2 = parcel.readInt() == 0 ? null : AuthValidateAccountNextStepDto.CREATOR.createFromParcel(parcel);
            String readString3 = parcel.readString();
            Boolean bool4 = valueOf4;
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf5 = null;
                bool = null;
            } else {
                valueOf5 = Integer.valueOf(parcel.readInt());
                bool = null;
            }
            Boolean bool5 = valueOf3;
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf6 = bool;
            } else {
                valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf7 = bool;
            } else {
                valueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            boolean z = false;
            String readString7 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf8 = bool;
            } else {
                valueOf8 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Object valueOf10 = parcel.readInt() == 0 ? bool : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf9 = bool;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                valueOf9 = Boolean.valueOf(z);
            }
            return new AuthValidateAccountResponseDto(bool2, bool3, createFromParcel, createStringArrayList, bool5, readString, bool4, readString2, createFromParcel2, readString3, readString4, valueOf5, readString5, readString6, valueOf6, valueOf7, readString7, valueOf8, valueOf10, valueOf9);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthValidateAccountResponseDto[] newArray(int i) {
            return new AuthValidateAccountResponseDto[i];
        }
    }

    public AuthValidateAccountResponseDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    public final Integer d() {
        return this.exchangeTokenIndex;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final FlowNameDto e() {
        return this.flowName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthValidateAccountResponseDto)) {
            return false;
        }
        AuthValidateAccountResponseDto authValidateAccountResponseDto = (AuthValidateAccountResponseDto) obj;
        return epx.f(this.isPhone, authValidateAccountResponseDto.isPhone) && epx.f(this.isEmail, authValidateAccountResponseDto.isEmail) && this.flowName == authValidateAccountResponseDto.flowName && epx.f(this.flowNames, authValidateAccountResponseDto.flowNames) && epx.f(this.ads, authValidateAccountResponseDto.ads) && epx.f(this.sid, authValidateAccountResponseDto.sid) && epx.f(this.passSid, authValidateAccountResponseDto.passSid) && epx.f(this.login, authValidateAccountResponseDto.login) && epx.f(this.nextStep, authValidateAccountResponseDto.nextStep) && epx.f(this.rememberHash, authValidateAccountResponseDto.rememberHash) && epx.f(this.trustedHash, authValidateAccountResponseDto.trustedHash) && epx.f(this.exchangeTokenIndex, authValidateAccountResponseDto.exchangeTokenIndex) && epx.f(this.redirectUrl, authValidateAccountResponseDto.redirectUrl) && epx.f(this.redirectType, authValidateAccountResponseDto.redirectType) && epx.f(this.showBindOffer, authValidateAccountResponseDto.showBindOffer) && epx.f(this.isExternal, authValidateAccountResponseDto.isExternal) && epx.f(this.strategy, authValidateAccountResponseDto.strategy) && epx.f(this.softVkid, authValidateAccountResponseDto.softVkid) && epx.f(this.authorizedUserId, authValidateAccountResponseDto.authorizedUserId) && epx.f(this.isForceAuth, authValidateAccountResponseDto.isForceAuth);
    }

    public final List<String> f() {
        return this.flowNames;
    }

    public final String g() {
        return this.login;
    }

    public final int hashCode() {
        Boolean bool = this.isPhone;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isEmail;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        FlowNameDto flowNameDto = this.flowName;
        int hashCode3 = (hashCode2 + (flowNameDto == null ? 0 : flowNameDto.hashCode())) * 31;
        List<String> list = this.flowNames;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool3 = this.ads;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.sid;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool4 = this.passSid;
        int hashCode7 = (hashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.login;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AuthValidateAccountNextStepDto authValidateAccountNextStepDto = this.nextStep;
        int hashCode9 = (hashCode8 + (authValidateAccountNextStepDto == null ? 0 : authValidateAccountNextStepDto.hashCode())) * 31;
        String str3 = this.rememberHash;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.trustedHash;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.exchangeTokenIndex;
        int hashCode12 = (hashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.redirectUrl;
        int hashCode13 = (hashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.redirectType;
        int hashCode14 = (hashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool5 = this.showBindOffer;
        int hashCode15 = (hashCode14 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.isExternal;
        int hashCode16 = (hashCode15 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str7 = this.strategy;
        int hashCode17 = (hashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool7 = this.softVkid;
        int hashCode18 = (hashCode17 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Integer num2 = this.authorizedUserId;
        int hashCode19 = (hashCode18 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool8 = this.isForceAuth;
        return hashCode19 + (bool8 != null ? bool8.hashCode() : 0);
    }

    public final AuthValidateAccountNextStepDto i() {
        return this.nextStep;
    }

    public final String j() {
        return this.sid;
    }

    public final String k() {
        return this.trustedHash;
    }

    public final Boolean l() {
        return this.isEmail;
    }

    public final Boolean n() {
        return this.isPhone;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthValidateAccountResponseDto(isPhone=");
        sb.append(this.isPhone);
        sb.append(", isEmail=");
        sb.append(this.isEmail);
        sb.append(", flowName=");
        sb.append(this.flowName);
        sb.append(", flowNames=");
        sb.append(this.flowNames);
        sb.append(", ads=");
        sb.append(this.ads);
        sb.append(", sid=");
        sb.append(this.sid);
        sb.append(", passSid=");
        sb.append(this.passSid);
        sb.append(", login=");
        sb.append(this.login);
        sb.append(", nextStep=");
        sb.append(this.nextStep);
        sb.append(", rememberHash=");
        sb.append(this.rememberHash);
        sb.append(", trustedHash=");
        sb.append(this.trustedHash);
        sb.append(", exchangeTokenIndex=");
        sb.append(this.exchangeTokenIndex);
        sb.append(", redirectUrl=");
        sb.append(this.redirectUrl);
        sb.append(", redirectType=");
        sb.append(this.redirectType);
        sb.append(", showBindOffer=");
        sb.append(this.showBindOffer);
        sb.append(", isExternal=");
        sb.append(this.isExternal);
        sb.append(", strategy=");
        sb.append(this.strategy);
        sb.append(", softVkid=");
        sb.append(this.softVkid);
        sb.append(", authorizedUserId=");
        sb.append(this.authorizedUserId);
        sb.append(", isForceAuth=");
        return tn.a(sb, this.isForceAuth, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.isPhone;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isEmail;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        FlowNameDto flowNameDto = this.flowName;
        if (flowNameDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            flowNameDto.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.flowNames);
        Boolean bool3 = this.ads;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        parcel.writeString(this.sid);
        Boolean bool4 = this.passSid;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        parcel.writeString(this.login);
        AuthValidateAccountNextStepDto authValidateAccountNextStepDto = this.nextStep;
        if (authValidateAccountNextStepDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authValidateAccountNextStepDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.rememberHash);
        parcel.writeString(this.trustedHash);
        Integer num = this.exchangeTokenIndex;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.redirectUrl);
        parcel.writeString(this.redirectType);
        Boolean bool5 = this.showBindOffer;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        Boolean bool6 = this.isExternal;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
        parcel.writeString(this.strategy);
        Boolean bool7 = this.softVkid;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool7);
        }
        Integer num2 = this.authorizedUserId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Boolean bool8 = this.isForceAuth;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool8);
        }
    }

    public AuthValidateAccountResponseDto(Boolean bool, Boolean bool2, FlowNameDto flowNameDto, List<String> list, Boolean bool3, String str, Boolean bool4, String str2, AuthValidateAccountNextStepDto authValidateAccountNextStepDto, String str3, String str4, Integer num, String str5, String str6, Boolean bool5, Boolean bool6, String str7, Boolean bool7, Integer num2, Boolean bool8) {
        this.isPhone = bool;
        this.isEmail = bool2;
        this.flowName = flowNameDto;
        this.flowNames = list;
        this.ads = bool3;
        this.sid = str;
        this.passSid = bool4;
        this.login = str2;
        this.nextStep = authValidateAccountNextStepDto;
        this.rememberHash = str3;
        this.trustedHash = str4;
        this.exchangeTokenIndex = num;
        this.redirectUrl = str5;
        this.redirectType = str6;
        this.showBindOffer = bool5;
        this.isExternal = bool6;
        this.strategy = str7;
        this.softVkid = bool7;
        this.authorizedUserId = num2;
        this.isForceAuth = bool8;
    }

    public /* synthetic */ AuthValidateAccountResponseDto(Boolean bool, Boolean bool2, FlowNameDto flowNameDto, List list, Boolean bool3, String str, Boolean bool4, String str2, AuthValidateAccountNextStepDto authValidateAccountNextStepDto, String str3, String str4, Integer num, String str5, String str6, Boolean bool5, Boolean bool6, String str7, Boolean bool7, Integer num2, Boolean bool8, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : flowNameDto, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : bool3, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : bool4, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : authValidateAccountNextStepDto, (i & 512) != 0 ? null : str3, (i & 1024) != 0 ? null : str4, (i & 2048) != 0 ? null : num, (i & 4096) != 0 ? null : str5, (i & 8192) != 0 ? null : str6, (i & 16384) != 0 ? null : bool5, (i & 32768) != 0 ? null : bool6, (i & 65536) != 0 ? null : str7, (i & 131072) != 0 ? null : bool7, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : num2, (i & 524288) != 0 ? null : bool8);
    }
}
