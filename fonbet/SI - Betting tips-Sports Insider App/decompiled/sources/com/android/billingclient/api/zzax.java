package com.android.billingclient.api;

import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.d3;
import com.google.android.gms.internal.play_billing.p1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
final class zzax extends ResultReceiver {
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i5, Bundle bundle) {
        j a7 = k.a();
        a7.f4033a = i5;
        if (i5 == 0) {
            a7.a();
            throw null;
        }
        if (bundle == null) {
            k kVar = t0.f4080a;
            throw null;
        }
        a7.f4034b = p1.e(bundle, "BillingClient");
        int i10 = bundle.getInt("INTERNAL_LOG_ERROR_REASON");
        r0.c(i10 != 0 ? d3.n(i10) : 23, 25, a7.a(), bundle.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS"));
        throw null;
    }
}
