package com.ironsource.adqualitysdk.sdk.i;

import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ꮁ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0610 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0589 f1979;

    public C0610(C0589 c0589) {
        this.f1979 = c0589;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0589 c0589 = this.f1979;
        LevelPlayImpressionDataListener levelPlayImpressionDataListener = (LevelPlayImpressionDataListener) arrayList.get(0);
        c0589.getClass();
        LevelPlay.addImpressionDataListener(levelPlayImpressionDataListener);
        return null;
    }
}
