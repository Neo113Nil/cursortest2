package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes6.dex */
public abstract class zzbwi extends zzbdt implements zzbwj {
    public zzbwi() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzbvf zzb = zzbve.zzb(parcel.readStrongBinder());
            zzbdu.zzh(parcel);
            zze(zzb);
        } else if (i == 2) {
            String readString = parcel.readString();
            zzbdu.zzh(parcel);
            zzf(readString);
        } else {
            if (i != 3) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzbdu.zzh(parcel);
            zzg(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
