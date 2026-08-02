package com.vk.auth;

import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.screendata.LibverifyScreenData;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.core.serialize.Serializer;
import defpackage.q0;
import xsna.epx;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VkValidatePhoneRouterInfo.kt */
/* loaded from: classes.dex */
public final class VkValidatePhoneRouterInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VkValidatePhoneRouterInfo> CREATOR = new a();
    public final boolean b;
    public final VerificationScreenData c;
    public final String d;
    public final LibverifyScreenData e;
    public final VkAuthMetaInfo f;
    public final String g;
    public final boolean h;

    /* compiled from: Serializer.kt */
    /* loaded from: classes15.dex */
    public static final class a extends Serializer.c<VkValidatePhoneRouterInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VkValidatePhoneRouterInfo a(Serializer serializer) {
            return new VkValidatePhoneRouterInfo(serializer.m(), (VerificationScreenData) serializer.A(VerificationScreenData.class.getClassLoader()), serializer.H(), (LibverifyScreenData) serializer.A(LibverifyScreenData.class.getClassLoader()), (VkAuthMetaInfo) serializer.A(VkAuthMetaInfo.class.getClassLoader()), serializer.H(), false, 64, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VkValidatePhoneRouterInfo[i];
        }
    }

    public /* synthetic */ VkValidatePhoneRouterInfo(boolean z, VerificationScreenData verificationScreenData, String str, LibverifyScreenData libverifyScreenData, VkAuthMetaInfo vkAuthMetaInfo, String str2, boolean z2, int i, zcl zclVar) {
        this(z, verificationScreenData, str, libverifyScreenData, vkAuthMetaInfo, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? false : z2);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.e0(this.c);
        serializer.j0(this.d);
        serializer.e0(this.e);
        serializer.e0(this.f);
        serializer.j0(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkValidatePhoneRouterInfo)) {
            return false;
        }
        VkValidatePhoneRouterInfo vkValidatePhoneRouterInfo = (VkValidatePhoneRouterInfo) obj;
        return this.b == vkValidatePhoneRouterInfo.b && epx.f(this.c, vkValidatePhoneRouterInfo.c) && epx.f(this.d, vkValidatePhoneRouterInfo.d) && epx.f(this.e, vkValidatePhoneRouterInfo.e) && epx.f(this.f, vkValidatePhoneRouterInfo.f) && epx.f(this.g, vkValidatePhoneRouterInfo.g) && this.h == vkValidatePhoneRouterInfo.h;
    }

    public final int hashCode() {
        int a2 = urd0.a((this.c.hashCode() + (Boolean.hashCode(this.b) * 31)) * 31, 31, this.d);
        LibverifyScreenData libverifyScreenData = this.e;
        int hashCode = (this.f.hashCode() + ((a2 + (libverifyScreenData == null ? 0 : libverifyScreenData.hashCode())) * 31)) * 31;
        String str = this.g;
        return Boolean.hashCode(this.h) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkValidatePhoneRouterInfo(killPreviousAuth=");
        sb.append(this.b);
        sb.append(", verificationScreenData=");
        sb.append(this.c);
        sb.append(", sid=");
        sb.append(this.d);
        sb.append(", libverifyScreenData=");
        sb.append(this.e);
        sb.append(", authMetaInfo=");
        sb.append(this.f);
        sb.append(", forcedPassword=");
        sb.append(this.g);
        sb.append(", afterPhoneReuse=");
        return q0.a(sb, this.h, ')');
    }

    public VkValidatePhoneRouterInfo(boolean z, VerificationScreenData verificationScreenData, String str, LibverifyScreenData libverifyScreenData, VkAuthMetaInfo vkAuthMetaInfo, String str2, boolean z2) {
        this.b = z;
        this.c = verificationScreenData;
        this.d = str;
        this.e = libverifyScreenData;
        this.f = vkAuthMetaInfo;
        this.g = str2;
        this.h = z2;
    }
}
