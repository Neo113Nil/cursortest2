package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mrb extends wkn {
    public static final nv4 D;
    public final jh2 A;
    public final long B;
    public final /* synthetic */ nrb C;
    public final ScheduledFuture p;
    public final Executor q;
    public final bq3 r;
    public volatile boolean s;
    public c5n t;
    public wkn u;
    public xei v;
    public List w;
    public pv4 x;
    public final bq3 y;
    public final ujg z;

    static {
        Logger.getLogger(mrb.class.getName());
        D = new nv4(0);
    }

    public mrb(nrb nrbVar, bq3 bq3Var, ujg ujgVar, jh2 jh2Var) {
        ScheduledFuture<?> schedule;
        this.C = nrbVar;
        qrb qrbVar = nrbVar.d;
        Logger logger = qrb.c0;
        Executor executor = jh2Var.b;
        executor = executor == null ? qrbVar.h : executor;
        orb orbVar = qrbVar.g;
        hl4 hl4Var = jh2Var.a;
        this.w = new ArrayList();
        z1a.y(executor, "callExecutor");
        this.q = executor;
        z1a.y(orbVar, "scheduler");
        bq3 b = bq3.b();
        this.r = b;
        b.getClass();
        if (hl4Var == null) {
            schedule = null;
        } else {
            long b2 = hl4Var.b();
            long abs = Math.abs(b2) / 1000000000;
            long abs2 = Math.abs(b2) % 1000000000;
            StringBuilder sb = new StringBuilder();
            if (b2 < 0) {
                sb.append("ClientCall started after CallOptions deadline was exceeded. Deadline has been exceeded for ");
            } else {
                sb.append("Deadline CallOptions will be exceeded in ");
            }
            sb.append(abs);
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
            sb.append("s. ");
            schedule = orbVar.a.schedule(new vlo(this, sb, false, 6), b2, TimeUnit.NANOSECONDS);
        }
        this.p = schedule;
        this.y = bq3Var;
        this.z = ujgVar;
        this.A = jh2Var;
        qrbVar.X.getClass();
        this.B = System.nanoTime();
    }

    @Override // defpackage.wkn
    public final void D() {
        V(new mv4(this, 1));
    }

    @Override // defpackage.wkn
    public final void L() {
        if (this.s) {
            this.u.L();
        } else {
            V(new mv4(this, 0));
        }
    }

    @Override // defpackage.wkn
    public final void N(Object obj) {
        if (this.s) {
            this.u.N(obj);
        } else {
            V(new pyn(this, obj, false, 5));
        }
    }

    @Override // defpackage.wkn
    public final void P(c5n c5nVar, qic qicVar) {
        xei xeiVar;
        boolean z;
        int i = 0;
        z1a.D("already started", this.t == null);
        synchronized (this) {
            try {
                this.t = c5nVar;
                xeiVar = this.v;
                z = this.s;
                if (!z) {
                    pv4 pv4Var = new pv4(c5nVar);
                    this.x = pv4Var;
                    c5nVar = pv4Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (xeiVar != null) {
            this.q.execute(new ov4(this, c5nVar, xeiVar));
        } else if (z) {
            this.u.P(c5nVar, qicVar);
        } else {
            V(new lv4(i, this, c5nVar, qicVar));
        }
    }

    public final void U(xei xeiVar, boolean z) {
        c5n c5nVar;
        synchronized (this) {
            try {
                wkn wknVar = this.u;
                boolean z2 = false;
                boolean z3 = true;
                if (wknVar == null) {
                    nv4 nv4Var = D;
                    if (wknVar != null) {
                        z3 = false;
                    }
                    z1a.C(wknVar, "realCall already set to %s", z3);
                    ScheduledFuture scheduledFuture = this.p;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.u = nv4Var;
                    c5nVar = this.t;
                    this.v = xeiVar;
                    z3 = false;
                } else if (z) {
                    return;
                } else {
                    c5nVar = null;
                }
                if (z3) {
                    V(new a8p(this, xeiVar, z2, 6));
                } else {
                    if (c5nVar != null) {
                        this.q.execute(new ov4(this, c5nVar, xeiVar));
                    }
                    W();
                }
                this.C.d.m.execute(new mv4(this, 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void V(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.s) {
                    runnable.run();
                } else {
                    this.w.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W() {
        pv4 pv4Var;
        List list;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (this) {
                if (this.w.isEmpty()) {
                    break;
                }
                list = this.w;
                this.w = arrayList;
            }
            if (pv4Var == null) {
                this.q.execute(new kv4(this, pv4Var));
                return;
            }
            return;
            list.clear();
            arrayList = list;
        }
        this.w = null;
        this.s = true;
        pv4Var = this.x;
        if (pv4Var == null) {
        }
    }

    public final void X() {
        boolean z;
        kv4 kv4Var;
        bq3 a = this.y.a();
        try {
            jh2 jh2Var = this.A;
            ih2 ih2Var = cy2.a;
            this.C.d.X.getClass();
            wkn g = this.C.g(this.z, jh2Var.c(ih2Var, Long.valueOf(System.nanoTime() - this.B)));
            synchronized (this) {
                try {
                    wkn wknVar = this.u;
                    z = false;
                    if (wknVar != null) {
                        kv4Var = null;
                    } else {
                        z1a.C(wknVar, "realCall already set to %s", wknVar == null);
                        ScheduledFuture scheduledFuture = this.p;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        this.u = g;
                        kv4Var = new kv4(this, this.r);
                    }
                } finally {
                }
            }
            qrb qrbVar = this.C.d;
            if (kv4Var == null) {
                qrbVar.m.execute(new mv4(this, 2));
                return;
            }
            Executor executor = this.A.b;
            if (executor == null) {
                executor = qrbVar.h;
            }
            executor.execute(new pyn(this, kv4Var, z, 15));
        } finally {
            this.y.c(a);
        }
    }

    @Override // defpackage.wkn
    public final void q(String str, Throwable th) {
        xei xeiVar = xei.f;
        xei h = str != null ? xeiVar.h(str) : xeiVar.h("Call cancelled without message");
        if (th != null) {
            h = h.g(th);
        }
        U(h, false);
    }

    public final String toString() {
        en0 I = qea.I(this);
        I.e(this.u, "realCall");
        return I.toString();
    }
}
