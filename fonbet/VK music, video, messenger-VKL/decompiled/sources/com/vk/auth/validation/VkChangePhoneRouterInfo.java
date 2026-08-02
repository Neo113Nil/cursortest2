package com.vk.auth.validation;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;

/* compiled from: VkChangePhoneRouterInfo.kt */
/* loaded from: classes15.dex */
public final class VkChangePhoneRouterInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VkChangePhoneRouterInfo> CREATOR = new a();
    public final String b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VkChangePhoneRouterInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VkChangePhoneRouterInfo a(Serializer serializer) {
            return new VkChangePhoneRouterInfo(serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VkChangePhoneRouterInfo[i];
        }
    }

    public VkChangePhoneRouterInfo(String str) {
        this.b = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VkChangePhoneRouterInfo) && epx.f(this.b, ((VkChangePhoneRouterInfo) obj).b);
    }

    public final int hashCode() {
        String str = this.b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("VkChangePhoneRouterInfo(accessTokenForLk="), this.b, ')');
    }
}
