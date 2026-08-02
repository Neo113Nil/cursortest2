package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.ironsource.C4094gc;
import com.ironsource.C4427z5;
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

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ni3 {
    public static final int[] r = {2, 4, 8, 16, 32, 64, 128, NotificationCompat.FLAG_LOCAL_ONLY};
    public static final Pattern s = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    public final LinkedHashSet a;
    public int c;
    public HttpURLConnection f;
    public final ScheduledExecutorService g;
    public final ji3 h;
    public final r38 i;
    public final l48 j;
    public final di3 k;
    public final Context l;
    public final String m;
    public final qi3 p;
    public boolean b = false;
    public final Random n = new Random();
    public final DefaultClock o = DefaultClock.a;
    public boolean d = false;
    public boolean e = false;
    public final Object q = new Object();

    public ni3(r38 r38Var, l48 l48Var, ji3 ji3Var, di3 di3Var, Context context, String str, LinkedHashSet linkedHashSet, qi3 qi3Var, ScheduledExecutorService scheduledExecutorService) {
        this.a = linkedHashSet;
        this.g = scheduledExecutorService;
        this.c = Math.max(8 - qi3Var.c().a, 1);
        this.i = r38Var;
        this.h = ji3Var;
        this.j = l48Var;
        this.k = di3Var;
        this.l = context;
        this.m = str;
        this.p = qi3Var;
    }

    public static boolean d(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    public static String f(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    public final synchronized boolean a() {
        boolean z;
        if (!this.a.isEmpty() && !this.b && !this.d) {
            z = this.e ? false : true;
        }
        return z;
    }

    public final void b(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.f;
        if (httpURLConnection != null && !this.e) {
            httpURLConnection.disconnect();
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException unused2) {
            }
        }
    }

    public final String c(String str) {
        r38 r38Var = this.i;
        r38Var.a();
        Matcher matcher = s.matcher(r38Var.c.b);
        return bf3.k("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", matcher.matches() ? matcher.group(1) : null, "/namespaces/", str, ":streamFetchInvalidations");
    }

    public final synchronized void e(long j) {
        try {
            if (a()) {
                int i = this.c;
                if (i > 0) {
                    this.c = i - 1;
                    this.g.schedule(new b8(this, 9), j, TimeUnit.MILLISECONDS);
                } else if (!this.e) {
                    g(new f58("Unable to connect to the server. Check your connection and try again."));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g(g58 g58Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((mi3) it.next()).a(g58Var);
        }
    }

    public final synchronized void h() {
        this.o.getClass();
        e(Math.max(0L, this.p.c().b.getTime() - new Date(System.currentTimeMillis()).getTime()));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(HttpURLConnection httpURLConnection, String str, String str2) {
        String str3;
        byte[] a;
        httpURLConnection.setRequestMethod(C4094gc.b);
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        r38 r38Var = this.i;
        r38Var.a();
        s48 s48Var = r38Var.c;
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", s48Var.a);
        Context context = this.l;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        try {
            a = AndroidUtilsLight.a(context, context.getPackageName());
        } catch (PackageManager.NameNotFoundException unused) {
            context.getPackageName();
        }
        if (a != null) {
            str3 = Hex.b(a);
            httpURLConnection.setRequestProperty("X-Android-Cert", str3);
            httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
            httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
            httpURLConnection.setRequestProperty("Content-Type", C4427z5.M);
            httpURLConnection.setRequestProperty("Accept", C4427z5.M);
            HashMap hashMap = new HashMap();
            r38Var.a();
            Matcher matcher = s.matcher(s48Var.b);
            hashMap.put("project", matcher.matches() ? matcher.group(1) : null);
            hashMap.put("namespace", this.m);
            hashMap.put("lastKnownVersionNumber", Long.toString(((qi3) this.h.h).a.getLong("last_template_version", 0L)));
            r38Var.a();
            hashMap.put("appId", s48Var.b);
            hashMap.put("sdkVersion", "23.1.0");
            hashMap.put("appInstanceId", str);
            byte[] bytes = new JSONObject(hashMap).toString().getBytes(C4427z5.O);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            bufferedOutputStream.write(bytes);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
        }
        context.getPackageName();
        str3 = null;
        httpURLConnection.setRequestProperty("X-Android-Cert", str3);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", C4427z5.M);
        httpURLConnection.setRequestProperty("Accept", C4427z5.M);
        HashMap hashMap2 = new HashMap();
        r38Var.a();
        Matcher matcher2 = s.matcher(s48Var.b);
        hashMap2.put("project", matcher2.matches() ? matcher2.group(1) : null);
        hashMap2.put("namespace", this.m);
        hashMap2.put("lastKnownVersionNumber", Long.toString(((qi3) this.h.h).a.getLong("last_template_version", 0L)));
        r38Var.a();
        hashMap2.put("appId", s48Var.b);
        hashMap2.put("sdkVersion", "23.1.0");
        hashMap2.put("appInstanceId", str);
        byte[] bytes2 = new JSONObject(hashMap2).toString().getBytes(C4427z5.O);
        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream2.write(bytes2);
        bufferedOutputStream2.flush();
        bufferedOutputStream2.close();
    }

    public final synchronized ji3 j(HttpURLConnection httpURLConnection) {
        ji3 ji3Var;
        mi3 mi3Var = new mi3(this);
        ji3 ji3Var2 = this.h;
        di3 di3Var = this.k;
        LinkedHashSet linkedHashSet = this.a;
        ScheduledExecutorService scheduledExecutorService = this.g;
        qi3 qi3Var = this.p;
        ji3Var = new ji3();
        ji3Var.b = httpURLConnection;
        ji3Var.c = ji3Var2;
        ji3Var.f = di3Var;
        ji3Var.a = linkedHashSet;
        ji3Var.d = mi3Var;
        ji3Var.g = scheduledExecutorService;
        ji3Var.e = new Random();
        ji3Var.h = qi3Var;
        ji3Var.i = DefaultClock.a;
        return ji3Var;
    }

    public final void k(Date date) {
        qi3 qi3Var = this.p;
        int i = qi3Var.c().a + 1;
        qi3Var.e(i, new Date(date.getTime() + (TimeUnit.MINUTES.toMillis(r[(i < 8 ? i : 8) - 1]) / 2) + this.n.nextInt((int) r2)));
    }
}
