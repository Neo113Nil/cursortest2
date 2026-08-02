package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.u0a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;

    public zzr(int i, int i2, long j, String str, boolean z) {
        this.a = z;
        this.b = str;
        this.c = u0a.O(i) - 1;
        this.d = zzc.a(i2) - 1;
        this.e = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        SafeParcelWriter.m(parcel, 2, this.b, false);
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(this.c);
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeInt(this.d);
        SafeParcelWriter.r(parcel, 5, 8);
        parcel.writeLong(this.e);
        SafeParcelWriter.t(parcel, s);
    }
}
