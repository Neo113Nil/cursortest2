package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ibl extends hoi implements ct8 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ b98 t;
    public /* synthetic */ Object[] u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ibl(int i, rq3 rq3Var, int i2) {
        super(i, rq3Var);
        this.r = i2;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b98 b98Var = (b98) obj;
        Object[] objArr = (Object[]) obj2;
        rq3 rq3Var = (rq3) obj3;
        switch (this.r) {
            case 0:
                ibl iblVar = new ibl(3, rq3Var, 0);
                iblVar.t = b98Var;
                iblVar.u = objArr;
                return iblVar.invokeSuspend(Unit.a);
            default:
                ibl iblVar2 = new ibl(3, rq3Var, 1);
                iblVar2.t = b98Var;
                iblVar2.u = objArr;
                return iblVar2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        jn3 jn3Var;
        jn3 jn3Var2 = null;
        switch (this.r) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i = this.s;
                if (i == 0) {
                    y6a.M(obj);
                    b98 b98Var = this.t;
                    jn3[] jn3VarArr = (jn3[]) this.u;
                    int length = jn3VarArr.length;
                    int i2 = 0;
                    while (true) {
                        jn3Var = hn3.a;
                        if (i2 < length) {
                            jn3 jn3Var3 = jn3VarArr[i2];
                            if (Intrinsics.c(jn3Var3, jn3Var)) {
                                i2++;
                            } else {
                                jn3Var2 = jn3Var3;
                            }
                        }
                    }
                    if (jn3Var2 != null) {
                        jn3Var = jn3Var2;
                    }
                    this.s = 1;
                    if (b98Var.emit(jn3Var, this) == lu3Var) {
                        break;
                    }
                } else if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                b98 b98Var2 = this.t;
                Object[] objArr = this.u;
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    this.t = null;
                    this.u = null;
                    this.s = 1;
                    if (b98Var2.emit(objArr, this) == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
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
