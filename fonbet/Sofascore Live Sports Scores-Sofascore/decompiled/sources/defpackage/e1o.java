package defpackage;

import android.os.Bundle;
import com.android.billingclient.api.BillingChoiceInfo;
import com.android.billingclient.api.BillingChoiceInfoResponseListener;
import com.android.billingclient.api.BillingConfig;
import com.android.billingclient.api.BillingConfigResponseListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.m;
import com.android.billingclient.api.n;
import com.android.billingclient.api.zzdc;
import com.google.android.gms.internal.play_billing.zzab;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzea;
import com.google.android.gms.internal.play_billing.zzed;
import com.google.android.gms.internal.play_billing.zzjs;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class e1o extends zzab {
    public final /* synthetic */ int a = 0;
    public final lyn b;
    public final int c;
    public final Object d;

    public e1o(BillingConfigResponseListener billingConfigResponseListener, c0l c0lVar, int i) {
        billingConfigResponseListener.getClass();
        this.d = billingConfigResponseListener;
        this.b = c0lVar;
        this.c = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzac
    public final void U2(Bundle bundle) {
        int i = this.a;
        Object obj = this.d;
        zzjs zzjsVar = zzjs.NULL_BUNDLE_FROM_DELEGATE_TO_BACKEND_SERVICE_CALL;
        lyn lynVar = this.b;
        int i2 = this.c;
        switch (i) {
            case 0:
                BillingChoiceInfoResponseListener billingChoiceInfoResponseListener = (BillingChoiceInfoResponseListener) obj;
                if (bundle == null) {
                    BillingResult billingResult = m.h;
                    sea.B(zzjsVar, billingResult, lynVar, 40, i2);
                    billingChoiceInfoResponseListener.onBillingChoiceInfoResponse(billingResult, null);
                    return;
                }
                BillingResult a = n.a(bundle, 40, lynVar, i2);
                if (a.getResponseCode() != 0) {
                    billingChoiceInfoResponseListener.onBillingChoiceInfoResponse(a, null);
                    return;
                }
                try {
                    byte[] byteArray = bundle.getByteArray("RESPONSE_DATA");
                    if (byteArray == null) {
                        throw new IllegalArgumentException("Response data is null");
                    }
                    zzea p = zzea.p(byteArray);
                    billingChoiceInfoResponseListener.onBillingChoiceInfoResponse(a, new BillingChoiceInfo(p.q(), p.r()));
                    return;
                } catch (Exception e) {
                    int i3 = zzc.a;
                    BillingResult billingResult2 = m.h;
                    sea.D(zzjs.ERROR_DECODING_DELEGATE_TO_BACKEND_RESPONSE_DATA, billingResult2, this.b, 40, this.c, zzdc.zza(e));
                    billingChoiceInfoResponseListener.onBillingChoiceInfoResponse(billingResult2, null);
                    return;
                }
            default:
                if (bundle == null) {
                    BillingResult billingResult3 = m.h;
                    sea.B(zzjsVar, billingResult3, lynVar, 29, i2);
                    Z1(billingResult3);
                    return;
                }
                BillingResult a2 = n.a(bundle, 29, lynVar, i2);
                if (a2.getResponseCode() != 0) {
                    Z1(a2);
                    return;
                }
                try {
                    byte[] byteArray2 = bundle.getByteArray("RESPONSE_DATA");
                    if (byteArray2 == null) {
                        throw new IllegalArgumentException("Response data is null");
                    }
                    ((BillingConfigResponseListener) obj).onBillingConfigResponse(a2, new BillingConfig(zzed.p(byteArray2).q(), 0));
                    return;
                } catch (Exception e2) {
                    int i4 = zzc.a;
                    BillingResult billingResult4 = m.h;
                    sea.D(zzjs.ERROR_DECODING_DELEGATE_TO_BACKEND_RESPONSE_DATA, billingResult4, this.b, 29, this.c, zzdc.zza(e2));
                    Z1(billingResult4);
                    return;
                }
        }
    }

    public void Z1(BillingResult billingResult) {
        BillingConfigResponseListener billingConfigResponseListener = (BillingConfigResponseListener) this.d;
        if (billingConfigResponseListener != null) {
            billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
        } else {
            sea.B(zzjs.NULL_LISTENER_IN_DELEGATE_TO_BACKEND_CALLBACK, billingResult, this.b, 29, this.c);
        }
    }

    public e1o(BillingChoiceInfoResponseListener billingChoiceInfoResponseListener, c0l c0lVar, int i) {
        this.d = billingChoiceInfoResponseListener;
        this.b = c0lVar;
        this.c = i;
    }
}
