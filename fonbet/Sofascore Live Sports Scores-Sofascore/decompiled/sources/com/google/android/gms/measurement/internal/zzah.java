package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new zzai();
    public String a;
    public String b;
    public zzpl c;
    public long d;
    public boolean e;
    public String f;
    public final zzbh g;
    public long h;
    public zzbh i;
    public final long j;
    public final zzbh k;

    public zzah(zzah zzahVar) {
        Preconditions.i(zzahVar);
        this.a = zzahVar.a;
        this.b = zzahVar.b;
        this.c = zzahVar.c;
        this.d = zzahVar.d;
        this.e = zzahVar.e;
        this.f = zzahVar.f;
        this.g = zzahVar.g;
        this.h = zzahVar.h;
        this.i = zzahVar.i;
        this.j = zzahVar.j;
        this.k = zzahVar.k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 2, this.a, false);
        SafeParcelWriter.m(parcel, 3, this.b, false);
        SafeParcelWriter.l(parcel, 4, this.c, i, false);
        long j = this.d;
        SafeParcelWriter.r(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z = this.e;
        SafeParcelWriter.r(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        SafeParcelWriter.m(parcel, 7, this.f, false);
        SafeParcelWriter.l(parcel, 8, this.g, i, false);
        long j2 = this.h;
        SafeParcelWriter.r(parcel, 9, 8);
        parcel.writeLong(j2);
        SafeParcelWriter.l(parcel, 10, this.i, i, false);
        SafeParcelWriter.r(parcel, 11, 8);
        parcel.writeLong(this.j);
        SafeParcelWriter.l(parcel, 12, this.k, i, false);
        SafeParcelWriter.t(parcel, s);
    }

    public zzah(String str, String str2, zzpl zzplVar, long j, boolean z, String str3, zzbh zzbhVar, long j2, zzbh zzbhVar2, long j3, zzbh zzbhVar3) {
        this.a = str;
        this.b = str2;
        this.c = zzplVar;
        this.d = j;
        this.e = z;
        this.f = str3;
        this.g = zzbhVar;
        this.h = j2;
        this.i = zzbhVar2;
        this.j = j3;
        this.k = zzbhVar3;
    }
}
