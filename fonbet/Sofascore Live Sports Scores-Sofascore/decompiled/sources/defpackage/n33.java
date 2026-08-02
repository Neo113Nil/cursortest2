package defpackage;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class n33 extends yl {
    public static final nsa o = new nsa(0, n33.class);
    public wu9 l;
    public final boolean m;
    public m33 n;

    public n33(hv9 hv9Var, boolean z) {
        int size = hv9Var.size();
        this.h = null;
        this.i = size;
        this.l = hv9Var;
        this.m = z;
    }

    @Override // defpackage.g4
    public final void c() {
        wu9 wu9Var = this.l;
        this.l = null;
        this.n = null;
        if ((this.a instanceof u3) && (wu9Var != null)) {
            boolean p = p();
            cck it = wu9Var.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(p);
            }
        }
    }

    @Override // defpackage.g4
    public final void i() {
        m33 m33Var = this.n;
        if (m33Var != null) {
            m33Var.d();
        }
    }

    @Override // defpackage.g4
    public final String j() {
        wu9 wu9Var = this.l;
        if (wu9Var == null) {
            return super.j();
        }
        return "futures=" + wu9Var;
    }

    public final void q(wu9 wu9Var) {
        int C = yl.j.C(this);
        z1a.D("Less than 0 remaining futures", C >= 0);
        if (C == 0) {
            if (wu9Var != null) {
                cck it = wu9Var.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        boolean z = false;
                        while (true) {
                            try {
                                future.get();
                                break;
                            } catch (InterruptedException unused) {
                                z = true;
                            } catch (Throwable th) {
                                if (z) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                        if (z) {
                            try {
                                Thread.currentThread().interrupt();
                            } catch (ExecutionException e) {
                                r(e.getCause());
                            } catch (Throwable th2) {
                                r(th2);
                            }
                        }
                    }
                }
            }
            this.h = null;
            m33 m33Var = this.n;
            if (m33Var != null) {
                try {
                    m33Var.f.execute(m33Var);
                } catch (RejectedExecutionException e2) {
                    m33Var.g.m(e2);
                }
            }
            this.l = null;
        }
    }

    public final void r(Throwable th) {
        th.getClass();
        if (this.m && !m(th)) {
            Set set = this.h;
            if (set == null) {
                Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                newSetFromMap.getClass();
                if (!(this.a instanceof u3)) {
                    Throwable o2 = o();
                    Objects.requireNonNull(o2);
                    while (o2 != null && newSetFromMap.add(o2)) {
                        o2 = o2.getCause();
                    }
                }
                yl.j.A(this, newSetFromMap);
                Set set2 = this.h;
                Objects.requireNonNull(set2);
                set = set2;
            }
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                if (set.add(th2)) {
                }
            }
            o.a().log(Level.SEVERE, th instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
            return;
        }
        if (th instanceof Error) {
            o.a().log(Level.SEVERE, "Input Future failed with Error", th);
        }
    }

    public final void s() {
        Objects.requireNonNull(this.l);
        if (this.l.isEmpty()) {
            m33 m33Var = this.n;
            if (m33Var != null) {
                try {
                    m33Var.f.execute(m33Var);
                    return;
                } catch (RejectedExecutionException e) {
                    m33Var.g.m(e);
                    return;
                }
            }
            return;
        }
        boolean z = this.m;
        f35 f35Var = f35.a;
        if (!z) {
            r0 r0Var = new r0(7, this, (Object) null);
            cck it = this.l.iterator();
            while (it.hasNext()) {
                ddb ddbVar = (ddb) it.next();
                if (ddbVar.isDone()) {
                    q(null);
                } else {
                    ddbVar.addListener(r0Var, f35Var);
                }
            }
            return;
        }
        cck it2 = this.l.iterator();
        int i = 0;
        while (it2.hasNext()) {
            ddb ddbVar2 = (ddb) it2.next();
            int i2 = i + 1;
            if (ddbVar2.isDone()) {
                t(ddbVar2);
            } else {
                ddbVar2.addListener(new r0(this, i, ddbVar2), f35Var);
            }
            i = i2;
        }
    }

    public final void t(ddb ddbVar) {
        try {
            boolean z = false;
            if (ddbVar.isCancelled()) {
                this.l = null;
                cancel(false);
            } else {
                while (true) {
                    try {
                        try {
                            ddbVar.get();
                            break;
                        } catch (InterruptedException unused) {
                            z = true;
                        } catch (Throwable th) {
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (ExecutionException e) {
                        r(e.getCause());
                    } catch (Throwable th2) {
                        r(th2);
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        } finally {
            q(null);
        }
    }
}
