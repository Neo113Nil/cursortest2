package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ExternalOfferAvailabilityListener;
import com.android.billingclient.api.m;
import defpackage.c0l;
import defpackage.ljg;
import defpackage.lyn;
import defpackage.wsn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzan extends zzav implements zzao {
    public zzan() {
        super("com.android.vending.billing.IInAppBillingIsExternalPaymentAvailableCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.zzav
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) zzaw.a(parcel);
        zzav.S1(parcel);
        wsn wsnVar = (wsn) this;
        ExternalOfferAvailabilityListener externalOfferAvailabilityListener = wsnVar.a;
        int i2 = wsnVar.c;
        zzjz zzjzVar = zzjz.BROADCAST_ACTION_UNSPECIFIED;
        lyn lynVar = wsnVar.b;
        if (bundle == null) {
            BillingResult billingResult = m.h;
            ((c0l) lynVar).s(com.android.billingclient.api.zzdc.zzb(zzjs.NULL_BUNDLE_FROM_IS_EXTERNAL_PAYMENT_AVAILABLE_SERVICE_CALL, 23, billingResult, null, zzjzVar), i2);
            externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult);
            return true;
        }
        int a = zzc.a(bundle, "BillingClient");
        BillingResult a2 = m.a(a, zzc.g(bundle, "BillingClient"));
        if (a != 0) {
            ljg.j(a, "isExternalOfferAvailableAsync() failed. Response code: ");
            ((c0l) lynVar).s(com.android.billingclient.api.zzdc.zzb(zzjs.BILLING_RESULT_RECEIVED_FROM_PHONESKY, 23, a2, null, zzjzVar), i2);
        }
        externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(a2);
        return true;
    }
}
