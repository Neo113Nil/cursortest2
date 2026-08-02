package g3;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.android.billingclient.api.m;
import e3.i;
import e3.i0;
import e3.x;
import eg.e1;
import eg.w;
import f3.f;
import f3.h;
import f3.k;
import i3.g;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k2.a0;
import kotlin.jvm.internal.Intrinsics;
import m3.j;
import m3.o;
import n3.l;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c implements h, g, f3.c {

    /* renamed from: o, reason: collision with root package name */
    public static final String f9720o = x.g("GreedyScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f9721a;

    /* renamed from: c, reason: collision with root package name */
    public final a f9723c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9724d;

    /* renamed from: g, reason: collision with root package name */
    public final f f9727g;

    /* renamed from: h, reason: collision with root package name */
    public final l1.a f9728h;

    /* renamed from: i, reason: collision with root package name */
    public final e3.c f9729i;

    /* renamed from: k, reason: collision with root package name */
    public Boolean f9730k;

    /* renamed from: l, reason: collision with root package name */
    public final m f9731l;

    /* renamed from: m, reason: collision with root package name */
    public final com.google.firebase.messaging.x f9732m;

    /* renamed from: n, reason: collision with root package name */
    public final d f9733n;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f9722b = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final Object f9725e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final io.sentry.internal.debugmeta.c f9726f = new io.sentry.internal.debugmeta.c(new i(1));
    public final HashMap j = new HashMap();

    public c(Context context, e3.c cVar, c4.d dVar, f fVar, l1.a aVar, com.google.firebase.messaging.x xVar) {
        this.f9721a = context;
        f3.b bVar = cVar.f8481g;
        this.f9723c = new a(this, bVar, cVar.f8478d);
        this.f9733n = new d(bVar, aVar);
        this.f9732m = xVar;
        this.f9731l = new m(dVar);
        this.f9729i = cVar;
        this.f9727g = fVar;
        this.f9728h = aVar;
    }

    @Override // f3.c
    public final void a(j jVar, boolean z5) {
        k q = this.f9726f.q(jVar);
        if (q != null) {
            this.f9733n.a(q);
        }
        f(jVar);
        if (z5) {
            return;
        }
        synchronized (this.f9725e) {
            this.j.remove(jVar);
        }
    }

    @Override // i3.g
    public final void b(o oVar, i3.c cVar) {
        j j = m4.g.j(oVar);
        boolean z5 = cVar instanceof i3.a;
        l1.a aVar = this.f9728h;
        d dVar = this.f9733n;
        String str = f9720o;
        io.sentry.internal.debugmeta.c cVar2 = this.f9726f;
        if (!z5) {
            x.e().a(str, "Constraints not met: Cancelling work ID " + j);
            k workSpecId = cVar2.q(j);
            if (workSpecId != null) {
                dVar.a(workSpecId);
                int i5 = ((i3.b) cVar).f10903a;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
                aVar.D(workSpecId, i5);
                return;
            }
            return;
        }
        if (cVar2.f(j)) {
            return;
        }
        x.e().a(str, "Constraints met: Scheduling work ID " + j);
        k workSpecId2 = cVar2.r(j);
        dVar.b(workSpecId2);
        aVar.getClass();
        Intrinsics.checkNotNullParameter(workSpecId2, "workSpecId");
        Intrinsics.checkNotNullParameter(workSpecId2, "workSpecId");
        ((a0) ((com.google.firebase.messaging.x) aVar.f19315c).f6182a).execute(new androidx.fragment.app.d(aVar, workSpecId2, (Object) null, 12));
    }

    @Override // f3.h
    public final boolean c() {
        return false;
    }

    @Override // f3.h
    public final void d(String workSpecId) {
        List<k> h10;
        Runnable runnable;
        String str = f9720o;
        if (this.f9730k == null) {
            this.f9730k = Boolean.valueOf(l.a(this.f9721a, this.f9729i));
        }
        if (!this.f9730k.booleanValue()) {
            x.e().f(str, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f9724d) {
            this.f9727g.a(this);
            this.f9724d = true;
        }
        x.e().a(str, "Cancelling work ID " + workSpecId);
        a aVar = this.f9723c;
        if (aVar != null && (runnable = (Runnable) aVar.f9717d.remove(workSpecId)) != null) {
            aVar.f9715b.f9329a.removeCallbacks(runnable);
        }
        io.sentry.internal.debugmeta.c cVar = this.f9726f;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        synchronized (cVar.f16518c) {
            h10 = ((i) cVar.f16517b).h(workSpecId);
        }
        for (k workSpecId2 : h10) {
            this.f9733n.a(workSpecId2);
            l1.a aVar2 = this.f9728h;
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(workSpecId2, "workSpecId");
            aVar2.D(workSpecId2, -512);
        }
    }

    @Override // f3.h
    public final void e(o... oVarArr) {
        if (this.f9730k == null) {
            this.f9730k = Boolean.valueOf(l.a(this.f9721a, this.f9729i));
        }
        if (!this.f9730k.booleanValue()) {
            x.e().f(f9720o, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f9724d) {
            this.f9727g.a(this);
            this.f9724d = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (o spec : oVarArr) {
            if (!this.f9726f.f(m4.g.j(spec))) {
                long max = Math.max(spec.a(), g(spec));
                this.f9729i.f8478d.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (spec.f20332b == i0.f8524a) {
                    if (currentTimeMillis < max) {
                        a aVar = this.f9723c;
                        if (aVar != null) {
                            f3.b bVar = aVar.f9715b;
                            HashMap hashMap = aVar.f9717d;
                            Runnable runnable = (Runnable) hashMap.remove(spec.f20331a);
                            if (runnable != null) {
                                bVar.f9329a.removeCallbacks(runnable);
                            }
                            g8.a aVar2 = new g8.a(21, aVar, spec, false);
                            hashMap.put(spec.f20331a, aVar2);
                            aVar.f9716c.getClass();
                            bVar.f9329a.postDelayed(aVar2, max - System.currentTimeMillis());
                        }
                    } else if (!Intrinsics.areEqual(e3.f.j, spec.j)) {
                        e3.f fVar = spec.j;
                        if (fVar.f8509d) {
                            x.e().a(f9720o, "Ignoring " + spec + ". Requires device idle.");
                        } else if (Build.VERSION.SDK_INT < 24 || !fVar.b()) {
                            hashSet.add(spec);
                            hashSet2.add(spec.f20331a);
                        } else {
                            x.e().a(f9720o, "Ignoring " + spec + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.f9726f.f(m4.g.j(spec))) {
                        x.e().a(f9720o, "Starting work for " + spec.f20331a);
                        io.sentry.internal.debugmeta.c cVar = this.f9726f;
                        cVar.getClass();
                        Intrinsics.checkNotNullParameter(spec, "spec");
                        k workSpecId = cVar.r(m4.g.j(spec));
                        this.f9733n.b(workSpecId);
                        l1.a aVar3 = this.f9728h;
                        aVar3.getClass();
                        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
                        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
                        ((a0) ((com.google.firebase.messaging.x) aVar3.f19315c).f6182a).execute(new androidx.fragment.app.d(aVar3, workSpecId, (Object) null, 12));
                    }
                }
            }
        }
        synchronized (this.f9725e) {
            try {
                if (!hashSet.isEmpty()) {
                    x.e().a(f9720o, "Starting tracking for " + TextUtils.join(StringUtils.COMMA, hashSet2));
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        o oVar = (o) it.next();
                        j j = m4.g.j(oVar);
                        if (!this.f9722b.containsKey(j)) {
                            this.f9722b.put(j, i3.k.a(this.f9731l, oVar, (w) this.f9732m.f6183b, this));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(j jVar) {
        e1 e1Var;
        synchronized (this.f9725e) {
            e1Var = (e1) this.f9722b.remove(jVar);
        }
        if (e1Var != null) {
            x.e().a(f9720o, "Stopping tracking for " + jVar);
            e1Var.k(null);
        }
    }

    public final long g(o oVar) {
        long max;
        synchronized (this.f9725e) {
            try {
                j j = m4.g.j(oVar);
                b bVar = (b) this.j.get(j);
                if (bVar == null) {
                    int i5 = oVar.f20340k;
                    this.f9729i.f8478d.getClass();
                    bVar = new b(i5, System.currentTimeMillis());
                    this.j.put(j, bVar);
                }
                max = (Math.max((oVar.f20340k - bVar.f9718a) - 5, 0) * 30000) + bVar.f9719b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return max;
    }
}
