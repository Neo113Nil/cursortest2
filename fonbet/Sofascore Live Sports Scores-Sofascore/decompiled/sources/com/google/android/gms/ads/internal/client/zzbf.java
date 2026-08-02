package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbew;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbf extends zzbeu implements zzbh {
    public zzbf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zza() throws RemoteException {
        Z1(J(), 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzb(int i) throws RemoteException {
        Parcel J = J();
        J.writeInt(i);
        Z1(J, 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzc(zze zzeVar) throws RemoteException {
        Parcel J = J();
        zzbew.c(J, zzeVar);
        Z1(J, 8);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzd() throws RemoteException {
        Z1(J(), 3);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zze() throws RemoteException {
        Z1(J(), 4);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzf() throws RemoteException {
        Z1(J(), 5);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzg() throws RemoteException {
        Z1(J(), 6);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() throws RemoteException {
        Z1(J(), 9);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() throws RemoteException {
        Z1(J(), 7);
    }
}
