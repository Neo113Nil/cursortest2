package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rv4 implements yx2 {
    public volatile boolean a;
    public ay2 b;
    public yx2 c;
    public xei d;
    public vv4 f;
    public long g;
    public long h;
    public final kge j;
    public final cy2[] l;
    public final /* synthetic */ sv4 m;
    public List e = new ArrayList();
    public ArrayList i = new ArrayList();
    public final bq3 k = bq3.b();

    public rv4(sv4 sv4Var, kge kgeVar, cy2[] cy2VarArr) {
        this.m = sv4Var;
        this.j = kgeVar;
        this.l = cy2VarArr;
    }

    @Override // defpackage.igi
    public final void H() {
        z1a.D("May only be called after start", this.b != null);
        if (this.a) {
            this.c.H();
        } else {
            a(new tv4(this, 0));
        }
    }

    public final void a(Runnable runnable) {
        z1a.D("May only be called after start", this.b != null);
        synchronized (this) {
            try {
                if (this.a) {
                    runnable.run();
                } else {
                    this.e.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0063, code lost:
    
        if (r0.hasNext() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0065, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005b, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0053 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        vv4 vv4Var;
        List list;
        List list2;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (this) {
                if (this.e.isEmpty()) {
                    break;
                }
                list2 = this.e;
                this.e = arrayList;
            }
            if (vv4Var != null) {
                return;
            }
            List arrayList2 = new ArrayList();
            while (true) {
                synchronized (vv4Var) {
                    try {
                        if (((List) vv4Var.c).isEmpty()) {
                            vv4Var.c = null;
                            vv4Var.a = true;
                            return;
                        } else {
                            list = (List) vv4Var.c;
                            vv4Var.c = arrayList2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                list.clear();
                arrayList2 = list;
            }
            list2.clear();
            arrayList = list2;
        }
        this.e = null;
        this.a = true;
        vv4Var = this.f;
        if (vv4Var != null) {
        }
    }

    @Override // defpackage.igi
    public final void c(tz2 tz2Var) {
        z1a.D("May only be called before start", this.b == null);
        this.i.add(new vlo(this, tz2Var, false, 8));
    }

    @Override // defpackage.yx2
    public final void d(int i) {
        z1a.D("May only be called before start", this.b == null);
        this.i.add(new uv4(this, i, 1));
    }

    public final void e(ay2 ay2Var) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.i = null;
        this.c.w(ay2Var);
    }

    @Override // defpackage.igi
    public final void flush() {
        z1a.D("May only be called after start", this.b != null);
        if (this.a) {
            this.c.flush();
        } else {
            a(new tv4(this, 3));
        }
    }

    @Override // defpackage.igi
    public final boolean isReady() {
        if (this.a) {
            return this.c.isReady();
        }
        return false;
    }

    @Override // defpackage.igi
    public final void k(zef zefVar) {
        z1a.D("May only be called after start", this.b != null);
        if (this.a) {
            this.c.k(zefVar);
        } else {
            a(new vlo(this, zefVar, false, 9));
        }
    }

    @Override // defpackage.yx2
    public final void l(xei xeiVar) {
        boolean z = true;
        z1a.D("May only be called after start", this.b != null);
        z1a.y(xeiVar, "reason");
        synchronized (this) {
            try {
                yx2 yx2Var = this.c;
                if (yx2Var == null) {
                    uxf uxfVar = uxf.u;
                    if (yx2Var != null) {
                        z = false;
                    }
                    z1a.C(yx2Var, "realStream already set to %s", z);
                    this.c = uxfVar;
                    this.h = System.nanoTime();
                    this.d = xeiVar;
                    z = false;
                }
            } finally {
            }
        }
        if (z) {
            a(new a8p(this, xeiVar, false, 9));
        } else {
            b();
            for (cy2 cy2Var : this.l) {
                cy2Var.m(xeiVar);
            }
            this.b.z(xeiVar, zx2.a, new qic());
        }
        synchronized (this.m.b) {
            try {
                sv4 sv4Var = this.m;
                if (sv4Var.g != null) {
                    boolean remove = sv4Var.i.remove(this);
                    if (!this.m.f() && remove) {
                        sv4 sv4Var2 = this.m;
                        sv4Var2.d.e(sv4Var2.f);
                        sv4 sv4Var3 = this.m;
                        if (sv4Var3.j != null) {
                            sv4Var3.d.e(sv4Var3.g);
                            this.m.g = null;
                        }
                    }
                }
            } finally {
            }
        }
        this.m.d.a();
    }

    @Override // defpackage.yx2
    public final void m(int i) {
        z1a.D("May only be called before start", this.b == null);
        this.i.add(new uv4(this, i, 0));
    }

    @Override // defpackage.igi
    public final void o() {
        z1a.D("May only be called before start", this.b == null);
        this.i.add(new tv4(this, 1));
    }

    @Override // defpackage.yx2
    public final void r(om4 om4Var) {
        z1a.D("May only be called before start", this.b == null);
        z1a.y(om4Var, "decompressorRegistry");
        this.i.add(new a8p(this, om4Var, false, 8));
    }

    @Override // defpackage.yx2
    public final void s(hl4 hl4Var) {
        z1a.D("May only be called before start", this.b == null);
        this.i.add(new pyn(this, hl4Var, false, 7));
    }

    @Override // defpackage.yx2
    public final void t() {
        z1a.D("May only be called after start", this.b != null);
        a(new tv4(this, 4));
    }

    @Override // defpackage.yx2
    public final void w(ay2 ay2Var) {
        xei xeiVar;
        boolean z;
        z1a.y(ay2Var, "listener");
        z1a.D("already started", this.b == null);
        synchronized (this) {
            try {
                xeiVar = this.d;
                z = this.a;
                if (!z) {
                    vv4 vv4Var = new vv4(ay2Var);
                    this.f = vv4Var;
                    ay2Var = vv4Var;
                }
                this.b = ay2Var;
                this.g = System.nanoTime();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (xeiVar != null) {
            ay2Var.z(xeiVar, zx2.a, new qic());
        } else if (z) {
            e(ay2Var);
        }
    }

    @Override // defpackage.yx2
    public final void x(zl1 zl1Var) {
        if (Boolean.TRUE.equals(this.j.a.e)) {
            zl1Var.b.add("wait_for_ready");
        }
        synchronized (this) {
            try {
                if (this.b == null) {
                    return;
                }
                if (this.c != null) {
                    zl1Var.i(Long.valueOf(this.h - this.g), "buffered_nanos");
                    this.c.x(zl1Var);
                } else {
                    zl1Var.i(Long.valueOf(System.nanoTime() - this.g), "buffered_nanos");
                    zl1Var.b.add("waiting_for_connection");
                }
            } finally {
            }
        }
    }
}
