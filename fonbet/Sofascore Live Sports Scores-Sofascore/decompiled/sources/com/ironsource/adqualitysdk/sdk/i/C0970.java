package com.ironsource.adqualitysdk.sdk.i;

import com.hyprmx.android.sdk.api.data.OfferCacheEntity;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.〱, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0970 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0888 f3196;

    public C0970(C0888 c0888) {
        this.f3196 = c0888;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0888 c0888 = this.f3196;
        OfferCacheEntity offerCacheEntity = (OfferCacheEntity) arrayList.get(0);
        c0888.getClass();
        return offerCacheEntity.clickThroughUrl;
    }
}
