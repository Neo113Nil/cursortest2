package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hrb extends xm8 {
    public final c8a p;
    public final mn2 q;
    public final Executor r;
    public final ujg s;
    public final bq3 t;
    public jh2 u;
    public wkn v;

    public hrb(c8a c8aVar, lrb lrbVar, Executor executor, ujg ujgVar, jh2 jh2Var) {
        this.p = c8aVar;
        this.q = lrbVar;
        this.s = ujgVar;
        Executor executor2 = jh2Var.b;
        executor = executor2 != null ? executor2 : executor;
        this.r = executor;
        nc3 b = jh2.b(jh2Var);
        b.b = executor;
        this.u = new jh2(b);
        this.t = bq3.b();
    }

    @Override // defpackage.wkn
    public final void P(c5n c5nVar, qic qicVar) {
        ujg ujgVar = this.s;
        z1a.y(ujgVar, "method");
        wj9 a = this.p.a();
        xei xeiVar = (xei) a.b;
        if (!xeiVar.f()) {
            this.r.execute(new ov4(this, c5nVar, n49.h(xeiVar)));
            this.v = qrb.i0;
            return;
        }
        yrb yrbVar = (yrb) a.c;
        wrb wrbVar = (wrb) yrbVar.b.get((String) ujgVar.b);
        if (wrbVar == null) {
            wrbVar = (wrb) yrbVar.c.get((String) ujgVar.c);
        }
        if (wrbVar == null) {
            wrbVar = yrbVar.a;
        }
        if (wrbVar != null) {
            this.u = this.u.c(wrb.g, wrbVar);
        }
        wkn f = this.q.f(ujgVar, this.u);
        this.v = f;
        f.P(c5nVar, qicVar);
    }

    @Override // defpackage.xm8
    public final wkn U() {
        return this.v;
    }

    @Override // defpackage.xm8, defpackage.wkn
    public final void q(String str, Throwable th) {
        wkn wknVar = this.v;
        if (wknVar != null) {
            wknVar.q(str, th);
        }
    }
}
