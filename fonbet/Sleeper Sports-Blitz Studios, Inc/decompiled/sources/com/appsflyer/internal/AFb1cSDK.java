package com.appsflyer.internal;

import com.appsflyer.AFLogger;

@Deprecated
/* loaded from: classes6.dex */
public final class AFb1cSDK {
    private final AFa1tSDK AFAdRevenueData = new AFa1tSDK() { // from class: com.appsflyer.internal.AFb1cSDK.1
        @Override // com.appsflyer.internal.AFb1cSDK.AFa1tSDK
        public final Class<?> getMediationNetwork(String str) throws ClassNotFoundException {
            return Class.forName(str);
        }
    };

    interface AFa1tSDK {
        Class<?> getMediationNetwork(String str) throws ClassNotFoundException;
    }

    public final String getRevenue() {
        for (AFa1ySDK aFa1ySDK : AFa1ySDK.values()) {
            if (getRevenue(aFa1ySDK.getRevenue)) {
                return aFa1ySDK.getMonetizationNetwork;
            }
        }
        return AFa1ySDK.DEFAULT.getMonetizationNetwork;
    }

    private boolean getRevenue(String str) {
        try {
            this.AFAdRevenueData.getMediationNetwork(str);
            StringBuilder sb = new StringBuilder("Class: ");
            sb.append(str);
            sb.append(" is found.");
            AFLogger.afRDLog(sb.toString());
            return true;
        } catch (ClassNotFoundException e) {
            StringBuilder sb2 = new StringBuilder("Class: ");
            sb2.append(str);
            sb2.append(" is  not found. (Platform extension)");
            AFLogger.afErrorLogForExcManagerOnly(sb2.toString(), e, true);
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return false;
        }
    }

    enum AFa1ySDK {
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

        final String getMonetizationNetwork;
        final String getRevenue;

        AFa1ySDK(String str, String str2) {
            this.getMonetizationNetwork = str;
            this.getRevenue = str2;
        }
    }
}
