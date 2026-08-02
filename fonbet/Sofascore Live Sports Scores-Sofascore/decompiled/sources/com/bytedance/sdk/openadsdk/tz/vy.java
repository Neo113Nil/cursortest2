package com.bytedance.sdk.openadsdk.tz;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vy {
    public static void pcc(WebView webView) {
        if (webView == null) {
            return;
        }
        sf(webView);
        WebSettings settings = webView.getSettings();
        pcc(settings);
        if (settings == null) {
            return;
        }
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Throwable th) {
            qf.pcc("WebViewSettings", "setJavaScriptEnabled error", th);
        }
        try {
            settings.setSupportZoom(false);
        } catch (Throwable th2) {
            qf.pcc("WebViewSettings", "setSupportZoom error", th2);
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setDisplayZoomControls(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setSavePassword(false);
        boolean z = Build.VERSION.SDK_INT >= 28;
        try {
        } catch (Throwable th3) {
            qf.pcc("WebViewSettings", "setLayerType error", th3);
        }
        if (z) {
            if (z) {
                webView.setLayerType(2, null);
            }
            webView.getSettings().setMixedContentMode(0);
        }
        webView.setLayerType(0, null);
        webView.getSettings().setMixedContentMode(0);
    }

    private static void sf(WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            qf.pcc("WebViewSettings", "removeJavascriptInterfacesSafe error", th);
        }
    }

    private static void pcc(WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th) {
            qf.pcc("WebViewSettings", "allowMediaPlayWithoutUserGesture error", th);
        }
    }
}
