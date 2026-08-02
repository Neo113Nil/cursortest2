package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.ljg;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class j extends com.google.android.gms.internal.play_billing.zzad {
    public final WeakReference a;
    public final ResultReceiver b;

    public /* synthetic */ j(WeakReference weakReference, ResultReceiver resultReceiver) {
        this.a = weakReference;
        this.b = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.zzae
    public final void I(Bundle bundle) {
        ResultReceiver resultReceiver = this.b;
        if (bundle == null) {
            resultReceiver.send(6, null);
            return;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            int i = com.google.android.gms.internal.play_billing.zzc.a;
            resultReceiver.send(6, bundle);
            return;
        }
        int a = com.google.android.gms.internal.play_billing.zzc.a(bundle, "BillingClient");
        if (a != 0) {
            ljg.j(a, "Unable to launch intent for billing program information dialog");
            resultReceiver.send(a, bundle);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
        if (pendingIntent == null) {
            com.google.android.gms.internal.play_billing.zzc.h("BillingClient", "User has acknowledged the billing program information dialog before.");
            resultReceiver.send(0, bundle);
            return;
        }
        try {
            Activity activity = (Activity) this.a.get();
            if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivityV2.class);
                intent.putExtra("billing_program_information_dialog_result_receiver", resultReceiver);
                intent.putExtra("billing_program_information_dialog_pending_intent", pendingIntent);
                activity.startActivity(intent);
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putInt("RESPONSE_CODE", 5);
            bundle2.putString("DEBUG_MESSAGE", "Activity is null or unavailable.");
            resultReceiver.send(5, bundle2);
        } catch (RuntimeException e) {
            int i2 = com.google.android.gms.internal.play_billing.zzc.a;
            Bundle bundle3 = new Bundle();
            bundle3.putInt("RESPONSE_CODE", 6);
            bundle3.putString("DEBUG_MESSAGE", "An internal error occurred.");
            bundle3.putInt("INTERNAL_LOG_ERROR_REASON", Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);
            String name = e.getClass().getName();
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            bundle3.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", name + ": " + message);
            resultReceiver.send(6, bundle3);
        }
    }
}
