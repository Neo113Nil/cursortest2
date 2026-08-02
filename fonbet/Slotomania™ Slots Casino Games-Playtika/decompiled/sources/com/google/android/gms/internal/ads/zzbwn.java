package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzbwn extends zzbds implements zzbwp {
    zzbwn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zze(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzr zzrVar, zzbws zzbwsVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zzbdu.zzc(zza, bundle);
        zzbdu.zzc(zza, bundle2);
        zzbdu.zzc(zza, zzrVar);
        zzbdu.zze(zza, zzbwsVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final zzbxe zzf() throws RemoteException {
        Parcel zzcZ = zzcZ(2, zza());
        zzbxe zzbxeVar = (zzbxe) zzbdu.zzb(zzcZ, zzbxe.CREATOR);
        zzcZ.recycle();
        return zzbxeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final zzbxe zzg() throws RemoteException {
        Parcel zzcZ = zzcZ(3, zza());
        zzbxe zzbxeVar = (zzbxe) zzbdu.zzb(zzcZ, zzbxe.CREATOR);
        zzcZ.recycle();
        return zzbxeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final com.google.android.gms.ads.internal.client.zzea zzh() throws RemoteException {
        Parcel zzcZ = zzcZ(5, zza());
        com.google.android.gms.ads.internal.client.zzea zzb = com.google.android.gms.ads.internal.client.zzdz.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbwd zzbwdVar, zzbuw zzbuwVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbdu.zzc(zza, zzmVar);
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zze(zza, zzbwdVar);
        zzbdu.zze(zza, zzbuwVar);
        zzbdu.zzc(zza, zzrVar);
        zzda(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbwg zzbwgVar, zzbuw zzbuwVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbdu.zzc(zza, zzmVar);
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zze(zza, zzbwgVar);
        zzbdu.zze(zza, zzbuwVar);
        zzda(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final boolean zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        Parcel zzcZ = zzcZ(15, zza);
        boolean zza2 = zzbdu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbwm zzbwmVar, zzbuw zzbuwVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbdu.zzc(zza, zzmVar);
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zze(zza, zzbwmVar);
        zzbdu.zze(zza, zzbuwVar);
        zzda(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final boolean zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        Parcel zzcZ = zzcZ(17, zza);
        boolean zza2 = zzbdu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbwj zzbwjVar, zzbuw zzbuwVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbdu.zzc(zza, zzmVar);
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zze(zza, zzbwjVar);
        zzbdu.zze(zza, zzbuwVar);
        zzda(18, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzo(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(19, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbwm zzbwmVar, zzbuw zzbuwVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbdu.zzc(zza, zzmVar);
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zze(zza, zzbwmVar);
        zzbdu.zze(zza, zzbuwVar);
        zzda(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzq(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbwd zzbwdVar, zzbuw zzbuwVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbdu.zzc(zza, zzmVar);
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zze(zza, zzbwdVar);
        zzbdu.zze(zza, zzbuwVar);
        zzbdu.zzc(zza, zzrVar);
        zzda(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzr(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbwj zzbwjVar, zzbuw zzbuwVar, zzblh zzblhVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbdu.zzc(zza, zzmVar);
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zze(zza, zzbwjVar);
        zzbdu.zze(zza, zzbuwVar);
        zzbdu.zzc(zza, zzblhVar);
        zzda(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzs(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbwa zzbwaVar, zzbuw zzbuwVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbdu.zzc(zza, zzmVar);
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zze(zza, zzbwaVar);
        zzbdu.zze(zza, zzbuwVar);
        zzda(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        Parcel zzcZ = zzcZ(24, zza);
        boolean zza2 = zzbdu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }
}
