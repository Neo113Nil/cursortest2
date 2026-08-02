package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.billingclient.api.BillingResult;

/* compiled from: com.android.billingclient:billing@@8.3.0 */
/* loaded from: classes5.dex */
final class zzdy extends BroadcastReceiver {
    zzdy() {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !intent.hasExtra(com.playtika.pras.sdk.network.models.results.BillingResult.BUNDLE_RESPONSE_CODE)) {
            com.google.android.gms.internal.play_billing.zzc.zzo("ProxyBillingBroadcastReceiver", "Null intent or intent missing response code!");
            return;
        }
        BillingResult.Builder newBuilder = BillingResult.newBuilder();
        newBuilder.setResponseCode(intent.getIntExtra(com.playtika.pras.sdk.network.models.results.BillingResult.BUNDLE_RESPONSE_CODE, 0));
        newBuilder.setDebugMessage(com.google.android.gms.internal.play_billing.zzbm.zzc(intent.getStringExtra("DEBUG_MESSAGE")));
        newBuilder.build();
    }
}
