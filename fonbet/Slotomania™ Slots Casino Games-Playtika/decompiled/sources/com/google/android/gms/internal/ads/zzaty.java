package com.google.android.gms.internal.ads;

import com.safedk.android.internal.partials.AdMobNetworkBridge;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
public final class zzaty extends zzatl {
    public zzaty() {
        throw null;
    }

    public zzaty(zzatx zzatxVar, SSLSocketFactory sSLSocketFactory) {
    }

    static List zzb(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new zzasp((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzatl
    public final zzatv zza(zzasx zzasxVar, Map map) throws IOException, zzasf {
        String zzh = zzasxVar.zzh();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(zzasxVar.zzm());
        URL url = new URL(zzh);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int zzo = zzasxVar.zzo();
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
            if (zzasxVar.zza() != 0) {
                httpURLConnection.setRequestMethod("POST");
                byte[] zzn = zzasxVar.zzn();
                if (zzn != null) {
                    httpURLConnection.setDoOutput(true);
                    if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(AdMobNetworkBridge.urlConnectionGetOutputStream(httpURLConnection));
                    dataOutputStream.write(zzn);
                    dataOutputStream.close();
                }
            } else {
                httpURLConnection.setRequestMethod("GET");
            }
            int httpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
            if (httpUrlConnectionGetResponseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            zzasxVar.zza();
            if ((httpUrlConnectionGetResponseCode >= 100 && httpUrlConnectionGetResponseCode < 200) || httpUrlConnectionGetResponseCode == 204 || httpUrlConnectionGetResponseCode == 304) {
                zzatv zzatvVar = new zzatv(httpUrlConnectionGetResponseCode, zzb(httpURLConnection.getHeaderFields()), -1, null);
                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                return zzatvVar;
            }
            try {
                return new zzatv(httpUrlConnectionGetResponseCode, zzb(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new zzatw(httpURLConnection));
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
