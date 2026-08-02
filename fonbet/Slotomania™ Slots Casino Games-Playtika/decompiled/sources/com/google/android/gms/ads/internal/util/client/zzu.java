package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import android.net.TrafficStats;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.android.gms.internal.ads.zzfzb;
import com.google.common.net.HttpHeaders;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzu implements zze {
    private final Context zza;
    private final String zzb;
    private String zzc;

    public zzu(Context context, String str) {
        this.zza = context;
        this.zzb = str;
    }

    private final URL zzd(String str) throws MalformedURLException {
        URL url = null;
        try {
            url = new URI(str).toURL();
        } catch (IllegalArgumentException e) {
            e = e;
            zzf(str, e);
        } catch (MalformedURLException e2) {
            e = e2;
            zzf(str, e);
        } catch (URISyntaxException e3) {
            zzf(str, e3);
            if (((Boolean) zzba.zzc().zzd(zzbie.zzf)).booleanValue()) {
                url = zze(str);
            }
        }
        if (url != null) {
            return url;
        }
        StringBuilder sb = new StringBuilder(str.length() + 47);
        sb.append("Falling back to direct new URL(\"");
        sb.append(str);
        sb.append("\") constructor.");
        zzo.zzd(sb.toString());
        return new URL(str);
    }

    private final URL zze(String str) {
        URL url;
        URI uri;
        try {
            zzo.zzd("Attempting to parse components, encode, and reconstruct URI.");
            URL url2 = new URL(str);
            uri = new URI(url2.getProtocol(), url2.getUserInfo(), url2.getHost(), url2.getPort(), url2.getPath(), url2.getQuery(), url2.getRef());
            url = uri.toURL();
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException e) {
            e = e;
            url = null;
        }
        try {
            String obj = uri.toString();
            StringBuilder sb = new StringBuilder(str.length() + 114 + obj.length());
            sb.append("Successfully constructed URL after component encoding via new URI(parts).toURL() for original: \"");
            sb.append(str);
            sb.append("\" -> encoded URI: ");
            sb.append(obj);
            zzo.zzd(sb.toString());
            return url;
        } catch (IllegalArgumentException e2) {
            e = e2;
            zzf(str, e);
            return url;
        } catch (MalformedURLException e3) {
            e = e3;
            zzf(str, e);
            return url;
        } catch (URISyntaxException e4) {
            e = e4;
            zzf(str, e);
            return url;
        }
    }

    private final void zzf(String str, Throwable th) {
        String message = th.getMessage();
        StringBuilder sb = new StringBuilder(str.length() + 32 + String.valueOf(message).length());
        sb.append("Error while parsing ping URL: ");
        sb.append(str);
        sb.append(". ");
        sb.append(message);
        zzo.zzi(sb.toString());
        zzbzm.zza(this.zza).zzi(th, "HttpUrlPinger.pingUrl", ((Integer) zzba.zzc().zzd(zzbie.zzoh)).intValue() / 100.0f);
    }

    @Override // com.google.android.gms.ads.internal.util.client.zze
    public final zzt zza(String str) {
        return zzc(str, null);
    }

    public final String zzb() {
        return this.zzc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0161, code lost:
    
        if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide() != false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0121 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzt zzc(String str, Map map) {
        HttpURLConnection httpURLConnection;
        int httpUrlConnectionGetResponseCode;
        zzt zztVar;
        zzt zztVar2 = zzt.PERMANENT_FAILURE;
        if (str != null) {
            if (!((Boolean) zzba.zzc().zzd(zzbie.zzg)).booleanValue() || !str.isEmpty()) {
                if (!((Boolean) zzba.zzc().zzd(zzbie.zzdi)).booleanValue() || !zzay.zze()) {
                    try {
                        try {
                            if (ClientLibraryUtils.isPackageSide()) {
                                TrafficStats.setThreadStatsTag(263);
                            }
                            StringBuilder sb = new StringBuilder(str.length() + 13);
                            sb.append("Pinging URL: ");
                            sb.append(str);
                            zzo.zzd(sb.toString());
                            URL zzd = zzd(str);
                            int i = zzfzb.zzb;
                            httpURLConnection = (HttpURLConnection) zzd.openConnection();
                            try {
                                zzay.zza();
                                String str2 = this.zzb;
                                httpURLConnection.setConnectTimeout(60000);
                                httpURLConnection.setInstanceFollowRedirects(true);
                                httpURLConnection.setReadTimeout(60000);
                                if (str2 != null) {
                                    httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, str2);
                                }
                                httpURLConnection.setUseCaches(false);
                                if (map != null) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                    }
                                }
                                zzl zzlVar = new zzl(null);
                                zzlVar.zza(httpURLConnection, null);
                                httpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                                zzlVar.zzc(httpURLConnection, httpUrlConnectionGetResponseCode);
                            } finally {
                                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                            }
                        } finally {
                            if (ClientLibraryUtils.isPackageSide()) {
                                TrafficStats.clearThreadStatsTag();
                            }
                        }
                    } catch (MalformedURLException e) {
                        e = e;
                        zzf(str, e);
                    } catch (IOException e2) {
                        e = e2;
                        String message = e.getMessage();
                        StringBuilder sb2 = new StringBuilder(str.length() + 27 + String.valueOf(message).length());
                        sb2.append("Error while pinging URL: ");
                        sb2.append(str);
                        sb2.append(". ");
                        sb2.append(message);
                        zzo.zzi(sb2.toString());
                        zztVar2 = zzt.RETRIABLE_FAILURE;
                    } catch (IndexOutOfBoundsException e3) {
                        e = e3;
                        zzf(str, e);
                    } catch (RuntimeException e4) {
                        e = e4;
                        String message2 = e.getMessage();
                        StringBuilder sb22 = new StringBuilder(str.length() + 27 + String.valueOf(message2).length());
                        sb22.append("Error while pinging URL: ");
                        sb22.append(str);
                        sb22.append(". ");
                        sb22.append(message2);
                        zzo.zzi(sb22.toString());
                        zztVar2 = zzt.RETRIABLE_FAILURE;
                    }
                    if (httpUrlConnectionGetResponseCode >= 200 && httpUrlConnectionGetResponseCode < 300) {
                        if (((Boolean) zzba.zzc().zzd(zzbie.zziY)).booleanValue()) {
                            this.zzc = httpURLConnection.getHeaderField("X-Afma-Ad-Event-Value");
                        }
                        zztVar = zzt.SUCCESS;
                        zztVar2 = zztVar;
                        if (!ClientLibraryUtils.isPackageSide()) {
                            return zztVar2;
                        }
                        return zztVar2;
                    }
                    StringBuilder sb3 = new StringBuilder(String.valueOf(httpUrlConnectionGetResponseCode).length() + 54 + str.length());
                    sb3.append("Received non-success response code ");
                    sb3.append(httpUrlConnectionGetResponseCode);
                    sb3.append(" from pinging URL: ");
                    sb3.append(str);
                    zzo.zzi(sb3.toString());
                    if (httpUrlConnectionGetResponseCode == 502) {
                        zztVar = zzt.RETRIABLE_FAILURE;
                        zztVar2 = zztVar;
                    }
                    if (!ClientLibraryUtils.isPackageSide()) {
                    }
                    return zztVar2;
                }
            }
        }
        return zztVar2;
    }
}
