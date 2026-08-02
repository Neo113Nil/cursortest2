package com.unity3d.ads.core.domain.billing;

import com.android.billingclient.api.BillingClient;
import kotlin.Result;

/* compiled from: IsBillingClientAvailable.kt */
/* loaded from: classes14.dex */
public final class IsBillingClientAvailable {
    public final boolean invoke() {
        return !(BillingClient.class instanceof Result.Failure);
    }
}
