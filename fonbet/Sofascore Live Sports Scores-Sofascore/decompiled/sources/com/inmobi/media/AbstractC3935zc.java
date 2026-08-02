package com.inmobi.media;

import com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.BuildConfig;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.zc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3935zc {
    public static Ac a(TimeoutConfigurations.MediationConfig mediationConfig, String str, String str2, String str3) {
        TimeoutConfigurations.AdNonABConfig banner;
        TimeoutConfigurations.AdPreloadConfig banner2;
        TimeoutConfigurations.AdABConfig banner3;
        mediationConfig.getClass();
        str.getClass();
        str2.getClass();
        if (str.equals("AB")) {
            TimeoutConfigurations.ABConfig ab = mediationConfig.getAb();
            int hashCode = str2.hashCode();
            if (hashCode == -1396342996) {
                if (str2.equals("banner")) {
                    banner3 = ab.getBanner();
                }
                banner3 = ab.getBanner();
            } else if (hashCode == -1052618729) {
                if (str2.equals(IronSourceConstants.EVENTS_NATIVE)) {
                    banner3 = ab.getNative();
                }
                banner3 = ab.getBanner();
            } else if (hashCode != 104431) {
                if (hashCode == 93166550 && str2.equals("audio")) {
                    banner3 = ab.getAudio();
                }
                banner3 = ab.getBanner();
            } else {
                if (str2.equals("int")) {
                    banner3 = ab.getInt();
                }
                banner3 = ab.getBanner();
            }
            return new Ac(a(str3, banner3.getLoadRetryInterval()), a(str3, banner3.getMaxLoadRetries()), a(str3, banner3.getLoadTimeout()), (Integer) null, 24);
        }
        if (str.equals("Preload")) {
            TimeoutConfigurations.PreloadConfig preload = mediationConfig.getPreload();
            int hashCode2 = str2.hashCode();
            if (hashCode2 == -1396342996) {
                if (str2.equals("banner")) {
                    banner2 = preload.getBanner();
                }
                banner2 = preload.getBanner();
            } else if (hashCode2 == -1052618729) {
                if (str2.equals(IronSourceConstants.EVENTS_NATIVE)) {
                    banner2 = preload.getNative();
                }
                banner2 = preload.getBanner();
            } else if (hashCode2 != 104431) {
                if (hashCode2 == 93166550 && str2.equals("audio")) {
                    banner2 = preload.getAudio();
                }
                banner2 = preload.getBanner();
            } else {
                if (str2.equals("int")) {
                    banner2 = preload.getInt();
                }
                banner2 = preload.getBanner();
            }
            return new Ac(a(str3, banner2.getLoadRetryInterval()), a(str3, banner2.getMaxLoadRetries()), a(str3, banner2.getLoadTimeout()), Integer.valueOf(a(str3, banner2.getMuttTimeout())), Integer.valueOf(a(str3, banner2.getPreloadTimeout())));
        }
        TimeoutConfigurations.NonABConfig nonAb = mediationConfig.getNonAb();
        int hashCode3 = str2.hashCode();
        if (hashCode3 == -1396342996) {
            if (str2.equals("banner")) {
                banner = nonAb.getBanner();
            }
            banner = nonAb.getBanner();
        } else if (hashCode3 == -1052618729) {
            if (str2.equals(IronSourceConstants.EVENTS_NATIVE)) {
                banner = nonAb.getNative();
            }
            banner = nonAb.getBanner();
        } else if (hashCode3 != 104431) {
            if (hashCode3 == 93166550 && str2.equals("audio")) {
                banner = nonAb.getAudio();
            }
            banner = nonAb.getBanner();
        } else {
            if (str2.equals("int")) {
                banner = nonAb.getInt();
            }
            banner = nonAb.getBanner();
        }
        return new Ac(a(str3, banner.getLoadRetryInterval()), a(str3, banner.getMaxLoadRetries()), a(str3, banner.getLoadTimeout()), Integer.valueOf(a(str3, banner.getMuttTimeout())), 16);
    }

    public static int a(String str, JSONObject jSONObject) {
        if (str != null && jSONObject.has(str)) {
            return jSONObject.getInt(str);
        }
        return jSONObject.optInt(BuildConfig.FLAVOR, 0);
    }
}
