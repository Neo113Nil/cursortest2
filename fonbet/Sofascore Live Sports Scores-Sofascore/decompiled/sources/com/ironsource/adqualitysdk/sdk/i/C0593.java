package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ๅ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0593 implements InterfaceC0496 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0495 f1957;

    public C0593(C0495 c0495) {
        this.f1957 = c0495;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0496
    /* renamed from: ﾒ */
    public final Object mo323(List list) {
        AbstractC0287 m312 = this.f1957.m312(list);
        if ((m312 instanceof C0337) || (m312 instanceof C0581)) {
            return m312;
        }
        this.f1957.m321(StringFog.decrypt("XnO8MJBPuy87fa0nmlq8J34rriCHG6wueG6lI5Zf/g==\n", "GwvMVfM73ks=\n") + m312);
        throw null;
    }
}
