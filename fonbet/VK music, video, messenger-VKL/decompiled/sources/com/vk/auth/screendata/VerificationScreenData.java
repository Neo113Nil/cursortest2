package com.vk.auth.screendata;

import android.os.Bundle;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.auth.VkAuthValidatePhoneResult;
import com.vk.superapp.api.dto.auth.validateaccount.VkAuthValidateAccountResponse;
import xsna.zcl;

/* compiled from: VerificationScreenData.kt */
/* loaded from: classes.dex */
public abstract class VerificationScreenData extends Serializer.StreamParcelableAdapter {
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final VkAuthValidatePhoneResult f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final Bundle j;
    public final String k;
    public final VkAuthValidateAccountResponse.NextStep.MaxOptions l;

    /* compiled from: VerificationScreenData.kt */
    public static final class Email extends VerificationScreenData {
        public static final Serializer.c<Email> CREATOR = new a();

        /* compiled from: VerificationScreenData.kt */
        /* loaded from: classes15.dex */
        public static final class a extends Serializer.c<Email> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Email a(Serializer serializer) {
                return new Email(serializer.H(), serializer.H(), serializer.H(), false, false, (Bundle) serializer.A(Bundle.class.getClassLoader()), serializer.I(), 24, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Email[i];
            }
        }

        public /* synthetic */ Email(String str, String str2, String str3, boolean z, boolean z2, Bundle bundle, String str4, int i, zcl zclVar) {
            this(str, str2, str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : bundle, (i & 64) != 0 ? null : str4);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.j0(this.d);
            serializer.e0(this.j);
            serializer.m0(this.k);
        }

        public Email(String str, String str2, String str3, boolean z, boolean z2, Bundle bundle, String str4) {
            super(str, str2, str3, z, null, false, z2, false, bundle, str4, null, 1200, null);
        }
    }

    /* compiled from: VerificationScreenData.kt */
    /* loaded from: classes15.dex */
    public static final class Phone extends VerificationScreenData {
        public static final Serializer.c<Phone> CREATOR = new a();
        public final Long m;

