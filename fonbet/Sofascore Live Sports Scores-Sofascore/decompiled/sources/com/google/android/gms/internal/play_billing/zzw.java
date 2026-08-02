package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.billingclient.api.AlternativeBillingOnlyReportingDetails;
import com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.m;
import defpackage.c0l;
import defpackage.ern;
import defpackage.ljg;
import defpackage.lyn;
import org.json.JSONException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzw extends zzav implements zzx {
    public zzw() {
        super("com.android.vending.billing.IInAppBillingCreateAlternativeBillingOnlyTokenCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.zzav
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) zzaw.a(parcel);
        zzav.S1(parcel);
        ern ernVar = (ern) this;
        int i2 = ernVar.c;
        zzjz zzjzVar = zzjz.BROADCAST_ACTION_UNSPECIFIED;
        lyn lynVar = ernVar.b;
        AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener = ernVar.a;
        if (bundle == null) {
            BillingResult billingResult = m.h;
            ((c0l) lynVar).s(com.android.billingclient.api.zzdc.zzb(zzjs.NULL_BUNDLE_FROM_CREATE_ALTERNATIVE_BILLING_ONLY_TOKEN_SERVICE_CALL, 15, billingResult, null, zzjzVar), i2);
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult, null);
            return true;
        }
        int a = zzc.a(bundle, "BillingClient");
        BillingResult a2 = m.a(a, zzc.g(bundle, "BillingClient"));
        if (a != 0) {
            ljg.j(a, "createAlternativeBillingOnlyReportingDetailsAsync() failed. Response code: ");
            ((c0l) lynVar).s(com.android.billingclient.api.zzdc.zzb(zzjs.BILLING_RESULT_RECEIVED_FROM_PHONESKY, 15, a2, null, zzjzVar), i2);
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(a2, null);
            return true;
        }
        try {
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(a2, new AlternativeBillingOnlyReportingDetails(bundle.getString("CREATE_ALTERNATIVE_BILLING_ONLY_REPORTING_DETAILS")));
            return true;
        } catch (JSONException unused) {
            int i3 = zzc.a;
            BillingResult billingResult2 = m.h;
            ((c0l) lynVar).s(com.android.billingclient.api.zzdc.zzb(zzjs.ERROR_DECODING_ALTERNATIVE_BILLING_ONLY_REPORTING_DETAILS, 15, billingResult2, null, zzjzVar), i2);
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult2, null);
            return true;
        }
    }
}
