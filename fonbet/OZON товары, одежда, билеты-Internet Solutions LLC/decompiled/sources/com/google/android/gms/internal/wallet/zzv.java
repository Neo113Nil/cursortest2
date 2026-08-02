package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.zzak;

/* loaded from: classes.dex */
public interface zzv extends IInterface {
    void zza(int i11, Bundle bundle) throws RemoteException;

    void zza(int i11, FullWallet fullWallet, Bundle bundle) throws RemoteException;

    void zza(int i11, MaskedWallet maskedWallet, Bundle bundle) throws RemoteException;

    void zza(int i11, boolean z11, Bundle bundle) throws RemoteException;

    void zza(Status status, Bundle bundle) throws RemoteException;

    void zza(Status status, zzl zzlVar, Bundle bundle) throws RemoteException;

    void zza(Status status, zzn zznVar, Bundle bundle) throws RemoteException;

    void zza(Status status, zzp zzpVar, Bundle bundle) throws RemoteException;

    void zza(Status status, zzr zzrVar, Bundle bundle) throws RemoteException;

    void zza(Status status, PaymentData paymentData, Bundle bundle) throws RemoteException;

    void zza(Status status, zzak zzakVar, Bundle bundle) throws RemoteException;

    void zza(Status status, boolean z11, Bundle bundle) throws RemoteException;

    void zzb(int i11, boolean z11, Bundle bundle) throws RemoteException;

    void zzb(Status status, Bundle bundle) throws RemoteException;

    void zzc(Status status, Bundle bundle) throws RemoteException;
}
