package com.vk.superapp.vkpay.checkout.api.dto.model;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkOrderDescription;
import java.util.HashMap;
import java.util.UUID;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: VkExtraPaymentOptions.kt */
/* loaded from: classes6.dex */
public final class VkExtraPaymentOptions implements Serializer.StreamParcelable {
    public static final Serializer.c<VkExtraPaymentOptions> CREATOR = new a();
    public final boolean b;
    public final VkOrderDescription c;
    public final String d;
    public final String e;
    public String f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VkExtraPaymentOptions> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VkExtraPaymentOptions a(Serializer serializer) {
            return new VkExtraPaymentOptions(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VkExtraPaymentOptions[i];
        }
    }

    public VkExtraPaymentOptions() {
        this(false, null, null, null, 15, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.i0(this.c);
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
        if (!(obj instanceof VkExtraPaymentOptions)) {
            return false;
        }
        VkExtraPaymentOptions vkExtraPaymentOptions = (VkExtraPaymentOptions) obj;
        return this.b == vkExtraPaymentOptions.b && epx.f(this.c, vkExtraPaymentOptions.c) && epx.f(this.d, vkExtraPaymentOptions.d) && epx.f(this.e, vkExtraPaymentOptions.e);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (Boolean.hashCode(this.b) * 31)) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkExtraPaymentOptions(needHold=");
        sb.append(this.b);
        sb.append(", uiDescription=");
        sb.append(this.c);
        sb.append(", extraJsonParameters=");
        sb.append(this.d);
        sb.append(", receiptDescription=");
        return ho8.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        Serializer.b.h(this, parcel);
    }

    public VkExtraPaymentOptions(boolean z, VkOrderDescription vkOrderDescription, String str, String str2) {
        this.b = z;
        this.c = vkOrderDescription;
        this.d = str;
        this.e = str2;
        this.f = UUID.randomUUID().toString();
    }

    public /* synthetic */ VkExtraPaymentOptions(boolean z, VkOrderDescription vkOrderDescription, String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? VkOrderDescription.NoDescription.b : vkOrderDescription, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }

    public VkExtraPaymentOptions(Serializer serializer) {
        this(serializer.m(), (VkOrderDescription) serializer.G(VkOrderDescription.class.getClassLoader()), serializer.H(), serializer.H());
    }
}
