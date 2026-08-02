package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzah extends zzav implements zzai {
    public zzah() {
        super("com.android.vending.billing.IInAppBillingGetExternalPaymentDialogIntentCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.zzav
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) zzaw.a(parcel);
        zzav.S1(parcel);
        I(bundle);
        return true;
    }
}
