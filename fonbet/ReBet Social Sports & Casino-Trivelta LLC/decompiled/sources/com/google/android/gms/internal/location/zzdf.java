package com.google.android.gms.internal.location;

import E9.b;
import V9.I;
import V9.J;
import V9.L;
import V9.M;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* loaded from: classes2.dex */
public final class zzdf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdf> CREATOR = new zzdg();
    private final int zza;
    private final zzdd zzb;
    private final M zzc;
    private final J zzd;
    private final PendingIntent zze;
    private final zzk zzf;
    private final String zzg;

    public zzdf(int i10, zzdd zzddVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        this.zza = i10;
        this.zzb = zzddVar;
        zzk zzkVar = null;
        this.zzc = iBinder != null ? L.zzb(iBinder) : null;
        this.zze = pendingIntent;
        this.zzd = iBinder2 != null ? I.zzb(iBinder2) : null;
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzkVar = queryLocalInterface instanceof zzk ? (zzk) queryLocalInterface : new zzi(iBinder3);
        }
        this.zzf = zzkVar;
        this.zzg = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.u(parcel, 1, this.zza);
        b.D(parcel, 2, this.zzb, i10, false);
        M m10 = this.zzc;
        b.t(parcel, 3, m10 == null ? null : m10.asBinder(), false);
        b.D(parcel, 4, this.zze, i10, false);
        J j10 = this.zzd;
        b.t(parcel, 5, j10 == null ? null : j10.asBinder(), false);
        zzk zzkVar = this.zzf;
        b.t(parcel, 6, zzkVar != null ? zzkVar.asBinder() : null, false);
        b.F(parcel, 8, this.zzg, false);
        b.b(parcel, a10);
    }
}
