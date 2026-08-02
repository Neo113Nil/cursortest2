package com.mbridge.msdk.tracker.network.toolbox;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.ironsource.C4094gc;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.tracker.network.t;
import com.unity3d.services.core.network.model.HttpRequest;
import defpackage.a70;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class h extends com.mbridge.msdk.tracker.network.toolbox.a {
    private final SSLSocketFactory a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class a extends FilterInputStream {
        private final HttpURLConnection a;

        public a(HttpURLConnection httpURLConnection) {
            super(h.b(httpURLConnection));
            this.a = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            this.a.disconnect();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface b {
    }

    public h(b bVar, SSLSocketFactory sSLSocketFactory) {
        this.a = sSLSocketFactory;
    }

    @Override // com.mbridge.msdk.tracker.network.toolbox.a
    public g a(t<?> tVar, Map<String, String> map) throws IOException {
        String a2 = tVar.g() == 0 ? d.a(tVar.t(), tVar) : tVar.t();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(tVar.f());
        HttpsURLConnection a3 = a(new URL(a2), tVar);
        try {
            for (String str : hashMap.keySet()) {
                a3.setRequestProperty(str, (String) hashMap.get(str));
            }
            b(a3, tVar);
            int responseCode = a3.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if (a(tVar.g(), responseCode)) {
                return new g(responseCode, a(a3.getHeaderFields()), a3.getContentLength(), a(tVar, a3));
            }
            g gVar = new g(responseCode, a(a3.getHeaderFields()));
            a3.disconnect();
            return gVar;
        } catch (Throwable th) {
            if (0 == 0) {
                a3.disconnect();
            }
            throw th;
        }
    }

    public void b(HttpURLConnection httpURLConnection, t<?> tVar) throws IOException {
        switch (tVar.g()) {
            case 0:
                httpURLConnection.setRequestMethod(C4094gc.a);
                break;
            case 1:
                httpURLConnection.setRequestMethod(C4094gc.b);
                a(httpURLConnection, tVar);
                break;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                a(httpURLConnection, tVar);
                break;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                break;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                break;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                break;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                break;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                a(httpURLConnection, tVar);
                break;
            default:
                a70.r("Unknown method type.");
                break;
        }
    }

    public h(b bVar) {
        this(bVar, null);
    }

    public h() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputStream b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    private static boolean a(int i, int i2) {
        if (i != 4) {
            return ((100 <= i2 && i2 < 200) || i2 == 204 || i2 == 304) ? false : true;
        }
        return false;
    }

    public static List<com.mbridge.msdk.tracker.network.g> a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList.add(new com.mbridge.msdk.tracker.network.g(entry.getKey(), it.next()));
                }
            }
        }
        return arrayList;
    }

    public InputStream a(t<?> tVar, HttpURLConnection httpURLConnection) {
        return new a(httpURLConnection);
    }

    public HttpsURLConnection a(URL url) throws IOException {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        httpsURLConnection.setHostnameVerifier(new MBridgeHostnameVerifier(url));
        httpsURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpsURLConnection;
    }

    private HttpsURLConnection a(URL url, t<?> tVar) throws IOException {
        SSLSocketFactory sSLSocketFactory;
        HttpsURLConnection a2 = a(url);
        int q = tVar.q();
        a2.setConnectTimeout(q);
        a2.setReadTimeout(q);
        a2.setUseCaches(false);
        a2.setDoInput(true);
        if (HttpRequest.DEFAULT_SCHEME.equals(url.getProtocol()) && (sSLSocketFactory = this.a) != null) {
            a2.setSSLSocketFactory(sSLSocketFactory);
        }
        return a2;
    }

    private void a(HttpURLConnection httpURLConnection, t<?> tVar) throws IOException {
        byte[] b2 = tVar.b();
        if (b2 != null) {
            a(httpURLConnection, tVar, b2);
        }
    }

    private void a(HttpURLConnection httpURLConnection, t<?> tVar, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", tVar.c());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(a(tVar, httpURLConnection, bArr.length));
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    public OutputStream a(t<?> tVar, HttpURLConnection httpURLConnection, int i) throws IOException {
        return httpURLConnection.getOutputStream();
    }
}
