package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes6.dex */
public abstract class zzbwc extends zzbdt implements zzbwd {
    public zzbwc() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzbdu.zzh(parcel);
            zze(asInterface);
        } else if (i == 2) {
            String readString = parcel.readString();
            zzbdu.zzh(parcel);
            zzf(readString);
        } else if (i == 3) {
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzbdu.zzh(parcel);
            zzg(zzeVar);
        } else {
            if (i != 4) {
                return false;
            }
            zzbuz zzb = zzbuy.zzb(parcel.readStrongBinder());
            zzbdu.zzh(parcel);
            zzh(zzb);
        }
        parcel2.writeNoException();
        return true;
    }
}
