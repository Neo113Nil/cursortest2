package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.BillingProgramAvailabilityDetails;
import com.google.android.gms.internal.play_billing.zzej;
import com.google.android.gms.internal.play_billing.zzjs;
import defpackage.c0l;
import defpackage.lyn;
import defpackage.sea;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b extends com.google.android.gms.internal.play_billing.zzab {
    public final BillingProgramAvailabilityListener a;
    public final int b;
    public final int c;
    public final ExecutorService d;
    public final lyn e;

    public b(BillingProgramAvailabilityListener billingProgramAvailabilityListener, int i, c0l c0lVar, int i2, ExecutorService executorService) {
        billingProgramAvailabilityListener.getClass();
        this.a = billingProgramAvailabilityListener;
        this.b = i;
        this.e = c0lVar;
        this.c = i2;
        this.d = executorService;
    }

    @Override // com.google.android.gms.internal.play_billing.zzac
    public final void U2(Bundle bundle) {
        BillingProgramAvailabilityDetails billingProgramAvailabilityDetails;
        int i = this.b;
        BillingProgramAvailabilityListener billingProgramAvailabilityListener = this.a;
        int i2 = this.c;
        lyn lynVar = this.e;
        if (bundle == null) {
            BillingResult billingResult = m.h;
            sea.B(zzjs.NULL_BUNDLE_FROM_DELEGATE_TO_BACKEND_SERVICE_CALL, billingResult, lynVar, 33, i2);
            billingProgramAvailabilityListener.onBillingProgramAvailabilityResponse(billingResult, new BillingProgramAvailabilityDetails(i));
            return;
        }
        BillingResult a = n.a(bundle, 33, lynVar, i2);
        if (billingProgramAvailabilityListener == null) {
            sea.B(zzjs.NULL_LISTENER_IN_DELEGATE_TO_BACKEND_CALLBACK, a, lynVar, 33, i2);
            return;
        }
        if (i == 5) {
            try {
                byte[] byteArray = bundle.getByteArray("RESPONSE_DATA");
                if (byteArray == null) {
                    Z1(5, m.h, null);
                    return;
                }
                zzej q = zzej.q(byteArray);
                if (!q.r()) {
                    Z1(5, m.h, null);
                    return;
                }
                com.google.android.gms.internal.play_billing.zzdu p = q.p();
                int r = p.r() - 2;
                int i3 = 1;
                if (r != 1) {
                    i3 = 2;
                    if (r != 2) {
                        i3 = 0;
                    }
                }
                billingProgramAvailabilityDetails = new BillingProgramAvailabilityDetails(new BillingProgramAvailabilityDetails.BillingChoiceAvailabilityDetails(i3, p.q()));
            } catch (Exception e) {
                e = e;
                i = 5;
                int i4 = com.google.android.gms.internal.play_billing.zzc.a;
                Z1(i, m.h, e);
                return;
            }
        } else {
            try {
                billingProgramAvailabilityDetails = new BillingProgramAvailabilityDetails(i);
            } catch (Exception e2) {
                e = e2;
                int i42 = com.google.android.gms.internal.play_billing.zzc.a;
                Z1(i, m.h, e);
                return;
            }
        }
        billingProgramAvailabilityListener.onBillingProgramAvailabilityResponse(a, billingProgramAvailabilityDetails);
    }

    public final void Z1(int i, BillingResult billingResult, Exception exc) {
        String zza = exc == null ? null : zzdc.zza(exc);
        sea.D(zzjs.ERROR_DECODING_DELEGATE_TO_BACKEND_RESPONSE_DATA, billingResult, this.e, 33, this.c, zza);
        this.a.onBillingProgramAvailabilityResponse(billingResult, new BillingProgramAvailabilityDetails(i));
    }
}
