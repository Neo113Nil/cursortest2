package com.google.android.gms.ads.mediation.rtb;

import com.google.android.gms.ads.AdError;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes8.dex */
public interface SignalCallbacks {
    void onFailure(AdError adError);

    void onSuccess(String str);
}
