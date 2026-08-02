package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import defpackage.ljg;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d extends com.google.android.gms.internal.play_billing.zzad {
    public final WeakReference a;
    public final ResultReceiver b;

    public /* synthetic */ d(WeakReference weakReference, ResultReceiver resultReceiver) {
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
            ljg.j(a, "Unable to launch intent for alternative billing only dialog");
            resultReceiver.send(a, bundle);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
        if (pendingIntent == null) {
            com.google.android.gms.internal.play_billing.zzc.h("BillingClient", "User has acknowledged the alternative billing only dialog before.");
            resultReceiver.send(0, bundle);
            return;
        }
        try {
            Activity activity = (Activity) this.a.get();
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivityV2.class);
            intent.putExtra("alternative_billing_only_dialog_result_receiver", resultReceiver);
            intent.putExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT", pendingIntent);
            activity.startActivity(intent);
        } catch (RuntimeException e) {
            int i2 = com.google.android.gms.internal.play_billing.zzc.a;
            Bundle bundle2 = new Bundle();
            bundle2.putInt("RESPONSE_CODE", 6);
            bundle2.putString("DEBUG_MESSAGE", "An internal error occurred.");
            bundle2.putInt("INTERNAL_LOG_ERROR_REASON", 75);
            String name = e.getClass().getName();
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            bundle2.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", name + ": " + message);
            resultReceiver.send(6, bundle2);
        }
    }
}
