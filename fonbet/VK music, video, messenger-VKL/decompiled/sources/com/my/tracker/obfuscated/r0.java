package com.my.tracker.obfuscated;

import android.net.TrafficStats;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.my.tracker.obfuscated.s0;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPOutputStream;
import ru.ok.android.commons.http.Http;

/* loaded from: classes.dex */
public final class r0 extends s0 {
    final s0.a a;
    final boolean b;

    public r0(s0.a aVar, boolean z) {
        this.a = aVar;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0115 A[Catch: all -> 0x00be, TRY_ENTER, TryCatch #7 {all -> 0x00be, blocks: (B:6:0x002e, B:18:0x009c, B:23:0x00ac, B:40:0x0100, B:46:0x010a, B:47:0x010d, B:51:0x00c1, B:57:0x0115, B:58:0x0118), top: B:5:0x002e }] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.io.FilterOutputStream] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.io.FilterOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v5, types: [com.my.tracker.obfuscated.s0$a] */
    @Override // com.my.tracker.obfuscated.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s0.b a(String str) {
        HttpURLConnection httpURLConnection;
        GZIPOutputStream gZIPOutputStream;
        Throwable th;
        BufferedReader bufferedReader;
        s0.b d = s0.b.d();
        HttpURLConnection httpURLConnection2 = null;
        BufferedReader bufferedReader2 = null;
        Object obj = null;
        try {
            x2.a("HttpPostRequest: send request to " + str);
            TrafficStats.setThreadStatsTag(27498374);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Connection", CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
            httpURLConnection.setRequestProperty("Content-Type", this.a.a());
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoOutput(true);
            try {
                gZIPOutputStream = this.b;
                try {
                    if (gZIPOutputStream != 0) {
                        httpURLConnection.setRequestProperty(Http.Header.CONTENT_ENCODING, Http.ContentEncoding.GZIP);
                        GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new BufferedOutputStream(httpURLConnection.getOutputStream()));
                        x2.a("HttpPostRequest: populating post request body using gzip");
                        gZIPOutputStream = gZIPOutputStream2;
                    } else {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                        x2.a("HttpPostRequest: populating post request body without using gzip");
                        gZIPOutputStream = bufferedOutputStream;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (gZIPOutputStream != 0) {
                        gZIPOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
            try {
                this.a.a(gZIPOutputStream);
                if (this.b) {
                    gZIPOutputStream.finish();
                }
                gZIPOutputStream.close();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200 && responseCode != 204) {
                    x2.a("HttpPostRequest error: response code " + responseCode);
                    d.a = false;
                    if (responseCode == 200) {
                        try {
                            x2.a("HttpPostRequest: processing server response");
                            bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                        } catch (Throwable th5) {
                            th = th5;
                        }
                        try {
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
                                x2.a("HttpPostRequest: response data is empty");
                            }
                            bufferedReader.close();
                        } catch (Throwable th6) {
                            th = th6;
                            bufferedReader2 = bufferedReader;
                            if (bufferedReader2 == null) {
                                throw th;
                            }
                            bufferedReader2.close();
                            throw th;
                        }
                    }
                    httpURLConnection.disconnect();
                    return d;
                }
                x2.a("HttpPostRequest: response successfully received");
                d.a = true;
                if (responseCode == 200) {
                }
                httpURLConnection.disconnect();
                return d;
            } catch (Throwable th7) {
                th = th7;
                obj = gZIPOutputStream;
                gZIPOutputStream = obj;
                if (gZIPOutputStream != 0) {
                }
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            httpURLConnection2 = httpURLConnection;
            try {
                x2.a("HttpPostRequest error: error while sending data", th);
                d.a = false;
                d.c = "HttpPostRequest error: error while sending data";
                return d;
            } finally {
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
            }
        }
    }
}
