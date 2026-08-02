package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes9.dex */
public final class zzhh extends zzas implements zzhj {
    zzhh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.internal.ITagManagerService");
    }

    @Override // com.google.android.gms.internal.gtm.zzhj
    public final void zze() throws RemoteException {
        zzl(102, zza());
    }

    @Override // com.google.android.gms.internal.gtm.zzhj
    public final void zzf(String str, Bundle bundle, String str2, long j11, boolean z11) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzau.zzd(zza, bundle);
        zza.writeString(str2);
        zza.writeLong(j11);
        zzau.zzc(zza, z11);
        zzl(101, zza);
    }

    @Override // com.google.android.gms.internal.gtm.zzhj
    public final void zzg(String str, String str2, String str3) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zzhj
    public final void zzh(String str, String str2, String str3, zzhg zzhgVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeString(null);
        zzau.zze(zza, zzhgVar);
        zzl(2, zza);
    }

    @Override // com.google.android.gms.internal.gtm.zzhj
    public final void zzi() throws RemoteException {
        zzl(3, zza());
    }
}
