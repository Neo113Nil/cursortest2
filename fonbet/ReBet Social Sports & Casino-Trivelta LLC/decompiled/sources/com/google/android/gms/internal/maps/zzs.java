package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class zzs extends zza implements zzu {
    public zzs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IFeatureLayerDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzu
    public final String zzd() {
        Parcel zzJ = zzJ(6, zza());
        String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzu
    public final String zze() {
        Parcel zzJ = zzJ(1, zza());
        String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzu
    public final void zzf(zzal zzalVar) {
        Parcel zza = zza();
        zzc.zzg(zza, zzalVar);
        zzc(4, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzu
    public final void zzg(zzal zzalVar) {
        Parcel zza = zza();
        zzc.zzg(zza, zzalVar);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzu
    public final void zzh(zzat zzatVar) {
        Parcel zza = zza();
        zzc.zzg(zza, zzatVar);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzu
    public final boolean zzi() {
        Parcel zzJ = zzJ(2, zza());
        boolean zzh = zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }
}
