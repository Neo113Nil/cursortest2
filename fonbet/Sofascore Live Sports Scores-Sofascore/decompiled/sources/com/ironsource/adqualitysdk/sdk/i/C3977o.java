package com.ironsource.adqualitysdk.sdk.i;

import com.vungle.ads.internal.model.AdPayload;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3977o implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C3981t f191;

    public C3977o(C3981t c3981t) {
        this.f191 = c3981t;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C3981t c3981t = this.f191;
        AdPayload.CacheableReplacement cacheableReplacement = (AdPayload.CacheableReplacement) arrayList.get(0);
        c3981t.getClass();
        return cacheableReplacement.getUrl();
    }
}
