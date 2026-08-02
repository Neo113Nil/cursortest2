package com.vk.auth.validation;

import com.vk.auth.validation.internal.PhoneValidationContract$SkipBehaviour;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.auth.validatephonecheck.AuthValidatePhoneCheckResponse;
import xsna.zcl;

/* compiled from: VkValidatePhoneInfo.kt */
/* loaded from: classes15.dex */
public abstract class VkValidatePhoneInfo extends Serializer.StreamParcelableAdapter {
    public final boolean b;

    /* compiled from: VkValidatePhoneInfo.kt */
    public static final class ConfirmPhone extends VkValidatePhoneInfo {
        public static final Serializer.c<ConfirmPhone> CREATOR = new a();
        public final String c;
        public final String d;
        public final PhoneValidationContract$SkipBehaviour e;
        public final String f;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<ConfirmPhone> {
            @Override // com.vk.core.serialize.Serializer.c
            public final ConfirmPhone a(Serializer serializer) {
                return new ConfirmPhone(serializer.H(), serializer.H(), PhoneValidationContract$SkipBehaviour.valueOf(serializer.H()), serializer.H(), serializer.m());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmPhone[i];
            }
        }

        public ConfirmPhone(String str, String str2, PhoneValidationContract$SkipBehaviour phoneValidationContract$SkipBehaviour, String str3, boolean z) {
            super(z, null);
            this.c = str;
            this.d = str2;
            this.e = phoneValidationContract$SkipBehaviour;
            this.f = str3;
        }

        @Override // com.vk.auth.validation.VkValidatePhoneInfo, com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.c);
            serializer.j0(this.d);
            serializer.j0(this.e.name());
            serializer.j0(this.f);
            super.O7(serializer);
        }
    }

    /* compiled from: VkValidatePhoneInfo.kt */
    public static final class Instant extends VkValidatePhoneInfo {
        public static final Serializer.c<Instant> CREATOR = new a();
        public final String c;
        public final String d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Instant> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Instant a(Serializer serializer) {
                return new Instant(serializer.H(), serializer.H(), serializer.m());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Instant[i];
            }
        }

        public Instant(String str, String str2, boolean z) {
            super(z, null);
            this.c = str;
            this.d = str2;
        }

        @Override // com.vk.auth.validation.VkValidatePhoneInfo, com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.c);
            serializer.j0(this.d);
            super.O7(serializer);
        }
    }

    /* compiled from: VkValidatePhoneInfo.kt */
    public static final class PhoneRequired extends VkValidatePhoneInfo {
        public static final Serializer.c<PhoneRequired> CREATOR = new a();
        public final String c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<PhoneRequired> {
            @Override // com.vk.core.serialize.Serializer.c
            public final PhoneRequired a(Serializer serializer) {
                return new PhoneRequired(serializer.H(), serializer.m());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PhoneRequired[i];
            }
        }

        public PhoneRequired(String str, boolean z) {
            super(z, null);
            this.c = str;
        }

        @Override // com.vk.auth.validation.VkValidatePhoneInfo, com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.c);
            super.O7(serializer);
        }
    }

    /* compiled from: VkValidatePhoneInfo.kt */
    public static final class Skip extends VkValidatePhoneInfo {
        public static final Serializer.c<Skip> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Skip> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Skip a(Serializer serializer) {
                return new Skip(serializer.m());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Skip[i];
            }
        }

        public Skip(boolean z) {
            super(z, null);
        }

        public /* synthetic */ Skip(boolean z, int i, zcl zclVar) {
            this((i & 1) != 0 ? false : z);
        }
    }

    /* compiled from: VkValidatePhoneInfo.kt */
    public static final class Unknown extends VkValidatePhoneInfo {
        public static final Unknown c = new Unknown(false, 1, null);
        public static final Serializer.c<Unknown> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Unknown> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Unknown a(Serializer serializer) {
                return Unknown.c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Unknown[i];
            }
        }
    }

    /* compiled from: VkValidatePhoneInfo.kt */
    public static final class a {
        public static VkValidatePhoneInfo a(int i, String str, String str2, String str3, boolean z) {
            if (i != 0) {
                return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? Unknown.c : new ConfirmPhone(str2, str, PhoneValidationContract$SkipBehaviour.UNLINK, str3, z) : new Skip(false, 1, null) : new ConfirmPhone(str2, str, PhoneValidationContract$SkipBehaviour.NOTHING, str3, z) : new ConfirmPhone(str2, str, PhoneValidationContract$SkipBehaviour.LOGOUT, str3, z) : new Instant(str2, str, true);
            }
            return new PhoneRequired(str, z);
        }

        public static VkValidatePhoneInfo b(AuthValidatePhoneCheckResponse authValidatePhoneCheckResponse) {
            return a(authValidatePhoneCheckResponse.b, authValidatePhoneCheckResponse.d, authValidatePhoneCheckResponse.c, null, false);
        }
    }

    public /* synthetic */ VkValidatePhoneInfo(boolean z, int i, zcl zclVar) {
        this((i & 1) != 0 ? false : z, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
    }

    public VkValidatePhoneInfo(boolean z, zcl zclVar) {
        this.b = z;
    }
}
