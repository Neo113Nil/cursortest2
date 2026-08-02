package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.util.IOUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzejk implements zzfpi {
    public final Context a;
    public final String b;
    public final String c;

    public zzejk(Context context, String str, String str2) {
        this.a = context;
        this.b = str;
        this.c = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0267, code lost:
    
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r3.append("Received error HTTP response code: ");
        r3.append(r0);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(r3.toString());
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r4.append("Received error HTTP response code: ");
        r4.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02a2, code lost:
    
        throw new com.google.android.gms.internal.ads.zzefb(1, r4.toString());
     */
    @Override // com.google.android.gms.internal.ads.zzfpi
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzejj zza(zzeji zzejiVar) {
        HttpURLConnection httpURLConnection;
        zzejj zzejjVar;
        com.google.android.gms.ads.internal.util.zzs zzc;
        Context context;
        HashMap hashMap;
        InputStreamReader inputStreamReader;
        zzejk zzejkVar = this;
        String str = zzejiVar.a;
        int i = zzejiVar.b;
        HashMap hashMap2 = zzejiVar.c;
        byte[] bArr = zzejiVar.d;
        String str2 = zzejiVar.e;
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        try {
            zzejj zzejjVar2 = new zzejj();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.n3)).booleanValue() && com.google.android.gms.ads.internal.client.zzay.zze()) {
                zzejjVar2.a = 410;
                return zzejjVar2;
            }
            String str3 = zzejkVar.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 13);
            sb.append("SDK version: ");
            sb.append(str3);
            String sb2 = sb.toString();
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzh(sb2);
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 39);
            sb3.append("AdRequestServiceImpl: Sending request: ");
            sb3.append(str);
            zzo.zzd(sb3.toString());
            URL url = new URL(str);
            HashMap hashMap3 = new HashMap();
            boolean z = false;
            int i3 = 0;
            while (true) {
                httpURLConnection = (HttpURLConnection) url.openConnection();
                String str4 = zzejkVar.c;
                if (str4 != null) {
                    httpURLConnection.setRequestMethod(str4);
                }
                try {
                    try {
                        zzc = com.google.android.gms.ads.internal.zzt.zzc();
                        zzejj zzejjVar3 = zzejjVar2;
                        try {
                            context = zzejkVar.a;
                            hashMap = hashMap2;
                            zzejjVar = zzejjVar3;
                        } catch (zzefb e) {
                            e = e;
                            zzejjVar = zzejjVar3;
                        }
                    } finally {
                        httpURLConnection.disconnect();
                    }
                } catch (zzefb e2) {
                    e = e2;
                    zzejjVar = zzejjVar2;
                }
                try {
                    zzc.zzb(context, str3, false, httpURLConnection, false, i);
                    for (Map.Entry entry : hashMap.entrySet()) {
                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        httpURLConnection.setRequestProperty("Content-Type", str2);
                    }
                    BufferedOutputStream bufferedOutputStream = null;
                    com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                    try {
                        zzlVar.zza(httpURLConnection, bArr);
                    } catch (Throwable th) {
                        zzo.zzg("Network request logging failed.", th);
                        com.google.android.gms.ads.internal.zzt.zzh().e("HttpRequestFunction.logAdRequest", th);
                    }
                    int length = bArr.length;
                    int i4 = 1;
                    if (length > 0) {
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setFixedLengthStreamingMode(length);
                        try {
                            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                            try {
                                bufferedOutputStream2.write(bArr);
                                IOUtils.a(bufferedOutputStream2);
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedOutputStream = bufferedOutputStream2;
                                IOUtils.a(bufferedOutputStream);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
                        String key = entry2.getKey();
                        int i5 = i4;
                        List<String> value = entry2.getValue();
                        if (hashMap3.containsKey(key)) {
                            ((List) hashMap3.get(key)).addAll(value);
                            i4 = i5;
                        } else {
                            hashMap3.put(key, new ArrayList(value));
                            i4 = i5;
                        }
                    }
                    int i6 = i4;
                    zzlVar.zzc(httpURLConnection, responseCode);
                    zzejjVar.a = responseCode;
                    zzejjVar.b = hashMap3;
                    zzejjVar.c = "";
                    if (responseCode >= 200 && responseCode < 300) {
                        try {
                            InputStreamReader inputStreamReader2 = new InputStreamReader(httpURLConnection.getInputStream());
                            try {
                                com.google.android.gms.ads.internal.zzt.zzc();
                                StringBuilder sb4 = new StringBuilder(8192);
                                char[] cArr = new char[com.ironsource.mediationsdk.metadata.a.o];
                                while (true) {
                                    int read = inputStreamReader2.read(cArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    sb4.append(cArr, 0, read);
                                }
                                String sb5 = sb4.toString();
                                IOUtils.a(inputStreamReader2);
                                zzlVar.zze(sb5);
                                zzejjVar.c = sb5;
                                if (TextUtils.isEmpty(sb5)) {
                                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.G6)).booleanValue()) {
                                        throw new zzefb(3);
                                    }
                                }
                                zzejjVar.d = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                            } catch (Throwable th4) {
                                th = th4;
                                inputStreamReader = inputStreamReader2;
                                IOUtils.a(inputStreamReader);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            inputStreamReader = null;
                        }
                    } else {
                        if (responseCode < 300 || responseCode >= 400) {
                            break;
                        }
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (TextUtils.isEmpty(headerField)) {
                            zzo.zzi("No location header to follow redirect.");
                            throw new zzefb(1, "No location header to follow redirect");
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.c9)).booleanValue()) {
                            try {
                                url = new URI(headerField).toURL();
                            } catch (URISyntaxException e3) {
                                throw new zzefb(e3.getMessage(), e3);
                            }
                        } else {
                            url = new URL(headerField);
                        }
                        int i7 = i3 + 1;
                        if (i7 > ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.p6)).intValue()) {
                            zzo.zzi("Too many redirects.");
                            throw new zzefb(i6, "Too many redirects");
                        }
                        httpURLConnection.disconnect();
                        zzejjVar2 = zzejjVar;
                        i3 = i7;
                        z = false;
                        hashMap2 = hashMap;
                        zzejkVar = this;
                    }
                } catch (zzefb e4) {
                    e = e4;
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.I9)).booleanValue()) {
                        throw e;
                    }
                    zzejjVar.d = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                    httpURLConnection.disconnect();
                    return zzejjVar;
                }
            }
            httpURLConnection.disconnect();
            return zzejjVar;
        } catch (IOException e5) {
            String valueOf = String.valueOf(e5.getMessage());
            int i8 = com.google.android.gms.ads.internal.util.zze.zza;
            String concat = "Error while connecting to ad server: ".concat(valueOf);
            zzo.zzi(concat);
            throw new zzefb(concat, e5);
        }
    }
}
