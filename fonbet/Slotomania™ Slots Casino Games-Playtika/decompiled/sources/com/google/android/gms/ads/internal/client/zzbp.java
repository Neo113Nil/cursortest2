package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbdt;
import com.google.android.gms.internal.ads.zzbdu;
import com.google.android.gms.internal.ads.zzblh;
import com.google.android.gms.internal.ads.zzbmm;
import com.google.android.gms.internal.ads.zzbmn;
import com.google.android.gms.internal.ads.zzbmp;
import com.google.android.gms.internal.ads.zzbmq;
import com.google.android.gms.internal.ads.zzbms;
import com.google.android.gms.internal.ads.zzbmt;
import com.google.android.gms.internal.ads.zzbmv;
import com.google.android.gms.internal.ads.zzbmw;
import com.google.android.gms.internal.ads.zzbmz;
import com.google.android.gms.internal.ads.zzbna;
import com.google.android.gms.internal.ads.zzbnc;
import com.google.android.gms.internal.ads.zzbnd;
import com.google.android.gms.internal.ads.zzbrp;
import com.google.android.gms.internal.ads.zzbrx;
import com.google.android.gms.internal.ads.zzbry;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes2.dex */
public abstract class zzbp extends zzbdt implements zzbq {
    public zzbp() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbh zzbhVar = null;
        zzcp zzcpVar = null;
        switch (i) {
            case 1:
                zzbn zze = zze();
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zze);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbhVar = queryLocalInterface instanceof zzbh ? (zzbh) queryLocalInterface : new zzbf(readStrongBinder);
                }
                zzbdu.zzh(parcel);
                zzf(zzbhVar);
                parcel2.writeNoException();
                return true;
            case 3:
                zzbmn zzb = zzbmm.zzb(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzg(zzb);
                parcel2.writeNoException();
                return true;
            case 4:
                zzbmq zzb2 = zzbmp.zzb(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzh(zzb2);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                zzbmw zzb3 = zzbmv.zzb(parcel.readStrongBinder());
                zzbmt zzb4 = zzbms.zzb(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzi(readString, zzb3, zzb4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzblh zzblhVar = (zzblh) zzbdu.zzb(parcel, zzblh.CREATOR);
                zzbdu.zzh(parcel);
                zzj(zzblhVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcpVar = queryLocalInterface2 instanceof zzcp ? (zzcp) queryLocalInterface2 : new zzcp(readStrongBinder2);
                }
                zzbdu.zzh(parcel);
                zzq(zzcpVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbna zzb5 = zzbmz.zzb(parcel.readStrongBinder());
                zzr zzrVar = (zzr) zzbdu.zzb(parcel, zzr.CREATOR);
                zzbdu.zzh(parcel);
                zzk(zzb5, zzrVar);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) zzbdu.zzb(parcel, PublisherAdViewOptions.CREATOR);
                zzbdu.zzh(parcel);
                zzl(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                zzbnd zzb6 = zzbnc.zzb(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzm(zzb6);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzbrp zzbrpVar = (zzbrp) zzbdu.zzb(parcel, zzbrp.CREATOR);
                zzbdu.zzh(parcel);
                zzn(zzbrpVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbry zzb7 = zzbrx.zzb(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzo(zzb7);
                parcel2.writeNoException();
                return true;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) zzbdu.zzb(parcel, AdManagerAdViewOptions.CREATOR);
                zzbdu.zzh(parcel);
                zzp(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }
}
