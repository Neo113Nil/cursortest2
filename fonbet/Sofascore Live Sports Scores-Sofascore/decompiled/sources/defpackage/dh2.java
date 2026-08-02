package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dh2 extends ym8 {
    public final xj3 a;
    public final AtomicInteger b = new AtomicInteger(-2147483647);
    public volatile xei c;

    public dh2(eh2 eh2Var, xj3 xj3Var, String str) {
        new it7(this);
        z1a.y(xj3Var, "delegate");
        this.a = xj3Var;
    }

    @Override // defpackage.ym8, defpackage.asb
    public final void a(xei xeiVar) {
        z1a.y(xeiVar, "status");
        synchronized (this) {
            try {
                if (this.b.get() < 0) {
                    this.c = xeiVar;
                    this.b.addAndGet(Integer.MAX_VALUE);
                    if (this.b.get() != 0) {
                        return;
                    }
                    super.a(xeiVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.dy2
    public final yx2 d(ujg ujgVar, qic qicVar, jh2 jh2Var, cy2[] cy2VarArr) {
        jh2Var.getClass();
        return this.b.get() >= 0 ? new ln6(this.c, zx2.a, cy2VarArr) : this.a.d(ujgVar, qicVar, jh2Var, cy2VarArr);
    }

    @Override // defpackage.ym8
    public final xj3 e() {
        return this.a;
    }
}
