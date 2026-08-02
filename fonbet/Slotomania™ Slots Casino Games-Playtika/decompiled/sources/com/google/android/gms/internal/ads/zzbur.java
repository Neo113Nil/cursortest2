package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzbur extends zzbds implements zzbut {
    zzbur(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final void zzA(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzbdu.zza;
        zza.writeInt(z ? 1 : 0);
        zzda(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final com.google.android.gms.ads.internal.client.zzea zzB() throws RemoteException {
        Parcel zzcZ = zzcZ(26, zza());
        com.google.android.gms.ads.internal.client.zzea zzb = com.google.android.gms.ads.internal.client.zzdz.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final zzbvf zzC() throws RemoteException {
        zzbvf zzbvdVar;
        Parcel zzcZ = zzcZ(27, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvdVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbvdVar = queryLocalInterface instanceof zzbvf ? (zzbvf) queryLocalInterface : new zzbvd(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbvdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final void zzD(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbuw zzbuwVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zzc(zza, zzmVar);
        zza.writeString(str);
        zzbdu.zze(zza, zzbuwVar);
        zzda(28, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final void zzE(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzda(30, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final void zzF(IObjectWrapper iObjectWrapper, zzbrh zzbrhVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zze(zza, zzbrhVar);
        zza.writeTypedList(list);
        zzda(31, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final void zzG(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbuw zzbuwVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zzc(zza, zzmVar);
        zza.writeString(str);
        zzbdu.zze(zza, zzbuwVar);
        zzda(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final zzbxe zzH() throws RemoteException {
        Parcel zzcZ = zzcZ(33, zza());
        zzbxe zzbxeVar = (zzbxe) zzbdu.zzb(zzcZ, zzbxe.CREATOR);
        zzcZ.recycle();
        return zzbxeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final zzbxe zzI() throws RemoteException {
        Parcel zzcZ = zzcZ(34, zza());
        zzbxe zzbxeVar = (zzbxe) zzbdu.zzb(zzcZ, zzbxe.CREATOR);
        zzcZ.recycle();
        return zzbxeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final void zzJ(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbuw zzbuwVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zzc(zza, zzrVar);
        zzbdu.zzc(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzbdu.zze(zza, zzbuwVar);
        zzda(35, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final zzbuz zzK() throws RemoteException {
        zzbuz zzbuxVar;
        Parcel zzcZ = zzcZ(36, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbuxVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbuxVar = queryLocalInterface instanceof zzbuz ? (zzbuz) queryLocalInterface : new zzbux(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbuxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final void zzL(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzda(37, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final void zzM(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbuw zzbuwVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zzc(zza, zzmVar);
        zza.writeString(str);
        zzbdu.zze(zza, zzbuwVar);
        zzda(38, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final void zzN(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzda(39, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final zzbvb zzO() throws RemoteException {
        zzbvb zzbvbVar;
        Parcel zzcZ = zzcZ(15, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvbVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbvbVar = queryLocalInterface instanceof zzbvb ? (zzbvb) queryLocalInterface : new zzbvb(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbvbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final zzbvc zzP() throws RemoteException {
        zzbvc zzbvcVar;
        Parcel zzcZ = zzcZ(16, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvcVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbvcVar = queryLocalInterface instanceof zzbvc ? (zzbvc) queryLocalInterface : new zzbvc(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbvcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final void zze(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbuw zzbuwVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final IObjectWrapper zzf() throws RemoteException {
        Parcel zzcZ = zzcZ(2, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final void zzg(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbuw zzbuwVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final void zzh() throws RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final void zzi() throws RemoteException {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final void zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbuw zzbuwVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zzc(zza, zzrVar);
        zzbdu.zzc(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzbdu.zze(zza, zzbuwVar);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final void zzk(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbuw zzbuwVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zzc(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzbdu.zze(zza, zzbuwVar);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final void zzl() throws RemoteException {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final void zzm() throws RemoteException {
        zzda(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final void zzn(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzcbo zzcboVar, String str2) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zzc(zza, zzmVar);
        zza.writeString(null);
        zzbdu.zze(zza, zzcboVar);
        zza.writeString(str2);
        zzda(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final void zzo(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, zzmVar);
        zza.writeString(str);
        zzda(11, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final void zzp() throws RemoteException {
        zzda(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final boolean zzq() throws RemoteException {
        Parcel zzcZ = zzcZ(13, zza());
        boolean zza = zzbdu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final void zzr(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbuw zzbuwVar, zzblh zzblhVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zzc(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzbdu.zze(zza, zzbuwVar);
        zzbdu.zzc(zza, zzblhVar);
        zza.writeStringList(list);
        zzda(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final Bundle zzs() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final Bundle zzt() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final Bundle zzu() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final void zzv(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzda(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final boolean zzx() throws RemoteException {
        Parcel zzcZ = zzcZ(22, zza());
        boolean zza = zzbdu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final void zzy(IObjectWrapper iObjectWrapper, zzcbo zzcboVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zze(zza, zzcboVar);
        zza.writeStringList(list);
        zzda(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final zzbmj zzz() throws RemoteException {
        throw null;
    }
}
