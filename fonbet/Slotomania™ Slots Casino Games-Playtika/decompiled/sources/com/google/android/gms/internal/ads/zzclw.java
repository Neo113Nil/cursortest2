package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public class zzclw extends zzclv {
    public zzclw(zzcki zzckiVar, zzbhd zzbhdVar, boolean z, zzekf zzekfVar) {
        super(zzckiVar, zzbhdVar, z, zzekfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclv, com.google.android.gms.internal.ads.zzckt, android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(h.h, view, url);
    }

    public WebResourceResponse safedk_zzclw_shouldInterceptRequest_a93fd0a7baa27dc2baf874fc149b2ce9(WebView p0, WebResourceRequest p1) {
        if (p1 == null || p1.getUrl() == null) {
            return null;
        }
        return zzac(p0, p1.getUrl().toString(), p1.getRequestHeaders());
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzclw;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(h.h, webView, webResourceRequest, safedk_zzclw_shouldInterceptRequest_a93fd0a7baa27dc2baf874fc149b2ce9(webView, webResourceRequest));
    }
}
