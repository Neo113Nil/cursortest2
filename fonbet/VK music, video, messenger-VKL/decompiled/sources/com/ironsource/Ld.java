package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes13.dex */
public class Ld {
    private static Ld b;
    private final ConcurrentHashMap<String, NetworkSettings> a = new ConcurrentHashMap<>();

    private Ld() {
    }

    public static synchronized Ld c() {
        Ld ld;
        synchronized (Ld.class) {
            try {
                if (b == null) {
                    b = new Ld();
                }
                ld = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ld;
    }

    public void a(NetworkSettings networkSettings) {
        if (networkSettings == null || TextUtils.isEmpty(networkSettings.getProviderName())) {
            return;
        }
        this.a.put(networkSettings.getProviderName(), networkSettings);
    }

    public NetworkSettings b(String str) {
        NetworkSettings networkSettings = this.a.get(str);
        if (networkSettings != null) {
            return networkSettings;
        }
        NetworkSettings networkSettings2 = new NetworkSettings(str);
        a(networkSettings2);
        return networkSettings2;
    }

    public ConcurrentHashMap<String, NetworkSettings> d() {
        return this.a;
    }

    public void a() {
        this.a.clear();
    }

    public NetworkSettings c(String str) {
        for (NetworkSettings networkSettings : this.a.values()) {
            if ("IronSource".equals(networkSettings.getProviderTypeForReflection()) && str.equalsIgnoreCase(networkSettings.getSubProviderId())) {
                return networkSettings;
            }
        }
        return new NetworkSettings(str);
    }

    public HashSet<String> a(String str, String str2) {
        HashSet<String> hashSet = new HashSet<>();
        try {
            for (NetworkSettings networkSettings : this.a.values()) {
                if (networkSettings.getProviderTypeForReflection().equals(str)) {
                    if (networkSettings.getRewardedVideoSettings() != null && networkSettings.getRewardedVideoSettings().length() > 0 && !TextUtils.isEmpty(networkSettings.getRewardedVideoSettings().optString(str2))) {
                        hashSet.add(networkSettings.getRewardedVideoSettings().optString(str2));
                    }
                    if (networkSettings.getInterstitialSettings() != null && networkSettings.getInterstitialSettings().length() > 0 && !TextUtils.isEmpty(networkSettings.getInterstitialSettings().optString(str2))) {
                        hashSet.add(networkSettings.getInterstitialSettings().optString(str2));
                    }
                    if (networkSettings.getBannerSettings() != null && networkSettings.getBannerSettings().length() > 0 && !TextUtils.isEmpty(networkSettings.getBannerSettings().optString(str2))) {
                        hashSet.add(networkSettings.getBannerSettings().optString(str2));
                    }
                    if (networkSettings.getNativeAdSettings() != null && networkSettings.getNativeAdSettings().length() > 0 && !TextUtils.isEmpty(networkSettings.getNativeAdSettings().optString(str2))) {
                        hashSet.add(networkSettings.getNativeAdSettings().optString(str2));
                    }
                }
            }
            return hashSet;
        } catch (Exception e) {
            C4452n4.d().a(e);
            return hashSet;
        }
    }

    public void b() {
        for (NetworkSettings networkSettings : this.a.values()) {
            if (networkSettings.isMultipleInstances() && !TextUtils.isEmpty(networkSettings.getProviderTypeForReflection())) {
                NetworkSettings b2 = b(networkSettings.getProviderDefaultInstance());
                networkSettings.setApplicationSettings(IronSourceUtils.b(networkSettings.getApplicationSettings(), b2.getApplicationSettings()));
                networkSettings.setInterstitialSettings(IronSourceUtils.b(networkSettings.getInterstitialSettings(), b2.getInterstitialSettings()));
                networkSettings.setRewardedVideoSettings(IronSourceUtils.b(networkSettings.getRewardedVideoSettings(), b2.getRewardedVideoSettings()));
                networkSettings.setBannerSettings(IronSourceUtils.b(networkSettings.getBannerSettings(), b2.getBannerSettings()));
                networkSettings.setNativeAdSettings(IronSourceUtils.b(networkSettings.getNativeAdSettings(), b2.getNativeAdSettings()));
            }
        }
    }

    public boolean a(String str) {
        return this.a.containsKey(str);
    }
}
