package com.unity3d.ads.core.domain.billing;

import com.android.billingclient.api.BillingClient;
import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0086\u0002¨\u0006\u0006"}, d2 = {"Lcom/unity3d/ads/core/domain/billing/IsBillingClientAvailable;", "", "<init>", "()V", "invoke", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IsBillingClientAvailable {
    public final boolean invoke() {
        Object u2gVar;
        try {
            p2g p2gVar = w2g.b;
            u2gVar = BillingClient.class;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        return !(u2gVar instanceof u2g);
    }
}
