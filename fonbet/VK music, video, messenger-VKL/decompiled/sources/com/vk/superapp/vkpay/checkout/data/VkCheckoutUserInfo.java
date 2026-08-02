package com.vk.superapp.vkpay.checkout.data;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;

/* compiled from: VkCheckoutUserInfo.kt */
/* loaded from: classes6.dex */
public final class VkCheckoutUserInfo implements Serializer.StreamParcelable {
    public static final Serializer.c<VkCheckoutUserInfo> CREATOR = new a();
    public final UserId b;
    public final String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VkCheckoutUserInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VkCheckoutUserInfo a(Serializer serializer) {
            return new VkCheckoutUserInfo(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VkCheckoutUserInfo[i];
        }
    }

    public VkCheckoutUserInfo(UserId userId, String str) {
        this.b = userId;
        this.c = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.j0(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkCheckoutUserInfo)) {
            return false;
        }
        VkCheckoutUserInfo vkCheckoutUserInfo = (VkCheckoutUserInfo) obj;
        return epx.f(this.b, vkCheckoutUserInfo.b) && epx.f(this.c, vkCheckoutUserInfo.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkCheckoutUserInfo(vkId=");
        sb.append(this.b);
        sb.append(", phoneNumber=");
        return ho8.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public VkCheckoutUserInfo(Serializer serializer) {
        this((UserId) serializer.A(UserId.class.getClassLoader()), serializer.H());
    }
}
