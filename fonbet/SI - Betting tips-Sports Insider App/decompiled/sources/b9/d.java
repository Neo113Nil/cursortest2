package b9;

import android.net.TrafficStats;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.d5;
import com.sports.insider.data.room.general.table.AccountTable;
import g6.v;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.android.core.w0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import o8.l;
import org.json.JSONException;
import org.json.JSONObject;
import w7.m;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f3099m = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final h8.g f3100a;

    /* renamed from: b, reason: collision with root package name */
    public final d9.c f3101b;

    /* renamed from: c, reason: collision with root package name */
    public final x5.h f3102c;

    /* renamed from: d, reason: collision with root package name */
    public final k f3103d;

    /* renamed from: e, reason: collision with root package name */
    public final l f3104e;

    /* renamed from: f, reason: collision with root package name */
    public final i f3105f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f3106g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f3107h;

    /* renamed from: i, reason: collision with root package name */
    public final p8.j f3108i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f3109k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f3110l;

    static {
        new AtomicInteger(1);
    }

    public d(h8.g gVar, a9.a aVar, ExecutorService executorService, p8.j jVar) {
        gVar.a();
        d9.c cVar = new d9.c(gVar.f10401a, aVar);
        x5.h hVar = new x5.h();
        hVar.f25410b = gVar;
        if (y8.d.f25728a == null) {
            y8.d.f25728a = new y8.d();
        }
        y8.d dVar = y8.d.f25728a;
        if (k.f3118d == null) {
            k.f3118d = new k(dVar);
        }
        k kVar = k.f3118d;
        l lVar = new l(new b(0, gVar));
        i iVar = new i();
        this.f3106g = new Object();
        this.f3109k = new HashSet();
        this.f3110l = new ArrayList();
        this.f3100a = gVar;
        this.f3101b = cVar;
        this.f3102c = hVar;
        this.f3103d = kVar;
        this.f3104e = lVar;
        this.f3105f = iVar;
        this.f3107h = executorService;
        this.f3108i = jVar;
    }

    public final void a(j jVar) {
        synchronized (this.f3106g) {
            this.f3110l.add(jVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        r3 = h(r2);
        r4 = r6.f3102c;
        r2 = r2.a();
        r2.f3698a = r3;
        r2.f3699b = 3;
        r2 = r2.a();
        r4.h(r2);
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        c9.b k6;
        synchronized (f3099m) {
            try {
                h8.g gVar = this.f3100a;
                gVar.a();
                l1.a h10 = l1.a.h(gVar.f10401a);
                try {
                    k6 = this.f3102c.k();
                    int i5 = k6.f3708b;
                    boolean z5 = true;
                    if (i5 != 2 && i5 != 1) {
                        z5 = false;
                    }
                    if (h10 != null) {
                        h10.A();
                    }
                } catch (Throwable th2) {
                    if (h10 != null) {
                        h10.A();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        k(k6);
        this.f3108i.execute(new c(this, 1));
    }

    public final c9.b c(c9.b bVar) {
        HttpURLConnection httpURLConnection;
        int responseCode;
        String str;
        d9.b bVar2;
        h8.g gVar = this.f3100a;
        gVar.a();
        String str2 = gVar.f10403c.f10415a;
        String str3 = bVar.f3707a;
        gVar.a();
        String str4 = gVar.f10403c.f10421g;
        String str5 = bVar.f3710d;
        d9.c cVar = this.f3101b;
        d9.d dVar = cVar.f8320c;
        if (!dVar.b()) {
            throw new f("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a7 = d9.c.a("projects/" + str4 + "/installations/" + str3 + "/authTokens:generate");
        for (int i5 = 0; i5 <= 1; i5++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection c2 = cVar.c(a7, str2);
            try {
                try {
                    c2.setRequestMethod("POST");
                    c2.addRequestProperty("Authorization", "FIS_v2 " + str5);
                    c2.setDoOutput(true);
                    d9.c.h(c2);
                    responseCode = c2.getResponseCode();
                    dVar.d(responseCode);
                } catch (IOException | AssertionError unused) {
                    httpURLConnection = c2;
                }
                if (responseCode >= 200 && responseCode < 300) {
                    bVar2 = d9.c.f(c2);
                    c2.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    str = null;
                } else {
                    d9.c.b(c2, null, str2, str4);
                    httpURLConnection = c2;
                    try {
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                            httpURLConnection.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            throw th;
                        }
                    } catch (IOException | AssertionError unused2) {
                    }
                    if (responseCode == 401 || responseCode == 404) {
                        if (((byte) (0 | 1)) != 1) {
                            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                        }
                        str = null;
                        d9.b bVar3 = new d9.b(null, 0L, 3);
                        httpURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        bVar2 = bVar3;
                    } else {
                        if (responseCode == 429) {
                            throw new f("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            w0.d("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            if (((byte) (0 | 1)) != 1) {
                                throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                            }
                            d9.b bVar4 = new d9.b(null, 0L, 2);
                            httpURLConnection.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            bVar2 = bVar4;
                            str = null;
                        }
                        httpURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                }
                int d10 = v.f.d(bVar2.f8315c);
                if (d10 != 0) {
                    if (d10 == 1) {
                        c9.a a10 = bVar.a();
                        a10.f3704g = "BAD CONFIG";
                        a10.f3699b = 5;
                        return a10.a();
                    }
                    if (d10 != 2) {
                        throw new f("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    l(str);
                    c9.a a11 = bVar.a();
                    a11.f3699b = 2;
                    return a11.a();
                }
                String str6 = bVar2.f8313a;
                long j = bVar2.f8314b;
                k kVar = this.f3103d;
                kVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                kVar.f3119a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                c9.a a12 = bVar.a();
                a12.f3700c = str6;
                a12.f3702e = j;
                byte b10 = (byte) (a12.f3705h | 1);
                a12.f3703f = seconds;
                a12.f3705h = (byte) (b10 | 2);
                return a12.a();
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = c2;
            }
        }
        throw new f("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final m d() {
        String str;
        g();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return d5.q(str);
        }
        w7.g gVar = new w7.g();
        a(new h(gVar));
        m mVar = gVar.f24979a;
        this.f3107h.execute(new c(this, 0));
        return mVar;
    }

    public final m e() {
        g();
        w7.g gVar = new w7.g();
        a(new g(this.f3103d, gVar));
        this.f3107h.execute(new c(this, 2));
        return gVar.f24979a;
    }

    /* JADX WARN: Finally extract failed */
    public final void f(c9.b bVar) {
        synchronized (f3099m) {
            try {
                h8.g gVar = this.f3100a;
                gVar.a();
                l1.a h10 = l1.a.h(gVar.f10401a);
                try {
                    this.f3102c.h(bVar);
                    if (h10 != null) {
                        h10.A();
                    }
                } catch (Throwable th2) {
                    if (h10 != null) {
                        h10.A();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void g() {
        h8.g gVar = this.f3100a;
        gVar.a();
        v.f(gVar.f10403c.f10416b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        v.f(gVar.f10403c.f10421g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        v.f(gVar.f10403c.f10415a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.f10403c.f10416b;
        Pattern pattern = k.f3117c;
        v.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(StringUtils.PROCESS_POSTFIX_DELIMITER));
        gVar.a();
        v.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", k.f3117c.matcher(gVar.f10403c.f10415a).matches());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if ("[DEFAULT]".equals(r0.f10402b) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String h(c9.b bVar) {
        String a7;
        h8.g gVar = this.f3100a;
        gVar.a();
        if (!gVar.f10402b.equals("CHIME_ANDROID_SDK")) {
            h8.g gVar2 = this.f3100a;
            gVar2.a();
        }
        if (bVar.f3708b == 1) {
            c9.c cVar = (c9.c) this.f3104e.get();
            synchronized (cVar.f3715a) {
                try {
                    a7 = cVar.a();
                    if (a7 == null) {
                        a7 = cVar.b();
                    }
                } finally {
                }
            }
            if (!TextUtils.isEmpty(a7)) {
                return a7;
            }
            this.f3105f.getClass();
            return i.a();
        }
        this.f3105f.getClass();
        return i.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [d9.c] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [d9.a] */
    public final c9.b i(c9.b bVar) {
        int responseCode;
        String str = bVar.f3707a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            c9.c cVar = (c9.c) this.f3104e.get();
            synchronized (cVar.f3715a) {
                try {
                    String[] strArr = c9.c.f3714c;
                    int i5 = 0;
                    while (true) {
                        if (i5 < 4) {
                            String str3 = strArr[i5];
                            String string = cVar.f3715a.getString("|T|" + cVar.f3716b + "|" + str3, null);
                            if (string == null || string.isEmpty()) {
                                i5++;
                            } else if (string.startsWith("{")) {
                                try {
                                    str2 = new JSONObject(string).getString(AccountTable.tokenColumn);
                                } catch (JSONException unused) {
                                }
                            } else {
                                str2 = string;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        d9.c cVar2 = this.f3101b;
        h8.g gVar = this.f3100a;
        gVar.a();
        String str4 = gVar.f10403c.f10415a;
        String str5 = bVar.f3707a;
        h8.g gVar2 = this.f3100a;
        gVar2.a();
        String str6 = gVar2.f10403c.f10421g;
        h8.g gVar3 = this.f3100a;
        gVar3.a();
        String str7 = gVar3.f10403c.f10416b;
        d9.d dVar = cVar2.f8320c;
        if (!dVar.b()) {
            throw new f("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a7 = d9.c.a("projects/" + str6 + "/installations");
        int i10 = 0;
        d9.a aVar = cVar2;
        while (i10 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection c2 = aVar.c(a7, str4);
            try {
                try {
                    c2.setRequestMethod("POST");
                    c2.setDoOutput(true);
                    if (str2 != null) {
                        c2.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    d9.c.g(c2, str5, str7);
                    responseCode = c2.getResponseCode();
                    dVar.d(responseCode);
                } catch (IOException | AssertionError unused2) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    d9.a e7 = d9.c.e(c2);
                    c2.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    aVar = e7;
                } else {
                    try {
                        d9.c.b(c2, str7, str4, str6);
                    } catch (IOException | AssertionError unused3) {
                        c2.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i10++;
                        aVar = aVar;
                    }
                    if (responseCode == 429) {
                        throw new f("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        w0.d("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        d9.a aVar2 = new d9.a(null, null, null, null, 2);
                        c2.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVar = aVar2;
                    } else {
                        c2.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i10++;
                        aVar = aVar;
                    }
                }
                int d10 = v.f.d(aVar.f8312e);
                if (d10 != 0) {
                    if (d10 != 1) {
                        throw new f("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    c9.a a10 = bVar.a();
                    a10.f3704g = "BAD CONFIG";
                    a10.f3699b = 5;
                    return a10.a();
                }
                String str8 = aVar.f8309b;
                String str9 = aVar.f8310c;
                k kVar = this.f3103d;
                kVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                kVar.f3119a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                d9.b bVar2 = aVar.f8311d;
                String str10 = bVar2.f8313a;
                long j = bVar2.f8314b;
                c9.a a11 = bVar.a();
                a11.f3698a = str8;
                a11.f3699b = 4;
                a11.f3700c = str10;
                a11.f3701d = str9;
                a11.f3702e = j;
                byte b10 = (byte) (a11.f3705h | 1);
                a11.f3703f = seconds;
                a11.f3705h = (byte) (b10 | 2);
                return a11.a();
            } finally {
                c2.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new f("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void j(Exception exc) {
        synchronized (this.f3106g) {
            try {
                Iterator it = this.f3110l.iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k(c9.b bVar) {
        synchronized (this.f3106g) {
            try {
                Iterator it = this.f3110l.iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).a(bVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void l(String str) {
        this.j = str;
    }

    public final synchronized void m(c9.b bVar, c9.b bVar2) {
        try {
            if (this.f3109k.size() != 0 && !TextUtils.equals(bVar.f3707a, bVar2.f3707a)) {
                Iterator it = this.f3109k.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
        } finally {
        }
    }
}
