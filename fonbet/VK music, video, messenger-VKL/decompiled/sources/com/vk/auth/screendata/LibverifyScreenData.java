package com.vk.auth.screendata;

import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.auth.LibverifyValidationType;
import com.vk.superapp.api.dto.auth.validateaccount.VkAuthValidateAccountResponse;
import com.vk.superapp.api.states.VkAuthState;
import defpackage.q0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: LibverifyScreenData.kt */
/* loaded from: classes15.dex */
public abstract class LibverifyScreenData extends Serializer.StreamParcelableAdapter {
    public final String b;
    public final String c;
    public final String d;
    public final List<LibverifyValidationType> e;
    public final boolean f;
    public final CheckPresenterInfo g;

    /* compiled from: LibverifyScreenData.kt */
    public static final class Auth extends LibverifyScreenData {
        public static final Serializer.c<Auth> CREATOR = new a();
        public final String h;
        public final String i;
        public final String j;
        public final List<LibverifyValidationType> k;
        public final boolean l;
        public final VkAuthState m;
        public final String n;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Auth> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Auth a(Serializer serializer) {
                return new Auth(serializer.H(), serializer.H(), serializer.H(), serializer.E(), serializer.m(), (VkAuthState) serializer.A(VkAuthState.class.getClassLoader()), serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Auth[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Auth(String str, String str2, String str3, List<? extends LibverifyValidationType> list, boolean z, VkAuthState vkAuthState, String str4) {
            super(str, str2, str3, list, z, new CheckPresenterInfo.Auth(vkAuthState), null);
            this.h = str;
            this.i = str2;
            this.j = str3;
            this.k = list;
            this.l = z;
            this.m = vkAuthState;
            this.n = str4;
        }

        @Override // com.vk.auth.screendata.LibverifyScreenData
        public final List<LibverifyValidationType> Ab() {
            return this.k;
        }

        @Override // com.vk.auth.screendata.LibverifyScreenData
        public final boolean Bb() {
            return this.l;
        }

        @Override // com.vk.auth.screendata.LibverifyScreenData
        public final String Cb() {
            return this.h;
        }

        @Override // com.vk.auth.screendata.LibverifyScreenData
        public final String Db() {
            return this.i;
        }

        @Override // com.vk.auth.screendata.LibverifyScreenData, com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            super.O7(serializer);
            serializer.e0(this.m);
            serializer.j0(this.n);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Auth)) {
                return false;
            }
            Auth auth = (Auth) obj;
            return epx.f(this.h, auth.h) && epx.f(this.i, auth.i) && epx.f(this.j, auth.j) && epx.f(this.k, auth.k) && this.l == auth.l && epx.f(this.m, auth.m) && epx.f(this.n, auth.n);
        }

