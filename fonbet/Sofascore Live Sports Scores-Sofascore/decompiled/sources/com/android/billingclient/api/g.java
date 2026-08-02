package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.zzjs;
import defpackage.ljg;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class g extends com.google.android.gms.internal.play_billing.zzah {
    public final WeakReference a;
    public final ResultReceiver b;
    public final /* synthetic */ a c;

    public /* synthetic */ g(a aVar, WeakReference weakReference, LaunchExternalLinkResponseListener launchExternalLinkResponseListener) {
        Objects.requireNonNull(aVar);
        this.c = aVar;
        this.a = weakReference;
        this.b = new zzbw(aVar, aVar.e, launchExternalLinkResponseListener);
    }

    @Override // com.google.android.gms.internal.play_billing.zzai
    public final void I(Bundle bundle) {
        a aVar = this.c;
        ResultReceiver resultReceiver = this.b;
        if (bundle == null) {
            int i = com.google.android.gms.internal.play_billing.zzc.a;
            aVar.p(37, m.h, zzjs.NULL_BUNDLE_RETURNED_BY_PHONESKY);
            resultReceiver.send(6, null);
            return;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            int i2 = com.google.android.gms.internal.play_billing.zzc.a;
            aVar.p(37, m.h, zzjs.MISSING_RESPONSE_CODE_IN_PHONESKY_BUNDLE);
            resultReceiver.send(6, bundle);
            return;
        }
        int a = com.google.android.gms.internal.play_billing.zzc.a(bundle, "BillingClient");
        if (a != 0) {
            ljg.j(a, "Unable to launch intent for launch external link dialog. Response code: ");
            resultReceiver.send(a, bundle);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("EXTERNAL_PAYMENT_DIALOG_INTENT");
        if (pendingIntent == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("RESPONSE_CODE", 6);
            bundle2.putString("DEBUG_MESSAGE", "An internal error occurred.");
            resultReceiver.send(6, bundle);
            return;
        }
        try {
            Activity activity = (Activity) this.a.get();
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivityV2.class);
            intent.putExtra("launch_external_link_result_receiver", resultReceiver);
            intent.putExtra("launch_external_link_flow_pending_intent", pendingIntent);
            activity.startActivity(intent);
        } catch (RuntimeException e) {
            int i3 = com.google.android.gms.internal.play_billing.zzc.a;
            Bundle bundle3 = new Bundle();
            bundle3.putInt("RESPONSE_CODE", 6);
            bundle3.putString("DEBUG_MESSAGE", "An internal error occurred.");
            bundle3.putInt("INTERNAL_LOG_ERROR_REASON", 143);
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
