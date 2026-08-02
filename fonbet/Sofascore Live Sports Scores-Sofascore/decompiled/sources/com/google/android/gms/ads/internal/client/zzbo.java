package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbmk;
import com.google.android.gms.internal.ads.zzbnq;
import com.google.android.gms.internal.ads.zzbnt;
import com.google.android.gms.internal.ads.zzbnw;
import com.google.android.gms.internal.ads.zzbnz;
import com.google.android.gms.internal.ads.zzbod;
import com.google.android.gms.internal.ads.zzbog;
import com.google.android.gms.internal.ads.zzbst;
import com.google.android.gms.internal.ads.zzbtc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbo extends zzbeu implements zzbq {
    public zzbo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final zzbn zze() throws RemoteException {
        zzbn zzblVar;
        Parcel S1 = S1(J(), 1);
        IBinder readStrongBinder = S1.readStrongBinder();
        if (readStrongBinder == null) {
            zzblVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzblVar = queryLocalInterface instanceof zzbn ? (zzbn) queryLocalInterface : new zzbl(readStrongBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
        }
        S1.recycle();
        return zzblVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(zzbh zzbhVar) throws RemoteException {
        Parcel J = J();
        zzbew.e(J, zzbhVar);
        Z1(J, 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(zzbnq zzbnqVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(zzbnt zzbntVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(String str, zzbnz zzbnzVar, zzbnw zzbnwVar) throws RemoteException {
        Parcel J = J();
        J.writeString(str);
        zzbew.e(J, zzbnzVar);
        zzbew.e(J, zzbnwVar);
        Z1(J, 5);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(zzbmk zzbmkVar) throws RemoteException {
        Parcel J = J();
        zzbew.c(J, zzbmkVar);
        Z1(J, 6);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(zzbod zzbodVar, zzr zzrVar) throws RemoteException {
        Parcel J = J();
        zzbew.e(J, zzbodVar);
        zzbew.c(J, zzrVar);
        Z1(J, 8);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(zzbog zzbogVar) throws RemoteException {
        Parcel J = J();
        zzbew.e(J, zzbogVar);
        Z1(J, 10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(zzbst zzbstVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(zzbtc zzbtcVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException {
        Parcel J = J();
        zzbew.c(J, adManagerAdViewOptions);
        Z1(J, 15);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(zzcp zzcpVar) throws RemoteException {
        throw null;
    }
}
