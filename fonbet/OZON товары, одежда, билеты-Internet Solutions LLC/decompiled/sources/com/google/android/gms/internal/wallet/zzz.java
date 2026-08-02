package com.google.android.gms.internal.wallet;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.WalletConstants;
import java.lang.ref.WeakReference;

/* loaded from: classes9.dex */
final class zzz extends zzac {
    private final int zzaa;
    private final WeakReference<Activity> zzfm;

    public zzz(Activity activity, int i11) {
        this.zzfm = new WeakReference<>(activity);
        this.zzaa = i11;
    }

    @Override // com.google.android.gms.internal.wallet.zzac, com.google.android.gms.internal.wallet.zzv
    public final void zza(int i11, MaskedWallet maskedWallet, Bundle bundle) {
        int i12;
        Activity activity = this.zzfm.get();
        if (activity == null) {
            Log.d("WalletClientImpl", "Ignoring onMaskedWalletLoaded, Activity has gone");
            return;
        }
        ConnectionResult connectionResult = new ConnectionResult(i11, bundle != null ? (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT") : null);
        if (connectionResult.hasResolution()) {
            try {
                connectionResult.startResolutionForResult(activity, this.zzaa);
                return;
            } catch (IntentSender.SendIntentException e11) {
                Log.w("WalletClientImpl", "Exception starting pending intent", e11);
                return;
            }
        }
        Intent intent = new Intent();
        if (connectionResult.isSuccess()) {
            intent.putExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", maskedWallet);
            i12 = -1;
        } else {
            int i13 = i11 == 408 ? 0 : 1;
            intent.putExtra(WalletConstants.EXTRA_ERROR_CODE, i11);
            i12 = i13;
        }
        PendingIntent createPendingResult = activity.createPendingResult(this.zzaa, intent, 1073741824);
        if (createPendingResult == null) {
            Log.w("WalletClientImpl", "Null pending result returned for onMaskedWalletLoaded");
            return;
        }
        try {
            createPendingResult.send(i12);
        } catch (PendingIntent.CanceledException e12) {
            Log.w("WalletClientImpl", "Exception setting pending result", e12);
        }
    }

    @Override // com.google.android.gms.internal.wallet.zzac, com.google.android.gms.internal.wallet.zzv
    public final void zza(int i11, FullWallet fullWallet, Bundle bundle) {
        int i12;
        Activity activity = this.zzfm.get();
        if (activity == null) {
            Log.d("WalletClientImpl", "Ignoring onFullWalletLoaded, Activity has gone");
            return;
        }
        ConnectionResult connectionResult = new ConnectionResult(i11, bundle != null ? (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT") : null);
        if (connectionResult.hasResolution()) {
            try {
                connectionResult.startResolutionForResult(activity, this.zzaa);
                return;
            } catch (IntentSender.SendIntentException e11) {
                Log.w("WalletClientImpl", "Exception starting pending intent", e11);
                return;
            }
        }
        Intent intent = new Intent();
        if (connectionResult.isSuccess()) {
            intent.putExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET", fullWallet);
            i12 = -1;
        } else {
            int i13 = i11 == 408 ? 0 : 1;
            intent.putExtra(WalletConstants.EXTRA_ERROR_CODE, i11);
            i12 = i13;
        }
        PendingIntent createPendingResult = activity.createPendingResult(this.zzaa, intent, 1073741824);
        if (createPendingResult == null) {
            Log.w("WalletClientImpl", "Null pending result returned for onFullWalletLoaded");
            return;
        }
        try {
            createPendingResult.send(i12);
        } catch (PendingIntent.CanceledException e12) {
            Log.w("WalletClientImpl", "Exception setting pending result", e12);
        }
    }

    @Override // com.google.android.gms.internal.wallet.zzac, com.google.android.gms.internal.wallet.zzv
    public final void zza(int i11, boolean z11, Bundle bundle) {
        Activity activity = this.zzfm.get();
        if (activity == null) {
            Log.d("WalletClientImpl", "Ignoring onPreAuthorizationDetermined, Activity has gone");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(WalletConstants.EXTRA_IS_USER_PREAUTHORIZED, z11);
        PendingIntent createPendingResult = activity.createPendingResult(this.zzaa, intent, 1073741824);
        if (createPendingResult == null) {
            Log.w("WalletClientImpl", "Null pending result returned for onPreAuthorizationDetermined");
            return;
        }
        try {
            createPendingResult.send(-1);
        } catch (PendingIntent.CanceledException e11) {
            Log.w("WalletClientImpl", "Exception setting pending result", e11);
        }
    }

    @Override // com.google.android.gms.internal.wallet.zzac, com.google.android.gms.internal.wallet.zzv
    public final void zza(int i11, Bundle bundle) {
        Preconditions.checkNotNull(bundle, "Bundle should not be null");
        Activity activity = this.zzfm.get();
        if (activity == null) {
            Log.d("WalletClientImpl", "Ignoring onWalletObjectsCreated, Activity has gone");
            return;
        }
        ConnectionResult connectionResult = new ConnectionResult(i11, (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT"));
        if (connectionResult.hasResolution()) {
            try {
                connectionResult.startResolutionForResult(activity, this.zzaa);
                return;
            } catch (IntentSender.SendIntentException e11) {
                Log.w("WalletClientImpl", "Exception starting pending intent", e11);
                return;
            }
        }
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 75);
        sb2.append("Create Wallet Objects confirmation UI will not be shown connection result: ");
        sb2.append(valueOf);
        Log.e("WalletClientImpl", sb2.toString());
        Intent intent = new Intent();
        intent.putExtra(WalletConstants.EXTRA_ERROR_CODE, WalletConstants.ERROR_CODE_UNKNOWN);
        PendingIntent createPendingResult = activity.createPendingResult(this.zzaa, intent, 1073741824);
        if (createPendingResult == null) {
            Log.w("WalletClientImpl", "Null pending result returned for onWalletObjectsCreated");
            return;
        }
        try {
            createPendingResult.send(1);
        } catch (PendingIntent.CanceledException e12) {
            Log.w("WalletClientImpl", "Exception setting pending result", e12);
        }
    }
}
