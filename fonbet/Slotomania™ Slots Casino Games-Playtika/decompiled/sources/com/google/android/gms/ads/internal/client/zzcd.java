package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbdt;
import com.google.android.gms.internal.ads.zzbdu;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes2.dex */
public abstract class zzcd extends zzbdt implements zzce {
    public zzcd() {
        super("com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzdx zzdvVar;
        if (i == 1) {
            String readString = parcel.readString();
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzdvVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
                zzdvVar = queryLocalInterface instanceof zzdx ? (zzdx) queryLocalInterface : new zzdv(readStrongBinder);
            }
            zzbdu.zzh(parcel);
            zze(readString, zzdvVar);
        } else if (i == 2) {
            String readString2 = parcel.readString();
            zzbdu.zzh(parcel);
            zzf(readString2);
        } else {
            if (i != 3) {
                return false;
            }
            String readString3 = parcel.readString();
            zze zzeVar = (zze) zzbdu.zzb(parcel, zze.CREATOR);
            zzbdu.zzh(parcel);
            zzg(readString3, zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
