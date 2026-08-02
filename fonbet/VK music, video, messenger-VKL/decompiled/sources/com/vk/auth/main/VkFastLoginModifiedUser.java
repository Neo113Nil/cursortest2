package com.vk.auth.main;

import com.vk.core.serialize.Serializer;
import com.vk.silentauth.SilentAuthInfo;
import xsna.epx;

/* compiled from: VkFastLoginUsersModifier.kt */
/* loaded from: classes15.dex */
public final class VkFastLoginModifiedUser extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VkFastLoginModifiedUser> CREATOR = new a();
    public final SilentAuthInfo b;
    public final VkFastLoginModifyInfo c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VkFastLoginModifiedUser> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VkFastLoginModifiedUser a(Serializer serializer) {
            return new VkFastLoginModifiedUser((SilentAuthInfo) serializer.A(SilentAuthInfo.class.getClassLoader()), (VkFastLoginModifyInfo) serializer.A(VkFastLoginModifyInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VkFastLoginModifiedUser[i];
        }
    }

    public VkFastLoginModifiedUser(SilentAuthInfo silentAuthInfo, VkFastLoginModifyInfo vkFastLoginModifyInfo) {
        this.b = silentAuthInfo;
        this.c = vkFastLoginModifyInfo;
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
        if (!(obj instanceof VkFastLoginModifiedUser)) {
            return false;
        }
        VkFastLoginModifiedUser vkFastLoginModifiedUser = (VkFastLoginModifiedUser) obj;
        return epx.f(this.b, vkFastLoginModifiedUser.b) && epx.f(this.c, vkFastLoginModifiedUser.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        VkFastLoginModifyInfo vkFastLoginModifyInfo = this.c;
        return hashCode + (vkFastLoginModifyInfo == null ? 0 : vkFastLoginModifyInfo.hashCode());
    }

    public final String toString() {
        return "VkFastLoginModifiedUser(user=" + this.b + ", modifyInfo=" + this.c + ')';
    }
}
