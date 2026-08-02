package com.google.android.gms.internal.tapandpay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes12.dex */
public final class zzg extends zzb implements zze {
    public zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tapandpay.internal.ITapAndPayService");
    }

    @Override // com.google.android.gms.internal.tapandpay.zze
    public final void zza(zzf zzfVar) throws RemoteException {
        Parcel zza = zza();
        zzd.zza(zza, zzfVar);
        zza(10, zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zze
    public final void zzb(zzf zzfVar) throws RemoteException {
        Parcel zza = zza();
        zzd.zza(zza, zzfVar);
        zza(21, zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zze
    public final void zzc(int i, String str, zzf zzfVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeString(str);
        zzd.zza(zza, zzfVar);
        zza(25, zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zze
    public final void zzd(zzf zzfVar) throws RemoteException {
        Parcel zza = zza();
        zzd.zza(zza, zzfVar);
        zza(30, zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zze
    public final void zze(zzf zzfVar) throws RemoteException {
        Parcel zza = zza();
        zzd.zza(zza, zzfVar);
        zza(31, zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zze
    public final void zza(int i, String str, zzf zzfVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeString(str);
        zzd.zza(zza, zzfVar);
        zza(22, zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zze
    public final void zzb(int i, String str, zzf zzfVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeString(str);
        zzd.zza(zza, zzfVar);
        zza(24, zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zze
    public final void zzc(zzf zzfVar) throws RemoteException {
        Parcel zza = zza();
        zzd.zza(zza, zzfVar);
        zza(29, zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zze
    public final void zza(int i, String str, String str2, int i2, zzf zzfVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeInt(i2);
        zzd.zza(zza, zzfVar);
        zza(23, zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zze
    public final void zza(PushTokenizeRequest pushTokenizeRequest, zzf zzfVar) throws RemoteException {
        Parcel zza = zza();
        zzd.zza(zza, pushTokenizeRequest);
        zzd.zza(zza, zzfVar);
        zza(28, zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zze
    public final void zza(String str, zzf zzfVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzd.zza(zza, zzfVar);
        zza(61, zza);
    }
}
