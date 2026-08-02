package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
final class zzbq extends ResultReceiver {
    public final /* synthetic */ InAppMessageResponseListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbq(a aVar, Handler handler, InAppMessageResponseListener inAppMessageResponseListener) {
        super(handler);
        this.a = inAppMessageResponseListener;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        InAppMessageResult inAppMessageResult;
        if (bundle == null) {
            inAppMessageResult = new InAppMessageResult(0, null);
        } else {
            int i2 = com.google.android.gms.internal.play_billing.zzc.a;
            int i3 = bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
            String string = bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN");
            bundle.getString("IN_APP_MESSAGE_PURCHASE_ID");
            inAppMessageResult = new InAppMessageResult(i3, string, 0);
        }
        this.a.onInAppMessageResponse(inAppMessageResult);
    }
}
