package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes5.dex */
public abstract class zzbrr extends zzbdt implements zzbrs {
    public zzbrr() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbrv zzbrtVar;
        if (i == 3) {
            com.google.android.gms.ads.internal.client.zzea zzb = zzb();
            parcel2.writeNoException();
            zzbdu.zze(parcel2, zzb);
            return true;
        }
        if (i == 4) {
            zzc();
            parcel2.writeNoException();
            return true;
        }
        if (i == 5) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbrtVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                zzbrtVar = queryLocalInterface instanceof zzbrv ? (zzbrv) queryLocalInterface : new zzbrt(readStrongBinder);
            }
            zzbdu.zzh(parcel);
            zzd(asInterface, zzbrtVar);
            parcel2.writeNoException();
            return true;
        }
        if (i == 6) {
            IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzbdu.zzh(parcel);
            zze(asInterface2);
            parcel2.writeNoException();
            return true;
        }
        if (i != 7) {
            return false;
        }
        zzblp zzf = zzf();
        parcel2.writeNoException();
        zzbdu.zze(parcel2, zzf);
        return true;
    }
}
