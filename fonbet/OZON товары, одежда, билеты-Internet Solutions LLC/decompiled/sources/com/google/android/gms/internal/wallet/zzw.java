package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentDataRequest;

/* loaded from: classes.dex */
public final class zzw extends zzb implements zzt {
    zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wallet.internal.IOwService");
    }

    @Override // com.google.android.gms.internal.wallet.zzt
    public final void zza(CreateWalletObjectsRequest createWalletObjectsRequest, Bundle bundle, zzv zzvVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzd.zza(obtainAndWriteInterfaceToken, createWalletObjectsRequest);
        zzd.zza(obtainAndWriteInterfaceToken, bundle);
        zzd.zza(obtainAndWriteInterfaceToken, zzvVar);
        zza(6, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.wallet.zzt
    public final void zza(IsReadyToPayRequest isReadyToPayRequest, Bundle bundle, zzv zzvVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzd.zza(obtainAndWriteInterfaceToken, isReadyToPayRequest);
        zzd.zza(obtainAndWriteInterfaceToken, bundle);
        zzd.zza(obtainAndWriteInterfaceToken, zzvVar);
        zza(14, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.wallet.zzt
    public final void zza(PaymentDataRequest paymentDataRequest, Bundle bundle, zzv zzvVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzd.zza(obtainAndWriteInterfaceToken, paymentDataRequest);
        zzd.zza(obtainAndWriteInterfaceToken, bundle);
        zzd.zza(obtainAndWriteInterfaceToken, zzvVar);
        zza(19, obtainAndWriteInterfaceToken);
    }
}
