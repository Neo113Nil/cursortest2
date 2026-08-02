package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbmz;
import com.google.android.gms.internal.ads.zzbne;
import com.google.android.gms.internal.ads.zzbrg;
import com.google.android.gms.internal.ads.zzbri;
import com.google.android.gms.internal.ads.zzbrl;
import com.google.android.gms.internal.ads.zzbvt;
import com.google.android.gms.internal.ads.zzbvu;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcck;
import com.google.android.gms.internal.ads.zzcda;
import com.google.android.gms.internal.ads.zzcfe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzcn extends zzbev implements zzco {
    public zzcn() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        zzbri zzbriVar = null;
        switch (i) {
            case 1:
                IObjectWrapper S1 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzr zzrVar = (zzr) zzbew.b(parcel, zzr.CREATOR);
                String readString = parcel.readString();
                zzbvu E4 = zzbvt.E4(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzbew.f(parcel);
                zzbu zza = zza(S1, zzrVar, readString, E4, readInt);
                parcel2.writeNoException();
                zzbew.e(parcel2, zza);
                return true;
            case 2:
                IObjectWrapper S12 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzr zzrVar2 = (zzr) zzbew.b(parcel, zzr.CREATOR);
                String readString2 = parcel.readString();
                zzbvu E42 = zzbvt.E4(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzbew.f(parcel);
                zzbu zzb = zzb(S12, zzrVar2, readString2, E42, readInt2);
                parcel2.writeNoException();
                zzbew.e(parcel2, zzb);
                return true;
            case 3:
                IObjectWrapper S13 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                zzbvu E43 = zzbvt.E4(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                zzbew.f(parcel);
                zzbq zzc = zzc(S13, readString3, E43, readInt3);
                parcel2.writeNoException();
                zzbew.e(parcel2, zzc);
                return true;
            case 4:
                IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbew.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 5:
                IObjectWrapper S14 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                IObjectWrapper S15 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbew.f(parcel);
                zzbmz zzd = zzd(S14, S15);
                parcel2.writeNoException();
                zzbew.e(parcel2, zzd);
                return true;
            case 6:
                IObjectWrapper S16 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbvu E44 = zzbvt.E4(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                zzbew.f(parcel);
                zzcck zze = zze(S16, E44, readInt4);
                parcel2.writeNoException();
                zzbew.e(parcel2, zze);
                return true;
            case 7:
                IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbew.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 8:
                IObjectWrapper S17 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbew.f(parcel);
                zzbzt zzf = zzf(S17);
                parcel2.writeNoException();
                zzbew.e(parcel2, zzf);
                return true;
            case 9:
                IObjectWrapper S18 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                zzbew.f(parcel);
                zzcy zzh = zzh(S18, readInt5);
                parcel2.writeNoException();
                zzbew.e(parcel2, zzh);
                return true;
            case 10:
                IObjectWrapper S19 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzr zzrVar3 = (zzr) zzbew.b(parcel, zzr.CREATOR);
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                zzbew.f(parcel);
                zzbu zzi = zzi(S19, zzrVar3, readString4, readInt6);
                parcel2.writeNoException();
                zzbew.e(parcel2, zzi);
                return true;
            case 11:
                IObjectWrapper S110 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                IObjectWrapper S111 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                IObjectWrapper S112 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbew.f(parcel);
                zzbne zzj = zzj(S110, S111, S112);
                parcel2.writeNoException();
                zzbew.e(parcel2, zzj);
                return true;
            case 12:
                IObjectWrapper S113 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                zzbvu E45 = zzbvt.E4(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                zzbew.f(parcel);
                zzcda zzk = zzk(S113, readString5, E45, readInt7);
                parcel2.writeNoException();
                zzbew.e(parcel2, zzk);
                return true;
            case 13:
                IObjectWrapper S114 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzr zzrVar4 = (zzr) zzbew.b(parcel, zzr.CREATOR);
                String readString6 = parcel.readString();
                zzbvu E46 = zzbvt.E4(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                zzbew.f(parcel);
                zzbu zzl = zzl(S114, zzrVar4, readString6, E46, readInt8);
                parcel2.writeNoException();
                zzbew.e(parcel2, zzl);
                return true;
            case 14:
                IObjectWrapper S115 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbvu E47 = zzbvt.E4(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                zzbew.f(parcel);
                zzcfe zzm = zzm(S115, E47, readInt9);
                parcel2.writeNoException();
                zzbew.e(parcel2, zzm);
                return true;
            case 15:
                IObjectWrapper S116 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbvu E48 = zzbvt.E4(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                zzbew.f(parcel);
                zzbzm zzn = zzn(S116, E48, readInt10);
                parcel2.writeNoException();
                zzbew.e(parcel2, zzn);
                return true;
            case 16:
                IObjectWrapper S117 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbvu E49 = zzbvt.E4(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
                    zzbriVar = queryLocalInterface instanceof zzbri ? (zzbri) queryLocalInterface : new zzbrg(readStrongBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
                }
                zzbew.f(parcel);
                zzbrl zzo = zzo(S117, E49, readInt11, zzbriVar);
                parcel2.writeNoException();
                zzbew.e(parcel2, zzo);
                return true;
            case 17:
                IObjectWrapper S118 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbvu E410 = zzbvt.E4(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                zzbew.f(parcel);
                zzdt zzp = zzp(S118, E410, readInt12);
                parcel2.writeNoException();
                zzbew.e(parcel2, zzp);
                return true;
            case 18:
                IObjectWrapper S119 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbvu E411 = zzbvt.E4(parcel.readStrongBinder());
                int readInt13 = parcel.readInt();
                zzbew.f(parcel);
                zzch zzg = zzg(S119, E411, readInt13);
                parcel2.writeNoException();
                zzbew.e(parcel2, zzg);
                return true;
            default:
                return false;
        }
    }
}
