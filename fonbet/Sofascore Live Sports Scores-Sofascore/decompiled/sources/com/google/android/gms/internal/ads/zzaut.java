package com.google.android.gms.internal.ads;

import com.ironsource.C4094gc;
import defpackage.bkn;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaut extends zzaug {
    public zzaut() {
        throw null;
    }

    public static ArrayList b(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new zzatk((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    public final zzauq a(zzats zzatsVar, Map map) {
        String zzh = zzatsVar.zzh();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(zzatsVar.zzm());
        URL url = new URL(zzh);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int zzo = zzatsVar.zzo();
        httpURLConnection.setConnectTimeout(zzo);
        httpURLConnection.setReadTimeout(zzo);
        boolean z = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        url.getProtocol();
        try {
            for (String str : hashMap.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) hashMap.get(str));
            }
            if (zzatsVar.zza() != 0) {
                httpURLConnection.setRequestMethod(C4094gc.b);
                byte[] zzn = zzatsVar.zzn();
                if (zzn != null) {
                    httpURLConnection.setDoOutput(true);
                    if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(zzn);
                    dataOutputStream.close();
                }
            } else {
                httpURLConnection.setRequestMethod(C4094gc.a);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            zzatsVar.zza();
            if ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                zzauq zzauqVar = new zzauq(responseCode, b(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return zzauqVar;
            }
            try {
                return new zzauq(responseCode, b(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new bkn(httpURLConnection));
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
