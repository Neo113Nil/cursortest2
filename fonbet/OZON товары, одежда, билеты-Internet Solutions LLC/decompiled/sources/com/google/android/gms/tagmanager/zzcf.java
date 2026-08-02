package com.google.android.gms.tagmanager;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.gtm.zzat;
import com.google.android.gms.internal.gtm.zzau;

/* loaded from: classes9.dex */
public abstract class zzcf extends zzat implements zzcg {
    public zzcf() {
        super("com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
    }

    @Override // com.google.android.gms.internal.gtm.zzat
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 == 1) {
            zzc(parcel.readString(), zzau.zzb(parcel));
            parcel2.writeNoException();
        } else {
            if (i11 != 2) {
                return false;
            }
            String zzb = zzb(parcel.readString(), zzau.zzb(parcel));
            parcel2.writeNoException();
            parcel2.writeString(zzb);
        }
        return true;
    }
}
