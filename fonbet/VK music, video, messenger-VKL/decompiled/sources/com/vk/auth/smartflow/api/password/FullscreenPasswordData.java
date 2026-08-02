package com.vk.auth.smartflow.api.password;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import defpackage.q0;
import xsna.epx;
import xsna.qoy;
import xsna.zcl;

/* compiled from: FullscreenPasswordData.kt */
/* loaded from: classes15.dex */
public final class FullscreenPasswordData implements Serializer.StreamParcelable {
    public static final Serializer.c<FullscreenPasswordData> CREATOR = new a();
    public final String b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final String f;
    public final boolean g;

    /* compiled from: FullscreenPasswordData.kt */
    public static final class a extends Serializer.c<FullscreenPasswordData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final FullscreenPasswordData a(Serializer serializer) {
            return new FullscreenPasswordData(serializer.H(), serializer.m(), serializer.H(), serializer.m(), serializer.H(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FullscreenPasswordData[i];
        }
    }

    public FullscreenPasswordData(String str, boolean z, String str2, boolean z2, String str3, boolean z3) {
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = z2;
        this.f = str3;
        this.g = z3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
        serializer.j0(this.d);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.j0(this.f);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FullscreenPasswordData)) {
            return false;
        }
        FullscreenPasswordData fullscreenPasswordData = (FullscreenPasswordData) obj;
        return epx.f(this.b, fullscreenPasswordData.b) && this.c == fullscreenPasswordData.c && epx.f(this.d, fullscreenPasswordData.d) && this.e == fullscreenPasswordData.e && epx.f(this.f, fullscreenPasswordData.f) && this.g == fullscreenPasswordData.g;
    }

    public final int hashCode() {
        int b = qoy.b(this.b.hashCode() * 31, 31, this.c);
        String str = this.d;
        int b2 = qoy.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        String str2 = this.f;
        return Boolean.hashCode(this.g) + ((b2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FullscreenPasswordData(login=");
        sb.append(this.b);
        sb.append(", isLoginPhone=");
        sb.append(this.c);
        sb.append(", sid=");
        sb.append(this.d);
        sb.append(", confirmAnotherWay=");
        sb.append(this.e);
        sb.append(", trustedHash=");
        sb.append(this.f);
        sb.append(", isBindFlow=");
        return q0.a(sb, this.g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public /* synthetic */ FullscreenPasswordData(String str, boolean z, String str2, boolean z2, String str3, boolean z3, int i, zcl zclVar) {
        this(str, z, str2, z2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? false : z3);
    }
}
