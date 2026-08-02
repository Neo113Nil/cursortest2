package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.م, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0478 extends AbstractRunnableC0606 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0469 f1546;

    public C0478(C0469 c0469) {
        this.f1546 = c0469;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        C0439 c0439 = this.f1546.f1518;
        if (c0439.f1249) {
            C0558 c0558 = c0439.f1248;
            String decrypt = StringFog.decrypt("XMaKfGW2KRlfjY15YaMuNUTQmnppkCUA\n", "MaPuFQTCQHY=\n");
            c0558.getClass();
            c0558.m372(decrypt, new ArrayList());
            this.f1546.f1518.f1249 = false;
        }
    }
}
