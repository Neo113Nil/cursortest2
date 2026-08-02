package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import com.android.billingclient.BuildConfig;
import com.google.android.gms.internal.play_billing.zzjd;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;

/* compiled from: com.android.billingclient:billing@@8.3.0 */
/* loaded from: classes4.dex */
final class zzbz extends com.google.android.gms.internal.play_billing.zzad {
    final WeakReference zza;
    final ResultReceiver zzb;

    /* synthetic */ zzbz(WeakReference weakReference, ResultReceiver resultReceiver, zzch zzchVar) {
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

    @Override // com.google.android.gms.internal.play_billing.zzae
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            this.zzb.send(6, null);
            return;
        }
        if (!bundle.containsKey(com.playtika.pras.sdk.network.models.results.BillingResult.BUNDLE_RESPONSE_CODE)) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Response bundle doesn't contain a response code");
            this.zzb.send(6, bundle);
            return;
        }
        int zzb = com.google.android.gms.internal.play_billing.zzc.zzb(bundle, "BillingClient");
        if (zzb != 0) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to launch intent for alternative billing only dialog" + zzb);
            this.zzb.send(zzb, bundle);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
        if (pendingIntent == null) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "User has acknowledged the alternative billing only dialog before.");
            this.zzb.send(0, bundle);
            return;
        }
        try {
            Activity activity = (Activity) this.zza.get();
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivityV2.class);
            intent.putExtra("alternative_billing_only_dialog_result_receiver", this.zzb);
            intent.putExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT", pendingIntent);
            safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, intent);
        } catch (RuntimeException e) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Runtime error while launching intent for alternative billing only dialog.", e);
            Bundle bundle2 = new Bundle();
            bundle2.putInt(com.playtika.pras.sdk.network.models.results.BillingResult.BUNDLE_RESPONSE_CODE, 6);
            bundle2.putString("DEBUG_MESSAGE", "An internal error occurred.");
            bundle2.putInt("INTERNAL_LOG_ERROR_REASON", zzjd.RUNTIME_EXCEPTION_ON_LAUNCHING_ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT.zza());
            bundle2.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("%s: %s", e.getClass().getName(), com.google.android.gms.internal.play_billing.zzbm.zzc(e.getMessage())));
            this.zzb.send(6, bundle2);
        }
    }
}
