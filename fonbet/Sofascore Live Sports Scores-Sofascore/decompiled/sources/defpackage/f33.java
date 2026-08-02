package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class f33 implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8f b;

    public /* synthetic */ f33(k8f k8fVar, int i) {
        this.a = i;
        this.b = k8fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0086  */
    @Override // defpackage.b98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, rq3 rq3Var) {
        e33 e33Var;
        int i;
        p98 p98Var;
        int i2;
        int i3 = this.a;
        ih2 ih2Var = rid.a;
        k8f k8fVar = this.b;
        switch (i3) {
            case 0:
                if (rq3Var instanceof e33) {
                    e33Var = (e33) rq3Var;
                    int i4 = e33Var.t;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        e33Var.t = i4 - Integer.MIN_VALUE;
                        Object obj2 = e33Var.r;
                        lu3 lu3Var = lu3.a;
                        i = e33Var.t;
                        if (i != 0) {
                            y6a.M(obj2);
                            j8f j8fVar = (j8f) k8fVar;
                            j8fVar.getClass();
                            if (obj == null) {
                                obj = ih2Var;
                            }
                            e33Var.t = 1;
                            if (j8fVar.e.q(e33Var, obj) == lu3Var) {
                                break;
                            }
                        } else if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            y6a.M(obj2);
                        }
                        break;
                    }
                }
                e33Var = new e33(this, rq3Var);
                Object obj22 = e33Var.r;
                lu3 lu3Var2 = lu3.a;
                i = e33Var.t;
                if (i != 0) {
                }
            case 1:
                Object q = ((j8f) k8fVar).e.q(rq3Var, obj);
                if (q != lu3.a) {
                    break;
                }
                break;
            default:
                if (rq3Var instanceof p98) {
                    p98Var = (p98) rq3Var;
                    int i5 = p98Var.t;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        p98Var.t = i5 - Integer.MIN_VALUE;
                        Object obj3 = p98Var.r;
                        lu3 lu3Var3 = lu3.a;
                        i2 = p98Var.t;
                        if (i2 != 0) {
                            y6a.M(obj3);
                            if (obj == null) {
                                obj = ih2Var;
                            }
                            p98Var.t = 1;
                            if (((j8f) k8fVar).e.q(p98Var, obj) == lu3Var3) {
                                break;
                            }
                        } else if (i2 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            y6a.M(obj3);
                        }
                        break;
                    }
                }
                p98Var = new p98(this, rq3Var);
                Object obj32 = p98Var.r;
                lu3 lu3Var32 = lu3.a;
                i2 = p98Var.t;
                if (i2 != 0) {
                }
        }
        return Unit.a;
    }
}
