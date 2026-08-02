package com.mbridge.msdk.mbsignalcommon.windvane;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.ironsource.B5;
import com.mbridge.msdk.foundation.tools.q0;

/* compiled from: WindVaneWebViewClient.java */
/* loaded from: classes13.dex */
public class k extends com.mbridge.msdk.mbsignalcommon.base.b {
    protected String c = null;
    private int d = 0;
    private c e;

    private WebResourceResponse a(String str) {
        try {
            if (TextUtils.isEmpty(str) || !i.e(str)) {
                return null;
            }
            q0.c("WindVaneWebViewClient", "is image " + str);
            Bitmap b = com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).b(str);
            q0.c("WindVaneWebViewClient", "find image from cache " + str);
            if (b == null || b.isRecycled()) {
                return null;
            }
            return new WebResourceResponse(i.b(str), B5.O, com.mbridge.msdk.foundation.same.image.a.a(b));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.c = str;
        c cVar = this.e;
        if (cVar != null) {
            cVar.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(11)
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebResourceResponse a = a(str);
        if (a == null) {
            return super.shouldInterceptRequest(webView, str);
        }
        q0.c("WindVaneWebViewClient", "find WebResourceResponse url is " + str);
        return a;
    }
}
