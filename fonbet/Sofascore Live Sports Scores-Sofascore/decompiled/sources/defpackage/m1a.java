package defpackage;

import java.util.ArrayList;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class m1a extends bw4 implements ug3 {
    public final re2 A;
    public wzc r;
    public boolean u;
    public g9i v;
    public n9j w;
    public q50 x;
    public uah y;
    public final q50 z;
    public boolean q = true;
    public float s = 2.0f;
    public float t = 1.0f;

    public m1a(wzc wzcVar, n9j n9jVar, uah uahVar) {
        this.r = wzcVar;
        this.w = n9jVar;
        this.y = uahVar;
        this.z = new q50(new p75(this.u ? 2.0f : 1.0f), lz.h, null, 12);
        re2 re2Var = new re2(new te2(), new yx7(this, 29));
        k1(re2Var);
        this.A = re2Var;
    }

    @Override // defpackage.wtc
    public final boolean Z0() {
        return false;
    }

    @Override // defpackage.wtc
    public final void c1() {
        this.v = xw3.L(Y0(), null, null, new l1a(this, null, 2), 3);
        if (this.x == null) {
            n9j n9jVar = this.w;
            if (n9jVar == null) {
                n9jVar = hjg.p((g23) tgj.x(this, i23.a), (wej) tgj.x(this, xej.a));
            }
            long c = n9jVar.c(this.q, false, this.u);
            this.x = new q50(new r13(c), new q4k(ry.H, new oo(r13.f(c), 9)), null, 12);
        }
    }

    public final void n1() {
        rq3 rq3Var = null;
        xw3.L(Y0(), null, null, new l1a(this, rq3Var, 0), 3);
        xw3.L(Y0(), null, null, new l1a(this, rq3Var, 1), 3);
    }

    public final Object o1(hoi hoiVar) {
        this.u = false;
        Object collect = this.r.b().collect(new nk0(13, new ArrayList(), this), hoiVar);
        return collect == lu3.a ? collect : Unit.a;
    }
}
