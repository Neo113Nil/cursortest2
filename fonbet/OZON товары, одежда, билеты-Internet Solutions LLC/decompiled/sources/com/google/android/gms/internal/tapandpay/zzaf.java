package com.google.android.gms.internal.tapandpay;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

/* loaded from: classes9.dex */
public final class zzaf extends zzae {
    private final WeakReference<Activity> zza;
    private final int zzb;

    public zzaf(Activity activity, int i11) {
        this.zza = new WeakReference<>(activity);
        this.zzb = i11;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzae, com.google.android.gms.internal.tapandpay.zzf
    public final void zzu(Status status, Bundle bundle) {
        Activity activity = this.zza.get();
        if (activity == null) {
            Log.d("TapAndPayClientImpl", "Ignoring onHandlePendingIntent, Activity is gone");
            return;
        }
        if (status.hasResolution()) {
            try {
                status.startResolutionForResult(activity, this.zzb);
                return;
            } catch (IntentSender.SendIntentException e11) {
                Log.w("TapAndPayClientImpl", "Exception starting pending intent", e11);
            }
        }
        PendingIntent createPendingResult = activity.createPendingResult(this.zzb, new Intent(), 1073741824);
        if (createPendingResult == null) {
            Log.w("TapAndPayClientImpl", "Null pending result returned for onHandleStatusPendingIntent");
            return;
        }
        try {
            createPendingResult.send(status.isSuccess() ? -1 : status.getStatusCode());
        } catch (PendingIntent.CanceledException e12) {
            Log.w("TapAndPayClientImpl", "Exception setting pending result", e12);
        }
    }
}
