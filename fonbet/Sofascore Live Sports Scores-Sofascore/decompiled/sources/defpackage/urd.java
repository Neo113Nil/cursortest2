package defpackage;

import androidx.activity.ComponentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class urd extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ u6b t;
    public final /* synthetic */ b1d u;
    public final /* synthetic */ Function2 v;
    public final /* synthetic */ rgh w;
    public final /* synthetic */ ComponentActivity x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public urd(u6b u6bVar, b1d b1dVar, rq3 rq3Var, Function2 function2, rgh rghVar, ComponentActivity componentActivity, int i) {
        super(2, rq3Var);
        this.r = i;
        switch (i) {
            case 3:
                e6b e6bVar = e6b.a;
                this.t = u6bVar;
                this.u = b1dVar;
                this.v = function2;
                this.w = rghVar;
                this.x = componentActivity;
                super(2, rq3Var);
                break;
            case 4:
            case 6:
            default:
                e6b e6bVar2 = e6b.a;
                this.t = u6bVar;
                this.u = b1dVar;
                this.v = function2;
                this.w = rghVar;
                this.x = componentActivity;
                break;
            case 5:
                e6b e6bVar3 = e6b.a;
                this.t = u6bVar;
                this.u = b1dVar;
                this.v = function2;
                this.w = rghVar;
                this.x = componentActivity;
                super(2, rq3Var);
                break;
            case 7:
                e6b e6bVar4 = e6b.a;
                this.t = u6bVar;
                this.u = b1dVar;
                this.v = function2;
                this.w = rghVar;
                this.x = componentActivity;
                super(2, rq3Var);
                break;
        }
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new urd(this.u, this.t, rq3Var, this.v, this.w, this.x, 0);
            case 1:
                e6b e6bVar = e6b.a;
                return new urd(this.t, this.u, rq3Var, this.v, this.w, this.x, 1);
            case 2:
                return new urd(this.u, this.t, rq3Var, this.v, this.w, this.x, 2);
            case 3:
                e6b e6bVar2 = e6b.a;
                return new urd(this.t, this.u, rq3Var, this.v, this.w, this.x, 3);
            case 4:
                return new urd(this.u, this.t, rq3Var, this.v, this.w, this.x, 4);
            case 5:
                e6b e6bVar3 = e6b.a;
                return new urd(this.t, this.u, rq3Var, this.v, this.w, this.x, 5);
            case 6:
                return new urd(this.u, this.t, rq3Var, this.v, this.w, this.x, 6);
            default:
                e6b e6bVar4 = e6b.a;
                return new urd(this.t, this.u, rq3Var, this.v, this.w, this.x, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
            case 0:
                ((urd) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                return lu3.a;
            case 1:
                return ((urd) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
            case 2:
                ((urd) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                return lu3.a;
            case 3:
                return ((urd) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
            case 4:
                ((urd) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                return lu3.a;
            case 5:
                return ((urd) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
            case 6:
                ((urd) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                return lu3.a;
            default:
                return ((urd) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        b1d b1dVar = this.u;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    trd trdVar = new trd(this.t, this.v, this.w, this.x, 0);
                    this.s = 1;
                    if (b1dVar.collect(trdVar, this) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                pvd.x();
                return null;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    e6b e6bVar = e6b.c;
                    b1d b1dVar2 = this.u;
                    u6b u6bVar = this.t;
                    urd urdVar = new urd(b1dVar2, u6bVar, (rq3) null, this.v, this.w, this.x, 0);
                    this.s = 1;
                    if (b6a.A(u6bVar, e6bVar, urdVar, this) == lu3Var2) {
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
                    trd trdVar2 = new trd(this.t, this.v, this.w, this.x, 1);
                    this.s = 1;
                    if (b1dVar.collect(trdVar2, this) == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                pvd.x();
                return null;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    e6b e6bVar2 = e6b.c;
                    b1d b1dVar3 = this.u;
                    u6b u6bVar2 = this.t;
                    urd urdVar2 = new urd(b1dVar3, u6bVar2, (rq3) null, this.v, this.w, this.x, 2);
                    this.s = 1;
                    if (b6a.A(u6bVar2, e6bVar2, urdVar2, this) == lu3Var4) {
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
                    trd trdVar3 = new trd(this.t, this.v, this.w, this.x, 2);
                    this.s = 1;
                    if (b1dVar.collect(trdVar3, this) == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i6 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                pvd.x();
                return null;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    e6b e6bVar3 = e6b.c;
                    b1d b1dVar4 = this.u;
                    u6b u6bVar3 = this.t;
                    urd urdVar3 = new urd(b1dVar4, u6bVar3, (rq3) null, this.v, this.w, this.x, 4);
                    this.s = 1;
                    if (b6a.A(u6bVar3, e6bVar3, urdVar3, this) == lu3Var6) {
                        return lu3Var6;
                    }
                } else {
                    if (i7 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    nk0 nk0Var = new nk0(this.t, this.v, this.w, this.x);
                    this.s = 1;
                    if (b1dVar.collect(nk0Var, this) == lu3Var7) {
                        return lu3Var7;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                pvd.x();
                return null;
            default:
                lu3 lu3Var8 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    e6b e6bVar4 = e6b.c;
                    b1d b1dVar5 = this.u;
                    u6b u6bVar4 = this.t;
                    urd urdVar4 = new urd(b1dVar5, u6bVar4, (rq3) null, this.v, this.w, this.x, 6);
                    this.s = 1;
                    if (b6a.A(u6bVar4, e6bVar4, urdVar4, this) == lu3Var8) {
                        return lu3Var8;
                    }
                } else {
                    if (i9 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ urd(b1d b1dVar, u6b u6bVar, rq3 rq3Var, Function2 function2, rgh rghVar, ComponentActivity componentActivity, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = b1dVar;
        this.t = u6bVar;
        this.v = function2;
        this.w = rghVar;
        this.x = componentActivity;
    }
}
