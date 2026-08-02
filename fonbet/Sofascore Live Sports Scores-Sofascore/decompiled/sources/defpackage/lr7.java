package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class lr7 extends hoi implements ct8 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ b98 t;
    public /* synthetic */ Object u;
    public final /* synthetic */ rr7 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lr7(int i, rq3 rq3Var, rr7 rr7Var) {
        super(3, rq3Var);
        this.r = i;
        this.v = rr7Var;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.r;
        rr7 rr7Var = this.v;
        b98 b98Var = (b98) obj;
        rq3 rq3Var = (rq3) obj3;
        switch (i) {
            case 0:
                lr7 lr7Var = new lr7(0, rq3Var, rr7Var);
                lr7Var.t = b98Var;
                lr7Var.u = obj2;
                return lr7Var.invokeSuspend(Unit.a);
            default:
                lr7 lr7Var2 = new lr7(1, rq3Var, rr7Var);
                lr7Var2.t = b98Var;
                lr7Var2.u = obj2;
                return lr7Var2.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0129  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        yf4 yf4Var;
        z88 z88Var;
        z88 o63Var;
        pr7 pr7Var;
        int i2 = this.r;
        rr7 rr7Var = this.v;
        int i3 = 0;
        rq3 rq3Var = null;
        int i4 = 1;
        switch (i2) {
            case 0:
                j0j j0jVar = rr7Var.i;
                fdi fdiVar = rr7Var.m;
                b98 b98Var = this.t;
                Object obj2 = this.u;
                lu3 lu3Var = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    ((Boolean) obj2).getClass();
                    ct7 ct7Var = rr7Var.l;
                    i = ct7Var != null ? ar7.a[ct7Var.ordinal()] : -1;
                    if (i != 1) {
                        if (i == 2) {
                            z88Var = dy0.r(fdiVar, j0jVar.d(), rr7Var.j.g(), new fr7(rr7Var, null));
                        } else if (i != 3) {
                            z88Var = new wf2(new ft7[0], 5);
                        } else {
                            yf4Var = new yf4(fdiVar, rr7Var.k.l(), new er7(i4, rq3Var, rr7Var), i4);
                        }
                        this.t = null;
                        this.u = null;
                        this.s = 1;
                        if (fcp.g0(b98Var, z88Var, this) == lu3Var) {
                            break;
                        }
                    } else {
                        yf4Var = new yf4(fdiVar, j0jVar.h(), new er7(i3, rq3Var, rr7Var), i4);
                    }
                    z88Var = yf4Var;
                    this.t = null;
                    this.u = null;
                    this.s = 1;
                    if (fcp.g0(b98Var, z88Var, this) == lu3Var) {
                    }
                } else if (i5 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                wve wveVar = rr7Var.j;
                w3b w3bVar = rr7Var.k;
                j0j j0jVar2 = rr7Var.i;
                b98 b98Var2 = this.t;
                Object obj3 = this.u;
                lu3 lu3Var2 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    yq7 yq7Var = (yq7) obj3;
                    i = yq7Var != null ? ar7.b[yq7Var.ordinal()] : -1;
                    if (i != 1) {
                        if (i == 2) {
                            pr7Var = new pr7(j0jVar2.h(), rr7Var, i3);
                        } else if (i == 3) {
                            o63Var = new yf4(j0jVar2.d(), wveVar.g(), new tl(rr7Var, rq3Var, 9), i4);
                        } else if (i != 4) {
                            o63Var = fm5.a;
                        } else {
                            pr7Var = new pr7(w3bVar.l(), rr7Var, i4);
                        }
                        o63Var = pr7Var;
                    } else {
                        o63Var = new o63(7, new z88[]{j0jVar2.d(), j0jVar2.h(), wveVar.g(), w3bVar.l()}, new mr7(rr7Var, null));
                    }
                    this.t = null;
                    this.u = null;
                    this.s = 1;
                    if (fcp.g0(b98Var2, o63Var, this) == lu3Var2) {
                        break;
                    }
                } else if (i6 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
        }
        return Unit.a;
    }
}
