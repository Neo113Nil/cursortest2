package com.safedk.android.utils;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes7.dex */
public class SafeDKMaxSimulator {
    private static final String a = "SafeDKMaxSimulator";

    public static void setRedirectSimulationMode(String targetUrl, String webviewString) {
        Logger.d(a, "set redirect simulation mode, ignore next touch event and intent, targetUrl: ", targetUrl, ", webview: ", webviewString);
        DetectTouchUtils.b(webviewString);
        BrandSafetyUtils.t(targetUrl);
    }

    public static void resetRedirectSimulationMode() {
        Logger.d(a, "reset redirect simulation mode");
        DetectTouchUtils.a();
        BrandSafetyUtils.i();
    }

    public static boolean toggleIgnoreTouchEvents() {
        Logger.d(a, "toggle ignore touch events");
        return DetectTouchUtils.b();
    }
}
