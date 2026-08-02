package com.safedk.android.utils;

import com.google.android.gms.ads.MobileAds;
import com.ironsource.M6;
import java.util.TreeMap;

/* loaded from: classes9.dex */
public class SdksMappingInitializer {
    private static final String TAG = "SdksMappingInitializer";

    public static void init(TreeMap<String, String> treeMap, TreeMap<String, String> treeMap2, TreeMap<String, String> treeMap3, TreeMap<String, String> treeMap4, TreeMap<String, String> treeMap5) {
        treeMap.put(h.d, "LiftoffMonetize");
        treeMap2.put(h.d, "217e8f437c9fc4244d6e74653ac8a8c7");
        treeMap4.put(h.d, h.d);
        treeMap5.put("com.applovin.mediation.adapters.VungleMediationAdapter", "217e8f437c9fc4244d6e74653ac8a8c7");
        treeMap.put("com.unity3d.ads", M6.J1);
        treeMap4.put("com.unity3d.services.banners", "com.unity3d.ads");
        treeMap4.put(h.l, "com.unity3d.ads");
        treeMap2.put("com.unity3d.ads", "daaea35726ab7cd457ab61d4538fb822");
        treeMap4.put("com.unity3d.ads", "com.unity3d.ads");
        treeMap5.put("com.applovin.mediation.adapters.UnityAdsMediationAdapter", "daaea35726ab7cd457ab61d4538fb822");
        treeMap.put(h.f, "IronSource");
        treeMap4.put("com.ironsource", h.f);
        treeMap2.put(h.f, "b9b88d70c3d018bfbda46cd93ba3ddca");
        treeMap4.put(h.f, h.f);
        treeMap5.put("com.applovin.mediation.adapters.IronSourceMediationAdapter", "b9b88d70c3d018bfbda46cd93ba3ddca");
        treeMap.put(h.D, "MolocoAds");
        treeMap2.put(h.D, "213ac5b6803852323d73a1292440d7be");
        treeMap4.put(h.D, h.D);
        treeMap5.put("com.applovin.mediation.adapters.MolocoMediationAdapter", "213ac5b6803852323d73a1292440d7be");
        treeMap.put(h.h, "AdMob");
        treeMap4.put("com.google.android.gms.internal", h.h);
        treeMap4.put(MobileAds.ERROR_DOMAIN, h.h);
        treeMap2.put(h.h, "29015bbfcc182d80e7f75bd2c38e4521");
        treeMap4.put(h.h, h.h);
        treeMap5.put("com.applovin.mediation.adapters.GoogleMediationAdapter", "29015bbfcc182d80e7f75bd2c38e4521");
        treeMap.put(h.a, "AppLovin");
        treeMap2.put(h.a, "74616804a7dc29147dfb0afe122a9fd2");
        treeMap4.put(h.a, h.a);
        treeMap5.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", "74616804a7dc29147dfb0afe122a9fd2");
    }
}
