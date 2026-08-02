package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes13.dex */
public final class A implements InterfaceC4401k7 {
    private final M8 a;

    public A(M8 m8) {
        this.a = m8;
    }

    @Override // com.ironsource.InterfaceC4401k7
    public void a(Map<String, Object> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(O6.K0, Integer.valueOf(this.a.a(LevelPlay.AdFormat.INTERSTITIAL)));
        map.put("interstitial", linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(O6.K0, Integer.valueOf(this.a.a(LevelPlay.AdFormat.REWARDED)));
        map.put(O6.H0, linkedHashMap2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(O6.K0, Integer.valueOf(this.a.a(LevelPlay.AdFormat.BANNER)));
        map.put("banner", linkedHashMap3);
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put(O6.K0, Integer.valueOf(this.a.a(LevelPlay.AdFormat.NATIVE_AD)));
        map.put("nativeAd", linkedHashMap4);
    }
}
