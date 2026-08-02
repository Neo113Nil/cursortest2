package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbds;
import com.google.android.gms.internal.ads.zzbdu;
import com.google.android.gms.internal.ads.zzbrd;
import com.google.android.gms.internal.ads.zzbrk;
import com.google.android.gms.internal.ads.zzbuq;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzcw extends zzbds implements zzcy {
    zzcw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zze() throws RemoteException {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzf(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzg(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzh(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzbdu.zza;
        zza.writeInt(z ? 1 : 0);
        zzda(4, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzi(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzj(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(null);
        zzbdu.zze(zza, iObjectWrapper);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final float zzk() throws RemoteException {
        Parcel zzcZ = zzcZ(7, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final boolean zzl() throws RemoteException {
        Parcel zzcZ = zzcZ(8, zza());
        boolean zza = zzbdu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final String zzm() throws RemoteException {
        Parcel zzcZ = zzcZ(9, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzn(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(10, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzo(zzbuq zzbuqVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, zzbuqVar);
        zzda(11, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzp(zzbrk zzbrkVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, zzbrkVar);
        zzda(12, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final List zzq() throws RemoteException {
        Parcel zzcZ = zzcZ(13, zza());
        ArrayList createTypedArrayList = zzcZ.createTypedArrayList(zzbrd.CREATOR);
        zzcZ.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzr(zzfr zzfrVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, zzfrVar);
        zzda(14, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzs() throws RemoteException {
        zzda(15, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzt(zzdk zzdkVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, zzdkVar);
        zzda(16, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzu(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzbdu.zza;
        zza.writeInt(z ? 1 : 0);
        zzda(17, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzv(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(18, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzw() throws RemoteException {
        zzda(19, zza());
    }
}
