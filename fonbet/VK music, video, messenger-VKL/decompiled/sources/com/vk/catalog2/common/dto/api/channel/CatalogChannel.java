package com.vk.catalog2.common.dto.api.channel;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import defpackage.q0;
import xsna.epx;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: CatalogChannel.kt */
/* loaded from: classes16.dex */
public final class CatalogChannel implements Serializer.StreamParcelable {
    public static final Serializer.c<CatalogChannel> CREATOR = new a();
    public final long b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public boolean h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogChannel> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogChannel a(Serializer serializer) {
            long w = serializer.w();
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            String H2 = serializer.H();
            return new CatalogChannel(w, H, H2 != null ? H2 : "", serializer.m(), serializer.m(), serializer.m(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogChannel[i];
        }
    }

    public CatalogChannel(long j, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogChannel)) {
            return false;
        }
        CatalogChannel catalogChannel = (CatalogChannel) obj;
        return this.b == catalogChannel.b && epx.f(this.c, catalogChannel.c) && epx.f(this.d, catalogChannel.d) && this.e == catalogChannel.e && this.f == catalogChannel.f && this.g == catalogChannel.g && this.h == catalogChannel.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + qoy.b(qoy.b(qoy.b(urd0.a(urd0.a(Long.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogChannel(id=");
        sb.append(this.b);
        sb.append(", avatar=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append(this.d);
        sb.append(", verified=");
        sb.append(this.e);
        sb.append(", isClosed=");
        sb.append(this.f);
        sb.append(", isMember=");
        sb.append(this.g);
        sb.append(", justSubscribed=");
        return q0.a(sb, this.h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public /* synthetic */ CatalogChannel(long j, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i, zcl zclVar) {
        this(j, str, str2, z, z2, z3, (i & 64) != 0 ? false : z4);
    }
}
