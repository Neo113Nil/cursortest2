package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.android.billingclient.api.BillingResult;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzjz;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
final class zzbn extends ResultReceiver {
    public final /* synthetic */ BillingProgramInformationDialogListener a;
    public final /* synthetic */ a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbn(a aVar, Handler handler, BillingProgramInformationDialogListener billingProgramInformationDialogListener) {
        super(handler);
        this.a = billingProgramInformationDialogListener;
        Objects.requireNonNull(aVar);
        this.b = aVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        BillingResult.Builder newBuilder = BillingResult.newBuilder();
        newBuilder.setResponseCode(i);
        BillingProgramInformationDialogListener billingProgramInformationDialogListener = this.a;
        if (i != 0) {
            a aVar = this.b;
            if (bundle == null) {
                aVar.F(billingProgramInformationDialogListener, m.h, zzjs.NULL_BUNDLE_RETURNED_BY_PHONESKY, null);
                return;
            }
            newBuilder.setDebugMessage(com.google.android.gms.internal.play_billing.zzc.g(bundle, "BillingClient"));
            int i2 = bundle.getInt("INTERNAL_LOG_ERROR_REASON");
            zzjs a = i2 != 0 ? zzjs.a(i2) : zzjs.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
            BillingResult build = newBuilder.build();
            String string = bundle.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS");
            int i3 = zzdc.zza;
            aVar.H(zzdc.zzb(a, 39, build, string, zzjz.BROADCAST_ACTION_UNSPECIFIED));
        }
        billingProgramInformationDialogListener.onBillingProgramInformationDialogResponse(newBuilder.build());
    }
}
