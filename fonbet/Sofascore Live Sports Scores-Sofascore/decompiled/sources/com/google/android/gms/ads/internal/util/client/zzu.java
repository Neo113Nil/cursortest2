package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcaq;
import com.mbridge.msdk.foundation.download.Command;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.fn0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzu implements zze {
    public final Context a;
    public final String b;
    public String c;

    public zzu(Context context, @Nullable String str) {
        this.a = context;
        this.b = str;
    }

    public final URL a(String str) {
        URL url = null;
        try {
            url = new URI(str).toURL();
        } catch (IllegalArgumentException e) {
            e = e;
            b(str, e);
        } catch (MalformedURLException e2) {
            e = e2;
            b(str, e);
        } catch (URISyntaxException e3) {
            b(str, e3);
            if (((Boolean) zzba.zzc().a(zzbjg.f)).booleanValue()) {
                try {
                    zzo.zzd("Attempting to parse components, encode, and reconstruct URI.");
                    URL url2 = new URL(str);
                    URI uri = new URI(url2.getProtocol(), url2.getUserInfo(), url2.getHost(), url2.getPort(), url2.getPath(), url2.getQuery(), url2.getRef());
                    url = uri.toURL();
                    String obj = uri.toString();
                    StringBuilder sb = new StringBuilder(str.length() + Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE + obj.length());
                    sb.append("Successfully constructed URL after component encoding via new URI(parts).toURL() for original: \"");
                    sb.append(str);
                    sb.append("\" -> encoded URI: ");
                    sb.append(obj);
                    zzo.zzd(sb.toString());
                } catch (IllegalArgumentException | MalformedURLException | URISyntaxException e4) {
                    b(str, e4);
                }
            }
        }
        if (url != null) {
            return url;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 47);
        sb2.append("Falling back to direct new URL(\"");
        sb2.append(str);
        sb2.append("\") constructor.");
        zzo.zzd(sb2.toString());
        return new URL(str);
    }

    public final void b(String str, Exception exc) {
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(str.length() + 32 + String.valueOf(message).length());
        sb.append("Error while parsing ping URL: ");
        sb.append(str);
        sb.append(". ");
        sb.append(message);
        zzo.zzi(sb.toString());
        zzcaq.c(this.a).b(exc, "HttpUrlPinger.pingUrl", ((Integer) zzba.zzc().a(zzbjg.ue)).intValue() / 100.0f);
    }

    @Override // com.google.android.gms.ads.internal.util.client.zze
    public final zzt zza(String str) {
        return zzc(str, null);
    }

    @Nullable
    public final String zzb() {
        return this.c;
    }

    public final zzt zzc(String str, @Nullable Map map) {
        zzt zztVar = zzt.zzb;
        if (str != null) {
            if (!((Boolean) zzba.zzc().a(zzbjg.g)).booleanValue() || !str.isEmpty()) {
                if (!((Boolean) zzba.zzc().a(zzbjg.n3)).booleanValue() || !zzay.zze()) {
                    try {
                        StringBuilder sb = new StringBuilder(str.length() + 13);
                        sb.append("Pinging URL: ");
                        sb.append(str);
                        zzo.zzd(sb.toString());
                        HttpURLConnection httpURLConnection = (HttpURLConnection) a(str).openConnection();
                        try {
                            zzay.zza();
                            String str2 = this.b;
                            httpURLConnection.setConnectTimeout(60000);
                            httpURLConnection.setInstanceFollowRedirects(true);
                            httpURLConnection.setReadTimeout(60000);
                            if (str2 != null) {
                                httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, str2);
                            }
                            httpURLConnection.setUseCaches(false);
                            if (map != null) {
                                for (Map.Entry entry : map.entrySet()) {
                                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                }
                            }
                            zzl zzlVar = new zzl(null);
                            zzlVar.zza(httpURLConnection, null);
                            int responseCode = httpURLConnection.getResponseCode();
                            zzlVar.zzc(httpURLConnection, responseCode);
                            if (responseCode >= 200 && responseCode < 300) {
                                if (((Boolean) zzba.zzc().a(zzbjg.e9)).booleanValue()) {
                                    this.c = httpURLConnection.getHeaderField("X-Afma-Ad-Event-Value");
                                }
                                zztVar = zzt.zza;
                                httpURLConnection.disconnect();
                                return zztVar;
                            }
                            StringBuilder sb2 = new StringBuilder(String.valueOf(responseCode).length() + 54 + str.length());
                            sb2.append("Received non-success response code ");
                            sb2.append(responseCode);
                            sb2.append(" from pinging URL: ");
                            sb2.append(str);
                            zzo.zzi(sb2.toString());
                            if (responseCode == 502) {
                                zztVar = zzt.zzc;
                            }
                            httpURLConnection.disconnect();
                            return zztVar;
                        } catch (Throwable th) {
                            httpURLConnection.disconnect();
                            throw th;
                        }
                    } catch (IOException e) {
                        e = e;
                        String message = e.getMessage();
                        StringBuilder sb3 = new StringBuilder(fn0.c(str.length() + 27, message));
                        sb3.append("Error while pinging URL: ");
                        sb3.append(str);
                        sb3.append(". ");
                        sb3.append(message);
                        zzo.zzi(sb3.toString());
                        return zzt.zzc;
                    } catch (IndexOutOfBoundsException e2) {
                        e = e2;
                        b(str, e);
                        return zztVar;
                    } catch (RuntimeException e3) {
                        e = e3;
                        String message2 = e.getMessage();
                        StringBuilder sb32 = new StringBuilder(fn0.c(str.length() + 27, message2));
                        sb32.append("Error while pinging URL: ");
                        sb32.append(str);
                        sb32.append(". ");
                        sb32.append(message2);
                        zzo.zzi(sb32.toString());
                        return zzt.zzc;
                    } catch (MalformedURLException e4) {
                        e = e4;
                        b(str, e);
                        return zztVar;
                    }
                }
            }
        }
        return zztVar;
    }
}
