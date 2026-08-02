package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class A implements InterfaceC4089g7 {

    @NotNull
    private final J8 a;

    public A(@NotNull J8 j8) {
        j8.getClass();
        this.a = j8;
    }

    @Override // com.ironsource.InterfaceC4089g7
    public void a(@NotNull Map<String, Object> map) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(L6.K0, Integer.valueOf(this.a.a(LevelPlay.AdFormat.INTERSTITIAL)));
        map.put("interstitial", linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(L6.K0, Integer.valueOf(this.a.a(LevelPlay.AdFormat.REWARDED)));
        map.put(L6.H0, linkedHashMap2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(L6.K0, Integer.valueOf(this.a.a(LevelPlay.AdFormat.BANNER)));
        map.put("banner", linkedHashMap3);
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put(L6.K0, Integer.valueOf(this.a.a(LevelPlay.AdFormat.NATIVE_AD)));
        map.put("nativeAd", linkedHashMap4);
    }
}
