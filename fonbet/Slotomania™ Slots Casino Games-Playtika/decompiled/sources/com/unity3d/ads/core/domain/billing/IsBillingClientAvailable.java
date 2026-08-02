package com.unity3d.ads.core.domain.billing;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;

/* compiled from: IsBillingClientAvailable.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0086\u0002¨\u0006\u0005"}, d2 = {"Lcom/unity3d/ads/core/domain/billing/IsBillingClientAvailable;", "", "()V", "invoke", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IsBillingClientAvailable {
    public final boolean invoke() {
        Object m11180constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            IsBillingClientAvailable isBillingClientAvailable = this;
            m11180constructorimpl = Result.m11180constructorimpl(Class.forName("com.android.billingclient.api.BillingClient"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        return Result.m11187isSuccessimpl(m11180constructorimpl);
    }
}
