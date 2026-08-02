package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbdt;
import com.google.android.gms.internal.ads.zzbdu;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes4.dex */
public abstract class zzdw extends zzbdt implements zzdx {
    public zzdw() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public static zzdx zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return queryLocalInterface instanceof zzdx ? (zzdx) queryLocalInterface : new zzdv(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 2:
                String zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 3:
                List zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(zzg);
                return true;
            case 4:
                zzv zzh = zzh();
                parcel2.writeNoException();
                zzbdu.zzd(parcel2, zzh);
                return true;
            case 5:
                Bundle zzi = zzi();
                parcel2.writeNoException();
                zzbdu.zzd(parcel2, zzi);
                return true;
            case 6:
                String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            default:
                return false;
        }
    }
}
