package defpackage;

import android.os.Bundle;
import com.android.billingclient.api.BillingProgramReportingDetails;
import com.android.billingclient.api.BillingProgramReportingDetailsListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.m;
import com.android.billingclient.api.n;
import com.android.billingclient.api.zzdc;
import com.google.android.gms.internal.play_billing.zzab;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzdx;
import com.google.android.gms.internal.play_billing.zzjs;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zx3 extends zzab {
    public final BillingProgramReportingDetailsListener a;
    public final int b;
    public final int c;
    public final ExecutorService d;
    public final lyn e;

    public zx3(BillingProgramReportingDetailsListener billingProgramReportingDetailsListener, int i, c0l c0lVar, int i2, ExecutorService executorService) {
        billingProgramReportingDetailsListener.getClass();
        this.a = billingProgramReportingDetailsListener;
        this.b = i;
        this.e = c0lVar;
        this.c = i2;
        this.d = executorService;
    }

    @Override // com.google.android.gms.internal.play_billing.zzac
    public final void U2(Bundle bundle) {
        BillingProgramReportingDetailsListener billingProgramReportingDetailsListener = this.a;
        int i = this.c;
        lyn lynVar = this.e;
        if (bundle == null) {
            BillingResult billingResult = m.h;
            sea.B(zzjs.NULL_BUNDLE_FROM_DELEGATE_TO_BACKEND_SERVICE_CALL, billingResult, lynVar, 35, i);
            billingProgramReportingDetailsListener.onCreateBillingProgramReportingDetailsResponse(billingResult, null);
            return;
        }
        BillingResult a = n.a(bundle, 35, lynVar, i);
        if (billingProgramReportingDetailsListener == null) {
            sea.B(zzjs.NULL_LISTENER_IN_DELEGATE_TO_BACKEND_CALLBACK, a, lynVar, 35, i);
            return;
        }
        if (a.getResponseCode() != 0) {
            billingProgramReportingDetailsListener.onCreateBillingProgramReportingDetailsResponse(a, null);
            return;
        }
        try {
            byte[] byteArray = bundle.getByteArray("RESPONSE_DATA");
            if (byteArray == null) {
                throw new Exception("Response data is null");
            }
            billingProgramReportingDetailsListener.onCreateBillingProgramReportingDetailsResponse(a, new BillingProgramReportingDetails(zzdx.p(byteArray).q().q(), this.b));
        } catch (Exception e) {
            int i2 = zzc.a;
            BillingResult billingResult2 = m.h;
            sea.D(zzjs.ERROR_DECODING_DELEGATE_TO_BACKEND_RESPONSE_DATA, billingResult2, this.e, 35, this.c, zzdc.zza(e));
            billingProgramReportingDetailsListener.onCreateBillingProgramReportingDetailsResponse(billingResult2, null);
        }
    }
}
