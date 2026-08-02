package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.zzp;
import com.google.android.gms.common.zzr;
import com.google.android.gms.common.zzt;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes2.dex */
public final class V extends zza implements X {
    public V(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.X
    public final zzr D0(zzp zzpVar) {
        Parcel zza = zza();
        zzc.zzc(zza, zzpVar);
        Parcel zzB = zzB(8, zza);
        zzr zzrVar = (zzr) zzc.zzb(zzB, zzr.CREATOR);
        zzB.recycle();
        return zzrVar;
    }

    @Override // com.google.android.gms.common.internal.X
    public final zzr s0(zzp zzpVar) {
        Parcel zza = zza();
        zzc.zzc(zza, zzpVar);
        Parcel zzB = zzB(6, zza);
        zzr zzrVar = (zzr) zzc.zzb(zzB, zzr.CREATOR);
        zzB.recycle();
        return zzrVar;
    }

    @Override // com.google.android.gms.common.internal.X
    public final boolean z0(zzt zztVar, N9.b bVar) {
        Parcel zza = zza();
        zzc.zzc(zza, zztVar);
        zzc.zze(zza, bVar);
        Parcel zzB = zzB(5, zza);
        boolean zza2 = zzc.zza(zzB);
        zzB.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.common.internal.X
    public final boolean zzg() {
        Parcel zzB = zzB(7, zza());
        boolean zza = zzc.zza(zzB);
        zzB.recycle();
        return zza;
    }
}
