package androidx.core.widget;

import android.content.ComponentName;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.g2;
import androidx.core.view.z0;
import androidx.fragment.app.n;
import com.android.billingclient.api.g0;
import com.android.billingclient.api.t0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.tasks.Task;
import e6.a0;
import e6.p;
import g6.v;
import io.appmetrica.analytics.impl.C0122e9;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.android.core.s;
import io.sentry.android.core.w0;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.r;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import s7.a3;
import s7.d1;
import s7.d3;
import s7.e2;
import s7.e3;
import s7.f1;
import s7.f3;
import s7.j3;
import s7.n0;
import s7.r0;
import s7.r3;
import s7.t1;
import s7.t2;
import s7.u1;
import s7.v0;
import s7.v3;
import s7.w;
import s7.w2;
import s7.x;
import s7.x0;
import s7.x2;
import s7.y2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1455a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1456b;

    public /* synthetic */ b(int i5, Object obj) {
        this.f1455a = i5;
        this.f1456b = obj;
    }

    private final void a() {
        boolean a7;
        j9.k kVar = (j9.k) this.f1456b;
        synchronized (kVar) {
            a7 = kVar.a();
            if (a7) {
                kVar.j(true);
            }
        }
        if (a7) {
            j9.l c2 = kVar.q.c();
            kVar.f18347p.getClass();
            if (new Date(System.currentTimeMillis()).before(c2.f18350b)) {
                kVar.i();
                return;
            }
            b9.d dVar = (b9.d) kVar.f18342k;
            w7.m e7 = dVar.e();
            w7.m d10 = dVar.d();
            Task h10 = d5.X(e7, d10).h(kVar.f18340h, new androidx.transition.i(kVar, e7, d10, 10));
            d5.X(h10).g(kVar.f18340h, new com.google.firebase.messaging.g(21, kVar, h10));
        }
    }

    private final void b() {
        v7.a aVar = (v7.a) this.f1456b;
        synchronized (aVar.f24438a) {
            try {
                if (aVar.b()) {
                    w0.d("WakeLock", String.valueOf(aVar.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    aVar.d();
                    if (aVar.b()) {
                        aVar.f24440c = 1;
                        aVar.e();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0221, code lost:
    
        if (r0.R() >= 242600) goto L51;
     */
    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        r a7;
        int i5 = 1;
        int i10 = 0;
        switch (this.f1455a) {
            case 0:
                e eVar = (e) this.f1456b;
                g2 g2Var = eVar.f1460c;
                a aVar = eVar.f1458a;
                if (eVar.f1471o) {
                    if (eVar.f1469m) {
                        eVar.f1469m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f1450e = currentAnimationTimeMillis;
                        aVar.f1452g = -1L;
                        aVar.f1451f = currentAnimationTimeMillis;
                        aVar.f1453h = 0.5f;
                    }
                    if ((aVar.f1452g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f1452g + aVar.f1454i) || !eVar.e()) {
                        eVar.f1471o = false;
                        return;
                    }
                    if (eVar.f1470n) {
                        eVar.f1470n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        g2Var.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f1451f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a10 = aVar.a(currentAnimationTimeMillis2);
                    long j = currentAnimationTimeMillis2 - aVar.f1451f;
                    aVar.f1451f = currentAnimationTimeMillis2;
                    eVar.q.scrollListBy((int) (j * ((a10 * 4.0f) + ((-4.0f) * a10 * a10)) * aVar.f1449d));
                    WeakHashMap weakHashMap = z0.f1413a;
                    g2Var.postOnAnimation(this);
                    return;
                }
                return;
            case 1:
                ((androidx.customview.widget.i) this.f1456b).p(0);
                return;
            case 2:
                if (((w7.g) this.f1456b).c(new IOException("TIMEOUT"))) {
                    w0.m("Rpc", "No response");
                    return;
                }
                return;
            case 3:
                c3.h hVar = (c3.h) this.f1456b;
                hVar.setScrollState(0);
                hVar.q();
                return;
            case 4:
                g0 g0Var = (g0) this.f1456b;
                com.android.billingclient.api.d dVar = g0Var.f4021b;
                dVar.t(0);
                com.android.billingclient.api.k kVar = t0.f4091m;
                dVar.I(24, 6, kVar);
                g0Var.a(kVar);
                return;
            case 5:
                Context context = (Context) ((d7.e) this.f1456b).f8268b;
                long j6 = d7.e.g(context).getLong("app_set_id_last_used_time", -1L);
                long j10 = j6 != -1 ? j6 + 33696000000L : -1L;
                if (j10 == -1 || System.currentTimeMillis() <= j10) {
                    return;
                }
                if (!d7.e.g(context).edit().remove(CommonUrlParts.APP_SET_ID).commit()) {
                    String valueOf = String.valueOf(context.getPackageName());
                    w0.d("AppSet", valueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(valueOf) : new String("Failed to clear app set ID generated for App "));
                }
                if (context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                    return;
                }
                String valueOf2 = String.valueOf(context.getPackageName());
                w0.d("AppSet", valueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(valueOf2) : new String("Failed to clear app set ID last used time for App "));
                return;
            case 6:
                ((p) this.f1456b).b();
                return;
            case 7:
                p pVar = (p) ((h9.c) this.f1456b).f10430b;
                ((g6.e) pVar.f8736f).f(pVar.f8736f.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 8:
                ((a0) this.f1456b).f8677l.z(new ConnectionResult(4, null, null));
                return;
            case 9:
                b6 b6Var = (b6) this.f1456b;
                String cacheDirPath = b6Var.getCacheDirPath();
                if (cacheDirPath == null) {
                    b6Var.getLogger().h(b5.INFO, "Cache dir is not set, not moving the previous session.", new Object[0]);
                    return;
                }
                if (!b6Var.isEnableAutoSessionTracking()) {
                    b6Var.getLogger().h(b5.DEBUG, "Session tracking is disabled, bailing from previous session mover.", new Object[0]);
                    return;
                }
                io.sentry.cache.d envelopeDiskCache = b6Var.getEnvelopeDiskCache();
                if (envelopeDiskCache instanceof io.sentry.cache.c) {
                    Charset charset = io.sentry.cache.c.f16240i;
                    io.sentry.cache.c cVar = (io.sentry.cache.c) envelopeDiskCache;
                    cVar.c(new File(cacheDirPath, "session.json"), new File(cacheDirPath, "previous_session.json"));
                    cVar.f16245e.countDown();
                    return;
                }
                return;
            case 10:
                ((io.sentry.android.replay.capture.a) this.f1456b).invoke();
                return;
            case 11:
                ((n) this.f1456b).invoke();
                return;
            case 12:
                ((io.sentry.android.replay.capture.a) this.f1456b).invoke();
                return;
            case 13:
                ((io.sentry.android.replay.capture.a) this.f1456b).invoke();
                return;
            case 14:
                ((io.sentry.android.replay.capture.a) this.f1456b).invoke();
                return;
            case 15:
                ((io.sentry.android.replay.capture.a) this.f1456b).invoke();
                return;
            case 16:
                io.sentry.logger.d dVar2 = (io.sentry.logger.d) this.f1456b;
                do {
                    dVar2.c();
                } while (dVar2.f16627c.size() >= 100);
                a7 = dVar2.f16630f.a();
                try {
                    if (dVar2.f16627c.isEmpty()) {
                        dVar2.f16631g = false;
                    } else {
                        dVar2.e(true, false);
                    }
                    a7.close();
                    return;
                } catch (Throwable th2) {
                }
            case 17:
                androidx.appcompat.widget.a0 a0Var = (androidx.appcompat.widget.a0) this.f1456b;
                do {
                    a0Var.v();
                } while (((ConcurrentLinkedQueue) a0Var.f682d).size() >= 1000);
                a7 = ((io.sentry.util.a) a0Var.f684f).a();
                try {
                    if (!((ConcurrentLinkedQueue) a0Var.f682d).isEmpty()) {
                        a0Var.y(false);
                    }
                    a7.close();
                    return;
                } finally {
                    try {
                        a7.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
            case 18:
                a();
                return;
            case 19:
                k.e eVar2 = (k.e) this.f1456b;
                eVar2.a(true);
                eVar2.invalidateSelf();
                return;
            case 20:
                ((s7.t0) this.f1456b).f23086a.N();
                return;
            case 21:
                y2 y2Var = ((x2) this.f1456b).f23241c;
                y2Var.u(new ComponentName(((f1) y2Var.f3328a).f22740a, "com.google.android.gms.measurement.AppMeasurementService"));
                return;
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                y2 y2Var2 = ((x2) ((s7.w0) this.f1456b).f23165c).f23241c;
                d1 d1Var = ((f1) y2Var2.f3328a).f22746g;
                f1.m(d1Var);
                d1Var.s(new w2(y2Var2, i10));
                return;
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                d3 d3Var = (d3) this.f1456b;
                f3 f3Var = (f3) d3Var.f22688c.f17177c;
                f3Var.j();
                f1 f1Var = (f1) f3Var.f3328a;
                n0 n0Var = f1Var.f22745f;
                Context context2 = f1Var.f22740a;
                f1.m(n0Var);
                n0Var.f22909m.a("Application going to the background");
                v0 v0Var = f1Var.f22744e;
                f1.k(v0Var);
                v0Var.f23138s.b(true);
                f3Var.j();
                f3Var.f22765d = true;
                s7.e eVar3 = f1Var.f22743d;
                if (!eVar3.x()) {
                    long j11 = d3Var.f22687b;
                    io.sentry.android.replay.gestures.c cVar2 = f3Var.f22767f;
                    cVar2.e(j11, false, false);
                    ((e3) cVar2.f16045d).c();
                }
                long j12 = d3Var.f22686a;
                f1.m(n0Var);
                n0Var.f22908l.b(Long.valueOf(j12), "Application backgrounded at: timestamp_millis");
                e2 e2Var = f1Var.f22751m;
                f1.l(e2Var);
                e2Var.j();
                f1 f1Var2 = (f1) e2Var.f3328a;
                e2Var.k();
                y2 p10 = f1Var2.p();
                p10.j();
                p10.k();
                if (p10.q()) {
                    v3 v3Var = ((f1) p10.f3328a).f22748i;
                    f1.k(v3Var);
                    break;
                }
                y2 p11 = f1Var2.p();
                p11.j();
                p11.k();
                p11.x(new t2(p11, p11.z(true), 2));
                if (eVar3.t(null, x.O0)) {
                    v3 v3Var2 = f1Var.f22748i;
                    f1.k(v3Var2);
                    long q = v3Var2.L(context2.getPackageName(), eVar3.f22690c) ? 1000L : eVar3.q(context2.getPackageName(), x.E);
                    f1.m(n0Var);
                    n0Var.f22910n.b(Long.valueOf(q), "[sgtm] Scheduling batch upload with minimum latency in millis");
                    f1.j(f1Var.f22758u);
                    f1Var.f22758u.n(q);
                    return;
                }
                return;
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                r3 r3Var = (r3) this.f1456b;
                r3Var.b().j();
                r3Var.f22996k = new x0(r3Var);
                s7.j jVar = new s7.j(r3Var);
                jVar.l();
                r3Var.f22989c = jVar;
                s7.z0 z0Var = r3Var.f22987a;
                s7.e e0 = r3Var.e0();
                v.h(z0Var);
                e0.f22691d = z0Var;
                a3 a3Var = new a3(r3Var);
                a3Var.l();
                r3Var.f22995i = a3Var;
                s7.c cVar3 = new s7.c(r3Var);
                cVar3.l();
                r3Var.f22992f = cVar3;
                r0 r0Var = new r0(r3Var, i5);
                r0Var.l();
                r3Var.f22994h = r0Var;
                j3 j3Var = new j3(r3Var);
                j3Var.l();
                r3Var.f22991e = j3Var;
                r3Var.f22990d = new s7.t0(r3Var);
                if (r3Var.f23002r != r3Var.f23003s) {
                    r3Var.a().f22903f.c(Integer.valueOf(r3Var.f23002r), Integer.valueOf(r3Var.f23003s), "Not all upload components initialized");
                }
                r3Var.f22998m.set(true);
                r3Var.a().f22910n.a("UploadController is now fully initialized");
                r3Var.b().j();
                s7.j jVar2 = r3Var.f22989c;
                r3.U(jVar2);
                jVar2.t();
                s7.j jVar3 = r3Var.f22989c;
                r3.U(jVar3);
                jVar3.j();
                jVar3.k();
                if (jVar3.Q()) {
                    w wVar = x.f23224w0;
                    if (((Long) wVar.a(null)).longValue() != 0) {
                        SQLiteDatabase Y = jVar3.Y();
                        f1 f1Var3 = (f1) jVar3.f3328a;
                        f1Var3.f22749k.getClass();
                        int delete = Y.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(wVar.a(null))});
                        if (delete > 0) {
                            n0 n0Var2 = f1Var3.f22745f;
                            f1.m(n0Var2);
                            n0Var2.f22910n.b(Integer.valueOf(delete), "Deleted stale trigger uris. rowsDeleted");
                        }
                    }
                }
                if (r3Var.f22995i.f22647h.a() == 0) {
                    s sVar = r3Var.f22995i.f22647h;
                    r3Var.f().getClass();
                    sVar.b(System.currentTimeMillis());
                }
                r3Var.N();
                return;
            case C0122e9.F /* 25 */:
                f1 f1Var4 = (f1) ((androidx.appcompat.app.g0) this.f1456b).f254b;
                f1.j(f1Var4.f22758u);
                f1Var4.f22758u.n(((Long) x.D.a(null)).longValue());
                return;
            case C0122e9.G /* 26 */:
                f1 f1Var5 = (f1) this.f1456b;
                v3 v3Var3 = f1Var5.f22748i;
                e2 e2Var2 = f1Var5.f22751m;
                f1.k(v3Var3);
                v3Var3.j();
                if (v3Var3.G() != 1) {
                    n0 n0Var3 = f1Var5.f22745f;
                    f1.m(n0Var3);
                    n0Var3.f22906i.a("registerTrigger called but app not eligible");
                    return;
                }
                f1.l(e2Var2);
                e2Var2.j();
                u1 u1Var = e2Var2.f22704l;
                if (u1Var != null) {
                    u1Var.c();
                }
                f1.l(e2Var2);
                new Thread(new t1(e2Var2, 3)).start();
                return;
            case C0122e9.H /* 27 */:
                b();
                return;
            default:
                w7.k kVar2 = (w7.k) this.f1456b;
                synchronized (kVar2.f24996c) {
                    try {
                        w7.b bVar = (w7.b) kVar2.f24997d;
                        if (bVar != null) {
                            bVar.b();
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public b(a0 a0Var) {
        this.f1455a = 8;
        Objects.requireNonNull(a0Var);
        this.f1456b = a0Var;
    }

    public b(s7.t0 t0Var, boolean z5) {
        this.f1455a = 20;
        this.f1456b = t0Var;
    }

    public b(r3 r3Var, b2.e eVar) {
        this.f1455a = 24;
        this.f1456b = r3Var;
    }
}
