package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.jv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2835jv extends AbstractRunnableC2139Wc {
    public final /* synthetic */ C2834ju A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ Map A02;

    public C2835jv(C2834ju c2834ju, Map map, Map map2) {
        this.A00 = c2834ju;
        this.A02 = map;
        this.A01 = map2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2139Wc
    public final void A07() {
        C2822ji c2822ji;
        C2652gi c2652gi;
        C2822ji c2822ji2;
        c2822ji = this.A00.A01;
        if (!TextUtils.isEmpty(c2822ji.A7O())) {
            HashMap hashMap = new HashMap();
            Map<String, String> extraData = this.A02;
            hashMap.putAll(extraData);
            Map<String, String> extraData2 = this.A01;
            hashMap.putAll(extraData2);
            c2652gi = this.A00.A0A;
            VA A0A = c2652gi.A0A();
            c2822ji2 = this.A00.A01;
            A0A.AC3(c2822ji2.A7O(), hashMap);
        }
    }
}
