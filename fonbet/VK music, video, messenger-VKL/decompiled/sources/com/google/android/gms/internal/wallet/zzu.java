package com.google.android.gms.internal.wallet;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import java.lang.ref.WeakReference;
import xsna.exc0;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes12.dex */
final class zzu extends zzx {
    private final int zzag;
    private final WeakReference<Activity> zzeq;

    public zzu(Activity activity, int i) {
        this.zzeq = new WeakReference<>(activity);
        this.zzag = i;
    }

    @Override // com.google.android.gms.internal.wallet.zzx, com.google.android.gms.internal.wallet.zzq
    public final void zza(int i, MaskedWallet maskedWallet, Bundle bundle) {
        int i2;
        Activity activity = this.zzeq.get();
        if (activity == null) {
            return;
        }
        ConnectionResult connectionResult = new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT") : null);
        if (connectionResult.i()) {
            try {
                connectionResult.k(activity, this.zzag);
                return;
            } catch (IntentSender.SendIntentException unused) {
                return;
            }
        }
        Intent intent = new Intent();
        if (connectionResult.j()) {
            intent.putExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", maskedWallet);
            i2 = -1;
        } else {
            int i3 = i == 408 ? 0 : 1;
            intent.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", i);
            i2 = i3;
        }
        PendingIntent createPendingResult = activity.createPendingResult(this.zzag, intent, 1073741824);
        if (createPendingResult == null) {
            return;
        }
        try {
            createPendingResult.send(i2);
        } catch (PendingIntent.CanceledException unused2) {
        }
    }

    @Override // com.google.android.gms.internal.wallet.zzx, com.google.android.gms.internal.wallet.zzq
    public final void zza(int i, FullWallet fullWallet, Bundle bundle) {
        int i2;
        Activity activity = this.zzeq.get();
        if (activity == null) {
            return;
        }
        ConnectionResult connectionResult = new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT") : null);
        if (connectionResult.i()) {
            try {
                connectionResult.k(activity, this.zzag);
                return;
            } catch (IntentSender.SendIntentException unused) {
                return;
            }
        }
        Intent intent = new Intent();
        if (connectionResult.j()) {
            intent.putExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET", fullWallet);
            i2 = -1;
        } else {
            int i3 = i == 408 ? 0 : 1;
            intent.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", i);
            i2 = i3;
        }
        PendingIntent createPendingResult = activity.createPendingResult(this.zzag, intent, 1073741824);
        if (createPendingResult == null) {
            return;
        }
        try {
            createPendingResult.send(i2);
        } catch (PendingIntent.CanceledException unused2) {
        }
    }

    @Override // com.google.android.gms.internal.wallet.zzx, com.google.android.gms.internal.wallet.zzq
    public final void zza(int i, boolean z, Bundle bundle) {
        Activity activity = this.zzeq.get();
        if (activity == null) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("com.google.android.gm.wallet.EXTRA_IS_USER_PREAUTHORIZED", z);
        PendingIntent createPendingResult = activity.createPendingResult(this.zzag, intent, 1073741824);
        if (createPendingResult == null) {
            return;
        }
        try {
            createPendingResult.send(-1);
        } catch (PendingIntent.CanceledException unused) {
        }
    }

    @Override // com.google.android.gms.internal.wallet.zzx, com.google.android.gms.internal.wallet.zzq
    public final void zza(int i, Bundle bundle) {
        exc0.j(bundle, "Bundle should not be null");
        Activity activity = this.zzeq.get();
        if (activity == null) {
            return;
        }
        ConnectionResult connectionResult = new ConnectionResult(i, (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT"));
        if (connectionResult.i()) {
            try {
                connectionResult.k(activity, this.zzag);
                return;
            } catch (IntentSender.SendIntentException unused) {
                return;
            }
        }
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(valueOf.length() + 75);
        sb.append("Create Wallet Objects confirmation UI will not be shown connection result: ");
        sb.append(valueOf);
        Log.e("WalletClientImpl", sb.toString());
        Intent intent = new Intent();
        intent.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", 413);
        PendingIntent createPendingResult = activity.createPendingResult(this.zzag, intent, 1073741824);
        if (createPendingResult == null) {
            return;
        }
        try {
            createPendingResult.send(1);
        } catch (PendingIntent.CanceledException unused2) {
        }
    }
}
