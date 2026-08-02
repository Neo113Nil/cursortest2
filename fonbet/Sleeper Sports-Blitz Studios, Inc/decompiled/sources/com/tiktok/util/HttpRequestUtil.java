package com.tiktok.util;

import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.common.net.HttpHeaders;
import com.tiktok.TikTokBusinessSdk;
import com.tiktok.appevents.TTCrashHandler;
import io.sentry.protocol.Gpu;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class HttpRequestUtil {
    private static final String API_ERR = "api_err";
    private static final String MONITOR_API_TYPE = "monitor";
    private static final String TAG = "com.tiktok.util.HttpRequestUtil";
    private static final TTLogger ttLogger = new TTLogger(HttpRequestUtil.class.getCanonicalName(), TikTokBusinessSdk.getLogLevel());

    public static boolean shouldRedirect(int status) {
        if (status != 200) {
            return status == 302 || status == 301 || status == 303 || status == 307;
        }
        return false;
    }

    public static class HttpRequestOptions {
        private static int UNSET = -1;
        public int connectTimeout;
        public int readTimeout;

        public HttpRequestOptions() {
            int i = UNSET;
            this.connectTimeout = i;
            this.readTimeout = i;
        }

        public void configConnection(HttpURLConnection connection) {
            int i = this.connectTimeout;
            if (i != UNSET) {
                connection.setConnectTimeout(i);
            }
            int i2 = this.readTimeout;
            if (i2 != UNSET) {
                connection.setReadTimeout(i2);
            }
        }
    }

    public static HttpsURLConnection connect(String url, Map<String, String> headerParamMap, HttpRequestOptions options, String method, String contentLength) {
        HttpsURLConnection httpsURLConnection;
        HttpsURLConnection httpsURLConnection2 = null;
        try {
            httpsURLConnection = (HttpsURLConnection) new URL(url).openConnection();
        } catch (Exception e) {
            e = e;
        }
        try {
            httpsURLConnection.setRequestMethod(method);
            options.configConnection(httpsURLConnection);
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setUseCaches(false);
            if (method.equals("GET")) {
                httpsURLConnection.setDoOutput(false);
            } else if (method.equals("POST")) {
                httpsURLConnection.setDoOutput(true);
                httpsURLConnection.setRequestProperty("Content-Length", contentLength);
            }
            for (Map.Entry<String, String> entry : headerParamMap.entrySet()) {
                httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
            httpsURLConnection.setRequestProperty(HttpHeaders.CONTENT_ENCODING, "gzip");
            httpsURLConnection.connect();
            return httpsURLConnection;
        } catch (Exception e2) {
            e = e2;
            httpsURLConnection2 = httpsURLConnection;
            TTCrashHandler.handleCrash(TAG, e, 1);
            if (httpsURLConnection2 != null) {
                try {
                    httpsURLConnection2.disconnect();
                } catch (Exception e3) {
                    TTCrashHandler.handleCrash(TAG, e3, 1);
                }
            }
            return httpsURLConnection2;
        }
    }

    public static String doGet(String url, Map<String, String> headerParamMap, HttpRequestOptions options) {
        String message;
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = "";
        try {
            message = "";
            str2 = new URL(url).getPath().split("/app_sdk/")[1];
        } catch (Throwable th) {
            message = th.getMessage();
        }
        HttpsURLConnection connect = connect(url, headerParamMap, options, "GET", null);
        if (connect == null) {
            return null;
        }
        int i = 0;
        try {
            try {
                if (shouldRedirect(connect.getResponseCode())) {
                    String headerField = connect.getHeaderField(HttpHeaders.LOCATION);
                    connect.disconnect();
                    connect = connect(headerField, headerParamMap, options, "GET", null);
                }
                i = connect.getResponseCode();
                str = i == 200 ? streamToString(connect.getInputStream()) : null;
                if (connect != null) {
                    try {
                        connect.disconnect();
                    } catch (Exception e) {
                        message = e.getMessage();
                        TTCrashHandler.handleCrash(TAG, e, 1);
                    }
                }
            } catch (Throwable th2) {
                if (connect != null) {
                    try {
                        connect.disconnect();
                    } catch (Exception e2) {
                        e2.getMessage();
                        TTCrashHandler.handleCrash(TAG, e2, 1);
                    }
                }
                throw th2;
            }
        } catch (Exception e3) {
            message = e3.getMessage();
            TTCrashHandler.handleCrash(TAG, e3, 1);
            if (connect != null) {
                try {
                    connect.disconnect();
                } catch (Exception e4) {
                    message = e4.getMessage();
                    TTCrashHandler.handleCrash(TAG, e4, 1);
                }
            }
            str = null;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        try {
            int codeFromApi = getCodeFromApi(str);
            if (codeFromApi != 0) {
                if (i == 200) {
                    message = getMessageFromApi(str);
                    i = codeFromApi;
                }
                TikTokBusinessSdk.getAppEventLogger().monitorMetric(API_ERR, TTUtil.getMetaWithTS(Long.valueOf(currentTimeMillis)).put("latency", currentTimeMillis2 - currentTimeMillis).put(Gpu.JsonKeys.API_TYPE, str2).put("status_code", i).put("message", message).put("log_id", getLogIDFromApi(str)), null);
            }
        } catch (Exception unused) {
        }
        return str;
    }

    public static String doPost(String url, Map<String, String> headerParamMap, String jsonStr, boolean needSignature) {
        HttpRequestOptions httpRequestOptions = new HttpRequestOptions();
        httpRequestOptions.connectTimeout = 2000;
        httpRequestOptions.readTimeout = 5000;
        return doPost(url, headerParamMap, jsonStr, httpRequestOptions, needSignature);
    }

    public static String doPost(String url, Map<String, String> headerParamMap, String jsonStr) {
        return doPost(url, headerParamMap, jsonStr, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d8, code lost:
    
        if (r14 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00da, code lost:
    
        r14.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0106, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0107, code lost:
    
        r3 = r0.getMessage();
        com.tiktok.appevents.TTCrashHandler.handleCrash(com.tiktok.util.HttpRequestUtil.TAG, r0, 1);
        r0 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0103, code lost:
    
        if (r14 == null) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String doPost(String url, Map<String, String> headerParamMap, String jsonStr, HttpRequestOptions options, boolean needSignature) {
        String message;
        String str;
        HttpsURLConnection httpsURLConnection;
        OutputStream outputStream;
        int i;
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = "";
        try {
            str2 = new URL(url).getPath().split("/app_sdk/")[1];
            message = "";
        } catch (Throwable th) {
            message = th.getMessage();
        }
        try {
            if (needSignature) {
                headerParamMap.put("X-TT-Signature", DecryptUtil.encryptWithHmac(jsonStr));
            } else {
                headerParamMap.remove("X-TT-Signature");
            }
            byte[] compress2Gzip = compress2Gzip(jsonStr);
            String valueOf = String.valueOf(compress2Gzip.length);
            httpsURLConnection = connect(url, headerParamMap, options, "POST", valueOf);
            if (httpsURLConnection == null) {
                if (httpsURLConnection != null) {
                    try {
                        httpsURLConnection.disconnect();
                    } catch (Throwable th2) {
                        th2.getMessage();
                        TTCrashHandler.handleCrash(TAG, th2, 1);
                    }
                }
                return null;
            }
            try {
                outputStream = httpsURLConnection.getOutputStream();
                try {
                    outputStream.write(compress2Gzip);
                    outputStream.flush();
                    if (shouldRedirect(httpsURLConnection.getResponseCode())) {
                        String headerField = httpsURLConnection.getHeaderField(HttpHeaders.LOCATION);
                        httpsURLConnection.disconnect();
                        httpsURLConnection = connect(headerField, headerParamMap, options, "POST", valueOf);
                        outputStream = httpsURLConnection.getOutputStream();
                        outputStream.write(compress2Gzip);
                        outputStream.flush();
                    }
                    i = httpsURLConnection.getResponseCode();
                    if (i == 200) {
                        try {
                            str = streamToString(httpsURLConnection.getInputStream());
                        } catch (Throwable th3) {
                            th = th3;
                            str = null;
                            try {
                                String message2 = th.getMessage();
                                TTCrashHandler.handleCrash(TAG, th, 1);
                                if (outputStream != null) {
                                }
                                message = message2;
                            } finally {
                            }
                        }
                    } else {
                        str = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    str = null;
                    i = 0;
                    String message22 = th.getMessage();
                    TTCrashHandler.handleCrash(TAG, th, 1);
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (Throwable th5) {
                            message22 = th5.getMessage();
                            TTCrashHandler.handleCrash(TAG, th5, 1);
                        }
                    }
                    message = message22;
                }
            } catch (Throwable th6) {
                th = th6;
                str = null;
                outputStream = null;
            }
            try {
                if (TikTokBusinessSdk.isInSdkDebugMode().booleanValue()) {
                    TTLogger tTLogger = ttLogger;
                    tTLogger.info("doPost request body: %s", jsonStr);
                    tTLogger.info("doPost result: %s", str == null ? String.valueOf(i) : str);
                }
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th7) {
                        String message3 = th7.getMessage();
                        TTCrashHandler.handleCrash(TAG, th7, 1);
                        message = message3;
                    }
                }
            } catch (Throwable th8) {
                th = th8;
                String message222 = th.getMessage();
                TTCrashHandler.handleCrash(TAG, th, 1);
                if (outputStream != null) {
                }
                message = message222;
            }
        } catch (Throwable th9) {
            th = th9;
            str = null;
            httpsURLConnection = null;
            outputStream = null;
        }
        return str;
        long currentTimeMillis2 = System.currentTimeMillis();
        try {
            int codeFromApi = getCodeFromApi(str);
            if (codeFromApi != 0 && i == 200) {
                message = getMessageFromApi(str);
                i = codeFromApi;
            }
            if (codeFromApi != 0 && !url.contains(MONITOR_API_TYPE)) {
                TikTokBusinessSdk.getAppEventLogger().monitorMetric(API_ERR, TTUtil.getMetaWithTS(Long.valueOf(currentTimeMillis)).put("latency", currentTimeMillis2 - currentTimeMillis).put(Gpu.JsonKeys.API_TYPE, str2).put("status_code", i).put("message", message).put("log_id", getLogIDFromApi(str)), null);
            }
        } catch (Throwable unused) {
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.tiktok.util.TTLogger] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.zip.GZIPOutputStream] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.tiktok.util.TTLogger] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.String] */
    private static byte[] compress2Gzip(String str) {
        ?? r3;
        GZIPOutputStream gZIPOutputStream;
        ?? r0 = 0;
        r0 = null;
        GZIPOutputStream gZIPOutputStream2 = null;
        r0 = 0;
        if (str == null || str.length() == 0) {
            return null;
        }
        int i = 0;
        i = 0;
        i = 0;
        i = 0;
        i = 0;
        i = 0;
        byte[] bArr = new byte[0];
        try {
            try {
                r3 = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new GZIPOutputStream(r3);
                } catch (IOException e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                String str2 = "utf-8";
                gZIPOutputStream.write(str.getBytes("utf-8"));
                try {
                    gZIPOutputStream.close();
                    r0 = str2;
                } catch (IOException e2) {
                    TTLogger tTLogger = ttLogger;
                    tTLogger.error(e2, e2.toString(), new Object[0]);
                    r0 = tTLogger;
                }
                bArr = r3.toByteArray();
                try {
                    r3.close();
                } catch (IOException e3) {
                    r0 = ttLogger;
                    r3 = e3.toString();
                    i = new Object[0];
                    r0.error(e3, r3, i);
                }
            } catch (IOException e4) {
                e = e4;
                gZIPOutputStream2 = gZIPOutputStream;
                ttLogger.error(e, e.toString(), new Object[0]);
                r0 = gZIPOutputStream2;
                if (gZIPOutputStream2 != null) {
                    try {
                        gZIPOutputStream2.close();
                        r0 = gZIPOutputStream2;
                    } catch (IOException e5) {
                        TTLogger tTLogger2 = ttLogger;
                        tTLogger2.error(e5, e5.toString(), new Object[0]);
                        r0 = tTLogger2;
                    }
                }
                if (r3 != 0) {
                    bArr = r3.toByteArray();
                    try {
                        r3.close();
                    } catch (IOException e6) {
                        r0 = ttLogger;
                        r3 = e6.toString();
                        i = new Object[0];
                        r0.error(e6, r3, i);
                    }
                }
                return bArr;
            } catch (Throwable th2) {
                th = th2;
                r0 = gZIPOutputStream;
                if (r0 != 0) {
                    try {
                        r0.close();
                    } catch (IOException e7) {
                        ttLogger.error(e7, e7.toString(), new Object[i]);
                    }
                }
                if (r3 != 0) {
                    r3.toByteArray();
                    try {
                        r3.close();
                        throw th;
                    } catch (IOException e8) {
                        ttLogger.error(e8, e8.toString(), new Object[i]);
                        throw th;
                    }
                }
                throw th;
            }
        } catch (IOException e9) {
            e = e9;
            r3 = 0;
        } catch (Throwable th3) {
            th = th3;
            r3 = 0;
        }
        return bArr;
    }

    private static String streamToString(InputStream is) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                    } else {
                        String trim = sb.toString().trim();
                        bufferedReader.close();
                        return trim;
                    }
                }
            } finally {
            }
        } catch (Exception e) {
            TTCrashHandler.handleCrash(TAG, e, 1);
            return null;
        }
    }

    public static int getCodeFromApi(String resp) {
        if (resp == null) {
            return -1;
        }
        try {
            return new JSONObject(resp).getInt("code");
        } catch (Exception unused) {
            return -2;
        }
    }

    public static String getMessageFromApi(String resp) {
        if (resp != null) {
            try {
                return new JSONObject(resp).getString("message");
            } catch (Exception e) {
                return e.getMessage();
            }
        }
        return "result is empty";
    }

    public static String getLogIDFromApi(String resp) {
        if (resp != null) {
            try {
                return new JSONObject(resp).getString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID);
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
