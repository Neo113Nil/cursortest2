package com.vk.superapp.vkpay.checkout.api.dto.model;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VkMerchantInfo.kt */
/* loaded from: classes6.dex */
public final class VkMerchantInfo implements Serializer.StreamParcelable {
    public static final Serializer.c<VkMerchantInfo> CREATOR = new a();
    public final int b;
    public final String c;
    public final String d;
    public final String e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VkMerchantInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VkMerchantInfo a(Serializer serializer) {
            return new VkMerchantInfo(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VkMerchantInfo[i];
        }
    }

    public VkMerchantInfo(int i, String str, String str2, String str3) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkMerchantInfo)) {
            return false;
        }
        VkMerchantInfo vkMerchantInfo = (VkMerchantInfo) obj;
        return this.b == vkMerchantInfo.b && epx.f(this.c, vkMerchantInfo.c) && epx.f(this.d, vkMerchantInfo.d) && epx.f(this.e, vkMerchantInfo.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + urd0.a(urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkMerchantInfo(merchantId=");
        sb.append(this.b);
        sb.append(", merchantSignature=");
        sb.append(this.c);
        sb.append(", merchantUserId=");
        sb.append(this.d);
        sb.append(", merchantName=");
        return ho8.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public /* synthetic */ VkMerchantInfo(int i, String str, String str2, String str3, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3);
    }

    public VkMerchantInfo(Serializer serializer) {
        this(serializer.u(), serializer.H(), serializer.H(), serializer.H());
    }
}
