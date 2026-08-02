package com.fyber.inneractive.sdk.util;

import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class s {
    public static String a(String str, int i, int i2) {
        String stringBuffer;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.connect();
            FilterInputStream a = a(httpURLConnection);
            String b = b(httpURLConnection);
            if (!TextUtils.isEmpty(b)) {
                httpURLConnection.disconnect();
                return a(b, i2, i);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200) {
                IAlog.a("isResponseValid: found invalid response status: %s", Integer.toString(responseCode));
                stringBuffer = null;
            } else {
                stringBuffer = v.b((InputStream) a).toString();
            }
            httpURLConnection.disconnect();
            return stringBuffer;
        } catch (Exception e) {
            IAlog.a("getBodyFromUrl failed with exception", e, new Object[0]);
            throw e;
        } catch (Throwable th) {
            IAlog.a("getBodyFromUrl failed with error", th, new Object[0]);
            return null;
        }
    }

    public static String b(HttpURLConnection httpURLConnection) {
        int responseCode = httpURLConnection.getResponseCode();
        if ((responseCode <= 300 || responseCode >= 304) && responseCode != 307 && responseCode != 308) {
            return null;
        }
        IAlog.a("getRedirectUrl: received redirect code %s", Integer.toString(responseCode));
        String headerField = httpURLConnection.getHeaderField(com.fyber.inneractive.sdk.network.n.LOCATION.a());
        if (!TextUtils.isEmpty(headerField)) {
            IAlog.a("getRedirectUrl: redirecting target url: %s", headerField);
            return headerField;
        }
        throw new Exception("Server returned HTTP " + Integer.toString(responseCode) + " with empty location header!");
    }

    public static boolean a() {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    public static FilterInputStream a(HttpURLConnection httpURLConnection) {
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (TextUtils.equals("gzip", httpURLConnection.getContentEncoding())) {
                return new GZIPInputStream(inputStream);
            }
            return new BufferedInputStream(inputStream);
        } catch (Exception unused) {
            return null;
        }
    }
}
