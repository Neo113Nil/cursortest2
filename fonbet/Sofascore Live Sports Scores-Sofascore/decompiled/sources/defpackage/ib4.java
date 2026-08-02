package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ib4 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public zuj s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ k6g v;
    public final /* synthetic */ Function1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ib4(k6g k6gVar, rq3 rq3Var, Function1 function1, int i) {
        super(2, rq3Var);
        this.r = i;
        this.v = k6gVar;
        this.w = function1;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                ib4 ib4Var = new ib4(this.v, rq3Var, this.w, 0);
                ib4Var.u = obj;
                return ib4Var;
            default:
                ib4 ib4Var2 = new ib4(this.v, rq3Var, this.w, 1);
                ib4Var2.u = obj;
                return ib4Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        avj avjVar = (avj) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((ib4) create(avjVar, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        if (r13 == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0147, code lost:
    
        if (r13 == r0) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0161  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zuj zujVar;
        avj avjVar;
        zuj zujVar2;
        avj avjVar2;
        avj avjVar3;
        Object obj2;
        zuj zujVar3;
        avj avjVar4;
        zuj zujVar4;
        avj avjVar5;
        avj avjVar6;
        Object obj3;
        int i = this.r;
        k6g k6gVar = this.v;
        Function1 function1 = this.w;
        int i2 = 1;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.t;
                if (i3 == 0) {
                    y6a.M(obj);
                    avj avjVar7 = (avj) this.u;
                    zujVar = zuj.b;
                    this.u = avjVar7;
                    this.s = zujVar;
                    this.t = 1;
                    Boolean b = avjVar7.b(this);
                    if (b != lu3Var) {
                        avjVar = avjVar7;
                        obj = b;
                    }
                    return lu3Var;
                }
                if (i3 == 1) {
                    zujVar = this.s;
                    avjVar = (avj) this.u;
                    y6a.M(obj);
                } else if (i3 == 2) {
                    zujVar = this.s;
                    avjVar3 = (avj) this.u;
                    y6a.M(obj);
                    zujVar2 = zujVar;
                    avjVar2 = avjVar3;
                    hb4 hb4Var = new hb4(rq3Var, function1, 0);
                    this.u = avjVar2;
                    this.s = null;
                    this.t = 3;
                    obj = avjVar2.a(zujVar2, hb4Var, this);
                    break;
                } else {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 == 5) {
                                y6a.M(obj);
                                return obj;
                            }
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = this.u;
                        y6a.M(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            taa invalidationTracker = k6gVar.getInvalidationTracker();
                            invalidationTracker.c.e(invalidationTracker.f, invalidationTracker.g);
                        }
                        return obj2;
                    }
                    avjVar2 = (avj) this.u;
                    y6a.M(obj);
                    this.u = obj;
                    this.t = 4;
                    Boolean b2 = avjVar2.b(this);
                    if (b2 != lu3Var) {
                        Object obj4 = obj;
                        obj = b2;
                        obj2 = obj4;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        return obj2;
                    }
                    return lu3Var;
                }
                if (!((Boolean) obj).booleanValue()) {
                    taa invalidationTracker2 = k6gVar.getInvalidationTracker();
                    this.u = avjVar;
                    this.s = zujVar;
                    this.t = 2;
                    if (invalidationTracker2.a(this) != lu3Var) {
                        avjVar3 = avjVar;
                        zujVar2 = zujVar;
                        avjVar2 = avjVar3;
                        hb4 hb4Var2 = new hb4(rq3Var, function1, 0);
                        this.u = avjVar2;
                        this.s = null;
                        this.t = 3;
                        obj = avjVar2.a(zujVar2, hb4Var2, this);
                    }
                    return lu3Var;
                }
                zujVar2 = zujVar;
                avjVar2 = avjVar;
                hb4 hb4Var22 = new hb4(rq3Var, function1, 0);
                this.u = avjVar2;
                this.s = null;
                this.t = 3;
                obj = avjVar2.a(zujVar2, hb4Var22, this);
            default:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.t;
                if (i4 == 0) {
                    y6a.M(obj);
                    avj avjVar8 = (avj) this.u;
                    zujVar3 = zuj.b;
                    this.u = avjVar8;
                    this.s = zujVar3;
                    this.t = 1;
                    Boolean b3 = avjVar8.b(this);
                    if (b3 != lu3Var2) {
                        avjVar4 = avjVar8;
                        obj = b3;
                    }
                    return lu3Var2;
                }
                if (i4 == 1) {
                    zujVar3 = this.s;
                    avjVar4 = (avj) this.u;
                    y6a.M(obj);
                } else if (i4 == 2) {
                    zujVar3 = this.s;
                    avjVar6 = (avj) this.u;
                    y6a.M(obj);
                    zujVar4 = zujVar3;
                    avjVar5 = avjVar6;
                    hb4 hb4Var3 = new hb4(rq3Var, function1, i2);
                    this.u = avjVar5;
                    this.s = null;
                    this.t = 3;
                    obj = avjVar5.a(zujVar4, hb4Var3, this);
                    break;
                } else {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            if (i4 == 5) {
                                y6a.M(obj);
                                return obj;
                            }
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj3 = this.u;
                        y6a.M(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            taa invalidationTracker3 = k6gVar.getInvalidationTracker();
                            invalidationTracker3.c.e(invalidationTracker3.f, invalidationTracker3.g);
                        }
                        return obj3;
                    }
                    avjVar5 = (avj) this.u;
                    y6a.M(obj);
                    this.u = obj;
                    this.t = 4;
                    Boolean b4 = avjVar5.b(this);
                    if (b4 != lu3Var2) {
                        Object obj5 = obj;
                        obj = b4;
                        obj3 = obj5;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        return obj3;
                    }
                    return lu3Var2;
                }
                if (!((Boolean) obj).booleanValue()) {
                    taa invalidationTracker4 = k6gVar.getInvalidationTracker();
                    this.u = avjVar4;
                    this.s = zujVar3;
                    this.t = 2;
                    if (invalidationTracker4.a(this) != lu3Var2) {
                        avjVar6 = avjVar4;
                        zujVar4 = zujVar3;
                        avjVar5 = avjVar6;
                        hb4 hb4Var32 = new hb4(rq3Var, function1, i2);
                        this.u = avjVar5;
                        this.s = null;
                        this.t = 3;
                        obj = avjVar5.a(zujVar4, hb4Var32, this);
                    }
                    return lu3Var2;
                }
                zujVar4 = zujVar3;
                avjVar5 = avjVar4;
                hb4 hb4Var322 = new hb4(rq3Var, function1, i2);
                this.u = avjVar5;
                this.s = null;
                this.t = 3;
                obj = avjVar5.a(zujVar4, hb4Var322, this);
        }
    }
}
