package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.android.billingclient.api.BillingResult;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzjz;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
final class zzbr extends ResultReceiver {
    public final /* synthetic */ AlternativeBillingOnlyInformationDialogListener a;
    public final /* synthetic */ a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbr(a aVar, Handler handler, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        super(handler);
        this.a = alternativeBillingOnlyInformationDialogListener;
        this.b = aVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        BillingResult.Builder newBuilder = BillingResult.newBuilder();
        newBuilder.setResponseCode(i);
        AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener = this.a;
        if (i != 0) {
            a aVar = this.b;
            if (bundle == null) {
                aVar.E(alternativeBillingOnlyInformationDialogListener, m.h, zzjs.NULL_BUNDLE_IN_ALTERNATIVE_BILLING_ONLY_INFORMATION_DIALOG_RECEIVER, null);
                return;
            }
            newBuilder.setDebugMessage(com.google.android.gms.internal.play_billing.zzc.g(bundle, "BillingClient"));
            int i2 = bundle.getInt("INTERNAL_LOG_ERROR_REASON");
            zzjs a = i2 != 0 ? zzjs.a(i2) : zzjs.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
            BillingResult build = newBuilder.build();
            String string = bundle.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS");
            int i3 = zzdc.zza;
            aVar.H(zzdc.zzb(a, 16, build, string, zzjz.BROADCAST_ACTION_UNSPECIFIED));
        }
        alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(newBuilder.build());
    }
}
