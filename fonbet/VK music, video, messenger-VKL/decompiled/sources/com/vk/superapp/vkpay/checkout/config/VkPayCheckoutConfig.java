package com.vk.superapp.vkpay.checkout.config;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkExtraPaymentOptions;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkMerchantInfo;
import com.vk.superapp.vkpay.checkout.data.VkCheckoutUserInfo;
import com.vk.superapp.vkpay.checkout.feature.verification.PayVerificationInfo;
import defpackage.q0;
import java.util.concurrent.TimeUnit;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VkPayCheckoutConfig.kt */
/* loaded from: classes6.dex */
public final class VkPayCheckoutConfig implements Serializer.StreamParcelable {
    public final VkMerchantInfo b;
    public final UserInfoProvider c;
    public final Environment d;
    public final VkExtraPaymentOptions e;
    public final Integer f;
    public final boolean g;
    public final boolean h;
    public final PayVerificationInfo i;
    public final long j;
    public final String k;
    public final boolean l;
    public static final long m = TimeUnit.MINUTES.toSeconds(5);
    public static final Serializer.c<VkPayCheckoutConfig> CREATOR = new a();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkPayCheckoutConfig.kt */
    public static final class Domain {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Domain[] $VALUES;
        public static final Domain STAGE;
        public static final Domain TEST;
        private final String domain;

        static {
            Domain domain = new Domain("TEST", 0, "test.money.mail.ru");
            TEST = domain;
            Domain domain2 = new Domain("STAGE", 1, "stage.money.mail.ru");
            STAGE = domain2;
            Domain[] domainArr = {domain, domain2};
            $VALUES = domainArr;
            $ENTRIES = new asp(domainArr);
        }

        public Domain(String str, int i, String str2) {
            this.domain = str2;
        }

        public static Domain valueOf(String str) {
            return (Domain) Enum.valueOf(Domain.class, str);
        }

        public static Domain[] values() {
            return (Domain[]) $VALUES.clone();
        }

        public final String h() {
            return this.domain;
        }
    }

    /* compiled from: VkPayCheckoutConfig.kt */
    public static abstract class Environment implements Serializer.StreamParcelable {

        /* compiled from: VkPayCheckoutConfig.kt */
        public static final class ProductionWithTestMerchant extends Production implements Serializer.StreamParcelable {
            public static final Serializer.c<ProductionWithTestMerchant> CREATOR = new a();
            public final Domain b;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<ProductionWithTestMerchant> {
                @Override // com.vk.core.serialize.Serializer.c
                public final ProductionWithTestMerchant a(Serializer serializer) {
                    return new ProductionWithTestMerchant(serializer);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ProductionWithTestMerchant[i];
                }
            }

            public ProductionWithTestMerchant(Domain domain) {
                this.b = domain;
            }

            @Override // com.vk.superapp.vkpay.checkout.config.VkPayCheckoutConfig.Environment.Production, com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.j0(this.b.h());
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ProductionWithTestMerchant) && this.b == ((ProductionWithTestMerchant) obj).b;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "ProductionWithTestMerchant(domain=" + this.b + ')';
            }

