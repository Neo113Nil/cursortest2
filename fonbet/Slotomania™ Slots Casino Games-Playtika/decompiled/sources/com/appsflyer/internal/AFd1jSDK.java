package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.google.common.net.HttpHeaders;
import com.ironsource.B5;
import com.ironsource.X3;
import io.ktor.sse.ServerSentEventKt;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AFd1jSDK {
    private final int getCurrencyIso4217Code;

    public AFd1jSDK(int i) {
        this.getCurrencyIso4217Code = i;
    }

    public final AFd1cSDK<String> getMediationNetwork(AFd1aSDK aFd1aSDK) throws IOException {
        long currentTimeMillis = System.currentTimeMillis();
        HttpURLConnection httpURLConnection = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                byte[] revenue = aFd1aSDK.getRevenue();
                StringBuilder sb = new StringBuilder(new StringBuilder().append(aFd1aSDK.getMediationNetwork).append(":").append(aFd1aSDK.getCurrencyIso4217Code).toString());
                byte[] revenue2 = aFd1aSDK.getRevenue();
                if (aFd1aSDK.getCurrencyIso4217Code() && revenue2 != null) {
                    sb.append("\n payload: ").append(aFd1aSDK.getMonetizationNetwork() ? "<encrypted>" : new String(revenue2, Charset.defaultCharset()));
                }
                for (Map.Entry<String, String> entry : aFd1aSDK.AFAdRevenueData.entrySet()) {
                    sb.append("\n ").append(entry.getKey()).append(": ").append(entry.getValue());
                }
                AFLogger.INSTANCE.d(AFh1zSDK.HTTP_CLIENT, new StringBuilder(X3.j.d).append(aFd1aSDK.hashCode()).append("] ").append((Object) sb).toString());
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(aFd1aSDK.getCurrencyIso4217Code).openConnection();
                try {
                    httpURLConnection2.setRequestMethod(aFd1aSDK.getMediationNetwork);
                    if (aFd1aSDK.getMediationNetwork()) {
                        httpURLConnection2.setUseCaches(false);
                    }
                    if (!aFd1aSDK.areAllFieldsValid()) {
                        httpURLConnection2.setInstanceFollowRedirects(false);
                    }
                    try {
                        int i = this.getCurrencyIso4217Code;
                        int i2 = aFd1aSDK.component2;
                        if (i2 != -1) {
                            i = i2;
                        }
                        httpURLConnection2.setConnectTimeout(i);
                        httpURLConnection2.setReadTimeout(i);
                        httpURLConnection2.addRequestProperty("Content-Type", aFd1aSDK.getMonetizationNetwork() ? "application/octet-stream" : B5.M);
                        for (Map.Entry<String, String> entry2 : aFd1aSDK.AFAdRevenueData.entrySet()) {
                            httpURLConnection2.setRequestProperty(entry2.getKey(), entry2.getValue());
                        }
                        if (revenue != null) {
                            httpURLConnection2.setDoOutput(true);
                            httpURLConnection2.setRequestProperty(HttpHeaders.CONTENT_LENGTH, new StringBuilder().append(revenue.length).toString());
                            try {
                                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                                try {
                                    bufferedOutputStream2.write(revenue);
                                    bufferedOutputStream2.close();
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedOutputStream = bufferedOutputStream2;
                                    if (bufferedOutputStream != null) {
                                        bufferedOutputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        boolean z = httpURLConnection2.getResponseCode() / 100 == 2;
                        String str = "";
                        if (aFd1aSDK.AFAdRevenueData()) {
                            str = getMediationNetwork(httpURLConnection2);
                        }
                        String str2 = str;
                        AFd1gSDK aFd1gSDK = new AFd1gSDK(System.currentTimeMillis() - currentTimeMillis);
                        AFLogger.INSTANCE.d(AFh1zSDK.HTTP_CLIENT, new StringBuilder(X3.j.d).append(aFd1aSDK.hashCode()).append("] ").append(new StringBuilder("response code:").append(httpURLConnection2.getResponseCode()).append(ServerSentEventKt.SPACE).append(httpURLConnection2.getResponseMessage()).append("\n body:").append(str2).append("\n took ").append(aFd1gSDK.getMonetizationNetwork).append("ms").toString()).toString());
                        HashMap hashMap = new HashMap(httpURLConnection2.getHeaderFields());
                        hashMap.remove(null);
                        AFd1cSDK<String> aFd1cSDK = new AFd1cSDK<>(str2, httpURLConnection2.getResponseCode(), z, hashMap, aFd1gSDK);
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        return aFd1cSDK;
                    } catch (Exception e) {
                        e = e;
                        AFd1gSDK aFd1gSDK2 = new AFd1gSDK(System.currentTimeMillis() - currentTimeMillis);
                        getMediationNetwork(aFd1aSDK, e, aFd1gSDK2, false);
                        throw new HttpException(e, aFd1gSDK2);
                    } catch (Throwable th3) {
                        th = th3;
                        AFd1gSDK aFd1gSDK3 = new AFd1gSDK(System.currentTimeMillis() - currentTimeMillis);
                        getMediationNetwork(aFd1aSDK, th, aFd1gSDK3, true);
                        throw new HttpException(th, aFd1gSDK3);
                    }
                } catch (Exception e2) {
                    e = e2;
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
                throw th5;
            }
        } catch (Exception e3) {
            e = e3;
        } catch (Throwable th6) {
            th = th6;
        }
    }

    private static void getMediationNetwork(AFd1aSDK aFd1aSDK, Throwable th, AFd1gSDK aFd1gSDK, boolean z) {
        AFLogger.INSTANCE.e(AFh1zSDK.HTTP_CLIENT, new StringBuilder(X3.j.d).append(aFd1aSDK.hashCode()).append("] ").append(new StringBuilder("error: ").append(th).append("\n took ").append(aFd1gSDK.getMonetizationNetwork).append("ms").toString()).toString(), th, false, false, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String getMediationNetwork(HttpURLConnection httpURLConnection) throws IOException {
        Throwable th;
        BufferedReader bufferedReader;
        InputStream errorStream;
        InputStreamReader inputStreamReader = null;
        try {
            try {
                errorStream = httpURLConnection.getInputStream();
            } catch (Exception e) {
                errorStream = httpURLConnection.getErrorStream();
                AFLogger.INSTANCE.e(AFh1zSDK.HTTP_CLIENT, e.getMessage() != null ? e.getMessage() : "", e, false, false);
            }
            if (errorStream == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            InputStreamReader inputStreamReader2 = new InputStreamReader(errorStream, Charset.defaultCharset());
            try {
                BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
                boolean z = true;
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine != null) {
                            if (!z) {
                                sb.append('\n');
                            }
                            sb.append(readLine);
                            z = false;
                        } else {
                            String obj = sb.toString();
                            inputStreamReader2.close();
                            bufferedReader2.close();
                            return obj;
                        }
                    } catch (Throwable th2) {
                        bufferedReader = bufferedReader2;
                        th = th2;
                        inputStreamReader = inputStreamReader2;
                        if (inputStreamReader != null) {
                        }
                        if (bufferedReader == null) {
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
            if (inputStreamReader != null) {
                inputStreamReader.close();
            }
            if (bufferedReader == null) {
                bufferedReader.close();
                throw th;
            }
            throw th;
        }
    }
}
