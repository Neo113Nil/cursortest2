package com.ironsource.adqualitysdk.sdk.i;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ۅ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0515 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0464 f1749;

    public C0515(C0464 c0464) {
        this.f1749 = c0464;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        this.f1749.getClass();
        AdView adView = (AdView) AbstractC0475.m295(arrayList, 0, AdView.class);
        this.f1749.getClass();
        adView.setAdListener((AdListener) AbstractC0475.m295(arrayList, 1, AdListener.class));
        return null;
    }
}
