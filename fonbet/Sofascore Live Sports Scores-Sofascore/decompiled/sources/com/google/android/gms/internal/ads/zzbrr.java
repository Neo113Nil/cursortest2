package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.h5.H5AdsRequestHandler;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.ewm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbrr extends zzbre {
    public static final /* synthetic */ int d = 0;
    public WebViewClient a;
    public final H5AdsRequestHandler b;
    public final WebView c;

    public zzbrr(Context context, WebView webView) {
        context.getClass();
        webView.getClass();
        zzguk.b("JavaScript must be enabled on the WebView.", webView.getSettings().getJavaScriptEnabled());
        this.c = webView;
        this.b = new H5AdsRequestHandler(context, new ewm(webView, 6));
    }

    @Override // com.google.android.gms.internal.ads.zzbre
    public final WebViewClient a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (!this.c.equals(webView)) {
            zzo.zzf("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        } else {
            if (this.b.handleH5AdsRequest(str)) {
                return;
            }
            super.onLoadResource(webView, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Object obj = this.c;
        if (!obj.equals(obj)) {
            zzo.zzf("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
            return false;
        }
        if (this.b.handleH5AdsRequest(webResourceRequest.getUrl().toString())) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.c.equals(webView)) {
            if (this.b.handleH5AdsRequest(str)) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
        zzo.zzf("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        return false;
    }
}
