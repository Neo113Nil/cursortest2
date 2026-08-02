package com.google.android.gms.internal.tapandpay;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes12.dex */
public interface zze extends IInterface {
    void zza(int i, String str, zzf zzfVar) throws RemoteException;

    void zza(int i, String str, String str2, int i2, zzf zzfVar) throws RemoteException;

    void zza(zzf zzfVar) throws RemoteException;

    void zza(PushTokenizeRequest pushTokenizeRequest, zzf zzfVar) throws RemoteException;

    void zza(String str, zzf zzfVar) throws RemoteException;

    void zzb(int i, String str, zzf zzfVar) throws RemoteException;

    void zzb(zzf zzfVar) throws RemoteException;

    void zzc(int i, String str, zzf zzfVar) throws RemoteException;

    void zzc(zzf zzfVar) throws RemoteException;

    void zzd(zzf zzfVar) throws RemoteException;

    void zze(zzf zzfVar) throws RemoteException;
}
