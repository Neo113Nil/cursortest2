package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class C5 implements D0 {
    @NotNull
    public final Map<String, Object> a(@NotNull C4100h0 c4100h0) {
        c4100h0.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        String aVar = c4100h0.a().toString();
        aVar.getClass();
        hashMap.put(Ta.f, aVar);
        hashMap.put("adf", Integer.valueOf(Gf.c(c4100h0.a())));
        String uuid = c4100h0.b().toString();
        uuid.getClass();
        hashMap.put(Ta.i, uuid);
        hashMap.put("mediationAdUnitId", c4100h0.c());
        hashMap.put("isMultipleAdUnits", 1);
        return hashMap;
    }
}
