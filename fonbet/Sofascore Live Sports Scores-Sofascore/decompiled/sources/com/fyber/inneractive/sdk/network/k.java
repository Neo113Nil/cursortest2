package com.fyber.inneractive.sdk.network;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.mbridge.msdk.foundation.download.Command;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class k extends i implements h {
    public static Pair a(t0 t0Var, ArrayList arrayList, URL url, String str, String str2) {
        String headerField;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            t0Var.getClass();
            if (t0Var instanceof h1) {
                httpURLConnection.setInstanceFollowRedirects(false);
            }
            l1 p = t0Var.p();
            httpURLConnection.setConnectTimeout(p.a);
            httpURLConnection.setReadTimeout(p.b);
            a(httpURLConnection, Command.HTTP_HEADER_USER_AGENT, str);
            a(httpURLConnection, "If-Modified-Since", str2);
            a(httpURLConnection, "Accept-Encoding", "gzip");
            com.fyber.inneractive.sdk.config.s sVar = IAConfigManager.N.t;
            if (sVar != null && sVar.b.a("add_accept", 1, 0) == 1) {
                a(httpURLConnection, "Accept", "*/*");
            }
            Map l = t0Var.l();
            if (l != null) {
                for (String str3 : l.keySet()) {
                    a(httpURLConnection, str3, (String) l.get(str3));
                }
            }
            t0Var.c(System.currentTimeMillis());
            if (t0Var.m() != m0.POST && t0Var.m() != m0.PUT) {
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                t0Var.a(System.currentTimeMillis());
                IAlog.a("%s (%s) response code - %d", t0Var.toString(), url, Integer.valueOf(responseCode));
                if ((t0Var instanceof h1) || (!((responseCode > 300 && responseCode < 304) || responseCode == 307 || responseCode == 308) || (headerField = httpURLConnection.getHeaderField("Location")) == null)) {
                    return new Pair(arrayList, httpURLConnection);
                }
                if (!headerField.startsWith("http") && !headerField.contains("://") && arrayList.size() > 0) {
                    Uri parse = Uri.parse((String) arrayList.get(arrayList.size() - 1));
                    headerField = String.format(headerField.startsWith("/") ? "%s://%s%s" : "%s://%s/%s", parse.getScheme(), parse.getHost(), headerField);
                }
                arrayList.add(headerField);
                if (arrayList.size() <= 20) {
                    return headerField.startsWith("http") ? a(t0Var, arrayList, new URL(headerField), str, str2) : Pair.create(arrayList, null);
                }
                throw new b("Url chain too big for us");
            }
            a(httpURLConnection, t0Var);
            int responseCode2 = httpURLConnection.getResponseCode();
            t0Var.a(System.currentTimeMillis());
            IAlog.a("%s (%s) response code - %d", t0Var.toString(), url, Integer.valueOf(responseCode2));
            if (t0Var instanceof h1) {
            }
            return new Pair(arrayList, httpURLConnection);
        } catch (Exception e) {
            t0Var.a(System.currentTimeMillis());
            IAlog.a("failed executing network request for url: %s msg: %s", t0Var.r(), e.getMessage());
            throw new b(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.h
    public final l a(t0 t0Var, String str, String str2) {
        l a;
        IAlog.a("%s hurl network stack is in use", "HttpExecutorImpl");
        String r = t0Var.r();
        URL url = new URL(r);
        ArrayList arrayList = new ArrayList();
        arrayList.add(r);
        Pair a2 = a(t0Var, arrayList, url, str, str2);
        HttpURLConnection httpURLConnection = (HttpURLConnection) a2.second;
        List list = (List) a2.first;
        if (httpURLConnection == null) {
            try {
                if (list.size() <= 0) {
                    throw new q1();
                }
            } catch (SocketTimeoutException e) {
                throw new t1(e);
            } catch (IOException e2) {
                IAlog.a("failed reading network response for url: %s msg: %s", httpURLConnection.getURL(), e2.getMessage());
                throw new q1(e2);
            }
        }
        FilterInputStream filterInputStream = null;
        if (httpURLConnection == null) {
            a = i.a(null, 200, "", null, null);
        } else {
            try {
                filterInputStream = i.a(httpURLConnection.getInputStream(), TextUtils.equals("gzip", httpURLConnection.getContentEncoding()));
            } catch (Exception unused) {
            }
            a = i.a(filterInputStream, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), httpURLConnection.getHeaderFields(), httpURLConnection.getHeaderField("Last-Modified"));
        }
        j jVar = new j(httpURLConnection, a.a, (FilterInputStream) a.c, a.d, a.e);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jVar.f.add((String) it.next());
        }
        return jVar;
    }

    public static void a(HttpURLConnection httpURLConnection, t0 t0Var) {
        httpURLConnection.setRequestMethod(t0Var.m().key);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        byte[] f = t0Var.f();
        httpURLConnection.setRequestProperty("Content-Length", "" + (f != null ? f.length : 0));
        httpURLConnection.setRequestProperty("Content-Type", t0Var.n());
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(f);
        try {
            outputStream.close();
        } catch (Throwable unused) {
        }
    }

    public static void a(HttpURLConnection httpURLConnection, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        IAlog.d("%s %s : %s", "REQUEST_HEADER", str, str2);
        httpURLConnection.addRequestProperty(str, str2);
    }
}
