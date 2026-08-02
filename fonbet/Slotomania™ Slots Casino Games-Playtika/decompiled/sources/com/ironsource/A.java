package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class A implements InterfaceC2487j7 {
    private final L8 a;

    public A(L8 sessionDepthService) {
        Intrinsics.checkNotNullParameter(sessionDepthService, "sessionDepthService");
        this.a = sessionDepthService;
    }

    @Override // com.ironsource.InterfaceC2487j7
    public void a(Map<String, Object> output) {
        Intrinsics.checkNotNullParameter(output, "output");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(M6.K0, Integer.valueOf(this.a.a(LevelPlay.AdFormat.INTERSTITIAL)));
        output.put("interstitial", linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(M6.K0, Integer.valueOf(this.a.a(LevelPlay.AdFormat.REWARDED)));
        output.put(M6.H0, linkedHashMap2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(M6.K0, Integer.valueOf(this.a.a(LevelPlay.AdFormat.BANNER)));
        output.put("banner", linkedHashMap3);
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put(M6.K0, Integer.valueOf(this.a.a(LevelPlay.AdFormat.NATIVE_AD)));
        output.put("nativeAd", linkedHashMap4);
    }
}
