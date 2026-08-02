package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.宀, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1003 extends AbstractRunnableC0606 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0926 f3242;

    public C1003(C0926 c0926) {
        this.f3242 = c0926;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        C1000 c1000 = this.f3242.f3090;
        String decrypt = StringFog.decrypt("cxbnBDTGYbViCNw=\n", "B2a4d1G1Euo=\n");
        c1000.getClass();
        AbstractC1008.m611(new C1002(c1000, decrypt));
        this.f3242.m556(StringFog.decrypt("fNViMk8lGpxty1k=\n", "CKU9QSpWacM=\n"), new JSONObject());
    }
}
