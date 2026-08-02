package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.m;
import defpackage.c0l;
import defpackage.ljg;
import defpackage.lyn;
import defpackage.osn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzal extends zzav implements zzam {
    public zzal() {
        super("com.android.vending.billing.IInAppBillingIsAlternativeBillingOnlyAvailableCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.zzav
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) zzaw.a(parcel);
        zzav.S1(parcel);
        osn osnVar = (osn) this;
        AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener = osnVar.a;
        int i2 = osnVar.c;
        zzjz zzjzVar = zzjz.BROADCAST_ACTION_UNSPECIFIED;
        lyn lynVar = osnVar.b;
        if (bundle == null) {
            BillingResult billingResult = m.h;
            ((c0l) lynVar).s(com.android.billingclient.api.zzdc.zzb(zzjs.NULL_BUNDLE_FROM_IS_ALTERNATIVE_BILLING_ONLY_AVAILABLE_SERVICE_CALL, 14, billingResult, null, zzjzVar), i2);
            alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
            return true;
        }
        int a = zzc.a(bundle, "BillingClient");
        BillingResult a2 = m.a(a, zzc.g(bundle, "BillingClient"));
        if (a != 0) {
            ljg.j(a, "isAlternativeBillingOnlyAvailableAsync() failed. Response code: ");
            ((c0l) lynVar).s(com.android.billingclient.api.zzdc.zzb(zzjs.BILLING_RESULT_RECEIVED_FROM_PHONESKY, 14, a2, null, zzjzVar), i2);
        }
        alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(a2);
        return true;
    }
}
