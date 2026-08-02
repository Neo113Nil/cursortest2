package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes13.dex */
public abstract class E5 implements E0 {
    public final Map<String, Object> a(C4341h0 c4341h0) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        hashMap.put(Wa.f, c4341h0.a().toString());
        hashMap.put("adf", Integer.valueOf(If.c(c4341h0.a())));
        hashMap.put(Wa.i, c4341h0.b().toString());
        hashMap.put("mediationAdUnitId", c4341h0.c());
        hashMap.put("isMultipleAdUnits", 1);
        return hashMap;
    }
}
