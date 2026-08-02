package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
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

/* loaded from: classes6.dex */
public final class AFe1lSDK {
    private final int getCurrencyIso4217Code;

    public AFe1lSDK(int i) {
        this.getCurrencyIso4217Code = i;
    }

    public final AFe1iSDK<String> getMonetizationNetwork(AFe1nSDK aFe1nSDK) throws IOException {
        byte[] monetizationNetwork;
        HttpURLConnection httpURLConnection;
        long currentTimeMillis = System.currentTimeMillis();
        HttpURLConnection httpURLConnection2 = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                monetizationNetwork = aFe1nSDK.getMonetizationNetwork();
                StringBuilder sb = new StringBuilder();
                sb.append(aFe1nSDK.getRevenue);
                sb.append(":");
                sb.append(aFe1nSDK.AFAdRevenueData);
                StringBuilder sb2 = new StringBuilder(sb.toString());
                byte[] monetizationNetwork2 = aFe1nSDK.getMonetizationNetwork();
                if (aFe1nSDK.getCurrencyIso4217Code() && monetizationNetwork2 != null) {
                    String str = aFe1nSDK.getMediationNetwork() ? "<encrypted>" : new String(monetizationNetwork2, Charset.defaultCharset());
                    sb2.append("\n payload: ");
                    sb2.append(str);
                }
                for (Map.Entry<String, String> entry : aFe1nSDK.getCurrencyIso4217Code.entrySet()) {
                    sb2.append("\n ");
                    sb2.append(entry.getKey());
                    sb2.append(": ");
                    sb2.append(entry.getValue());
                }
                StringBuilder sb3 = new StringBuilder("[");
                sb3.append(aFe1nSDK.hashCode());
                sb3.append("] ");
                sb3.append((Object) sb2);
                AFLogger.INSTANCE.d(AFh1xSDK.HTTP_CLIENT, sb3.toString());
                httpURLConnection = (HttpURLConnection) new URL(aFe1nSDK.AFAdRevenueData).openConnection();
                try {
                    httpURLConnection.setRequestMethod(aFe1nSDK.getRevenue);
                    if (aFe1nSDK.AFAdRevenueData()) {
                        httpURLConnection.setUseCaches(false);
                    }
                    if (!aFe1nSDK.areAllFieldsValid()) {
                        httpURLConnection.setInstanceFollowRedirects(false);
                    }
                } catch (Exception e) {
                    e = e;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                if (0 != 0) {
                    httpURLConnection2.disconnect();
                }
                throw th2;
            }
        } catch (Exception e2) {
            e = e2;
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            int i = this.getCurrencyIso4217Code;
            int i2 = aFe1nSDK.component4;
            if (i2 != -1) {
                i = i2;
            }
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setReadTimeout(i);
            httpURLConnection.addRequestProperty("Content-Type", aFe1nSDK.getMediationNetwork() ? "application/octet-stream" : "application/json");
            for (Map.Entry<String, String> entry2 : aFe1nSDK.getCurrencyIso4217Code.entrySet()) {
                httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
            }
            if (monetizationNetwork != null) {
                httpURLConnection.setDoOutput(true);
                StringBuilder sb4 = new StringBuilder();
                sb4.append(monetizationNetwork.length);
                httpURLConnection.setRequestProperty("Content-Length", sb4.toString());
                try {
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                    try {
                        bufferedOutputStream2.write(monetizationNetwork);
                        bufferedOutputStream2.close();
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedOutputStream = bufferedOutputStream2;
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }
            boolean z = httpURLConnection.getResponseCode() / 100 == 2;
            String str2 = "";
            if (aFe1nSDK.getRevenue()) {
                str2 = getMediationNetwork(httpURLConnection);
            }
            String str3 = str2;
            AFe1mSDK aFe1mSDK = new AFe1mSDK(System.currentTimeMillis() - currentTimeMillis);
            StringBuilder sb5 = new StringBuilder("response code:");
            sb5.append(httpURLConnection.getResponseCode());
            sb5.append(" ");
            sb5.append(httpURLConnection.getResponseMessage());
            sb5.append("\n body:");
            sb5.append(str3);
            sb5.append("\n took ");
            sb5.append(aFe1mSDK.getCurrencyIso4217Code);
            sb5.append("ms");
            String obj = sb5.toString();
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1xSDK aFh1xSDK = AFh1xSDK.HTTP_CLIENT;
            StringBuilder sb6 = new StringBuilder("[");
            sb6.append(aFe1nSDK.hashCode());
            sb6.append("] ");
            sb6.append(obj);
            aFLogger.d(aFh1xSDK, sb6.toString());
            HashMap hashMap = new HashMap(httpURLConnection.getHeaderFields());
            hashMap.remove(null);
            AFe1iSDK<String> aFe1iSDK = new AFe1iSDK<>(str3, httpURLConnection.getResponseCode(), z, hashMap, aFe1mSDK);
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            return aFe1iSDK;
        } catch (Exception e3) {
            e = e3;
            AFe1mSDK aFe1mSDK2 = new AFe1mSDK(System.currentTimeMillis() - currentTimeMillis);
            getMediationNetwork(aFe1nSDK, e, aFe1mSDK2, false);
            throw new HttpException(e, aFe1mSDK2);
        } catch (Throwable th6) {
            th = th6;
            AFe1mSDK aFe1mSDK3 = new AFe1mSDK(System.currentTimeMillis() - currentTimeMillis);
            getMediationNetwork(aFe1nSDK, th, aFe1mSDK3, true);
            throw new HttpException(th, aFe1mSDK3);
        }
    }

    private static void getMediationNetwork(AFe1nSDK aFe1nSDK, Throwable th, AFe1mSDK aFe1mSDK, boolean z) {
        StringBuilder sb = new StringBuilder("error: ");
        sb.append(th);
        sb.append("\n took ");
        sb.append(aFe1mSDK.getCurrencyIso4217Code);
        sb.append("ms");
        String obj = sb.toString();
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1xSDK aFh1xSDK = AFh1xSDK.HTTP_CLIENT;
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(aFe1nSDK.hashCode());
        sb2.append("] ");
        sb2.append(obj);
        aFLogger.e(aFh1xSDK, sb2.toString(), th, false, false, z);
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
                AFLogger.INSTANCE.e(AFh1xSDK.HTTP_CLIENT, e.getMessage() != null ? e.getMessage() : "", e, false, false);
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
