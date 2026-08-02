package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzv> CREATOR = new zzw();

    @SafeParcelable.Field
    public final String zza;

    @SafeParcelable.Field
    public long zzb;

    @Nullable
    @SafeParcelable.Field
    public zze zzc;

    @SafeParcelable.Field
    public final Bundle zzd;

    @SafeParcelable.Field
    public final String zze;

    @SafeParcelable.Field
    public final String zzf;

    @SafeParcelable.Field
    public final String zzg;

    @SafeParcelable.Field
    public final String zzh;

    @SafeParcelable.Constructor
    public zzv(@SafeParcelable.Param String str, @SafeParcelable.Param long j, @Nullable @SafeParcelable.Param zze zzeVar, @SafeParcelable.Param Bundle bundle, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param String str5) {
        this.zza = str;
        this.zzb = j;
        this.zzc = zzeVar;
        this.zzd = bundle;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = str4;
        this.zzh = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 1, str, false);
        long j = this.zzb;
        SafeParcelWriter.r(parcel, 2, 8);
        parcel.writeLong(j);
        SafeParcelWriter.l(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.b(parcel, 4, this.zzd);
        SafeParcelWriter.m(parcel, 5, this.zze, false);
        SafeParcelWriter.m(parcel, 6, this.zzf, false);
        SafeParcelWriter.m(parcel, 7, this.zzg, false);
        SafeParcelWriter.m(parcel, 8, this.zzh, false);
        SafeParcelWriter.t(parcel, s);
    }
}
