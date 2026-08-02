package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.a;
import com.google.firebase.remoteconfig.internal.b;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.ironsource.B5;
import com.mbridge.msdk.foundation.download.Command;
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
import ru.ok.android.commons.http.Http;
import xsna.f790;
import xsna.ro;
import xsna.sd2;

/* loaded from: classes.dex */
public class ConfigFetchHttpClient {
    public static final Pattern h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j, long j2) {
        this.a = context;
        this.b = str;
        this.c = str2;
        Matcher matcher = h.matcher(str);
        this.d = matcher.matches() ? matcher.group(1) : null;
        this.e = str3;
        this.f = j;
        this.g = j2;
    }

    public static JSONObject c(HttpURLConnection httpURLConnection) throws IOException, JSONException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), B5.O));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read == -1) {
                return new JSONObject(sb.toString());
            }
            sb.append((char) read);
        }
    }

    public static void d(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final JSONObject a(String str, String str2, Map<String, String> map, Long l) throws FirebaseRemoteConfigClientException {
        HashMap hashMap = new HashMap();
        if (str == null) {
            throw new FirebaseRemoteConfigClientException("Fetch failed: Firebase installation id is null.");
        }
        hashMap.put("appInstanceId", str);
        hashMap.put("appInstanceIdToken", str2);
        hashMap.put("appId", this.b);
        Context context = this.a;
        Locale locale = context.getResources().getConfiguration().locale;
        hashMap.put(CommonConstant.KEY_COUNTRY_CODE, locale.getCountry());
        int i = Build.VERSION.SDK_INT;
        hashMap.put("languageCode", locale.toLanguageTag());
        hashMap.put("platformVersion", Integer.toString(i));
        hashMap.put("timeZone", TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                hashMap.put("appVersion", packageInfo.versionName);
                hashMap.put("appBuild", Long.toString(f790.a(packageInfo)));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        hashMap.put("packageName", context.getPackageName());
        hashMap.put("sdkVersion", "21.2.1");
        hashMap.put("analyticsUserProperties", new JSONObject(map));
        if (l != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            hashMap.put("firstOpenTime", simpleDateFormat.format(l));
        }
        return new JSONObject(hashMap);
    }

    public final HttpURLConnection b() throws FirebaseRemoteConfigException {
        try {
            return (HttpURLConnection) new URL("https://firebaseremoteconfig.googleapis.com/v1/projects/" + this.d + "/namespaces/" + this.e + ":fetch").openConnection();
        } catch (IOException e) {
            throw new FirebaseRemoteConfigException(e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009d A[LOOP:0: B:8:0x0097->B:11:0x009d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cf A[Catch: all -> 0x0137, IOException | JSONException -> 0x0139, IOException -> 0x013b, TRY_LEAVE, TryCatch #6 {all -> 0x0137, blocks: (B:13:0x00b3, B:15:0x00cf, B:57:0x013d, B:58:0x0146, B:60:0x0147, B:61:0x014e), top: B:9:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013d A[Catch: all -> 0x0137, IOException | JSONException -> 0x0139, IOException -> 0x013b, TRY_ENTER, TryCatch #6 {all -> 0x0137, blocks: (B:13:0x00b3, B:15:0x00cf, B:57:0x013d, B:58:0x0146, B:60:0x0147, B:61:0x014e), top: B:9:0x009b }] */
    @Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b.a fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l, Date date) throws FirebaseRemoteConfigException {
        String str4;
        int responseCode;
        JSONObject jSONObject;
        JSONArray jSONArray;
        byte[] a;
        boolean z = true;
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.f));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.g));
        httpURLConnection.setRequestProperty("If-None-Match", str3);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.c);
        Context context = this.a;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        JSONObject jSONObject2 = null;
        try {
            a = sd2.a(context, context.getPackageName());
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("FirebaseRemoteConfig", "No such package: " + context.getPackageName(), e);
        }
        if (a == null) {
            Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + context.getPackageName());
            str4 = null;
            httpURLConnection.setRequestProperty("X-Android-Cert", str4);
            httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
            httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestProperty(Http.Header.ACCEPT, "application/json");
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                try {
                    httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                } finally {
                    httpURLConnection.disconnect();
                    try {
                        httpURLConnection.getInputStream().close();
                    } catch (IOException unused) {
                    }
                }
            }
            try {
                d(httpURLConnection, a(str, str2, map, l).toString().getBytes(B5.O));
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    throw new FirebaseRemoteConfigServerException(responseCode, httpURLConnection.getResponseMessage());
                }
                String headerField = httpURLConnection.getHeaderField(Command.HTTP_HEADER_ETAG);
                JSONObject c = c(httpURLConnection);
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused2) {
                }
                try {
                    z = true ^ c.get("state").equals("NO_CHANGE");
                } catch (JSONException unused3) {
                }
                if (!z) {
                    return b.a.a();
                }
                try {
                    a.C0144a d = a.d();
                    d.d(date);
                    try {
                        jSONObject = c.getJSONObject("entries");
                    } catch (JSONException unused4) {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        d.b(jSONObject);
                    }
                    try {
                        jSONArray = c.getJSONArray("experimentDescriptions");
                    } catch (JSONException unused5) {
                        jSONArray = null;
                    }
                    if (jSONArray != null) {
                        d.c(jSONArray);
                    }
                    try {
                        jSONObject2 = c.getJSONObject("personalizationMetadata");
                    } catch (JSONException unused6) {
                    }
                    if (jSONObject2 != null) {
                        d.e(jSONObject2);
                    }
                    return b.a.b(d.a(), headerField);
                } catch (JSONException e2) {
                    throw new FirebaseRemoteConfigClientException("Fetch failed: fetch response could not be parsed.", e2);
                }
            } catch (IOException | JSONException e3) {
                throw new FirebaseRemoteConfigClientException("The client had an error while calling the backend!", e3);
            }
        }
        str4 = ro.b(a);
        httpURLConnection.setRequestProperty("X-Android-Cert", str4);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty(Http.Header.ACCEPT, "application/json");
        while (r11.hasNext()) {
        }
        d(httpURLConnection, a(str, str2, map, l).toString().getBytes(B5.O));
        httpURLConnection.connect();
        responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 200) {
        }
    }
}
