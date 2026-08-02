package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.ironsource.C4427z5;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.download.Command;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.c90;
import defpackage.ei3;
import defpackage.f58;
import defpackage.fi3;
import defpackage.g58;
import defpackage.ii3;
import defpackage.l58;
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
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
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

    public static JSONObject c(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), C4427z5.O));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read == -1) {
                return new JSONObject(sb.toString());
            }
            sb.append((char) read);
        }
    }

    public static void d(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final JSONObject a(String str, String str2, Map map, Long l, Map map2) {
        HashMap hashMap = new HashMap();
        if (str == null) {
            throw new f58("Fetch failed: Firebase installation id is null.");
        }
        hashMap.put("appInstanceId", str);
        hashMap.put("appInstanceIdToken", str2);
        hashMap.put("appId", this.b);
        Context context = this.a;
        Locale locale = context.getResources().getConfiguration().locale;
        hashMap.put("countryCode", locale.getCountry());
        hashMap.put("languageCode", locale.toLanguageTag());
        int i = Build.VERSION.SDK_INT;
        hashMap.put("platformVersion", Integer.toString(i));
        hashMap.put("timeZone", TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                hashMap.put(U3.j.W, packageInfo.versionName);
                hashMap.put("appBuild", Long.toString(i >= 28 ? c90.q(packageInfo) : packageInfo.versionCode));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        hashMap.put(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, context.getPackageName());
        hashMap.put("sdkVersion", "23.1.0");
        hashMap.put("analyticsUserProperties", new JSONObject(map));
        if (!map2.isEmpty()) {
            hashMap.put("customSignals", new JSONObject(map2));
            Objects.toString(map2.keySet());
        }
        if (l != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            hashMap.put("firstOpenTime", simpleDateFormat.format(l));
        }
        return new JSONObject(hashMap);
    }

    public final HttpURLConnection b() {
        try {
            return (HttpURLConnection) new URL("https://firebaseremoteconfig.googleapis.com/v1/projects/" + this.d + "/namespaces/" + this.e + ":fetch").openConnection();
        } catch (IOException e) {
            throw new g58(e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0075 A[LOOP:0: B:8:0x006f->B:10:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af A[Catch: all -> 0x0161, IOException | JSONException -> 0x0164, IOException -> 0x0167, TRY_LEAVE, TryCatch #1 {all -> 0x0161, blocks: (B:14:0x0093, B:16:0x00af, B:83:0x0169, B:84:0x0172, B:96:0x0173, B:97:0x017a), top: B:13:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0169 A[Catch: all -> 0x0161, IOException | JSONException -> 0x0164, IOException -> 0x0167, TRY_ENTER, TryCatch #1 {all -> 0x0161, blocks: (B:14:0x0093, B:16:0x00af, B:83:0x0169, B:84:0x0172, B:96:0x0173, B:97:0x017a), top: B:13:0x0093 }] */
    @Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ii3 fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l, Date date, Map<String, String> map3) throws g58 {
        String str4;
        int responseCode;
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        JSONArray jSONArray2;
        boolean z;
        byte[] a;
        httpURLConnection.setDoOutput(true);
        long j = this.f;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(j));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.g));
        httpURLConnection.setRequestProperty("If-None-Match", str3);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.c);
        Context context = this.a;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        try {
            a = AndroidUtilsLight.a(context, context.getPackageName());
        } catch (PackageManager.NameNotFoundException unused) {
            context.getPackageName();
        }
        if (a == null) {
            context.getPackageName();
            str4 = null;
            httpURLConnection.setRequestProperty("X-Android-Cert", str4);
            httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
            httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
            httpURLConnection.setRequestProperty("Content-Type", C4427z5.M);
            httpURLConnection.setRequestProperty("Accept", C4427z5.M);
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
            try {
                try {
                    d(httpURLConnection, a(str, str2, map, l, map3).toString().getBytes(C4427z5.O));
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        throw new l58(responseCode, httpURLConnection.getResponseMessage());
                    }
                    String headerField = httpURLConnection.getHeaderField(Command.HTTP_HEADER_ETAG);
                    JSONObject c = c(httpURLConnection);
                    httpURLConnection.disconnect();
                    try {
                        httpURLConnection.getInputStream().close();
                    } catch (IOException unused2) {
                    }
                    try {
                        ei3 d = fi3.d();
                        d.d = date;
                        try {
                            jSONObject = c.getJSONObject("entries");
                        } catch (JSONException unused3) {
                            jSONObject = null;
                        }
                        if (jSONObject != null) {
                            try {
                                d.b = new JSONObject(jSONObject.toString());
                            } catch (JSONException unused4) {
                            }
                        }
                        try {
                            jSONArray = c.getJSONArray("experimentDescriptions");
                        } catch (JSONException unused5) {
                            jSONArray = null;
                        }
                        if (jSONArray != null) {
                            try {
                                d.e = new JSONArray(jSONArray.toString());
                            } catch (JSONException unused6) {
                            }
                        }
                        try {
                            jSONObject2 = c.getJSONObject("personalizationMetadata");
                        } catch (JSONException unused7) {
                            jSONObject2 = null;
                        }
                        if (jSONObject2 != null) {
                            try {
                                d.c = new JSONObject(jSONObject2.toString());
                            } catch (JSONException unused8) {
                            }
                        }
                        String string = c.has("templateVersion") ? c.getString("templateVersion") : null;
                        if (string != null) {
                            d.a = Long.parseLong(string);
                        }
                        try {
                            jSONArray2 = c.getJSONArray("rolloutMetadata");
                        } catch (JSONException unused9) {
                            jSONArray2 = null;
                        }
                        if (jSONArray2 != null) {
                            try {
                                d.f = new JSONArray(jSONArray2.toString());
                            } catch (JSONException unused10) {
                            }
                        }
                        fi3 a2 = d.a();
                        try {
                            z = !c.get("state").equals("NO_CHANGE");
                        } catch (JSONException unused11) {
                            z = true;
                        }
                        return !z ? new ii3(1, a2, null) : new ii3(0, a2, headerField);
                    } catch (JSONException e) {
                        throw new f58("Fetch failed: fetch response could not be parsed.", e);
                    }
                } finally {
                }
            } catch (IOException | JSONException e2) {
                throw new f58("The client had an error while calling the backend!", e2);
            }
        } else {
            str4 = Hex.b(a);
            httpURLConnection.setRequestProperty("X-Android-Cert", str4);
            httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
            httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
            httpURLConnection.setRequestProperty("Content-Type", C4427z5.M);
            httpURLConnection.setRequestProperty("Accept", C4427z5.M);
            while (r14.hasNext()) {
            }
            d(httpURLConnection, a(str, str2, map, l, map3).toString().getBytes(C4427z5.O));
            httpURLConnection.connect();
            responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
            }
        }
    }
}
