package com.vk.auth.verification.base;

import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.verification.base.stats.VerificationStatStartedFromReg;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.states.VkAuthState;
import xsna.zcl;

/* compiled from: CheckPresenterInfo.kt */
/* loaded from: classes15.dex */
public abstract class CheckPresenterInfo extends Serializer.StreamParcelableAdapter {

    /* compiled from: CheckPresenterInfo.kt */
    public static final class Auth extends CheckPresenterInfo {
        public static final Serializer.c<Auth> CREATOR = new a();
        public final VkAuthState b;

        /* compiled from: CheckPresenterInfo.kt */
        public static final class a extends Serializer.c<Auth> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Auth a(Serializer serializer) {
                return new Auth((VkAuthState) serializer.A(VkAuthState.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Auth[i];
            }
        }

        public Auth(VkAuthState vkAuthState) {
            super(null);
            this.b = vkAuthState;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.e0(this.b);
        }
    }

    /* compiled from: CheckPresenterInfo.kt */
    public static final class MethodSelectorAuth extends CheckPresenterInfo {
        public static final Serializer.c<MethodSelectorAuth> CREATOR = new a();
        public final VerificationScreenData b;

        /* compiled from: CheckPresenterInfo.kt */
        public static final class a extends Serializer.c<MethodSelectorAuth> {
            @Override // com.vk.core.serialize.Serializer.c
            public final MethodSelectorAuth a(Serializer serializer) {
                return new MethodSelectorAuth((VerificationScreenData) serializer.A(VerificationScreenData.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MethodSelectorAuth[i];
            }
        }

        public MethodSelectorAuth(VerificationScreenData verificationScreenData) {
            super(null);
            this.b = verificationScreenData;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.e0(this.b);
        }
    }

    /* compiled from: CheckPresenterInfo.kt */
    public static final class PasswordLessAuth extends CheckPresenterInfo {
        public static final Serializer.c<PasswordLessAuth> CREATOR = new a();
        public final VerificationScreenData b;
        public final boolean c;

        /* compiled from: CheckPresenterInfo.kt */
        public static final class a extends Serializer.c<PasswordLessAuth> {
            @Override // com.vk.core.serialize.Serializer.c
            public final PasswordLessAuth a(Serializer serializer) {
                return new PasswordLessAuth((VerificationScreenData) serializer.A(VerificationScreenData.class.getClassLoader()), serializer.m());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PasswordLessAuth[i];
            }
        }

        public /* synthetic */ PasswordLessAuth(VerificationScreenData verificationScreenData, boolean z, int i, zcl zclVar) {
            this(verificationScreenData, (i & 2) != 0 ? false : z);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.e0(this.b);
            serializer.L(this.c ? (byte) 1 : (byte) 0);
        }

        public PasswordLessAuth(VerificationScreenData verificationScreenData, boolean z) {
            super(null);
            this.b = verificationScreenData;
            this.c = z;
        }
    }

    /* compiled from: CheckPresenterInfo.kt */
    public static final class Validation extends CheckPresenterInfo {
        public static final Serializer.c<Validation> CREATOR = new a();
        public final String b;
        public final boolean c;
        public final String d;
        public final boolean e;

        /* compiled from: CheckPresenterInfo.kt */
        public static final class a extends Serializer.c<Validation> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Validation a(Serializer serializer) {
                return new Validation(serializer.H(), serializer.m(), serializer.H(), serializer.m());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Validation[i];
            }
        }

        public Validation(String str, boolean z, String str2, boolean z2) {
            super(null);
            this.b = str;
            this.c = z;
            this.d = str2;
            this.e = z2;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.L(this.c ? (byte) 1 : (byte) 0);
            serializer.j0(this.d);
            serializer.L(this.e ? (byte) 1 : (byte) 0);
        }

        public /* synthetic */ Validation(String str, boolean z, String str2, boolean z2, int i, zcl zclVar) {
            this(str, z, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? false : z2);
        }
    }

    public /* synthetic */ CheckPresenterInfo(zcl zclVar) {
        this();
    }

    /* compiled from: CheckPresenterInfo.kt */
    public static final class SignUp extends CheckPresenterInfo {
        public static final Serializer.c<SignUp> CREATOR = new a();
        public final VerificationScreenData b;
        public final VerificationStatStartedFromReg c;
        public final boolean d;

        /* compiled from: CheckPresenterInfo.kt */
        public static final class a extends Serializer.c<SignUp> {
            @Override // com.vk.core.serialize.Serializer.c
            public final SignUp a(Serializer serializer) {
                return new SignUp((VerificationScreenData) serializer.A(VerificationScreenData.class.getClassLoader()), (VerificationStatStartedFromReg) serializer.A(VerificationStatStartedFromReg.class.getClassLoader()), serializer.m());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SignUp[i];
            }
        }

        public /* synthetic */ SignUp(VerificationScreenData verificationScreenData, VerificationStatStartedFromReg verificationStatStartedFromReg, boolean z, int i, zcl zclVar) {
            this(verificationScreenData, (i & 2) != 0 ? new VerificationStatStartedFromReg(true) : verificationStatStartedFromReg, (i & 4) != 0 ? false : z);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.e0(this.b);
            serializer.e0(this.c);
            serializer.L(this.d ? (byte) 1 : (byte) 0);
        }

        public SignUp(VerificationScreenData verificationScreenData, VerificationStatStartedFromReg verificationStatStartedFromReg, boolean z) {
            super(null);
            this.b = verificationScreenData;
            this.c = verificationStatStartedFromReg;
            this.d = z;
        }
    }

    public CheckPresenterInfo() {
    }
}