        public final int hashCode() {
            int a2 = urd0.a(this.h.hashCode() * 31, 31, this.i);
            String str = this.j;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            List<LibverifyValidationType> list = this.k;
            return this.n.hashCode() + ((this.m.hashCode() + qoy.b((hashCode + (list != null ? list.hashCode() : 0)) * 31, 31, this.l)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Auth(phone=");
            sb.append(this.h);
            sb.append(", sid=");
            sb.append(this.i);
            sb.append(", externalId=");
            sb.append(this.j);
            sb.append(", libverifyValidationTypes=");
            sb.append(this.k);
            sb.append(", messengersEnabled=");
            sb.append(this.l);
            sb.append(", authState=");
            sb.append(this.m);
            sb.append(", phoneMask=");
            return ho8.a(sb, this.n, ')');
        }

        @Override // com.vk.auth.screendata.LibverifyScreenData
        public final String zb() {
            return this.j;
        }
    }

    /* compiled from: LibverifyScreenData.kt */
    public static final class MethodSelectorAuth extends LibverifyScreenData {
        public static final Serializer.c<MethodSelectorAuth> CREATOR = new a();
        public final VerificationScreenData.Phone h;
        public final String i;
        public final String j;
        public final List<LibverifyValidationType> k;
        public final boolean l;
        public final FactorsNumber m;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: LibverifyScreenData.kt */
        public static final class FactorsNumber {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ FactorsNumber[] $VALUES;
            public static final a Companion;
            public static final FactorsNumber ONE_FA;
            public static final FactorsNumber TWO_FA;
            private final int factors;

            /* compiled from: LibverifyScreenData.kt */
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
                this.factors = i2;
            }

            public static FactorsNumber valueOf(String str) {
                return (FactorsNumber) Enum.valueOf(FactorsNumber.class, str);
            }

            public static FactorsNumber[] values() {
                return (FactorsNumber[]) $VALUES.clone();
            }

            public final int h() {
                return this.factors;
            }
        }

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<MethodSelectorAuth> {
            @Override // com.vk.core.serialize.Serializer.c
            public final MethodSelectorAuth a(Serializer serializer) {
                FactorsNumber factorsNumber;
                VerificationScreenData.Phone phone = (VerificationScreenData.Phone) serializer.A(VerificationScreenData.Phone.class.getClassLoader());
                String H = serializer.H();
                String H2 = serializer.H();
                ArrayList E = serializer.E();
                FactorsNumber.a aVar = FactorsNumber.Companion;
                int u = serializer.u();
                aVar.getClass();
                FactorsNumber[] values = FactorsNumber.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        factorsNumber = null;
                        break;
                    }
                    factorsNumber = values[i];
                    if (u == factorsNumber.h()) {
                        break;
                    }
                    i++;
                }
                return new MethodSelectorAuth(phone, H, H2, E, serializer.m(), factorsNumber);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MethodSelectorAuth[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public MethodSelectorAuth(VerificationScreenData.Phone phone, String str, String str2, List<? extends LibverifyValidationType> list, boolean z, FactorsNumber factorsNumber) {
            super(phone.b, str, str2, list, z, new CheckPresenterInfo.MethodSelectorAuth(phone), null);
            this.h = phone;
            this.i = str;
            this.j = str2;
            this.k = list;
            this.l = z;
            this.m = factorsNumber;
        }

        @Override // com.vk.auth.screendata.LibverifyScreenData
        public final List<LibverifyValidationType> Ab() {
            return this.k;
        }

        @Override // com.vk.auth.screendata.LibverifyScreenData
        public final boolean Bb() {
            return this.l;
        }

        @Override // com.vk.auth.screendata.LibverifyScreenData
        public final String Db() {
            return this.i;
        }

        @Override // com.vk.auth.screendata.LibverifyScreenData, com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.e0(this.h);
            serializer.j0(this.i);
            serializer.j0(this.j);
            serializer.h0(this.k);
            serializer.S(this.m.h());
            serializer.L(this.l ? (byte) 1 : (byte) 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodSelectorAuth)) {
                return false;
            }
            MethodSelectorAuth methodSelectorAuth = (MethodSelectorAuth) obj;
            return epx.f(this.h, methodSelectorAuth.h) && epx.f(this.i, methodSelectorAuth.i) && epx.f(this.j, methodSelectorAuth.j) && epx.f(this.k, methodSelectorAuth.k) && this.l == methodSelectorAuth.l && this.m == methodSelectorAuth.m;
        }

        public final int hashCode() {
            int a2 = urd0.a(this.h.hashCode() * 31, 31, this.i);
            String str = this.j;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            List<LibverifyValidationType> list = this.k;
            return this.m.hashCode() + qoy.b((hashCode + (list != null ? list.hashCode() : 0)) * 31, 31, this.l);
        }

        public final String toString() {
            return "MethodSelectorAuth(phoneVerificationScreenData=" + this.h + ", sid=" + this.i + ", externalId=" + this.j + ", libverifyValidationTypes=" + this.k + ", messengersEnabled=" + this.l + ", factorsNumber=" + this.m + ')';
        }

        @Override // com.vk.auth.screendata.LibverifyScreenData
        public final String zb() {
            return this.j;
        }
    }

