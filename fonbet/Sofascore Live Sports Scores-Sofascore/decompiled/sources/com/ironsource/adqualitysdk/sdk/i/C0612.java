package com.ironsource.adqualitysdk.sdk.i;

import com.unity3d.mediation.impression.LevelPlayImpressionData;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ꮣ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0612 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0589 f1981;

    public C0612(C0589 c0589) {
        this.f1981 = c0589;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0589 c0589 = this.f1981;
        LevelPlayImpressionData levelPlayImpressionData = (LevelPlayImpressionData) arrayList.get(0);
        c0589.getClass();
        return levelPlayImpressionData.getAllData();
    }
}
