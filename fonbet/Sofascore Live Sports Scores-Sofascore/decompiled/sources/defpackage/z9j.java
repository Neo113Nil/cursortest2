package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class z9j extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ caj t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z9j(caj cajVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = cajVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        caj cajVar = this.t;
        switch (i) {
            case 0:
                return new z9j(cajVar, rq3Var, 0);
            case 1:
                return new z9j(cajVar, rq3Var, 1);
            case 2:
                return new z9j(cajVar, rq3Var, 2);
            case 3:
                return new z9j(cajVar, rq3Var, 3);
            case 4:
                return new z9j(cajVar, rq3Var, 4);
            default:
                return new z9j(cajVar, rq3Var, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
            case 0:
                return ((z9j) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
            case 1:
                return ((z9j) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
            case 2:
                return ((z9j) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
            case 3:
                return ((z9j) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
            case 4:
                return ((z9j) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
            default:
                ((z9j) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                return lu3.a;
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        caj cajVar = this.t;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    lcj lcjVar = cajVar.s;
                    this.s = 1;
                    if (lcjVar.c(true, this) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    lcj lcjVar2 = cajVar.s;
                    this.s = 1;
                    if (lcjVar2.d(this) == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    lcj lcjVar3 = cajVar.s;
                    this.s = 1;
                    if (lcjVar3.s(this) == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object collect = new wj0(pd0.n(sea.y(new w9j(cajVar, 7)), 1), 2).collect(new f10(cajVar, 23), this);
                    if (collect != lu3Var4) {
                        collect = Unit.a;
                    }
                    if (collect == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    lcj lcjVar4 = cajVar.s;
                    this.s = 1;
                    if (lcjVar4.y(this) == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i6 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            default:
                lu3 lu3Var6 = lu3.a;
                int i7 = this.s;
                if (i7 != 0) {
                    if (i7 == 1) {
                        throw wt3.i(obj);
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                vki vkiVar = new vki(cajVar, rq3Var, 12);
                this.s = 1;
                rje.a(cajVar, vkiVar, this);
                return lu3Var6;
        }
    }
}
