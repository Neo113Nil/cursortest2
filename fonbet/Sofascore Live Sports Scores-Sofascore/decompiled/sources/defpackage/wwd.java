package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wwd extends cy2 {
    public final /* synthetic */ cy2 b;
    public final /* synthetic */ ywd c;

    public wwd(ywd ywdVar, cy2 cy2Var) {
        this.c = ywdVar;
        this.b = cy2Var;
    }

    @Override // defpackage.cy2
    public final void a() {
        this.b.a();
    }

    @Override // defpackage.cy2
    public final void b() {
        this.b.b();
    }

    @Override // defpackage.cy2
    public final void c(int i) {
        this.b.c(i);
    }

    @Override // defpackage.cy2
    public final void d(int i, long j) {
        this.b.d(i, j);
    }

    @Override // defpackage.cy2
    public final void e(qic qicVar) {
        this.b.e(qicVar);
    }

    @Override // defpackage.cy2
    public final void f(long j) {
        this.b.f(j);
    }

    @Override // defpackage.cy2
    public final void g(long j) {
        this.b.g(j);
    }

    @Override // defpackage.cy2
    public final void h() {
        this.b.h();
    }

    @Override // defpackage.cy2
    public final void i(int i) {
        this.b.i(i);
    }

    @Override // defpackage.cy2
    public final void j(int i, long j, long j2) {
        this.b.j(i, j, j2);
    }

    @Override // defpackage.cy2
    public final void k(long j) {
        this.b.k(j);
    }

    @Override // defpackage.cy2
    public final void l(long j) {
        this.b.l(j);
    }

    @Override // defpackage.cy2
    public final void m(xei xeiVar) {
        twd twdVar = this.c.a;
        boolean f = xeiVar.f();
        vwd vwdVar = twdVar.a;
        if (vwdVar.e != null || vwdVar.f != null) {
            k1d k1dVar = twdVar.b;
            if (f) {
                ((AtomicLong) k1dVar.b).getAndIncrement();
            } else {
                ((AtomicLong) k1dVar.c).getAndIncrement();
            }
        }
        this.b.m(xeiVar);
    }

    @Override // defpackage.cy2
    public final void n(sm0 sm0Var, qic qicVar) {
        this.b.n(sm0Var, qicVar);
    }

    public final String toString() {
        en0 I = qea.I(this);
        I.e(this.b, "delegate");
        return I.toString();
    }
}
