package com.playtika.pras.e;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.playtika.pras.sdk.views.RedirectionWebViewActivity;

/* loaded from: classes4.dex */
public final class k extends WebViewClient {
    public final RedirectionWebViewActivity a;
    public final String b;

    public k(RedirectionWebViewActivity redirectionWebViewActivity, String str) {
        this.a = redirectionWebViewActivity;
        this.b = str;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!str.startsWith(this.b)) {
            webView.loadUrl(str);
            return true;
        }
        RedirectionWebViewActivity redirectionWebViewActivity = this.a;
        redirectionWebViewActivity.getClass();
        redirectionWebViewActivity.setResult(-1, new Intent("android.intent.action.VIEW", Uri.parse(str)));
        redirectionWebViewActivity.finish();
        return true;
    }
}
