package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zabx extends zap {
    @Override // com.google.android.gms.common.api.internal.zap
    public final void a(ConnectionResult connectionResult, int i) {
        String str = connectionResult.d;
        if (str == null) {
            str = "Error connecting to Google Play services";
        }
        new ApiException(new Status(connectionResult.b, str, connectionResult.c, connectionResult));
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void b() {
        if (this.mLifecycleFragment.g() != null) {
            int i = GoogleApiAvailabilityLight.a;
            throw null;
        }
        new ApiException(new Status(8, null, null, null));
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onDestroy() {
        super.onDestroy();
        new CancellationException("Host activity was destroyed before Google Play services could be made available.");
        throw null;
    }
}
