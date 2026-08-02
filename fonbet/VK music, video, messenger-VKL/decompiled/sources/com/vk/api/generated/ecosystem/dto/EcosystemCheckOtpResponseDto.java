package com.vk.api.generated.ecosystem.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.coremedia.iso.boxes.AuthorBox;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.O6;
import com.vk.api.generated.auth.dto.AuthSignupFieldsValuesDto;
import com.vk.api.generated.auth.dto.AuthUserDto;
import com.vk.api.generated.auth.dto.AuthValidateRegistrationConfirmTextsDto;
import com.vk.api.generated.auth.dto.AuthValidateSignupParamsDto;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.qoy;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: EcosystemCheckOtpResponseDto.kt */
/* loaded from: classes14.dex */
public final class EcosystemCheckOtpResponseDto implements Parcelable {
    public static final Parcelable.Creator<EcosystemCheckOtpResponseDto> CREATOR = new a();

    @pmi0("auth_hash")
    private final String authHash;

    @pmi0("can_skip_password")
    private final Boolean canSkipPassword;

    @pmi0("next_step")
    private final NextStepDto nextStep;

    @pmi0("phone")
    private final String phone;

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

    @pmi0(O6.e1)
    private final String sid;

    @pmi0("signup_fields")
    private final List<String> signupFields;

    @pmi0("signup_fields_values")
    private final AuthSignupFieldsValuesDto signupFieldsValues;

    @pmi0("signup_params")
    private final AuthValidateSignupParamsDto signupParams;

    @pmi0("signup_restriction_reason")
    private final String signupRestrictionReason;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EcosystemCheckOtpResponseDto.kt */
    public static final class NextStepDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NextStepDto[] $VALUES;

        @pmi0(AuthorBox.TYPE)
        public static final NextStepDto AUTH;
        public static final Parcelable.Creator<NextStepDto> CREATOR;

        @pmi0("on_success_validation")
        public static final NextStepDto ON_SUCCESS_VALIDATION;

        @pmi0("registration")
        public static final NextStepDto REGISTRATION;

        @pmi0("show_without_password")
        public static final NextStepDto SHOW_WITHOUT_PASSWORD;

        @pmi0("show_with_password")
        public static final NextStepDto SHOW_WITH_PASSWORD;

        @pmi0("silent_registration")
        public static final NextStepDto SILENT_REGISTRATION;
        private final String value;

        /* compiled from: EcosystemCheckOtpResponseDto.kt */
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
            NextStepDto nextStepDto6 = new NextStepDto("ON_SUCCESS_VALIDATION", 5, "on_success_validation");
            ON_SUCCESS_VALIDATION = nextStepDto6;
            NextStepDto[] nextStepDtoArr = {nextStepDto, nextStepDto2, nextStepDto3, nextStepDto4, nextStepDto5, nextStepDto6};
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

