package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
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
