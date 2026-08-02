package com.vk.auth.validation;

import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.core.api.models.BanInfo;
import xsna.epx;

/* compiled from: VkBanRouterInfo.kt */
/* loaded from: classes.dex */
public final class VkBanRouterInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VkBanRouterInfo> CREATOR = new a();
    public final BanInfo b;
    public final VkAuthMetaInfo c;

    /* compiled from: Serializer.kt */
    /* loaded from: classes15.dex */
    public static final class a extends Serializer.c<VkBanRouterInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VkBanRouterInfo a(Serializer serializer) {
            return new VkBanRouterInfo((BanInfo) serializer.A(BanInfo.class.getClassLoader()), (VkAuthMetaInfo) serializer.A(VkAuthMetaInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VkBanRouterInfo[i];
        }
    }

    public VkBanRouterInfo(BanInfo banInfo, VkAuthMetaInfo vkAuthMetaInfo) {
        this.b = banInfo;
        this.c = vkAuthMetaInfo;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.e0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkBanRouterInfo)) {
            return false;
        }
        VkBanRouterInfo vkBanRouterInfo = (VkBanRouterInfo) obj;
        return epx.f(this.b, vkBanRouterInfo.b) && epx.f(this.c, vkBanRouterInfo.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "VkBanRouterInfo(banInfo=" + this.b + ", authMetaInfo=" + this.c + ')';
    }
}
