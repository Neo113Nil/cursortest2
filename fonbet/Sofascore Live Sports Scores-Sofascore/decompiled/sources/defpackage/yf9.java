package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yf9 extends wtc implements pze {
    public wzc o;
    public sf9 p;

    @Override // defpackage.pze
    public final void B(fze fzeVar, gze gzeVar, long j) {
        if (gzeVar == gze.b) {
            int i = fzeVar.f;
            rq3 rq3Var = null;
            if (i == 4) {
                xw3.L(Y0(), null, null, new xf9(this, rq3Var, 0), 3);
            } else if (i == 5) {
                xw3.L(Y0(), null, null, new xf9(this, rq3Var, 1), 3);
            }
        }
    }

    @Override // defpackage.wtc
    public final void d1() {
        m1();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k1(sq3 sq3Var) {
        vf9 vf9Var;
        int i;
        sf9 sf9Var;
        if (sq3Var instanceof vf9) {
            vf9Var = (vf9) sq3Var;
            int i2 = vf9Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vf9Var.u = i2 - Integer.MIN_VALUE;
                Object obj = vf9Var.s;
                lu3 lu3Var = lu3.a;
                i = vf9Var.u;
                if (i != 0) {
                    y6a.M(obj);
                    if (this.p == null) {
                        sf9 sf9Var2 = new sf9();
                        wzc wzcVar = this.o;
                        vf9Var.r = sf9Var2;
                        vf9Var.u = 1;
                        if (wzcVar.a(sf9Var2, vf9Var) == lu3Var) {
                            return lu3Var;
                        }
                        sf9Var = sf9Var2;
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf9Var = vf9Var.r;
                y6a.M(obj);
                this.p = sf9Var;
                return Unit.a;
            }
        }
        vf9Var = new vf9(this, sq3Var);
        Object obj2 = vf9Var.s;
        lu3 lu3Var2 = lu3.a;
        i = vf9Var.u;
        if (i != 0) {
        }
        this.p = sf9Var;
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l1(sq3 sq3Var) {
        wf9 wf9Var;
        int i;
        if (sq3Var instanceof wf9) {
            wf9Var = (wf9) sq3Var;
            int i2 = wf9Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wf9Var.t = i2 - Integer.MIN_VALUE;
                Object obj = wf9Var.r;
                lu3 lu3Var = lu3.a;
                i = wf9Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    sf9 sf9Var = this.p;
                    if (sf9Var != null) {
                        tf9 tf9Var = new tf9(sf9Var);
                        wzc wzcVar = this.o;
                        wf9Var.t = 1;
                        if (wzcVar.a(tf9Var, wf9Var) == lu3Var) {
                            return lu3Var;
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                this.p = null;
                return Unit.a;
            }
        }
        wf9Var = new wf9(this, sq3Var);
        Object obj2 = wf9Var.r;
        lu3 lu3Var2 = lu3.a;
        i = wf9Var.t;
        if (i != 0) {
        }
        this.p = null;
        return Unit.a;
    }

    public final void m1() {
        sf9 sf9Var = this.p;
        if (sf9Var != null) {
            this.o.c(new tf9(sf9Var));
            this.p = null;
        }
    }

    @Override // defpackage.pze
    public final void y0() {
        m1();
    }
}
