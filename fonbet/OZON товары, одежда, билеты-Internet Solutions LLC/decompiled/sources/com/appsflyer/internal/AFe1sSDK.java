package com.appsflyer.internal;

import androidx.annotation.NonNull;
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
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes.dex */
public final class AFe1sSDK {
    private final int values;

    public AFe1sSDK(int i11) {
        this.values = i11;
    }

    @NonNull
    private static String values(HttpURLConnection httpURLConnection, boolean z11) throws IOException {
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader = null;
        try {
            InputStream inputStream = z11 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
            if (inputStream == null) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            InputStreamReader inputStreamReader2 = new InputStreamReader(inputStream, Charset.defaultCharset());
            try {
                BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
                boolean z12 = true;
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            String obj = sb2.toString();
                            inputStreamReader2.close();
                            bufferedReader2.close();
                            return obj;
                        }
                        if (!z12) {
                            sb2.append('\n');
                        }
                        sb2.append(readLine);
                        z12 = false;
                    } catch (Throwable th2) {
                        bufferedReader = bufferedReader2;
                        th = th2;
                        inputStreamReader = inputStreamReader2;
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
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
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x024b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFe1hSDK<String> AFKeystoreWrapper(AFe1oSDK aFe1oSDK) throws IOException {
        HttpURLConnection httpURLConnection;
        Exception exc;
        byte[] values;
        HttpURLConnection httpURLConnection2;
        BufferedOutputStream bufferedOutputStream;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            values = aFe1oSDK.values();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(aFe1oSDK.AFInAppEventParameterName);
            sb2.append(ProductContainerDTO.RATIO_DELIMITER);
            sb2.append(aFe1oSDK.valueOf);
            StringBuilder sb3 = new StringBuilder(sb2.toString());
            byte[] values2 = aFe1oSDK.values();
            if (aFe1oSDK.AFKeystoreWrapper() && values2 != null) {
                try {
                    String str = aFe1oSDK.AFInAppEventType() ? "<encrypted>" : new String(values2, Charset.defaultCharset());
                    sb3.append("\n payload: ");
                    sb3.append(str);
                } catch (Exception e11) {
                    e = e11;
                    httpURLConnection = null;
                    exc = e;
                    try {
                        AFe1mSDK aFe1mSDK = new AFe1mSDK(System.currentTimeMillis() - currentTimeMillis);
                        StringBuilder sb4 = new StringBuilder("error: ");
                        sb4.append(exc);
                        sb4.append("\n took ");
                        sb4.append(aFe1mSDK.AFKeystoreWrapper);
                        sb4.append("ms");
                        String obj = sb4.toString();
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1gSDK aFg1gSDK = AFg1gSDK.HTTP_CLIENT;
                        StringBuilder sb5 = new StringBuilder("[");
                        sb5.append(aFe1oSDK.hashCode());
                        sb5.append("] ");
                        sb5.append(obj);
                        aFLogger.e(aFg1gSDK, sb5.toString(), exc, false, false, false);
                        throw new HttpException(exc, aFe1mSDK);
                    } catch (Throwable th2) {
                        th = th2;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    httpURLConnection = null;
                    if (httpURLConnection != null) {
                    }
                    throw th;
                }
            }
            for (Map.Entry<String, String> entry : aFe1oSDK.values.entrySet()) {
                sb3.append("\n ");
                sb3.append(entry.getKey());
                sb3.append(": ");
                sb3.append(entry.getValue());
            }
            StringBuilder sb6 = new StringBuilder("[");
            sb6.append(aFe1oSDK.hashCode());
            sb6.append("] ");
            sb6.append((Object) sb3);
            AFLogger.INSTANCE.d(AFg1gSDK.HTTP_CLIENT, sb6.toString());
            httpURLConnection2 = (HttpURLConnection) new URL(aFe1oSDK.valueOf).openConnection();
            try {
                httpURLConnection2.setRequestMethod(aFe1oSDK.AFInAppEventParameterName);
                if (aFe1oSDK.AFInAppEventParameterName()) {
                    httpURLConnection2.setUseCaches(false);
                }
                if (!aFe1oSDK.unregisterClient()) {
                    httpURLConnection2.setInstanceFollowRedirects(false);
                }
            } catch (Exception e12) {
                e = e12;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e13) {
            e = e13;
            httpURLConnection = null;
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection = null;
        }
        try {
            int i11 = this.values;
            int i12 = aFe1oSDK.unregisterClient;
            if (i12 != -1) {
                i11 = i12;
            }
            httpURLConnection2.setConnectTimeout(i11);
            httpURLConnection2.setReadTimeout(i11);
            httpURLConnection2.addRequestProperty("Content-Type", aFe1oSDK.AFInAppEventType() ? "application/octet-stream" : "application/json");
            for (Map.Entry<String, String> entry2 : aFe1oSDK.values.entrySet()) {
                httpURLConnection2.setRequestProperty(entry2.getKey(), entry2.getValue());
            }
            if (values != null) {
                httpURLConnection2.setDoOutput(true);
                StringBuilder sb7 = new StringBuilder();
                sb7.append(values.length);
                httpURLConnection2.setRequestProperty("Content-Length", sb7.toString());
                try {
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                    try {
                        bufferedOutputStream2.write(values);
                        bufferedOutputStream2.close();
                    } catch (Throwable th6) {
                        th = th6;
                        bufferedOutputStream = bufferedOutputStream2;
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    bufferedOutputStream = null;
                }
            }
            boolean z11 = httpURLConnection2.getResponseCode() / 100 == 2;
            String values3 = aFe1oSDK.valueOf() ? values(httpURLConnection2, z11) : "";
            AFe1mSDK aFe1mSDK2 = new AFe1mSDK(System.currentTimeMillis() - currentTimeMillis);
            StringBuilder sb8 = new StringBuilder("response code:");
            sb8.append(httpURLConnection2.getResponseCode());
            sb8.append(" ");
            sb8.append(httpURLConnection2.getResponseMessage());
            sb8.append("\n body:");
            sb8.append(values3);
            sb8.append("\n took ");
            sb8.append(aFe1mSDK2.AFKeystoreWrapper);
            sb8.append("ms");
            String obj2 = sb8.toString();
            AFLogger aFLogger2 = AFLogger.INSTANCE;
            AFg1gSDK aFg1gSDK2 = AFg1gSDK.HTTP_CLIENT;
            StringBuilder sb9 = new StringBuilder("[");
            sb9.append(aFe1oSDK.hashCode());
            sb9.append("] ");
            sb9.append(obj2);
            aFLogger2.d(aFg1gSDK2, sb9.toString());
            HashMap hashMap = new HashMap(httpURLConnection2.getHeaderFields());
            hashMap.remove(null);
            AFe1hSDK<String> aFe1hSDK = new AFe1hSDK<>(values3, httpURLConnection2.getResponseCode(), z11, hashMap, aFe1mSDK2);
            httpURLConnection2.disconnect();
            return aFe1hSDK;
        } catch (Exception e14) {
            e = e14;
            exc = e;
            httpURLConnection = httpURLConnection2;
            AFe1mSDK aFe1mSDK3 = new AFe1mSDK(System.currentTimeMillis() - currentTimeMillis);
            StringBuilder sb42 = new StringBuilder("error: ");
            sb42.append(exc);
            sb42.append("\n took ");
            sb42.append(aFe1mSDK3.AFKeystoreWrapper);
            sb42.append("ms");
            String obj3 = sb42.toString();
            AFLogger aFLogger3 = AFLogger.INSTANCE;
            AFg1gSDK aFg1gSDK3 = AFg1gSDK.HTTP_CLIENT;
            StringBuilder sb52 = new StringBuilder("[");
            sb52.append(aFe1oSDK.hashCode());
            sb52.append("] ");
            sb52.append(obj3);
            aFLogger3.e(aFg1gSDK3, sb52.toString(), exc, false, false, false);
            throw new HttpException(exc, aFe1mSDK3);
        } catch (Throwable th8) {
            th = th8;
            httpURLConnection = httpURLConnection2;
            if (httpURLConnection != null) {
            }
            throw th;
        }
    }
}
