package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import com.android.billingclient.BuildConfig;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;

/* compiled from: com.android.billingclient:billing@@8.3.0 */
/* loaded from: classes5.dex */
final class zzcf extends com.google.android.gms.internal.play_billing.zzaq {
    final WeakReference zza;
    final ResultReceiver zzb;

    /* synthetic */ zzcf(WeakReference weakReference, ResultReceiver resultReceiver, zzch zzchVar) {
        this.zza = weakReference;
        this.zzb = resultReceiver;
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, BuildConfig.APPLICATION_ID);
        p0.startActivity(p1);
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final void zza(Bundle bundle) throws RemoteException {
        ResultReceiver resultReceiver = this.zzb;
        if (resultReceiver == null) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to send result for in-app messaging");
            return;
        }
        if (bundle == null) {
            resultReceiver.send(0, null);
            return;
        }
        Activity activity = (Activity) this.zza.get();
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("KEY_LAUNCH_INTENT");
        if (activity == null || pendingIntent == null) {
            resultReceiver.send(0, null);
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to launch intent for in-app messaging");
            return;
        }
        try {
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
            intent.putExtra("in_app_message_result_receiver", resultReceiver);
            intent.putExtra("IN_APP_MESSAGE_INTENT", pendingIntent);
            safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, intent);
        } catch (CancellationException e) {
            this.zzb.send(0, null);
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Exception caught while launching intent for in-app messaging.", e);
        }
    }
}
