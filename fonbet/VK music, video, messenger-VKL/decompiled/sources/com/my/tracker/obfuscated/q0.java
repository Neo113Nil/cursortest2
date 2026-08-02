package com.my.tracker.obfuscated;

import android.net.TrafficStats;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.my.tracker.obfuscated.s0;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public final class q0 extends s0 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.my.tracker.obfuscated.s0
    public s0.b a(String str) {
        s0.b d = s0.b.d();
        HttpURLConnection httpURLConnection = null;
        Object[] objArr = 0;
        try {
            x2.a("HttpGetRequest: send request to " + str);
            TrafficStats.setThreadStatsTag(27498374);
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection2.setConnectTimeout(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED);
                httpURLConnection2.setReadTimeout(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED);
                httpURLConnection2.setRequestMethod("GET");
                int responseCode = httpURLConnection2.getResponseCode();
                x2.a("HttpGetRequest: response received with response code: " + responseCode);
                d.a = responseCode == 200;
                try {
                    x2.a("HttpGetRequest: processing server response");
                    BufferedReader bufferedReader = d.a ? new BufferedReader(new InputStreamReader(httpURLConnection2.getInputStream())) : new BufferedReader(new InputStreamReader(httpURLConnection2.getErrorStream()));
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    }
                    if (sb.length() > 0) {
                        d.b = sb.toString();
                    } else {
                        x2.a("HttpGetRequest: response data is empty");
                    }
                    bufferedReader.close();
                    httpURLConnection2.disconnect();
                    return d;
                } catch (Throwable th) {
                    if (0 != 0) {
                        (objArr == true ? 1 : 0).close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = httpURLConnection2;
                try {
                    x2.a("HttpGetRequest: error", th);
                    d.a = false;
                    d.c = "HttpGetRequest: error while sending data";
                    return d;
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
