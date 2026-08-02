package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes5.dex */
public abstract class zzbms extends zzbdt implements zzbmt {
    public zzbms() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static zzbmt zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        return queryLocalInterface instanceof zzbmt ? (zzbmt) queryLocalInterface : new zzbmr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbmj zzbmhVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            zzbmhVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            zzbmhVar = queryLocalInterface instanceof zzbmj ? (zzbmj) queryLocalInterface : new zzbmh(readStrongBinder);
        }
        String readString = parcel.readString();
        zzbdu.zzh(parcel);
        zze(zzbmhVar, readString);
        parcel2.writeNoException();
        return true;
    }
}
