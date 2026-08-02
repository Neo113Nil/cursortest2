package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class E5 implements E0 {
    public final Map<String, Object> a(C2445h0 adProperties) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        String aVar = adProperties.a().toString();
        Intrinsics.checkNotNullExpressionValue(aVar, "adProperties.adFormat.toString()");
        hashMap.put(Va.f, aVar);
        hashMap.put("adf", Integer.valueOf(Ff.c(adProperties.a())));
        String uuid = adProperties.b().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adProperties.adId.toString()");
        hashMap.put(Va.i, uuid);
        hashMap.put("mediationAdUnitId", adProperties.c());
        hashMap.put("isMultipleAdUnits", 1);
        return hashMap;
    }
}
