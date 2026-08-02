package com.google.android.gms.internal.ads;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.fsn;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzcna extends zzcmz {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        String uri = webResourceRequest.getUrl().toString();
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        if (!(webView instanceof zzclm)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzclm zzclmVar = (zzclm) webView;
        zzcef zzcefVar = this.y;
        if (zzcefVar != null) {
            zzcefVar.a(1, uri, requestHeaders);
        }
        int i2 = zzgar.a;
        if (!"mraid.js".equalsIgnoreCase(new File(uri).getName())) {
            if (requestHeaders == null) {
                requestHeaders = Collections.EMPTY_MAP;
            }
            return t(uri, requestHeaders);
        }
        if (zzclmVar.zzP() != null) {
            zzclx zzP = zzclmVar.zzP();
            synchronized (zzP.d) {
                zzP.l = false;
                zzP.q = true;
                zzcgj.f.execute(new fsn(zzP, 5));
            }
        }
        if (zzclmVar.zzN().b()) {
            str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.G0);
        } else if (zzclmVar.d()) {
            str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.F0);
        } else {
            str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.E0);
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        return com.google.android.gms.ads.internal.util.zzs.zzz(zzclmVar.getContext(), zzclmVar.zzs().afmaVersion, str);
    }
}
