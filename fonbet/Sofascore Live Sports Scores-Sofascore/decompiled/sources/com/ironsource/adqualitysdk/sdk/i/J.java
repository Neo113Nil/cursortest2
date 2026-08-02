package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class J extends WebViewClient {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ L f92;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public boolean f95 = false;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public boolean f94 = false;

    /* renamed from: ｋ, reason: contains not printable characters */
    public String f93 = null;

    public J(L l) {
        this.f92 = l;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.f92.mo60(webView);
        this.f95 = false;
        this.f94 = true;
        if (this.f93 == null) {
            this.f93 = webView.getOriginalUrl();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f92.mo60(webView);
        this.f95 = true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.f92.f101)) {
            this.f93 = webView.getOriginalUrl();
            String substring = str.substring(this.f92.f101.length());
            L l = this.f92;
            l.mo62(webView, l.f101, substring);
            return true;
        }
        if (this.f93 == null) {
            this.f93 = webView.getOriginalUrl();
        }
        this.f92.mo63(webView, str, (this.f95 && this.f94) || !(webView.getOriginalUrl() == null || this.f93 == null || webView.getOriginalUrl().equals(this.f93)));
        this.f94 = true;
        this.f95 = false;
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }
}
