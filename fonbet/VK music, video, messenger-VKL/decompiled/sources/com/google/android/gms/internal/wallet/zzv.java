package com.google.android.gms.internal.wallet;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import xsna.ej5;
import xsna.olc;
import xsna.sd01;
import xsna.u2u;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes12.dex */
public final class zzv extends u2u<zzo> {
    private final int environment;
    private final int theme;
    private final String zzcc;
    private final boolean zzef;
    private final Context zzer;

    public zzv(Context context, Looper looper, olc olcVar, c.b bVar, c.InterfaceC0114c interfaceC0114c, int i, int i2, boolean z) {
        super(context, looper, 4, olcVar, bVar, interfaceC0114c);
        this.zzer = context;
        this.environment = i;
        Account account = olcVar.a;
        this.zzcc = account != null ? account.name : null;
        this.theme = i2;
        this.zzef = z;
    }

    private final Bundle zzd() {
        int i = this.environment;
        String packageName = this.zzer.getPackageName();
        String str = this.zzcc;
        int i2 = this.theme;
        boolean z = this.zzef;
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", i);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", z);
        bundle.putString("androidPackageName", packageName);
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", i2);
        return bundle;
    }

    @Override // xsna.rd6
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        return queryLocalInterface instanceof zzo ? (zzo) queryLocalInterface : new zzr(iBinder);
    }

    @Override // xsna.rd6
    public final Feature[] getApiFeatures() {
        return sd01.a;
    }

    @Override // xsna.rd6, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12600000;
    }

    @Override // xsna.rd6
    public final String getServiceDescriptor() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // xsna.rd6
    public final String getStartServiceAction() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    @Override // xsna.rd6
    public final boolean requiresAccount() {
        return true;
    }

    public final void zza(CreateWalletObjectsRequest createWalletObjectsRequest, int i) {
        zzu zzuVar = new zzu((Activity) this.zzer, i);
        try {
            ((zzo) getService()).zza(createWalletObjectsRequest, zzd(), zzuVar);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException creating wallet objects", e);
            zzuVar.zza(8, Bundle.EMPTY);
        }
    }

    public final void zza(CreateWalletObjectsRequest createWalletObjectsRequest, TaskCompletionSource<ej5> taskCompletionSource) {
        Bundle zzd = zzd();
        zzd.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        zzz zzzVar = new zzz(taskCompletionSource);
        try {
            ((zzo) getService()).zza(createWalletObjectsRequest, zzd, zzzVar);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException creating wallet objects", e);
            zzzVar.zza(8, Bundle.EMPTY);
        }
    }

    public final void zza(IsReadyToPayRequest isReadyToPayRequest, TaskCompletionSource<Boolean> taskCompletionSource) throws RemoteException {
        zzw zzwVar = new zzw(taskCompletionSource);
        try {
            ((zzo) getService()).zza(isReadyToPayRequest, zzd(), zzwVar);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e);
            zzwVar.zza(Status.h, false, Bundle.EMPTY);
        }
    }

    public final void zza(PaymentDataRequest paymentDataRequest, TaskCompletionSource<PaymentData> taskCompletionSource) {
        Bundle zzd = zzd();
        zzd.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        zzy zzyVar = new zzy(taskCompletionSource);
        try {
            ((zzo) getService()).zza(paymentDataRequest, zzd, zzyVar);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException getting payment data", e);
            zzyVar.zza(Status.h, (PaymentData) null, Bundle.EMPTY);
        }
    }
}