    /* compiled from: EcosystemCheckOtpResponseDto.kt */
    public static final class a implements Parcelable.Creator<EcosystemCheckOtpResponseDto> {
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 com.vk.api.generated.ecosystem.dto.EcosystemCheckOtpResponseDto, still in use, count: 2, list:
              (r1v0 com.vk.api.generated.ecosystem.dto.EcosystemCheckOtpResponseDto) from 0x0014: MOVE (r3v1 com.vk.api.generated.ecosystem.dto.EcosystemCheckOtpResponseDto) = (r1v0 com.vk.api.generated.ecosystem.dto.EcosystemCheckOtpResponseDto) (LINE:21)
              (r1v0 com.vk.api.generated.ecosystem.dto.EcosystemCheckOtpResponseDto) from 0x0011: MOVE (r3v4 com.vk.api.generated.ecosystem.dto.EcosystemCheckOtpResponseDto) = (r1v0 com.vk.api.generated.ecosystem.dto.EcosystemCheckOtpResponseDto) (LINE:18)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
            	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // android.os.Parcelable.Creator
        public final com.vk.api.generated.ecosystem.dto.EcosystemCheckOtpResponseDto createFromParcel(android.os.Parcel r19) {
            /*
                r18 = this;
                r0 = r19
                com.vk.api.generated.ecosystem.dto.EcosystemCheckOtpResponseDto r1 = new com.vk.api.generated.ecosystem.dto.EcosystemCheckOtpResponseDto
                r2 = r1
                java.lang.String r1 = r0.readString()
                int r3 = r0.readInt()
                r4 = 0
                r5 = 1
                if (r3 == 0) goto L14
                r3 = r2
                r2 = r5
                goto L16
            L14:
                r3 = r2
                r2 = r4
            L16:
                int r6 = r0.readInt()
                r7 = 0
                if (r6 != 0) goto L1f
                r6 = r7
                goto L25
            L1f:
                android.os.Parcelable$Creator<com.vk.api.generated.auth.dto.AuthUserDto> r6 = com.vk.api.generated.auth.dto.AuthUserDto.CREATOR
                java.lang.Object r6 = r6.createFromParcel(r0)
            L25:
                com.vk.api.generated.auth.dto.AuthUserDto r6 = (com.vk.api.generated.auth.dto.AuthUserDto) r6
                int r8 = r0.readInt()
                if (r8 != 0) goto L2f
                r8 = r7
                goto L3c
            L2f:
                int r8 = r0.readInt()
                if (r8 == 0) goto L37
                r8 = r5
                goto L38
            L37:
                r8 = r4
            L38:
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            L3c:
                int r9 = r0.readInt()
                if (r9 != 0) goto L44
                r9 = r7
                goto L4a
            L44:
                android.os.Parcelable$Creator<com.vk.api.generated.ecosystem.dto.EcosystemCheckOtpResponseDto$NextStepDto> r9 = com.vk.api.generated.ecosystem.dto.EcosystemCheckOtpResponseDto.NextStepDto.CREATOR
                java.lang.Object r9 = r9.createFromParcel(r0)
            L4a:
                com.vk.api.generated.ecosystem.dto.EcosystemCheckOtpResponseDto$NextStepDto r9 = (com.vk.api.generated.ecosystem.dto.EcosystemCheckOtpResponseDto.NextStepDto) r9
                int r10 = r0.readInt()
                if (r10 != 0) goto L55
                r10 = r7
                r11 = r10
                goto L63
            L55:
                int r10 = r0.readInt()
                if (r10 == 0) goto L5d
                r10 = r5
                goto L5e
            L5d:
                r10 = r4
            L5e:
                java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
                r11 = r7
            L63:
                java.lang.String r7 = r0.readString()
                r12 = r4
                r4 = r8
                java.util.ArrayList r8 = r0.createStringArrayList()
                int r13 = r0.readInt()
                if (r13 != 0) goto L75
                r13 = r11
                goto L7b
            L75:
                android.os.Parcelable$Creator<com.vk.api.generated.auth.dto.AuthSignupFieldsValuesDto> r13 = com.vk.api.generated.auth.dto.AuthSignupFieldsValuesDto.CREATOR
                java.lang.Object r13 = r13.createFromParcel(r0)
            L7b:
                com.vk.api.generated.auth.dto.AuthSignupFieldsValuesDto r13 = (com.vk.api.generated.auth.dto.AuthSignupFieldsValuesDto) r13
                int r14 = r0.readInt()
                if (r14 != 0) goto L85
                r14 = r11
                goto L8b
            L85:
                android.os.Parcelable$Creator<com.vk.api.generated.auth.dto.AuthValidateSignupParamsDto> r14 = com.vk.api.generated.auth.dto.AuthValidateSignupParamsDto.CREATOR
                java.lang.Object r14 = r14.createFromParcel(r0)
            L8b:
                com.vk.api.generated.auth.dto.AuthValidateSignupParamsDto r14 = (com.vk.api.generated.auth.dto.AuthValidateSignupParamsDto) r14
                int r15 = r0.readInt()
                if (r15 != 0) goto L95
                r15 = r11
                goto L9b
            L95:
                android.os.Parcelable$Creator<com.vk.api.generated.auth.dto.AuthValidateRegistrationConfirmTextsDto> r15 = com.vk.api.generated.auth.dto.AuthValidateRegistrationConfirmTextsDto.CREATOR
                java.lang.Object r15 = r15.createFromParcel(r0)
            L9b:
                com.vk.api.generated.auth.dto.AuthValidateRegistrationConfirmTextsDto r15 = (com.vk.api.generated.auth.dto.AuthValidateRegistrationConfirmTextsDto) r15
                r16 = r12
                java.lang.String r12 = r0.readString()
                int r17 = r0.readInt()
                if (r17 != 0) goto Lab
                r5 = r11
                goto Lb7
            Lab:
                int r11 = r0.readInt()
                if (r11 == 0) goto Lb3
                r16 = r5
            Lb3:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r16)
            Lb7:
                java.lang.String r0 = r0.readString()
                r11 = r14
                r14 = r0
                r0 = r3
                r3 = r6
                r6 = r10
                r10 = r11
                r11 = r13
                r13 = r5
                r5 = r9
                r9 = r11
                r11 = r15
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vk.api.generated.ecosystem.dto.EcosystemCheckOtpResponseDto.a.createFromParcel(android.os.Parcel):java.lang.Object");
        }

        @Override // android.os.Parcelable.Creator
        public final EcosystemCheckOtpResponseDto[] newArray(int i) {
            return new EcosystemCheckOtpResponseDto[i];
        }
    }

    public EcosystemCheckOtpResponseDto(String str, boolean z, AuthUserDto authUserDto, Boolean bool, NextStepDto nextStepDto, Boolean bool2, String str2, List<String> list, AuthSignupFieldsValuesDto authSignupFieldsValuesDto, AuthValidateSignupParamsDto authValidateSignupParamsDto, AuthValidateRegistrationConfirmTextsDto authValidateRegistrationConfirmTextsDto, String str3, Boolean bool3, String str4) {
        this.sid = str;
        this.profileExist = z;
        this.profile = authUserDto;
        this.canSkipPassword = bool;
        this.nextStep = nextStepDto;
        this.showRegistrationConfirm = bool2;
        this.signupRestrictionReason = str2;
        this.signupFields = list;
        this.signupFieldsValues = authSignupFieldsValuesDto;
        this.signupParams = authValidateSignupParamsDto;
        this.registrationConfirmText = authValidateRegistrationConfirmTextsDto;
        this.authHash = str3;
        this.showQrCode = bool3;
        this.phone = str4;
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
        if (!(obj instanceof EcosystemCheckOtpResponseDto)) {
            return false;
        }
        EcosystemCheckOtpResponseDto ecosystemCheckOtpResponseDto = (EcosystemCheckOtpResponseDto) obj;
        return epx.f(this.sid, ecosystemCheckOtpResponseDto.sid) && this.profileExist == ecosystemCheckOtpResponseDto.profileExist && epx.f(this.profile, ecosystemCheckOtpResponseDto.profile) && epx.f(this.canSkipPassword, ecosystemCheckOtpResponseDto.canSkipPassword) && this.nextStep == ecosystemCheckOtpResponseDto.nextStep && epx.f(this.showRegistrationConfirm, ecosystemCheckOtpResponseDto.showRegistrationConfirm) && epx.f(this.signupRestrictionReason, ecosystemCheckOtpResponseDto.signupRestrictionReason) && epx.f(this.signupFields, ecosystemCheckOtpResponseDto.signupFields) && epx.f(this.signupFieldsValues, ecosystemCheckOtpResponseDto.signupFieldsValues) && epx.f(this.signupParams, ecosystemCheckOtpResponseDto.signupParams) && epx.f(this.registrationConfirmText, ecosystemCheckOtpResponseDto.registrationConfirmText) && epx.f(this.authHash, ecosystemCheckOtpResponseDto.authHash) && epx.f(this.showQrCode, ecosystemCheckOtpResponseDto.showQrCode) && epx.f(this.phone, ecosystemCheckOtpResponseDto.phone);
    }

    public final NextStepDto f() {
        return this.nextStep;
    }

    public final AuthUserDto g() {
        return this.profile;
    }

    public final int hashCode() {
        int b = qoy.b(this.sid.hashCode() * 31, 31, this.profileExist);
        AuthUserDto authUserDto = this.profile;
        int hashCode = (b + (authUserDto == null ? 0 : authUserDto.hashCode())) * 31;
        Boolean bool = this.canSkipPassword;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        NextStepDto nextStepDto = this.nextStep;
        int hashCode3 = (hashCode2 + (nextStepDto == null ? 0 : nextStepDto.hashCode())) * 31;
        Boolean bool2 = this.showRegistrationConfirm;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.signupRestrictionReason;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.signupFields;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        AuthSignupFieldsValuesDto authSignupFieldsValuesDto = this.signupFieldsValues;
        int hashCode7 = (hashCode6 + (authSignupFieldsValuesDto == null ? 0 : authSignupFieldsValuesDto.hashCode())) * 31;
        AuthValidateSignupParamsDto authValidateSignupParamsDto = this.signupParams;
        int hashCode8 = (hashCode7 + (authValidateSignupParamsDto == null ? 0 : authValidateSignupParamsDto.hashCode())) * 31;
        AuthValidateRegistrationConfirmTextsDto authValidateRegistrationConfirmTextsDto = this.registrationConfirmText;
        int hashCode9 = (hashCode8 + (authValidateRegistrationConfirmTextsDto == null ? 0 : authValidateRegistrationConfirmTextsDto.hashCode())) * 31;
        String str2 = this.authHash;
        int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool3 = this.showQrCode;
        int hashCode11 = (hashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str3 = this.phone;
        return hashCode11 + (str3 != null ? str3.hashCode() : 0);
    }

    public final AuthValidateRegistrationConfirmTextsDto i() {
        return this.registrationConfirmText;
    }

    public final Boolean j() {
        return this.showRegistrationConfirm;
    }

    public final String k() {
        return this.sid;
    }

    public final List<String> l() {
        return this.signupFields;
    }

    public final AuthValidateSignupParamsDto n() {
        return this.signupParams;
    }

    public final String o() {
        return this.signupRestrictionReason;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EcosystemCheckOtpResponseDto(sid=");
        sb.append(this.sid);
        sb.append(", profileExist=");
        sb.append(this.profileExist);
        sb.append(", profile=");
        sb.append(this.profile);
        sb.append(", canSkipPassword=");
        sb.append(this.canSkipPassword);
        sb.append(", nextStep=");
        sb.append(this.nextStep);
        sb.append(", showRegistrationConfirm=");
        sb.append(this.showRegistrationConfirm);
        sb.append(", signupRestrictionReason=");
        sb.append(this.signupRestrictionReason);
        sb.append(", signupFields=");
        sb.append(this.signupFields);
        sb.append(", signupFieldsValues=");
        sb.append(this.signupFieldsValues);
        sb.append(", signupParams=");
        sb.append(this.signupParams);
        sb.append(", registrationConfirmText=");
        sb.append(this.registrationConfirmText);
        sb.append(", authHash=");
        sb.append(this.authHash);
        sb.append(", showQrCode=");
        sb.append(this.showQrCode);
        sb.append(", phone=");
        return ho8.a(sb, this.phone, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sid);
        parcel.writeInt(this.profileExist ? 1 : 0);
        AuthUserDto authUserDto = this.profile;
        if (authUserDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authUserDto.writeToParcel(parcel, i);
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
        parcel.writeString(this.signupRestrictionReason);
        parcel.writeStringList(this.signupFields);
        AuthSignupFieldsValuesDto authSignupFieldsValuesDto = this.signupFieldsValues;
        if (authSignupFieldsValuesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authSignupFieldsValuesDto.writeToParcel(parcel, i);
        }
        AuthValidateSignupParamsDto authValidateSignupParamsDto = this.signupParams;
        if (authValidateSignupParamsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authValidateSignupParamsDto.writeToParcel(parcel, i);
        }
        AuthValidateRegistrationConfirmTextsDto authValidateRegistrationConfirmTextsDto = this.registrationConfirmText;
        if (authValidateRegistrationConfirmTextsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authValidateRegistrationConfirmTextsDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.authHash);
        Boolean bool3 = this.showQrCode;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        parcel.writeString(this.phone);
    }

    public /* synthetic */ EcosystemCheckOtpResponseDto(String str, boolean z, AuthUserDto authUserDto, Boolean bool, NextStepDto nextStepDto, Boolean bool2, String str2, List list, AuthSignupFieldsValuesDto authSignupFieldsValuesDto, AuthValidateSignupParamsDto authValidateSignupParamsDto, AuthValidateRegistrationConfirmTextsDto authValidateRegistrationConfirmTextsDto, String str3, Boolean bool3, String str4, int i, zcl zclVar) {
        this(str, z, (i & 4) != 0 ? null : authUserDto, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : nextStepDto, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : authSignupFieldsValuesDto, (i & 512) != 0 ? null : authValidateSignupParamsDto, (i & 1024) != 0 ? null : authValidateRegistrationConfirmTextsDto, (i & 2048) != 0 ? null : str3, (i & 4096) != 0 ? null : bool3, (i & 8192) != 0 ? null : str4);
    }
}
