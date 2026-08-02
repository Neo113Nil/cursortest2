package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public abstract class zzbd extends zzb implements zzbe {
    public zzbd() {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbg zzbfVar;
        switch (i) {
            case 1:
                Bundle bundle = (Bundle) zzc.zzb(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbfVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
                    zzbfVar = queryLocalInterface instanceof zzbg ? (zzbg) queryLocalInterface : new zzbf(readStrongBinder);
                }
                zzc.zzf(parcel);
                zzb(bundle, zzbfVar);
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle bundle2 = (Bundle) zzc.zzb(parcel, Bundle.CREATOR);
                int readInt = parcel.readInt();
                zzc.zzf(parcel);
                zzc(bundle2, readInt);
                parcel2.writeNoException();
                return true;
            case 3:
                Bundle bundle3 = (Bundle) zzc.zzb(parcel, Bundle.CREATOR);
                zzc.zzf(parcel);
                zzd(bundle3);
                parcel2.writeNoException();
                return true;
            case 4:
                Bundle bundle4 = (Bundle) zzc.zzb(parcel, Bundle.CREATOR);
                int readInt2 = parcel.readInt();
                zzc.zzf(parcel);
                boolean zze = zze(bundle4, readInt2);
                parcel2.writeNoException();
                parcel2.writeInt(zze ? 1 : 0);
                return true;
            case 5:
                String readString = parcel.readString();
                zzc.zzf(parcel);
                zzf(readString);
                parcel2.writeNoException();
                return true;
            case 6:
                zzg();
                parcel2.writeNoException();
                return true;
            case 7:
                boolean zzh = zzh();
                parcel2.writeNoException();
                int i3 = zzc.zza;
                parcel2.writeInt(zzh ? 1 : 0);
                return true;
            case 8:
                String readString2 = parcel.readString();
                zzc.zzf(parcel);
                Bundle zzi = zzi(readString2);
                parcel2.writeNoException();
                zzc.zzd(parcel2, zzi);
                return true;
            case 9:
                String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 10:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            case 11:
                zzk();
                parcel2.writeNoException();
                return true;
            case 12:
                boolean zzl = zzl();
                parcel2.writeNoException();
                int i4 = zzc.zza;
                parcel2.writeInt(zzl ? 1 : 0);
                return true;
            case 13:
                int readInt3 = parcel.readInt();
                zzc.zzf(parcel);
                zzm(readInt3);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString3 = parcel.readString();
                zzc.zzf(parcel);
                zzn(readString3);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
