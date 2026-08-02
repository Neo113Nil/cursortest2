package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzbrw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbrw> CREATOR = new zzbrx();
    public final boolean a;
    public final String b;
    public final int c;
    public final byte[] d;
    public final String[] e;
    public final String[] f;
    public final boolean g;
    public final long h;

    public zzbrw(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.a = z;
        this.b = str;
        this.c = i;
        this.d = bArr;
        this.e = strArr;
        this.f = strArr2;
        this.g = z2;
        this.h = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        SafeParcelWriter.m(parcel, 2, this.b, false);
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(this.c);
        SafeParcelWriter.c(parcel, 4, this.d, false);
        SafeParcelWriter.n(parcel, 5, this.e);
        SafeParcelWriter.n(parcel, 6, this.f);
        SafeParcelWriter.r(parcel, 7, 4);
        parcel.writeInt(this.g ? 1 : 0);
        SafeParcelWriter.r(parcel, 8, 8);
        parcel.writeLong(this.h);
        SafeParcelWriter.t(parcel, s);
    }
}
