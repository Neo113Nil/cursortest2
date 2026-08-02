package com.google.android.gms.internal.identity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes9.dex */
public final class zzf extends zzh {
    private Activity mActivity;
    private final int zzj;

    public zzf(int i11, Activity activity) {
        this.zzj = i11;
        this.mActivity = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setActivity(Activity activity) {
        this.mActivity = null;
    }

    @Override // com.google.android.gms.internal.identity.zzg
    public final void zza(int i11, Bundle bundle) {
        String str;
        if (i11 == 1) {
            Intent intent = new Intent();
            intent.putExtras(bundle);
            PendingIntent createPendingResult = this.mActivity.createPendingResult(this.zzj, intent, 1073741824);
            if (createPendingResult == null) {
                return;
            }
            try {
                createPendingResult.send(1);
                return;
            } catch (PendingIntent.CanceledException e11) {
                e = e11;
                str = "Exception settng pending result";
            }
        } else {
            ConnectionResult connectionResult = new ConnectionResult(i11, bundle != null ? (PendingIntent) bundle.getParcelable("com.google.android.gms.identity.intents.EXTRA_PENDING_INTENT") : null);
            if (connectionResult.hasResolution()) {
                try {
                    connectionResult.startResolutionForResult(this.mActivity, this.zzj);
                    return;
                } catch (IntentSender.SendIntentException e12) {
                    e = e12;
                    str = "Exception starting pending intent";
                }
            } else {
                try {
                    PendingIntent createPendingResult2 = this.mActivity.createPendingResult(this.zzj, new Intent(), 1073741824);
                    if (createPendingResult2 != null) {
                        createPendingResult2.send(1);
                        return;
                    }
                    return;
                } catch (PendingIntent.CanceledException e13) {
                    e = e13;
                    str = "Exception setting pending result";
                }
            }
        }
        Log.w("AddressClientImpl", str, e);
    }
}
