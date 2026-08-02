package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();

    @SafeParcelable.Field
    public final boolean zza;

    @SafeParcelable.Field
    public final boolean zzb;

    @SafeParcelable.Field
    public final String zzc;

    @SafeParcelable.Field
    public final boolean zzd;

    @SafeParcelable.Field
    public final float zze;

    @SafeParcelable.Field
    public final int zzf;

    @SafeParcelable.Field
    public final boolean zzg;

    @SafeParcelable.Field
    public final boolean zzh;

    @SafeParcelable.Field
    public final boolean zzi;

    public zzl(boolean z, boolean z2, String str, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = str;
        this.zzd = z3;
        this.zze = f;
        this.zzf = i;
        this.zzg = z4;
        this.zzh = z5;
        this.zzi = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.zza;
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.zzb;
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(z2 ? 1 : 0);
        SafeParcelWriter.m(parcel, 4, this.zzc, false);
        boolean z3 = this.zzd;
        SafeParcelWriter.r(parcel, 5, 4);
        parcel.writeInt(z3 ? 1 : 0);
        float f = this.zze;
        SafeParcelWriter.r(parcel, 6, 4);
        parcel.writeFloat(f);
        int i2 = this.zzf;
        SafeParcelWriter.r(parcel, 7, 4);
        parcel.writeInt(i2);
        boolean z4 = this.zzg;
        SafeParcelWriter.r(parcel, 8, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = this.zzh;
        SafeParcelWriter.r(parcel, 9, 4);
        parcel.writeInt(z5 ? 1 : 0);
        boolean z6 = this.zzi;
        SafeParcelWriter.r(parcel, 10, 4);
        parcel.writeInt(z6 ? 1 : 0);
        SafeParcelWriter.t(parcel, s);
    }

    public zzl(boolean z, boolean z2, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this(z, z2, null, z3, f, -1, z4, z5, z6);
    }
}
