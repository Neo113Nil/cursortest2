package com.logrocket.core;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static e f6419e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f6420a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6421b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6422c;

    /* renamed from: d, reason: collision with root package name */
    public Object f6423d;

    public e() {
        String str;
        String[] strArr;
        Object obj;
        Class<?> cls;
        ba.d dVar = new ba.d("asset-manager");
        Map map = null;
        try {
            Method method = aa.k.f110a;
            cls = Class.forName("com.logrocket.core.LROAssetManager");
            str = (String) cls.getDeclaredField("CACHED_ASSETS_BASE_HREF").get(cls);
        } catch (Throwable th2) {
            th = th2;
            str = null;
            strArr = null;
        }
        try {
            strArr = (String[]) cls.getDeclaredField("CONTENT_HASHES").get(cls);
            try {
                obj = (Map) cls.getDeclaredField("RESOURCE_TO_FONT_FAMILIES").get(cls);
                try {
                    try {
                        map = (Map) cls.getDeclaredField("FILE_NAMES_TO_FONT_FAMILIES").get(cls);
                    } catch (NoSuchFieldException unused) {
                        dVar.j("'FILE_NAMES_TO_FONT_FAMILIES' field is missing in the LROAssetManager. This app may be using an out-of-date version of the LogRocket Gradle plugin");
                        obj = Collections.EMPTY_MAP;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    dVar.f("Failed to initialize AssetManager, no custom asset support.", th);
                    this.f6420a = str;
                    this.f6421b = strArr;
                    this.f6422c = obj;
                    this.f6423d = map;
                }
            } catch (Throwable th4) {
                th = th4;
                obj = null;
            }
        } catch (Throwable th5) {
            th = th5;
            strArr = null;
            obj = strArr;
            dVar.f("Failed to initialize AssetManager, no custom asset support.", th);
            this.f6420a = str;
            this.f6421b = strArr;
            this.f6422c = obj;
            this.f6423d = map;
        }
        this.f6420a = str;
        this.f6421b = strArr;
        this.f6422c = obj;
        this.f6423d = map;
    }

    public static HttpURLConnection a(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.setReadTimeout(5000);
        return httpURLConnection;
    }

    public URL b(String str) {
        return new URL(d9.e.m(new StringBuilder(), (String) this.f6420a, "/reports/", str));
    }

    public boolean c(String str, byte[] bArr) {
        ba.d dVar = (ba.d) this.f6421b;
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                httpURLConnection = a(b(str));
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.flush();
                boolean d10 = d(httpURLConnection);
                try {
                    httpURLConnection.disconnect();
                    return d10;
                } catch (Throwable th2) {
                    dVar.e("Failed to terminate crash report uploader connection", th2);
                    return d10;
                }
            } catch (Throwable th3) {
                if (httpURLConnection != null) {
                    try {
                        httpURLConnection.disconnect();
                    } catch (Throwable th4) {
                        dVar.e("Failed to terminate crash report uploader connection", th4);
                    }
                }
                throw th3;
            }
        } catch (MalformedURLException e7) {
            dVar.e("Failed to create a valid crash report upload URL", e7);
            if (httpURLConnection == null) {
                return false;
            }
            try {
                httpURLConnection.disconnect();
                return false;
            } catch (Throwable th5) {
                dVar.e("Failed to terminate crash report uploader connection", th5);
                return false;
            }
        } catch (IOException e9) {
            dVar.e("Failed to upload crash report", e9);
            if (httpURLConnection == null) {
                return false;
            }
            try {
                httpURLConnection.disconnect();
                return false;
            } catch (Throwable th6) {
                dVar.e("Failed to terminate crash report uploader connection", th6);
                return false;
            }
        }
    }

    public boolean d(HttpURLConnection httpURLConnection) {
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 0) {
            throw new IOException("Invalid server response code.");
        }
        if (responseCode >= 200 && responseCode < 300) {
            return true;
        }
        ((ba.d) this.f6421b).j("Could not upload crash report. Persisting to disk to upload at next startup");
        return false;
    }

    public byte[] e(Throwable th2) {
        f0 f0Var = (f0) this.f6422c;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        g gVar = (g) ((WeakReference) this.f6423d).get();
        if (gVar != null) {
            jSONObject.put("url", gVar.f6462a.c());
        }
        jSONObject.put("type", "crash");
        jSONObject.put("platform", "ANDROID");
        jSONObject.put("age", System.currentTimeMillis());
        jSONObject.put("recordingID", f0Var.f6446b + "/" + f0Var.f6447c);
        jSONObject.put("appID", f0Var.f6445a);
        jSONObject.put("tabID", f0Var.f6448d);
        LogRocketCore maybeGetInstance = LogRocketCore.maybeGetInstance();
        if (maybeGetInstance != null) {
            String str = (String) maybeGetInstance.K.f681c;
            if (str == null) {
                str = f0Var.f6449e;
            }
            jSONObject.put("userID", str);
            jSONObject.put("release", maybeGetInstance.R);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("reason", th2.getMessage());
        jSONObject2.put("stackFrames", new JSONArray(th2.getStackTrace()));
        jSONObject.put("body", jSONObject2);
        jSONArray.put(jSONObject);
        return jSONArray.toString().getBytes(StandardCharsets.UTF_8);
    }

    public boolean f(File file, String str) {
        byte[] bArr = new byte[(int) file.length()];
        FileInputStream fileInputStream = new FileInputStream(file);
        fileInputStream.read(bArr);
        fileInputStream.close();
        return c(str, bArr);
    }

    public e(Context context, LogRocketCore logRocketCore, y9.m mVar) {
        this.f6420a = context;
        this.f6421b = logRocketCore;
        this.f6422c = mVar;
    }

    public e(LogRocketCore logRocketCore, String str, f0 f0Var) {
        this.f6421b = new ba.d("crash-report-uploader");
        this.f6423d = new WeakReference(logRocketCore);
        this.f6420a = str;
        this.f6422c = f0Var;
    }
}
