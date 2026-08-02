package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i2 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ wzc t;
    public final /* synthetic */ l6f u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(l6f l6fVar, wzc wzcVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 0;
        this.u = l6fVar;
        this.t = wzcVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        l6f l6fVar = this.u;
        wzc wzcVar = this.t;
        switch (i) {
            case 0:
                return new i2(l6fVar, wzcVar, rq3Var);
            case 1:
                return new i2(wzcVar, l6fVar, rq3Var, 1);
            default:
                return new i2(wzcVar, l6fVar, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((i2) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        l6f l6fVar = this.u;
        wzc wzcVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    m6f m6fVar = new m6f(l6fVar);
                    this.s = 1;
                    if (wzcVar.a(m6fVar, this) == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (wzcVar.a(l6fVar, this) == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (wzcVar.a(l6fVar, this) == lu3Var3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2(wzc wzcVar, l6f l6fVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = wzcVar;
        this.u = l6fVar;
    }
}
