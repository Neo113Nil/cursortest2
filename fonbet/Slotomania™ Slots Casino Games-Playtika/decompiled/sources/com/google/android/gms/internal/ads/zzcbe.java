package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzcbe extends zzbds implements IInterface {
    zzcbe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzcbd zzcbdVar, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, zzcbdVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzda(2, zza);
    }
}
