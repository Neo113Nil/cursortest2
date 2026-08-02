package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentDataRequest;

/* loaded from: classes.dex */
public interface zzt extends IInterface {
    void zza(CreateWalletObjectsRequest createWalletObjectsRequest, Bundle bundle, zzv zzvVar) throws RemoteException;

    void zza(IsReadyToPayRequest isReadyToPayRequest, Bundle bundle, zzv zzvVar) throws RemoteException;

    void zza(PaymentDataRequest paymentDataRequest, Bundle bundle, zzv zzvVar) throws RemoteException;
}
