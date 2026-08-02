package S2;

import Ph.C0;
import Q2.AbstractC1508t;
import Q2.C1493d;
import Q2.F;
import Q2.K;
import R2.A;
import R2.C1543t;
import R2.C1549z;
import R2.InterfaceC1530f;
import R2.InterfaceC1545v;
import R2.U;
import V2.n;
import X2.h;
import X2.p;
import Y2.C;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.impl.constraints.b;
import androidx.work.impl.constraints.f;
import androidx.work.impl.constraints.i;
import androidx.work.impl.constraints.j;
import androidx.work.impl.model.WorkSpec;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public class b implements InterfaceC1545v, f, InterfaceC1530f {

    /* renamed from: o, reason: collision with root package name */
    public static final String f10550o = AbstractC1508t.i("GreedyScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f10551a;

    /* renamed from: c, reason: collision with root package name */
    public S2.a f10553c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10554d;

    /* renamed from: g, reason: collision with root package name */
    public final C1543t f10557g;

    /* renamed from: h, reason: collision with root package name */
    public final U f10558h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.work.a f10559i;

    /* renamed from: k, reason: collision with root package name */
    public Boolean f10561k;

    /* renamed from: l, reason: collision with root package name */
    public final i f10562l;

    /* renamed from: m, reason: collision with root package name */
    public final Z2.b f10563m;

    /* renamed from: n, reason: collision with root package name */
    public final d f10564n;

    /* renamed from: b, reason: collision with root package name */
    public final Map f10552b = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final Object f10555e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final A f10556f = A.create();

    /* renamed from: j, reason: collision with root package name */
    public final Map f10560j = new HashMap();

    /* renamed from: S2.b$b, reason: collision with other inner class name */
    public static class C0204b {

        /* renamed from: a, reason: collision with root package name */
        public final int f10565a;

        /* renamed from: b, reason: collision with root package name */
        public final long f10566b;

        public C0204b(int i10, long j10) {
            this.f10565a = i10;
            this.f10566b = j10;
        }
    }

    public b(Context context, androidx.work.a aVar, n nVar, C1543t c1543t, U u10, Z2.b bVar) {
        this.f10551a = context;
        F k10 = aVar.k();
        this.f10553c = new S2.a(this, k10, aVar.a());
        this.f10564n = new d(k10, u10);
        this.f10563m = bVar;
        this.f10562l = new i(nVar);
        this.f10559i = aVar;
        this.f10557g = c1543t;
        this.f10558h = u10;
    }

    @Override // R2.InterfaceC1545v
    public void a(String str) {
        if (this.f10561k == null) {
            f();
        }
        if (!this.f10561k.booleanValue()) {
            AbstractC1508t.e().f(f10550o, "Ignoring schedule request in non-main process");
            return;
        }
        g();
        AbstractC1508t.e().a(f10550o, "Cancelling work ID " + str);
        S2.a aVar = this.f10553c;
        if (aVar != null) {
            aVar.b(str);
        }
        for (C1549z c1549z : this.f10556f.remove(str)) {
            this.f10564n.b(c1549z);
            this.f10558h.e(c1549z);
        }
    }

    @Override // R2.InterfaceC1545v
    public void b(WorkSpec... workSpecArr) {
        if (this.f10561k == null) {
            f();
        }
        if (!this.f10561k.booleanValue()) {
            AbstractC1508t.e().f(f10550o, "Ignoring schedule request in a secondary process");
            return;
        }
        g();
        HashSet<WorkSpec> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (WorkSpec workSpec : workSpecArr) {
            if (!this.f10556f.a(p.a(workSpec))) {
                long max = Math.max(workSpec.c(), i(workSpec));
                long a10 = this.f10559i.a().a();
                if (workSpec.state == K.c.ENQUEUED) {
                    if (a10 < max) {
                        S2.a aVar = this.f10553c;
                        if (aVar != null) {
                            aVar.a(workSpec, max);
                        }
                    } else if (workSpec.l()) {
                        C1493d c1493d = workSpec.constraints;
                        if (c1493d.j()) {
                            AbstractC1508t.e().a(f10550o, "Ignoring " + workSpec + ". Requires device idle.");
                        } else if (c1493d.g()) {
                            AbstractC1508t.e().a(f10550o, "Ignoring " + workSpec + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(workSpec);
                            hashSet2.add(workSpec.com.facebook.react.devsupport.StackTraceHelper.ID_KEY java.lang.String);
                        }
                    } else if (!this.f10556f.a(p.a(workSpec))) {
                        AbstractC1508t.e().a(f10550o, "Starting work for " + workSpec.com.facebook.react.devsupport.StackTraceHelper.ID_KEY java.lang.String);
                        C1549z d10 = this.f10556f.d(workSpec);
                        this.f10564n.c(d10);
                        this.f10558h.b(d10);
                    }
                }
            }
        }
        synchronized (this.f10555e) {
            try {
                if (!hashSet.isEmpty()) {
                    AbstractC1508t.e().a(f10550o, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    for (WorkSpec workSpec2 : hashSet) {
                        h a11 = p.a(workSpec2);
                        if (!this.f10552b.containsKey(a11)) {
                            this.f10552b.put(a11, j.c(this.f10562l, workSpec2, this.f10563m.b(), this));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // R2.InterfaceC1530f
    public void c(h hVar, boolean z10) {
        C1549z b10 = this.f10556f.b(hVar);
        if (b10 != null) {
            this.f10564n.b(b10);
        }
        h(hVar);
        if (z10) {
            return;
        }
        synchronized (this.f10555e) {
            this.f10560j.remove(hVar);
        }
    }

    @Override // R2.InterfaceC1545v
    public boolean d() {
        return false;
    }

    @Override // androidx.work.impl.constraints.f
    public void e(WorkSpec workSpec, androidx.work.impl.constraints.b bVar) {
        h a10 = p.a(workSpec);
        if (bVar instanceof b.a) {
            if (this.f10556f.a(a10)) {
                return;
            }
            AbstractC1508t.e().a(f10550o, "Constraints met: Scheduling work ID " + a10);
            C1549z e10 = this.f10556f.e(a10);
            this.f10564n.c(e10);
            this.f10558h.b(e10);
            return;
        }
        AbstractC1508t.e().a(f10550o, "Constraints not met: Cancelling work ID " + a10);
        C1549z b10 = this.f10556f.b(a10);
        if (b10 != null) {
            this.f10564n.b(b10);
            this.f10558h.a(b10, ((b.C0420b) bVar).a());
        }
    }

    public final void f() {
        this.f10561k = Boolean.valueOf(C.b(this.f10551a, this.f10559i));
    }

    public final void g() {
        if (this.f10554d) {
            return;
        }
        this.f10557g.e(this);
        this.f10554d = true;
    }

    public final void h(h hVar) {
        C0 c02;
        synchronized (this.f10555e) {
            c02 = (C0) this.f10552b.remove(hVar);
        }
        if (c02 != null) {
            AbstractC1508t.e().a(f10550o, "Stopping tracking for " + hVar);
            c02.cancel((CancellationException) null);
        }
    }

    public final long i(WorkSpec workSpec) {
        long max;
        synchronized (this.f10555e) {
            try {
                h a10 = p.a(workSpec);
                C0204b c0204b = (C0204b) this.f10560j.get(a10);
                if (c0204b == null) {
                    c0204b = new C0204b(workSpec.runAttemptCount, this.f10559i.a().a());
                    this.f10560j.put(a10, c0204b);
                }
                max = c0204b.f10566b + (Math.max((workSpec.runAttemptCount - c0204b.f10565a) - 5, 0) * 30000);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return max;
    }
}
