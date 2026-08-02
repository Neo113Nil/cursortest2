package com.google.android.gms.internal.tapandpay;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes12.dex */
public final class zzj extends zzk {
    private final WeakReference<Activity> zza;
    private final int zzb;

    public zzj(Activity activity, int i) {
        this.zza = new WeakReference<>(activity);
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzk, com.google.android.gms.internal.tapandpay.zzf
    public final void zza(Status status, Bundle bundle) {
        Activity activity = this.zza.get();
        if (activity == null) {
            return;
        }
        if (status.d != null) {
            try {
                status.j(activity, this.zzb);
                return;
            } catch (IntentSender.SendIntentException unused) {
            }
        }
        PendingIntent createPendingResult = activity.createPendingResult(this.zzb, new Intent(), 1073741824);
        if (createPendingResult == null) {
            return;
        }
        try {
            createPendingResult.send(status.i() ? -1 : 1);
        } catch (PendingIntent.CanceledException unused2) {
        }
    }
}
