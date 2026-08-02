package com.vk.superapp.api.dto.auth.validateaccount;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.superapp.api.dto.auth.LibverifyValidationType;
import defpackage.q0;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import xsna.asp;
import xsna.dn;
import xsna.e43;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.qoy;
import xsna.uqi;
import xsna.zrp;

/* compiled from: VkAuthValidateAccountResponse.kt */
/* loaded from: classes6.dex */
public final class VkAuthValidateAccountResponse {
    public final boolean a;
    public final boolean b;
    public final List<ValidateAccountFlow> c;
    public final String d;
    public final String e;
    public final NextStep f;
    public final FlowName g;
    public final String h;
    public final Integer i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkAuthValidateAccountResponse.kt */
    public static final class FlowName {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FlowName[] $VALUES;
        public static final a Companion;
        public static final FlowName NEED_AUTH;
        public static final FlowName NEED_EXCHANGE_TOKEN;
        public static final FlowName NEED_LOGIN_VALIDATION;
        public static final FlowName NEED_PASSKEY;
        public static final FlowName NEED_PASSKEY_OTP;
        public static final FlowName NEED_PASSWORD;
        public static final FlowName NEED_PASSWORD_AND_VALIDATION;
        public static final FlowName NEED_REGISTRATION;
        public static final FlowName NEED_VALIDATION;
        public static final FlowName NEED_WEBAUTHN;
        public static final FlowName RESTORE;
        private final String value;

        /* compiled from: VkAuthValidateAccountResponse.kt */
        public static final class a {
        }

        static {
            FlowName flowName = new FlowName("NEED_PASSWORD_AND_VALIDATION", 0, "need_password_and_validation");
            NEED_PASSWORD_AND_VALIDATION = flowName;
            FlowName flowName2 = new FlowName("NEED_VALIDATION", 1, "need_validation");
            NEED_VALIDATION = flowName2;
            FlowName flowName3 = new FlowName("NEED_PASSWORD", 2, "need_password");
            NEED_PASSWORD = flowName3;
            FlowName flowName4 = new FlowName("NEED_REGISTRATION", 3, "need_registration");
            NEED_REGISTRATION = flowName4;
            FlowName flowName5 = new FlowName("NEED_LOGIN_VALIDATION", 4, "need_login_validation");
            NEED_LOGIN_VALIDATION = flowName5;
            FlowName flowName6 = new FlowName("NEED_PASSKEY", 5, "need_passkey");
            NEED_PASSKEY = flowName6;
            FlowName flowName7 = new FlowName("NEED_PASSKEY_OTP", 6, "need_passkey_otp");
            NEED_PASSKEY_OTP = flowName7;
            FlowName flowName8 = new FlowName("NEED_WEBAUTHN", 7, "need_webauthn");
            NEED_WEBAUTHN = flowName8;
            FlowName flowName9 = new FlowName("NEED_AUTH", 8, "need_auth");
            NEED_AUTH = flowName9;
            FlowName flowName10 = new FlowName("NEED_EXCHANGE_TOKEN", 9, "need_exchange_token");
            NEED_EXCHANGE_TOKEN = flowName10;
            FlowName flowName11 = new FlowName("RESTORE", 10, "need_restore");
            RESTORE = flowName11;
            FlowName[] flowNameArr = {flowName, flowName2, flowName3, flowName4, flowName5, flowName6, flowName7, flowName8, flowName9, flowName10, flowName11};
            $VALUES = flowNameArr;
            $ENTRIES = new asp(flowNameArr);
            Companion = new a();
        }

        public FlowName(String str, int i, String str2) {
            this.value = str2;
        }

        public static FlowName valueOf(String str) {
            return (FlowName) Enum.valueOf(FlowName.class, str);
        }

        public static FlowName[] values() {
            return (FlowName[]) $VALUES.clone();
        }

        public final String h() {
            return this.value;
        }
    }

    /* compiled from: VkAuthValidateAccountResponse.kt */
    public static final class NextStep implements Parcelable {
        public static final Parcelable.Creator<NextStep> CREATOR = new a();
        public final VerificationMethod b;
        public final boolean c;
        public final String d;
        public final FactorsNumber e;
        public final List<LibverifyValidationType> f;
        public final MaxOptions g;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VkAuthValidateAccountResponse.kt */
        public static final class FactorsNumber {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ FactorsNumber[] $VALUES;
            public static final a Companion;
            public static final FactorsNumber ONE_FA;
            public static final FactorsNumber TWO_FA;
            private final int value;

