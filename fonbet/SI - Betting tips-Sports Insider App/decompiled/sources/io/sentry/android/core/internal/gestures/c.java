package io.sentry.android.core.internal.gestures;

import ag.u;
import android.content.ClipData;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.v0;
import androidx.appcompat.widget.d0;
import androidx.core.view.h2;
import androidx.core.view.k2;
import androidx.core.view.x;
import androidx.core.view.z0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.d1;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.tasks.Task;
import com.sports.insider.MyApp;
import com.sports.insider.ui.activities.BonusesInfo;
import com.sports.insider.ui.activities.SplashActivity;
import com.sports.insider.ui.strip.PredictionListFragment;
import eg.c0;
import eg.h1;
import eg.m0;
import eg.t1;
import gh.o0;
import io.sentry.ILogger;
import io.sentry.android.core.w0;
import io.sentry.android.replay.capture.o;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.u3;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import k2.v;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pd.a0;
import pd.t;
import pe.s;
import q4.r;
import w7.m;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements u3, io.sentry.util.e, io.sentry.util.network.e, w7.f, m5.b, o8.d, androidx.swiperefreshlayout.widget.i, n0.c, g.a, w7.d, x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15640a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15641b;

    public /* synthetic */ c(int i5, Object obj) {
        this.f15640a = i5;
        this.f15641b = obj;
    }

    @Override // g.a
    public void a(Object obj) {
        Continuation continuation = null;
        switch (this.f15640a) {
            case 16:
                com.sports.insider.ui.activities.a aVar = (com.sports.insider.ui.activities.a) this.f15641b;
                ActivityResult activityResult = (ActivityResult) obj;
                Intrinsics.checkNotNullParameter(activityResult, "activityResult");
                int i5 = activityResult.f194a;
                if (i5 == -1 || i5 == 0 || i5 == 1) {
                    c0.t(MyApp.f6830c, com.sports.insider.ui.activities.a.v(), null, new a0(i5, aVar, null), 2);
                    break;
                }
            default:
                qd.e eVar = (qd.e) this.f15641b;
                ActivityResult it = (ActivityResult) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                try {
                    m q = y3.q(it.f195b);
                    Intrinsics.checkNotNullExpressionValue(q, "getSignedInAccountFromIntent(...)");
                    if (!q.k()) {
                        eVar.H(eVar.f22106b);
                        break;
                    } else if (!q.f25001d) {
                        if (!q.isSuccessful()) {
                            Exception exception = q.getException();
                            d6.e eVar2 = exception instanceof d6.e ? (d6.e) exception : null;
                            if (eVar2 != null) {
                                int i10 = eVar2.f8245a.f4466a;
                                if (i10 != 12501 && i10 != 12502) {
                                    eVar.H(eVar.f22106b);
                                    break;
                                }
                            } else {
                                eVar.H(eVar.f22106b);
                                break;
                            }
                        } else {
                            eVar.H(((GoogleSignInAccount) q.i(d6.e.class)).f4387b);
                            break;
                        }
                    }
                } catch (Exception ex) {
                    Intrinsics.checkNotNullParameter(ex, "ex");
                    jg.d dVar = MyApp.f6830c;
                    lg.e eVar3 = m0.f9201a;
                    c0.t(dVar, lg.d.f20063c, null, new r(ex, continuation, 18), 2);
                    eVar.H(eVar.f22106b);
                }
                break;
        }
    }

    @Override // io.sentry.util.e
    public Object b() {
        io.sentry.cache.tape.h hVar;
        switch (this.f15640a) {
            case 4:
                return ((io.sentry.cache.c) this.f15641b).f16241a.getSerializer();
            case 5:
                io.sentry.cache.g gVar = (io.sentry.cache.g) this.f15641b;
                b6 b6Var = gVar.f16254a;
                File b10 = io.sentry.cache.a.b(b6Var, ".scope-cache");
                if (b10 == null) {
                    b6Var.getLogger().h(b5.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
                    return new io.sentry.cache.tape.b();
                }
                File file = new File(b10, "breadcrumbs.json");
                try {
                    int maxBreadcrumbs = b6Var.getMaxBreadcrumbs();
                    RandomAccessFile c2 = io.sentry.cache.tape.h.c(file);
                    try {
                        try {
                            hVar = new io.sentry.cache.tape.h(file, c2, maxBreadcrumbs);
                        } catch (IOException e7) {
                            b6Var.getLogger().e(b5.ERROR, "Failed to create breadcrumbs queue", e7);
                            return new io.sentry.cache.tape.b();
                        }
                    } catch (Throwable th2) {
                        c2.close();
                        throw th2;
                    }
                } catch (IOException unused) {
                    file.delete();
                    int maxBreadcrumbs2 = b6Var.getMaxBreadcrumbs();
                    RandomAccessFile c8 = io.sentry.cache.tape.h.c(file);
                    try {
                        hVar = new io.sentry.cache.tape.h(file, c8, maxBreadcrumbs2);
                    } catch (Throwable th3) {
                        c8.close();
                        throw th3;
                    }
                }
                return new io.sentry.cache.tape.d(hVar, new i2.d(5, gVar));
            default:
                return Boolean.valueOf(io.sentry.hints.j.z("androidx.core.app.FrameMetricsAggregator", (ILogger) this.f15641b));
        }
    }

    @Override // n0.c
    public boolean c() {
        return ((SplashActivity) this.f15641b).f6900u;
    }

    @Override // io.sentry.util.network.e
    public io.sentry.util.network.b d(Object obj) {
        return io.sentry.okhttp.g.b((io.sentry.okhttp.g) this.f15641b, (o0) obj);
    }

    @Override // w7.f
    public Task e(Object obj) {
        return d5.q((j9.g) this.f15641b);
    }

    public boolean f(i2.d dVar, int i5, Bundle bundle) {
        androidx.core.view.e eVar;
        d0 d0Var = (d0) this.f15641b;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 25 && (i5 & 1) != 0) {
            try {
                ((r0.f) dVar.f10882b).d();
                Parcelable parcelable = (Parcelable) ((r0.f) dVar.f10882b).g();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e7) {
                w0.n("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e7);
                return false;
            }
        }
        r0.f fVar = (r0.f) dVar.f10882b;
        ClipData clipData = new ClipData(fVar.getDescription(), new ClipData.Item(fVar.c()));
        if (i10 >= 31) {
            eVar = new androidx.core.view.d(clipData, 2);
        } else {
            androidx.core.view.f fVar2 = new androidx.core.view.f();
            fVar2.f1310b = clipData;
            fVar2.f1311c = 2;
            eVar = fVar2;
        }
        eVar.b(fVar.e());
        eVar.setExtras(bundle);
        return z0.k(d0Var, eVar.build()) == null;
    }

    @Override // io.sentry.u3
    public void g(io.sentry.z0 it) {
        switch (this.f15640a) {
            case 0:
                it.K(new com.google.firebase.messaging.g(12, (g) this.f15641b, it));
                break;
            case 1:
                Fragment fragment = (Fragment) this.f15641b;
                Intrinsics.checkNotNullParameter(it, "it");
                it.A(io.sentry.android.fragment.d.b(fragment));
                break;
            case 2:
                io.sentry.android.replay.capture.g gVar = (io.sentry.android.replay.capture.g) this.f15641b;
                Intrinsics.checkNotNullParameter(it, "it");
                it.l(gVar.i());
                break;
            default:
                o oVar = (o) this.f15641b;
                Intrinsics.checkNotNullParameter(it, "it");
                it.l(oVar.i());
                String J = it.J();
                String V = J != null ? StringsKt.V('.', J, J) : null;
                io.sentry.android.replay.capture.b bVar = oVar.f15985l;
                u property = io.sentry.android.replay.capture.c.q[2];
                bVar.getClass();
                Intrinsics.checkNotNullParameter(property, "property");
                Object andSet = bVar.f15972b.getAndSet(V);
                if (!Intrinsics.areEqual(andSet, V)) {
                    io.sentry.android.replay.capture.a aVar = new io.sentry.android.replay.capture.a(andSet, V, bVar.f15974d, 4);
                    io.sentry.android.replay.capture.c cVar = bVar.f15973c;
                    b6 b6Var = cVar.f15975a;
                    if (b6Var.getThreadChecker().c()) {
                        ((ScheduledExecutorService) cVar.f15979e.getValue()).submit(new io.sentry.android.replay.util.g(new androidx.core.widget.b(15, aVar), "CaptureStrategy.runInBackground"));
                        break;
                    } else {
                        try {
                            aVar.invoke();
                            break;
                        } catch (Throwable th2) {
                            b6Var.getLogger().e(b5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
                        }
                    }
                }
                break;
        }
    }

    @Override // o8.d
    public Object h(com.google.firebase.messaging.x xVar) {
        return this.f15641b;
    }

    @Override // m5.b
    public Object i() {
        SQLiteDatabase c2;
        int i5 = this.f15640a;
        Object obj = this.f15641b;
        switch (i5) {
            case 9:
                l5.i iVar = (l5.i) ((l5.c) obj);
                iVar.getClass();
                int i10 = h5.a.f10361e;
                com.google.firebase.messaging.x xVar = new com.google.firebase.messaging.x();
                xVar.f6183b = null;
                xVar.f6184c = new ArrayList();
                xVar.f6185d = null;
                xVar.f6182a = "";
                HashMap hashMap = new HashMap();
                c2 = iVar.c();
                c2.beginTransaction();
                try {
                    h5.a aVar = (h5.a) l5.i.z(c2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new androidx.transition.i(iVar, hashMap, xVar, 13));
                    c2.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 10:
                l5.i iVar2 = (l5.i) ((l5.d) obj);
                long time = iVar2.f19381b.getTime() - iVar2.f19383d.f19369d;
                c2 = iVar2.c();
                c2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(time)};
                    Cursor rawQuery = c2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    try {
                        Cursor cursor = rawQuery;
                        while (cursor.moveToNext()) {
                            iVar2.t(cursor.getInt(0), h5.c.MESSAGE_TOO_OLD, cursor.getString(1));
                        }
                        rawQuery.close();
                        int delete = c2.delete("events", "timestamp_ms < ?", strArr);
                        c2.setTransactionSuccessful();
                        c2.endTransaction();
                        return Integer.valueOf(delete);
                    } catch (Throwable th2) {
                        rawQuery.close();
                        throw th2;
                    }
                } finally {
                }
            case 11:
                l5.i iVar3 = (l5.i) ((k5.h) obj).f18841i;
                c2 = iVar3.c();
                c2.beginTransaction();
                try {
                    c2.compileStatement("DELETE FROM log_event_dropped").execute();
                    c2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + iVar3.f19381b.getTime()).execute();
                    c2.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                com.google.firebase.messaging.x xVar2 = (com.google.firebase.messaging.x) obj;
                Iterator it = ((Iterable) ((l5.i) ((l5.d) xVar2.f6183b)).n(new io.sentry.clientreport.a(10))).iterator();
                while (it.hasNext()) {
                    ((v0) xVar2.f6184c).X((e5.i) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // androidx.core.view.x
    public k2 onApplyWindowInsets(View view, k2 k2Var) {
        s0.g gVar = (s0.g) this.f15641b;
        ArrayList arrayList = gVar.f22613b;
        h2 h2Var = k2Var.f1349a;
        g0.d b10 = g0.d.b(h2Var.f(519), h2Var.f(64));
        g0.d b11 = g0.d.b(h2Var.g(519), h2Var.g(64));
        if (!b10.equals(gVar.f22614c) || !b11.equals(gVar.f22615d)) {
            gVar.f22614c = b10;
            gVar.f22615d = b11;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                s0.c cVar = (s0.c) arrayList.get(size);
                cVar.f22601c = b10;
                cVar.f22602d = b11;
                cVar.c();
            }
        }
        return k2Var;
    }

    @Override // w7.d
    public void onSuccess(Object obj) {
        switch (this.f15640a) {
            case 17:
                ((pd.d0) this.f15641b).invoke(obj);
                break;
            default:
                ((cc.a) this.f15641b).invoke(obj);
                break;
        }
    }

    @Override // androidx.swiperefreshlayout.widget.i
    public void p() {
        int i5 = this.f15640a;
        Object obj = this.f15641b;
        switch (i5) {
            case 14:
                t F = ((BonusesInfo) obj).F();
                F.getClass();
                u1.a i10 = d1.i(F);
                h1 h1Var = new h1(1, F, t.class, "identify", "identify(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 4);
                hg.d1 d1Var = F.f21796f;
                t1 t1Var = F.f21797g;
                Continuation continuation = null;
                if (t1Var == null) {
                    Boolean bool = Boolean.FALSE;
                    d1Var.getClass();
                    d1Var.k(null, bool);
                } else if (t1Var.isCancelled()) {
                    F.f21797g = null;
                    Boolean bool2 = Boolean.FALSE;
                    d1Var.getClass();
                    d1Var.k(null, bool2);
                } else {
                    t1 t1Var2 = F.f21797g;
                    if (t1Var2 == null || !t1Var2.N()) {
                        t1 t1Var3 = F.f21797g;
                        if (t1Var3 != null && t1Var3.c()) {
                            Boolean bool3 = Boolean.TRUE;
                            d1Var.getClass();
                            d1Var.k(null, bool3);
                            break;
                        } else {
                            Boolean bool4 = Boolean.TRUE;
                            d1Var.getClass();
                            d1Var.k(null, bool4);
                            break;
                        }
                    } else {
                        F.f21797g = null;
                        Boolean bool5 = Boolean.FALSE;
                        d1Var.getClass();
                        d1Var.k(null, bool5);
                    }
                }
                lg.e eVar = m0.f9201a;
                F.f21797g = c0.t(i10, lg.d.f20063c, null, new oe.j(F, h1Var, continuation, 7), 2);
                break;
            default:
                s H = ((PredictionListFragment) obj).H();
                H.getClass();
                H.j(d1.i(H), new v(2, H, s.class, "refreshPreviewWork", "refreshPreviewWork(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 3), true);
                break;
        }
    }

    public /* synthetic */ c(int i5, Object obj, Object obj2) {
        this.f15640a = i5;
        this.f15641b = obj2;
    }
}
