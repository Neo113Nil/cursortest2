package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;

/* loaded from: classes13.dex */
class r {
    private s a;
    private boolean b = false;

    public r(s sVar) {
        this.a = sVar;
    }

    @JavascriptInterface
    public String getTokenForMessaging() {
        if (this.b) {
            return "";
        }
        this.b = true;
        return this.a.b();
    }
}
