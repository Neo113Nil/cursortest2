package com.ironsource.adqualitysdk.sdk.i;

import com.amazon.device.ads.DTBFetchManager;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｎ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1144 extends HashMap implements InterfaceC0873 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1143 f3623;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0683 f3624;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1144(C1143 c1143, HashMap hashMap, C0683 c0683) {
        super(hashMap);
        this.f3623 = c1143;
        this.f3624 = c0683;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        String str = (String) obj;
        DTBFetchManager dTBFetchManager = (DTBFetchManager) obj2;
        this.f3623.m270(this, this.f3624, StringFog.decrypt("a+uQxYM709Ni3rzigSrC0GfeoeurLsCVX8qm\n", "L7/Sg+ZPsLs=\n"), str, dTBFetchManager);
        return (DTBFetchManager) super.put(str, dTBFetchManager);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0873
    /* renamed from: ﾒ */
    public final Object mo127() {
        return this;
    }
}
