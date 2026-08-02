package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbds;
import com.google.android.gms.internal.ads.zzbdu;
import com.google.android.gms.internal.ads.zzblh;
import com.google.android.gms.internal.ads.zzbmn;
import com.google.android.gms.internal.ads.zzbmq;
import com.google.android.gms.internal.ads.zzbmt;
import com.google.android.gms.internal.ads.zzbmw;
import com.google.android.gms.internal.ads.zzbna;
import com.google.android.gms.internal.ads.zzbnd;
import com.google.android.gms.internal.ads.zzbrp;
import com.google.android.gms.internal.ads.zzbry;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzbo extends zzbds implements zzbq {
    zzbo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final zzbn zze() throws RemoteException {
        zzbn zzblVar;
        Parcel zzcZ = zzcZ(1, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzblVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzblVar = queryLocalInterface instanceof zzbn ? (zzbn) queryLocalInterface : new zzbl(readStrongBinder);
        }
        zzcZ.recycle();
        return zzblVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(zzbh zzbhVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, zzbhVar);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(zzbmn zzbmnVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(zzbmq zzbmqVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(String str, zzbmw zzbmwVar, zzbmt zzbmtVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbdu.zze(zza, zzbmwVar);
        zzbdu.zze(zza, zzbmtVar);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(zzblh zzblhVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, zzblhVar);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(zzbna zzbnaVar, zzr zzrVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, zzbnaVar);
        zzbdu.zzc(zza, zzrVar);
        zzda(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(zzbnd zzbndVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, zzbndVar);
        zzda(10, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(zzbrp zzbrpVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(zzbry zzbryVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, adManagerAdViewOptions);
        zzda(15, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(zzcp zzcpVar) throws RemoteException {
        throw null;
    }
}
