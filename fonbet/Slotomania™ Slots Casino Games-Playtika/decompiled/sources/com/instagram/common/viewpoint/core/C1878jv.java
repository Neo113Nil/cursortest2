package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.jv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1878jv extends AbstractRunnableC1182Wc {
    public final /* synthetic */ C1877ju A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ Map A02;

    public C1878jv(C1877ju c1877ju, Map map, Map map2) {
        this.A00 = c1877ju;
        this.A02 = map;
        this.A01 = map2;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1182Wc
    public final void A07() {
        C1865ji c1865ji;
        C1695gi c1695gi;
        C1865ji c1865ji2;
        c1865ji = this.A00.A01;
        if (!TextUtils.isEmpty(c1865ji.A7O())) {
            HashMap hashMap = new HashMap();
            Map<String, String> extraData = this.A02;
            hashMap.putAll(extraData);
            Map<String, String> extraData2 = this.A01;
            hashMap.putAll(extraData2);
            c1695gi = this.A00.A0A;
            VA A0A = c1695gi.A0A();
            c1865ji2 = this.A00.A01;
            A0A.AC3(c1865ji2.A7O(), hashMap);
        }
    }
}
