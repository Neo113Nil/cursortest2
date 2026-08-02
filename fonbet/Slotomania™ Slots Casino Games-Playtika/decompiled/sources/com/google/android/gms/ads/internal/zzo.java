package com.google.android.gms.ads.internal;

import android.graphics.Bitmap;
import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzflo;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzo extends WebViewClient {
    final /* synthetic */ zzs zza;

    zzo(zzs zzsVar) {
        Objects.requireNonNull(zzsVar);
        this.zza = zzsVar;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(h.h, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(h.h, view, url);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/ads/internal/zzo;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.h, webView, webResourceRequest, webResourceError);
        safedk_zzo_onReceivedError_755510dbf45b221b70af277c25e4ddd0(webView, webResourceRequest, webResourceError);
    }

    public void safedk_zzo_onReceivedError_755510dbf45b221b70af277c25e4ddd0(WebView p0, WebResourceRequest p1, WebResourceError p2) {
        zzs zzsVar = this.zza;
        if (zzsVar.zzX() != null) {
            try {
                zzsVar.zzX().zzd(zzflo.zzd(1, null, null));
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        zzs zzsVar2 = this.zza;
        if (zzsVar2.zzX() != null) {
            try {
                zzsVar2.zzX().zzc(0);
            } catch (RemoteException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
            }
        }
    }

    public boolean safedk_zzo_shouldOverrideUrlLoading_d3d4e73010143acf73d406f77cfb80c7(WebView p0, String p1) {
        zzs zzsVar = this.zza;
        if (p1.startsWith(zzsVar.zzO())) {
            return false;
        }
        if (p1.startsWith("gmsg://noAdLoaded")) {
            if (zzsVar.zzX() != null) {
                try {
                    zzsVar.zzX().zzd(zzflo.zzd(3, null, null));
                } catch (RemoteException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                }
            }
            zzs zzsVar2 = this.zza;
            if (zzsVar2.zzX() != null) {
                try {
                    zzsVar2.zzX().zzc(3);
                } catch (RemoteException e2) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
                }
            }
            this.zza.zzM(0);
            return true;
        }
        if (p1.startsWith("gmsg://scriptLoadFailed")) {
            zzs zzsVar3 = this.zza;
            if (zzsVar3.zzX() != null) {
                try {
                    zzsVar3.zzX().zzd(zzflo.zzd(1, null, null));
                } catch (RemoteException e3) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e3);
                }
            }
            zzs zzsVar4 = this.zza;
            if (zzsVar4.zzX() != null) {
                try {
                    zzsVar4.zzX().zzc(0);
                } catch (RemoteException e4) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
                }
            }
            this.zza.zzM(0);
            return true;
        }
        if (p1.startsWith("gmsg://adResized")) {
            zzs zzsVar5 = this.zza;
            if (zzsVar5.zzX() != null) {
                try {
                    zzsVar5.zzX().zzf();
                } catch (RemoteException e5) {
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e5);
                }
            }
            zzs zzsVar6 = this.zza;
            zzsVar6.zzM(zzsVar6.zzL(p1));
            return true;
        }
        if (p1.startsWith("gmsg://")) {
            return true;
        }
        zzs zzsVar7 = this.zza;
        if (zzsVar7.zzX() != null) {
            try {
                zzsVar7.zzX().zzh();
                zzsVar7.zzX().zze();
            } catch (RemoteException e6) {
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e6);
            }
        }
        this.zza.zzV(p1);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(h.h, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/ads/internal/zzo;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_zzo_shouldOverrideUrlLoading_d3d4e73010143acf73d406f77cfb80c7 = safedk_zzo_shouldOverrideUrlLoading_d3d4e73010143acf73d406f77cfb80c7(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.h, webView, str, safedk_zzo_shouldOverrideUrlLoading_d3d4e73010143acf73d406f77cfb80c7);
        return safedk_zzo_shouldOverrideUrlLoading_d3d4e73010143acf73d406f77cfb80c7;
    }
}
