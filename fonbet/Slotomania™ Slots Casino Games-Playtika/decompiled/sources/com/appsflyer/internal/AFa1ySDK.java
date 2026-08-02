package com.appsflyer.internal;

import com.appsflyer.AFLogger;

@Deprecated
/* loaded from: classes4.dex */
public final class AFa1ySDK {
    private final AFa1tSDK getRevenue = new AFa1tSDK() { // from class: com.appsflyer.internal.AFa1ySDK.4
        @Override // com.appsflyer.internal.AFa1ySDK.AFa1tSDK
        public final Class<?> getMediationNetwork(String str) throws ClassNotFoundException {
            return Class.forName(str);
        }
    };

    interface AFa1tSDK {
        Class<?> getMediationNetwork(String str) throws ClassNotFoundException;
    }

    public final String getMediationNetwork() {
        for (AFa1zSDK aFa1zSDK : AFa1zSDK.values()) {
            if (getMonetizationNetwork(aFa1zSDK.getMonetizationNetwork)) {
                return aFa1zSDK.AFAdRevenueData;
            }
        }
        return AFa1zSDK.DEFAULT.AFAdRevenueData;
    }

    private boolean getMonetizationNetwork(String str) {
        try {
            this.getRevenue.getMediationNetwork(str);
            AFLogger.afRDLog(new StringBuilder("Class: ").append(str).append(" is found.").toString());
            return true;
        } catch (ClassNotFoundException e) {
            AFLogger.afErrorLogForExcManagerOnly(new StringBuilder("Class: ").append(str).append(" is  not found. (Platform extension)").toString(), e, true);
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return false;
        }
    }

    enum AFa1zSDK {
        ADOBE_AIR("android_adobe_air", "com.appsflyer.adobeair.AppsFlyerExtension"),
        ADOBE_MOBILE_SDK("android_adobe_mobile", "com.appsflyer.adobeextension.AppsFlyerAdobeExtension"),
        COCOS2DX("android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity"),
        CORDOVA("android_cordova", "com.appsflyer.cordova.plugin.AppsFlyerPlugin"),
        DEFAULT("android_native", "android_native"),
        FLUTTER("android_flutter", "com.appsflyer.appsflyersdk.AppsflyerSdkPlugin"),
        M_PARTICLE("android_mparticle", "com.mparticle.kits.AppsFlyerKit"),
        NATIVE_SCRIPT("android_native_script", "com.tns.NativeScriptActivity"),
        EXPO("android_expo", "expo.modules.devmenu.react.DevMenuAwareReactActivity"),
        REACT_NATIVE("android_reactNative", "com.appsflyer.reactnative.RNAppsFlyerModule"),
        UNITY("android_unity", "com.appsflyer.unity.AppsFlyerAndroidWrapper"),
        UNREAL_ENGINE("android_unreal", "com.epicgames.ue4.GameActivity"),
        XAMARIN("android_xamarin", "mono.android.Runtime"),
        CAPACITOR("android_capacitor", "capacitor.plugin.appsflyer.sdk.AppsFlyerPlugin");

        final String AFAdRevenueData;
        final String getMonetizationNetwork;

        AFa1zSDK(String str, String str2) {
            this.AFAdRevenueData = str;
            this.getMonetizationNetwork = str2;
        }
    }
}
