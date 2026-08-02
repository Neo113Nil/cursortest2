package j9;

import android.util.Log;
import io.sentry.android.core.w0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f18287a;

    /* renamed from: b, reason: collision with root package name */
    public final HttpURLConnection f18288b;

    /* renamed from: c, reason: collision with root package name */
    public final h f18289c;

    /* renamed from: d, reason: collision with root package name */
    public final d f18290d;

    /* renamed from: e, reason: collision with root package name */
    public final j f18291e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f18292f;

    /* renamed from: i, reason: collision with root package name */
    public final m f18295i;

    /* renamed from: g, reason: collision with root package name */
    public final Random f18293g = new Random();
    public boolean j = false;

    /* renamed from: h, reason: collision with root package name */
    public final q6.a f18294h = q6.a.f22039a;

    public c(HttpURLConnection httpURLConnection, h hVar, d dVar, LinkedHashSet linkedHashSet, j jVar, ScheduledExecutorService scheduledExecutorService, m mVar) {
        this.f18288b = httpURLConnection;
        this.f18289c = hVar;
        this.f18290d = dVar;
        this.f18287a = linkedHashSet;
        this.f18291e = jVar;
        this.f18292f = scheduledExecutorService;
        this.f18295i = mVar;
    }

    public final void a(int i5, long j) {
        if (i5 == 0) {
            new i9.f("Unable to fetch the latest version of the template.");
            d();
            return;
        }
        this.f18292f.schedule(new b(this, i5, j), this.f18293g.nextInt(4), TimeUnit.SECONDS);
    }

    public final void b(InputStream inputStream) {
        JSONObject jSONObject;
        boolean isEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String str = "";
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            str = r4.k.l(str, readLine);
            if (readLine.contains("}")) {
                int indexOf = str.indexOf(123);
                int lastIndexOf = str.lastIndexOf(125);
                str = (indexOf < 0 || lastIndexOf < 0 || indexOf >= lastIndexOf) ? "" : str.substring(indexOf, lastIndexOf + 1);
                if (!str.isEmpty()) {
                    try {
                        jSONObject = new JSONObject(str);
                    } catch (JSONException e7) {
                        new i9.c("Unable to parse config update message.", e7.getCause());
                        d();
                        w0.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e7);
                    }
                    if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                        j jVar = this.f18291e;
                        new i9.f("The server is temporarily unavailable. Try again in a few minutes.");
                        jVar.a();
                        break;
                    }
                    synchronized (this) {
                        isEmpty = this.f18287a.isEmpty();
                    }
                    if (isEmpty) {
                        break;
                    }
                    if (jSONObject.has("latestTemplateVersionNumber")) {
                        long j = this.f18289c.f18322g.f18353a.getLong("last_template_version", 0L);
                        long j6 = jSONObject.getLong("latestTemplateVersionNumber");
                        if (j6 > j) {
                            a(3, j6);
                        }
                    }
                    if (jSONObject.has("retryIntervalSeconds")) {
                        e(jSONObject.getInt("retryIntervalSeconds"));
                    }
                    str = "";
                } else {
                    continue;
                }
            }
        }
        bufferedReader.close();
    }

    public final void c() {
        HttpURLConnection httpURLConnection = this.f18288b;
        if (httpURLConnection == null) {
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = httpURLConnection.getInputStream();
                    b(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e7) {
                    Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e7);
                }
            } catch (IOException e9) {
                if (!this.j) {
                    Log.d("FirebaseRemoteConfig", "Real-time connection was closed due to an exception.", e9);
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e10);
                }
            }
            throw th2;
        }
    }

    public final synchronized void d() {
        Iterator it = this.f18287a.iterator();
        while (it.hasNext()) {
            ((j) it.next()).a();
        }
    }

    public final synchronized void e(int i5) {
        this.f18294h.getClass();
        this.f18295i.f(new Date(new Date(System.currentTimeMillis()).getTime() + (i5 * 1000)));
    }
}
