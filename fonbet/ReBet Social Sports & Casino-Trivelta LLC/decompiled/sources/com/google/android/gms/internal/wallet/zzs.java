package com.google.android.gms.internal.wallet;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class zzs extends zzt {
    private final WeakReference zza;
    private final int zzb;

    public zzs(Activity activity, int i10) {
        this.zza = new WeakReference(activity);
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.wallet.zzt, com.google.android.gms.internal.wallet.zzq
    public final void zzb(int i10, FullWallet fullWallet, Bundle bundle) {
        int i11;
        Activity activity = (Activity) this.zza.get();
        if (activity == null) {
            return;
        }
        ConnectionResult connectionResult = new ConnectionResult(i10, bundle != null ? (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT") : null);
        if (connectionResult.k()) {
            try {
                connectionResult.m(activity, this.zzb);
                return;
            } catch (IntentSender.SendIntentException e10) {
                Log.w("WalletClientImpl", "Exception starting pending intent", e10);
                return;
            }
        }
        Intent intent = new Intent();
        if (connectionResult.l()) {
            intent.putExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET", fullWallet);
            i11 = -1;
        } else {
            int i12 = i10 == 408 ? 0 : 1;
            intent.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", i10);
            i11 = i12;
        }
        PendingIntent createPendingResult = activity.createPendingResult(this.zzb, intent, 1073741824);
        if (createPendingResult == null) {
            Log.w("WalletClientImpl", "Null pending result returned for onFullWalletLoaded");
            return;
        }
        try {
            createPendingResult.send(i11);
        } catch (PendingIntent.CanceledException e11) {
            Log.w("WalletClientImpl", "Exception setting pending result", e11);
        }
    }

    @Override // com.google.android.gms.internal.wallet.zzt, com.google.android.gms.internal.wallet.zzq
    public final void zzd(int i10, MaskedWallet maskedWallet, Bundle bundle) {
        int i11;
        Activity activity = (Activity) this.zza.get();
        if (activity == null) {
            return;
        }
        ConnectionResult connectionResult = new ConnectionResult(i10, bundle != null ? (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT") : null);
        if (connectionResult.k()) {
            try {
                connectionResult.m(activity, this.zzb);
                return;
            } catch (IntentSender.SendIntentException e10) {
                Log.w("WalletClientImpl", "Exception starting pending intent", e10);
                return;
            }
        }
        Intent intent = new Intent();
        if (connectionResult.l()) {
            intent.putExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", maskedWallet);
            i11 = -1;
        } else {
            int i12 = i10 == 408 ? 0 : 1;
            intent.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", i10);
            i11 = i12;
        }
        PendingIntent createPendingResult = activity.createPendingResult(this.zzb, intent, 1073741824);
        if (createPendingResult == null) {
            Log.w("WalletClientImpl", "Null pending result returned for onMaskedWalletLoaded");
            return;
        }
        try {
            createPendingResult.send(i11);
        } catch (PendingIntent.CanceledException e11) {
            Log.w("WalletClientImpl", "Exception setting pending result", e11);
        }
    }

    @Override // com.google.android.gms.internal.wallet.zzt, com.google.android.gms.internal.wallet.zzq
    public final void zzg(int i10, boolean z10, Bundle bundle) {
        Activity activity = (Activity) this.zza.get();
        if (activity == null) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("com.google.android.gm.wallet.EXTRA_IS_USER_PREAUTHORIZED", z10);
        PendingIntent createPendingResult = activity.createPendingResult(this.zzb, intent, 1073741824);
        if (createPendingResult == null) {
            Log.w("WalletClientImpl", "Null pending result returned for onPreAuthorizationDetermined");
            return;
        }
        try {
            createPendingResult.send(-1);
        } catch (PendingIntent.CanceledException e10) {
            Log.w("WalletClientImpl", "Exception setting pending result", e10);
        }
    }

    @Override // com.google.android.gms.internal.wallet.zzt, com.google.android.gms.internal.wallet.zzq
    public final void zzh(int i10, Bundle bundle) {
        AbstractC3191o.n(bundle, "Bundle should not be null");
        Activity activity = (Activity) this.zza.get();
        if (activity == null) {
            return;
        }
        ConnectionResult connectionResult = new ConnectionResult(i10, (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT"));
        if (connectionResult.k()) {
            try {
                connectionResult.m(activity, this.zzb);
                return;
            } catch (IntentSender.SendIntentException e10) {
                Log.w("WalletClientImpl", "Exception starting pending intent", e10);
                return;
            }
        }
        Log.e("WalletClientImpl", "Create Wallet Objects confirmation UI will not be shown connection result: ".concat(connectionResult.toString()));
        Intent intent = new Intent();
        intent.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", 413);
        PendingIntent createPendingResult = activity.createPendingResult(this.zzb, intent, 1073741824);
        if (createPendingResult == null) {
            Log.w("WalletClientImpl", "Null pending result returned for onWalletObjectsCreated");
            return;
        }
        try {
            createPendingResult.send(1);
        } catch (PendingIntent.CanceledException e11) {
            Log.w("WalletClientImpl", "Exception setting pending result", e11);
        }
    }
}
