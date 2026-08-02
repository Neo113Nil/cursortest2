package com.fyber.inneractive.sdk.util;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class q0 {
    public static void a(WebView webView, String str) {
        webView.evaluateJavascript(str, null);
    }

    public static void a(com.fyber.inneractive.sdk.web.m mVar, String str, ValueCallback valueCallback) {
        mVar.evaluateJavascript(str, valueCallback);
    }
}