            /* compiled from: VkAuthValidateAccountResponse.kt */
            public static final class a {
            }

            static {
                FactorsNumber factorsNumber = new FactorsNumber("ONE_FA", 0, 1);
                ONE_FA = factorsNumber;
                FactorsNumber factorsNumber2 = new FactorsNumber("TWO_FA", 1, 2);
                TWO_FA = factorsNumber2;
                FactorsNumber[] factorsNumberArr = {factorsNumber, factorsNumber2};
                $VALUES = factorsNumberArr;
                $ENTRIES = new asp(factorsNumberArr);
                Companion = new a();
            }

            public FactorsNumber(String str, int i, int i2) {
                this.value = i2;
            }

            public static FactorsNumber valueOf(String str) {
                return (FactorsNumber) Enum.valueOf(FactorsNumber.class, str);
            }

            public static FactorsNumber[] values() {
                return (FactorsNumber[]) $VALUES.clone();
            }

            public final int h() {
                return this.value;
            }
        }

        /* compiled from: VkAuthValidateAccountResponse.kt */
        public static final class MaxOptions implements Parcelable {
            public static final Parcelable.Creator<MaxOptions> CREATOR = new a();
            public final Long b;
            public final Integer c;
            public final boolean d;

            /* compiled from: VkAuthValidateAccountResponse.kt */
            public static final class a implements Parcelable.Creator<MaxOptions> {
                @Override // android.os.Parcelable.Creator
                public final MaxOptions createFromParcel(Parcel parcel) {
                    return new MaxOptions(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final MaxOptions[] newArray(int i) {
                    return new MaxOptions[i];
                }
            }

            public MaxOptions(Long l, Integer num, boolean z) {
                this.b = l;
                this.c = num;
                this.d = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MaxOptions)) {
                    return false;
                }
                MaxOptions maxOptions = (MaxOptions) obj;
                return epx.f(this.b, maxOptions.b) && epx.f(this.c, maxOptions.c) && this.d == maxOptions.d;
            }

