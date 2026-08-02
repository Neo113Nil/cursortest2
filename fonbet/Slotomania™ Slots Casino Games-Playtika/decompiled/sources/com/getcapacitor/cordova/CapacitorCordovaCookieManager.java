package com.getcapacitor.cordova;

import android.webkit.CookieManager;
import com.getcapacitor.ViewBridge;
import org.apache.cordova.ICordovaCookieManager;

/* loaded from: classes6.dex */
class CapacitorCordovaCookieManager implements ICordovaCookieManager {
    private final CookieManager cookieManager;
    protected final ViewBridge webViewBridge;

    public CapacitorCordovaCookieManager(ViewBridge viewBridge) {
        this.webViewBridge = viewBridge;
        CookieManager cookieManager = CookieManager.getInstance();
        this.cookieManager = cookieManager;
        viewBridge.configureCookieManager(cookieManager);
    }

    @Override // org.apache.cordova.ICordovaCookieManager
    public void setCookiesEnabled(boolean z) {
        this.cookieManager.setAcceptCookie(z);
    }

    @Override // org.apache.cordova.ICordovaCookieManager
    public void setCookie(String str, String str2) {
        this.cookieManager.setCookie(str, str2);
    }

    @Override // org.apache.cordova.ICordovaCookieManager
    public String getCookie(String str) {
        return this.cookieManager.getCookie(str);
    }

    @Override // org.apache.cordova.ICordovaCookieManager
    public void clearCookies() {
        this.cookieManager.removeAllCookie();
    }

    @Override // org.apache.cordova.ICordovaCookieManager
    public void flush() {
        this.cookieManager.flush();
    }
}
