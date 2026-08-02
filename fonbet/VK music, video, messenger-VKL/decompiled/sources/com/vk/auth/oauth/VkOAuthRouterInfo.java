package com.vk.auth.oauth;

import android.os.Bundle;
import com.vk.auth.oauth.vk.VkExternalAuthStartArgument;
import com.vk.core.serialize.Serializer;
import com.vk.silentauth.SilentAuthInfo;
import xsna.epx;

/* compiled from: VkOAuthRouterInfo.kt */
/* loaded from: classes.dex */
public final class VkOAuthRouterInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VkOAuthRouterInfo> CREATOR = new a();
    public final VkOAuthService b;
    public final SilentAuthInfo c;
    public final Bundle d;
    public final VkOAuthGoal e;

    /* compiled from: Serializer.kt */
    /* loaded from: classes15.dex */
    public static final class a extends Serializer.c<VkOAuthRouterInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VkOAuthRouterInfo a(Serializer serializer) {
            return new VkOAuthRouterInfo(VkOAuthService.valueOf(serializer.H()), (SilentAuthInfo) serializer.A(SilentAuthInfo.class.getClassLoader()), serializer.o(VkExternalAuthStartArgument.class.getClassLoader()), VkOAuthGoal.valueOf(serializer.H()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VkOAuthRouterInfo[i];
        }
    }

    public VkOAuthRouterInfo(VkOAuthService vkOAuthService, SilentAuthInfo silentAuthInfo, Bundle bundle, VkOAuthGoal vkOAuthGoal) {
        this.b = vkOAuthService;
        this.c = silentAuthInfo;
        this.d = bundle;
        this.e = vkOAuthGoal;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b.name());
        serializer.e0(this.c);
        serializer.K(this.d);
        serializer.j0(this.e.name());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkOAuthRouterInfo)) {
            return false;
        }
        VkOAuthRouterInfo vkOAuthRouterInfo = (VkOAuthRouterInfo) obj;
        return this.b == vkOAuthRouterInfo.b && epx.f(this.c, vkOAuthRouterInfo.c) && epx.f(this.d, vkOAuthRouterInfo.d) && this.e == vkOAuthRouterInfo.e;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        SilentAuthInfo silentAuthInfo = this.c;
        int hashCode2 = (hashCode + (silentAuthInfo == null ? 0 : silentAuthInfo.hashCode())) * 31;
        Bundle bundle = this.d;
        return this.e.hashCode() + ((hashCode2 + (bundle != null ? bundle.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "VkOAuthRouterInfo(oAuthService=" + this.b + ", silentAuthInfo=" + this.c + ", args=" + this.d + ", goal=" + this.e + ')';
    }
}
