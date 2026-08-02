package com.unity3d.services.banners.properties;

import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public class BannerRefreshInfo {
    private static BannerRefreshInfo instance;
    private HashMap<String, Integer> _refreshRateMap = new HashMap<>();

    public static BannerRefreshInfo getInstance() {
        BannerRefreshInfo bannerRefreshInfo = instance;
        if (bannerRefreshInfo != null) {
            return bannerRefreshInfo;
        }
        BannerRefreshInfo bannerRefreshInfo2 = new BannerRefreshInfo();
        instance = bannerRefreshInfo2;
        return bannerRefreshInfo2;
    }

    public synchronized Integer getRefreshRate(String str) {
        return this._refreshRateMap.get(str);
    }

    public synchronized void setRefreshRate(String str, Integer num) {
        this._refreshRateMap.put(str, num);
    }
}
