package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.h5.H5AdsRequestHandler;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzbqn extends zzbqa {
    public static final /* synthetic */ int zza = 0;
    private WebViewClient zzb;
    private final H5AdsRequestHandler zzc;
    private final WebView zzd;

    public zzbqn(Context context, final WebView webView) {
        context.getClass();
        webView.getClass();
        zzgsw.zzb(webView.getSettings().getJavaScriptEnabled(), "JavaScript must be enabled on the WebView.");
        this.zzd = webView;
        this.zzc = new H5AdsRequestHandler(context, new OnH5AdsEventListener() { // from class: com.google.android.gms.internal.ads.zzbqm
            @Override // com.google.android.gms.ads.h5.OnH5AdsEventListener
            public final /* synthetic */ void onH5AdsEvent(String str) {
                int i = zzbqn.zza;
                webView.evaluateJavascript(str, null);
            }
        });
    }

    private final boolean zzc(WebView webView) {
        if (this.zzd.equals(webView)) {
            return true;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzf("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final WebViewClient getDelegate() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzbqn;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(h.h, webView, str);
        safedk_zzbqn_onLoadResource_47f51a2f44335b5e769bb276cd666eea(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqa, android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(h.h, view, url);
    }

    @Override // com.google.android.gms.internal.ads.zzbqa, android.webkit.WebViewClient
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        super.onReceivedError(view, errorCode, description, failingUrl);
        BrandSafetyUtils.onWebViewReceivedError(h.h, view, errorCode, description, failingUrl);
    }

    public void safedk_zzbqn_onLoadResource_47f51a2f44335b5e769bb276cd666eea(WebView p0, String p1) {
        if (zzc(p0) && !this.zzc.handleH5AdsRequest(p1)) {
            super.onLoadResource(p0, p1);
        }
    }

    public boolean safedk_zzbqn_shouldOverrideUrlLoading_f2573af772fa1c2fb351c5f878e0dc7f(WebView p0, WebResourceRequest p1) {
        if (!zzc(this.zzd)) {
            return false;
        }
        if (this.zzc.handleH5AdsRequest(p1.getUrl().toString())) {
            return true;
        }
        return super.shouldOverrideUrlLoading(p0, p1);
    }

    @Override // com.google.android.gms.internal.ads.zzbqa, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(h.h, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // com.google.android.gms.internal.ads.zzbqa, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzbqn;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean safedk_zzbqn_shouldOverrideUrlLoading_f2573af772fa1c2fb351c5f878e0dc7f = safedk_zzbqn_shouldOverrideUrlLoading_f2573af772fa1c2fb351c5f878e0dc7f(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.h, webView, webResourceRequest, safedk_zzbqn_shouldOverrideUrlLoading_f2573af772fa1c2fb351c5f878e0dc7f);
        return safedk_zzbqn_shouldOverrideUrlLoading_f2573af772fa1c2fb351c5f878e0dc7f;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzbqn;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_zzbqn_shouldOverrideUrlLoading_46bbbbef50efdb0141b6ca72e2d5a28d = safedk_zzbqn_shouldOverrideUrlLoading_46bbbbef50efdb0141b6ca72e2d5a28d(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.h, webView, str, safedk_zzbqn_shouldOverrideUrlLoading_46bbbbef50efdb0141b6ca72e2d5a28d);
        return safedk_zzbqn_shouldOverrideUrlLoading_46bbbbef50efdb0141b6ca72e2d5a28d;
    }

    public final void zza() {
        this.zzc.clearAdObjects();
    }

    public final void zzb(WebViewClient webViewClient) {
        zzgsw.zzb(webViewClient != this, "Delegate cannot be itself.");
        this.zzb = webViewClient;
    }

    public boolean safedk_zzbqn_shouldOverrideUrlLoading_46bbbbef50efdb0141b6ca72e2d5a28d(WebView p0, String p1) {
        if (!zzc(p0)) {
            return false;
        }
        if (this.zzc.handleH5AdsRequest(p1)) {
            return true;
        }
        return super.shouldOverrideUrlLoading(p0, p1);
    }
}
