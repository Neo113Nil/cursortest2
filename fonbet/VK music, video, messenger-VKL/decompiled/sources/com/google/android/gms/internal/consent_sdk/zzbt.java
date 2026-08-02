package com.google.android.gms.internal.consent_sdk;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes12.dex */
final class zzbt extends WebViewClient {
    final /* synthetic */ zzbu zza;

    public /* synthetic */ zzbt(zzbu zzbuVar, zzbs zzbsVar) {
        this.zza = zzbuVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        zzca zzcaVar;
        if (zzbu.zzf(this.zza, str)) {
            zzcaVar = this.zza.zzb;
            zzcaVar.zze(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        boolean z;
        z = this.zza.zzc;
        if (z) {
            return;
        }
        this.zza.zzc = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        zzca zzcaVar;
        zzcaVar = this.zza.zzb;
        zzcaVar.zzf(i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        zzca zzcaVar;
        String uri = webResourceRequest.getUrl().toString();
        if (!zzbu.zzf(this.zza, uri)) {
            return false;
        }
        zzcaVar = this.zza.zzb;
        zzcaVar.zze(uri);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zzca zzcaVar;
        if (!zzbu.zzf(this.zza, str)) {
            return false;
        }
        zzcaVar = this.zza.zzb;
        zzcaVar.zze(str);
        return true;
    }
}
