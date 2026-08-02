package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbew;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcc extends zzbeu implements zzce {
    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zze(String str, zzdx zzdxVar) throws RemoteException {
        Parcel J = J();
        J.writeString(str);
        zzbew.e(J, zzdxVar);
        Z1(J, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zzf(String str) throws RemoteException {
        Parcel J = J();
        J.writeString(str);
        Z1(J, 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zzg(String str, zze zzeVar) throws RemoteException {
        Parcel J = J();
        J.writeString(str);
        zzbew.c(J, zzeVar);
        Z1(J, 3);
    }
}