            public final int hashCode() {
                Long l = this.b;
                int hashCode = (l == null ? 0 : l.hashCode()) * 31;
                Integer num = this.c;
                return Boolean.hashCode(this.d) + ((hashCode + (num != null ? num.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("MaxOptions(timeout=");
                sb.append(this.b);
                sb.append(", experimentGroup=");
                sb.append(this.c);
                sb.append(", showOpenMaxButton=");
                return q0.a(sb, this.d, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                Long l = this.b;
                if (l == null) {
                    parcel.writeInt(0);
                } else {
                    b.f(parcel, 1, l);
                }
                Integer num = this.c;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    nr.a(parcel, 1, num);
                }
                parcel.writeInt(this.d ? 1 : 0);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VkAuthValidateAccountResponse.kt */
        public static final class VerificationMethod {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ VerificationMethod[] $VALUES;
            public static final VerificationMethod BLOCKED_WITHOUT_PHONE;
            public static final VerificationMethod CALLRESET;
            public static final VerificationMethod CODEGEN;
            public static final VerificationMethod CONNECT_INTERNAL;
            public static final a Companion;
            public static final VerificationMethod EMAIL;
            public static final VerificationMethod LIBVERIFY;
            public static final VerificationMethod MAX_MESSENGER;
            public static final VerificationMethod MAX_OTP;
            public static final VerificationMethod OFFICIAL_MESSENGER;
            public static final VerificationMethod PASSKEY;
            public static final VerificationMethod PASSWORD;
            public static final VerificationMethod PUSH;
            public static final VerificationMethod RESERVE_CODE;
            public static final VerificationMethod SMS;
            public static final VerificationMethod TRUSTED_HASH;
            private final String value;

            /* compiled from: VkAuthValidateAccountResponse.kt */
            public static final class a {
            }

            static {
                VerificationMethod verificationMethod = new VerificationMethod("CALLRESET", 0, "callreset");
                CALLRESET = verificationMethod;
                VerificationMethod verificationMethod2 = new VerificationMethod("CODEGEN", 1, "codegen");
                CODEGEN = verificationMethod2;
                VerificationMethod verificationMethod3 = new VerificationMethod(CommonConstant.RETKEY.EMAIL, 2, "email");
                EMAIL = verificationMethod3;
                VerificationMethod verificationMethod4 = new VerificationMethod("PASSKEY", 3, "passkey");
                PASSKEY = verificationMethod4;
                VerificationMethod verificationMethod5 = new VerificationMethod("PASSWORD", 4, LoginApiConstants.PARAM_NAME_PASSWORD);
                PASSWORD = verificationMethod5;
                VerificationMethod verificationMethod6 = new VerificationMethod("PUSH", 5, "push");
                PUSH = verificationMethod6;
                VerificationMethod verificationMethod7 = new VerificationMethod("RESERVE_CODE", 6, "reserve_code");
                RESERVE_CODE = verificationMethod7;
                VerificationMethod verificationMethod8 = new VerificationMethod("SMS", 7, "sms");
                SMS = verificationMethod8;
                VerificationMethod verificationMethod9 = new VerificationMethod("LIBVERIFY", 8, "libverify");
                LIBVERIFY = verificationMethod9;
                VerificationMethod verificationMethod10 = new VerificationMethod("TRUSTED_HASH", 9, "trusted_hash");
                TRUSTED_HASH = verificationMethod10;
                VerificationMethod verificationMethod11 = new VerificationMethod("MAX_MESSENGER", 10, "max_messenger");
                MAX_MESSENGER = verificationMethod11;
                VerificationMethod verificationMethod12 = new VerificationMethod("OFFICIAL_MESSENGER", 11, "official_messenger");
                OFFICIAL_MESSENGER = verificationMethod12;
                VerificationMethod verificationMethod13 = new VerificationMethod("CONNECT_INTERNAL", 12, "connect_internal");
                CONNECT_INTERNAL = verificationMethod13;
                VerificationMethod verificationMethod14 = new VerificationMethod("MAX_OTP", 13, "max_code");
                MAX_OTP = verificationMethod14;
                VerificationMethod verificationMethod15 = new VerificationMethod("BLOCKED_WITHOUT_PHONE", 14, "blocked_user_without_phone");
                BLOCKED_WITHOUT_PHONE = verificationMethod15;
                VerificationMethod[] verificationMethodArr = {verificationMethod, verificationMethod2, verificationMethod3, verificationMethod4, verificationMethod5, verificationMethod6, verificationMethod7, verificationMethod8, verificationMethod9, verificationMethod10, verificationMethod11, verificationMethod12, verificationMethod13, verificationMethod14, verificationMethod15};
                $VALUES = verificationMethodArr;
                $ENTRIES = new asp(verificationMethodArr);
                Companion = new a();
            }

            public VerificationMethod(String str, int i, String str2) {
                this.value = str2;
            }

            public static VerificationMethod valueOf(String str) {
                return (VerificationMethod) Enum.valueOf(VerificationMethod.class, str);
            }

            public static VerificationMethod[] values() {
                return (VerificationMethod[]) $VALUES.clone();
            }

            public final String h() {
                return this.value;
            }
        }

        /* compiled from: VkAuthValidateAccountResponse.kt */
        public static final class a implements Parcelable.Creator<NextStep> {
            @Override // android.os.Parcelable.Creator
            public final NextStep createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                VerificationMethod valueOf = parcel.readInt() == 0 ? null : VerificationMethod.valueOf(parcel.readString());
                boolean z = parcel.readInt() != 0;
                String readString = parcel.readString();
                FactorsNumber valueOf2 = parcel.readInt() == 0 ? null : FactorsNumber.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    for (int i = 0; i != readInt; i++) {
                        arrayList.add(LibverifyValidationType.valueOf(parcel.readString()));
                    }
                }
                return new NextStep(valueOf, z, readString, valueOf2, arrayList, parcel.readInt() != 0 ? MaxOptions.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final NextStep[] newArray(int i) {
                return new NextStep[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NextStep(VerificationMethod verificationMethod, boolean z, String str, FactorsNumber factorsNumber, List<? extends LibverifyValidationType> list, MaxOptions maxOptions) {
            this.b = verificationMethod;
            this.c = z;
            this.d = str;
            this.e = factorsNumber;
            this.f = list;
            this.g = maxOptions;
        }

        public final List<LibverifyValidationType> d() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NextStep)) {
                return false;
            }
            NextStep nextStep = (NextStep) obj;
            return this.b == nextStep.b && this.c == nextStep.c && epx.f(this.d, nextStep.d) && this.e == nextStep.e && epx.f(this.f, nextStep.f) && epx.f(this.g, nextStep.g);
        }

        public final FactorsNumber f() {
            return this.e;
        }

        public final boolean g() {
            return this.c;
        }

        public final int hashCode() {
            VerificationMethod verificationMethod = this.b;
            int b = qoy.b((verificationMethod == null ? 0 : verificationMethod.hashCode()) * 31, 31, this.c);
            String str = this.d;
            int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
            FactorsNumber factorsNumber = this.e;
            int hashCode2 = (hashCode + (factorsNumber == null ? 0 : factorsNumber.hashCode())) * 31;
            List<LibverifyValidationType> list = this.f;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            MaxOptions maxOptions = this.g;
            return hashCode3 + (maxOptions != null ? maxOptions.hashCode() : 0);
        }

        public final MaxOptions i() {
            return this.g;
        }

        public final VerificationMethod j() {
            return this.b;
        }

        public final String toString() {
            return "NextStep(verificationMethod=" + this.b + ", hasAnotherVerificationMethods=" + this.c + ", externalId=" + this.d + ", factorsNumber=" + this.e + ", availableLibverifyValidationTypes=" + this.f + ", maxOptions=" + this.g + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            VerificationMethod verificationMethod = this.b;
            if (verificationMethod == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(verificationMethod.name());
            }
            parcel.writeInt(this.c ? 1 : 0);
            parcel.writeString(this.d);
            FactorsNumber factorsNumber = this.e;
            if (factorsNumber == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(factorsNumber.name());
            }
            List<LibverifyValidationType> list = this.f;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    parcel.writeString(((LibverifyValidationType) f.next()).name());
                }
            }
            MaxOptions maxOptions = this.g;
            if (maxOptions == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                maxOptions.writeToParcel(parcel, i);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkAuthValidateAccountResponse.kt */
    public static final class ValidateAccountFlow {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ValidateAccountFlow[] $VALUES;
        public static final a Companion;
        public static final ValidateAccountFlow EXCHANGE_TOKEN;
        private static final List<ValidateAccountFlow> NEED_PASSWORD;
        private static final List<ValidateAccountFlow> NEED_PASSWORD_AND_VALIDATION;
        private static final List<ValidateAccountFlow> NEED_REGISTRATION;
        private static final List<ValidateAccountFlow> NEED_VALIDATION;
        public static final ValidateAccountFlow OTP;
        public static final ValidateAccountFlow PASSKEY;
        public static final ValidateAccountFlow PASSWORD;
        public static final ValidateAccountFlow TRUSTED_HASH;
        private final String value;

        /* compiled from: VkAuthValidateAccountResponse.kt */
        public static final class a {
            public static List a() {
                return ValidateAccountFlow.NEED_PASSWORD;
            }

            public static List b() {
                return ValidateAccountFlow.NEED_PASSWORD_AND_VALIDATION;
            }

            public static List c() {
                return ValidateAccountFlow.NEED_REGISTRATION;
            }

            public static List d() {
                return ValidateAccountFlow.NEED_VALIDATION;
            }
        }

        static {
            ValidateAccountFlow validateAccountFlow = new ValidateAccountFlow("PASSKEY", 0, "passkey");
            PASSKEY = validateAccountFlow;
            ValidateAccountFlow validateAccountFlow2 = new ValidateAccountFlow("OTP", 1, "otp");
            OTP = validateAccountFlow2;
            ValidateAccountFlow validateAccountFlow3 = new ValidateAccountFlow("PASSWORD", 2, LoginApiConstants.PARAM_NAME_PASSWORD);
            PASSWORD = validateAccountFlow3;
            ValidateAccountFlow validateAccountFlow4 = new ValidateAccountFlow("TRUSTED_HASH", 3, "trusted_hash");
            TRUSTED_HASH = validateAccountFlow4;
            ValidateAccountFlow validateAccountFlow5 = new ValidateAccountFlow("EXCHANGE_TOKEN", 4, "exchange_token");
            EXCHANGE_TOKEN = validateAccountFlow5;
            ValidateAccountFlow[] validateAccountFlowArr = {validateAccountFlow, validateAccountFlow2, validateAccountFlow3, validateAccountFlow4, validateAccountFlow5};
            $VALUES = validateAccountFlowArr;
            $ENTRIES = new asp(validateAccountFlowArr);
            Companion = new a();
            NEED_PASSWORD_AND_VALIDATION = Collections.singletonList(validateAccountFlow3);
            NEED_VALIDATION = e43.l(validateAccountFlow2, validateAccountFlow3);
            NEED_PASSWORD = e43.l(validateAccountFlow3, validateAccountFlow2);
            NEED_REGISTRATION = Collections.singletonList(validateAccountFlow2);
        }

        public ValidateAccountFlow(String str, int i, String str2) {
            this.value = str2;
        }

        public static ValidateAccountFlow valueOf(String str) {
            return (ValidateAccountFlow) Enum.valueOf(ValidateAccountFlow.class, str);
        }

        public static ValidateAccountFlow[] values() {
            return (ValidateAccountFlow[]) $VALUES.clone();
        }

        public final String l() {
            return this.value;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VkAuthValidateAccountResponse(boolean z, boolean z2, List<? extends ValidateAccountFlow> list, String str, String str2, NextStep nextStep, FlowName flowName, String str3, Integer num) {
        this.a = z;
        this.b = z2;
        this.c = list;
        this.d = str;
        this.e = str2;
        this.f = nextStep;
        this.g = flowName;
        this.h = str3;
        this.i = num;
    }

    public static VkAuthValidateAccountResponse a(VkAuthValidateAccountResponse vkAuthValidateAccountResponse, ArrayList arrayList) {
        boolean z = vkAuthValidateAccountResponse.a;
        boolean z2 = vkAuthValidateAccountResponse.b;
        String str = vkAuthValidateAccountResponse.d;
        String str2 = vkAuthValidateAccountResponse.e;
        FlowName flowName = vkAuthValidateAccountResponse.g;
        Integer num = vkAuthValidateAccountResponse.i;
        vkAuthValidateAccountResponse.getClass();
        return new VkAuthValidateAccountResponse(z, z2, arrayList, str, str2, null, flowName, null, num);
    }

    public final Integer b() {
        return this.i;
    }

    public final List<ValidateAccountFlow> c() {
        return this.c;
    }

    public final NextStep d() {
        return this.f;
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkAuthValidateAccountResponse)) {
            return false;
        }
        VkAuthValidateAccountResponse vkAuthValidateAccountResponse = (VkAuthValidateAccountResponse) obj;
        return this.a == vkAuthValidateAccountResponse.a && this.b == vkAuthValidateAccountResponse.b && epx.f(this.c, vkAuthValidateAccountResponse.c) && epx.f(this.d, vkAuthValidateAccountResponse.d) && epx.f(this.e, vkAuthValidateAccountResponse.e) && epx.f(this.f, vkAuthValidateAccountResponse.f) && this.g == vkAuthValidateAccountResponse.g && epx.f(this.h, vkAuthValidateAccountResponse.h) && epx.f(this.i, vkAuthValidateAccountResponse.i);
    }

    public final String f() {
        return this.h;
    }

    public final boolean g() {
        return this.a;
    }

    public final int hashCode() {
        int a = fw3.a(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        NextStep nextStep = this.f;
        int hashCode3 = (hashCode2 + (nextStep == null ? 0 : nextStep.hashCode())) * 31;
        FlowName flowName = this.g;
        int hashCode4 = (hashCode3 + (flowName == null ? 0 : flowName.hashCode())) * 31;
        String str3 = this.h;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.i;
        return hashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkAuthValidateAccountResponse(isPhone=");
        sb.append(this.a);
        sb.append(", isEmail=");
        sb.append(this.b);
        sb.append(", flows=");
        sb.append(this.c);
        sb.append(", sid=");
        sb.append(this.d);
        sb.append(", login=");
        sb.append(this.e);
        sb.append(", nextStep=");
        sb.append(this.f);
        sb.append(", flowName=");
        sb.append(this.g);
        sb.append(", trustedHash=");
        sb.append(this.h);
        sb.append(", exchangeTokenIndex=");
        return uqi.b(sb, this.i, ')');
    }
}
