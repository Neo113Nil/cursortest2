package com.facebook.ads.internal.dynamicloading;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.exoplayer2.C;
import com.google.common.net.HttpHeaders;
import com.ironsource.B5;
import com.ironsource.X3;
import com.moloco.sdk.acm.b;
import com.playtika.pras.sdk.PrasSDK;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.cordova.globalization.Globalization;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class DexLoadErrorReporter {
    private static final String LOGGING_URL = "https://www.facebook.com/adnw_logging/";
    public static final double SAMPLING = 0.1d;
    private static final AtomicBoolean sAlreadyReported = new AtomicBoolean();

    /* JADX WARN: Type inference failed for: r5v3, types: [com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter$1] */
    public static void reportDexLoadingIssue(final Context context, final String str, double d) {
        AtomicBoolean atomicBoolean = sAlreadyReported;
        if (atomicBoolean.get() || Math.random() >= d) {
            return;
        }
        atomicBoolean.set(true);
        new Thread() { // from class: com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter.1
            /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0196 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:38:0x018c A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // java.lang.Thread, java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void run() {
                String str2;
                String str3;
                DataOutputStream dataOutputStream;
                HttpURLConnection httpURLConnection;
                InputStream inputStream;
                String jSONObject;
                DataOutputStream dataOutputStream2;
                String str4;
                String str5;
                super.run();
                try {
                    httpURLConnection = (HttpURLConnection) new URL(DexLoadErrorReporter.LOGGING_URL).openConnection();
                    try {
                        httpURLConnection.setRequestMethod("POST");
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
                        httpURLConnection.setRequestProperty("Accept", B5.M);
                        httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_CHARSET, C.UTF8_NAME);
                        httpURLConnection.setRequestProperty("user-agent", "[FBAN/AudienceNetworkForAndroid;FBSN/Android]");
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setDoInput(true);
                        httpURLConnection.connect();
                        String uuid = UUID.randomUUID().toString();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("attempt", "0");
                        DexLoadErrorReporter.addEnvFields(context, jSONObject2, uuid);
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("subtype", "generic");
                        jSONObject3.put("subtype_code", "1320");
                        jSONObject3.put("caught_exception", "1");
                        jSONObject3.put("stacktrace", str);
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("id", UUID.randomUUID().toString());
                        jSONObject4.put("type", "debug");
                        try {
                            jSONObject4.put("session_time", "" + (System.currentTimeMillis() / 1000));
                            jSONObject4.put(Globalization.TIME, "" + (System.currentTimeMillis() / 1000));
                            jSONObject4.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, uuid);
                            jSONObject4.put("data", jSONObject3);
                            jSONObject4.put("attempt", "0");
                            DexLoadErrorReporter.addEnvFields(context, jSONObject3, uuid);
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(jSONObject4);
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("data", jSONObject2);
                            jSONObject5.put("events", jSONArray);
                            jSONObject = jSONObject5.toString();
                            dataOutputStream2 = new DataOutputStream(httpURLConnection.getOutputStream());
                        } catch (Throwable th) {
                            th = th;
                            str2 = "Can't close connection.";
                            str3 = AudienceNetworkAds.TAG;
                            dataOutputStream = null;
                            inputStream = null;
                            try {
                                Log.e(str3, "Can't send error.", th);
                                if (dataOutputStream != null) {
                                    try {
                                        dataOutputStream.close();
                                    } catch (Exception e) {
                                        Log.e(str3, str2, e);
                                    }
                                }
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Exception e2) {
                                        Log.e(str3, str2, e2);
                                    }
                                }
                                if (httpURLConnection == null) {
                                    return;
                                }
                                httpURLConnection.disconnect();
                            } finally {
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        str2 = "Can't close connection.";
                        str3 = AudienceNetworkAds.TAG;
                    }
                    try {
                        dataOutputStream2.writeBytes("payload=" + URLEncoder.encode(jSONObject, C.UTF8_NAME));
                        dataOutputStream2.flush();
                        byte[] bArr = new byte[16384];
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        InputStream inputStream2 = httpURLConnection.getInputStream();
                        while (true) {
                            try {
                                int read = inputStream2.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                try {
                                    byteArrayOutputStream.write(bArr, 0, read);
                                } catch (Throwable th3) {
                                    th = th3;
                                    inputStream = inputStream2;
                                    str2 = "Can't close connection.";
                                    str3 = AudienceNetworkAds.TAG;
                                    dataOutputStream = dataOutputStream2;
                                    Log.e(str3, "Can't send error.", th);
                                    if (dataOutputStream != null) {
                                    }
                                    if (inputStream != null) {
                                    }
                                    if (httpURLConnection == null) {
                                    }
                                    httpURLConnection.disconnect();
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                str2 = "Can't close connection.";
                                str3 = AudienceNetworkAds.TAG;
                                inputStream = inputStream2;
                            }
                        }
                        byteArrayOutputStream.flush();
                        try {
                            dataOutputStream2.close();
                            str4 = "Can't close connection.";
                            str5 = AudienceNetworkAds.TAG;
                        } catch (Exception e3) {
                            str4 = "Can't close connection.";
                            str5 = AudienceNetworkAds.TAG;
                            Log.e(str5, str4, e3);
                        }
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Exception e4) {
                                Log.e(str5, str4, e4);
                            }
                        }
                        if (httpURLConnection == null) {
                            return;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        str2 = "Can't close connection.";
                        str3 = AudienceNetworkAds.TAG;
                        dataOutputStream = dataOutputStream2;
                        inputStream = null;
                        Log.e(str3, "Can't send error.", th);
                        if (dataOutputStream != null) {
                        }
                        if (inputStream != null) {
                        }
                        if (httpURLConnection == null) {
                        }
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th6) {
                    th = th6;
                    str2 = "Can't close connection.";
                    str3 = AudienceNetworkAds.TAG;
                    dataOutputStream = null;
                    httpURLConnection = null;
                }
                httpURLConnection.disconnect();
            }
        }.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void addEnvFields(Context context, JSONObject jSONObject, String str) throws JSONException, PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        jSONObject.put("APPBUILD", context.getPackageManager().getPackageInfo(packageName, 0).versionCode);
        jSONObject.put("APPNAME", context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(packageName, 0)));
        jSONObject.put("APPVERS", context.getPackageManager().getPackageInfo(packageName, 0).versionName);
        jSONObject.put("OSVERS", Build.VERSION.RELEASE);
        jSONObject.put("SDK", "android");
        jSONObject.put(PrasSDK.APP_SESSION_ID_KEY, str);
        jSONObject.put("MODEL", Build.MODEL);
        jSONObject.put("BUNDLE", packageName);
        jSONObject.put("SDK_VERSION", BuildConfigApi.getVersionName(context));
        jSONObject.put(b.d, X3.d);
    }
}
