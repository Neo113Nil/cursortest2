package com.vk.auth.verification.checkaccess;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import defpackage.q0;
import xsna.epx;
import xsna.qoy;

/* compiled from: VkCheckAccessRequiredData.kt */
/* loaded from: classes.dex */
public final class VkCheckAccessRequiredData implements Serializer.StreamParcelable {
    public static final Serializer.c<VkCheckAccessRequiredData> CREATOR = new a();
    public final String b;
    public final boolean c;
    public final String d;
    public final boolean e;

    /* compiled from: Serializer.kt */
    /* loaded from: classes15.dex */
    public static final class a extends Serializer.c<VkCheckAccessRequiredData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VkCheckAccessRequiredData a(Serializer serializer) {
            return new VkCheckAccessRequiredData(serializer.H(), serializer.m(), serializer.H(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VkCheckAccessRequiredData[i];
        }
    }

    public VkCheckAccessRequiredData(String str, boolean z, String str2, boolean z2) {
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = z2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
        serializer.j0(this.d);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkCheckAccessRequiredData)) {
            return false;
        }
        VkCheckAccessRequiredData vkCheckAccessRequiredData = (VkCheckAccessRequiredData) obj;
        return epx.f(this.b, vkCheckAccessRequiredData.b) && this.c == vkCheckAccessRequiredData.c && epx.f(this.d, vkCheckAccessRequiredData.d) && this.e == vkCheckAccessRequiredData.e;
    }

    public final int hashCode() {
        String str = this.b;
        int b = qoy.b((str == null ? 0 : str.hashCode()) * 31, 31, this.c);
        String str2 = this.d;
        return Boolean.hashCode(this.e) + ((b + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkCheckAccessRequiredData(satToken=");
        sb.append(this.b);
        sb.append(", isFullscreen=");
        sb.append(this.c);
        sb.append(", phoneMask=");
        sb.append(this.d);
        sb.append(", requestAccessFactor=");
        return q0.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
