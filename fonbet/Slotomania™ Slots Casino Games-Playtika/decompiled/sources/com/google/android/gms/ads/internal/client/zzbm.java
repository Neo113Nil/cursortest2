package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbdt;
import com.google.android.gms.internal.ads.zzbdu;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes2.dex */
public abstract class zzbm extends zzbdt implements zzbn {
    public zzbm() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzm zzmVar = (zzm) zzbdu.zzb(parcel, zzm.CREATOR);
            zzbdu.zzh(parcel);
            zze(zzmVar);
            parcel2.writeNoException();
        } else if (i == 2) {
            String zzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(zzf);
        } else if (i == 3) {
            boolean zzg = zzg();
            parcel2.writeNoException();
            int i3 = zzbdu.zza;
            parcel2.writeInt(zzg ? 1 : 0);
        } else if (i == 4) {
            String zzh = zzh();
            parcel2.writeNoException();
            parcel2.writeString(zzh);
        } else {
            if (i != 5) {
                return false;
            }
            zzm zzmVar2 = (zzm) zzbdu.zzb(parcel, zzm.CREATOR);
            int readInt = parcel.readInt();
            zzbdu.zzh(parcel);
            zzi(zzmVar2, readInt);
            parcel2.writeNoException();
        }
        return true;
    }
}
