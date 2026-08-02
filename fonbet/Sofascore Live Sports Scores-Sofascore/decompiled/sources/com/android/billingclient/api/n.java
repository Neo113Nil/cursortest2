package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.BillingResult;
import com.google.android.gms.internal.play_billing.zzjs;
import defpackage.lyn;
import defpackage.sea;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class n {
    public static BillingResult a(Bundle bundle, int i, lyn lynVar, int i2) {
        if (!bundle.containsKey("BILLING_RESULT")) {
            int i3 = com.google.android.gms.internal.play_billing.zzc.a;
            BillingResult billingResult = m.h;
            sea.B(zzjs.MISSING_BILLING_RESULT_IN_DELEGATE_TO_BACKEND_RESPONSE, billingResult, lynVar, i, i2);
            return billingResult;
        }
        try {
            byte[] byteArray = bundle.getByteArray("BILLING_RESULT");
            if (byteArray == null) {
                throw new Exception("Billing result is null");
            }
            com.google.android.gms.internal.play_billing.zzeq q = com.google.android.gms.internal.play_billing.zzeq.q(byteArray);
            BillingResult.Builder newBuilder = BillingResult.newBuilder();
            newBuilder.setResponseCode(q.p());
            newBuilder.setDebugMessage(q.r());
            BillingResult build = newBuilder.build();
            if (build.getResponseCode() != 0) {
                sea.B(zzjs.BILLING_RESULT_RECEIVED_FROM_PHONESKY, build, lynVar, i, i2);
                return build;
            }
            if (bundle.containsKey("RESPONSE_DATA")) {
                return build;
            }
            int i4 = com.google.android.gms.internal.play_billing.zzc.a;
            zzjs zzjsVar = zzjs.MISSING_RESPONSE_DATA_IN_DELEGATE_TO_BACKEND_RESPONSE;
            BillingResult billingResult2 = m.h;
            sea.B(zzjsVar, billingResult2, lynVar, i, i2);
            return billingResult2;
        } catch (Exception e) {
            int i5 = com.google.android.gms.internal.play_billing.zzc.a;
            BillingResult billingResult3 = m.h;
            sea.D(zzjs.ERROR_DECODING_DELEGATE_TO_BACKEND_BILLING_RESULT, billingResult3, lynVar, i, i2, zzdc.zza(e));
            return billingResult3;
        }
    }
}
