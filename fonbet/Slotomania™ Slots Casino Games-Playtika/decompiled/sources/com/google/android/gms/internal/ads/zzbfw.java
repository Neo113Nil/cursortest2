package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes6.dex */
public abstract class zzbfw extends zzbdt implements zzbfx {
    public zzbfw() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    public static zzbfx zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        return queryLocalInterface instanceof zzbfx ? (zzbfx) queryLocalInterface : new zzbfv(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbge zzbgcVar;
        switch (i) {
            case 2:
                com.google.android.gms.ads.internal.client.zzbu zze = zze();
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zze);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (queryLocalInterface instanceof zzbgb) {
                    }
                }
                zzbdu.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    zzbgcVar = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    zzbgcVar = queryLocalInterface2 instanceof zzbge ? (zzbge) queryLocalInterface2 : new zzbgc(readStrongBinder2);
                }
                zzbdu.zzh(parcel);
                zzf(asInterface, zzbgcVar);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.ads.internal.client.zzdx zzg = zzg();
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzg);
                return true;
            case 6:
                boolean zza = zzbdu.zza(parcel);
                zzbdu.zzh(parcel);
                zzh(zza);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzi(zzb);
                parcel2.writeNoException();
                return true;
            case 8:
                String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 9:
                long zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeLong(zzk);
                return true;
            case 10:
                long readLong = parcel.readLong();
                zzbdu.zzh(parcel);
                zzl(readLong);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
