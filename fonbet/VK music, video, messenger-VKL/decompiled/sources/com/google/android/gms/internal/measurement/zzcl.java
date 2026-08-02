package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class zzcl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcl> CREATOR = new zzcm();
    public final long zza;
    public final long zzb;
    public final boolean zzc;

    @Nullable
    public final String zzd;

    @Nullable
    public final String zze;

    @Nullable
    public final String zzf;

    @Nullable
    public final Bundle zzg;

    @Nullable
    public final String zzh;

    public zzcl(long j, long j2, boolean z, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Bundle bundle, @Nullable String str4) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = z;
        this.zzd = str;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = bundle;
        this.zzh = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        long j = this.zza;
        ozg0.v(parcel, 1, 8);
        parcel.writeLong(j);
        long j2 = this.zzb;
        ozg0.v(parcel, 2, 8);
        parcel.writeLong(j2);
        boolean z = this.zzc;
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        ozg0.q(parcel, 4, this.zzd, false);
        ozg0.q(parcel, 5, this.zze, false);
        ozg0.q(parcel, 6, this.zzf, false);
        ozg0.d(parcel, 7, this.zzg, false);
        ozg0.q(parcel, 8, this.zzh, false);
        ozg0.x(w, parcel);
    }
}
