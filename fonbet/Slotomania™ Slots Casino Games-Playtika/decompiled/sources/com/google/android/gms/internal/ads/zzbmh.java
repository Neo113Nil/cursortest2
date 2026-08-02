package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzbmh extends zzbds implements zzbmj {
    zzbmh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final String zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(1, zza);
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final zzbls zzf(String str) throws RemoteException {
        zzbls zzblqVar;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(2, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzblqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzblqVar = queryLocalInterface instanceof zzbls ? (zzbls) queryLocalInterface : new zzblq(readStrongBinder);
        }
        zzcZ.recycle();
        return zzblqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final List zzg() throws RemoteException {
        Parcel zzcZ = zzcZ(3, zza());
        ArrayList<String> createStringArrayList = zzcZ.createStringArrayList();
        zzcZ.recycle();
        return createStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final String zzh() throws RemoteException {
        Parcel zzcZ = zzcZ(4, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final void zzi(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final void zzj() throws RemoteException {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final com.google.android.gms.ads.internal.client.zzea zzk() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final void zzl() throws RemoteException {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final IObjectWrapper zzm() throws RemoteException {
        Parcel zzcZ = zzcZ(9, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final boolean zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        Parcel zzcZ = zzcZ(10, zza);
        boolean zza2 = zzbdu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final boolean zzo() throws RemoteException {
        Parcel zzcZ = zzcZ(12, zza());
        boolean zza = zzbdu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final boolean zzp() throws RemoteException {
        Parcel zzcZ = zzcZ(13, zza());
        boolean zza = zzbdu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final void zzq(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzda(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final void zzr() throws RemoteException {
        zzda(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final zzblp zzs() throws RemoteException {
        zzblp zzblnVar;
        Parcel zzcZ = zzcZ(16, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzblnVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzblnVar = queryLocalInterface instanceof zzblp ? (zzblp) queryLocalInterface : new zzbln(readStrongBinder);
        }
        zzcZ.recycle();
        return zzblnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        Parcel zzcZ = zzcZ(17, zza);
        boolean zza2 = zzbdu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }
}
