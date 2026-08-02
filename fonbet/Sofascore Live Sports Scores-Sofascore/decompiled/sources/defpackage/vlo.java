package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Base64;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.u;
import com.bytedance.sdk.component.utils.tsz;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.google.ads.interactivemedia.v3.impl.data.InstrumentationData;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.ads.zzaex;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzgug;
import com.google.android.gms.internal.ads.zzhcv;
import com.google.android.gms.internal.ads.zzhcy;
import com.google.android.gms.internal.ads.zzhea;
import com.google.android.gms.internal.ads.zzjc;
import com.ironsource.U3;
import com.sofascore.results.tutorial.wizard.TutorialWizardView;
import com.sofascore.results.view.SofascoreRatingView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import kotlin.Unit;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vlo implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    public vlo(ddb ddbVar, lj2 lj2Var) {
        this.a = 23;
        ddbVar.getClass();
        this.b = ddbVar;
        this.c = lj2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable b;
        xei xeiVar;
        Object obj;
        tsz tszVar;
        tsz tszVar2;
        b2p e2pVar;
        int i = 0;
        switch (this.a) {
            case 0:
                zzhcv zzhcvVar = (zzhcv) this.c;
                ddb ddbVar = (ddb) this.b;
                if ((ddbVar instanceof zzhea) && (b = ((zzhea) ddbVar).b()) != null) {
                    zzhcvVar.zza(b);
                    return;
                }
                try {
                    zzhcvVar.zzb(zzhcy.j(ddbVar));
                    return;
                } catch (ExecutionException e) {
                    zzhcvVar.zza(e.getCause());
                    return;
                } catch (Throwable th) {
                    zzhcvVar.zza(th);
                    return;
                }
            case 1:
                ((ud) this.b).a = this.c;
                return;
            case 2:
                hk0 hk0Var = (hk0) this.c;
                ik0 ik0Var = (ik0) hk0Var.f;
                if (ik0Var.g == hk0Var.b) {
                    List list = (List) hk0Var.d;
                    i25 i25Var = (i25) this.b;
                    Runnable runnable = (Runnable) hk0Var.e;
                    ik0Var.e = list;
                    ik0Var.f = Collections.unmodifiableList(list);
                    i25Var.b(ik0Var.a);
                    ik0Var.a(runnable);
                    return;
                }
                return;
            case 3:
                TutorialWizardView.b((TutorialWizardView) this.b, (View) this.c, false, false, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), 38);
                return;
            case 4:
                ((aa4) this.c).b.onMessageChannelReady((Bundle) this.b);
                return;
            case 5:
                nq4 nq4Var = (nq4) this.c;
                ArrayList arrayList = (ArrayList) this.b;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    mq4 mq4Var = (mq4) it.next();
                    u uVar = mq4Var.a;
                    int i2 = mq4Var.b;
                    int i3 = mq4Var.c;
                    int i4 = mq4Var.d;
                    int i5 = mq4Var.e;
                    nq4Var.getClass();
                    View view = uVar.itemView;
                    int i6 = i4 - i2;
                    int i7 = i5 - i3;
                    if (i6 != 0) {
                        view.animate().translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    if (i7 != 0) {
                        view.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    ViewPropertyAnimator animate = view.animate();
                    nq4Var.p.add(uVar);
                    animate.setDuration(nq4Var.e).setListener(new jq4(nq4Var, uVar, i6, view, i7, animate)).start();
                }
                arrayList.clear();
                nq4Var.m.remove(arrayList);
                return;
            case 6:
                ((mrb) this.c).U(xei.h.h(((StringBuilder) this.b).toString()), true);
                return;
            case 7:
                ((pv4) this.c).h.K((qic) this.b);
                return;
            case 8:
                ((rv4) this.c).c.c((tz2) this.b);
                return;
            case 9:
                ((rv4) this.c).c.k((zef) this.b);
                return;
            case 10:
                ((ay2) ((vv4) this.c).b).q((qic) this.b);
                return;
            case 11:
                ((AdListener) this.b).onError((Ad) this.c, new AdError(-1, "Can't load Audience Network Dex. Please, check that audience_network folder is inside of assets folder."));
                return;
            case 12:
                e79 a = e79.a();
                a.getClass();
                kik.g();
                a.c.set(true);
                ((a68) this.c).b.b = true;
                ((a68) this.c).a.getViewTreeObserver().removeOnDrawListener((a68) this.b);
                ((a68) this.c).b.a.clear();
                return;
            case 13:
                if (((nz8) this.c).b) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.b).run();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 14:
                if (((t8a) ((yih) this.c).d).w.a == rk3.e) {
                    return;
                }
                p8a p8aVar = ((t8a) ((yih) this.c).d).v;
                yih yihVar = (yih) this.c;
                p8a p8aVar2 = (p8a) yihVar.c;
                t8a t8aVar = (t8a) yihVar.d;
                if (p8aVar == p8aVar2) {
                    t8aVar.v = null;
                    ((t8a) ((yih) this.c).d).l.d();
                    ((t8a) ((yih) this.c).d).e(rk3.d);
                    return;
                }
                if (t8aVar.u == p8aVar2) {
                    z1a.C(((t8a) ((yih) this.c).d).w.a, "Expected state is CONNECTING, actual state is %s", t8aVar.w.a == rk3.a);
                    q8a q8aVar = ((t8a) ((yih) this.c).d).l;
                    sp5 sp5Var = (sp5) q8aVar.a.get(q8aVar.b);
                    int i8 = q8aVar.c + 1;
                    q8aVar.c = i8;
                    if (i8 >= sp5Var.a.size()) {
                        q8aVar.b++;
                        q8aVar.c = 0;
                    }
                    q8a q8aVar2 = ((t8a) ((yih) this.c).d).l;
                    int i9 = q8aVar2.b;
                    int size = q8aVar2.a.size();
                    t8a t8aVar2 = (t8a) ((yih) this.c).d;
                    if (i9 < size) {
                        t8aVar2.h();
                        return;
                    }
                    t8aVar2.u = null;
                    t8aVar2.l.d();
                    t8a t8aVar3 = (t8a) ((yih) this.c).d;
                    xei xeiVar2 = (xei) this.b;
                    t8aVar3.k.i();
                    z1a.r("The error status must not be OK", !xeiVar2.f());
                    t8aVar3.f(new sk3(rk3.c, xeiVar2));
                    bj6 bj6Var = t8aVar3.n;
                    if (bj6Var == null) {
                        t8aVar3.c.getClass();
                        bj6Var = ccd.r();
                        t8aVar3.n = bj6Var;
                    }
                    long a2 = bj6Var.a();
                    jfi jfiVar = t8aVar3.o;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    long a3 = a2 - jfiVar.a();
                    t8aVar3.i.E("TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", 2, t8a.g(xeiVar2), Long.valueOf(a3));
                    z1a.D("previous reconnectTask is not done", t8aVar3.p == null);
                    t8aVar3.p = t8aVar3.k.f(t8aVar3.f, new n8a(t8aVar3, i), a3, timeUnit);
                    return;
                }
                return;
            case 15:
                break;
            case 16:
                rm0 rm0Var = c8a.a;
                krb krbVar = (krb) this.c;
                qrb qrbVar = krbVar.m;
                if (qrbVar.v != krbVar.l) {
                    return;
                }
                k3d k3dVar = (k3d) this.b;
                List list2 = k3dVar.a;
                qrbVar.N.E("Resolved address: {0}, config={1}", 1, list2, k3dVar.b);
                qrb qrbVar2 = ((krb) this.c).m;
                if (qrbVar2.b0 != 2) {
                    qrbVar2.N.E("Address resolved: {0}", 2, list2);
                    ((krb) this.c).m.b0 = 2;
                }
                k3d k3dVar2 = (k3d) this.b;
                j3d j3dVar = k3dVar2.c;
                a4g a4gVar = (a4g) k3dVar2.b.a.get(c4g.l);
                c8a c8aVar = (c8a) ((k3d) this.b).b.a.get(rm0Var);
                yrb yrbVar = (j3dVar == null || (obj = j3dVar.b) == null) ? null : (yrb) obj;
                xei xeiVar3 = j3dVar != null ? j3dVar.a : null;
                qrb qrbVar3 = ((krb) this.c).m;
                int i10 = 15;
                int i11 = 20;
                if (qrbVar3.S) {
                    if (yrbVar != null) {
                        nrb nrbVar = qrbVar3.P;
                        if (c8aVar != null) {
                            nrbVar.h(c8aVar);
                            if (yrbVar.b() != null) {
                                ((krb) this.c).m.N.D(1, "Method configs in service config will be discarded due to presence ofconfig-selector");
                            }
                        } else {
                            nrbVar.h(yrbVar.b());
                        }
                    } else if (xeiVar3 == null) {
                        yrbVar = qrb.g0;
                        qrbVar3.P.h(null);
                    } else {
                        if (!qrbVar3.R) {
                            qrbVar3.N.D(2, "Fallback to error due to invalid first service config without default config");
                            ((krb) this.c).z(j3dVar.a);
                            if (a4gVar != null) {
                                boolean f = j3dVar.a.f();
                                c4g c4gVar = a4gVar.a;
                                az0 az0Var = c4gVar.j;
                                if (!f) {
                                    az0Var.a(new kac(c4gVar, i10));
                                    return;
                                }
                                xx3 xx3Var = az0Var.b;
                                xx3Var.i();
                                xx3Var.execute(new y2(az0Var, i11));
                                return;
                            }
                            return;
                        }
                        yrbVar = qrbVar3.Q;
                    }
                    if (!yrbVar.equals(((krb) this.c).m.Q)) {
                        ((krb) this.c).m.N.E("Service config changed{0}", 2, yrbVar == qrb.g0 ? " to empty" : "");
                        qrb qrbVar4 = ((krb) this.c).m;
                        qrbVar4.Q = yrbVar;
                        qrbVar4.Z.b = yrbVar.d;
                    }
                    try {
                        ((krb) this.c).m.R = true;
                    } catch (RuntimeException e2) {
                        qrb.c0.log(Level.WARNING, U3.j.d + ((krb) this.c).m.a + "] Unexpected exception from parsing service config", (Throwable) e2);
                    }
                } else {
                    if (yrbVar != null) {
                        qrbVar3.N.D(2, "Service config from name resolver discarded by channel settings");
                    }
                    qrb qrbVar5 = ((krb) this.c).m;
                    yrbVar = qrb.g0;
                    if (c8aVar != null) {
                        qrbVar5.N.D(2, "Config selector from name resolver discarded by channel settings");
                    }
                    ((krb) this.c).m.P.h(yrbVar.b());
                }
                sm0 sm0Var = ((k3d) this.b).b;
                krb krbVar2 = (krb) this.c;
                if (krbVar2.k == krbVar2.m.x) {
                    sm0Var.getClass();
                    f4a f4aVar = new f4a(sm0Var, 26);
                    if (((sm0) f4aVar.b).a.containsKey(rm0Var)) {
                        IdentityHashMap identityHashMap = new IdentityHashMap(((sm0) f4aVar.b).a);
                        identityHashMap.remove(rm0Var);
                        f4aVar.b = new sm0(identityHashMap);
                    }
                    IdentityHashMap identityHashMap2 = (IdentityHashMap) f4aVar.c;
                    if (identityHashMap2 != null) {
                        identityHashMap2.remove(rm0Var);
                    }
                    Map map = yrbVar.f;
                    if (map != null) {
                        f4aVar.x(ffb.c, map);
                        f4aVar.c();
                    }
                    sm0 c = f4aVar.c();
                    g7h g7hVar = ((krb) this.c).k.h;
                    sm0 sm0Var2 = sm0.b;
                    Object obj2 = yrbVar.e;
                    z1a.y(list2, "addresses");
                    List unmodifiableList = Collections.unmodifiableList(new ArrayList(list2));
                    z1a.y(c, "attributes");
                    jrb jrbVar = (jrb) g7hVar.b;
                    t6h t6hVar = (t6h) obj2;
                    if (t6hVar == null) {
                        try {
                            f4a f4aVar2 = (f4a) g7hVar.e;
                            String str = (String) f4aVar2.c;
                            gfb b2 = ((hfb) f4aVar2.b).b(str);
                            if (b2 == null) {
                                throw new gq0("Trying to load '" + str + "' because using default policy, but it's unavailable");
                            }
                            t6hVar = new t6h(b2, null);
                        } catch (gq0 e3) {
                            jrbVar.M(rk3.c, new frb(xei.l.h(e3.getMessage())));
                            ((ffb) g7hVar.c).z();
                            g7hVar.d = null;
                            g7hVar.c = new fq0(i);
                            xeiVar = xei.e;
                        }
                    }
                    Object obj3 = t6hVar.b;
                    gfb gfbVar = t6hVar.a;
                    if (((gfb) g7hVar.d) == null || !gfbVar.a().equals(((gfb) g7hVar.d).a())) {
                        jrbVar.M(rk3.a, new eq0(i));
                        ((ffb) g7hVar.c).z();
                        g7hVar.d = gfbVar;
                        ffb ffbVar = (ffb) g7hVar.c;
                        g7hVar.c = gfbVar.b(jrbVar);
                        jrbVar.i.N.E("Load balancer changed from {0} to {1}", 2, ffbVar.getClass().getSimpleName(), ((ffb) g7hVar.c).getClass().getSimpleName());
                    }
                    if (obj3 != null) {
                        jrbVar.i.N.E("Load-balancing config: {0}", 1, obj3);
                    }
                    xeiVar = ((ffb) g7hVar.c).a(new cfb(unmodifiableList, c, obj3));
                    if (a4gVar != null) {
                        boolean f2 = xeiVar.f();
                        c4g c4gVar2 = a4gVar.a;
                        az0 az0Var2 = c4gVar2.j;
                        if (!f2) {
                            az0Var2.a(new kac(c4gVar2, i10));
                            return;
                        }
                        xx3 xx3Var2 = az0Var2.b;
                        xx3Var2.i();
                        xx3Var2.execute(new y2(az0Var2, i11));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ((g0c) this.c).b((na3) this.b);
                return;
            case 18:
                ((lj2) this.c).D((te6) this.b, Unit.a);
                return;
            case 19:
                ((grb) ((k1d) this.c).c).u.q((qic) this.b);
                return;
            case 20:
                ((grb) ((k1d) this.c).c).u.v((cqa) this.b);
                return;
            case 21:
                e92 e92Var = (e92) this.c;
                int max = Math.max(((SofascoreRatingView) e92Var.d).getWidth(), ((SofascoreRatingView) e92Var.c).getWidth());
                ((Guideline) e92Var.f).setGuidelineBegin(max);
                ((Guideline) e92Var.b).setGuidelineEnd(max);
                return;
            case 22:
                try {
                    ((Runnable) this.c).run();
                    synchronized (((n5h) this.b).e) {
                        ((n5h) this.b).a();
                    }
                    return;
                } catch (Throwable th2) {
                    synchronized (((n5h) this.b).e) {
                        ((n5h) this.b).a();
                        throw th2;
                    }
                }
            case 23:
                ddb ddbVar2 = (ddb) this.b;
                boolean isCancelled = ddbVar2.isCancelled();
                lj2 lj2Var = (lj2) this.c;
                if (isCancelled) {
                    lj2Var.a(null);
                    return;
                }
                try {
                    p2g p2gVar = w2g.b;
                    while (true) {
                        try {
                            Object obj4 = ddbVar2.get();
                            if (i != 0) {
                                Thread.currentThread().interrupt();
                            }
                            lj2Var.resumeWith(obj4);
                            return;
                        } catch (InterruptedException unused2) {
                            i = 1;
                        } catch (Throwable th3) {
                            if (i != 0) {
                                Thread.currentThread().interrupt();
                            }
                            throw th3;
                        }
                    }
                } catch (ExecutionException e4) {
                    p2g p2gVar2 = w2g.b;
                    Throwable cause = e4.getCause();
                    cause.getClass();
                    lj2Var.resumeWith(new u2g(cause));
                    return;
                }
            case 24:
                ((g6b) this.b).a((yo8) this.c);
                return;
            case 25:
                csm csmVar = (csm) this.c;
                csm.ork(csmVar);
                tszVar = csmVar.dax;
                if (tszVar != null) {
                    tszVar2 = csmVar.dax;
                    tszVar2.obtainMessage(111, (SurfaceTexture) this.b).sendToTarget();
                    return;
                }
                return;
            case 26:
                ListenerHolder listenerHolder = (ListenerHolder) this.b;
                ListenerHolder.Notifier notifier = (ListenerHolder.Notifier) this.c;
                ListenerHolder.ListenerKey listenerKey = listenerHolder.b;
                if (listenerKey == null) {
                    notifier.b();
                    return;
                }
                try {
                    notifier.a(listenerKey.a);
                    return;
                } catch (RuntimeException e5) {
                    notifier.b();
                    throw e5;
                }
            case 27:
                l6n l6nVar = (l6n) this.b;
                String str2 = (String) this.c;
                t6o t6oVar = l6nVar.c;
                pic picVar = t6oVar.c;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) picVar.c;
                if (concurrentHashMap.containsKey(str2)) {
                    sen senVar = ((u7o) concurrentHashMap.get(str2)).a;
                    int i12 = picVar.a;
                    nen s = oen.s();
                    s.b();
                    ((oen) s.b).w(i12);
                    int i13 = ((u7o) concurrentHashMap.get(str2)).b;
                    s.b();
                    ((oen) s.b).u(i13);
                    gen genVar = (gen) picVar.d;
                    s.b();
                    ((oen) s.b).t((hen) genVar.c());
                    senVar.d((uen) ((sen) picVar.e).c());
                    s.b();
                    ((oen) s.b).v((uen) senVar.c());
                    e2pVar = new e2p((oen) s.c());
                } else {
                    e2pVar = u1p.a;
                }
                if (e2pVar.d()) {
                    t6oVar.e(InstrumentationData.createForLatencyMeasurement(System.currentTimeMillis(), InstrumentationData.Component.LATENCY_MEASUREMENT_TRACKER, InstrumentationData.Method.FLUSH_LATENCY_MEASUREMENT, Base64.encodeToString(((oen) e2pVar.g()).b(), 0)));
                    concurrentHashMap.remove(str2);
                    return;
                }
                return;
            case 28:
                ((rfn) ((o4n) this.b).c).c.remove((String) this.c);
                return;
            default:
                zzaex zzaexVar = (zzaex) this.b;
                zzjc zzjcVar = (zzjc) this.c;
                zzaexVar.getClass();
                String str3 = zzfm.a;
                zzaexVar.b.d(zzjcVar);
                return;
        }
        while (true) {
            try {
                ((Runnable) this.b).run();
            } catch (Throwable th4) {
                qx9.A(g.a, th4);
            }
            Runnable g0 = ((k7b) this.c).g0();
            if (g0 == null) {
                return;
            }
            try {
                this.b = g0;
                i++;
                if (i >= 16) {
                    k7b k7bVar = (k7b) this.c;
                    if (t45.c(k7bVar.d, k7bVar)) {
                        k7b k7bVar2 = (k7b) this.c;
                        t45.b(k7bVar2.d, k7bVar2, this);
                        return;
                    }
                }
            } catch (Throwable th5) {
                k7b k7bVar3 = (k7b) this.c;
                synchronized (k7bVar3.g) {
                    k7b.h.decrementAndGet(k7bVar3);
                    throw th5;
                }
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                zzgug zzgugVar = new zzgug(vlo.class.getSimpleName());
                zzhcv zzhcvVar = (zzhcv) this.c;
                f0o f0oVar = new f0o(20);
                zzgugVar.c.c = f0oVar;
                zzgugVar.c = f0oVar;
                f0oVar.b = zzhcvVar;
                return zzgugVar.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ vlo(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ vlo(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
