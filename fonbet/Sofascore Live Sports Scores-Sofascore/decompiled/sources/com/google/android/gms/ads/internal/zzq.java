package com.google.android.gms.ads.internal;

import android.net.Uri;
import android.os.AsyncTask;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzbkt;
import com.mbridge.msdk.MBridgeConstans;
import defpackage.wt3;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzq extends AsyncTask {
    public final /* synthetic */ zzs a;

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) zzbkt.d.c());
        zzs zzsVar = this.a;
        zzr zzrVar = zzsVar.d;
        if (zzrVar.zzb() != null) {
            builder.appendQueryParameter(MBridgeConstans.DYNAMIC_VIEW_WX_QUERY, zzrVar.zzb());
        }
        builder.appendQueryParameter("pubId", zzrVar.zzc());
        builder.appendQueryParameter("mappver", zzrVar.zzd());
        Map zze = zzrVar.zze();
        for (String str : zze.keySet()) {
            builder.appendQueryParameter(str, (String) zze.get(str));
        }
        Uri build = builder.build();
        String F4 = zzsVar.F4();
        String encodedQuery = build.getEncodedQuery();
        return wt3.m(F4, "#", new StringBuilder(F4.length() + 1 + String.valueOf(encodedQuery).length()), encodedQuery);
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        WebView webView = this.a.e;
        String str = (String) obj;
        if (webView == null || str == null) {
            return;
        }
        webView.loadUrl(str);
    }
}
