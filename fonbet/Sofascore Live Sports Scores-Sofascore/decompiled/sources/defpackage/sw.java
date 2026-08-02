package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sw extends k95 {
    public dx J;
    public ewd K;
    public p78 L;
    public kx4 M;

    @Override // defpackage.k95
    public final boolean C1() {
        return ((eoh) ((e1d) this.J.h)).getValue() != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F1(float f, sq3 sq3Var) {
        pw pwVar;
        int i;
        csf csfVar;
        if (sq3Var instanceof pw) {
            pwVar = (pw) sq3Var;
            int i2 = pwVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pwVar.u = i2 - Integer.MIN_VALUE;
                Object obj = pwVar.s;
                Object obj2 = lu3.a;
                i = pwVar.u;
                int i3 = 2;
                if (i != 0) {
                    y6a.M(obj);
                    rq3 rq3Var = null;
                    if (this.J.h()) {
                        dx dxVar = this.J;
                        pwVar.u = 1;
                        if (!dxVar.h()) {
                            u3a.a("AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information.");
                        }
                        Object value = ((eoh) ((e1d) dxVar.c)).getValue();
                        lo4 f2 = dxVar.f();
                        float k = dxVar.k();
                        Function1 function1 = (Function1) dxVar.i;
                        if (function1 == null) {
                            Intrinsics.i("positionalThreshold");
                            throw null;
                        }
                        cw cwVar = (cw) dxVar.j;
                        if (cwVar == null) {
                            Intrinsics.i("velocityThreshold");
                            throw null;
                        }
                        Object p = zm2.p(f2, k, f, function1, cwVar);
                        Object j = ((Boolean) ((Function1) dxVar.b).invoke(p)).booleanValue() ? zm2.j(dxVar, p, f, pwVar) : zm2.j(dxVar, value, f, pwVar);
                        if (j != obj2) {
                            return j;
                        }
                    } else {
                        csf csfVar2 = new csf();
                        csfVar2.a = f;
                        dx dxVar2 = this.J;
                        rw rwVar = new rw(this, csfVar2, f, null);
                        pwVar.r = csfVar2;
                        pwVar.u = 2;
                        m1d m1dVar = m1d.a;
                        q1d q1dVar = (q1d) dxVar2.m;
                        cl clVar = new cl(dxVar2, rwVar, rq3Var, i3);
                        q1dVar.getClass();
                        Object r = s9a.r(new ts2(m1dVar, q1dVar, clVar, rq3Var, 11), pwVar);
                        if (r != obj2) {
                            r = Unit.a;
                        }
                        if (r != obj2) {
                            csfVar = csfVar2;
                        }
                    }
                    return obj2;
                }
                if (i == 1) {
                    y6a.M(obj);
                    return obj;
                }
                if (i != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                csfVar = pwVar.r;
                y6a.M(obj);
                return new Float(csfVar.a);
            }
        }
        pwVar = new pw(this, sq3Var);
        Object obj3 = pwVar.s;
        Object obj22 = lu3.a;
        i = pwVar.u;
        int i32 = 2;
        if (i != 0) {
        }
        return new Float(csfVar.a);
    }

    public final boolean G1() {
        return c6o.c0(this).z == ema.b && this.K == ewd.b;
    }

    public final void H1() {
        i4k i4kVar = aw.a;
        dt dtVar = aw.b;
        kx4 kx4Var = c6o.c0(this).y;
        this.M = kx4Var;
        dx dxVar = this.J;
        this.L = new gnh(new dw(dxVar, dtVar, new cw(kx4Var, 0)), zm2.b, i4kVar);
    }

    @Override // defpackage.wtc
    public final void c1() {
        H1();
    }

    @Override // defpackage.xv4, defpackage.pze
    public final void l() {
        y0();
        if (this.n) {
            kx4 kx4Var = c6o.c0(this).y;
            kx4 kx4Var2 = this.M;
            if (kx4Var2 == null || !kx4Var2.equals(kx4Var)) {
                this.M = kx4Var;
                H1();
            }
        }
    }

    @Override // defpackage.k95
    public final Object o1(j95 j95Var, j95 j95Var2) {
        dx dxVar = this.J;
        rq3 rq3Var = null;
        tl tlVar = new tl(j95Var, this, (rq3) null);
        m1d m1dVar = m1d.a;
        q1d q1dVar = (q1d) dxVar.m;
        cl clVar = new cl(dxVar, tlVar, rq3Var, 2);
        q1dVar.getClass();
        Object r = s9a.r(new ts2(m1dVar, q1dVar, clVar, rq3Var, 11), j95Var2);
        lu3 lu3Var = lu3.a;
        if (r != lu3Var) {
            r = Unit.a;
        }
        return r == lu3Var ? r : Unit.a;
    }

    @Override // defpackage.k95
    public final void u1(s85 s85Var) {
        if (this.n) {
            xw3.L(Y0(), null, null, new l0(this, s85Var, null, 10), 3);
        }
    }

    @Override // defpackage.k95
    public final void t1(long j) {
    }
}
