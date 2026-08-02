package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.sdk_base.logger.LogTag;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.ironsource.C4427z5;
import com.ironsource.U3;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFd1nSDK {
    private final int d;

    public AFd1nSDK(int i) {
        this.d = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[SYNTHETIC] */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String registerClient(HttpURLConnection httpURLConnection) throws IOException {
        Throwable th;
        BufferedReader bufferedReader;
        InputStream errorStream;
        InputStreamReader inputStreamReader = null;
        try {
            try {
                errorStream = httpURLConnection.getInputStream();
            } catch (Exception e) {
                errorStream = httpURLConnection.getErrorStream();
                AFLogger.INSTANCE.e(LogTag.HTTP_CLIENT, e.getMessage() != null ? e.getMessage() : "", e, false, false, false, false);
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
                        if (readLine == null) {
                            String obj = sb.toString();
                            inputStreamReader2.close();
                            bufferedReader2.close();
                            return obj;
                        }
                        if (!z) {
                            sb.append('\n');
                        }
                        sb.append(readLine);
                        z = false;
                    } catch (Throwable th2) {
                        bufferedReader = bufferedReader2;
                        th = th2;
                        inputStreamReader = inputStreamReader2;
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (bufferedReader != null) {
                            throw th;
                        }
                        bufferedReader.close();
                        throw th;
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
            }
            if (bufferedReader != null) {
            }
        }
    }

    public final AFd1iSDK<String> AFLogger(AFd1lSDK aFd1lSDK) throws IOException {
        Throwable th;
        long currentTimeMillis = System.currentTimeMillis();
        HttpURLConnection httpURLConnection = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            byte[] bArr = aFd1lSDK.AFKeystoreWrapper;
            StringBuilder sb = new StringBuilder();
            sb.append(aFd1lSDK.unregisterClient);
            sb.append(":");
            sb.append(aFd1lSDK.registerClient);
            StringBuilder sb2 = new StringBuilder(sb.toString());
            byte[] bArr2 = aFd1lSDK.AFKeystoreWrapper;
            if (aFd1lSDK.e && bArr2 != null) {
                String str = aFd1lSDK.d ? "<encrypted>" : new String(bArr2, Charset.defaultCharset());
                sb2.append("\n payload: ");
                sb2.append(str);
            }
            for (Map.Entry<String, String> entry : aFd1lSDK.AFLogger.entrySet()) {
                sb2.append("\n ");
                sb2.append(entry.getKey());
                sb2.append(": ");
                sb2.append(entry.getValue());
            }
            StringBuilder sb3 = new StringBuilder(U3.j.d);
            sb3.append(aFd1lSDK.hashCode());
            sb3.append("] ");
            sb3.append((Object) sb2);
            AFLogger.INSTANCE.d(LogTag.HTTP_CLIENT, sb3.toString());
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(aFd1lSDK.registerClient).openConnection()));
            try {
                httpURLConnection2.setRequestMethod(aFd1lSDK.unregisterClient);
                if (aFd1lSDK.i) {
                    httpURLConnection2.setUseCaches(false);
                }
                if (!aFd1lSDK.w) {
                    httpURLConnection2.setInstanceFollowRedirects(false);
                }
                int i = this.d;
                int i2 = aFd1lSDK.v;
                if (i2 != -1) {
                    i = i2;
                }
                httpURLConnection2.setConnectTimeout(i);
                httpURLConnection2.setReadTimeout(i);
                httpURLConnection2.addRequestProperty("Content-Type", aFd1lSDK.d ? "application/octet-stream" : C4427z5.M);
                for (Map.Entry<String, String> entry2 : aFd1lSDK.AFLogger.entrySet()) {
                    httpURLConnection2.setRequestProperty(entry2.getKey(), entry2.getValue());
                }
                if (bArr != null) {
                    httpURLConnection2.setDoOutput(true);
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(bArr.length);
                    httpURLConnection2.setRequestProperty("Content-Length", sb4.toString());
                    try {
                        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                        try {
                            bufferedOutputStream2.write(bArr);
                            bufferedOutputStream2.close();
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedOutputStream = bufferedOutputStream2;
                            if (bufferedOutputStream != null) {
                                bufferedOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                boolean z = httpURLConnection2.getResponseCode() / 100 == 2;
                String registerClient = aFd1lSDK.force ? registerClient(httpURLConnection2) : "";
                AFd1kSDK aFd1kSDK = new AFd1kSDK(System.currentTimeMillis() - currentTimeMillis);
                StringBuilder sb5 = new StringBuilder("response code:");
                sb5.append(httpURLConnection2.getResponseCode());
                sb5.append(" ");
                sb5.append(httpURLConnection2.getResponseMessage());
                sb5.append("\n body:");
                sb5.append(registerClient);
                sb5.append("\n took ");
                sb5.append(aFd1kSDK.registerClient);
                sb5.append("ms");
                String obj = sb5.toString();
                AFLogger aFLogger = AFLogger.INSTANCE;
                LogTag logTag = LogTag.HTTP_CLIENT;
                StringBuilder sb6 = new StringBuilder(U3.j.d);
                sb6.append(aFd1lSDK.hashCode());
                sb6.append("] ");
                sb6.append(obj);
                aFLogger.d(logTag, sb6.toString());
                HashMap hashMap = new HashMap(httpURLConnection2.getHeaderFields());
                hashMap.remove(null);
                AFd1iSDK<String> aFd1iSDK = new AFd1iSDK<>(registerClient, httpURLConnection2.getResponseCode(), z, hashMap, aFd1kSDK);
                httpURLConnection2.disconnect();
                return aFd1iSDK;
            } catch (Throwable th4) {
                th = th4;
                httpURLConnection = httpURLConnection2;
                try {
                    AFd1kSDK aFd1kSDK2 = new AFd1kSDK(System.currentTimeMillis() - currentTimeMillis);
                    StringBuilder sb7 = new StringBuilder("error: ");
                    sb7.append(th);
                    sb7.append("\n took ");
                    sb7.append(aFd1kSDK2.registerClient);
                    sb7.append("ms");
                    String obj2 = sb7.toString();
                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                    LogTag logTag2 = LogTag.HTTP_CLIENT;
                    StringBuilder sb8 = new StringBuilder(U3.j.d);
                    sb8.append(aFd1lSDK.hashCode());
                    sb8.append("] ");
                    sb8.append(obj2);
                    aFLogger2.e(logTag2, sb8.toString(), th, false, false, false);
                    throw new HttpException(th, aFd1kSDK2);
                } catch (Throwable th5) {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }
}
