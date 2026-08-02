package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.h;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzclx extends zzclw {
    public zzclx(zzcki zzckiVar, zzbhd zzbhdVar, boolean z, zzekf zzekfVar) {
        super(zzckiVar, zzbhdVar, z, zzekfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclw, com.google.android.gms.internal.ads.zzclv, com.google.android.gms.internal.ads.zzckt, android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(h.h, view, url);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zza.zzaA(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }
}
