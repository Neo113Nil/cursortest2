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
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.AbstractC3181e;
import com.google.android.gms.common.internal.C3180d;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentRequest;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.x;

/* loaded from: classes2.dex */
public final class zzy extends AbstractC3181e {
    private final Context zze;
    private final int zzf;
    private final String zzg;
    private final int zzh;
    private final boolean zzi;

    public zzy(Context context, Looper looper, C3180d c3180d, f.b bVar, f.c cVar, int i10, int i11, boolean z10) {
        super(context, looper, 4, c3180d, bVar, cVar);
        this.zze = context;
        this.zzf = i10;
        Account a10 = c3180d.a();
        this.zzg = a10 != null ? a10.name : null;
        this.zzh = i11;
        this.zzi = z10;
    }

    private final Bundle zzu() {
        String packageName = this.zze.getPackageName();
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", this.zzf);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", this.zzi);
        bundle.putString("androidPackageName", packageName);
        String str = this.zzg;
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", this.zzh);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        return queryLocalInterface instanceof zzo ? (zzo) queryLocalInterface : new zzo(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final Feature[] getApiFeatures() {
        return x.zzi;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c, com.google.android.gms.common.api.C3117a.f
    public final int getMinApkVersion() {
        return 12600000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final String getStartServiceAction() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final boolean requiresAccount() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final boolean usesClientTelemetry() {
        return true;
    }

    public final void zzp(CreateWalletObjectsRequest createWalletObjectsRequest, int i10) {
        zzs zzsVar = new zzs((Activity) this.zze, i10);
        try {
            ((zzo) getService()).zzd(createWalletObjectsRequest, zzu(), zzsVar);
        } catch (RemoteException e10) {
            Log.e("WalletClientImpl", "RemoteException creating wallet objects", e10);
            zzsVar.zzh(8, Bundle.EMPTY);
        }
    }

    public final void zzq(CreateWalletObjectsRequest createWalletObjectsRequest, TaskCompletionSource taskCompletionSource) {
        Bundle zzu = zzu();
        zzu.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        zzv zzvVar = new zzv(taskCompletionSource);
        try {
            ((zzo) getService()).zzd(createWalletObjectsRequest, zzu, zzvVar);
        } catch (RemoteException e10) {
            Log.e("WalletClientImpl", "RemoteException creating wallet objects", e10);
            zzvVar.zzh(8, Bundle.EMPTY);
        }
    }

    public final void zzr(PaymentCardRecognitionIntentRequest paymentCardRecognitionIntentRequest, TaskCompletionSource taskCompletionSource) {
        try {
            ((zzo) getService()).zze(paymentCardRecognitionIntentRequest, zzu(), new zzw(taskCompletionSource));
        } catch (RemoteException e10) {
            Log.e("WalletClientImpl", "RemoteException during getPaymentCardRecognitionIntent", e10);
            Status status = Status.f32274e;
        }
    }

    public final void zzs(IsReadyToPayRequest isReadyToPayRequest, TaskCompletionSource taskCompletionSource) {
        zzu zzuVar = new zzu(taskCompletionSource);
        try {
            ((zzo) getService()).zzf(isReadyToPayRequest, zzu(), zzuVar);
        } catch (RemoteException e10) {
            Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e10);
            zzuVar.zzc(Status.f32277h, false, Bundle.EMPTY);
        }
    }

    public final void zzt(PaymentDataRequest paymentDataRequest, TaskCompletionSource taskCompletionSource) {
        Bundle zzu = zzu();
        zzu.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        zzx zzxVar = new zzx(taskCompletionSource);
        try {
            ((zzo) getService()).zzg(paymentDataRequest, zzu, zzxVar);
        } catch (RemoteException e10) {
            Log.e("WalletClientImpl", "RemoteException getting payment data", e10);
            zzxVar.zzf(Status.f32277h, null, Bundle.EMPTY);
        }
    }
}
