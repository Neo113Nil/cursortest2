package j9;

import android.text.format.DateUtils;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.j1;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import e3.d0;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: i, reason: collision with root package name */
    public static final long f18315i = TimeUnit.HOURS.toSeconds(12);
    public static final int[] j = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a, reason: collision with root package name */
    public final b9.e f18316a;

    /* renamed from: b, reason: collision with root package name */
    public final a9.a f18317b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f18318c;

    /* renamed from: d, reason: collision with root package name */
    public final Random f18319d;

    /* renamed from: e, reason: collision with root package name */
    public final d f18320e;

    /* renamed from: f, reason: collision with root package name */
    public final ConfigFetchHttpClient f18321f;

    /* renamed from: g, reason: collision with root package name */
    public final m f18322g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f18323h;

    public h(b9.e eVar, a9.a aVar, Executor executor, Random random, d dVar, ConfigFetchHttpClient configFetchHttpClient, m mVar, HashMap hashMap) {
        this.f18316a = eVar;
        this.f18317b = aVar;
        this.f18318c = executor;
        this.f18319d = random;
        this.f18320e = dVar;
        this.f18321f = configFetchHttpClient;
        this.f18322g = mVar;
        this.f18323h = hashMap;
    }

    public final g a(String str, String str2, Date date, HashMap hashMap) {
        String str3;
        try {
            HttpURLConnection b10 = this.f18321f.b();
            ConfigFetchHttpClient configFetchHttpClient = this.f18321f;
            HashMap d10 = d();
            String string = this.f18322g.f18353a.getString("last_fetch_etag", null);
            l8.b bVar = (l8.b) this.f18317b.get();
            g fetch = configFetchHttpClient.fetch(b10, str, str2, d10, string, hashMap, bVar != null ? (Long) ((j1) ((l8.c) bVar).f19409a.f22318b).a(null, null, true).get("_fot") : null, date, this.f18322g.b());
            e eVar = fetch.f18313b;
            if (eVar != null) {
                m mVar = this.f18322g;
                long j6 = eVar.f18307f;
                synchronized (mVar.f18354b) {
                    mVar.f18353a.edit().putLong("last_template_version", j6).apply();
                }
            }
            String str4 = fetch.f18314c;
            if (str4 != null) {
                this.f18322g.e(str4);
            }
            this.f18322g.d(0, m.f18352f);
            return fetch;
        } catch (i9.f e7) {
            int i5 = e7.f11021a;
            m mVar2 = this.f18322g;
            if (i5 == 429 || i5 == 502 || i5 == 503 || i5 == 504) {
                int i10 = mVar2.a().f18349a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = j;
                mVar2.d(i10, new Date(date.getTime() + (timeUnit.toMillis(iArr[Math.min(i10, iArr.length) - 1]) / 2) + this.f18319d.nextInt((int) r3)));
            }
            l a7 = mVar2.a();
            int i11 = e7.f11021a;
            if (a7.f18349a > 1 || i11 == 429) {
                a7.f18350b.getTime();
                throw new i9.e("Fetch was throttled.");
            }
            if (i11 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (i11 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else {
                if (i11 == 429) {
                    throw new i9.c("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
                if (i11 != 500) {
                    switch (i11) {
                        case 502:
                        case 503:
                        case 504:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
            }
            throw new i9.f(e7.f11021a, "Fetch failed: ".concat(str3), e7);
        }
    }

    public final Task b(Task task, long j6, HashMap hashMap) {
        Task h10;
        Date date = new Date(System.currentTimeMillis());
        boolean isSuccessful = task.isSuccessful();
        m mVar = this.f18322g;
        if (isSuccessful) {
            Date date2 = new Date(mVar.f18353a.getLong("last_fetch_time_in_millis", -1L));
            if (date2.equals(m.f18351e) ? false : date.before(new Date(TimeUnit.SECONDS.toMillis(j6) + date2.getTime()))) {
                return d5.q(new g(2, null, null));
            }
        }
        Date date3 = mVar.a().f18350b;
        Date date4 = date.before(date3) ? date3 : null;
        Executor executor = this.f18318c;
        if (date4 != null) {
            String str = "Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date4.getTime() - date.getTime()));
            date4.getTime();
            h10 = d5.p(new i9.e(str));
        } else {
            b9.d dVar = (b9.d) this.f18316a;
            w7.m d10 = dVar.d();
            w7.m e7 = dVar.e();
            h10 = d5.X(d10, e7).h(executor, new d0(this, d10, e7, date, hashMap));
        }
        return h10.h(executor, new com.google.firebase.messaging.g(20, this, date));
    }

    public final Task c(int i5) {
        HashMap hashMap = new HashMap(this.f18323h);
        hashMap.put("X-Firebase-RC-Fetch-Type", "REALTIME/" + i5);
        return this.f18320e.b().h(this.f18318c, new com.google.firebase.messaging.g(19, this, hashMap));
    }

    public final HashMap d() {
        HashMap hashMap = new HashMap();
        l8.b bVar = (l8.b) this.f18317b.get();
        if (bVar != null) {
            for (Map.Entry entry : ((j1) ((l8.c) bVar).f19409a.f22318b).a(null, null, false).entrySet()) {
                hashMap.put((String) entry.getKey(), entry.getValue().toString());
            }
        }
        return hashMap;
    }
}
