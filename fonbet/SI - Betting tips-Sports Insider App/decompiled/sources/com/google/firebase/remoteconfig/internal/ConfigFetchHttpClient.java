package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.core.view.k;
import i9.c;
import i9.d;
import i9.f;
import io.sentry.android.core.w0;
import j$.util.DesugarTimeZone;
import j9.e;
import j9.g;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q6.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ConfigFetchHttpClient {

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f6195h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a, reason: collision with root package name */
    public final Context f6196a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6197b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6198c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6199d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6200e;

    /* renamed from: f, reason: collision with root package name */
    public final long f6201f;

    /* renamed from: g, reason: collision with root package name */
    public final long f6202g;

    public ConfigFetchHttpClient(Context context, String str, String str2, long j, long j6) {
        this.f6196a = context;
        this.f6197b = str;
        this.f6198c = str2;
        Matcher matcher = f6195h.matcher(str);
        this.f6199d = matcher.matches() ? matcher.group(1) : null;
        this.f6200e = "firebase";
        this.f6201f = j;
        this.f6202g = j6;
    }

    public static JSONObject c(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "utf-8"));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read == -1) {
                return new JSONObject(sb2.toString());
            }
            sb2.append((char) read);
        }
    }

    public static void d(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final JSONObject a(String str, String str2, Map map, Long l6, Map map2) {
        HashMap hashMap = new HashMap();
        if (str == null) {
            throw new c("Fetch failed: Firebase installation id is null.");
        }
        hashMap.put("appInstanceId", str);
        hashMap.put("appInstanceIdToken", str2);
        hashMap.put("appId", this.f6197b);
        Context context = this.f6196a;
        Locale locale = context.getResources().getConfiguration().locale;
        hashMap.put("countryCode", locale.getCountry());
        int i5 = Build.VERSION.SDK_INT;
        hashMap.put("languageCode", locale.toLanguageTag());
        hashMap.put("platformVersion", Integer.toString(i5));
        hashMap.put("timeZone", TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                hashMap.put("appVersion", packageInfo.versionName);
                hashMap.put("appBuild", Long.toString(i5 >= 28 ? k.e(packageInfo) : packageInfo.versionCode));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        hashMap.put("packageName", context.getPackageName());
        hashMap.put("sdkVersion", "23.0.1");
        hashMap.put("analyticsUserProperties", new JSONObject(map));
        if (!map2.isEmpty()) {
            hashMap.put("customSignals", new JSONObject(map2));
            Log.d("FirebaseRemoteConfig", "Keys of custom signals during fetch: " + map2.keySet());
        }
        if (l6 != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            hashMap.put("firstOpenTime", simpleDateFormat.format(l6));
        }
        return new JSONObject(hashMap);
    }

    public final HttpURLConnection b() {
        try {
            return (HttpURLConnection) new URL("https://firebaseremoteconfig.googleapis.com/v1/projects/" + this.f6199d + "/namespaces/" + this.f6200e + ":fetch").openConnection();
        } catch (IOException e7) {
            throw new d(e7.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x009d A[LOOP:0: B:8:0x0097->B:10:0x009d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d7 A[Catch: all -> 0x0189, JSONException -> 0x018b, IOException | JSONException -> 0x018d, TRY_LEAVE, TryCatch #1 {all -> 0x0189, blocks: (B:14:0x00bb, B:16:0x00d7, B:84:0x018f, B:85:0x0198, B:94:0x0199, B:95:0x01a0), top: B:13:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018f A[Catch: all -> 0x0189, JSONException -> 0x018b, IOException | JSONException -> 0x018d, TRY_ENTER, TryCatch #1 {all -> 0x0189, blocks: (B:14:0x00bb, B:16:0x00d7, B:84:0x018f, B:85:0x0198, B:94:0x0199, B:95:0x01a0), top: B:13:0x00bb }] */
    @Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l6, Date date, Map<String, String> map3) throws d {
        String str4;
        int responseCode;
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        JSONArray jSONArray2;
        boolean z5;
        byte[] d10;
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.f6201f));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.f6202g));
        httpURLConnection.setRequestProperty("If-None-Match", str3);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f6198c);
        Context context = this.f6196a;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        try {
            d10 = b.d(context, context.getPackageName());
        } catch (PackageManager.NameNotFoundException e7) {
            w0.e("FirebaseRemoteConfig", "No such package: " + context.getPackageName(), e7);
        }
        if (d10 == null) {
            w0.d("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + context.getPackageName());
            str4 = null;
            httpURLConnection.setRequestProperty("X-Android-Cert", str4);
            httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
            httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestProperty("Accept", "application/json");
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
            try {
                try {
                    d(httpURLConnection, a(str, str2, map, l6, map3).toString().getBytes("utf-8"));
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        throw new f(responseCode, httpURLConnection.getResponseMessage());
                    }
                    String headerField = httpURLConnection.getHeaderField("ETag");
                    JSONObject c2 = c(httpURLConnection);
                    try {
                        httpURLConnection.getInputStream().close();
                    } catch (IOException unused) {
                    }
                    try {
                        io.sentry.instrumentation.file.b c8 = e.c();
                        c8.f16496c = date;
                        try {
                            jSONObject = c2.getJSONObject("entries");
                        } catch (JSONException unused2) {
                            jSONObject = null;
                        }
                        if (jSONObject != null) {
                            try {
                                c8.f16495b = new JSONObject(jSONObject.toString());
                            } catch (JSONException unused3) {
                            }
                        }
                        try {
                            jSONArray = c2.getJSONArray("experimentDescriptions");
                        } catch (JSONException unused4) {
                            jSONArray = null;
                        }
                        if (jSONArray != null) {
                            try {
                                c8.f16497d = new JSONArray(jSONArray.toString());
                            } catch (JSONException unused5) {
                            }
                        }
                        try {
                            jSONObject2 = c2.getJSONObject("personalizationMetadata");
                        } catch (JSONException unused6) {
                            jSONObject2 = null;
                        }
                        if (jSONObject2 != null) {
                            try {
                                c8.f16498e = new JSONObject(jSONObject2.toString());
                            } catch (JSONException unused7) {
                            }
                        }
                        String string = c2.has("templateVersion") ? c2.getString("templateVersion") : null;
                        if (string != null) {
                            c8.f16494a = Long.parseLong(string);
                        }
                        try {
                            jSONArray2 = c2.getJSONArray("rolloutMetadata");
                        } catch (JSONException unused8) {
                            jSONArray2 = null;
                        }
                        if (jSONArray2 != null) {
                            try {
                                c8.f16499f = new JSONArray(jSONArray2.toString());
                            } catch (JSONException unused9) {
                            }
                        }
                        e a7 = c8.a();
                        try {
                            z5 = !c2.get("state").equals("NO_CHANGE");
                        } catch (JSONException unused10) {
                            z5 = true;
                        }
                        return !z5 ? new g(1, a7, null) : new g(0, a7, headerField);
                    } catch (JSONException e9) {
                        throw new c("Fetch failed: fetch response could not be parsed.", e9);
                    }
                } finally {
                    httpURLConnection.disconnect();
                    try {
                        httpURLConnection.getInputStream().close();
                    } catch (IOException unused11) {
                    }
                }
            } catch (IOException | JSONException e10) {
                throw new c("The client had an error while calling the backend!", e10);
            }
        }
        str4 = b.a(d10);
        httpURLConnection.setRequestProperty("X-Android-Cert", str4);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        while (r0.hasNext()) {
        }
        d(httpURLConnection, a(str, str2, map, l6, map3).toString().getBytes("utf-8"));
        httpURLConnection.connect();
        responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 200) {
        }
    }
}
