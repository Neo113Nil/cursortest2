package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sv4 implements asb {
    public final Executor c;
    public final xx3 d;
    public qv4 e;
    public qv4 f;
    public qv4 g;
    public d4a h;
    public xei j;
    public dfb k;
    public long l;
    public final f8a a = f8a.a(sv4.class, null);
    public final Object b = new Object();
    public Collection i = new LinkedHashSet();

    public sv4(Executor executor, xx3 xx3Var) {
        this.c = executor;
        this.d = xx3Var;
    }

    @Override // defpackage.asb
    public final void a(xei xeiVar) {
        qv4 qv4Var;
        synchronized (this.b) {
            try {
                if (this.j != null) {
                    return;
                }
                this.j = xeiVar;
                this.d.e(new pyn(this, xeiVar, false, 6));
                if (!f() && (qv4Var = this.g) != null) {
                    this.d.e(qv4Var);
                    this.g = null;
                }
                this.d.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.e8a
    public final f8a b() {
        return this.a;
    }

    @Override // defpackage.asb
    public final Runnable c(zrb zrbVar) {
        d4a d4aVar = (d4a) zrbVar;
        this.h = d4aVar;
        this.e = new qv4(d4aVar, 0);
        this.f = new qv4(d4aVar, 1);
        this.g = new qv4(d4aVar, 2);
        return null;
    }

    @Override // defpackage.dy2
    public final yx2 d(ujg ujgVar, qic qicVar, jh2 jh2Var, cy2[] cy2VarArr) {
        yx2 ln6Var;
        try {
            kge kgeVar = new kge(ujgVar, qicVar, jh2Var);
            dfb dfbVar = null;
            long j = -1;
            while (true) {
                synchronized (this.b) {
                    xei xeiVar = this.j;
                    if (xeiVar == null) {
                        dfb dfbVar2 = this.k;
                        if (dfbVar2 != null) {
                            if (dfbVar != null && j == this.l) {
                                ln6Var = e(kgeVar, cy2VarArr);
                                break;
                            }
                            j = this.l;
                            dy2 f = n49.f(dfbVar2.a(kgeVar), Boolean.TRUE.equals(jh2Var.e));
                            if (f != null) {
                                ln6Var = f.d(kgeVar.c, kgeVar.b, kgeVar.a, cy2VarArr);
                                break;
                            }
                            dfbVar = dfbVar2;
                        } else {
                            ln6Var = e(kgeVar, cy2VarArr);
                            break;
                        }
                    } else {
                        ln6Var = new ln6(xeiVar, zx2.a, cy2VarArr);
                        break;
                    }
                }
            }
            return ln6Var;
        } finally {
            this.d.a();
        }
    }

    public final rv4 e(kge kgeVar, cy2[] cy2VarArr) {
        int size;
        rv4 rv4Var = new rv4(this, kgeVar, cy2VarArr);
        this.i.add(rv4Var);
        synchronized (this.b) {
            size = this.i.size();
        }
        if (size == 1) {
            this.d.e(this.e);
        }
        for (cy2 cy2Var : cy2VarArr) {
            cy2Var.a();
        }
        return rv4Var;
    }

    public final boolean f() {
        boolean z;
        synchronized (this.b) {
            z = !this.i.isEmpty();
        }
        return z;
    }

    public final void g(dfb dfbVar) {
        qv4 qv4Var;
        synchronized (this.b) {
            this.k = dfbVar;
            this.l++;
            if (dfbVar != null && f()) {
                ArrayList arrayList = new ArrayList(this.i);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (true) {
                    tv4 tv4Var = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    rv4 rv4Var = (rv4) it.next();
                    bfb a = dfbVar.a(rv4Var.j);
                    jh2 jh2Var = rv4Var.j.a;
                    dy2 f = n49.f(a, Boolean.TRUE.equals(jh2Var.e));
                    if (f != null) {
                        Executor executor = this.c;
                        Executor executor2 = jh2Var.b;
                        if (executor2 != null) {
                            executor = executor2;
                        }
                        bq3 bq3Var = rv4Var.k;
                        bq3 a2 = bq3Var.a();
                        try {
                            kge kgeVar = rv4Var.j;
                            yx2 d = f.d(kgeVar.c, kgeVar.b, kgeVar.a, rv4Var.l);
                            synchronized (rv4Var) {
                                try {
                                    if (rv4Var.c == null) {
                                        z1a.y(d, "stream");
                                        yx2 yx2Var = rv4Var.c;
                                        z1a.C(yx2Var, "realStream already set to %s", yx2Var == null);
                                        rv4Var.c = d;
                                        rv4Var.h = System.nanoTime();
                                        ay2 ay2Var = rv4Var.b;
                                        if (ay2Var == null) {
                                            rv4Var.e = null;
                                            rv4Var.a = true;
                                        }
                                        if (ay2Var != null) {
                                            rv4Var.e(ay2Var);
                                            tv4Var = new tv4(rv4Var, 2);
                                        }
                                    }
                                } finally {
                                }
                            }
                            if (tv4Var != null) {
                                executor.execute(tv4Var);
                            }
                            arrayList2.add(rv4Var);
                        } finally {
                            bq3Var.c(a2);
                        }
                    }
                }
                synchronized (this.b) {
                    try {
                        if (f()) {
                            this.i.removeAll(arrayList2);
                            if (this.i.isEmpty()) {
                                this.i = new LinkedHashSet();
                            }
                            if (!f()) {
                                this.d.e(this.f);
                                if (this.j != null && (qv4Var = this.g) != null) {
                                    this.d.e(qv4Var);
                                    this.g = null;
                                }
                            }
                            this.d.a();
                        }
                    } finally {
                    }
                }
            }
        }
    }
}
