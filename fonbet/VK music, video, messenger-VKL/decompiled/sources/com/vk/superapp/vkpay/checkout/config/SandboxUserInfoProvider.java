package com.vk.superapp.vkpay.checkout.config;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.vkpay.checkout.data.VkCheckoutUserInfo;
import xsna.drm0;
import xsna.k9x;
import xsna.swe0;

/* compiled from: SandboxUserInfoProvider.kt */
/* loaded from: classes6.dex */
public final class SandboxUserInfoProvider implements UserInfoProvider {
    public static final Serializer.c<SandboxUserInfoProvider> CREATOR = new a();
    public final VkCheckoutUserInfo b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<SandboxUserInfoProvider> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SandboxUserInfoProvider a(Serializer serializer) {
            return new SandboxUserInfoProvider(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SandboxUserInfoProvider[i];
        }
    }

    public SandboxUserInfoProvider(VkCheckoutUserInfo vkCheckoutUserInfo) {
        this.b = vkCheckoutUserInfo;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.vk.superapp.vkpay.checkout.config.UserInfoProvider
    public final UserId getUserId() {
        return this.b.b;
    }

    @Override // com.vk.superapp.vkpay.checkout.config.UserInfoProvider
    public final String qb() {
        String str = this.b.c;
        return ((Object) drm0.f0(str, new k9x(0, 1, 1))) + " *** *** ** " + ((Object) drm0.f0(str, swe0.q(str.length() - 2, str.length())));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public SandboxUserInfoProvider(Serializer serializer) {
        this((VkCheckoutUserInfo) serializer.G(VkCheckoutUserInfo.class.getClassLoader()));
    }
}