    /* compiled from: LibverifyScreenData.kt */
    public static final class PasswordLessAuth extends LibverifyScreenData {
        public static final Serializer.c<PasswordLessAuth> CREATOR = new a();
        public final VerificationScreenData.Phone h;
        public final String i;
        public final String j;
        public final List<LibverifyValidationType> k;
        public final boolean l;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<PasswordLessAuth> {
            @Override // com.vk.core.serialize.Serializer.c
            public final PasswordLessAuth a(Serializer serializer) {
                return new PasswordLessAuth((VerificationScreenData.Phone) serializer.A(VerificationScreenData.Phone.class.getClassLoader()), serializer.H(), serializer.H(), serializer.E(), serializer.m());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PasswordLessAuth[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PasswordLessAuth(VerificationScreenData.Phone phone, String str, String str2, List<? extends LibverifyValidationType> list, boolean z) {
            super(phone.b, str, str2, list, z, new CheckPresenterInfo.PasswordLessAuth(phone, false, 2, null), null);
            this.h = phone;
            this.i = str;
            this.j = str2;
            this.k = list;
            this.l = z;
        }

        @Override // com.vk.auth.screendata.LibverifyScreenData
        public final List<LibverifyValidationType> Ab() {
            return this.k;
        }

        @Override // com.vk.auth.screendata.LibverifyScreenData
        public final boolean Bb() {
            return this.l;
        }

        @Override // com.vk.auth.screendata.LibverifyScreenData
        public final String Db() {
            return this.i;
        }

        @Override // com.vk.auth.screendata.LibverifyScreenData, com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.e0(this.h);
            serializer.j0(this.i);
            serializer.j0(this.j);
            serializer.h0(this.k);
            serializer.L(this.l ? (byte) 1 : (byte) 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasswordLessAuth)) {
                return false;
            }
            PasswordLessAuth passwordLessAuth = (PasswordLessAuth) obj;
            return epx.f(this.h, passwordLessAuth.h) && epx.f(this.i, passwordLessAuth.i) && epx.f(this.j, passwordLessAuth.j) && epx.f(this.k, passwordLessAuth.k) && this.l == passwordLessAuth.l;
        }

        public final int hashCode() {
            int a2 = urd0.a(this.h.hashCode() * 31, 31, this.i);
            String str = this.j;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            List<LibverifyValidationType> list = this.k;
            return Boolean.hashCode(this.l) + ((hashCode + (list != null ? list.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PasswordLessAuth(phoneVerificationScreenData=");
            sb.append(this.h);
            sb.append(", sid=");
            sb.append(this.i);
            sb.append(", externalId=");
            sb.append(this.j);
            sb.append(", libverifyValidationTypes=");
            sb.append(this.k);
            sb.append(", messengersEnabled=");
            return q0.a(sb, this.l, ')');
        }

        @Override // com.vk.auth.screendata.LibverifyScreenData
        public final String zb() {
            return this.j;
        }
    }

    /* compiled from: LibverifyScreenData.kt */
    public static final class SignUp extends LibverifyScreenData {
        public static final Serializer.c<SignUp> CREATOR = new a();
        public final VerificationScreenData.Phone h;
        public final String i;
        public final String j;
        public final List<LibverifyValidationType> k;
        public final boolean l;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<SignUp> {
            @Override // com.vk.core.serialize.Serializer.c
            public final SignUp a(Serializer serializer) {
                return new SignUp((VerificationScreenData.Phone) serializer.A(VerificationScreenData.Phone.class.getClassLoader()), serializer.H(), serializer.H(), serializer.E(), serializer.m());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SignUp[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SignUp(VerificationScreenData.Phone phone, String str, String str2, List<? extends LibverifyValidationType> list, boolean z) {
            super(phone.b, str, str2, list, z, new CheckPresenterInfo.SignUp(phone, null, false, 6, null), null);
            this.h = phone;
            this.i = str;
            this.j = str2;
            this.k = list;
            this.l = z;
        }

        @Override // com.vk.auth.screendata.LibverifyScreenData
        public final List<LibverifyValidationType> Ab() {
            return this.k;
        }

        @Override // com.vk.auth.screendata.LibverifyScreenData
        public final boolean Bb() {
            return this.l;
        }

        @Override // com.vk.auth.screendata.LibverifyScreenData
        public final String Db() {
            return this.i;
        }

        @Override // com.vk.auth.screendata.LibverifyScreenData, com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.e0(this.h);
            serializer.j0(this.i);
            serializer.j0(this.j);
            serializer.h0(this.k);
            serializer.L(this.l ? (byte) 1 : (byte) 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SignUp)) {
                return false;
            }
            SignUp signUp = (SignUp) obj;
            return epx.f(this.h, signUp.h) && epx.f(this.i, signUp.i) && epx.f(this.j, signUp.j) && epx.f(this.k, signUp.k) && this.l == signUp.l;
        }

        public final int hashCode() {
            int a2 = urd0.a(this.h.hashCode() * 31, 31, this.i);
            String str = this.j;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            List<LibverifyValidationType> list = this.k;
            return Boolean.hashCode(this.l) + ((hashCode + (list != null ? list.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SignUp(phoneVerificationScreenData=");
            sb.append(this.h);
            sb.append(", sid=");
            sb.append(this.i);
            sb.append(", externalId=");
            sb.append(this.j);
            sb.append(", libverifyValidationTypes=");
            sb.append(this.k);
            sb.append(", messengersEnabled=");
            return q0.a(sb, this.l, ')');
        }

        @Override // com.vk.auth.screendata.LibverifyScreenData
        public final String zb() {
            return this.j;
        }
    }

    /* compiled from: LibverifyScreenData.kt */
    public static final class a {

        /* compiled from: LibverifyScreenData.kt */
        /* renamed from: com.vk.auth.screendata.LibverifyScreenData$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0413a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[VkAuthValidateAccountResponse.NextStep.FactorsNumber.values().length];
                try {
                    iArr[VkAuthValidateAccountResponse.NextStep.FactorsNumber.ONE_FA.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[VkAuthValidateAccountResponse.NextStep.FactorsNumber.TWO_FA.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static MethodSelectorAuth a(VerificationScreenData.Phone phone, String str, String str2, VkAuthValidateAccountResponse.NextStep.FactorsNumber factorsNumber, List list) {
            int i = C0413a.$EnumSwitchMapping$0[factorsNumber.ordinal()];
            if (i == 1) {
                return new MethodSelectorAuth(phone, str, str2, list, false, MethodSelectorAuth.FactorsNumber.ONE_FA);
            }
            if (i == 2) {
                return new MethodSelectorAuth(phone, str, str2, list, false, MethodSelectorAuth.FactorsNumber.TWO_FA);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public LibverifyScreenData() {
        throw null;
    }

    public LibverifyScreenData(String str, String str2, String str3, List list, boolean z, CheckPresenterInfo checkPresenterInfo, zcl zclVar) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = z;
        this.g = checkPresenterInfo;
    }

    public List<LibverifyValidationType> Ab() {
        return this.e;
    }

    public boolean Bb() {
        return this.f;
    }

    public String Cb() {
        return this.b;
    }

    public String Db() {
        return this.c;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public void O7(Serializer serializer) {
        serializer.j0(Cb());
        serializer.j0(Db());
        serializer.j0(zb());
        serializer.h0(Ab());
        serializer.L(Bb() ? (byte) 1 : (byte) 0);
    }

    public String zb() {
        return this.d;
    }
}
