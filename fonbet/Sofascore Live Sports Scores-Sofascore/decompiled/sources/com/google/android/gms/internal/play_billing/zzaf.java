package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.billingclient.api.BillingConfig;
import com.android.billingclient.api.BillingConfigResponseListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.m;
import defpackage.c0l;
import defpackage.ljg;
import defpackage.lyn;
import org.json.JSONException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzaf extends zzav implements zzag {
    public zzaf() {
        super("com.android.vending.billing.IInAppBillingGetBillingConfigCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.zzav
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) zzaw.a(parcel);
        zzav.S1(parcel);
        com.android.billingclient.api.e eVar = (com.android.billingclient.api.e) this;
        int i2 = eVar.c;
        zzjz zzjzVar = zzjz.BROADCAST_ACTION_UNSPECIFIED;
        lyn lynVar = eVar.b;
        BillingConfigResponseListener billingConfigResponseListener = eVar.a;
        if (bundle == null) {
            BillingResult billingResult = m.h;
            ((c0l) lynVar).s(com.android.billingclient.api.zzdc.zzb(zzjs.NULL_BUNDLE_FROM_GET_BILLING_CONFIG_SERVICE_CALL, 13, billingResult, null, zzjzVar), i2);
            billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
        } else {
            int a = zzc.a(bundle, "BillingClient");
            String g = zzc.g(bundle, "BillingClient");
            BillingResult.Builder newBuilder = BillingResult.newBuilder();
            newBuilder.setResponseCode(a);
            newBuilder.setDebugMessage(g);
            if (a != 0) {
                ljg.j(a, "getBillingConfig() failed. Response code: ");
                BillingResult build = newBuilder.build();
                ((c0l) lynVar).s(com.android.billingclient.api.zzdc.zzb(zzjs.BILLING_RESULT_RECEIVED_FROM_PHONESKY, 13, build, null, zzjzVar), i2);
                billingConfigResponseListener.onBillingConfigResponse(build, null);
            } else if (bundle.containsKey("BILLING_CONFIG")) {
                try {
                    billingConfigResponseListener.onBillingConfigResponse(newBuilder.build(), new BillingConfig(bundle.getString("BILLING_CONFIG")));
                } catch (JSONException unused) {
                    int i3 = zzc.a;
                    BillingResult billingResult2 = m.h;
                    ((c0l) lynVar).s(com.android.billingclient.api.zzdc.zzb(zzjs.ERROR_DECODING_BILLING_CONFIG_DATA, 13, billingResult2, null, zzjzVar), i2);
                    billingConfigResponseListener.onBillingConfigResponse(billingResult2, null);
                }
            } else {
                newBuilder.setResponseCode(6);
                BillingResult build2 = newBuilder.build();
                ((c0l) lynVar).s(com.android.billingclient.api.zzdc.zzb(zzjs.MISSING_BILLING_CONFIG_IN_GET_BILLING_CONFIG_RESPONSE, 13, build2, null, zzjzVar), i2);
                billingConfigResponseListener.onBillingConfigResponse(build2, null);
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
