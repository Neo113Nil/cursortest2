package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new zzc();
    public final long a;
    public final boolean b;
    public final WorkSource c;
    public final String d;
    public final int[] e;
    public final boolean f;
    public final String g;
    public final long h;
    public final String i;

    public zzb(long j, boolean z, WorkSource workSource, String str, int[] iArr, boolean z2, String str2, long j2, String str3) {
        this.a = j;
        this.b = z;
        this.c = workSource;
        this.d = str;
        this.e = iArr;
        this.f = z2;
        this.g = str2;
        this.h = j2;
        this.i = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Preconditions.i(parcel);
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 8);
        parcel.writeLong(this.a);
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        SafeParcelWriter.l(parcel, 3, this.c, i, false);
        SafeParcelWriter.m(parcel, 4, this.d, false);
        SafeParcelWriter.g(parcel, 5, this.e);
        SafeParcelWriter.r(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        SafeParcelWriter.m(parcel, 7, this.g, false);
        SafeParcelWriter.r(parcel, 8, 8);
        parcel.writeLong(this.h);
        SafeParcelWriter.m(parcel, 9, this.i, false);
        SafeParcelWriter.t(parcel, s);
    }
}