        /* compiled from: VerificationScreenData.kt */
        public static final class a extends Serializer.c<Phone> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Phone a(Serializer serializer) {
                String H = serializer.H();
                String H2 = serializer.H();
                String H3 = serializer.H();
                boolean m = serializer.m();
                VkAuthValidatePhoneResult vkAuthValidatePhoneResult = (VkAuthValidatePhoneResult) serializer.A(VkAuthValidatePhoneResult.class.getClassLoader());
                boolean m2 = serializer.m();
                boolean m3 = serializer.m();
                boolean m4 = serializer.m();
                Bundle bundle = (Bundle) serializer.A(Bundle.class.getClassLoader());
                String I = serializer.I();
                VkAuthValidateAccountResponse.NextStep.MaxOptions maxOptions = (VkAuthValidateAccountResponse.NextStep.MaxOptions) serializer.A(VkAuthValidateAccountResponse.NextStep.MaxOptions.class.getClassLoader());
                long w = serializer.w();
                Long valueOf = Long.valueOf(w);
                if (w <= 0) {
                    valueOf = null;
                }
                return new Phone(H, H2, H3, m, vkAuthValidatePhoneResult, m2, m3, m4, bundle, I, maxOptions, valueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Phone[i];
            }
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Phone(java.lang.String r17, java.lang.String r18, java.lang.String r19, boolean r20, com.vk.superapp.api.dto.auth.VkAuthValidatePhoneResult r21, boolean r22, boolean r23, boolean r24, android.os.Bundle r25, java.lang.String r26, com.vk.superapp.api.dto.auth.validateaccount.VkAuthValidateAccountResponse.NextStep.MaxOptions r27, java.lang.Long r28, int r29, xsna.zcl r30) {
            /*
                r16 = this;
                r0 = r29
                r1 = r0 & 8
                r2 = 0
                if (r1 == 0) goto L9
                r7 = r2
                goto Lb
            L9:
                r7 = r20
            Lb:
                r1 = r0 & 16
                r3 = 0
                if (r1 == 0) goto L12
                r8 = r3
                goto L14
            L12:
                r8 = r21
            L14:
                r1 = r0 & 32
                if (r1 == 0) goto L1a
                r9 = r2
                goto L1c
            L1a:
                r9 = r22
            L1c:
                r1 = r0 & 64
                if (r1 == 0) goto L22
                r10 = r2
                goto L24
            L22:
                r10 = r23
            L24:
                r1 = r0 & 128(0x80, float:1.8E-43)
                if (r1 == 0) goto L2a
                r11 = r2
                goto L2c
            L2a:
                r11 = r24
            L2c:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L32
                r12 = r3
                goto L34
            L32:
                r12 = r25
            L34:
                r1 = r0 & 512(0x200, float:7.17E-43)
                if (r1 == 0) goto L3a
                r13 = r3
                goto L3c
            L3a:
                r13 = r26
            L3c:
                r1 = r0 & 1024(0x400, float:1.435E-42)
                if (r1 == 0) goto L42
                r14 = r3
                goto L44
            L42:
                r14 = r27
            L44:
                r0 = r0 & 2048(0x800, float:2.87E-42)
                if (r0 == 0) goto L52
                r15 = r3
                r4 = r17
                r5 = r18
                r6 = r19
                r3 = r16
                goto L5c
            L52:
                r15 = r28
                r3 = r16
                r4 = r17
                r5 = r18
                r6 = r19
            L5c:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vk.auth.screendata.VerificationScreenData.Phone.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, com.vk.superapp.api.dto.auth.VkAuthValidatePhoneResult, boolean, boolean, boolean, android.os.Bundle, java.lang.String, com.vk.superapp.api.dto.auth.validateaccount.VkAuthValidateAccountResponse$NextStep$MaxOptions, java.lang.Long, int, xsna.zcl):void");
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.j0(this.d);
            serializer.L(this.e ? (byte) 1 : (byte) 0);
            serializer.e0(this.f);
            serializer.L(this.g ? (byte) 1 : (byte) 0);
            serializer.L(this.h ? (byte) 1 : (byte) 0);
            serializer.L(this.i ? (byte) 1 : (byte) 0);
            serializer.e0(this.j);
            serializer.m0(this.k);
            serializer.e0(this.l);
            Long l = this.m;
            serializer.Y(l != null ? l.longValue() : 0L);
        }

        public Phone(String str, String str2, String str3, boolean z, VkAuthValidatePhoneResult vkAuthValidatePhoneResult, boolean z2, boolean z3, boolean z4, Bundle bundle, String str4, VkAuthValidateAccountResponse.NextStep.MaxOptions maxOptions, Long l) {
            super(str, str2, str3, z, vkAuthValidatePhoneResult, z2, z3, z4, bundle, str4, maxOptions, null);
            this.m = l;
        }
    }

    public /* synthetic */ VerificationScreenData(String str, String str2, String str3, boolean z, VkAuthValidatePhoneResult vkAuthValidatePhoneResult, boolean z2, boolean z3, boolean z4, Bundle bundle, String str4, VkAuthValidateAccountResponse.NextStep.MaxOptions maxOptions, int i, zcl zclVar) {
        this(str, str2, str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : vkAuthValidatePhoneResult, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? false : z4, (i & 256) != 0 ? null : bundle, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : maxOptions, null);
    }

    /* compiled from: VerificationScreenData.kt */
    /* loaded from: classes15.dex */
    public static final class Login extends VerificationScreenData {
        public static final Serializer.c<Login> CREATOR = new a();

        /* compiled from: VerificationScreenData.kt */
        public static final class a extends Serializer.c<Login> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Login a(Serializer serializer) {
                return new Login(serializer.H(), serializer.H(), serializer.H(), serializer.m(), serializer.m(), (Bundle) serializer.A(Bundle.class.getClassLoader()), serializer.I());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Login[i];
            }
        }

        public /* synthetic */ Login(String str, String str2, String str3, boolean z, boolean z2, Bundle bundle, String str4, int i, zcl zclVar) {
            this(str, (i & 2) != 0 ? "" : str2, str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : bundle, (i & 64) != 0 ? null : str4);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.j0(this.d);
            serializer.L(this.g ? (byte) 1 : (byte) 0);
            serializer.L(this.h ? (byte) 1 : (byte) 0);
            serializer.e0(this.j);
            serializer.m0(this.k);
        }

        public Login(String str, String str2, String str3, boolean z, boolean z2, Bundle bundle, String str4) {
            super(str, str2, str3, false, null, z, z2, false, bundle, str4, null, 1176, null);
        }
    }

    public VerificationScreenData(String str, String str2, String str3, boolean z, VkAuthValidatePhoneResult vkAuthValidatePhoneResult, boolean z2, boolean z3, boolean z4, Bundle bundle, String str4, VkAuthValidateAccountResponse.NextStep.MaxOptions maxOptions, zcl zclVar) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = vkAuthValidatePhoneResult;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = bundle;
        this.k = str4;
        this.l = maxOptions;
    }
}
