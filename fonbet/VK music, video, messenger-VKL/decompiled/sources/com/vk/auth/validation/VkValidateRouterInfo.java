package com.vk.auth.validation;

import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.auth.VkAuthValidatePhoneResult;
import xsna.zcl;

/* compiled from: VkValidateRouterInfo.kt */
/* loaded from: classes.dex */
public abstract class VkValidateRouterInfo extends Serializer.StreamParcelableAdapter {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final VkAuthValidatePhoneResult e;

    /* compiled from: VkValidateRouterInfo.kt */
    /* loaded from: classes15.dex */
    public static final class EnterPhone extends VkValidateRouterInfo {
        public static final Serializer.c<EnterPhone> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<EnterPhone> {
            @Override // com.vk.core.serialize.Serializer.c
            public final EnterPhone a(Serializer serializer) {
                return new EnterPhone(serializer.H(), serializer.m(), serializer.m(), (VkAuthValidatePhoneResult) serializer.A(VkAuthValidatePhoneResult.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EnterPhone[i];
            }
        }

        public /* synthetic */ EnterPhone(String str, boolean z, boolean z2, VkAuthValidatePhoneResult vkAuthValidatePhoneResult, int i, zcl zclVar) {
            this(str, z, z2, (i & 8) != 0 ? null : vkAuthValidatePhoneResult);
        }

        public EnterPhone(String str, boolean z, boolean z2, VkAuthValidatePhoneResult vkAuthValidatePhoneResult) {
            super(str, z, z2, vkAuthValidatePhoneResult, null);
        }
    }

    /* compiled from: VkValidateRouterInfo.kt */
    /* loaded from: classes15.dex */
    public static final class EnterSmsCode extends VkValidateRouterInfo {
        public static final Serializer.c<EnterSmsCode> CREATOR = new a();
        public final String f;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<EnterSmsCode> {
            @Override // com.vk.core.serialize.Serializer.c
            public final EnterSmsCode a(Serializer serializer) {
                return new EnterSmsCode(serializer.H(), serializer.m(), serializer.m(), (VkAuthValidatePhoneResult) serializer.A(VkAuthValidatePhoneResult.class.getClassLoader()), serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EnterSmsCode[i];
            }
        }

        public /* synthetic */ EnterSmsCode(String str, boolean z, boolean z2, VkAuthValidatePhoneResult vkAuthValidatePhoneResult, String str2, int i, zcl zclVar) {
            this(str, z, z2, (i & 8) != 0 ? null : vkAuthValidatePhoneResult, str2);
        }

        @Override // com.vk.auth.validation.VkValidateRouterInfo, com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            super.O7(serializer);
            serializer.j0(this.f);
        }

        public final String zb() {
            return this.f;
        }

        public EnterSmsCode(String str, boolean z, boolean z2, VkAuthValidatePhoneResult vkAuthValidatePhoneResult, String str2) {
            super(str, z, z2, vkAuthValidatePhoneResult, null);
            this.f = str2;
        }
    }

    public VkValidateRouterInfo(String str, boolean z, boolean z2, VkAuthValidatePhoneResult vkAuthValidatePhoneResult, zcl zclVar) {
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = vkAuthValidatePhoneResult;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
        serializer.e0(this.e);
    }
}
