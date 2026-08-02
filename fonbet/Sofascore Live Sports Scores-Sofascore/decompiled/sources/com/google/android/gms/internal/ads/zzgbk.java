package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.unity3d.services.core.network.model.HttpRequest;
import defpackage.haf;
import defpackage.ih2;
import defpackage.is8;
import defpackage.v9f;
import defpackage.w9f;
import defpackage.y9f;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgbk extends zzgay {
    public zzgvc a;
    public zzgvc b;
    public ih2 c;
    public HttpURLConnection d;

    public zzgbk() {
        haf hafVar = haf.l;
        v9f v9fVar = v9f.k;
        this.a = hafVar;
        this.b = v9fVar;
        this.c = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HttpURLConnection httpURLConnection = this.d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public final HttpURLConnection e(ih2 ih2Var) {
        int i = 18;
        this.a = new w9f(i);
        this.b = new y9f(i);
        this.c = ih2Var;
        ((Integer) this.b.mo792zza()).getClass();
        ih2 ih2Var2 = this.c;
        ih2Var2.getClass();
        Set set = zzcjv.f;
        com.google.android.gms.ads.internal.zzt.zzq();
        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.s0)).intValue();
        URL url = new URL(ih2Var2.b);
        int i2 = 0;
        while (true) {
            i2++;
            if (i2 > 20) {
                is8.e("Too many redirects (20)");
                return null;
            }
            URLConnection openConnection = url.openConnection();
            openConnection.setConnectTimeout(intValue);
            openConnection.setReadTimeout(intValue);
            if (!(openConnection instanceof HttpURLConnection)) {
                is8.e("Invalid protocol.");
                return null;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
            zzlVar.zza(httpURLConnection, null);
            httpURLConnection.setInstanceFollowRedirects(false);
            int responseCode = httpURLConnection.getResponseCode();
            zzlVar.zzc(httpURLConnection, responseCode);
            if (responseCode / 100 != 3) {
                this.d = httpURLConnection;
                return httpURLConnection;
            }
            String headerField = httpURLConnection.getHeaderField("Location");
            if (headerField == null) {
                is8.e("Missing Location header in redirect");
                return null;
            }
            URL url2 = new URL(url, headerField);
            String protocol = url2.getProtocol();
            if (protocol == null) {
                is8.e("Protocol is null");
                return null;
            }
            if (!protocol.equals("http") && !protocol.equals(HttpRequest.DEFAULT_SCHEME)) {
                is8.e("Unsupported scheme: ".concat(protocol));
                return null;
            }
            String concat = "Redirecting to ".concat(headerField);
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzd(concat);
            httpURLConnection.disconnect();
            url = url2;
        }
    }
}
