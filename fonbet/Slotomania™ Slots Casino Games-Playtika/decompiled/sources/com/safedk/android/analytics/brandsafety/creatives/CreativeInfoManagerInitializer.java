package com.safedk.android.analytics.brandsafety.creatives;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.n;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.r;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.t;
import java.util.TreeMap;

/* loaded from: classes9.dex */
public class CreativeInfoManagerInitializer {
    public static void init(TreeMap<String, AdNetworkDiscovery> treeMap) {
        treeMap.put(com.safedk.android.utils.h.h, new com.safedk.android.analytics.brandsafety.creatives.discoveries.a());
        treeMap.put(com.safedk.android.utils.h.a, new com.safedk.android.analytics.brandsafety.creatives.discoveries.c());
        treeMap.put(com.safedk.android.utils.h.f, new com.safedk.android.analytics.brandsafety.creatives.discoveries.h());
        treeMap.put(com.safedk.android.utils.h.D, new n());
        r rVar = new r();
        treeMap.put(com.safedk.android.utils.h.m, rVar);
        treeMap.put("com.unity3d.ads", rVar);
        treeMap.put(com.safedk.android.utils.h.d, new t());
    }
}
