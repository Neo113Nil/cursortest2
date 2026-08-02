package com.vk.auth.screendata;

import com.vk.api.generated.auth.dto.AuthValidateRegistrationConfirmTextsDto;
import com.vk.auth.main.AfterPhoneReuseVerificationWay;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.auth.VkAuthProfileInfo;
import xsna.asp;
import xsna.epx;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VkExistingProfileScreenData.kt */
/* loaded from: classes15.dex */
public final class VkExistingProfileScreenData extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VkExistingProfileScreenData> CREATOR = new b();
    public final String b;
    public final VkAuthProfileInfo c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final AuthValidateRegistrationConfirmTextsDto g;
    public final SignUpRestrictedReason h;
    public final String i;
    public final AfterPhoneReuseVerificationWay j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkExistingProfileScreenData.kt */
    public static final class SignUpRestrictedReason {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SignUpRestrictedReason[] $VALUES;
        public static final SignUpRestrictedReason EMAIL_ALREADY_USED;
        private final String reason = "email_already_used";

        static {
            SignUpRestrictedReason signUpRestrictedReason = new SignUpRestrictedReason();
            EMAIL_ALREADY_USED = signUpRestrictedReason;
            SignUpRestrictedReason[] signUpRestrictedReasonArr = {signUpRestrictedReason};
            $VALUES = signUpRestrictedReasonArr;
            $ENTRIES = new asp(signUpRestrictedReasonArr);
        }

        public static SignUpRestrictedReason valueOf(String str) {
            return (SignUpRestrictedReason) Enum.valueOf(SignUpRestrictedReason.class, str);
        }

        public static SignUpRestrictedReason[] values() {
            return (SignUpRestrictedReason[]) $VALUES.clone();
        }

        public final String h() {
            return this.reason;
        }
    }

    /* compiled from: VkExistingProfileScreenData.kt */
    public static final class a {
        public static SignUpRestrictedReason a(String str) {
            for (SignUpRestrictedReason signUpRestrictedReason : SignUpRestrictedReason.values()) {
                if (epx.f(str, signUpRestrictedReason.h())) {
                    return signUpRestrictedReason;
                }
            }
            return null;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<VkExistingProfileScreenData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VkExistingProfileScreenData a(Serializer serializer) {
            String H = serializer.H();
            VkAuthProfileInfo vkAuthProfileInfo = (VkAuthProfileInfo) serializer.A(VkAuthProfileInfo.class.getClassLoader());
            boolean m = serializer.m();
            String H2 = serializer.H();
            boolean m2 = serializer.m();
            AuthValidateRegistrationConfirmTextsDto authValidateRegistrationConfirmTextsDto = (AuthValidateRegistrationConfirmTextsDto) serializer.A(AuthValidateRegistrationConfirmTextsDto.class.getClassLoader());
            SignUpRestrictedReason a = a.a(serializer.H());
            String H3 = serializer.H();
            AfterPhoneReuseVerificationWay.a aVar = AfterPhoneReuseVerificationWay.Companion;
            String H4 = serializer.H();
            aVar.getClass();
            AfterPhoneReuseVerificationWay afterPhoneReuseVerificationWay = null;
            if (H4 != null) {
                try {
                    afterPhoneReuseVerificationWay = AfterPhoneReuseVerificationWay.valueOf(H4);
                } catch (Throwable unused) {
                }
            }
            return new VkExistingProfileScreenData(H, vkAuthProfileInfo, m, H2, m2, authValidateRegistrationConfirmTextsDto, a, H3, afterPhoneReuseVerificationWay);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VkExistingProfileScreenData[i];
        }
    }

    public /* synthetic */ VkExistingProfileScreenData(String str, VkAuthProfileInfo vkAuthProfileInfo, boolean z, String str2, boolean z2, AuthValidateRegistrationConfirmTextsDto authValidateRegistrationConfirmTextsDto, SignUpRestrictedReason signUpRestrictedReason, String str3, AfterPhoneReuseVerificationWay afterPhoneReuseVerificationWay, int i, zcl zclVar) {
        this(str, vkAuthProfileInfo, z, str2, z2, authValidateRegistrationConfirmTextsDto, signUpRestrictedReason, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : afterPhoneReuseVerificationWay);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.e0(this.c);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
        serializer.j0(this.e);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
        serializer.e0(this.g);
        SignUpRestrictedReason signUpRestrictedReason = this.h;
        serializer.j0(signUpRestrictedReason != null ? signUpRestrictedReason.h() : null);
        serializer.j0(this.i);
        AfterPhoneReuseVerificationWay afterPhoneReuseVerificationWay = this.j;
        serializer.j0(afterPhoneReuseVerificationWay != null ? afterPhoneReuseVerificationWay.name() : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkExistingProfileScreenData)) {
            return false;
        }
        VkExistingProfileScreenData vkExistingProfileScreenData = (VkExistingProfileScreenData) obj;
        return epx.f(this.b, vkExistingProfileScreenData.b) && epx.f(this.c, vkExistingProfileScreenData.c) && this.d == vkExistingProfileScreenData.d && epx.f(this.e, vkExistingProfileScreenData.e) && this.f == vkExistingProfileScreenData.f && epx.f(this.g, vkExistingProfileScreenData.g) && this.h == vkExistingProfileScreenData.h && epx.f(this.i, vkExistingProfileScreenData.i) && this.j == vkExistingProfileScreenData.j;
    }

    public final int hashCode() {
        int b2 = qoy.b(urd0.a(qoy.b((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
        AuthValidateRegistrationConfirmTextsDto authValidateRegistrationConfirmTextsDto = this.g;
        int hashCode = (b2 + (authValidateRegistrationConfirmTextsDto == null ? 0 : authValidateRegistrationConfirmTextsDto.hashCode())) * 31;
        SignUpRestrictedReason signUpRestrictedReason = this.h;
        int hashCode2 = (hashCode + (signUpRestrictedReason == null ? 0 : signUpRestrictedReason.hashCode())) * 31;
        String str = this.i;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        AfterPhoneReuseVerificationWay afterPhoneReuseVerificationWay = this.j;
        return hashCode3 + (afterPhoneReuseVerificationWay != null ? afterPhoneReuseVerificationWay.hashCode() : 0);
    }

    public final String toString() {
        return "VkExistingProfileScreenData(login=" + this.b + ", authProfileInfo=" + this.c + ", askPassword=" + this.d + ", sid=" + this.e + ", canSkipPassword=" + this.f + ", registrationConfirmTextsDto=" + this.g + ", signUpRestrictedReason=" + this.h + ", signUpEmail=" + this.i + ", afterPhoneReuseVerificationWay=" + this.j + ')';
    }

    public final boolean zb() {
        return this.d;
    }

    public VkExistingProfileScreenData(String str, VkAuthProfileInfo vkAuthProfileInfo, boolean z, String str2, boolean z2, AuthValidateRegistrationConfirmTextsDto authValidateRegistrationConfirmTextsDto, SignUpRestrictedReason signUpRestrictedReason, String str3, AfterPhoneReuseVerificationWay afterPhoneReuseVerificationWay) {
        this.b = str;
        this.c = vkAuthProfileInfo;
        this.d = z;
        this.e = str2;
        this.f = z2;
        this.g = authValidateRegistrationConfirmTextsDto;
        this.h = signUpRestrictedReason;
        this.i = str3;
        this.j = afterPhoneReuseVerificationWay;
    }
}
