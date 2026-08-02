package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbew;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcq extends zzbeu implements zzcs {
    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zza(zze zzeVar) throws RemoteException {
        Parcel J = J();
        zzbew.c(J, zzeVar);
        Z1(J, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zzb() throws RemoteException {
        Z1(J(), 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zzc() throws RemoteException {
        Z1(J(), 3);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zzd() throws RemoteException {
        Z1(J(), 4);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zze() throws RemoteException {
        Z1(J(), 5);
    }
}
