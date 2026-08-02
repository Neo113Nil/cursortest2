package com.playtika.pras.sdk.views;

import android.webkit.JavascriptInterface;

/* loaded from: classes8.dex */
class RedirectionJSInterface {
    private String uriScheme;

    public RedirectionJSInterface(String str) {
        this.uriScheme = str;
    }

    @JavascriptInterface
    public String getReturnUrlPrefix() {
        return this.uriScheme + "://resultdatav1/";
    }

    @JavascriptInterface
    public boolean isAndroid() {
        return true;
    }
}
