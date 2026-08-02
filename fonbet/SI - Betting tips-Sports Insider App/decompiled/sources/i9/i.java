package i9;

import android.app.Application;
import android.content.Context;
import androidx.appcompat.app.v0;
import com.google.android.gms.internal.measurement.d5;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import d4.z;
import j$.util.concurrent.ConcurrentHashMap;
import j9.m;
import j9.n;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i implements l9.a {
    public static final Random j = new Random();

    /* renamed from: k, reason: collision with root package name */
    public static final HashMap f11024k = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f11026b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f11027c;

    /* renamed from: d, reason: collision with root package name */
    public final h8.g f11028d;

    /* renamed from: e, reason: collision with root package name */
    public final b9.e f11029e;

    /* renamed from: f, reason: collision with root package name */
    public final i8.c f11030f;

    /* renamed from: g, reason: collision with root package name */
    public final a9.a f11031g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11032h;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11025a = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f11033i = new HashMap();

    public i(Context context, ScheduledExecutorService scheduledExecutorService, h8.g gVar, b9.e eVar, i8.c cVar, a9.a aVar) {
        this.f11026b = context;
        this.f11027c = scheduledExecutorService;
        this.f11028d = gVar;
        this.f11029e = eVar;
        this.f11030f = cVar;
        this.f11031g = aVar;
        gVar.a();
        this.f11032h = gVar.f10403c.f10416b;
        AtomicReference atomicReference = h.f11023a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = h.f11023a;
        if (atomicReference2.get() == null) {
            h hVar = new h();
            while (true) {
                if (atomicReference2.compareAndSet(null, hVar)) {
                    e6.c.b(application);
                    e6.c.f8679e.a(hVar);
                    break;
                } else if (atomicReference2.get() != null) {
                    break;
                }
            }
        }
        d5.d(scheduledExecutorService, new z(1, this));
    }

    public final synchronized b a(h8.g gVar, b9.e eVar, i8.c cVar, Executor executor, j9.d dVar, j9.d dVar2, j9.d dVar3, j9.h hVar, j9.i iVar, m mVar, v0 v0Var) {
        try {
            if (!this.f11025a.containsKey("firebase")) {
                gVar.a();
                b bVar = new b(gVar.f10402b.equals("[DEFAULT]") ? cVar : null, executor, dVar, dVar2, dVar3, hVar, iVar, e(gVar, eVar, hVar, dVar2, this.f11026b, mVar), v0Var);
                dVar2.b();
                dVar3.b();
                dVar.b();
                this.f11025a.put("firebase", bVar);
                f11024k.put("firebase", bVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (b) this.f11025a.get("firebase");
    }

    public final j9.d b(String str) {
        n nVar;
        String str2 = "frc_" + this.f11032h + "_firebase_" + str + ".json";
        ScheduledExecutorService scheduledExecutorService = this.f11027c;
        Context context = this.f11026b;
        HashMap hashMap = n.f18357c;
        synchronized (n.class) {
            try {
                HashMap hashMap2 = n.f18357c;
                if (!hashMap2.containsKey(str2)) {
                    hashMap2.put(str2, new n(context, str2));
                }
                nVar = (n) hashMap2.get(str2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j9.d.d(scheduledExecutorService, nVar);
    }

    public final b c() {
        synchronized (this) {
            try {
                try {
                    j9.d b10 = b("fetch");
                    j9.d b11 = b("activate");
                    j9.d b12 = b("defaults");
                    m mVar = new m(this.f11026b.getSharedPreferences("frc_" + this.f11032h + "_firebase_settings", 0));
                    j9.i iVar = new j9.i(this.f11027c, b11, b12);
                    h8.g gVar = this.f11028d;
                    a9.a aVar = this.f11031g;
                    gVar.a();
                    d7.e eVar = gVar.f10402b.equals("[DEFAULT]") ? new d7.e(aVar) : null;
                    if (eVar != null) {
                        iVar.a(new g(eVar));
                    }
                    io.sentry.util.network.b bVar = new io.sentry.util.network.b(3);
                    bVar.f17176b = b11;
                    bVar.f17177c = b12;
                    ScheduledExecutorService scheduledExecutorService = this.f11027c;
                    v0 v0Var = new v0(28, false);
                    v0Var.f366d = Collections.newSetFromMap(new ConcurrentHashMap());
                    v0Var.f364b = bVar;
                    v0Var.f365c = scheduledExecutorService;
                    return a(this.f11028d, this.f11029e, this.f11030f, this.f11027c, b10, b11, b12, d(b10, mVar), iVar, mVar, v0Var);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    public final synchronized j9.h d(j9.d dVar, m mVar) {
        b9.e eVar;
        a9.a nVar;
        ScheduledExecutorService scheduledExecutorService;
        Random random;
        String str;
        h8.g gVar;
        try {
            eVar = this.f11029e;
            h8.g gVar2 = this.f11028d;
            gVar2.a();
            nVar = gVar2.f10402b.equals("[DEFAULT]") ? this.f11031g : new com.google.firebase.messaging.n(1);
            scheduledExecutorService = this.f11027c;
            random = j;
            h8.g gVar3 = this.f11028d;
            gVar3.a();
            str = gVar3.f10403c.f10415a;
            gVar = this.f11028d;
            gVar.a();
        } catch (Throwable th2) {
            throw th2;
        }
        return new j9.h(eVar, nVar, scheduledExecutorService, random, dVar, new ConfigFetchHttpClient(this.f11026b, gVar.f10403c.f10416b, str, mVar.f18353a.getLong("fetch_timeout_in_seconds", 60L), mVar.f18353a.getLong("fetch_timeout_in_seconds", 60L)), mVar, this.f11033i);
    }

    public final synchronized io.sentry.util.network.b e(h8.g gVar, b9.e eVar, j9.h hVar, j9.d dVar, Context context, m mVar) {
        return new io.sentry.util.network.b(gVar, eVar, hVar, dVar, context, mVar, this.f11027c);
    }
}
