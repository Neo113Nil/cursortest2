package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public abstract class zzcad extends zzbdt implements zzcae {
    public zzcad() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzcai zzcaiVar = null;
        zzcaj zzcajVar = null;
        zzcai zzcaiVar2 = null;
        zzcai zzcaiVar3 = null;
        zzcai zzcaiVar4 = null;
        switch (i) {
            case 1:
                zzbdu.zzh(parcel);
                parcel2.writeNoException();
                zzbdu.zzd(parcel2, null);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (queryLocalInterface instanceof zzcaf) {
                    }
                }
                zzbdu.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                zzcar zzcarVar = (zzcar) zzbdu.zzb(parcel, zzcar.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzcaiVar = queryLocalInterface2 instanceof zzcai ? (zzcai) queryLocalInterface2 : new zzcag(readStrongBinder2);
                }
                zzbdu.zzh(parcel);
                zze(zzcarVar, zzcaiVar);
                parcel2.writeNoException();
                return true;
            case 5:
                zzcar zzcarVar2 = (zzcar) zzbdu.zzb(parcel, zzcar.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzcaiVar4 = queryLocalInterface3 instanceof zzcai ? (zzcai) queryLocalInterface3 : new zzcag(readStrongBinder3);
                }
                zzbdu.zzh(parcel);
                zzf(zzcarVar2, zzcaiVar4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzcar zzcarVar3 = (zzcar) zzbdu.zzb(parcel, zzcar.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzcaiVar3 = queryLocalInterface4 instanceof zzcai ? (zzcai) queryLocalInterface4 : new zzcag(readStrongBinder4);
                }
                zzbdu.zzh(parcel);
                zzg(zzcarVar3, zzcaiVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                String readString = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzcaiVar2 = queryLocalInterface5 instanceof zzcai ? (zzcai) queryLocalInterface5 : new zzcag(readStrongBinder5);
                }
                zzbdu.zzh(parcel);
                zzh(readString, zzcaiVar2);
                parcel2.writeNoException();
                return true;
            case 8:
                zzcaa zzcaaVar = (zzcaa) zzbdu.zzb(parcel, zzcaa.CREATOR);
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    zzcajVar = queryLocalInterface6 instanceof zzcaj ? (zzcaj) queryLocalInterface6 : new zzcaj(readStrongBinder6);
                }
                zzbdu.zzh(parcel);
                zzj(zzcaaVar, zzcajVar);
                parcel2.writeNoException();
                return true;
            case 9:
                String readString2 = parcel.readString();
                zzbdu.zzh(parcel);
                zzi(readString2);
                parcel2.writeNoException();
                return true;
        }
    }
}
