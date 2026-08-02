package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p4f extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ Function2 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p4f(Function2 function2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = function2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Function2 function2 = this.u;
        switch (i) {
            case 0:
                p4f p4fVar = new p4f(function2, rq3Var, 0);
                p4fVar.t = obj;
                return p4fVar;
            case 1:
                p4f p4fVar2 = new p4f(function2, rq3Var, 1);
                p4fVar2.t = obj;
                return p4fVar2;
            case 2:
                p4f p4fVar3 = new p4f(function2, rq3Var, 2);
                p4fVar3.t = obj;
                return p4fVar3;
            case 3:
                p4f p4fVar4 = new p4f(function2, rq3Var, 3);
                p4fVar4.t = obj;
                return p4fVar4;
            case 4:
                p4f p4fVar5 = new p4f(function2, rq3Var, 4);
                p4fVar5.t = obj;
                return p4fVar5;
            case 5:
                p4f p4fVar6 = new p4f(function2, rq3Var, 5);
                p4fVar6.t = obj;
                return p4fVar6;
            case 6:
                p4f p4fVar7 = new p4f(function2, rq3Var, 6);
                p4fVar7.t = obj;
                return p4fVar7;
            case 7:
                p4f p4fVar8 = new p4f(function2, rq3Var, 7);
                p4fVar8.t = obj;
                return p4fVar8;
            case 8:
                p4f p4fVar9 = new p4f(function2, rq3Var, 8);
                p4fVar9.t = obj;
                return p4fVar9;
            default:
                p4f p4fVar10 = new p4f(function2, rq3Var, 9);
                p4fVar10.t = obj;
                return p4fVar10;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((p4f) create((p0d) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((p4f) create((p0d) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((p4f) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((p4f) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((p4f) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((p4f) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((p4f) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((p4f) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((p4f) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((p4f) create((b98) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Function2 function2 = this.u;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    p0d p0dVar = (p0d) this.t;
                    this.s = 1;
                    obj = function2.invoke(p0dVar, this);
                    if (obj == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                p0d p0dVar2 = (p0d) obj;
                p0dVar2.getClass();
                ((AtomicBoolean) p0dVar2.b.b).set(true);
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    p0d g = ((p0d) this.t).g();
                    this.t = g;
                    this.s = 1;
                    if (function2.invoke(g, this) == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p0d p0dVar3 = (p0d) this.t;
                    y6a.M(obj);
                    break;
                }
                break;
            case 2:
                ku3 ku3Var = (ku3) this.t;
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    this.t = null;
                    this.s = 1;
                    if (function2.invoke(ku3Var, this) == lu3Var3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 3:
                ku3 ku3Var2 = (ku3) this.t;
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    this.t = null;
                    this.s = 1;
                    if (function2.invoke(ku3Var2, this) == lu3Var4) {
                        break;
                    }
                } else if (i5 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 4:
                ku3 ku3Var3 = (ku3) this.t;
                lu3 lu3Var5 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    this.t = null;
                    this.s = 1;
                    if (function2.invoke(ku3Var3, this) == lu3Var5) {
                        break;
                    }
                } else if (i6 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 5:
                ku3 ku3Var4 = (ku3) this.t;
                lu3 lu3Var6 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    this.t = null;
                    this.s = 1;
                    if (function2.invoke(ku3Var4, this) == lu3Var6) {
                        break;
                    }
                } else if (i7 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 6:
                ku3 ku3Var5 = (ku3) this.t;
                lu3 lu3Var7 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    this.t = null;
                    this.s = 1;
                    if (function2.invoke(ku3Var5, this) == lu3Var7) {
                        break;
                    }
                } else if (i8 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 7:
                ku3 ku3Var6 = (ku3) this.t;
                lu3 lu3Var8 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    this.t = null;
                    this.s = 1;
                    if (function2.invoke(ku3Var6, this) == lu3Var8) {
                        break;
                    }
                } else if (i9 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 8:
                lu3 lu3Var9 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    ku3 ku3Var7 = (ku3) this.t;
                    this.s = 1;
                    if (function2.invoke(ku3Var7, this) == lu3Var9) {
                        break;
                    }
                } else if (i10 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                lu3 lu3Var10 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    cce cceVar = new cce((b98) this.t, function2, rq3Var, 16);
                    this.s = 1;
                    if (s9a.r(cceVar, this) == lu3Var10) {
                        break;
                    }
                } else if (i11 != 1) {
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
