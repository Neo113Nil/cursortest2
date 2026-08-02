package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ExternalOfferReportingDetails;
import com.android.billingclient.api.ExternalOfferReportingDetailsListener;
import com.android.billingclient.api.m;
import defpackage.c0l;
import defpackage.krn;
import defpackage.ljg;
import defpackage.lyn;
import org.json.JSONException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzy extends zzav implements zzz {
    public zzy() {
        super("com.android.vending.billing.IInAppBillingCreateExternalPaymentReportingDetailsCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.zzav
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) zzaw.a(parcel);
        zzav.S1(parcel);
        krn krnVar = (krn) this;
        int i2 = krnVar.c;
        zzjz zzjzVar = zzjz.BROADCAST_ACTION_UNSPECIFIED;
        lyn lynVar = krnVar.b;
        ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener = krnVar.a;
        if (bundle == null) {
            BillingResult billingResult = m.h;
            ((c0l) lynVar).s(com.android.billingclient.api.zzdc.zzb(zzjs.NULL_BUNDLE_FROM_CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS_SERVICE_CALL, 24, billingResult, null, zzjzVar), i2);
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult, null);
            return true;
        }
        int a = zzc.a(bundle, "BillingClient");
        BillingResult a2 = m.a(a, zzc.g(bundle, "BillingClient"));
        if (a != 0) {
            ljg.j(a, "createExternalOfferReportingDetailsAsync() failed. Response code: ");
            ((c0l) lynVar).s(com.android.billingclient.api.zzdc.zzb(zzjs.BILLING_RESULT_RECEIVED_FROM_PHONESKY, 24, a2, null, zzjzVar), i2);
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(a2, null);
            return true;
        }
        try {
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(a2, new ExternalOfferReportingDetails(bundle.getString("CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS")));
            return true;
        } catch (JSONException unused) {
            int i3 = zzc.a;
            BillingResult billingResult2 = m.h;
            ((c0l) lynVar).s(com.android.billingclient.api.zzdc.zzb(zzjs.ERROR_DECODING_EXTERNAL_OFFER_REPORTING_DETAILS, 24, billingResult2, null, zzjzVar), i2);
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult2, null);
            return true;
        }
    }
}
