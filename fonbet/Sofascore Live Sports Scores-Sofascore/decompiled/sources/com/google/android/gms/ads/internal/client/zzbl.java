package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbew;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbl extends zzbeu implements zzbn {
    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zze(zzm zzmVar) throws RemoteException {
        Parcel J = J();
        zzbew.c(J, zzmVar);
        Z1(J, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final String zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final boolean zzg() throws RemoteException {
        Parcel S1 = S1(J(), 3);
        ClassLoader classLoader = zzbew.a;
        boolean z = S1.readInt() != 0;
        S1.recycle();
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final String zzh() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzi(zzm zzmVar, int i) throws RemoteException {
        Parcel J = J();
        zzbew.c(J, zzmVar);
        J.writeInt(i);
        Z1(J, 5);
    }
}
