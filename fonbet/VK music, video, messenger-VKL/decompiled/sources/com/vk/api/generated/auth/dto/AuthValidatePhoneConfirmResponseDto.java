package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.coremedia.iso.boxes.AuthorBox;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.O6;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.qoy;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AuthValidatePhoneConfirmResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthValidatePhoneConfirmResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthValidatePhoneConfirmResponseDto> CREATOR = new a();

    @pmi0("auth_hash")
    private final String authHash;

    @pmi0("can_skip_password")
    private final Boolean canSkipPassword;

    @pmi0("hash")
    private final String hash;

    @pmi0("hide_password")
    private final HidePasswordDto hidePassword;

    @pmi0("is_show_registration_new_about_me")
    private final Boolean isShowRegistrationNewAboutMe;

    @pmi0("next_step")
    private final NextStepDto nextStep;

    @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
    private final AuthUserDto profile;

    @pmi0("profile_exist")
    private final boolean profileExist;

    @pmi0("registration_confirm_text")
    private final AuthValidateRegistrationConfirmTextsDto registrationConfirmText;

    @pmi0("show_qr_code")
    private final Boolean showQrCode;

    @pmi0("show_registration_confirm")
    private final Boolean showRegistrationConfirm;

    @pmi0("show_without_password_redesign")
    private final Boolean showWithoutPasswordRedesign;

    @pmi0(O6.e1)
    private final String sid;

    @pmi0("signup_fields")
    private final List<String> signupFields;

    @pmi0("signup_fields_values")
    private final AuthSignupFieldsValuesDto signupFieldsValues;

    @pmi0("signup_params")
    private final AuthValidateSignupParamsDto signupParams;

    @pmi0("signup_restricted_reason")
    private final String signupRestrictedReason;

    @pmi0("signup_restricted_subject")
    private final String signupRestrictedSubject;

    @pmi0("signup_suggested_fields")
    private final List<String> signupSuggestedFields;

    @pmi0("success")
    private final SuccessDto success;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AuthValidatePhoneConfirmResponseDto.kt */
    public static final class HidePasswordDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ HidePasswordDto[] $VALUES;
        public static final Parcelable.Creator<HidePasswordDto> CREATOR;

        @pmi0("1")
        public static final HidePasswordDto HIDE;

        @pmi0("2")
        public static final HidePasswordDto SKIP_CONFIRM;
        private final int value;

        /* compiled from: AuthValidatePhoneConfirmResponseDto.kt */
        public static final class a implements Parcelable.Creator<HidePasswordDto> {
            @Override // android.os.Parcelable.Creator
            public final HidePasswordDto createFromParcel(Parcel parcel) {
                return HidePasswordDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final HidePasswordDto[] newArray(int i) {
                return new HidePasswordDto[i];
            }
        }

        static {
            HidePasswordDto hidePasswordDto = new HidePasswordDto("HIDE", 0, 1);
            HIDE = hidePasswordDto;
            HidePasswordDto hidePasswordDto2 = new HidePasswordDto("SKIP_CONFIRM", 1, 2);
            SKIP_CONFIRM = hidePasswordDto2;
            HidePasswordDto[] hidePasswordDtoArr = {hidePasswordDto, hidePasswordDto2};
            $VALUES = hidePasswordDtoArr;
            $ENTRIES = new asp(hidePasswordDtoArr);
            CREATOR = new a();
        }

        private HidePasswordDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static HidePasswordDto valueOf(String str) {
            return (HidePasswordDto) Enum.valueOf(HidePasswordDto.class, str);
        }

        public static HidePasswordDto[] values() {
            return (HidePasswordDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final int i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AuthValidatePhoneConfirmResponseDto.kt */
    public static final class NextStepDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NextStepDto[] $VALUES;

        @pmi0(AuthorBox.TYPE)
        public static final NextStepDto AUTH;
        public static final Parcelable.Creator<NextStepDto> CREATOR;

        @pmi0("on_success_validation")
        public static final NextStepDto ON_SUCCESS_VALIDATION;

        @pmi0("phone_validation")
        public static final NextStepDto PHONE_VALIDATION;

        @pmi0("registration")
        public static final NextStepDto REGISTRATION;

        @pmi0("show_without_password")
        public static final NextStepDto SHOW_WITHOUT_PASSWORD;

        @pmi0("show_with_account_recovery")
        public static final NextStepDto SHOW_WITH_ACCOUNT_RECOVERY;

        @pmi0("show_with_password")
        public static final NextStepDto SHOW_WITH_PASSWORD;

        @pmi0("silent_registration")
        public static final NextStepDto SILENT_REGISTRATION;
        private final String value;

        /* compiled from: AuthValidatePhoneConfirmResponseDto.kt */
        public static final class a implements Parcelable.Creator<NextStepDto> {
            @Override // android.os.Parcelable.Creator
            public final NextStepDto createFromParcel(Parcel parcel) {
                return NextStepDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NextStepDto[] newArray(int i) {
                return new NextStepDto[i];
            }
        }

        static {
            NextStepDto nextStepDto = new NextStepDto("AUTH", 0, AuthorBox.TYPE);
            AUTH = nextStepDto;
            NextStepDto nextStepDto2 = new NextStepDto("REGISTRATION", 1, "registration");
            REGISTRATION = nextStepDto2;
            NextStepDto nextStepDto3 = new NextStepDto("SILENT_REGISTRATION", 2, "silent_registration");
            SILENT_REGISTRATION = nextStepDto3;
            NextStepDto nextStepDto4 = new NextStepDto("SHOW_WITH_PASSWORD", 3, "show_with_password");
            SHOW_WITH_PASSWORD = nextStepDto4;
            NextStepDto nextStepDto5 = new NextStepDto("SHOW_WITHOUT_PASSWORD", 4, "show_without_password");
            SHOW_WITHOUT_PASSWORD = nextStepDto5;
            NextStepDto nextStepDto6 = new NextStepDto("PHONE_VALIDATION", 5, "phone_validation");
            PHONE_VALIDATION = nextStepDto6;
            NextStepDto nextStepDto7 = new NextStepDto("SHOW_WITH_ACCOUNT_RECOVERY", 6, "show_with_account_recovery");
            SHOW_WITH_ACCOUNT_RECOVERY = nextStepDto7;
            NextStepDto nextStepDto8 = new NextStepDto("ON_SUCCESS_VALIDATION", 7, "on_success_validation");
            ON_SUCCESS_VALIDATION = nextStepDto8;
            NextStepDto[] nextStepDtoArr = {nextStepDto, nextStepDto2, nextStepDto3, nextStepDto4, nextStepDto5, nextStepDto6, nextStepDto7, nextStepDto8};
            $VALUES = nextStepDtoArr;
            $ENTRIES = new asp(nextStepDtoArr);
            CREATOR = new a();
        }

        private NextStepDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static NextStepDto valueOf(String str) {
            return (NextStepDto) Enum.valueOf(NextStepDto.class, str);
        }

        public static NextStepDto[] values() {
            return (NextStepDto[]) $VALUES.clone();
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AuthValidatePhoneConfirmResponseDto.kt */
    public static final class SuccessDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SuccessDto[] $VALUES;
        public static final Parcelable.Creator<SuccessDto> CREATOR;

        @pmi0("1")
        public static final SuccessDto TYPE_1;
        private final int value;

        /* compiled from: AuthValidatePhoneConfirmResponseDto.kt */
        public static final class a implements Parcelable.Creator<SuccessDto> {
            @Override // android.os.Parcelable.Creator
            public final SuccessDto createFromParcel(Parcel parcel) {
                return SuccessDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SuccessDto[] newArray(int i) {
                return new SuccessDto[i];
            }
        }

        static {
            SuccessDto successDto = new SuccessDto("TYPE_1", 0, 1);
            TYPE_1 = successDto;
            SuccessDto[] successDtoArr = {successDto};
            $VALUES = successDtoArr;
            $ENTRIES = new asp(successDtoArr);
            CREATOR = new a();
        }

        private SuccessDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static SuccessDto valueOf(String str) {
            return (SuccessDto) Enum.valueOf(SuccessDto.class, str);
        }

        public static SuccessDto[] values() {
            return (SuccessDto[]) $VALUES.clone();
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

    /* compiled from: AuthValidatePhoneConfirmResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthValidatePhoneConfirmResponseDto> {
        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            */
        @Override // android.os.Parcelable.Creator
        public final com.vk.api.generated.auth.dto.AuthValidatePhoneConfirmResponseDto createFromParcel(
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r25v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            */

        @Override // android.os.Parcelable.Creator
        public final AuthValidatePhoneConfirmResponseDto[] newArray(int i) {
            return new AuthValidatePhoneConfirmResponseDto[i];
        }
    }

    public AuthValidatePhoneConfirmResponseDto(String str, boolean z, HidePasswordDto hidePasswordDto, Boolean bool, NextStepDto nextStepDto, Boolean bool2, Boolean bool3, AuthUserDto authUserDto, List<String> list, AuthSignupFieldsValuesDto authSignupFieldsValuesDto, String str2, String str3, AuthValidateSignupParamsDto authValidateSignupParamsDto, List<String> list2, AuthValidateRegistrationConfirmTextsDto authValidateRegistrationConfirmTextsDto, Boolean bool4, String str4, SuccessDto successDto, Boolean bool5, String str5) {
        this.sid = str;
        this.profileExist = z;
        this.hidePassword = hidePasswordDto;
        this.canSkipPassword = bool;
        this.nextStep = nextStepDto;
        this.showRegistrationConfirm = bool2;
        this.showWithoutPasswordRedesign = bool3;
        this.profile = authUserDto;
        this.signupFields = list;
        this.signupFieldsValues = authSignupFieldsValuesDto;
        this.signupRestrictedSubject = str2;
        this.signupRestrictedReason = str3;
        this.signupParams = authValidateSignupParamsDto;
        this.signupSuggestedFields = list2;
        this.registrationConfirmText = authValidateRegistrationConfirmTextsDto;
        this.isShowRegistrationNewAboutMe = bool4;
        this.hash = str4;
        this.success = successDto;
        this.showQrCode = bool5;
        this.authHash = str5;
    }

    public final String B() {
        return this.signupRestrictedSubject;
    }

    public final List<String> C() {
        return this.signupSuggestedFields;
    }

    public final String d() {
        return this.authHash;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.canSkipPassword;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthValidatePhoneConfirmResponseDto)) {
            return false;
        }
        AuthValidatePhoneConfirmResponseDto authValidatePhoneConfirmResponseDto = (AuthValidatePhoneConfirmResponseDto) obj;
        return epx.f(this.sid, authValidatePhoneConfirmResponseDto.sid) && this.profileExist == authValidatePhoneConfirmResponseDto.profileExist && this.hidePassword == authValidatePhoneConfirmResponseDto.hidePassword && epx.f(this.canSkipPassword, authValidatePhoneConfirmResponseDto.canSkipPassword) && this.nextStep == authValidatePhoneConfirmResponseDto.nextStep && epx.f(this.showRegistrationConfirm, authValidatePhoneConfirmResponseDto.showRegistrationConfirm) && epx.f(this.showWithoutPasswordRedesign, authValidatePhoneConfirmResponseDto.showWithoutPasswordRedesign) && epx.f(this.profile, authValidatePhoneConfirmResponseDto.profile) && epx.f(this.signupFields, authValidatePhoneConfirmResponseDto.signupFields) && epx.f(this.signupFieldsValues, authValidatePhoneConfirmResponseDto.signupFieldsValues) && epx.f(this.signupRestrictedSubject, authValidatePhoneConfirmResponseDto.signupRestrictedSubject) && epx.f(this.signupRestrictedReason, authValidatePhoneConfirmResponseDto.signupRestrictedReason) && epx.f(this.signupParams, authValidatePhoneConfirmResponseDto.signupParams) && epx.f(this.signupSuggestedFields, authValidatePhoneConfirmResponseDto.signupSuggestedFields) && epx.f(this.registrationConfirmText, authValidatePhoneConfirmResponseDto.registrationConfirmText) && epx.f(this.isShowRegistrationNewAboutMe, authValidatePhoneConfirmResponseDto.isShowRegistrationNewAboutMe) && epx.f(this.hash, authValidatePhoneConfirmResponseDto.hash) && this.success == authValidatePhoneConfirmResponseDto.success && epx.f(this.showQrCode, authValidatePhoneConfirmResponseDto.showQrCode) && epx.f(this.authHash, authValidatePhoneConfirmResponseDto.authHash);
    }

    public final HidePasswordDto f() {
        return this.hidePassword;
    }

    public final NextStepDto g() {
        return this.nextStep;
    }

    public final int hashCode() {
        int b = qoy.b(this.sid.hashCode() * 31, 31, this.profileExist);
        HidePasswordDto hidePasswordDto = this.hidePassword;
        int hashCode = (b + (hidePasswordDto == null ? 0 : hidePasswordDto.hashCode())) * 31;
        Boolean bool = this.canSkipPassword;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        NextStepDto nextStepDto = this.nextStep;
        int hashCode3 = (hashCode2 + (nextStepDto == null ? 0 : nextStepDto.hashCode())) * 31;
        Boolean bool2 = this.showRegistrationConfirm;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.showWithoutPasswordRedesign;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        AuthUserDto authUserDto = this.profile;
        int hashCode6 = (hashCode5 + (authUserDto == null ? 0 : authUserDto.hashCode())) * 31;
        List<String> list = this.signupFields;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        AuthSignupFieldsValuesDto authSignupFieldsValuesDto = this.signupFieldsValues;
        int hashCode8 = (hashCode7 + (authSignupFieldsValuesDto == null ? 0 : authSignupFieldsValuesDto.hashCode())) * 31;
        String str = this.signupRestrictedSubject;
        int hashCode9 = (hashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.signupRestrictedReason;
        int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AuthValidateSignupParamsDto authValidateSignupParamsDto = this.signupParams;
        int hashCode11 = (hashCode10 + (authValidateSignupParamsDto == null ? 0 : authValidateSignupParamsDto.hashCode())) * 31;
        List<String> list2 = this.signupSuggestedFields;
        int hashCode12 = (hashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        AuthValidateRegistrationConfirmTextsDto authValidateRegistrationConfirmTextsDto = this.registrationConfirmText;
        int hashCode13 = (hashCode12 + (authValidateRegistrationConfirmTextsDto == null ? 0 : authValidateRegistrationConfirmTextsDto.hashCode())) * 31;
        Boolean bool4 = this.isShowRegistrationNewAboutMe;
        int hashCode14 = (hashCode13 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str3 = this.hash;
        int hashCode15 = (hashCode14 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SuccessDto successDto = this.success;
        int hashCode16 = (hashCode15 + (successDto == null ? 0 : successDto.hashCode())) * 31;
        Boolean bool5 = this.showQrCode;
        int hashCode17 = (hashCode16 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str4 = this.authHash;
        return hashCode17 + (str4 != null ? str4.hashCode() : 0);
    }

    public final AuthUserDto i() {
        return this.profile;
    }

    public final AuthValidateRegistrationConfirmTextsDto j() {
        return this.registrationConfirmText;
    }

    public final Boolean k() {
        return this.showRegistrationConfirm;
    }

    public final String l() {
        return this.sid;
    }

    public final List<String> n() {
        return this.signupFields;
    }

    public final AuthSignupFieldsValuesDto o() {
        return this.signupFieldsValues;
    }

    public final AuthValidateSignupParamsDto p() {
        return this.signupParams;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthValidatePhoneConfirmResponseDto(sid=");
        sb.append(this.sid);
        sb.append(", profileExist=");
        sb.append(this.profileExist);
        sb.append(", hidePassword=");
        sb.append(this.hidePassword);
        sb.append(", canSkipPassword=");
        sb.append(this.canSkipPassword);
        sb.append(", nextStep=");
        sb.append(this.nextStep);
        sb.append(", showRegistrationConfirm=");
        sb.append(this.showRegistrationConfirm);
        sb.append(", showWithoutPasswordRedesign=");
        sb.append(this.showWithoutPasswordRedesign);
        sb.append(", profile=");
        sb.append(this.profile);
        sb.append(", signupFields=");
        sb.append(this.signupFields);
        sb.append(", signupFieldsValues=");
        sb.append(this.signupFieldsValues);
        sb.append(", signupRestrictedSubject=");
        sb.append(this.signupRestrictedSubject);
        sb.append(", signupRestrictedReason=");
        sb.append(this.signupRestrictedReason);
        sb.append(", signupParams=");
        sb.append(this.signupParams);
        sb.append(", signupSuggestedFields=");
        sb.append(this.signupSuggestedFields);
        sb.append(", registrationConfirmText=");
        sb.append(this.registrationConfirmText);
        sb.append(", isShowRegistrationNewAboutMe=");
        sb.append(this.isShowRegistrationNewAboutMe);
        sb.append(", hash=");
        sb.append(this.hash);
        sb.append(", success=");
        sb.append(this.success);
        sb.append(", showQrCode=");
        sb.append(this.showQrCode);
        sb.append(", authHash=");
        return ho8.a(sb, this.authHash, ')');
    }

    public final String u() {
        return this.signupRestrictedReason;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sid);
        parcel.writeInt(this.profileExist ? 1 : 0);
        HidePasswordDto hidePasswordDto = this.hidePassword;
        if (hidePasswordDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hidePasswordDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.canSkipPassword;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        NextStepDto nextStepDto = this.nextStep;
        if (nextStepDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nextStepDto.writeToParcel(parcel, i);
        }
        Boolean bool2 = this.showRegistrationConfirm;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.showWithoutPasswordRedesign;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        AuthUserDto authUserDto = this.profile;
        if (authUserDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authUserDto.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.signupFields);
        AuthSignupFieldsValuesDto authSignupFieldsValuesDto = this.signupFieldsValues;
        if (authSignupFieldsValuesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authSignupFieldsValuesDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.signupRestrictedSubject);
        parcel.writeString(this.signupRestrictedReason);
        AuthValidateSignupParamsDto authValidateSignupParamsDto = this.signupParams;
        if (authValidateSignupParamsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authValidateSignupParamsDto.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.signupSuggestedFields);
        AuthValidateRegistrationConfirmTextsDto authValidateRegistrationConfirmTextsDto = this.registrationConfirmText;
        if (authValidateRegistrationConfirmTextsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authValidateRegistrationConfirmTextsDto.writeToParcel(parcel, i);
        }
        Boolean bool4 = this.isShowRegistrationNewAboutMe;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        parcel.writeString(this.hash);
        SuccessDto successDto = this.success;
        if (successDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            successDto.writeToParcel(parcel, i);
        }
        Boolean bool5 = this.showQrCode;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        parcel.writeString(this.authHash);
    }

    public /* synthetic */ AuthValidatePhoneConfirmResponseDto(String str, boolean z, HidePasswordDto hidePasswordDto, Boolean bool, NextStepDto nextStepDto, Boolean bool2, Boolean bool3, AuthUserDto authUserDto, List list, AuthSignupFieldsValuesDto authSignupFieldsValuesDto, String str2, String str3, AuthValidateSignupParamsDto authValidateSignupParamsDto, List list2, AuthValidateRegistrationConfirmTextsDto authValidateRegistrationConfirmTextsDto, Boolean bool4, String str4, SuccessDto successDto, Boolean bool5, String str5, int i, zcl zclVar) {
        this(str, z, (i & 4) != 0 ? null : hidePasswordDto, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : nextStepDto, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : bool3, (i & 128) != 0 ? null : authUserDto, (i & 256) != 0 ? null : list, (i & 512) != 0 ? null : authSignupFieldsValuesDto, (i & 1024) != 0 ? null : str2, (i & 2048) != 0 ? null : str3, (i & 4096) != 0 ? null : authValidateSignupParamsDto, (i & 8192) != 0 ? null : list2, (i & 16384) != 0 ? null : authValidateRegistrationConfirmTextsDto, (32768 & i) != 0 ? null : bool4, (65536 & i) != 0 ? null : str4, (131072 & i) != 0 ? null : successDto, (262144 & i) != 0 ? null : bool5, (i & 524288) != 0 ? null : str5);
    }
}
