package defpackage;

import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class grb implements yx2 {
    public static final jic E;
    public static final jic F;
    public static final xei G;
    public static final Random H;
    public final /* synthetic */ ujg A;
    public final /* synthetic */ jh2 B;
    public final /* synthetic */ bq3 C;
    public final /* synthetic */ ggf D;
    public final ujg a;
    public final Executor b;
    public final xx3 c;
    public final ScheduledExecutorService d;
    public final qic e;
    public final z3g f;
    public final k99 g;
    public final boolean h;
    public final Object i;
    public final yia j;
    public final long k;
    public final long l;
    public final s3g m;
    public final zl1 n;
    public volatile p3g o;
    public final AtomicBoolean p;
    public final AtomicInteger q;
    public final AtomicInteger r;
    public sx2 s;
    public long t;
    public ay2 u;
    public yih v;
    public yih w;
    public long x;
    public xei y;
    public boolean z;

    static {
        it7 it7Var = qic.d;
        BitSet bitSet = mic.d;
        E = new jic("grpc-previous-rpc-attempts", it7Var);
        F = new jic("grpc-retry-pushback-ms", it7Var);
        G = xei.f.h("Stream thrown away because RetriableStream committed");
        H = new Random();
    }

    public grb(ggf ggfVar, ujg ujgVar, qic qicVar, jh2 jh2Var, z3g z3gVar, k99 k99Var, bq3 bq3Var) {
        this.D = ggfVar;
        this.A = ujgVar;
        this.B = jh2Var;
        this.C = bq3Var;
        qrb qrbVar = (qrb) ggfVar.a;
        yia yiaVar = qrbVar.T;
        long j = qrbVar.U;
        long j2 = qrbVar.V;
        Executor executor = jh2Var.b;
        executor = executor == null ? qrbVar.h : executor;
        ScheduledExecutorService scheduledExecutorService = qrbVar.f.a.d;
        s3g s3gVar = (s3g) ggfVar.b;
        this.c = new xx3(new f3g());
        this.i = new Object();
        this.n = new zl1(3);
        this.o = new p3g(new ArrayList(8), Collections.EMPTY_LIST, null, null, false, false, false, 0);
        this.p = new AtomicBoolean();
        this.q = new AtomicInteger();
        this.r = new AtomicInteger();
        this.a = ujgVar;
        this.j = yiaVar;
        this.k = j;
        this.l = j2;
        this.b = executor;
        this.d = scheduledExecutorService;
        this.e = qicVar;
        this.f = z3gVar;
        if (z3gVar != null) {
            this.x = z3gVar.b;
        }
        this.g = k99Var;
        z1a.r("Should not provide both retryPolicy and hedgingPolicy", z3gVar == null || k99Var == null);
        this.h = k99Var != null;
        this.m = s3gVar;
    }

    @Override // defpackage.igi
    public final void H() {
        p3g p3gVar = this.o;
        if (p3gVar.a) {
            p3gVar.f.a.H();
        } else {
            e(new i3g(3));
        }
    }

    public final g3g a(r3g r3gVar) {
        List list;
        boolean z;
        Collection collection;
        Future future;
        Future future2;
        synchronized (this.i) {
            try {
                if (this.o.f != null) {
                    return null;
                }
                Collection collection2 = this.o.c;
                p3g p3gVar = this.o;
                z1a.D("Already committed", p3gVar.f == null);
                List list2 = p3gVar.b;
                if (p3gVar.c.contains(r3gVar)) {
                    list = null;
                    collection = Collections.singleton(r3gVar);
                    z = true;
                } else {
                    list = list2;
                    z = false;
                    collection = Collections.EMPTY_LIST;
                }
                this.o = new p3g(list, collection, p3gVar.d, r3gVar, p3gVar.g, z, p3gVar.h, p3gVar.e);
                ((AtomicLong) this.j.b).addAndGet(-this.t);
                yih yihVar = this.v;
                if (yihVar != null) {
                    yihVar.b = true;
                    Future future3 = (Future) yihVar.d;
                    this.v = null;
                    future = future3;
                } else {
                    future = null;
                }
                yih yihVar2 = this.w;
                if (yihVar2 != null) {
                    yihVar2.b = true;
                    Future future4 = (Future) yihVar2.d;
                    this.w = null;
                    future2 = future4;
                } else {
                    future2 = null;
                }
                return new g3g(this, collection2, r3gVar, future, future2, 0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final r3g b(int i, boolean z) {
        AtomicInteger atomicInteger;
        int i2;
        do {
            atomicInteger = this.r;
            i2 = atomicInteger.get();
            if (i2 < 0) {
                return null;
            }
        } while (!atomicInteger.compareAndSet(i2, i2 + 1));
        r3g r3gVar = new r3g(i);
        l3g l3gVar = new l3g(new n3g(this, r3gVar));
        qic qicVar = new qic();
        qicVar.d(this.e);
        if (i > 0) {
            qicVar.e(E, String.valueOf(i));
        }
        jh2 jh2Var = this.B;
        jh2Var.getClass();
        List list = jh2Var.d;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(l3gVar);
        nc3 b = jh2.b(jh2Var);
        b.d = Collections.unmodifiableList(arrayList);
        jh2 jh2Var2 = new jh2(b);
        cy2[] c = n49.c(jh2Var2, qicVar, i, z);
        ujg ujgVar = this.A;
        dy2 e = this.D.e(new kge(ujgVar, qicVar, jh2Var2));
        bq3 bq3Var = this.C;
        bq3 a = bq3Var.a();
        try {
            yx2 d = e.d(ujgVar, qicVar, jh2Var2, c);
            bq3Var.c(a);
            r3gVar.a = d;
            return r3gVar;
        } catch (Throwable th) {
            bq3Var.c(a);
            throw th;
        }
    }

    @Override // defpackage.igi
    public final void c(tz2 tz2Var) {
        e(new h3g(tz2Var, 0));
    }

    @Override // defpackage.yx2
    public final void d(int i) {
        e(new j3g(i, 1));
    }

    public final void e(m3g m3gVar) {
        Collection collection;
        synchronized (this.i) {
            try {
                if (!this.o.a) {
                    this.o.b.add(m3gVar);
                }
                collection = this.o.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m3gVar.a((r3g) it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        r9.c.execute(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r4 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        r10.a.w(new defpackage.k1d(r9, r10, r0, 29));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        r0 = r10.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (r9.o.f != r10) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        r9 = r9.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        r0.l(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        r9 = defpackage.grb.G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008d, code lost:
    
        r2 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0095, code lost:
    
        if (r2.hasNext() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0097, code lost:
    
        r5 = (defpackage.m3g) r2.next();
        r5.a(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a2, code lost:
    
        if ((r5 instanceof defpackage.o3g) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a4, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:
    
        r5 = r9.o;
        r6 = r5.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a9, code lost:
    
        if (r6 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ab, code lost:
    
        if (r6 == r10) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b0, code lost:
    
        if (r5.g == false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(r3g r3gVar) {
        int min;
        boolean z = false;
        kac kacVar = null;
        int i = 0;
        boolean z2 = false;
        ArrayList arrayList = null;
        while (true) {
            synchronized (this.i) {
                try {
                    p3g p3gVar = this.o;
                    r3g r3gVar2 = p3gVar.f;
                    if (r3gVar2 == null || r3gVar2 == r3gVar) {
                        if (!p3gVar.g) {
                            if (i == p3gVar.b.size()) {
                                this.o = p3gVar.d(r3gVar);
                                if (!isReady()) {
                                    return;
                                } else {
                                    kacVar = new kac(this, 13);
                                }
                            } else {
                                if (r3gVar.b) {
                                    return;
                                }
                                min = Math.min(i + 128, p3gVar.b.size());
                                if (arrayList == null) {
                                    arrayList = new ArrayList(p3gVar.b.subList(i, min));
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(p3gVar.b.subList(i, min));
                                }
                            }
                        }
                    }
                } finally {
                }
            }
            i = min;
        }
    }

    @Override // defpackage.igi
    public final void flush() {
        p3g p3gVar = this.o;
        if (p3gVar.a) {
            p3gVar.f.a.flush();
        } else {
            e(new i3g(0));
        }
    }

    public final void g() {
        Future future;
        synchronized (this.i) {
            try {
                yih yihVar = this.w;
                future = null;
                if (yihVar != null) {
                    yihVar.b = true;
                    Future future2 = (Future) yihVar.d;
                    this.w = null;
                    future = future2;
                }
                p3g p3gVar = this.o;
                if (!p3gVar.h) {
                    p3gVar = new p3g(p3gVar.b, p3gVar.c, p3gVar.d, p3gVar.f, p3gVar.g, p3gVar.a, true, p3gVar.e);
                }
                this.o = p3gVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    public final boolean h(p3g p3gVar) {
        return p3gVar.f == null && p3gVar.e < this.g.a && !p3gVar.h;
    }

    public final void i(Integer num) {
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            g();
            return;
        }
        synchronized (this.i) {
            try {
                yih yihVar = this.w;
                if (yihVar == null) {
                    return;
                }
                yihVar.b = true;
                Future future = (Future) yihVar.d;
                yih yihVar2 = new yih(this.i);
                this.w = yihVar2;
                boolean z = false;
                if (future != null) {
                    future.cancel(false);
                }
                yihVar2.n(this.d.schedule(new pyn(this, yihVar2, z, 17), num.intValue(), TimeUnit.MILLISECONDS));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.igi
    public final boolean isReady() {
        Iterator it = this.o.c.iterator();
        while (it.hasNext()) {
            if (((r3g) it.next()).a.isReady()) {
                return true;
            }
        }
        return false;
    }

    public final void j(xei xeiVar, zx2 zx2Var, qic qicVar) {
        this.s = new sx2(xeiVar, zx2Var, qicVar);
        if (this.r.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.c.execute(new n2(this, xeiVar, zx2Var, qicVar, 3));
        }
    }

    @Override // defpackage.igi
    public final void k(zef zefVar) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // defpackage.yx2
    public final void l(xei xeiVar) {
        r3g r3gVar;
        r3g r3gVar2 = new r3g(0);
        r3gVar2.a = new uxf(5);
        g3g a = a(r3gVar2);
        Object obj = this.i;
        if (a != null) {
            synchronized (obj) {
                this.o = this.o.d(r3gVar2);
            }
            a.run();
            j(xeiVar, zx2.a, new qic());
            return;
        }
        synchronized (obj) {
            try {
                if (this.o.c.contains(this.o.f)) {
                    r3gVar = this.o.f;
                } else {
                    this.y = xeiVar;
                    r3gVar = null;
                }
                p3g p3gVar = this.o;
                this.o = new p3g(p3gVar.b, p3gVar.c, p3gVar.d, p3gVar.f, true, p3gVar.a, p3gVar.h, p3gVar.e);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (r3gVar != null) {
            r3gVar.a.l(xeiVar);
        }
    }

    @Override // defpackage.yx2
    public final void m(int i) {
        e(new j3g(i, 0));
    }

    public final void n(Object obj) {
        p3g p3gVar = this.o;
        if (p3gVar.a) {
            p3gVar.f.a.k(new zef((MessageLite) obj, ((aff) this.a.d).a));
        } else {
            e(new k3g(this, obj));
        }
    }

    @Override // defpackage.igi
    public final void o() {
        e(new i3g(2));
    }

    @Override // defpackage.yx2
    public final void r(om4 om4Var) {
        e(new h3g(om4Var, 2));
    }

    @Override // defpackage.yx2
    public final void s(hl4 hl4Var) {
        e(new h3g(hl4Var, 1));
    }

    @Override // defpackage.yx2
    public final void t() {
        e(new i3g(1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        if ((r3.d.get() > r3.b) != false) goto L36;
     */
    @Override // defpackage.yx2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(ay2 ay2Var) {
        xei xeiVar;
        yih yihVar;
        this.u = ay2Var;
        ujg ujgVar = ((qrb) this.D.a).F;
        synchronized (ujgVar.b) {
            try {
                xeiVar = (xei) ujgVar.d;
                yihVar = null;
                if (xeiVar == null) {
                    ((HashSet) ujgVar.c).add(this);
                    xeiVar = null;
                }
            } finally {
            }
        }
        if (xeiVar != null) {
            l(xeiVar);
            return;
        }
        synchronized (this.i) {
            this.o.b.add(new o3g(this));
        }
        boolean z = false;
        r3g b = b(0, false);
        if (b == null) {
            return;
        }
        if (this.h) {
            synchronized (this.i) {
                try {
                    this.o = this.o.a(b);
                    if (h(this.o)) {
                        s3g s3gVar = this.m;
                        if (s3gVar != null) {
                        }
                        yihVar = new yih(this.i);
                        this.w = yihVar;
                    }
                } finally {
                }
            }
            if (yihVar != null) {
                yihVar.n(this.d.schedule(new pyn(this, yihVar, z, 17), this.g.b, TimeUnit.NANOSECONDS));
            }
        }
        f(b);
    }

    @Override // defpackage.yx2
    public final void x(zl1 zl1Var) {
        p3g p3gVar;
        synchronized (this.i) {
            zl1Var.i(this.n, "closed");
            p3gVar = this.o;
        }
        if (p3gVar.f != null) {
            zl1 zl1Var2 = new zl1(3);
            p3gVar.f.a.x(zl1Var2);
            zl1Var.i(zl1Var2, "committed");
            return;
        }
        zl1 zl1Var3 = new zl1(3);
        for (r3g r3gVar : p3gVar.c) {
            zl1 zl1Var4 = new zl1(3);
            r3gVar.a.x(zl1Var4);
            zl1Var3.b.add(String.valueOf(zl1Var4));
        }
        zl1Var.i(zl1Var3, "open");
    }
}
