package com.google.android.gms.internal.identity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes12.dex */
public final class zzf extends zzh {
    private Activity mActivity;
    private final int zzj;

    public zzf(int i, Activity activity) {
        this.zzj = i;
        this.mActivity = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setActivity(Activity activity) {
        this.mActivity = null;
    }

    @Override // com.google.android.gms.internal.identity.zzg
    public final void zza(int i, Bundle bundle) {
        if (i == 1) {
            Intent intent = new Intent();
            intent.putExtras(bundle);
            PendingIntent createPendingResult = this.mActivity.createPendingResult(this.zzj, intent, 1073741824);
            if (createPendingResult == null) {
                return;
            }
            try {
                createPendingResult.send(1);
                return;
            } catch (PendingIntent.CanceledException unused) {
                return;
            }
        }
        ConnectionResult connectionResult = new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable("com.google.android.gms.identity.intents.EXTRA_PENDING_INTENT") : null);
        if (connectionResult.i()) {
            try {
                connectionResult.k(this.mActivity, this.zzj);
                return;
            } catch (IntentSender.SendIntentException unused2) {
                return;
            }
        }
        try {
            PendingIntent createPendingResult2 = this.mActivity.createPendingResult(this.zzj, new Intent(), 1073741824);
            if (createPendingResult2 != null) {
                createPendingResult2.send(1);
            }
        } catch (PendingIntent.CanceledException unused3) {
        }
    }
}
