package com.vk.superapp.api.dto.auth;

import com.vk.core.serialize.Serializer;
import defpackage.q0;
import java.util.List;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.qoy;
import xsna.shy;
import xsna.zrp;

/* compiled from: VkAuthValidatePhoneResult.kt */
/* loaded from: classes6.dex */
public final class VkAuthValidatePhoneResult extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VkAuthValidatePhoneResult> CREATOR = new a();
    public final String b;
    public final boolean c;
    public final List<LibverifyValidationType> d;
    public final ValidationType e;
    public final ValidationType f;
    public final boolean g;
    public final long h;
    public final long i;
    public final String j;
    public final int k;
    public final String l;
    public final String m;
    public final String n;
    public final boolean o;
    public final Long p;
    public final boolean q;
    public final String r;
    public final String s;
    public final VkAuthSmsInboxField t;
    public final boolean u;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkAuthValidatePhoneResult.kt */
    public static final class ValidationType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ValidationType[] $VALUES;
        public static final ValidationType VALIDATION_TYPE_CALL_RESET;
        public static final ValidationType VALIDATION_TYPE_EMAIL;
        public static final ValidationType VALIDATION_TYPE_IVR;
        public static final ValidationType VALIDATION_TYPE_MAX_CODE;
        public static final ValidationType VALIDATION_TYPE_MAX_MESSENGER;
        public static final ValidationType VALIDATION_TYPE_PASSKEY;
        public static final ValidationType VALIDATION_TYPE_PUSH;
        public static final ValidationType VALIDATION_TYPE_SMS;
        public static final ValidationType VALIDATION_TYPE_SMS_INBOX;

        static {
            ValidationType validationType = new ValidationType("VALIDATION_TYPE_SMS", 0);
            VALIDATION_TYPE_SMS = validationType;
            ValidationType validationType2 = new ValidationType("VALIDATION_TYPE_CALL_RESET", 1);
            VALIDATION_TYPE_CALL_RESET = validationType2;
            ValidationType validationType3 = new ValidationType("VALIDATION_TYPE_IVR", 2);
            VALIDATION_TYPE_IVR = validationType3;
            ValidationType validationType4 = new ValidationType("VALIDATION_TYPE_PUSH", 3);
            VALIDATION_TYPE_PUSH = validationType4;
            ValidationType validationType5 = new ValidationType("VALIDATION_TYPE_EMAIL", 4);
            VALIDATION_TYPE_EMAIL = validationType5;
            ValidationType validationType6 = new ValidationType("VALIDATION_TYPE_PASSKEY", 5);
            VALIDATION_TYPE_PASSKEY = validationType6;
            ValidationType validationType7 = new ValidationType("VALIDATION_TYPE_MAX_MESSENGER", 6);
            VALIDATION_TYPE_MAX_MESSENGER = validationType7;
            ValidationType validationType8 = new ValidationType("VALIDATION_TYPE_SMS_INBOX", 7);
            VALIDATION_TYPE_SMS_INBOX = validationType8;
            ValidationType validationType9 = new ValidationType("VALIDATION_TYPE_MAX_CODE", 8);
            VALIDATION_TYPE_MAX_CODE = validationType9;
            ValidationType[] validationTypeArr = {validationType, validationType2, validationType3, validationType4, validationType5, validationType6, validationType7, validationType8, validationType9};
            $VALUES = validationTypeArr;
            $ENTRIES = new asp(validationTypeArr);
        }

        public ValidationType() {
            throw null;
        }

        public static ValidationType valueOf(String str) {
            return (ValidationType) Enum.valueOf(ValidationType.class, str);
        }

        public static ValidationType[] values() {
            return (ValidationType[]) $VALUES.clone();
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VkAuthValidatePhoneResult> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VkAuthValidatePhoneResult a(Serializer serializer) {
            return new VkAuthValidatePhoneResult(serializer.H(), serializer.m(), serializer.D(), (ValidationType) serializer.C(), (ValidationType) serializer.C(), serializer.m(), serializer.w(), serializer.w(), serializer.H(), serializer.u(), serializer.H(), serializer.H(), serializer.H(), serializer.m(), serializer.x(), serializer.m(), serializer.H(), serializer.H(), (VkAuthSmsInboxField) serializer.A(VkAuthSmsInboxField.class.getClassLoader()), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VkAuthValidatePhoneResult[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VkAuthValidatePhoneResult(String str, boolean z, List<? extends LibverifyValidationType> list, ValidationType validationType, ValidationType validationType2, boolean z2, long j, long j2, String str2, int i, String str3, String str4, String str5, boolean z3, Long l, boolean z4, String str6, String str7, VkAuthSmsInboxField vkAuthSmsInboxField, boolean z5) {
        this.b = str;
        this.c = z;
        this.d = list;
        this.e = validationType;
        this.f = validationType2;
        this.g = z2;
        this.h = j;
        this.i = j2;
        this.j = str2;
        this.k = i;
        this.l = str3;
        this.m = str4;
        this.n = str5;
        this.o = z3;
        this.p = l;
        this.q = z4;
        this.r = str6;
        this.s = str7;
        this.t = vkAuthSmsInboxField;
        this.u = z5;
    }

    public final ValidationType Ab() {
        return this.f;
    }

    public final ValidationType Bb() {
        return this.e;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
        serializer.h0(this.d);
        serializer.g0(this.e);
        serializer.g0(this.f);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.Y(this.h);
        serializer.Y(this.i);
        serializer.j0(this.j);
        serializer.S(this.k);
        serializer.j0(this.l);
        serializer.j0(this.m);
        serializer.j0(this.n);
        serializer.L(this.o ? (byte) 1 : (byte) 0);
        serializer.b0(this.p);
        serializer.L(this.q ? (byte) 1 : (byte) 0);
        serializer.j0(this.r);
        serializer.j0(this.s);
        serializer.e0(this.t);
        serializer.L(this.u ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkAuthValidatePhoneResult)) {
            return false;
        }
        VkAuthValidatePhoneResult vkAuthValidatePhoneResult = (VkAuthValidatePhoneResult) obj;
        return epx.f(this.b, vkAuthValidatePhoneResult.b) && this.c == vkAuthValidatePhoneResult.c && epx.f(this.d, vkAuthValidatePhoneResult.d) && this.e == vkAuthValidatePhoneResult.e && this.f == vkAuthValidatePhoneResult.f && this.g == vkAuthValidatePhoneResult.g && this.h == vkAuthValidatePhoneResult.h && this.i == vkAuthValidatePhoneResult.i && epx.f(this.j, vkAuthValidatePhoneResult.j) && this.k == vkAuthValidatePhoneResult.k && epx.f(this.l, vkAuthValidatePhoneResult.l) && epx.f(this.m, vkAuthValidatePhoneResult.m) && epx.f(this.n, vkAuthValidatePhoneResult.n) && this.o == vkAuthValidatePhoneResult.o && epx.f(this.p, vkAuthValidatePhoneResult.p) && this.q == vkAuthValidatePhoneResult.q && epx.f(this.r, vkAuthValidatePhoneResult.r) && epx.f(this.s, vkAuthValidatePhoneResult.s) && epx.f(this.t, vkAuthValidatePhoneResult.t) && this.u == vkAuthValidatePhoneResult.u;
    }

    public final int hashCode() {
        int b = qoy.b(this.b.hashCode() * 31, 31, this.c);
        List<LibverifyValidationType> list = this.d;
        int hashCode = (b + (list == null ? 0 : list.hashCode())) * 31;
        ValidationType validationType = this.e;
        int hashCode2 = (hashCode + (validationType == null ? 0 : validationType.hashCode())) * 31;
        ValidationType validationType2 = this.f;
        int a2 = bh10.a(bh10.a(qoy.b((hashCode2 + (validationType2 == null ? 0 : validationType2.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i);
        String str = this.j;
        int a3 = shy.a(this.k, (a2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.l;
        int hashCode3 = (a3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.m;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.n;
        int b2 = qoy.b((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.o);
        Long l = this.p;
        int b3 = qoy.b((b2 + (l == null ? 0 : l.hashCode())) * 31, 31, this.q);
        String str5 = this.r;
        int hashCode5 = (b3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.s;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        VkAuthSmsInboxField vkAuthSmsInboxField = this.t;
        return Boolean.hashCode(this.u) + ((hashCode6 + (vkAuthSmsInboxField != null ? vkAuthSmsInboxField.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkAuthValidatePhoneResult(sid=");
        sb.append(this.b);
        sb.append(", libverifySupport=");
        sb.append(this.c);
        sb.append(", libverifyValidationTypes=");
        sb.append(this.d);
        sb.append(", validationType=");
        sb.append(this.e);
        sb.append(", validationResendType=");
        sb.append(this.f);
        sb.append(", needShowCallResetPreview=");
        sb.append(this.g);
        sb.append(", delayMillis=");
        sb.append(this.h);
        sb.append(", delayMessenger=");
        sb.append(this.i);
        sb.append(", externalId=");
        sb.append(this.j);
        sb.append(", codeLength=");
        sb.append(this.k);
        sb.append(", maskedPhone=");
        sb.append(this.l);
        sb.append(", deviceName=");
        sb.append(this.m);
        sb.append(", maskedEmail=");
        sb.append(this.n);
        sb.append(", showQrCode=");
        sb.append(this.o);
        sb.append(", phoneReuseTimeoutMs=");
        sb.append(this.p);
        sb.append(", libverifyMessengersEnabled=");
        sb.append(this.q);
        sb.append(", maxMessengerHash=");
        sb.append(this.r);
        sb.append(", maxMessengerOpenLink=");
        sb.append(this.s);
        sb.append(", smsInboxField=");
        sb.append(this.t);
        sb.append(", showOpenMaxButton=");
        return q0.a(sb, this.u, ')');
    }

    public final String zb() {
        return this.b;
    }
}
