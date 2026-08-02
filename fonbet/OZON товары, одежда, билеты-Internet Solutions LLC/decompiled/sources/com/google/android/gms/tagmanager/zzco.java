package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.gtm.zzat;
import com.google.android.gms.internal.gtm.zzau;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class zzco extends zzat implements zzcp {
    public zzco() {
        super("com.google.android.gms.tagmanager.IMeasurementProxy");
    }

    @Override // com.google.android.gms.internal.gtm.zzat
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 == 2) {
            zzc(parcel.readString(), parcel.readString(), (Bundle) zzau.zza(parcel, Bundle.CREATOR), parcel.readLong());
            parcel2.writeNoException();
            return true;
        }
        if (i11 == 11) {
            Map zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeMap(zzb);
            return true;
        }
        zzcm zzcmVar = null;
        zzcj zzcjVar = null;
        if (i11 == 21) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.tagmanager.IMeasurementInterceptor");
                zzcmVar = queryLocalInterface instanceof zzcm ? (zzcm) queryLocalInterface : new zzck(readStrongBinder);
            }
            zze(zzcmVar);
            parcel2.writeNoException();
            return true;
        }
        if (i11 != 22) {
            return false;
        }
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.tagmanager.IMeasurementEventListener");
            zzcjVar = queryLocalInterface2 instanceof zzcj ? (zzcj) queryLocalInterface2 : new zzch(readStrongBinder2);
        }
        zzd(zzcjVar);
        parcel2.writeNoException();
        return true;
    }
}