            public ProductionWithTestMerchant(Serializer serializer) {
                this(Domain.valueOf(serializer.H()));
            }
        }

        public /* synthetic */ Environment(zcl zclVar) {
            this();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }

        public Environment() {
        }

        /* compiled from: VkPayCheckoutConfig.kt */
        public static final class Sandbox extends Environment implements Serializer.StreamParcelable {
            public static final Serializer.c<Sandbox> CREATOR = new a();
            public final VkCheckoutUserInfo b;
            public final boolean c;
            public final boolean d;
            public final boolean e;
            public final Domain f;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<Sandbox> {
                @Override // com.vk.core.serialize.Serializer.c
                public final Sandbox a(Serializer serializer) {
                    return new Sandbox(serializer);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Sandbox[i];
                }
            }

            public Sandbox(VkCheckoutUserInfo vkCheckoutUserInfo, boolean z, boolean z2, boolean z3, Domain domain) {
                super(null);
                this.b = vkCheckoutUserInfo;
                this.c = z;
                this.d = z2;
                this.e = z3;
                this.f = domain;
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.i0(this.b);
                serializer.L(this.c ? (byte) 1 : (byte) 0);
                serializer.L(this.d ? (byte) 1 : (byte) 0);
                serializer.L(this.e ? (byte) 1 : (byte) 0);
                serializer.j0(this.f.h());
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Sandbox)) {
                    return false;
                }
                Sandbox sandbox = (Sandbox) obj;
                return epx.f(this.b, sandbox.b) && this.c == sandbox.c && this.d == sandbox.d && this.e == sandbox.e && this.f == sandbox.f;
            }

            public final int hashCode() {
                return this.f.hashCode() + qoy.b(qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
            }

            public final String toString() {
                return "Sandbox(userInfo=" + this.b + ", useApi=" + this.c + ", mockNotCreatedVkPay=" + this.d + ", useTestMerchant=" + this.e + ", domain=" + this.f + ')';
            }

            public Sandbox(Serializer serializer) {
                this((VkCheckoutUserInfo) serializer.G(VkCheckoutUserInfo.class.getClassLoader()), serializer.m(), serializer.m(), serializer.m(), Domain.valueOf(serializer.H()));
            }
        }

        /* compiled from: VkPayCheckoutConfig.kt */
        public static class Production extends Environment implements Serializer.StreamParcelable {
            public static final Serializer.c<Production> CREATOR = new a();

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<Production> {
                @Override // com.vk.core.serialize.Serializer.c
                public final Production a(Serializer serializer) {
                    return new Production();
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Production[i];
                }
            }

            public Production() {
                super(null);
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public void O7(Serializer serializer) {
            }
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VkPayCheckoutConfig> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VkPayCheckoutConfig a(Serializer serializer) {
            return new VkPayCheckoutConfig(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VkPayCheckoutConfig[i];
        }
    }

    public VkPayCheckoutConfig(VkMerchantInfo vkMerchantInfo, UserInfoProvider userInfoProvider, Environment environment, VkExtraPaymentOptions vkExtraPaymentOptions, Integer num, boolean z, boolean z2, PayVerificationInfo payVerificationInfo, long j, String str, boolean z3) {
        this.b = vkMerchantInfo;
        this.c = userInfoProvider;
        this.d = environment;
        this.e = vkExtraPaymentOptions;
        this.f = num;
        this.g = z;
        this.h = z2;
        this.i = payVerificationInfo;
        this.j = j;
        this.k = str;
        this.l = z3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.i0(this.c);
        serializer.i0(this.d);
        serializer.i0(this.e);
        Integer num = this.f;
        if (num != null) {
            serializer.S(num.intValue());
        }
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.i0(this.i);
        serializer.Y(this.j);
        serializer.j0(this.k);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkPayCheckoutConfig)) {
            return false;
        }
        VkPayCheckoutConfig vkPayCheckoutConfig = (VkPayCheckoutConfig) obj;
        return epx.f(this.b, vkPayCheckoutConfig.b) && epx.f(this.c, vkPayCheckoutConfig.c) && epx.f(this.d, vkPayCheckoutConfig.d) && epx.f(this.e, vkPayCheckoutConfig.e) && epx.f(this.f, vkPayCheckoutConfig.f) && this.g == vkPayCheckoutConfig.g && this.h == vkPayCheckoutConfig.h && epx.f(this.i, vkPayCheckoutConfig.i) && this.j == vkPayCheckoutConfig.j && epx.f(this.k, vkPayCheckoutConfig.k) && this.l == vkPayCheckoutConfig.l;
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 31;
        Integer num = this.f;
        return Boolean.hashCode(this.l) + urd0.a(bh10.a((this.i.hashCode() + qoy.b(qoy.b((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.g), 31, this.h)) * 31, 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkPayCheckoutConfig(merchantConfiguration=");
        sb.append(this.b);
        sb.append(", userInfoProvider=");
        sb.append(this.c);
        sb.append(", environment=");
        sb.append(this.d);
        sb.append(", extraOptions=");
        sb.append(this.e);
        sb.append(", parentAppId=");
        sb.append(this.f);
        sb.append(", hideGooglePay=");
        sb.append(this.g);
        sb.append(", showBonuses=");
        sb.append(this.h);
        sb.append(", verificationInfo=");
        sb.append(this.i);
        sb.append(", resetPinIntervalSec=");
        sb.append(this.j);
        sb.append(", issuerId=");
        sb.append(this.k);
        sb.append(", forceNativePay=");
        return q0.a(sb, this.l, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ VkPayCheckoutConfig(com.vk.superapp.vkpay.checkout.api.dto.model.VkMerchantInfo r17, com.vk.superapp.vkpay.checkout.config.UserInfoProvider r18, com.vk.superapp.vkpay.checkout.config.VkPayCheckoutConfig.Environment r19, com.vk.superapp.vkpay.checkout.api.dto.model.VkExtraPaymentOptions r20, java.lang.Integer r21, boolean r22, boolean r23, com.vk.superapp.vkpay.checkout.feature.verification.PayVerificationInfo r24, long r25, java.lang.String r27, boolean r28, int r29, xsna.zcl r30) {
        /*
            r16 = this;
            r0 = r29
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L9
            r8 = r2
            goto Lb
        L9:
            r8 = r21
        Lb:
            r1 = r0 & 128(0x80, float:1.8E-43)
            r3 = 0
            if (r1 == 0) goto L18
            com.vk.superapp.vkpay.checkout.feature.verification.PayVerificationInfo r1 = new com.vk.superapp.vkpay.checkout.feature.verification.PayVerificationInfo
            r4 = 3
            r1.<init>(r3, r2, r4, r2)
            r11 = r1
            goto L1a
        L18:
            r11 = r24
        L1a:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L22
            long r1 = com.vk.superapp.vkpay.checkout.config.VkPayCheckoutConfig.m
            r12 = r1
            goto L24
        L22:
            r12 = r25
        L24:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L32
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            r14 = r1
            goto L34
        L32:
            r14 = r27
        L34:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L48
            r15 = r3
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r9 = r22
            r10 = r23
            r3 = r16
            goto L58
        L48:
            r15 = r28
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r9 = r22
            r10 = r23
        L58:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.superapp.vkpay.checkout.config.VkPayCheckoutConfig.<init>(com.vk.superapp.vkpay.checkout.api.dto.model.VkMerchantInfo, com.vk.superapp.vkpay.checkout.config.UserInfoProvider, com.vk.superapp.vkpay.checkout.config.VkPayCheckoutConfig$Environment, com.vk.superapp.vkpay.checkout.api.dto.model.VkExtraPaymentOptions, java.lang.Integer, boolean, boolean, com.vk.superapp.vkpay.checkout.feature.verification.PayVerificationInfo, long, java.lang.String, boolean, int, xsna.zcl):void");
    }

    public VkPayCheckoutConfig(Serializer serializer) {
        this((VkMerchantInfo) serializer.G(VkMerchantInfo.class.getClassLoader()), (UserInfoProvider) serializer.G(UserInfoProvider.class.getClassLoader()), (Environment) serializer.G(Environment.class.getClassLoader()), (VkExtraPaymentOptions) serializer.G(VkExtraPaymentOptions.class.getClassLoader()), serializer.v(), serializer.m(), serializer.m(), (PayVerificationInfo) serializer.G(PayVerificationInfo.class.getClassLoader()), serializer.w(), serializer.H(), false, 1024, null);
    }
}
