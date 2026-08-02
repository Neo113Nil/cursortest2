package j9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import io.sentry.android.core.w0;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f18331s = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f18332t = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f18333a;

    /* renamed from: c, reason: collision with root package name */
    public int f18335c;

    /* renamed from: f, reason: collision with root package name */
    public HttpURLConnection f18338f;

    /* renamed from: g, reason: collision with root package name */
    public c f18339g;

    /* renamed from: h, reason: collision with root package name */
    public final ScheduledExecutorService f18340h;

    /* renamed from: i, reason: collision with root package name */
    public final h f18341i;
    public final h8.g j;

    /* renamed from: k, reason: collision with root package name */
    public final b9.e f18342k;

    /* renamed from: l, reason: collision with root package name */
    public final d f18343l;

    /* renamed from: m, reason: collision with root package name */
    public final Context f18344m;
    public final m q;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18334b = false;

    /* renamed from: o, reason: collision with root package name */
    public final Random f18346o = new Random();

    /* renamed from: p, reason: collision with root package name */
    public final q6.a f18347p = q6.a.f22039a;

    /* renamed from: n, reason: collision with root package name */
    public final String f18345n = "firebase";

    /* renamed from: d, reason: collision with root package name */
    public boolean f18336d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18337e = false;

    /* renamed from: r, reason: collision with root package name */
    public final Object f18348r = new Object();

    public k(h8.g gVar, b9.e eVar, h hVar, d dVar, Context context, LinkedHashSet linkedHashSet, m mVar, ScheduledExecutorService scheduledExecutorService) {
        this.f18333a = linkedHashSet;
        this.f18340h = scheduledExecutorService;
        this.f18335c = Math.max(8 - mVar.c().f18349a, 1);
        this.j = gVar;
        this.f18341i = hVar;
        this.f18342k = eVar;
        this.f18343l = dVar;
        this.f18344m = context;
        this.q = mVar;
    }

    public static boolean d(int i5) {
        return i5 == 408 || i5 == 429 || i5 == 502 || i5 == 503 || i5 == 504;
    }

    public static String f(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
            }
        } catch (IOException unused) {
            if (sb2.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb2.toString();
    }

    public final synchronized boolean a() {
        boolean z5;
        if (!this.f18333a.isEmpty() && !this.f18334b && !this.f18336d) {
            z5 = this.f18337e ? false : true;
        }
        return z5;
    }

    public final void b(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.f18338f;
        if (httpURLConnection != null && !this.f18337e) {
            httpURLConnection.disconnect();
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e7) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e7);
            }
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException e9) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e9);
            }
        }
    }

    public final String c(String str) {
        h8.g gVar = this.j;
        gVar.a();
        Matcher matcher = f18332t.matcher(gVar.f10403c.f10416b);
        return "https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/" + (matcher.matches() ? matcher.group(1) : null) + "/namespaces/" + str + ":streamFetchInvalidations";
    }

    public final synchronized void e(long j) {
        try {
            if (a()) {
                int i5 = this.f18335c;
                if (i5 > 0) {
                    this.f18335c = i5 - 1;
                    this.f18340h.schedule(new androidx.core.widget.b(18, this), j, TimeUnit.MILLISECONDS);
                } else if (!this.f18337e) {
                    new i9.c("Unable to connect to the server. Check your connection and try again.");
                    g();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void g() {
        Iterator it = this.f18333a.iterator();
        while (it.hasNext()) {
            ((j) it.next()).a();
        }
    }

    public final synchronized void h() {
        this.f18335c = 8;
    }

    public final synchronized void i() {
        this.f18347p.getClass();
        e(Math.max(0L, this.q.c().f18350b.getTime() - new Date(System.currentTimeMillis()).getTime()));
    }

    public final synchronized void j(boolean z5) {
        this.f18334b = z5;
    }

    public final void k(boolean z5) {
        HttpURLConnection httpURLConnection;
        synchronized (this.f18348r) {
            try {
                this.f18337e = z5;
                c cVar = this.f18339g;
                if (cVar != null) {
                    cVar.j = z5;
                }
                if (Build.VERSION.SDK_INT >= 26 && z5 && (httpURLConnection = this.f18338f) != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(HttpURLConnection httpURLConnection, String str, String str2) {
        String str3;
        byte[] d10;
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        h8.g gVar = this.j;
        gVar.a();
        h8.i iVar = gVar.f10403c;
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", iVar.f10415a);
        Context context = this.f18344m;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        try {
            d10 = q6.b.d(context, context.getPackageName());
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("FirebaseRemoteConfig", "No such package: " + context.getPackageName());
        }
        if (d10 != null) {
            str3 = q6.b.a(d10);
            httpURLConnection.setRequestProperty("X-Android-Cert", str3);
            httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
            httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestProperty("Accept", "application/json");
            HashMap hashMap = new HashMap();
            gVar.a();
            Matcher matcher = f18332t.matcher(iVar.f10416b);
            hashMap.put("project", matcher.matches() ? matcher.group(1) : null);
            hashMap.put("namespace", this.f18345n);
            hashMap.put("lastKnownVersionNumber", Long.toString(this.f18341i.f18322g.f18353a.getLong("last_template_version", 0L)));
            gVar.a();
            hashMap.put("appId", iVar.f10416b);
            hashMap.put("sdkVersion", "23.0.1");
            hashMap.put("appInstanceId", str);
            byte[] bytes = new JSONObject(hashMap).toString().getBytes("utf-8");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            bufferedOutputStream.write(bytes);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
        }
        w0.d("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + context.getPackageName());
        str3 = null;
        httpURLConnection.setRequestProperty("X-Android-Cert", str3);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        HashMap hashMap2 = new HashMap();
        gVar.a();
        Matcher matcher2 = f18332t.matcher(iVar.f10416b);
        hashMap2.put("project", matcher2.matches() ? matcher2.group(1) : null);
        hashMap2.put("namespace", this.f18345n);
        hashMap2.put("lastKnownVersionNumber", Long.toString(this.f18341i.f18322g.f18353a.getLong("last_template_version", 0L)));
        gVar.a();
        hashMap2.put("appId", iVar.f10416b);
        hashMap2.put("sdkVersion", "23.0.1");
        hashMap2.put("appInstanceId", str);
        byte[] bytes2 = new JSONObject(hashMap2).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream2.write(bytes2);
        bufferedOutputStream2.flush();
        bufferedOutputStream2.close();
    }

    public final synchronized c m(HttpURLConnection httpURLConnection) {
        return new c(httpURLConnection, this.f18341i, this.f18343l, this.f18333a, new j(this), this.f18340h, this.q);
    }

    public final void n(Date date) {
        m mVar = this.q;
        int i5 = mVar.c().f18349a + 1;
        mVar.g(i5, new Date(date.getTime() + (TimeUnit.MINUTES.toMillis(f18331s[(i5 < 8 ? i5 : 8) - 1]) / 2) + this.f18346o.nextInt((int) r2)));
    }
}
