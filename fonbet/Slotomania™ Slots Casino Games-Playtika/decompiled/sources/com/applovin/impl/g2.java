package com.applovin.impl;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.applovin.impl.f2;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.exoplayer2.C;
import com.ironsource.M6;
import com.ironsource.X3;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import io.sentry.protocol.App;
import io.sentry.protocol.Device;
import io.sentry.protocol.Geo;
import java.io.OutputStream;
import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class g2 {
    private static volatile ExecutorService g;
    protected final com.applovin.impl.sdk.l a;
    protected final com.applovin.impl.sdk.p b;
    private final f2.b c;
    private final Map d = Collections.synchronizedMap(new HashMap());
    private final Set e = Collections.synchronizedSet(new HashSet());
    private static final int f = (int) TimeUnit.SECONDS.toMillis(30);
    private static final Object h = new Object();

    class a implements ThreadFactory {

        /* renamed from: com.applovin.impl.g2$a$a, reason: collision with other inner class name */
        class C0099a implements Thread.UncaughtExceptionHandler {
            C0099a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                g2.this.a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    g2.this.a.Q().a("HealthEventsReporter", "Caught unhandled exception", th);
                }
            }
        }

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:health_events_reporter");
            thread.setDaemon(true);
            thread.setPriority(((Integer) g2.this.a.a(z4.S)).intValue());
            thread.setUncaughtExceptionHandler(new C0099a());
            return thread;
        }
    }

    public g2(com.applovin.impl.sdk.l lVar, f2.b bVar) {
        this.a = lVar;
        this.b = lVar.Q();
        this.c = bVar;
        a();
    }

    private void a() {
        if (g != null) {
            return;
        }
        synchronized (h) {
            if (g != null) {
                return;
            }
            g = Executors.newFixedThreadPool(1, new a());
        }
    }

    private void c(f2 f2Var, List list) {
        HttpURLConnection httpURLConnection;
        Throwable th;
        if (f2Var.a() == f2.b.AD || f2Var.a() == f2.b.MEDIATED_AD || f2Var.a() == f2.b.USER_SESSION || !q7.a(((Integer) this.a.a(z4.B)).intValue())) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            try {
                httpURLConnection = (HttpURLConnection) a(f2Var, map).openConnection();
                try {
                    int i = f;
                    httpURLConnection.setConnectTimeout(i);
                    httpURLConnection.setReadTimeout(i);
                    httpURLConnection.setDefaultUseCaches(false);
                    httpURLConnection.setAllowUserInteraction(false);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("AppLovin-Event-Type", f2Var.b());
                    int httpUrlConnectionGetResponseCode = AppLovinNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                    if (com.applovin.impl.sdk.p.a()) {
                        this.b.a("HealthEventsReporter", f2Var.b() + " reported with code " + httpUrlConnectionGetResponseCode + " and extra parameters " + map);
                    }
                    this.d.put(f2Var, Long.valueOf(System.currentTimeMillis()));
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        if (com.applovin.impl.sdk.p.a()) {
                            this.b.d("HealthEventsReporter", "Failed to report " + f2Var.b() + " with extra parameters " + map, th);
                        }
                        q7.a(httpURLConnection, this.a);
                    } finally {
                        q7.a(httpURLConnection, this.a);
                    }
                }
            } catch (Throwable th3) {
                httpURLConnection = null;
                th = th3;
            }
        }
    }

    public void d(f2 f2Var, Map map) {
        a(f2Var, map, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(String str, f2 f2Var, JSONObject jSONObject) {
        HttpURLConnection httpURLConnection = null;
        try {
            URL url = new URL(str);
            byte[] bytes = jSONObject.toString().getBytes(C.UTF8_NAME);
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
            try {
                int i = f;
                httpURLConnection2.setConnectTimeout(i);
                httpURLConnection2.setReadTimeout(i);
                httpURLConnection2.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                httpURLConnection2.setDefaultUseCaches(false);
                httpURLConnection2.setAllowUserInteraction(false);
                httpURLConnection2.setUseCaches(false);
                httpURLConnection2.setInstanceFollowRedirects(true);
                httpURLConnection2.setDoOutput(true);
                httpURLConnection2.setFixedLengthStreamingMode(bytes.length);
                httpURLConnection2.setRequestMethod("POST");
                httpURLConnection2.setRequestProperty("AppLovin-Event-Type", f2Var.b());
                OutputStream urlConnectionGetOutputStream = AppLovinNetworkBridge.urlConnectionGetOutputStream(httpURLConnection2);
                urlConnectionGetOutputStream.write(bytes);
                urlConnectionGetOutputStream.close();
                int httpUrlConnectionGetResponseCode = AppLovinNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection2);
                if (com.applovin.impl.sdk.p.a()) {
                    this.b.a("HealthEventsReporter", f2Var.b() + " reported with code " + httpUrlConnectionGetResponseCode);
                }
                this.d.put(f2Var, Long.valueOf(System.currentTimeMillis()));
                q7.a(httpURLConnection2, this.a);
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                try {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.b.d("HealthEventsReporter", "Failed to report " + f2Var.b(), th);
                    }
                } finally {
                    q7.a(httpURLConnection, this.a);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void d(final f2 f2Var, List list) {
        final String str = (String) this.a.a(z4.C);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        double a2 = f2Var.a(this.a);
        if (q7.a(a2)) {
            if (((Boolean) this.a.a(z4.I)).booleanValue()) {
                a(str, f2Var, a(f2Var, a2, list));
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final JSONObject a3 = a(f2Var, a2, Collections.singletonList((Map) it.next()));
                g.execute(new Runnable() { // from class: com.applovin.impl.g2$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        g2.this.a(str, f2Var, a3);
                    }
                });
            }
        }
    }

    public void a(f2 f2Var, String str) {
        a(f2Var, str, new HashMap());
    }

    public void a(f2 f2Var, String str, Map map) {
        map.put("source", str);
        d(f2Var, map);
    }

    public void a(f2 f2Var, String str, Map map, String str2) {
        if (!StringUtils.isValidString(str2) || this.e.add(str2)) {
            map.put("source", str);
            a(f2Var, str, map);
        }
    }

    public void a(f2 f2Var, Map map, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        a(f2Var, arrayList, j);
    }

    private Map b(f2 f2Var, Map map) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", f2Var.b());
        if (f2Var == f2.U0 || f2Var == f2.T0 || f2Var == f2.k1 || f2Var == f2.i1) {
            if (((Boolean) this.a.a(z4.t4)).booleanValue()) {
                CollectionUtils.putStringIfValid("wvvc", String.valueOf(o8.d()), hashMap);
                CollectionUtils.putStringIfValid("wvv", o8.c(), hashMap);
                CollectionUtils.putStringIfValid("wvpn", o8.b(), hashMap);
            }
            CollectionUtils.putStringIfValid("oglv", this.a.B().K(), hashMap);
        }
        Map N = this.a.B().N();
        hashMap.put("platform", String.valueOf(N.get("platform")));
        hashMap.put(Geo.JsonKeys.COUNTRY_CODE, String.valueOf(N.get(Geo.JsonKeys.COUNTRY_CODE)));
        hashMap.put("cc", this.a.w().getCountryCode());
        hashMap.put("applovin_random_token", this.a.j0());
        hashMap.put("compass_random_token", this.a.v());
        hashMap.put("model", Build.MODEL);
        hashMap.put(Device.JsonKeys.BRAND, Build.MANUFACTURER);
        hashMap.put("brand_name", Build.BRAND);
        hashMap.put("hardware", Build.HARDWARE);
        hashMap.put("revision", Build.DEVICE);
        hashMap.put("os", Build.VERSION.RELEASE);
        hashMap.put("api_level", String.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("sdk_version", String.valueOf(AppLovinSdk.VERSION));
        CollectionUtils.putStringIfValid("ad_review_sdk_version", j.b(), hashMap);
        hashMap.put(M6.u, (String) this.a.a(z4.t));
        b(hashMap);
        a(hashMap);
        if (map != null) {
            hashMap.putAll(c(f2Var, map));
        }
        return hashMap;
    }

    private Map c(f2 f2Var, Map map) {
        HashMap hashMap = new HashMap(map);
        if (f2Var == f2.Y0) {
            hashMap.remove("details");
        }
        return hashMap;
    }

    public void a(final f2 f2Var, final List list, long j) {
        if (a(f2Var, j)) {
            return;
        }
        try {
            if (q7.i()) {
                g.execute(new Runnable() { // from class: com.applovin.impl.g2$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        g2.this.b(f2Var, list);
                    }
                });
            } else {
                b(f2Var, list);
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.p.a()) {
                this.b.d("HealthEventsReporter", "Failed to report " + f2Var.b() + " with extra parameters collection " + list, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(f2 f2Var, List list) {
        if (AppLovinSdkUtils.isEmulator()) {
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.b.a("HealthEventsReporter", "Reporting " + f2Var.b() + " with extra parameters collection " + list);
        }
        if (this.c != f2Var.a()) {
            m1.a("Health event " + f2Var.b() + " category: " + f2Var.a() + " does not match the reporter category: " + this.c, new Object[0]);
        }
        c(f2Var, list);
        d(f2Var, list);
    }

    private URL a(f2 f2Var, Map map) {
        StringBuilder sb = new StringBuilder("https://ms.applovin.com/1.0/sdk/error?");
        Iterator it = b(f2Var, map).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String encode = URLEncoder.encode((String) entry.getKey(), C.UTF8_NAME);
            sb.append(encode).append("=").append(URLEncoder.encode((String) entry.getValue(), C.UTF8_NAME));
            if (it.hasNext()) {
                sb.append(X3.j.c);
            }
        }
        return new URL(sb.toString());
    }

    private void b(Map map) {
        PackageInfo a2 = q7.a(com.applovin.impl.sdk.l.p(), 0);
        map.put("package_name", com.applovin.impl.sdk.l.p().getPackageName());
        map.put(App.JsonKeys.APP_VERSION, a2 != null ? a2.versionName : "");
        map.put("app_version_code", String.valueOf(a2 != null ? a2.versionCode : 0));
    }

    private JSONObject a(f2 f2Var, double d, List list) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putLong(jSONObject, "ts_ms", System.currentTimeMillis());
        if (f2Var == f2.U0 || f2Var == f2.T0 || f2Var == f2.k1 || f2Var == f2.i1) {
            if (((Boolean) this.a.a(z4.t4)).booleanValue()) {
                JsonUtils.putStringIfValid(jSONObject, "wvvc", String.valueOf(o8.d()));
                JsonUtils.putStringIfValid(jSONObject, "wvv", o8.c());
                JsonUtils.putStringIfValid(jSONObject, "wvpn", o8.b());
            }
            JsonUtils.putStringIfValid(jSONObject, "oglv", this.a.B().K());
        }
        JSONObject jSONObject2 = new JSONObject();
        Map N = this.a.B().N();
        JsonUtils.putObject(jSONObject2, "platform", N.get("platform"));
        JsonUtils.putObject(jSONObject2, "os", N.get("os"));
        JsonUtils.putObject(jSONObject2, "api_level", String.valueOf(N.get("api_level")));
        JsonUtils.putObject(jSONObject2, Device.JsonKeys.BRAND, N.get(Device.JsonKeys.BRAND));
        JsonUtils.putObject(jSONObject2, "model", N.get("model"));
        JsonUtils.putObject(jSONObject2, "brand_name", N.get("brand_name"));
        JsonUtils.putObject(jSONObject2, "hardware", N.get("hardware"));
        JsonUtils.putObject(jSONObject2, "revision", N.get("revision"));
        JsonUtils.putObject(jSONObject2, Geo.JsonKeys.COUNTRY_CODE, N.get(Geo.JsonKeys.COUNTRY_CODE));
        JsonUtils.putObject(jSONObject2, "cc", this.a.w().getCountryCode());
        JsonUtils.putObject(jSONObject2, "applovin_random_token", this.a.j0());
        JsonUtils.putObject(jSONObject2, "compass_random_token", this.a.v());
        JsonUtils.putObject(jSONObject2, "art", StringUtils.emptyIfNull(this.a.s()));
        JsonUtils.putObject(jSONObject2, "ad_review_sdk_version", StringUtils.emptyIfNull(j.b()));
        Map G = this.a.B().G();
        JsonUtils.putObject(jSONObject2, "sdk_version", G.get("sdk_version"));
        JsonUtils.putObject(jSONObject2, "plugin_version", this.a.a(z4.R3));
        JsonUtils.putObject(jSONObject2, App.JsonKeys.APP_VERSION, G.get(App.JsonKeys.APP_VERSION));
        JsonUtils.putObject(jSONObject2, "package_name", G.get("package_name"));
        JsonUtils.putObject(jSONObject2, "app_version_code", String.valueOf(G.get("app_version_code")));
        JsonUtils.putObject(jSONObject2, "first_install", Boolean.toString(Boolean.TRUE.equals((Boolean) G.get("first_install_v2"))));
        JsonUtils.putObject(jSONObject2, M6.u, this.a.a(z4.t));
        JsonUtils.putObject(jSONObject2, "mediation_provider", this.a.X());
        SessionTracker o0 = this.a.o0();
        JsonUtils.putObject(jSONObject2, "app_state", o0.getCurrentApplicationState().b());
        JsonUtils.putObject(jSONObject2, "app_state_duration_ms", Long.valueOf(o0.getCurrentApplicationStateDurationMillis()));
        JsonUtils.putObject(jSONObject2, SDKAnalyticsEvents.PARAMETER_SESSION_ID, o0.getSessionId());
        JsonUtils.putObject(jSONObject2, "session_duration_ms", Long.valueOf(System.currentTimeMillis() - com.applovin.impl.sdk.l.o()));
        JsonUtils.putObject(jSONObject, "shared_fields", jSONObject2);
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            JSONObject jSONObject3 = new JSONObject();
            JsonUtils.putDouble(jSONObject3, "ts_ms", System.currentTimeMillis());
            JsonUtils.putString(jSONObject3, "type", f2Var.b());
            JsonUtils.putDouble(jSONObject3, "weight", d);
            JsonUtils.putString(jSONObject3, "level", "DEBUG");
            a(map);
            JsonUtils.putAll(jSONObject3, (Map<String, ?>) map);
            jSONArray.put(jSONObject3);
        }
        JsonUtils.putObject(jSONObject, "events", jSONArray);
        return jSONObject;
    }

    private void a(Map map) {
        if (map == null) {
            return;
        }
        Object a2 = this.a.J().a();
        Long c = this.a.J().c();
        boolean z = a2 instanceof com.applovin.impl.sdk.ad.b;
        String str = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c;
        if (z) {
            map.put("fs_ad_network", "AppLovin");
            map.put("fs_ad_creative_id", Long.toString(((com.applovin.impl.sdk.ad.b) a2).getAdIdNumber()));
            if (c != null) {
                str = c.toString();
            }
            map.put("fs_ad_memory_usage", str);
            return;
        }
        if (a2 instanceof a3) {
            a3 a3Var = (a3) a2;
            map.put("fs_ad_network", a3Var.getNetworkName());
            map.put("fs_ad_creative_id", a3Var.getCreativeId());
            if (c != null) {
                str = c.toString();
            }
            map.put("fs_ad_memory_usage", str);
            return;
        }
        map.put("fs_ad_network", "None");
        map.put("fs_ad_creative_id", "None");
        map.put("fs_ad_memory_usage", "None");
    }

    private boolean a(f2 f2Var, long j) {
        Long l = (Long) this.d.get(f2Var);
        return System.currentTimeMillis() - (l != null ? l.longValue() : -1L) < j;
    }
}
