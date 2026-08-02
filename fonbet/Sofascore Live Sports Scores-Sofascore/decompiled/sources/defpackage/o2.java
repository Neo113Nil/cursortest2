package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class o2 implements yx2, igi {
    public static final Logger g = Logger.getLogger(o2.class.getName());
    public final j0l a;
    public final kr8 b;
    public final boolean c;
    public final boolean d;
    public qic e;
    public volatile boolean f;

    public o2(uic uicVar, uei ueiVar, j0l j0lVar, qic qicVar, jh2 jh2Var, boolean z) {
        z1a.y(j0lVar, "transportTracer");
        this.a = j0lVar;
        this.c = !Boolean.TRUE.equals(jh2Var.a(n49.n));
        this.d = z;
        if (!z) {
            this.b = new vgc(this, uicVar, ueiVar);
            this.e = qicVar;
            return;
        }
        n72 n72Var = new n72();
        n72Var.e = this;
        n72Var.b = qicVar;
        n72Var.c = ueiVar;
        this.b = n72Var;
    }

    @Override // defpackage.igi
    public final void H() {
        kod kodVar = ((lod) this).l;
        kodVar.getClass();
        jde.b();
        b8 b8Var = new b8(kodVar, 0);
        synchronized (kodVar.v) {
            b8Var.run();
        }
    }

    public final void a(zod zodVar, boolean z, boolean z2, int i) {
        x52 x52Var;
        z1a.r("null frame before EOS", zodVar != null || z);
        e3c e3cVar = ((lod) this).m;
        e3cVar.getClass();
        jde.c();
        try {
            if (zodVar == null) {
                x52Var = lod.p;
            } else {
                x52Var = zodVar.a;
                int i2 = (int) x52Var.b;
                if (i2 > 0) {
                    kod kodVar = ((lod) e3cVar.b).l;
                    synchronized (kodVar.b) {
                        kodVar.e += i2;
                    }
                }
            }
            synchronized (((lod) e3cVar.b).l.v) {
                ((lod) e3cVar.b).l.h(x52Var, z, z2);
                j0l j0lVar = ((lod) e3cVar.b).a;
                if (i == 0) {
                    j0lVar.getClass();
                } else {
                    j0lVar.getClass();
                    TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
                }
            }
            jde.a.getClass();
        } catch (Throwable th) {
            try {
                jde.a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.igi
    public final void c(tz2 tz2Var) {
        this.b.c(tz2Var);
    }

    @Override // defpackage.yx2
    public final void d(int i) {
        this.b.d(i);
    }

    @Override // defpackage.igi
    public final void flush() {
        kr8 kr8Var = this.b;
        if (kr8Var.isClosed()) {
            return;
        }
        kr8Var.flush();
    }

    @Override // defpackage.igi
    public final boolean isReady() {
        return ((lod) this).l.g() && !this.f;
    }

    @Override // defpackage.igi
    public final void k(zef zefVar) {
        kr8 kr8Var = this.b;
        try {
            if (!kr8Var.isClosed()) {
                kr8Var.e(zefVar);
            }
        } finally {
            n49.b(zefVar);
        }
    }

    @Override // defpackage.yx2
    public final void l(xei xeiVar) {
        z1a.r("Should not cancel with OK status", !xeiVar.f());
        this.f = true;
        e3c e3cVar = ((lod) this).m;
        e3cVar.getClass();
        jde.c();
        try {
            synchronized (((lod) e3cVar.b).l.v) {
                ((lod) e3cVar.b).l.b(xeiVar, true, null);
            }
            jde.a.getClass();
        } catch (Throwable th) {
            try {
                jde.a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.yx2
    public final void m(int i) {
        ((lod) this).l.a.b = i;
    }

    @Override // defpackage.igi
    public final void o() {
        kod kodVar = ((lod) this).l;
        tgc tgcVar = kodVar.d;
        tgcVar.a = kodVar;
        kodVar.a = tgcVar;
    }

    @Override // defpackage.yx2
    public final void r(om4 om4Var) {
        kod kodVar = ((lod) this).l;
        z1a.D("Already called start", kodVar.j == null);
        z1a.y(om4Var, "decompressorRegistry");
        kodVar.k = om4Var;
    }

    @Override // defpackage.yx2
    public final void s(hl4 hl4Var) {
        qic qicVar = this.e;
        jic jicVar = n49.c;
        qicVar.a(jicVar);
        this.e.e(jicVar, Long.valueOf(Math.max(0L, hl4Var.b())));
    }

    @Override // defpackage.yx2
    public final void t() {
        lod lodVar = (lod) this;
        if (lodVar.l.n) {
            return;
        }
        lodVar.l.n = true;
        this.b.close();
    }

    @Override // defpackage.yx2
    public final void w(ay2 ay2Var) {
        lod lodVar = (lod) this;
        kod kodVar = lodVar.l;
        z1a.D("Already called setListener", kodVar.j == null);
        z1a.y(ay2Var, "listener");
        kodVar.j = ay2Var;
        if (this.d) {
            return;
        }
        lodVar.m.n(this.e, null);
        this.e = null;
    }

    @Override // defpackage.yx2
    public final void x(zl1 zl1Var) {
        zl1Var.i(((lod) this).n.a.get(t62.j), "remote_addr");
    }
}
