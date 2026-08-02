package com.ironsource.adqualitysdk.sdk.i;

import com.moloco.sdk.publisher.Banner;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᔿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0741 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0700 f2457;

    public C0741(C0700 c0700) {
        this.f2457 = c0700;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0700 c0700 = this.f2457;
        Banner banner = (Banner) arrayList.get(0);
        c0700.getClass();
        return banner.getAdShowListener();
    }
}
